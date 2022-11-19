import Passport.Passport;
import Product.Product;
import Product.ProductList;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();

        Product product1 = new Product("Банан", 1, 230);

        productList.addProduct(product1);


        System.out.println(String.valueOf(productList));

        Passport passport = new Passport(1234567890, "asdfas", "asdf", "hg", LocalDate.of(1234, 11, 23));
        System.out.println(passport);
    }
}