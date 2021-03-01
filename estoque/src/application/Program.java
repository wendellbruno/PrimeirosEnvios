package estoque.src.application;
import estoque.src.entities.Products;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Products products = new Products();
        System.out.println("Enter product value : ");
        System.out.println("Name : ");
        products.name = scan.nextLine();
        System.out.println("Price : ");
        products.price = scan.nextDouble();
        System.out.println("Quantity in Stock ? ");
        products.quantity = scan.nextInt();
        System.out.println("Product data : " + products);
        System.out.println();
        System.out.println("Enter the number of products to be added in stock ");
        int quantity = scan.nextInt();
        products.addProcuts(quantity);
        System.out.println("Updated data : " + products);
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock");
        quantity = scan.nextInt();
        products.Remove(3);
        System.out.println(products);
        scan.close();
    }
}

