package com.company;

import java.util.ArrayList;

public class Cycler {

    private String name;
    private String surname;
    private int age;
    private String country;
    private Bicycle[] listBicycle;
    private int speed;

    public static int count = 0;

    public Cycler(String name) {
        this.name = name;
    }

    public Cycler(String name, String surname) {
        this(name);
        this.surname = surname;
    }

    public Cycler(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public Cycler(String name, String surname, int age, String country) {
        this(name, surname, age);
        this.country = country;
    }

    public Cycler(String name, String surname, int age, String country, Bicycle[] listBicycle) {
        this(name, surname, age, country);
        this.listBicycle = listBicycle;
    }

    public Cycler(String name, String surname, int age, String country, int speed, Bicycle[] listBicycle) {
        this(name, surname, age, country, listBicycle);
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        if (age >= 140 || age < 0) {
            return 0;
        } else return age;
    }

    public String getCountry() {
        if (country.isEmpty()) {
            return "Неизвестно";
        }
        return country;
    }

    public Bicycle[] getListBicycle() {
        return listBicycle;
    }

    public int getSpeed() {
        return speed;
    }

    public void showCycler() {
        System.out.println("Имя: " + this.name);
        System.out.println("Фамилия: " + this.surname);
        System.out.println("Возраст: " + this.age);
        System.out.println("Средняя скорость на дистанции: " + this.speed);
        System.out.println("Страна: " + this.country);
        System.out.print("Список велосипедов: ");

        for (int i = 0; i < listBicycle.length; i++) {
            if (i != listBicycle.length - 1) {
                System.out.print(this.listBicycle[i].getName() + ", ");
            } else System.out.print(this.listBicycle[i].getName());
        }
        System.out.println("");
        System.out.println("");
    }

    public void goIn() {
        count++;
        System.out.println("Сейчас в гонке " + count + " участников");
        System.out.println("");
    }

    public void goOut() {
        count--;
        System.out.println("");
        System.out.println("Сейчас в гонке " + count + " участников");
    }

    public void finish() {
        float time = Main.distance;
        time = time / age;
        time = time / age;
        time = time / (this.listBicycle[0].getMaxSpeed());
        time = time / this.speed;
        time = time * 60;

        System.out.println("Время гонки " + this.name + " " + this.surname + " " + (int) time + " минут");
    }
}
