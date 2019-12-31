public class TestBuilder {

    public static void main(String[] args) {
        Computer comp = new Computer.Builder ("500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }

}


