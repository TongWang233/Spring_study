package com.kuang.pojo;

public class User {
    private Cat cat;
    private Dog dog;
    private String str;

    public User() {
    }

    public User(Cat cat, Dog dog, String str) {
        this.cat = cat;
        this.dog = dog;
        this.str = str;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}