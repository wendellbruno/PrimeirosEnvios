package application;

import entites.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Notebook",1200.00));
        list.add(new Product("Tablet",450.00));



        list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
        for (Product p : list) {
            System.out.println(p);
        }
    }

}
