public class ObserverTest {

    public static void main(String[] args) {

        MySubject subject = new MySubject();

        Observer obj1 = new MySubjectSubscriber("Obj1");
        Observer obj2 = new MySubjectSubscriber("Obj2");
        Observer obj3 = new MySubjectSubscriber("Obj3");

        subject.register(obj1);
        subject.register(obj2);
        subject.register(obj3);

        obj1.setSubject(subject);
        obj2.setSubject(subject);
        obj3.setSubject(subject);

        obj1.update();
        subject.postMessage("New Message");
    }

}

