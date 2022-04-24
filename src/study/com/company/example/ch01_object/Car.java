package com.company.example.ch01_object;

public class Car {
    private String color;
    private String number;
    private String company;
    private int price;

    public Car(String color, String number, String company, int price) {
        this.color = color;
        this.number = number;
        this.company = company;
        this.price = price;
    }

    public void start(){
        System.out.println("부릉...");
    }
    public void move(){
        System.out.println("부우웅");
    }
    public void stop(){
        System.out.println("끼익!!");
    }
}
