package SeminarTwo;

public abstract class Vehicle implements IVehicle {
    private String company;
    private String model;
    private Integer yearRelease;
    private Integer numWheels;
    private Integer speed;

    public Vehicle (String company, String model, Integer year, Integer wheels, Integer speed) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = wheels;
        this.speed = speed;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Integer getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(Integer yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public Integer getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}

