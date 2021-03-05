import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Distribuidora distri = new Distribuidora("Teste", 79999999);
        String nome = scan.nextLine();
        distri.buscarProduto(nome);
    }
}
