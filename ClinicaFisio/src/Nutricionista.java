public class Nutricionista {
    private String nome;
    private Integer crn;
    private Double valorConsulta;

    public Nutricionista() {
    }

    public Nutricionista(String nome, Integer crn, Double valorConsulta) {
        this.nome = nome;
        this.crn = crn;
        this.valorConsulta = valorConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCrn() {
        return crn;
    }

    public void setCrn(Integer crn) {
        this.crn = crn;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Double calcularValor(int tempo){
        return tempo*(valorConsulta/60);
    }

}
