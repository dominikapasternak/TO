import java.util.List;
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Students stu = new Students();
        stu.loadData();

        Students stuNew = (Students) stu.clone();
        Students stuNew1 = (Students) stu.clone();
        List<String> list = stuNew.getStuList();
        list.add("John");
        List<String> list1 = stuNew1.getStuList();
        list1.remove("Lisa");

        System.out.println("List: " + stu.getStuList());
        System.out.println("stuNew List: "+ list);
        System.out.println("stuNew1 List: "+ list1);
    }

}

