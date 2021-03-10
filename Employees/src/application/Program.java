package application;

import entites.Department;
import entites.HourContract;
import entites.Worker;
import enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name :  ");
        String departmentName = scan.nextLine();
        System.out.println("Enter worker data : ");
        System.out.print("name : ");
        String workerName = scan.nextLine();
        System.out.print("level : ");
        String workerLevel = scan.nextLine();
        System.out.print("Base salary : ");
        double baseSalary = scan.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));

        System.out.print("How many contracts to this worker ? : ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" +i+ " date : " );
            System.out.print("Date (DD/MM/YYYY) : ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour : ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Duration (hours) : ");
            int hours = scan.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY) : ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name : " + worker.getName());
        System.out.println("Department : " + worker.getDepartment().getName());
        System.out.println("Incone for " + monthAndYear + ": " + String.format("%.2f",worker.income(year,month)));


        scan.close();
    }
}
