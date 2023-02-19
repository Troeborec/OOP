package transport;

public class Bus extends Transport<DriverD> {
    BusCapacity busCapacity;
    public Bus(String brand,
               String model,
               float engineVolume,
               DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    enum BusCapacity {
        small(0, 10),
        little(10, 25),
        midle(20, 50),
        big(50, 80),
        veryBig(80, 120),
        ;

        BusCapacity(int massOne, int massTwo) {
        }
    }

    private Integer upperBound;

    public Bus(String brand, String model, float engineVolume, DriverD driver, BusCapacity busCapacity, Integer upperBound, Integer lowerBound) {
        super(brand, model, engineVolume, driver);
        this.busCapacity = busCapacity;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
    }

    public Integer getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(Integer upperBound) {
        this.upperBound = upperBound;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    private Integer lowerBound;

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + "закончил  движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-стоп Автобуса");
    }

    @Override
    public void BestTime() {
        int minBound = 120;
        int maxBound = 180;
        int theBestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга у Автобуса: " + theBestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 50;
        int maxBound = 100;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у Автобуса: " + maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busCapacity=" + busCapacity +
                '}';
    }
}
