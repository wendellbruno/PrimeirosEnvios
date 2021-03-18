public class Transacoes {

    protected String tipo;
    protected double valor;

    public Transacoes() {
    }

    public Transacoes(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

}
