public abstract class Conta implements iPagavel {
    protected Integer dia;
    protected Integer mes;
    protected Double valor;

    public Conta() {
    }

    public Conta(Integer dia, Integer mes, Double valor) {
        this.dia = dia;
        this.mes = mes;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Conta{ " +
                "dia venciemnto = " + dia +
                ", mes vencimento = " + mes +
                ", valor = " + valor +
                '}';
    }
    @Override
    public Double getvalorAPAgar() {
        return null;
    }
}
