package transport;

public class DriverB extends Driver{

    public DriverB(String name,
                   boolean drivingLicense,
                   int experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории B" + getName() + "начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории B" + getName() + "закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории B" + getName() + "заправил авто");
    }
}
