package new27_06;

/**
 * Created by Вождь on 27.06.2017.
 */
public class MainProduct {
    public static void main(String[] args) {

        Product product = new Product("orange",56,75);
        Product product2 = new Product("apple",20,43);
        Product product3 = new Product("mango",59,3);
        Product product4 = new Product("lemon",40,5);

        Product product5 = product4.comparePrice(product3.comparePrice(product.comparePrice(product2)));
        System.out.println(product5.getName() + " quantity " + product5.getQuantity() + " is the most expensive");

        Product product6 = product4.compareQuantity(product3.compareQuantity(product.compareQuantity(product2)));
        System.out.println(product6.getName() + " is biggest quantity");

    }
}
