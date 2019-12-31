public class CakeFactory extends NewCakeFactory{
    @Override
    public  Cake createCake(String type){
        Cake cake;
        switch (type.toLowerCase())
        {
            case "cheese":
                cake = new CheeseCake();
                break;
            case "apple":
                cake = new AppleCake();
                break;

            default: throw new IllegalArgumentException("No such cake.");
        }
        cake.addIngredients();
        cake.bakeCake();
        return cake;
    }
}

