import java.util.Random;
import java.util.Scanner;

public class Produto {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    protected Integer codProduto;
    private String nomeProduto;
    private String marca;
    protected Integer qtdEstoque;
    private Double precoUnitario;
    public Produto() {
    }

    public Produto(String nomeProduto, String marca, Integer qtdEstoque, Double precoUnitario) {
        this.codProduto = random.nextInt(100+1);
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
            return this.qtdEstoque-=quantidade;
        } else {
            System.out.println("Quantidade superior ao estoque, estoque zerado, resto da quantidade pedida");
            return this.qtdEstoque % quantidade;
        }
    }

    public void colocarEstoque(int quantidade) {
          this.qtdEstoque += quantidade;
        }
    public String toString () {
            return "Codigo : " + getCodProduto() + ", " +
                    "Nome : " + getNomeProduto() + ", " +
                    "Marca : " + getMarca() + ", " +
                    "Quantidade em estoque " + getQtdEstoque() +", " +
                    "Preço unitario : " + getPrecoUnitario();
        }
    }
