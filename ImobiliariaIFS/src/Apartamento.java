public class Apartamento extends Construtora {

    protected Integer nQuartos;

    public Apartamento() {
    }

    public Apartamento(Double area, Double precoPorMetro, Integer nQuartos) {
        super(area, precoPorMetro);
        this.nQuartos = nQuartos;
    }

    public Integer getnQuartos() {
        return nQuartos;
    }

    public void setnQuartos(Integer nQuartos) {
        this.nQuartos = nQuartos;
    }

    @Override
    public String toString() {
        return super.toString() +"Apartamento{" +
                "nQuartos=" + nQuartos +
                '}';
    }

    @Override
    public Double getPrecoTotal() {
        return getArea() *getPrecoPorMetro() *nQuartos;
    }
}
