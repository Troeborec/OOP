package transport;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean rubber;

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String regNumber,
               String numberOfSeats,
               boolean rubber) {
        if (brand == null || brand.isEmpty()) {
            brand = "defult";
        }
        this.brand = brand;
//        ///////////////////////////////////
        if (model == null || model.isEmpty()) {
            model = "defult";
        }
        this.model = model;
//        /////////////////////
        setEngineVolume(engineVolume);
//        //////////////////////////////////////
        setColor(color);
//        ///////////////////////////////////
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
//        //////////////////////////////////
        if (country == null || country.isEmpty()) {
            country = "defult";
        }
        this.country = country;
//        //////////////////////////////////////
        setTransmission(transmission);
//        //////////////////////////////////
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "Кабриолет";
        }
        this.bodyType = bodyType;
//        ///////////////////////////////////////////////
        setRegNumber(regNumber);
//        //////////////////////////////////
        if (numberOfSeats == null) {
            numberOfSeats = "defult";
        }
        this.numberOfSeats = 0;
//        ///////////////////////////////////
        this.rubber = rubber;
    }

    public void changeRubber() {

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
            engineVolume = 1.5f;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            regNumber = "0000";
        }
        this.regNumber = regNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "\n" + "Модель: " + model + "\n"
                + "Год выпуска: " + year + "\n" + "Цвет: " + color + "\n"
                + "Обьем двигателя: " + engineVolume + "\n" + "Трнасмиссия: " + transmission + "\n"
                + "Тип кузова: " + bodyType + "\n" + "Регистрационный номер: " + regNumber + "\n"
                + "Количество мест: " + numberOfSeats + "\n" + "Резина: " + rubber;
    }
}