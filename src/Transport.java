public class Transport {
    String brand;
    String model;
    int year;
    String country;
    String color;
    int maxSpeed;
//    public class Car extends Transport {
//
//    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        if (color != null && color.isEmpty()) {
            this.color = color;
        }
        this.color = color;
        this.maxSpeed = maxSpeed;
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
        this.maxSpeed = maxSpeed;
    }


}
