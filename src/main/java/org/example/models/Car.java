package org.example.models;

public class Car {
    private String make;
    private String model;
    private int year;
    private int horsePower;
    private String engineType;

    public Car(String make, String engineType) {
        this.setMake(make);
        this.setEngineType(engineType);
    }

    public Car(String make, String engineType, String model, int horsePower, int year) {
        this(make, engineType);
        this.setHorsePower(horsePower);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
