import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        List<ContaBancaria> list = new ArrayList<>();
        List<ContaBancaria> extrato = new ArrayList<>();

        System.out.print(" --- MENU ---- " + "\n" + "1 - Criar Conta | 2 - Ver Contas | 3 - Acessar conta ");
        Scanner scan = new Scanner(System.in);
        int aux = scan.nextInt();
        do {
            switch(aux) {
                //Criação de contas
                case 1 :
                System.out.println("1 - Poupança | 2 - Corrente ");
                int cont = scan.nextInt();
                if(cont == 1) {
                     System.out.print("Entre com a senha da conta : ");
                     int senha = scan.nextInt();
                     list.add(new ContaPoupanca(senha));
                     System.out.println("Conta Criada com sucesso!" );
                }
                else if(cont == 2){
                    System.out.print("Entre com a senha da conta : ");
                    int senha = scan.nextInt();
                    list.add(new ContaCorrente(senha));
                    System.out.println("Conta Criada com sucesso!" );
                }
                break;
                //Ver contas
                case 2 :
                    for (ContaBancaria x : list) {
                        System.out.println(x);
                    }
                break;
                    //Acessar as contas !
                case 3 :
                    System.out.print("Digite o número da conta : ");
                    int num = scan.nextInt();
                    System.out.print("Digite a senha : ");
                    int sen = scan.nextInt();
                    ContaBancaria busca = list.stream().filter(x->x.getNumConta()==num && x.getSenha()==sen).findFirst().orElse(null);
                    if(busca!=null){
                        System.out.print("1 - ver saldo | 2 - depositar | 3 - sacar | 4 - mudar senha | 5 - extrato bancario ");
                        int esc = scan.nextInt();
                         if(esc == 1 ){
                          busca.getSaldo();
                        }else if(esc == 2){
                             double depositar = scan.nextDouble();
                             busca.depositar(depositar);
                         }else if(esc == 3){
                             System.out.print("Informe a senha : ");
                             int sen1 = scan.nextInt();
                             if(sen1 == busca.senha) {
                                 double sacar = scan.nextDouble();
                                 busca.sacar(sacar);
                             }else {
                                 System.out.println("Senha Incorreta ! ");
                             }
                         }else if (esc == 5 ){
                             busca.extrato();
                         } else if(esc == 4){
                             System.out.print("Digite a nova senha : ");
                             int senha = scan.nextInt();
                             busca.alterarSenha(senha);
                         }
                    }else{
                        System.out.println("Senha ou conta incorreta ");
                    }
            }
            System.out.print(" --- MENU ---- " + "\n" + "1 - Criar Conta | 2 - Ver Contas | 3 - Acessar conta ");
            aux = scan.nextInt();
         }while(aux!= 0);

    }
}
