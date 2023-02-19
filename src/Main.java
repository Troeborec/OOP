import transport.*;

public class Main {


    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB(
                    "Driver cat. B" + i,
                    false,
                    3 + i);
            Car car = new Car("Car brand №" + i,
                    "Car model №" + i,
                    2.0f,
                    driverB);


            DriverC driverC = new DriverC(
                    "Driver cat. C" + i,
                    true,
                    5 + i);
            Trucks trucks = new Trucks("Trucks brand №" + i,
                    "Trucks model №" + i,
                    5.0f,
                    driverC);


            DriverD driverD = new DriverD(
                    "Driver cat.D" + i,
                    true,
                    10 + i);
            Bus bus = new Bus("Bus brand №" + i,
                    "Bus model № " + i,
                    3.0f,
                    driverD);


            printInfo(car);
            printInfo(bus);
            printInfo(trucks);
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде");
    }




    }