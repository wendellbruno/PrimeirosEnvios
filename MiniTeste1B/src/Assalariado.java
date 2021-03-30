

public class Assalariado extends Empregado implements iPagavel{

    protected Double horas;
    public Assalariado() {
    }

    public Assalariado(String nome, String sobreNome, Integer numIdentidade,Double horas) {
        super(nome, sobreNome, numIdentidade);
        this.horas=horas;
        salaraio=ControlePagamento.SALARIO_BASE;

    }

    public Double getHoras() {
        return horas;
    }

    @Override
    public Double getvalorAPAgar() {
        if( horas <= 160){
            return this.salaraio;
        }
        else {
             return this.salaraio = salaraio+(horas-160)*ControlePagamento.HORAS;
        }
    }

    @Override
    public String toString() {
        return "Assalariado{ " + super.toString() + "}";
    }

}
