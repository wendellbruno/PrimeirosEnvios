import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Distribuidora distri = new Distribuidora("Loja A ", 79999999);
        Distribuidora distri2 = new Distribuidora("Loja B ", 98888888);
        int op;
        int esc;
        int aux;
        do {
            do {
                System.out.print("Qual loja deseja acessar : " + "\n" + " 1 - Loja A " + "\n" + " 2 - Loja B : ");
                esc = scan.nextInt();
                switch (esc) {
                    case 1:
                        System.out.println(distri.toString());
                        System.out.println("1 - Cadastrar Produto | 2 - Atualizar Estoque | 3 - Relatorio | 4 - Sair do Sistema :");
                        op = scan.nextInt();
                        switch (op) {
                            case 1:
                                System.out.print("1 - Produto | 2 - Produto Perecivel");
                                op = scan.nextInt();
                                if (op == 1) {
                                    int codProduto = random.nextInt();
                                    distri.CadastrarProduto(distri.listProduto, codProduto);
                                } else if (op == 2) {
                                    int codProduto = random.nextInt();
                                    distri.CadastrarProdutoPerecivel(distri.listPerecivel, codProduto);
                                }
                                break;
                            case 2:
                                System.out.print("1 -Adicionar || 2 - Remover ");
                                op = scan.nextInt();
                                switch (op) {
                                    case 1:
                                        System.out.print(" 1 - Por nome | 2 - Por codigo :");
                                        op = scan.nextInt();
                                        if (op == 1) {
                                            Produto p1;
                                            ProdutoPerecivel p2;
                                            scan.nextLine();
                                            System.out.print("Nome : ");
                                            String nome = scan.nextLine();
                                            p1 = distri.listProduto.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                                            p2 = distri.listPerecivel.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                                            if (p1 == null && p2 == null) {
                                                System.out.println("Produto não encontrado ! ");
                                            } else if (p1 != null) {
                                                System.out.print("Quantidade a ser adicionada : ");
                                                int quantidade = scan.nextInt();
                                                p1.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                                            }
                                            if (p2 != null) {
                                                System.out.print("Quantidade a ser adicionada : ");
                                                int quantidade = scan.nextInt();
                                                p2.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p2.getQtdEstoque());
                                            }
                                        } else if (op == 2) {
                                            Produto p1;
                                            ProdutoPerecivel p2;
                                            scan.nextLine();
                                            System.out.print("Codigo : ");
                                            Integer cod = scan.nextInt();
                                            p1 = distri.listProduto.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                                            p2 = distri.listPerecivel.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                                            if (p1 == null && p2 == null) {
                                                System.out.println("Produto não encontrado ! ");
                                            } else if (p1 != null) {
                                                System.out.print("Quantidade a ser adicionada : ");
                                                int quantidade = scan.nextInt();
                                                p1.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                                            }
                                            if (p2 != null) {
                                                System.out.print("Quantidade a ser adicionada : ");
                                                int quantidade = scan.nextInt();
                                                p2.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p2.getQtdEstoque());
                                            }
                                            break;
                                        }
                                        break;
                                    case 2:
                                        System.out.print(" 1 - Por nome | 2 - Por codigo :");
                                        op = scan.nextInt();
                                        if (op == 1) {
                                            Produto p1;
                                            ProdutoPerecivel p2;
                                            scan.nextLine();
                                            System.out.print("Nome : ");
                                            String nome = scan.nextLine();
                                            p1 = distri.listProduto.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                                            p2 = distri.listPerecivel.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                                            if (p1 == null && p2 == null) {
                                                System.out.println("Produto não encontrado ! ");
                                            } else if (p1 != null) {
                                                System.out.print("Quantidade a ser removida : ");
                                                int quantidade = scan.nextInt();
                                                p2.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                                            }
                                            if (p2 != null) {
                                                System.out.print("Quantidade a ser removida : ");
                                                int quantidade = scan.nextInt();
                                                System.out.print("Data da remoção : ");
                                                Double data = scan.nextDouble();
                                                p2.retirarDoEstoque(quantidade,data);
                                                System.out.println("Estoque atualizado : " + p2.getQtdEstoque());
                                            }
                                        } else if (op == 2) {
                                            Produto p1;
                                            ProdutoPerecivel p2;
                                            scan.nextLine();
                                            System.out.print("Codigo : ");
                                            Integer cod = scan.nextInt();
                                            p1 = distri.listProduto.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                                            p2 = distri.listPerecivel.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                                            if (p1 == null && p2 == null) {
                                                System.out.println("Produto não encontrado ! ");
                                            } else if (p1 != null) {
                                                System.out.print("Quantidade a ser removida : ");
                                                int quantidade = scan.nextInt();
                                                p2.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                                            }
                                            if (p2 != null) {
                                                System.out.print("Quantidade a ser removida : ");
                                                int quantidade = scan.nextInt();
                                                System.out.print("Data da remoção : ");
                                                Double data = scan.nextDouble();
                                                p2.retirarDoEstoque(quantidade,data);
                                                System.out.println("Estoque atualizado : " + p2.getQtdEstoque());
                                            }
                                            break;
                                        }
                                        break;
                                }
                                break;
                            case 3:
                                for (Produto x : distri.listProduto) {
                                    System.out.println(x);
                                }
                                for (Produto y : distri.listPerecivel)
                                    System.out.println(y);
                                break;
                        }break;
                    //loja 2
                    case 2 :
                        System.out.println(distri2.toString());
                        System.out.println("1 - Cadastrar Produto | 2 - Atualizar Estoque | 3 - Relatorio | 4 - Sair do Sistema :");
                        op = scan.nextInt();
                        switch (op) {
                            case 1:
                                System.out.print("1 - Produto | 2 - Produto Perecivel");
                                op = scan.nextInt();
                                if (op == 1) {
                                    int codProduto = random.nextInt();
                                    distri2.CadastrarProduto(distri.listProduto, codProduto);
                                } else if (op == 2) {
                                    int codProduto = random.nextInt();
                                    distri2.CadastrarProdutoPerecivel(distri.listPerecivel, codProduto);
                                }
                                break;
                            case 2:
                                System.out.print("1 -Adicionar || 2 - Remover ");
                                op = scan.nextInt();
                                switch (op) {
                                    case 1:
                                        System.out.print(" 1 - Por nome | 2 - Por codigo :");
                                        op = scan.nextInt();
                                        if (op == 1) {
                                            Produto p1;
                                            ProdutoPerecivel p2;
                                            scan.nextLine();
                                            System.out.print("Nome : ");
                                            String nome = scan.nextLine();
                                            p1 = distri2.listProduto.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                                            p2 = distri2.listPerecivel.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                                            if (p1 == null && p2 == null) {
                                                System.out.println("Produto não encontrado ! ");
                                            } else if (p1 != null) {
                                                System.out.print("Quantidade a ser adicionada : ");
                                                int quantidade = scan.nextInt();
                                                p1.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                                            }
                                            if (p2 != null) {
                                                System.out.print("Quantidade a ser adicionada : ");
                                                int quantidade = scan.nextInt();
                                                p2.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p2.getQtdEstoque());
                                            }
                                        } else if (op == 2) {
                                            Produto p1;
                                            ProdutoPerecivel p2;
                                            scan.nextLine();
                                            System.out.print("Codigo : ");
                                            Integer cod = scan.nextInt();
                                            p1 = distri2.listProduto.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                                            p2 = distri2.listPerecivel.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                                            if (p1 == null && p2 == null) {
                                                System.out.println("Produto não encontrado ! ");
                                            } else if (p1 != null) {
                                                System.out.print("Quantidade a ser adicionada : ");
                                                int quantidade = scan.nextInt();
                                                p1.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                                            }
                                            if (p2 != null) {
                                                System.out.print("Quantidade a ser adicionada : ");
                                                int quantidade = scan.nextInt();
                                                p2.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p2.getQtdEstoque());
                                            }
                                            break;
                                        }
                                        break;
                                    case 2:
                                        System.out.print(" 1 - Por nome | 2 - Por codigo :");
                                        op = scan.nextInt();
                                        if (op == 1) {
                                            Produto p1;
                                            ProdutoPerecivel p2;
                                            scan.nextLine();
                                            System.out.print("Nome : ");
                                            String nome = scan.nextLine();
                                            p1 = distri2.listProduto.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                                            p2 = distri2.listPerecivel.stream().filter(x -> x.getNomeProduto().equalsIgnoreCase(nome)).findFirst().orElse(null);
                                            if (p1 == null && p2 == null) {
                                                System.out.println("Produto não encontrado ! ");
                                            } else if (p1 != null) {
                                                System.out.print("Quantidade a ser removida : ");
                                                int quantidade = scan.nextInt();
                                                p2.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                                            }
                                            if (p2 != null) {
                                                System.out.print("Quantidade a ser removida : ");
                                                int quantidade = scan.nextInt();
                                                System.out.print("Data da remoção : ");
                                                Double data = scan.nextDouble();
                                                p2.retirarDoEstoque(quantidade,data);
                                                System.out.println("Estoque atualizado : " + p2.getQtdEstoque());
                                            }
                                        } else if (op == 2) {
                                            Produto p1;
                                            ProdutoPerecivel p2;
                                            scan.nextLine();
                                            System.out.print("Codigo : ");
                                            Integer cod = scan.nextInt();
                                            p1 = distri2.listProduto.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                                            p2 = distri2.listPerecivel.stream().filter(x -> x.getCodProduto() == cod).findFirst().orElse(null);
                                            if (p1 == null && p2 == null) {
                                                System.out.println("Produto não encontrado ! ");
                                            } else if (p1 != null) {
                                                System.out.print("Quantidade a ser removida : ");
                                                int quantidade = scan.nextInt();
                                                p2.colocarEstoque(quantidade);
                                                System.out.println("Estoque atualizado : " + p1.getQtdEstoque());
                                            }
                                            if (p2 != null) {
                                                System.out.print("Quantidade a ser removida : ");
                                                int quantidade = scan.nextInt();
                                                System.out.print("Data da remoção : ");
                                                Double data = scan.nextDouble();
                                                p2.retirarDoEstoque(quantidade,data);
                                                System.out.println("Estoque atualizado : " + p2.getQtdEstoque());
                                            }
                                            break;
                                        }
                                        break;
                                }
                                break;
                            case 3:
                                for (Produto x : distri.listProduto) {
                                    System.out.println(x);
                                }
                                for (Produto y : distri.listPerecivel)
                                    System.out.println(y);
                                break;
                        }break;

                }

            } while (esc != 4);
        } while (esc != 0);
    }
}

