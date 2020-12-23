package com.company;

import java.util.Arrays;

abstract class MyProgram {
    /*
     *  Class serves for greetings
     */

    public String any;

}

class Greeting extends MyProgram {

    public String any = "Hello, World!";

    public void sayHello() {
        System.out.println(any);
    }
}

public class Main {

    public static void main(String[] args) {
        Greeting a = new Greeting();
        a.sayHello();

        try {
            Greeting g = null;
            g.sayHello();
        } catch (NullPointerException e) {
            System.out.println(e + " - caught");
        }
    }
}