import java.util.ArrayList;

public class ContaPoupanca extends ContaBancaria {

    private Double diaRendimento;
    public ContaPoupanca() {
    }
    public ContaPoupanca(String nomeCliente, Integer numConta, Double saldo, Double diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public Double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(Double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    public void rendimento(Double diaRendimento){
      setSaldo(getSaldo() + (diaRendimento / 100));
    }
    public String toString(){
        return "Nome : " + getNomeCliente() + "\n"+
                "Saldo : " + getSaldo();
    }

}
