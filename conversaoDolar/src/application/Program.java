package conversaoDolar.src.application;

import conversaoDolar.src.ultilitarios.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double aux;

        System.out.println("Qual o valor atual do dolar :");
        aux = scan.nextDouble();
        double precoDolar = CurrencyConverter.ValorDoDolar(aux);
        System.out.println(precoDolar);

        System.out.print("Qual o valor em reais : ");
        aux = scan.nextDouble();
        double reais = CurrencyConverter.QuantidadeDolar(aux);
        System.out.println(reais);

        System.out.print("Valor do imposto :");
        aux = scan.nextDouble();
        double imposto = CurrencyConverter.valorImposto(aux);
        System.out.println(imposto);

        System.out.println("Valor a ser recebido em dolares : " );
        System.out.println(CurrencyConverter.QtdPagar(precoDolar*reais));


    }
}
