package transport;

public class Trucks extends Transport {

    public Trucks(String brand,
                  String model,
                  float engineVolume) {
        super(brand, model, engineVolume);

    }

    @Override
    public void goCar() {
        System.out.println("Трэк марки " + getModel() + "начал движение");
    }

    @Override
    public void stopCar() {
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
