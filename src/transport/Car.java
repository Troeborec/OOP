package transport;

public class Car extends Transport<DriverB> implements Competing {

   private TypeOfBody typeOfBody;
    public Car(String brand,
               String model,
               float engineVolume,
               DriverB driver,
               TypeOfBody typeOfBody) {
        super(brand, model, engineVolume, driver);
        this.typeOfBody = typeOfBody;
    }

    public enum TypeOfBody {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        KYPE("Купе"),
        UNIVERSAL("Универсал"),
        KROSSOWER("Кроссовер"),
        PIKAP("Пикап"),
        FURGON("Фургон"),
        MINIWEN("Минивен");


        private String kuzov;

        TypeOfBody(String kuzov) {
            this.kuzov = kuzov;
        }

        public String getKuzov() {
            return kuzov;
        }

        public void setKuzov(String kuzov) {
            this.kuzov = kuzov;
        }

        @Override
        public String toString() {
            return "Тип кузова" +
                    kuzov + "\n";
        }
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
    public void getType() {

    }

    @Override
    public void printType() {
        System.out.println("Автомобиль: " + getBrand() + " Тип кузова: " + ((typeOfBody.getKuzov() == null || typeOfBody.getKuzov().isEmpty())? "Данных по транспортному средству недостаточно " : typeOfBody.getKuzov()));
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

