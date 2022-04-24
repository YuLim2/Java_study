package com.company.example.ch01_object;

public class Main {

    public static void main(String[] args) {
	Car k3 = new Car("blue", "1234", "yulim", 3000);
    Car model3 = new Car("blue", "1234", "tesra", 5000);

    k3.start();
    k3.move();
    k3.stop();
    }
}
