package com.company;

public class Vote {
    private String name;
    private String nationality;
    private int age;

    Vote (String name, String nationality, int age){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public void setStatus(String nationality, int age){

        if((nationality == "MD")&& (age >= 18) || (nationality == "Moldova") && (age >= 18)){
            this.nationality = nationality;
            this.age = age;
            System.out.println("The person " + getName() + " can vote");
        }else {
            System.out.println("The person " + getName() + " can't vote");
        }
    }
    public String getName(){
        return name;
    }
}
