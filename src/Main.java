import transport.Bus;
import transport.Car;

public class Main {


    public static void main(String[] args) {
        int month = 8;
        Car carOne = new Car("Lada",
                "Granta",
                1.7f,
                "Желтый",
                2015,
                180,
                "Россия",
                "АКПП",
                "Седан",
                "А000АА",
                4,
                true,
                new Car.Key(false,false));

        Car carTwo = new Car("Audi",
                "A8",
                2020,
                "Черный",
                2020,
                250,
                "Германия",
                null,
                null,
                null,
                3,
                false,
                new Car.Key(false,false));

        Car carThree = new Car("BMW",
                "Z8",
                3.0f,
                "Черный",
                2021,
                260,
                "Германия",
                null,
                null,
                null,
                2,
                false,
                new Car.Key(false,false));

        Car carFour = new Car("Kia",
                "Sportage 4-го покаления",
                2.4f,
                "Красный",
                2018,
                180,
                "Южная Корея",
                null,
                null,
                null,
                5,
                false,
                new Car.Key(false,false));

        Car carFive = new Car("Hyundai",
                "Avante",
                1.6f,
                "Оранжевый",
                2016,
                -210,
                "Южная Корея",
                null,
                null,
                null,
                5 ,
                false,
                new Car.Key(false, false));

        Bus busOne = new Bus("Audi",
                "Z42",
                2015,
                "Германия",
                "Красный",
                160);

        Bus busTwo = new Bus("Toyota",
                "Nora",
                2008,
                "Германия",
                "Черный",
                160);

        Bus busThree = new Bus("Ford",
                "Mastanga",
                2003,
                "Польша",
                "Зеленый",
                140);


        System.out.println(carOne + " \n" + carTwo + "\n" + carThree + "\n" + carFour + "\n" + carFive + busOne + "\n" + busTwo + "\n" + busThree);


    }
    }