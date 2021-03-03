public class Consulta {
    private Integer codConsulta;
    private Nutricionista nutriResponsavel;

    public Consulta(Integer codConsulta, Nutricionista nutriResponsavel) {
        this.codConsulta = codConsulta;
        this.nutriResponsavel = nutriResponsavel;
    }

    public Integer getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(Integer codConsulta) {
        this.codConsulta = codConsulta;
    }

    public Nutricionista getNutriResponsavel() {
        return nutriResponsavel;
    }

    public void setNutriResponsavel(Nutricionista nutriResponsavel) {
        this.nutriResponsavel = nutriResponsavel;
    }

}
