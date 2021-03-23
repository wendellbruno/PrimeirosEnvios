package application;

import entites.Contract;
import entites.Installment;
import services.ContractService;
import services.PaypalService;
import services.iOnlinePaymentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter contract data : ");
        System.out.print("Number : " );
        int number = scan.nextInt();
        System.out.print("Date (dd/MM/yyyy)");
        Date date = sdf.parse(scan.next());
        System.out.print("Contract value : ");
        double value = scan.nextDouble();
        System.out.print("Enter number of installments : ");
        int installments = scan.nextInt();

        Contract contract = new Contract(number,date,value);

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract,installments);

        System.out.println("Installments : ");
        for (Installment x :contract.getInstallments()) {
            System.out.println(x);
        }
            
        }
}
