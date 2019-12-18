import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements Component {
    private Integer id;
    private String name;

    private static List<Component> childComponent;

    public CompositeElement(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childComponent = new ArrayList<>();
    }

    public void printComponentName() {
        childComponent.forEach(Component::printComponentName);
    }

    public static void addComponent(Component component) {
        childComponent.add(component);
    }

    public void removeComponent(Component component) {
        childComponent.remove(component);
    }
}
