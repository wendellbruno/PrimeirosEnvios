import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Distribuidora {

    private String nome;
    private Integer numero;
    ArrayList<Produto> listProduto = new ArrayList<>();
    ArrayList<ProdutoPerecivel> listPerecivel = new ArrayList<>();
    Random random = new Random(100+1);
    Scanner scan = new Scanner(System.in);

    public Distribuidora(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public Produto buscarProduto(String nome) {
        for (Produto x : listProduto) {
            if (x.getNomeProduto().equalsIgnoreCase(nome)) {
                System.out.println(x);
                return x;
            }
            for (ProdutoPerecivel y: listPerecivel) {
                if(y.getNomeProduto().equalsIgnoreCase(nome)){
                    System.out.println(x);
                    return y;
            }
          }
        }
        System.out.println("Produto não encontrado !");
        return null;
    }
    public Produto buscarProduto(String nome, Integer codProduto) {
        for (Produto x : listProduto) {
            if (x.getNomeProduto().equalsIgnoreCase(nome) || x.getCodProduto() != codProduto) {
                System.out.println(x.getNomeProduto());
                return x;
            }
            for (ProdutoPerecivel y: listPerecivel) {
                if(y.getNomeProduto().equalsIgnoreCase(nome) || y.getCodProduto() != codProduto ){
                    System.out.println(y.getNomeProduto());
                    return y;
                }
            }
        }
        System.out.println("Produto não encontrado !");
        return null;
    }
    public void CadastrarProduto(ArrayList<Produto>listProduto,Integer codProduto) {
        System.out.println("Gerando codigo de produto .... ");
        Produto busca;
        busca = listProduto.stream().filter(x -> x.getCodProduto() == codProduto).findFirst().orElse(null);
        while (busca != null) {
            System.out.println("Gerando codigo...");
            busca = listProduto.stream().filter(x -> x.getCodProduto() == codProduto).findFirst().orElse(null);
        }
        if (busca == null) {
            System.out.print("Nome : ");
            String nomeProduto = scan.nextLine();
            System.out.print("Marca : ");
            String marca = scan.nextLine();
            System.out.print("Quantidade inicial do estoque : ");
            Integer qtdEstoque = scan.nextInt();
            System.out.print("Valor unitario : ");
            Double precoUnitario = scan.nextDouble();
            scan.nextLine();
            listProduto.add(new Produto(nomeProduto, marca, qtdEstoque, precoUnitario));
            System.out.println("Produto cadastrado com sucesso ! ");
        }
    }
    public void CadastrarProdutoPerecivel(ArrayList<ProdutoPerecivel>listPerecivel,Integer codProduto){
        System.out.println("Gerando codigo de produto .... ");
        Produto busca;
        busca = listPerecivel.stream().filter(x -> x.getCodProduto() == codProduto).findFirst().orElse(null);
        while (busca != null) {
            System.out.println("Gerando codigo...");
            busca =listPerecivel.stream().filter(x -> x.getCodProduto() == codProduto).findFirst().orElse(null);
        }
        if (busca == null) {
            System.out.print("Nome : ");
            String nomeProduto = scan.nextLine();
            System.out.print("Marca : ");
            String marca = scan.nextLine();
            System.out.print("Quantidade inicial do estoque : ");
            Integer qtdEstoque = scan.nextInt();
            System.out.print("Valor unitario : ");
            Double precoUnitario = scan.nextDouble();
            System.out.print("Data de vencimento (apenas referente ao mês do ano atual) : ");
            Integer dataValidade = scan.nextInt();
            scan.nextLine();
            listPerecivel.add(new ProdutoPerecivel(nomeProduto, marca, qtdEstoque, precoUnitario,dataValidade));
            System.out.println("Produto cadastrado com sucesso ! ");
        }
    }
    public String toString(){
        return nome + " - " + numero;
    }




}
