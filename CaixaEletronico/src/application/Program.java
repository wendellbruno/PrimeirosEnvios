package application;

import entites.CaixaEletronico;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cadastro com dep.inicial ? S/N ");
        String aux = scan.nextLine();
        int exc;
        if (aux.equalsIgnoreCase("n")) {
            System.out.println("nome do cliente");
            String nomeCliente = scan.nextLine();
            System.out.println("numero da conta");
            int numConta = scan.nextInt();
            CaixaEletronico caixa = new CaixaEletronico(numConta, nomeCliente);
            caixa.setNomeClient(nomeCliente);
            System.out.println("Escolha a opção que deseja realizar :" +"\n" +
                                "1- DEPOSITAR " + "\n" + " 2- SACAR " +"\n"+
                                "3 - VER SALDO "+"\n"+
                                "4- SAIR ");
            do {
                exc = scan.nextInt();
                switch (exc) {
                    case 1:
                        caixa.depositar();
                        break;
                    case 2:
                        System.out.println("Quantidade a ser sacada : ");
                        double sacar = scan.nextDouble();
                        caixa.setSaque(sacar);
                        caixa.sacar(caixa.getSaque());
                        break;
                    case 3:
                        System.out.println(caixa.getSaldo());
                        break;
                }
                System.out.println("Escolha a opção que deseja realizar :" + "\n" +
                        "1- DEPOSITAR " + "\n" + " 2- SACAR " +"\n"+
                        "3 - VER SALDO "+"\n"+
                        "4- SAIR ");

            }while(exc != 4);
    }
            else{
            System.out.println("nome do cliente");
            String nomeCliente = scan.nextLine();
            System.out.println("numero da conta");
            int numConta = scan.nextInt();
            System.out.println("Valor do deposito inicial ");
            double depInicial = scan.nextDouble();
                CaixaEletronico caixa01 = new CaixaEletronico(numConta, nomeCliente, depInicial);
                caixa01.setSaldo(depInicial);
            System.out.println("Escolha a opção que deseja realizar :" +"\n" +
                    "1- DEPOSITAR " + "\n" + " 2- SACAR " +"\n"+
                    "3 - VER SALDO "+"\n"+
                    "4- SAIR ");
            do {
                exc = scan.nextInt();
                switch (exc) {
                    case 1:
                        caixa01.depositar();
                        break;
                    case 2:
                        System.out.println("Quantidade a ser sacada : ");
                        double sacar = scan.nextDouble();
                        caixa01.setSaque(sacar);
                        caixa01.sacar(caixa01.getSaque());
                        break;
                    case 3:
                        System.out.println(caixa01.getSaldo());
                        break;
                }
                System.out.println("Escolha a opção que deseja realizar :" + "\n" +
                        "1- DEPOSITAR " + "\n" + " 2- SACAR " +"\n"+
                        "3 - VER SALDO "+"\n"+
                        "4- SAIR ");

            }while (exc != 4);
            }
        }
    }

