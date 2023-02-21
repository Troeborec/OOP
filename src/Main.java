import transport.*;

import java.lang.reflect.Type;

public class Main {


    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {

            //Водители категории В
            DriverB driverOne = new DriverB(
                    "Водитель машины №1",
                    true,
                    3);
            DriverB driverTWO= new DriverB(
                    "Водитель машины№2",
                    false,
                    5);
            DriverB driverThree = new DriverB(
                    "Водитель машины №3",
                    false,
                    5);
            DriverB driverFour = new DriverB(
                    "Водитель машины №4",
                    false,
                    3);

            //Легковая машина
            Car carOne = new Car("Lada",
                    "A1",
                    2.0f,
                    driverOne,
                    Car.TypeOfBody.PIKAP);
            Car carTwo = new Car("Audi",
                    "A2",
                    2.0f,
                    driverTWO,
                    Car.TypeOfBody.UNIVERSAL);
            Car carThree = new Car("BMW",
                    "A3",
                    2.0f,
                    driverThree,
                    Car.TypeOfBody.FURGON);
            Car carFour = new Car("Ferrari",
                    "A4",
                    2.0f,
                    driverFour,
                    null);

            // Водители автобуса
            DriverC driverCOne = new DriverC(
                    "Водитель грузовика 1 ",
                    false,
                    5);
            DriverC driverCTwo = new DriverC(
                    "Водитель грузовика 2 ",
                    false,
                    8);
            DriverC driverCTgree = new DriverC(
                    "Водитель грузовика 3 ",
                    true,
                    6);
            DriverC driverCFour = new DriverC(
                    "Водитель грузовика 4 ",
                    true,
                    5);

            Trucks trucks = new Trucks("Trucks brand №" + i,
                    "Trucks model №" + i,
                    5.0f,
                    driverCOne,
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


//            printInfo(carOne);
//            printInfo(bus);
//            printInfo(trucks);

        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде");
    }





    }