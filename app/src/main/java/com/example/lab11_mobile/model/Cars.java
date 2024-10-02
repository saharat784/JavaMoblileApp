package com.example.lab11_mobile.model;

public class Cars {
    private String cars_image;
    private String cars_image1;
    private String cars_image2;
    private String cars_type;
    private String cars_models;
    private String Cars_price;

    public String getCars_price() {
        return Cars_price;
    }

    public void setCars_price(String Cars_price) {
        this.Cars_price = Cars_price;
    }

    public String getCars_models() {
        return cars_models;
    }

    public void setCars_models(String cars_models) {
        this.cars_models = cars_models;
    }

    public String getCars_image() {
        return cars_image;
    }

    public void setCars_image(String cars_image) {
        this.cars_image = cars_image;
    }

    public String getCars_image1() {
        return cars_image1;
    }

    public void setCars_image1(String cars_image1) {
        this.cars_image1 = cars_image1;
    }

    public String getCars_image2() {
        return cars_image2;
    }

    public void setCars_image2(String cars_image2) {
        this.cars_image2 = cars_image2;
    }

    public String getCars_type(){
        return cars_type;
    }

    public  void  setCars_type(String cars_type){
        this.cars_type = cars_type;
    }
}
