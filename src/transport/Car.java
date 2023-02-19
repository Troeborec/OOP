package transport;

public class Car extends Transport<DriverB> implements Competing {
    private TypeOfBody typeOfBody;
    private String typeOFBody;

    public Car(String brand,
               String model,
               float engineVolume,
               DriverB driver) {
        super(brand, model, engineVolume, driver);

    }

    enum TypeOfBody {
        SEDAN("Седан"),
        HATHBACK("Хетчбек"),
        KYPE("Купе"),
        UNIVERSAL("Универсал"),
        VNEDOROZNIK("Внедорожник"),
        KROSSOVER("Кроссовер"),
        PIKAP("Пикап"),
        FURGON("Фургон"),
        MINIVEN("Минивен"),
        ;

        TypeOfBody(String model) {
        }
    }

    @Override
    public String toString() {
        return "Тип кузова: " + typeOfBody +
                '}';
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

