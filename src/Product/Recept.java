package Product;

import java.util.HashSet;
import java.util.Set;

public class Recept {
    private Set<Product> recept = new HashSet<>();
    private int sum = 0;
    private String name;

    public boolean addProduct(Product product) {
        if (!recept.add(product)) {
            throw new RuntimeException("Этот продукт уже есть в списке.");
        }
        sum += product.getPrice();
        return true;
    }
}
