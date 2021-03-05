import java.util.ArrayList;

public class Distribuidora {
    private String nome;
    private Integer numero;
    ArrayList<Produto> listProduto = new ArrayList<>();
    ArrayList<ProdutoPerecivel> listPerecivel = new ArrayList<>();

    public Distribuidora(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Produto buscarProduto(String nome) {
        for (Produto x : listProduto) {
            if (x.getNomeProduto().equalsIgnoreCase(nome)) {
                return x;
            }
        }

    }

    public Produto buscarProduto(Integer codProduto,String marca) {
        Produto prod;
        ProdutoPerecivel prodPerce;
        prod = listProduto.stream().filter(x -> x.getCodProduto() == codProduto || x.getMarca().equalsIgnoreCase(marca)).findFirst().orElse(null);
      if(prod == null){
            prodPerce = listPerecivel.stream().filter(x->x.getCodProduto()==codProduto || x.getMarca().equalsIgnoreCase(marca)).findFirst().orElse(null);
        }else(prodPerce == null && prod == null){
            System.out.println("Produto não encontrado");
            return null;
        }


    }
    }



}
