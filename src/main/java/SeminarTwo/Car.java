package SeminarTwo;

public class Car extends Vehicle {
    public Car(String company, String model, int year) {
        super (company, model, year, 4, 0);
    }
    public void testDrive() { super.setSpeed(60); }
    public void park() { super.setSpeed(0); }
    public String getCompany() { return super.getCompany(); }
    public String getModel() { return super.getModel(); }
    public Integer getYearRelease() { return super.getYearRelease(); }
    public Integer getNumWheels() { return super.getNumWheels(); }
    public Integer getSpeed() { return super.getSpeed(); }

    public String toString() { return "This car is a " + this.getCompany() + " " + this.getYearRelease() + " "
            + this.getYearRelease();}
}
