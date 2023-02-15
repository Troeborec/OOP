package transport;

public class Car extends Transport   {

    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean rubber;

    private Key key;


    public static class Key {
       private final boolean startEngine;
        private final boolean ketlessAccess;

        private Key key;

        public Key(boolean startEngine, boolean ketlessAccess) {
            this.startEngine = startEngine;
            this.ketlessAccess = ketlessAccess;
        }


        public boolean isStartEngine() {
            return startEngine;
        }

        public boolean isKetlessAccess() {
            return ketlessAccess;
        }

        @Override
        public String toString() {
            return (startEngine ? "Удаленный запуск двигателя" : "Без удаленного запуска двигателя" + "\n" + (ketlessAccess ? "Безключевой доступ" : "Ключевой доступ"));
        }
    }

    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int year,
               int maxSpeed,
               String country,
               String transmission,
               String bodyType,
               String regNumber,
               int numberOfSeats,
               boolean rubber,
               Key key) {

        super(brand, model, year,country,color,maxSpeed);


//        /////////////////////
        setEngineVolume(engineVolume);
//        //////////////////////////////////////
        setColor(color);
//        ///////////////////////////////////
        setTransmission(transmission);
//        //////////////////////////////////
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "Кабриолет";
        }
        this.bodyType = bodyType;
//        ///////////////////////////////////////////////
        setRegNumber(regNumber);
//        //////////////////////////////////
        if (numberOfSeats <= 0) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = 0;
//        ///////////////////////////////////
        this.rubber = rubber;
        setKey(key);
    }

    public void changeRubber() {

    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5f;
        }
        this.engineVolume = engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "МКПП";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isEmpty()) {
            regNumber = "A000AA";
        }
        this.regNumber = regNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeRubber(int month) {
        if (month >= 5 && month <= 10) {
            rubber = true;
        }
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3) ) {
            rubber = false;
        }
    }

    @Override
    public String toString() {
        return  super.toString() + " " + "Обьем двигателя: " + engineVolume + "\n" + "Трнасмиссия: " + transmission + "\n"
                + "Тип кузова: " + bodyType + "\n" + "Регистрационный номер: " + regNumber + "\n"
                + "Количество мест: " + numberOfSeats + "\n" + (rubber? "летняя" : "зимняя ") + " резина" + "\n" + key + "\n" +"///////////////////////////" + "\n";
    }
}