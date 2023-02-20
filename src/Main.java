import transport.*;

import java.lang.reflect.Type;

public class Main {


    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB(
                    "Driver cat.B " + i,
                    false,
                    3 + i);
            Car car = new Car("Car brand №" + i,
                    "Car model №" + i,
                    2.0f,
                    driverB,
                    Car.TypeOfBody.SEDAN);


            DriverC driverC = new DriverC(
                    "Driver cat.C " + i,
                    true,
                    5 + i);
            Trucks trucks = new Trucks("Trucks brand №" + i,
                    "Trucks model №" + i,
                    5.0f,
                    driverC,
                    Trucks.Trrucks.N1);


            DriverD driverD = new DriverD(
                    "Driver cat.D " + i,
                    true,
                    10 + i);
            Bus bus = new Bus("Bus brand №" + i,
                    "Bus model № " + i,
                    3.0f,
                    driverD,
                    Bus.BusCapacity.midle);


//            printInfo(car);
//            printInfo(bus);
//            printInfo(trucks);
            System.out.println("///////////////");
            System.out.println(car);
            bus.printType();
            car.printType();
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде");
    }





    }