public class Loja extends Construtora implements iComissao{
    protected Double valorVenda;


    public Loja() {
    }

    public Loja(Double area, Double precoPorMetro, Double valorVenda) {
        super(area, precoPorMetro);
        this.valorVenda = valorVenda;

    }
    public Double getValorVenda() {
        return valorVenda;
    }

    @Override
    public String toString() {
        return super.toString()+ "Loja{" +
                ", valorVenda=" + String.format("%.2f",valorVenda) +
                '}';
    }
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public Double getPrecoTotal() {
        return getArea()*getPrecoPorMetro()*(1+TAXA);

    }

    @Override
    public void setValorVenda(double s) {
        valorVenda=valorVenda;
    }
}
