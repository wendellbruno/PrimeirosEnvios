import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> list = new ArrayList<>();

        System.out.print("1 - Criar contas "+"\n"+
                         "2 - Contas" + "\n"+
                         "3 - Acessar contas : ");
        Scanner scan = new Scanner(System.in);
        int aux = scan.nextInt();
        do{
            switch (aux){
                case 1:
                    System.out.print("Tipo da conta "+"\n"+"1 - Poupança"+"\n"+"2 - Especial");
                    int acc = scan.nextInt();
                    if(acc == 1 ){
                        System.out.print("Nome : ");
                        scan.nextLine();
                        String nomeCliente = scan.nextLine();
                        System.out.print("Número da conta : ");
                        int numConta = scan.nextInt();
                        System.out.print("Saldo inicial : ");
                        double saldo = scan.nextDouble();
                        System.out.print("Rendimento por dia : ");
                        double diaRendimento = scan.nextDouble();
                        list.add(new ContaPoupanca(nomeCliente,numConta,saldo,diaRendimento));
                    }else if(acc == 2){
                        scan.nextLine();
                        System.out.print("Nome : ");
                        String nomeCliente = scan.nextLine();
                        System.out.print("Número da conta : ");
                        int numConta = scan.nextInt();
                        System.out.print("Saldo inicial : ");
                        double saldo = scan.nextDouble();
                        System.out.print("Limite especial : ");
                        double especial = scan.nextDouble();
                        list.add(new ContaEspecial(nomeCliente,numConta,saldo,especial));
                    }break;
                    case 2 :
                        for (ContaBancaria x : list ) {
                            System.out.println(x.getNumConta() + " - " +  x.getNomeCliente() + " - " +
                                               x.getSaldo());
                        }
                        break;
                    case 3 :
                System.out.println("Informe o número da conta : ");
                int num = scan.nextInt();
                list.stream().filter(x->x.getNumConta()==num).findFirst().orElse(null);
                        for (ContaBancaria x : list) {
                            if(x.getNumConta() == num){
                                System.out.println(x);
                                System.out.print("Operação a ser realizada : " + "\n" +
                                                 "1 - Sacar " + "\n" + "2 - Depositar " + "\n"
                                                 + "3 - Ver Saldo");
                                aux = scan.nextInt();
                                if(aux == 1){
                                    Double saque = scan.nextDouble();
                                    x.sacar(saque);
                                } else if (aux == 2){
                                    Double depositar = scan.nextDouble();
                                    x.depositar(depositar);
                                } else if( aux == 3){
                                    x.getSaldo();
                                }
                            }

                        }
            }
            System.out.print("1 - Criar contas "+"\n"+
                    "2 - Contas" + "\n"+
                    "3 - Acessar contas : ");
             aux = scan.nextInt();

        }while (aux!=4);
    }
}
