package transport;

public class Trucks extends Transport<DriverC> implements Competing {
    private Trrucks trrucks;
    public Trucks(String brand,
                  String model,
                  float engineVolume,
                  DriverC driver,
                  Trrucks trucks) {
        super(brand, model, engineVolume, driver);
        this.trrucks = trrucks;
    }

   public enum Trrucks {
       N1(0, 3.5f),
       N2(3.5f, 12),
       N3(12, 0);

       private float masOne;
       private float masTwo;

       Trrucks(float masOne, float masTwo) {
           this.masOne = masOne;
           this.masTwo = masTwo;
       }

       public float getMasOne() {
           return masOne;
       }

       public void setMasOne(float masOne) {
           this.masOne = masOne;
       }

       public float getMasTwo() {
           return masTwo;
       }

       public void setMasTwo(float masTwo) {
           this.masTwo = masTwo;
       }

       @Override
       public String toString() {
           return "Грузоподьемность от " + masOne + " до " + masTwo + ".";
       }
   }

    public void printTrrucks() {
        System.out.println("Грузовик" + getBrand() + "грузоподьемностью от " + Trrucks.N1.masOne + "до" + Trrucks.N1.masTwo);
    }

        @Override
    public void startMove() {
        System.out.println("Трэк марки " + getModel() + "начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Трэк марки " + getModel() + "закончил движение");
    }

    @Override
    public void getType() {

    }

    @Override
    public void printType() {
        System.out.println("Тип транспортного средства: ");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп Грузовика " + trrucks);
    }

    @Override
    public void BestTime() {
        int minBound = 100;
        int maxBound = 170;
        int theBestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга у Грузовика: " + theBestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 140;
        int maxBound = 280;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у Грузовика: " + maxSpeed);
    }


}
