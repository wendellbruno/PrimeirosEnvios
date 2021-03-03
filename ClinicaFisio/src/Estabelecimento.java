import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Estabelecimento {
    private String nomeEstabelecimento;
    private String endereco = " RUA A ";

    ArrayList<Nutricionista> listNutri = new ArrayList<>();
    ArrayList<Consulta> listConsulta = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Estabelecimento(String nomeEstabelecimento, String endereco) {
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.endereco = endereco;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<Nutricionista> getListNutri() {
        return listNutri;
    }

    public void setListNutri(ArrayList<Nutricionista> listNutri) {
        this.listNutri = listNutri;
    }

    public ArrayList<Consulta> getListConsulta() {
        return listConsulta;
    }

    public void setListConsulta(ArrayList<Consulta> listConsulta) {
        this.listConsulta = listConsulta;
    }

    public Nutricionista buscarNutri(ArrayList<Nutricionista> listNutri, int crn) {
        Nutricionista busca = listNutri.stream().filter(x -> x.getCrn() == crn).findFirst().orElse(null);
        if (busca != null) {
            System.out.println(busca.getNome());
        } else {
            System.out.println("CRN não encontrado !");
        }
        return null;
    }

    public void contratarNutri(ArrayList<Nutricionista> listNutri, int bucs) {
        Nutricionista busca = listNutri.stream().filter(x -> x.getCrn() == bucs).findFirst().orElse(null);
        if (busca == null) {
            System.out.print(" CRN DISPONIVEL " + "\n" + " Nome do nutricionista : ");
            String nome = scan.nextLine();
            System.out.print("CRN : ");
            int crn = scan.nextInt();
            System.out.print("Valor da consulta : ");
            double valorConsulta = scan.nextDouble();
            listNutri.add(new Nutricionista(nome, crn, valorConsulta));
            scan.nextLine();
            System.out.println("Nutricionista cadastrado com sucesso ! ");
        } else {
            for (Nutricionista nutri : listNutri) {
                System.out.println("CRN JÁ CADASTRADO, DONO : " + nutri.getNome());
            }
        }
    }

    public Integer marcarConsulta(int crn) {
        Random random = new Random();
        Nutricionista busca = listNutri.stream().filter(x -> x.getCrn() == crn).findFirst().orElse(null);
        Integer codConsulta = random.nextInt(100 + 1);
        if (busca == null) {
            System.out.println("CRN não encontrado !");
        } else {
            listConsulta.add(new Consulta(codConsulta, buscarNutri(listNutri, crn)));
            System.out.println("Consulta marcada, nº : " + codConsulta + " com : " + busca.getNome());
        }
        return codConsulta;
    }

    public Double pagarConsulta(int codConsulta) {
        Consulta busca = listConsulta.stream().filter(x -> x.getCodConsulta() == codConsulta).findFirst().orElse(null);
        if (busca != null) {
            for (int i = 0; i < listConsulta.size(); i++) {
                if (listConsulta.get(i) == busca) {
                    System.out.print("Tempo de consulta (minutos): ");
                    int tempo = scan.nextInt();
                    System.out.println(String.format("%.2f",listNutri.get(i).calcularValor(tempo)));
                }
            }
        } else
            System.out.println("Consulta não encontrada !");
            return 0.0;
    }
}





