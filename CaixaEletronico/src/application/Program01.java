package application;

import entites.Account;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account account;
        System.out.println("Enter accont number : ");
        int number = scan.nextInt();
        System.out.println("Enter account holder : ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.println();
        System.out.println("Is there an initial deposit (Y/N) :");
        char response = scan.next().charAt(0);
        if(response == 'y'){
            double initialDeposit = scan.nextInt();
            account = new Account(number, holder, initialDeposit);
        }else{
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data : ");
        System.out.println(account);
        System.out.println();
        System.out.println("enter a deposit value : ");
        double depositValue= scan.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updade account data : ");
        System.out.println(account);
        System.out.println();

        System.out.println("Account data : ");
        System.out.println(account);
        System.out.println();
        System.out.println("enter a whithdraw value : ");
        double withdrawValue= scan.nextDouble();
        account.deposit(withdrawValue);
        System.out.println("Updade account data : ");
        System.out.println(account);

    }
}
