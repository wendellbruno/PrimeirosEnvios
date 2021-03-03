import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   Estabelecimento estabelecimento = new Estabelecimento(" --- ESPAÇO SAÚDE ---", " --- RUA A, N-110 --- ");
   System.out.println(estabelecimento.getNomeEstabelecimento() + "\n" + estabelecimento.getEndereco());

   System.out.print(" --- MENU --- " + "\n" +
                        " 1 - Contratar Nutricionista | Buscar Nutricionista " + "\n" +
                        " 2 - Marcar Consulta " + "\n" +
                        " 3 - Pagar Consulta " + "\n" +
                        " 4 - Sair do sistema : ");

    int aux = scan.nextInt();
    do{
        switch (aux) {
            case 1:
                scan.nextLine();
                System.out.print(" 1 - Buscar Nutricionista | 2 - Cadastrar Nutricionista : ");
                aux = scan.nextInt();
                switch (aux) {
                    case 1:
                        System.out.print("CRN do nutricionista : ");
                        int crn = scan.nextInt();
                        estabelecimento.buscarNutri(estabelecimento.listNutri, crn);
                        scan.nextLine();
                        break;
                    case 2:
                        System.out.print(" CRN do nutricionista : ");
                        aux = scan.nextInt();
                        estabelecimento.contratarNutri(estabelecimento.listNutri, aux);
                        scan.nextLine();
                        break;
                }break;
            case 2:
                System.out.print("Infomer o CRN do nutricionista : ");
                int crn = scan.nextInt();
                estabelecimento.marcarConsulta(crn);
                scan.nextLine();
                break;

            case 3 :
                System.out.print("Informe o codigo de consulta : ");
                int codConsulta = scan.nextInt();
                estabelecimento.pagarConsulta(codConsulta);
                scan.nextLine();
                break;
            case 4 :
                estabelecimento.imprimir();
                break;
               }


        System.out.println();
        System.out.print(" --- MENU --- " + "\n" +
                " 1 - Contratar Nutricionista | Buscar Nutricionista " + "\n" +
                " 2 - Marcar Consulta " + "\n" +
                " 3 - Pagar Consulta " + "\n" +
                " 4 - Sair do sistema : ");
        aux = scan.nextInt();
        }while (aux!=5);
    }
}
