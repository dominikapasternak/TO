import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> product;

    public ShoppingCart(){
        this.product=new ArrayList<Product>();
    }

    public void addProduct(Product product){
        this.product.add(product);
    }

    public void removeProduct(Product product){
        this.product.remove(product);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Product product : product){
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(Strategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}



