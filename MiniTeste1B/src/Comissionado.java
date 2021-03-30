

public class Comissionado extends Empregado implements iPagavel{


    protected double bonificacao= 0.06;
    protected double venda=0;

    public Comissionado() {
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public Comissionado(String nome, String sobreNome, Integer numIdentidade, double venda) {
        super(nome, sobreNome, numIdentidade);
        this.venda=venda;
        this.salaraio=getvalorAPAgar();
    }

    @Override
    public Double getvalorAPAgar() {

        return this.salaraio = venda * bonificacao;
    }

    @Override
    public String toString() {
        return "Comissionado{"+ super.toString() + "}";

    }
}
