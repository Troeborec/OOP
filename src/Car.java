public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int year,
               String country) {
        if (brand == null || brand.isEmpty()) {
            brand = "defult";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "defult";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5f;
        }
        this.engineVolume = engineVolume;
        if (color == null || color.isEmpty()) {
            color = "Белый";
        }
        this.color = color;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "defult";
        }
        this.country = country;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "\n" + "Модель: " + model + "\n"
                + "Год выпуска: " + year + "\n" + "Цвет: " + color + "\n"
                + "Обьем двигателя: " + engineVolume + "\n";
    }
}