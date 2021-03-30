

public class Terceirizados extends Empregado implements iPagavel{

    protected Double horas;
    public Terceirizados() {
    }

    public Terceirizados(String nome, String sobreNome, Integer numIdentidade,double horas) {
        super(nome, sobreNome, numIdentidade);
        this.horas=horas;
        this.salaraio=getvalorAPAgar();
    }

    public Double getHoras() {
        return horas;
    }

    @Override
    public Double getvalorAPAgar() {
        return this.salaraio = horas*ControlePagamento.HORAS;
    }
    @Override
    public String toString() {
        return "Terceirizado{ " + super.toString() + "}";
    }
}
