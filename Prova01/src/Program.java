import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int op;
        do{
         System.out.print("Qual loja deseja acessar : " + "\n" + " 1 - Loja A " + "\n" + " 2 - Loja B : ");
         op = scan.nextInt();
         if (op == 1) {
            Distribuidora distri = new Distribuidora("Loja A ", 79999999);
            System.out.println(distri.toString());
            System.out.println("1 - Cadastrar Produto | 2 - Atualizar Estoque | 3 - Relatorio | 4 - Sair do Sistema :");
             op = scan.nextInt();
             switch (op) {
                    case 1:
                        System.out.println("Codigo do produto : ");
                        int codProduto = scan.nextInt();
                        distri.CadastrarProduto(distri.listProduto, codProduto);
                        break;
                    case 2:
                        System.out.print(" 1 - Por nome | 2 - Por codigo :");
                        op = scan.nextInt();
                        if (op == 1) {
                            Produto p1;
                            scan.nextLine();
                            System.out.print("Nome : ");
                            String nome = scan.nextLine();
                            p1 = distri.listProduto.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                            if (p1 == null) {
                                System.out.println("Produto não encontrado ! ");
                            } else {
                                System.out.print("Quantidade a ser adicionada : ");
                                int quantidade = scan.nextInt();
                                p1.colocarEstoque(quantidade);
                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                            }
                        } else if (op == 2) {
                            Produto p1;
                            scan.nextLine();
                            System.out.print("Codigo : ");
                            Integer cod = scan.nextInt();
                            p1 = distri.listProduto.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                            if (p1 == null) {
                                System.out.println("Produto não encontrado ! ");
                            } else {
                                System.out.print("Quantidade a ser adicionada : ");
                                int quantidade = scan.nextInt();
                                p1.colocarEstoque(quantidade);
                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                            }
                            break;
                        }
                        break;
                    case 3:
                        for (Produto x : distri.listProduto) {
                            System.out.println(x);
                        }
                        break;
                }
                System.out.print("1 - Cadastrar Produto | 2 - Atualizar Estoque | 3 - Relatorio | 4 - Menu Anterior :");
                op = scan.nextInt();

            }
        } while (op != 4);
    }
}
