package transport;

public abstract class Driver {
    private String name;
    private boolean DrivingLicense;
    private int experience;

    public Driver(String name, boolean drivingLicense, int experience) {
        this.name = name;
        DrivingLicense = drivingLicense;
        this.experience = experience;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refuel();
}
