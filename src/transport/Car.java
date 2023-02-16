package transport;

public class Car extends Transport<DriverB> {


    public Car(String brand,
               String model,
               float engineVolume,
               DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + "закочил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп Автомобиля");
    }

    @Override
    public void BestTime() {
        int minBound = 100;
        int maxBound = 160;
        int theBestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга у Автомобиля: " + theBestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 130;
        int maxBound = 310;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у Автомобиля: " + maxSpeed);
    }
}

