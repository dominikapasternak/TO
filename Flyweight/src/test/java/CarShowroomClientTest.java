public class CarShowroomClientTest {

    public void testRaceCar() throws Exception {
        CarShowroomClient carShowroom[] = {
                new CarShowroomClient("Cheap"),
                new CarShowroomClient("Cheap"),
                new CarShowroomClient("Cheap"),
                new CarShowroomClient("Expensive"),
                new CarShowroomClient("Expensive"),
                new CarShowroomClient("Expensive")
        };
        carShowroom[0].moveCar(29, 3112);
        carShowroom[1].moveCar(39, 2002);
        carShowroom[2].moveCar(49, 1985);
        carShowroom[3].moveCar(59, 2543);
        carShowroom[4].moveCar(69, 2322);
        carShowroom[5].moveCar(79, 2135);

        System.out.println("Cheap Car: " + CheapCar.num);
        System.out.println("Expensive Car: " + ExpensiveCar.num);
    }
}



