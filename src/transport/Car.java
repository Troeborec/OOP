package transport;

import java.util.List;

public class Car extends Transport<DriverB> implements Competing {

   private TypeOfBody typeOfBody;
    public Car(String brand,
               String model,
               float engineVolume,
               DriverB driver,
               TypeOfBody typeOfBody,
               List<Mechanic> mechanic) {
        super(brand, model, engineVolume, driver,mechanic);
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
                    getKuzov() + "\n" + super.toString();
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
    public boolean needDiagnostic() {
        return true;
    }

    @Override
    public void needObjectDotherClass() {
        System.out.print("Автомобилем " + getBrand() + " управляет " + getDriver().getName() + " , обслуживают механики: ");
        int count = getMechanicList().size();
        for (int i = 0; i < getMechanicList().size(); i++) {
            System.out.print(getMechanicList().get(i).getName() + " ");
            count--;
            if (count > 0) {
                System.out.print("и ");
            }
        }
        System.out.println();
    }

    @Override
    public void getType() {

    }

    @Override
    public void printType() {
        System.out.println("Автомобиль: " + getBrand() + " Тип кузова: " + ((typeOfBody.getKuzov() == null || typeOfBody.getKuzov().isEmpty())? "Данных по транспортному средству недостаточно " : typeOfBody.getKuzov()));
        }

        //ДИАГНОСТИКА!!!
    @Override
    public void passDiagnostic() {
        System.out.println("Автомобиль " + getBrand() + " может проходить диагностику" + "\n" + "Тип кузова: " + typeOfBody.getKuzov() + "\n" + super.toString());
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

