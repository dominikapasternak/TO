public class FactoryTest {

    public void testFactory(){
        NewCakeFactory cakeFactory = new CakeFactory();
        Cake cheeseCake = cakeFactory.createCake("cheese");
        Cake appleCake = cakeFactory.createCake("apple");
    }
}

