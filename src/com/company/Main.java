package com.company;

public class Main {

    public static void main(String[] args) {

        car newcar = new car();
        newcar.name = "Ferari";
        newcar.color = "blue";
        System.out.println(newcar.color);
        //если хотим отложить на этом месте этот вариант то пишем -git stash -m "ferrari blue color"
    }
}
