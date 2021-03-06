public class ProdutoPerecivel extends Produto {

    public Integer dataValidade;

    public ProdutoPerecivel() {
    }

    public ProdutoPerecivel(String nomeProduto, String marca, Integer qtdEstoque, Double precoUnitario, Integer dataValidade) {
        super(nomeProduto, marca, qtdEstoque, precoUnitario);
        this.codProduto = random.nextInt(100+1);
        this.dataValidade = dataValidade;
    }

    public Integer getDataValidade() {
        return dataValidade;
    }

    public void colocarEstoque(int quantidade) {
        if(this.qtdEstoque == 0){
            this.qtdEstoque+=quantidade;
        }else{
            System.out.println("Estoque ainda com produtos, não é possivel inserir novos devido as datas dos produtos !");
        }
    }

    public Integer retirarDoEstoque(int quantidade, double data){
        if(data >= dataValidade){
            System.out.println("Impossivel inserir, produto vencido");
          return qtdEstoque = 0;
        }else{
            return qtdEstoque-=quantidade;
        }
    }

    public String toString () {
        return "Codigo : " + getCodProduto() + ", " +
                "Nome : " + getNomeProduto() + ", " +
                "Marca : " + getMarca() + ", " +
                "Quantidade em estoque " + getQtdEstoque() +", " +
                "Preço unitario : " + getPrecoUnitario() +", " +
                "Data de vencimento : " +  getDataValidade();
    }
    }
