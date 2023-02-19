package transport;

public class Trucks extends Transport<DriverC> {

    public Trucks(String brand,
                  String model,
                  float engineVolume,
                  DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    float trrucks;

    public Trucks(String brand, String model, float engineVolume, DriverC driver, float trrucks) {
        super(brand, model, engineVolume, driver);
        this.trrucks = trrucks;
    }

    enum Trrucks {
        N1(0, 3.5),
        N2(3.5, 12),
        N3(12, 0),

        ;

        Trrucks(double грузоподемностьОдин, double грузоподьемностьДва) {
        }
    }


    @Override
    public void startMove() {
        System.out.println("Трэк марки " + getModel() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Трэк марки " + getModel() + "закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп Грузовика");
    }

    @Override
    public void BestTime() {
        int minBound = 100;
        int maxBound = 170;
        int theBestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга у Грузовика: " + theBestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 140;
        int maxBound = 280;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у Грузовика: " + maxSpeed);
    }
}
