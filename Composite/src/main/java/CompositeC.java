public class CompositeC implements Component {

    private Integer id;
    private String name;

    public void printComponentName() {
        System.out.println(getClass().getSimpleName());
    }

}

