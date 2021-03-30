public abstract class Empregado implements iPagavel{
    protected String nome;
    protected String sobreNome;
    protected Integer numIdentidade;

    protected Double salaraio;

    public Empregado() {
    }

    public Empregado(String nome, String sobreNome, Integer numIdentidade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.numIdentidade = numIdentidade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public Integer getNumIdentidade() {
        return numIdentidade;
    }

    public Double getSalaraio() {
        return salaraio;
    }

    @Override
    public String toString() {
        return nome +" "+ sobreNome + " - " + numIdentidade + " salario : " + salaraio;
    }

    @Override
    public Double getvalorAPAgar() {
        return null;
    }
}
