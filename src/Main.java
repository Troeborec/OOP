import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws TransportTypeException {




        //Водители машины
        DriverB driverOne = new DriverB(
                "Водитель машины №1",
                true,
                3);
        DriverB driverTWO = new DriverB(
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
                null);
        Car carThree = new Car("BMW",
                "A3",
                2.0f,
                driverThree,
                Car.TypeOfBody.FURGON);
        Car carFour = new Car("Ferrari",
                "A4",
                2.0f,
                driverFour,
                Car.TypeOfBody.KYPE);

        // Водители грузовых машин
        DriverC driverCOne = new DriverC(
                "Водитель грузовика 1 ",
                false,
                5);
        DriverC driverCTwo = new DriverC(
                "Водитель грузовика 2 ",
                false,
                8);
        DriverC driverCThree = new DriverC(
                "Водитель грузовика 3 ",
                true,
                6);
        DriverC driverCFour = new DriverC(
                "Водитель грузовика 4 ",
                true,
                5);

        Trucks trucksOne = new Trucks("Бренд №1",
                "Модель № 1",
                5.0f,
                driverCOne,
                Trucks.Trrucks.N1);
        Trucks trucksTwo = new Trucks("Бренд №2",
                "Модель № 2",
                5.0f,
                driverCTwo,
                Trucks.Trrucks.N2);
        Trucks trucksThree = new Trucks("Бренд №3",
                "Модель № 3",
                5.0f,
                driverCThree,
                Trucks.Trrucks.N2);
        Trucks trucksFour = new Trucks("Бренд №4",
                "Модель № 4",
                5.0f,
                driverCFour,
                Trucks.Trrucks.N3);

        //Водители автобуса
        DriverD driverDOne = new DriverD(
                "Водитель автобуса №1 ",
                true,
                10);
        DriverD driverDTwo = new DriverD(
                "Водитель автобуса №2 ",
                true,
                10);
        DriverD driverDThree = new DriverD(
                "Водитель автобуса №3 ",
                true,
                10);
        DriverD driverDFour = new DriverD(
                "Водитель автобуса №4 ",
                true,
                10);

        Bus busOne = new Bus("Бренд № 1",
                "Бренд №1 ",
                3.0f,
                driverDOne,
                Bus.BusCapacity.midle);
        Bus busTwo = new Bus("Бренд № 2",
                "Бренд №2 ",
                3.0f,
                driverDTwo,
                Bus.BusCapacity.small);
        Bus busThree = new Bus("Бренд № 3",
                "Бренд №3 ",
                3.0f,
                driverDThree,
                Bus.BusCapacity.big);
        Bus busFour = new Bus("Бренд №4",
                "Бренд №4 ",
                3.0f,
                driverDFour,
                Bus.BusCapacity.veryBig);


        //Механики

        Mechanic mechanicOne = new Mechanic("Vasa", "BMW");
        Mechanic mechanicTwo = new Mechanic("PETA", "AUDI");
        Mechanic mechanicThree = new Mechanic("KIRILL", "NASA");
        Mechanic mechanicFour = new Mechanic("Alexey", "Centr");


        try {
            busOne.passDiagnostic();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        carOne.passDiagnostic();
        System.out.println("/////////////////");
        carThree.passDiagnostic();
        System.out.println("/////////////////");
        trucksTwo.passDiagnostic();
        System.out.println("/////////////////");
        busTwo.printType();
        System.out.println("/////////////////");
        System.out.println("\n");


        //Создаю список всех учавствующих автомобилей
        List<Transport> transportList = new ArrayList<>();
        transportList.add(carOne);
        transportList.add(carTwo);
        transportList.add(carThree);
        transportList.add(carFour);
        transportList.add(busOne);
        transportList.add(busTwo);
        transportList.add(busThree);
        transportList.add(busFour);
        transportList.add(trucksOne);
        transportList.add(trucksTwo);
        transportList.add(trucksThree);
        transportList.add(trucksFour);


        //Создаю механиков
        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanicOne);
        mechanics.add(mechanicTwo);
        mechanics.add(mechanicThree);
        mechanics.add(mechanicFour);

    }


    public static void howNameDriver() {
        System.out.println("Имя ");
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет учавствовать в заезде");
    }
}




