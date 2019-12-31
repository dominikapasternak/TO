public class AdapterTest {

    public static void main(String[] args) {

        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        TagAdapter tAdapter = new TagObjectAdapter();
        Price p10 = getPrice(tAdapter,10);
        Price p20 = getPrice(tAdapter,20);
        Price p30 = getPrice(tAdapter,30);
        System.out.println("Price p10 using Object Adapter="+p10.getPrice());
        System.out.println("Price p20 using Object Adapter="+p20.getPrice());
        System.out.println("Price p30 using Object Adapter="+p30.getPrice());
    }

    private static void testClassAdapter() {
       TagAdapter tAdapter = new TagClassAdapter();
        Price p10 = getPrice(tAdapter,10);
        Price p20 = getPrice(tAdapter,20);
        Price p30 = getPrice(tAdapter,30);
        System.out.println("Price p10 using Class Adapter="+p10.getPrice());
        System.out.println("Price p20 using Class Adapter="+p20.getPrice());
        System.out.println("Price p30 using Class Adapter="+p30.getPrice());
    }

    private static Price getPrice(TagAdapter tAdapter, int i) {
        switch (i){
            case 10: return tAdapter.get10Price();
            case 20: return tAdapter.get20Price();
            case 30: return tAdapter.get30Price();
            default: return tAdapter.get30Price();
        }
    }

}




