package application;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import entites.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter client data : ");
        System.out.print("Name : ");
        String name = scan.nextLine();
        System.out.print("E-mail : ");
        String email = scan.nextLine();
        System.out.println("Birth date (DD/MM/YYYY)");
        Date birthDate = sdf.parse(scan.next());
        Client client = new Client(name,email,birthDate);

        System.out.println("Enter order data : ");
        System.out.print("Status : ");
        //String status = scan.next();
        OrderStatus status = OrderStatus.valueOf(scan.next());
        System.out.print("How many items to this order ? : ");

        Order order = new Order(new Date(),status,client);

        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #"+i+" item date : ");
            System.out.print("Name : ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price : ");
            double productPrice = scan.nextDouble();
            System.out.print("Quantity : ");
            int quantity = scan.nextInt();
            Product product = new Product(productName,productPrice);
            OrderItem it = new OrderItem(quantity,productPrice,product);
            order.addItem(it);

        }
        System.out.println();
        System.out.println(order);
        scan.close();
    }
}
