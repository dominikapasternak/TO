public class BridgeTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new BlueColor());
        tri.applyColor();

        Shape cir = new Circle(new GreenColor());
        cir.applyColor();
    }


}
