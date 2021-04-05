package application;

import model.entites.Account;
import model.exepitions.Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account date : ");
        System.out.print("Number : ");
        int number= scan.nextInt();
        System.out.print("Holder : ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.print("Initial balance : ");
        double balance = scan.nextDouble();
        System.out.println("Withdraw limit : ");
        double withdrawLimit = scan.nextDouble();

        Account acc = new Account(number,holder,balance,withdrawLimit);
        System.out.println();
        System.out.print("Enter amount for withdraw : ");
        double amount = scan.nextDouble();
        try{
            acc.withdraw(amount);
            System.out.println("New Balance : " + String.format("%.2f",acc.getBalance()));
        }
        catch (Exception e ){
            System.out.println("Witdraw Erro : " + e.getMessage());
        }
    }
}
