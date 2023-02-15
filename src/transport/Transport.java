package transport;

public class Transport {
       private final String brand;
       private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

        public Transport(String brand,
                         String model,
                         int year,
                         String country,
                         String color,
                         int maxSpeed) {
            if (brand == null || brand.isEmpty()) {
                brand = "defult";
            }
            this.brand = brand;
            if (model == null || model.isEmpty()) {
                model = "defult";
            }
            this.model = model;
            if (year <= 0) {
                year = 2000;
            }
            this.year = year;
            if (country == null || country.isEmpty()) {
                country = "defult";
            }
            this.country = country;
            if (color != null && color.isEmpty()) {
                this.color = color;
            }
            setColor(color);
            setMaxSpeed(maxSpeed);
        }

//    public class Car extends Transport {
//
//    }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public String getCountry() {
            return country;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            if(maxSpeed <= 0 ) {
                maxSpeed = 150;
            }
            this.maxSpeed = maxSpeed;
        }
    @Override
    public String toString() {
        return "Марка: " + brand + "\n" + "Модель: " + model + "\n"
                + "Год выпуска: " + year + "\n" + "Цвет: " + color + "\n"
                + "Максимальная скорость: " + maxSpeed + "\n";
    }
}

