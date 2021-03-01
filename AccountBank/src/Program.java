
public class Program {

    public static void main(String[] args) {

      Account acc = new Account(1001,"Wendell", 0.0);
      BusinessAccount bcc = new BusinessAccount(1002,"Bruno",0.0,500.00);

      // UpCasting
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003,"Santos",0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Cruz",0.0,0.01);

      // Downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        // BusinessAccount acc5 = (BusinessAccount) acc3; o acc3 é um SavingsAccount como testar :
        if(acc3 instanceof BusinessAccount ){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan !");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.upDateBalance();
            System.out.println("Update !");
        }
        Account acc6 = new Account(1006, "Wendell", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());
        Account acc7 = new SavingsAccount(1007,"Bruno",1000.0,0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());
        Account acc8 = new BusinessAccount(1008,"Santos",1000.0,500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());


    }
}
