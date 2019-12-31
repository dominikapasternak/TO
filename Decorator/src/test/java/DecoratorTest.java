public class DecoratorTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new StandardCar());
        sportsCar.assemble();
        System.out.println("\n   ");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new StandardCar()));
        sportsLuxuryCar.assemble();
    }

}


