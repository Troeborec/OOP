public class Main {


    public static void main(String[] args) {
        Car carOne = new Car("Lada",
                "Granta",
                1.7f,
                "Желтый",
                2015,
                "Россия");

        Car carTwo = new Car("Audi",
                "A8",
                2020,
                "Черный",
                2020,
                "Германия");

        Car carThree = new Car("BMW",
                "Z8",
                3.0f,
                "Черный",
                2021,
                "Германия");

        Car carFour = new Car("Kia",
                "Sportage 4-го покаления",
                2.4f,
                "Красный",
                2018,
                "Южная Корея");

        Car carFive = new Car("Hyundai",
                "Avante",
                1.6f,
                "Оранжевый",
                2016,
                "Южная Корея");

        System.out.println(carOne + " \n" + carTwo + "\n" + carThree + "\n" + carFour + "\n" + carFive);
    }
    }