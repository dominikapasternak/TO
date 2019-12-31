public class Singleton {

    private Singleton() {

    }

    private static class LazySingleton{
        private static final Singleton  SINGLETONINSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return LazySingleton.SINGLETONINSTANCE;
    }


}






