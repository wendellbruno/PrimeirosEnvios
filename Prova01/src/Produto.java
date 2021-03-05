import java.util.Scanner;

public class Produto {
    Scanner scan = new Scanner(System.in);
    private Integer codProduto;
    private String nomeProduto;
    private String marca;
    protected Integer qtdEstoque;
    private Double precoUnitario;

    public Produto() {
    }

    public Produto(String nomeProduto, String marca, Integer qtdEstoque, Double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.qtdEstoque = qtdEstoque;
        this.precoUnitario = precoUnitario;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public Integer retirarDoEstoque(int quantidade) {
        if (this.getQtdEstoque() >= quantidade) {
            return this.qtdEstoque = -quantidade;
        } else {
            System.out.println("Quantidade superior ao estoque, estoque zerado, resto da quantidade pedida");
            return this.qtdEstoque % quantidade;
        }
    }

    public void colocarEstoque(int quantidade) {
        System.out.print("Codigo do produto a ser adicionado : ");
        int codigo = scan.nextInt();
        if (codigo == getCodProduto()) {
            this.qtdEstoque += quantidade;
        } else {
            System.out.println("Produto nao encontrado !");
        }
    }
    public String toString () {
            return "Codigo : " + getCodProduto() + ", " +
                    "Nome : " + getNomeProduto() + ", " +
                    "Marca : " + getQtdEstoque() + ", " +
                    "Quantidade em estoque " + getQtdEstoque();
        }
    }
