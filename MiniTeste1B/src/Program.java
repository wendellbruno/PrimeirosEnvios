
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ControlePagamento x = new ControlePagamento();

        System.out.println("1 - Cadastar Funcionario | 2 - Cadastrar Conta | 3 - Contas Geral");
        int esc = scan.nextInt();
        scan.nextLine();
        do {
            if (esc == 1) {
                System.out.print("Nome :");
                String nome = scan.nextLine();
                System.out.print("Sobre Nome :");
                String sobreNome = scan.nextLine();
                System.out.print("Número identidade :");
                int numIdentidade = scan.nextInt();
                System.out.println("1 - Assalariado | 2 - Tercerizado | 3 - Comissionado | 4 - Assalarido com comissão ");
                int op = scan.nextInt();
                switch (op) {
                    case 1 :
                        System.out.print("Horas de trabalho :");
                        double horas = scan.nextDouble();
                        x.empregados.add(new Assalariado(nome,sobreNome,numIdentidade,horas));
                        break;
                    case 2 :
                        System.out.print("Horas de trabalho :");
                        horas = scan.nextDouble();
                        x.empregados.add(new Terceirizados(nome,sobreNome,numIdentidade,horas));
                        break;
                    case 3 :
                        System.out.println("Quantidade vendida : ");
                        double venda = scan.nextDouble();
                        x.empregados.add(new Comissionado(nome,sobreNome,numIdentidade,venda));
                        break;
                    case 4 :
                        System.out.println("Quantidade vendida : ");
                        venda = scan.nextDouble();
                        x.empregados.add(new AssalariadoComissao(nome,sobreNome,numIdentidade,venda));
                }
            }else if(esc == 2){
                System.out.print("Dia : ");
                int dia =scan.nextInt();
                System.out.print("Mes :");
                int mes = scan.nextInt();
                System.out.print("Valor : ");
                double valor = scan.nextDouble();
                System.out.print("1 - Titulo | 2 - Acessoria");
                int op = scan.nextInt();
                if(op==1){
                    x.contas.add(new Titulo(dia,mes,valor));
                }else if(op == 2){
                    x.contas.add(new Acessoria(dia,mes,valor));
                }

            }else if(esc == 3){
                System.out.print(" 1 - Valor contas geral | 2 - Valor contas individual | 3 - Valor funcionarios geral | " +
                        "4 - Valor funcionarios individual  | 5 - Dispesa Geral: ");
                int op = scan.nextInt();
                switch (op){
                    case 1 :
                    x.custoContasGeral();
                    break;
                    case 2 :
                    x.custoContasIndividual();
                    break;
                    case 3 :
                    x.custoFuncionariosGeral();
                    break;
                    case 4 :
                    x.custoFuncionarioIndividual();
                    break;
                    case 5 :
                    x.custoGeralEmprsa();
                }
            }
            System.out.println("1 - Cadastar Funcionario | 2 - Cadastrar Conta | 3 - Contas Geral ");
            esc = scan.nextInt();
            scan.nextLine();

        }while (esc != 4);
    }
}
