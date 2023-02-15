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
}

