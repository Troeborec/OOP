package transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand,
               String model,
               float engineVolume,
               DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

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
}
