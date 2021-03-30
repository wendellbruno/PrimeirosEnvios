public class Acessoria extends Conta implements iPagavel {

    protected Double valorApagar;

    public Double getValorApagar() {
        return valorApagar;
    }

    public Acessoria() {
    }

    public Acessoria(Integer dia, Integer mes, Double valor) {
        super(dia, mes, valor);
        this.valorApagar = valor;
    }

    @Override
    public Double getvalorAPAgar() {
        return valorApagar;
    }

    @Override
    public String toString() {
        return "Acessoria{" +
                "valorApagar=" + valorApagar +
                '}';
    }
}
