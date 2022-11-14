import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Product {
    private Collection products = new ArrayList<>();
    private Collection stack = new ArrayList();

    private String product;
    private String infoProduct;
    private double price;
    private double weight;
    private Pattern patternlitter;
    private Matcher mattcherlatter;

    public Product(String product, double price, double weight) throws ValidException {
        this.product = product;
        this.price = price;
        this.weight = weight;
        products.add(product);
        patternlitter = Pattern.compile("[a-zA-Z]");
        mattcherlatter = patternlitter.matcher(product);

        if (products.contains(product) == true) {
            products.remove(product);
            throw new ValidException("Может быть только один продукт. Это низя!");
        } else if (mattcherlatter.matches() == true) {
            throw new ValidException("Продукты могут быть исключительно на русском языке языке. Это низя!");
        } else if(product.isEmpty() == true || price == 0 || weight == 0) {
            throw new ValidException("А чё пропустил? Это низя!");
        } else {
            infoProduct = String.valueOf("Продукт " + product + "; цена " + price + "; " + weight + " киллограмм");
            stack.add(infoProduct);
        }
    }
}
