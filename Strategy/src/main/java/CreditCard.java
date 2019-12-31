
public class CreditCard implements Strategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String nm, String cnm, String cvv, String doe){
        this.name=nm;
        this.cardNumber=cnm;
        this.cvv=cvv;
        this.dateOfExpiry=doe;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with card");
    }

}