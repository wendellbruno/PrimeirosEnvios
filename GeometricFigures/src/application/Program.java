package application;

import entites.Circle;
import entites.Rectangle;
import entites.Shape;
import entites.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes : ");
        int n = scan.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println("Shape #"+i+" date : ");
            System.out.print("Rectangle or Circle ? (R/C) :");
            char ch = scan.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED) : ");
            Color color = Color.valueOf(scan.next());
            if(ch == 'r'){
                System.out.print("Width : ");
                Double width = scan.nextDouble();
                System.out.print("Heigth : ");
                double heigth = scan.nextDouble();
                list.add(new Rectangle(color,width,heigth));
            }else{
                System.out.print("Radius : ");
                Double radius = scan.nextDouble();
                list.add(new Circle(color,radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS : ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f",shape.area()));
        }
    }
}
