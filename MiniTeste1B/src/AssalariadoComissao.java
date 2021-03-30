

public class AssalariadoComissao extends Empregado implements iPagavel{

    protected Double bonificacao=0.06;
    protected Double venda;


    public AssalariadoComissao() {
    }

    public AssalariadoComissao(String nome, String sobreNome, Integer numIdentidade,double venda) {
        super(nome, sobreNome, numIdentidade);
        this.venda=venda;
        this.salaraio=getvalorAPAgar();
    }

    @Override
    public Double getvalorAPAgar() {
        return this.salaraio = ControlePagamento.SALARIO_BASE + (venda * bonificacao);
    }

    @Override
    public String toString() {
      return  "Assalariado com Comissão{ " + super.toString() + "}";
    }
}
