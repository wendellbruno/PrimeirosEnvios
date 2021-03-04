import java.util.Scanner;

public class ContaEspecial extends ContaBancaria {

    private Double limite;
    private boolean bolha;
    Scanner scan = new Scanner(System.in);

    public ContaEspecial() {
    }

    public ContaEspecial(String nomeCliente, Integer numConta, Double saldo, Double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(Double saque) {
        super.sacar(saque);
        if (saque > this.getSaldo() && limite > 0 ) {
            System.out.print("Deseja usar credito especial ?");
            char letra = scan.next().charAt(0);
            scan.nextLine();
            if (letra == 's') {
                System.out.println("Limite : " + limite);
                System.out.println("Quantidade a sacar :");
                Double especial = scan.nextDouble();
                if(getSaldo()+especial > saque){
                    setSaldo(0.0);
                    setLimite(this.limite-especial);
                }
                setLimite(this.limite-especial);
            }
        }
    }
    public String toString(){
        return "Nome : " + getNomeCliente() + "\n"+
                "Saldo : " + getSaldo() + "\n" +
                "Saldo especial : " + getLimite() ;
    }
}
