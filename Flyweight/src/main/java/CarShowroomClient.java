public class CarShowroomClient {
    private CarShowroom carShowroom;
    public CarShowroomClient(String name) {

        carShowroom = CarFactory.getCarShowroom(name);
    }

    private int currentX = 0;
    private int currentY=0;
    public void moveCar(int newX, int newY){

        carShowroom.moveCar(currentX,
                currentY, newX, newY);
        currentX = newX;
        currentY = newY;
    }
}

