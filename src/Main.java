import transport.Bus;
import transport.Car;
import transport.Trucks;

public class Main {


    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            Bus bus = new Bus("Bus brand №" + i,
                    "Bus model № " + i,
                    3.0f);

            Car car = new Car("Car brand №" + i,
                    "Cra model №" + i,
                    2.0f);

            Trucks trucks = new Trucks("Trucks brand №" + i,
                    "Trucks model №" + i,
                    5.0f);
            System.out.println(bus);
            System.out.println(car);
            System.out.println(trucks);
        }
    }
    }