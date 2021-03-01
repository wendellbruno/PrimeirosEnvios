import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Product>list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of products : ");
        int aux = scan.nextInt();
        for (int i = 1; i <= aux ; i++ ){
            System.out.println("Product #"+i+" date : ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char esc = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name : ");
            String name = scan.nextLine();
            System.out.print("Price : ");
            double price = scan.nextDouble();
            if(esc == 'c'){
                list.add(new Product(name,price));
            }else if(esc == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scan.next());
                list.add(new UsedProduct(name, price, date));
            }
            else if (esc == 'i'){
                System.out.print("Customs fee : ");
                double customsFee = scan.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

    }
}
