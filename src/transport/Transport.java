package transport;

public abstract class Transport<T extends Driver> implements Competing {
       private final String brand;
       private final String model;
       private  float engineVolume;
       private T driver;


        public Transport(String brand,
                         String model,
                         float engineVolume,
                         T driver) {
            if (brand == null || brand.isEmpty()) {
                brand = "defult";
            }
            this.brand = brand;
            if (model == null || model.isEmpty()) {
                model = "defult";
            }
            this.model = model;
            setEngineVolume(engineVolume);
            setDriver(driver);
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.3f;
        }
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void startMove() {
        System.out.println("Начать движение");
    }


    public void  finishMove() {
        System.out.println("Закончить движение");
    }

    @Override
    public  String toString() {
        return   brand + "\n" + "Модель: " + model + "\n"
                + "Обьем двигателя: " + engineVolume + "\n";
    }
}

