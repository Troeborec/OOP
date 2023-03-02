package transport;

import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private float engineVolume;
    private T driver;
    private List<Mechanic> mechanicList;

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    public enum Type {
        Car,
        Bus,
        Trucks,
    }


    public Transport(String brand,
                     String model,
                     float engineVolume,
                     T driver,
                     List<Mechanic> mechanicList) {
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
        this.mechanicList = mechanicList;
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


    public void finishMove() {
        System.out.println("Закончить движение");
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "\n" + "Модель: " + model + "\n"
                + "Обьем двигателя: " + engineVolume + "\n";
    }

    public abstract boolean needDiagnostic();

    public abstract void needObjectDotherClass();


    public abstract void getType();

    public abstract void printType();

    public abstract void passDiagnostic() throws TransportTypeException;


    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanicList);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transport<?> transport = (Transport<?>) obj;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(transport.model, model) && Objects.equals(transport.brand, brand)
                && Objects.equals(transport.driver, driver)
                && Objects.equals(transport.mechanicList, mechanicList);
    }
}




