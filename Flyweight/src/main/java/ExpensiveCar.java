public class ExpensiveCar extends CarShowroom{

    public static int num;
    public ExpensiveCar()
    {
        num++;
    }

    @Override
    public void moveCar(int currentX, int currentY, int newX ,int newY)
    {
        System.out.println("Car: "+this.name+" is X"+newX + " - Y"+newY);
    }
}

