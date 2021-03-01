package entites;

import java.util.Scanner;

public class CaixaEletronico {
    private int numConta;
    private double depInicial;
    private double deposito;
    private double saque;
    private double saldo;
    private String nomeClient;
    private int desconto=-5;
    Scanner scan = new Scanner(System.in);
    public CaixaEletronico(int numConta, String nomeClient){
        this.numConta=numConta;
        this.nomeClient=nomeClient;
    }
    public CaixaEletronico(int numConta, String nomeClient, double depInicial){
        this(numConta,nomeClient);
        this.depInicial=depInicial;
    }
    public int getNumConta() {
        return numConta;
    }
    public double getDepInicial() {
        return depInicial;
    }

    public void setDepInicial(double depInicial) {
        this.depInicial = depInicial;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public String getNomeClient() {
        return nomeClient;
    }

    public void setNomeClient(String nomeClient) {
        this.nomeClient = nomeClient;
    }

    public double depositar(){
        System.out.println("Quantidade a ser depositada : ");
        double aux = scan.nextDouble();
        setSaldo(this.saldo+=aux);
        return this.saldo;
    }

    public double sacar(double saque){
        if(getSaldo() >= getSaque()){
            setSaldo(getSaldo()-getSaque()-5);
            System.out.println("Titular da conta : "+getNomeClient() +"\n"+
                                "Numerod a conta : " +getNumConta()+"\n"+
                                "Saque realizado com sucesso, cada saque tem taxa de R$ 5,00 "+"\n"+
                                "Saldo restante : " +getSaldo());

        }else{
            System.out.println("Saldo insuficiente ");
            return this.saldo;
        }
        return this.saldo;
    }


}
