package ru.lanit.dto;

public class Model {

    private String model;

    private String vendor;

    public Model(String model, String vendor){
        this.model = model;
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
