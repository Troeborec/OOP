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

}
