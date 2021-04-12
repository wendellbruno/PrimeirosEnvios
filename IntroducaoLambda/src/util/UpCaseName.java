package util;

import entites.Product;

import java.util.function.Function;

public class UpCaseName implements Function<Product, String>{


    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
