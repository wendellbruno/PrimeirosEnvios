import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        ArrayList<Employee>list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of employees : ");
        int aux = scan.nextInt();

        for (int i = 0; i < aux ; i++) {
            System.out.println("Employees #" +i+ " data : ");
            System.out.print("Outsourced ? S/N ");
            char letra = scan.next().charAt(0);
            System.out.print("Name : ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Hour : ");
            int hours = scan.nextInt();
            System.out.print("Value of hours : ");
            double valuePerHour = scan.nextDouble();
             if(letra == 'y'){
             System.out.print("Additional charge:");
             double additionalCharge = scan.nextDouble();
             list.add(new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge));
             }else
             list.add(new Employee(name,hours,valuePerHour));
            }
        System.out.println();
        System.out.println("PAYMENTS : ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
        }

        scan.close();
        }
}


