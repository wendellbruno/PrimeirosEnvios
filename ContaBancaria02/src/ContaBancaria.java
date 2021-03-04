public class ContaBancaria {
    private String nomeCliente;
    private Integer numConta;
    private Double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, Integer numConta, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void sacar(Double saque) {
        if(this.saldo < saque){
            System.out.println("Impossivel sacar !");
        }else{
            this.saldo-=saque;
        }
    }
     public Double depositar(Double deposito){
       return this.saldo+=deposito;
    }

    }

