package com.company;

public class Movie {
    String name;
    int rating;

    public Movie(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    void like(){
        rating++;
    }
    void printMovie(){
        System.out.println("The movie: " + name +   " rating "+ rating);
    }
}
