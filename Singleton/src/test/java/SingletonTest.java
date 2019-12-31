import static org.junit.Assert.*;

public class SingletonTest {


    public void testSingleton() {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("checking singleton objects equality");
        assertEquals(true, instance1==instance2);
    }

}

