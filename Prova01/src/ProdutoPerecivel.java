public class ProdutoPerecivel extends Produto {

    private Double dataValidade;

    public ProdutoPerecivel() {
    }

    public ProdutoPerecivel(String nomeProduto, String marca, Integer qtdEstoque, Double precoUnitario, Double dataValidade) {
        super(nomeProduto, marca, qtdEstoque, precoUnitario);
        this.dataValidade = dataValidade;
    }

    public Double getDataValidade() {
        return dataValidade;
    }

    public Integer retirarDoEstoque(int quantidade, double data){
        if(data >= dataValidade){
            System.out.println("Impossivel inserir, produto vencido");
          return this.qtdEstoque = 0;
        }else{
            return qtdEstoque+=quantidade;
        }
    }

    public void colocarEstoque(int quantidade) {
        if(qtdEstoque == 0){
            this.qtdEstoque+=quantidade;
        }
    }
}
