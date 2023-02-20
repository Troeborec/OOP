package transport;

public class Bus extends Transport<DriverD> implements Competing {
   private BusCapacity busCapacity;
    public Bus(String brand,
               String model,
               float engineVolume,
               DriverD driver,
               BusCapacity busCapacity) {
        super(brand, model, engineVolume, driver);
        this.busCapacity = busCapacity;
    }

   public enum BusCapacity {
       small(0, 10),
       little(10, 25),
       midle(20, 50),
       big(50, 80),
       veryBig(80, 120);

       private Integer upperBound;
       private Integer lowerBound;

       BusCapacity(int upperBound, int lowerBound) {
           this.upperBound = upperBound;
           this.lowerBound = lowerBound;
       }

       public int getUpperBound() {
           return upperBound;
       }

       public void setUpperBound(int upperBound) {
           this.upperBound = upperBound;
       }

       public int getLowerBound() {
           return lowerBound;
       }

       public void setLowerBound(int lowerBound) {
           this.lowerBound = lowerBound;
       }

       @Override
       public String toString() {
           return "Автобус" +
                   "Нижняя граница = " + upperBound +
                   ", Верхняя граница =" + lowerBound +
                   '}';
       }
   }

       @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + "закончил  движение");
    }

    @Override
    public void getType() {
    }

    @Override
    public void printType() {
        System.out.println("Тип транспортного средства: " + busCapacity);
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-стоп Автобуса");
    }

    @Override
    public void BestTime() {
        int minBound = 120;
        int maxBound = 180;
        int theBestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга у Автобуса: " + theBestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 50;
        int maxBound = 100;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у Автобуса: " + maxSpeed);
    }
}
