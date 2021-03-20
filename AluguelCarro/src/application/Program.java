package application;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import model.entites.CarRental;
import model.entites.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Enter rental data");
        System.out.print("Car model : ");
        String model = scan.nextLine();
        System.out.print("Pickup : ");
        Date start = sdf.parse(scan.nextLine());
        System.out.print("Return : ");
        Date finish = sdf.parse(scan.nextLine());

        CarRental cr = new CarRental(start,finish,new Vehicle(model));

        System.out.println("INVOICE : ");
        System.out.print("Enter price per hour : ");
        double pricePerHour = scan.nextDouble();
        System.out.print("pricePerDay : ");
        double pricePerDay = scan.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay,pricePerHour,new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE : ");
        System.out.println("Basic payment : " + String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("Tax payment : " + String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Total payment : " + String.format("%.2f",cr.getInvoice().getTotalPayment()));

        scan.close();
    }

}
