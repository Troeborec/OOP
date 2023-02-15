package transport;

public abstract class Transport implements Competing {
       private final String brand;
       private final String model;
       private  float engineVolume;


        public Transport(String brand,
                         String model,
                         float engineVolume) {
            if (brand == null || brand.isEmpty()) {
                brand = "defult";
            }
            this.brand = brand;
            if (model == null || model.isEmpty()) {
                model = "defult";
            }
            this.model = model;
            setEngineVolume(engineVolume);
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

    public void goCar() {
        System.out.println("Начать движение");
    }


    public void  stopCar() {
        System.out.println("Закончить движение");
    }

    @Override
    public  String toString() {
        return   brand + "\n" + "Модель: " + model + "\n"
                + "Обьем двигателя: " + engineVolume + "\n";
    }
}

