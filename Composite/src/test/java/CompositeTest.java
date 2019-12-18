public class CompositeTest {

    public static void main(String args[]) {
        Component compositeC = new CompositeC();
        Composite composite = new Composite();
        CompositeElement CompositeElement = new CompositeElement(3, "CompositeElement");

        CompositeElement.addComponent(compositeC);
        CompositeElement.addComponent(composite);

        CompositeElement.printComponentName();
    }
}




