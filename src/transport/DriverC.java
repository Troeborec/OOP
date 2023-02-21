package transport;

public class DriverC extends Driver {


    public DriverC(String name,
                   boolean drivingLicense,
                   int experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории С" + getName() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории С" + getName() + "закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории С" + getName() + "заправил авто");
    }
}
