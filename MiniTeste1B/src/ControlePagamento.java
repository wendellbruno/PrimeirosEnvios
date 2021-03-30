import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class ControlePagamento {

    public static final Double SALARIO_BASE = 1100.00;
    public static final Double HORAS = 8.00;
    public static Double totalMes;
    double total = 0;

    Scanner scan = new Scanner(System.in);

    protected List<Conta> contas = new ArrayList<>();
    protected List<Empregado> empregados = new ArrayList<>();
    protected List<iPagavel> pagamentos = new ArrayList<>();

    protected Double totalGeral;

    public ControlePagamento() {
    }


    public Double getSALARIO_BASE() {
        return SALARIO_BASE;
    }

    public Double getHORAS() {
        return HORAS;
    }

    public void addPagamento(iPagavel custo){
        pagamentos.add(custo);
    }

    public void custoFuncionarioIndividual(){
        for (Empregado x : empregados) {
            System.out.println(x);
        }
    }

    public void custoFuncionariosGeral() {
        for (Empregado y : empregados) {
            total += y.salaraio;
        }
        System.out.println(total);
        total = 0;
    }

    public void custoContasIndividual() {
        for (Conta y : contas) {
            System.out.println(y);
        }
    }
    public void custoContasGeral(){
        for (Conta x : contas) {
            total += x.valor;
        }
        System.out.println(String.format("%.2f",total));
        total = 0;
    }


    public void custoGeralEmprsa() {
        double geralContas=0.0;
        double geralEmpregados=0.0;
        for (Empregado x : empregados) {
            geralEmpregados+=x.salaraio;
            for (Conta y : contas) {
                geralContas+=y.valor;
            }
        }
        totalGeral= (geralEmpregados+geralContas);
        System.out.println("Dispesa Geral da empresa : " + String.format("%.2f",totalGeral));
        totalGeral=0.0;
    }
    }
