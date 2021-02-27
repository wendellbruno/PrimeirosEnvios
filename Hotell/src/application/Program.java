package application;

import entites.Gerencia;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Gerencia[] vet = new Gerencia[10];

        System.out.println("quantidade de quartos a ser alugado  : ");
        int aux = scan.nextInt();
        for (int i = 0; i < aux; i++) {
            System.out.println();
            System.out.println("Cliente : " + (i+1));
            System.out.print("name : ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("E-mail : ");
            String email = scan.nextLine();
            System.out.print("Número do quarto desejado : ");
            int room = scan.nextInt();
            vet[room] = new Gerencia(name, email);
        }
        System.out.println();
        System.out.println("Quatos alugados : ");
        for (int i = 0; i < vet.length ; i++) {
             if(vet[i] != null ){
                System.out.println( i + " : " + vet[i]);
            }
        }
    }
}

