public class InternetPayment implements Strategy {

    private String emailId;
    private String password;

    public InternetPayment(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with InternetPayment.");
    }

}
