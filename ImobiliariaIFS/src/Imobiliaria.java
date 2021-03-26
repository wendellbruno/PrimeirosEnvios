public class Imobiliaria {

    public static void main(String[] args) {

        Loja loja = new Loja(50.0,1800.00,600.00);
        Apartamento apartamento = new Apartamento(75.0,2000.00,5);
        Escritorio escritorio = new Escritorio(40.0,1500.00,3,2300.00);


        System.out.println(loja.getPrecoTotal());
        loja.setValorVenda(75000.0);
        loja.imprimir();
        System.out.println();

        System.out.println(apartamento.getPrecoTotal());
        apartamento.imprimir();
        System.out.println();

        System.out.println(escritorio.getPrecoTotal());
        escritorio.setValorVenda(45000.0);
        escritorio.imprimir();
        System.out.println();




    }
}
