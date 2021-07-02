package inerfaces;

public class Person implements Name,Age,Height{

    public void showname (){
        System.out.println("Name is Yura");
    }
    public void showAge(){
        System.out.println("Age is 23");
    }
    public void showHeight(){
        System.out.println("height is 165");
    }
}
