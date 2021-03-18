public class ContaPoupanca extends ContaBancaria {


    public ContaPoupanca() {
    }

    public ContaPoupanca(int senha) {
        super(senha);
    }

    @Override
    public boolean sacar(double saque) {
        if (saque <= this.saldo) {
            this.saldo -= saque;
            System.out.println("Saque realizado com sucessor !");
            extrato.add(new Transacoes("Saque",saque));
            return true;
        } else {
            System.out.println("Saldo insuficiente !");
            return false;
        }
    }

    @Override
    public void extrato() {
        for (int i = 0; i < extrato.size() ; i++) {
            System.out.println(extrato.get(i).tipo + " : " + extrato.get(i).valor);
        }
    }

    @Override
    public void depositar(double deposito) {
        this.saldo+=deposito;
        System.out.println("Saldo atualizado : " + getSaldo());
        extrato.add(new Transacoes("Deposito",deposito));
    }
    @Override
    public  String toString() {
        return "ContaBancaria{" +
                "numConta=" + numConta +
                ", saldo=" + saldo +
                ", senha=" + senha +
                ", Conta Poupança}";
    }
}
