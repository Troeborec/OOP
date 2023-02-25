package transport;

public class Bus extends Transport<DriverD> implements Competing {
    private BusCapacity busCapacity;
    private Bus bus;

    public Bus(String brand,
               String model,
               float engineVolume,
               DriverD driver,
               BusCapacity busCapacity) {
        super(brand, model, engineVolume, driver,);
        this.busCapacity = busCapacity;
    }

    public enum BusCapacity {
        small(0, 10),
        little(10, 25),
        midle(20, 50),
        big(50, 80),
        veryBig(80, 120);

        private float upperBound;
        private float lowerBound;

        BusCapacity(float upperBound, float lowerBound) {
            this.upperBound = upperBound;
            this.lowerBound = lowerBound;
        }

        public float getUpperBound() {
            return upperBound;
        }

        public void setUpperBound(int upperBound) {
            this.upperBound = upperBound;
        }

        public float getLowerBound() {
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
        System.out.println("Автобус " + getBrand() + " Грузоподьемность от " + ((BusCapacity.small.lowerBound <= 0 && BusCapacity.veryBig.upperBound <= 0) ?
                "Данных по транспортному средству недостаточно " : BusCapacity.small.getUpperBound() + "до " + BusCapacity.veryBig.getUpperBound()));
    }
    // Диагностика!!!
    @Override
    public void passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусы не проходят диагностику!");
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
