import transport.Car;

public class Main {


    public static void main(String[] args) {
        Car carOne = new Car("Lada",
                "Granta",
                1.7f,
                "Желтый",
                2015,
                "Россия",
                null,
                null,
                null,
                null,
                true,
                new Car.Key(false,false));

        Car carTwo = new Car("Audi",
                "A8",
                2020,
                "Черный",
                2020,
                "Германия",
                null,
                null,
                null,
                null,
                false,
                new Car.Key(false,false));

        Car carThree = new Car("BMW",
                "Z8",
                3.0f,
                "Черный",
                2021,
                "Германия",
                null,
                null,
                null,
                null,
                false,
                new Car.Key(false,false));

        Car carFour = new Car("Kia",
                "Sportage 4-го покаления",
                2.4f,
                "Красный",
                2018,
                "Южная Корея",
                null,
                null,
                null,
                null,
                false, new Car.Key(false,false));

        Car carFive = new Car("Hyundai",
                "Avante",
                1.6f,
                "Оранжевый",
                2016,
                "Южная Корея",
                null,
                null,
                null,
                null,
                false, new Car.Key(false,false));

        System.out.println(carOne + " \n" + carTwo + "\n" + carThree + "\n" + carFour + "\n" + carFive);
    }
    }