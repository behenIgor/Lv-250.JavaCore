package new27_06;

/**
 * Created by Вождь on 27.06.2017.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product comparePrice(Product product){
        if(this.getPrice()>product.getPrice())
            return this;
        else return product;
    }

    public Product compareQuantity(Product product){
        if(this.getQuantity()>product.getQuantity())
            return this;
        else return product;
    }
}
