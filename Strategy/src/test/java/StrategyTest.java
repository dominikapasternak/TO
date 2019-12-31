public class StrategyTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("52654664",21);
        Product product2 = new Product("56785566",37);

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.pay(new InternetPayment("myemail@example.com", "mypassword"));

        cart.pay(new CreditCard("John Smith", "46594646589645646854", "615", "12/22"));
    }

}






