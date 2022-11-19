package Product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> listProduct = new HashSet<>();

    public boolean addProduct(Product product) {
        if (!listProduct.add(product)) {
            throw new RuntimeException("Этот продукт уже есть в списке.");
        }
        return true;
    }
}
