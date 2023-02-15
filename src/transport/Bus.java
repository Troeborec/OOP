package transport;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               float engineVolume) {

        super(brand,model,engineVolume);
    }

    @Override
    public void goCar() {
        System.out.println("Автобус марки " + getBrand() + "начал движение");
    }

    @Override
    public void stopCar() {
        System.out.println("Автобус марки " + getBrand() + "закончил  движение");
    }

}
