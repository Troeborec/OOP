package transport;

public  class Mechanic{
    private String name;
    private String nameOfCompany;

    public Mechanic(String name, String nameOfCompany) {
        this.name = name;
        this.nameOfCompany = nameOfCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public void goTehosmotr() {
        System.out.println("Механик" + getName() + " работающий в компании: " + getNameOfCompany());
    }


    public void fixCar() {
        System.out.println("Механик" + getName() + " работающий в компании: " + getNameOfCompany() + " починил машину ");
    }

    @Override
    public String toString() {
        return "Механик"+ name + '\n' +
                "компания" + nameOfCompany + '\n';
    }
}
