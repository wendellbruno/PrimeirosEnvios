public class Escritorio extends Apartamento implements iComissao {
    protected Double valorVendaEscritorio;

    public Escritorio() {
    }

    public Escritorio(Double area, Double precoPorMetro, Integer nQuartos, Double valorVendaEscritorio) {
        super(area, precoPorMetro, nQuartos);
        this.valorVendaEscritorio = valorVendaEscritorio;
    }

    @Override
    public Double getPrecoTotal() {
        return super.getPrecoTotal()*(1+TAXA);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Escritorio{" +
                "valorVendaEscritorio=" + valorVendaEscritorio +
                '}';
    }

    @Override
    public void setValorVenda(double s) {
        valorVendaEscritorio=valorVendaEscritorio;
    }
}
