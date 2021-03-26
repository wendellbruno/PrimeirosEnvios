public abstract class Construtora {
    protected Double area;
    protected Double precoPorMetro;

    public Construtora() {
    }

    public Construtora(Double area, Double precoPorMetro) {
        this.area = area;
        this.precoPorMetro = precoPorMetro;
    }

    public Double getArea() {
        return area;
    }

    public Double getPrecoPorMetro() {
        return precoPorMetro;
    }
    public void setPrecoMetro(double precoMetro) {
        this.precoPorMetro = precoMetro;
    }

    public abstract Double getPrecoTotal();

    @Override
    public String toString() {
        return "Construtora{" +
                "area=" + area +
                ", precoPorMetro=" + precoPorMetro +
                '}';
    }
    public void imprimir(){
        System.out.println(toString());
    }
}
