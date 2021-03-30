
import java.util.Scanner;

public class Titulo extends Conta  implements  iPagavel{
    protected Double valorAPagar;
    protected Double taxa = 0.10;

    public Titulo() {
    }

    public Titulo(Integer dia, Integer mes, Double valor) {
        super(dia, mes, valor);
        this.valor=getvalorAPAgar();
    }

    public Double getValorAPagar() {
        return valorAPagar;
    }

    public Double getTaxa() {
        return taxa;
    }

    @Override
    public Double getvalorAPAgar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pagando dia : ");
        int mesPagando = scan.nextInt();
        System.out.print("Pagando do mes : ");
        int diaPagando = scan.nextInt();
        if ( diaPagando > this.dia || mesPagando > this.mes ) {
            return this.valor = this.valor * (1 + this.taxa);
        }

        return valor;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "valorAPagar=" + String.format("%.2f",valor) +
                ", taxa se houve atraso : = " + taxa +
                '}';
    }
}