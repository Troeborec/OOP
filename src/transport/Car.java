package transport;

public class Car extends Transport {


    public Car(String brand,
               String model,
               float engineVolume) {

        super(brand, model, engineVolume);
    }

    @Override
    public void goCar() {
        System.out.println("Автомобиль марки " + getBrand() + "начал движение");
    }

    @Override
    public void stopCar() {
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

