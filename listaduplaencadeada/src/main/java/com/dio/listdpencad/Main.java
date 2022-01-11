package com.dio.listdpencad;

public class Main {

    public static void main(String[] args) {

        listadp<String> mylistlocker = new listadp<>();
        mylistlocker.add("c1");
        mylistlocker.add("c2");
        mylistlocker.add("c3");
        mylistlocker.add("c4");
        mylistlocker.add("c5");
        mylistlocker.add("c6");
        mylistlocker.add("c7");

        System.out.println(mylistlocker);

        mylistlocker.remove(3);
        System.out.println(mylistlocker);

        mylistlocker.add(3, "25");
        System.out.println(mylistlocker);

        System.out.println(mylistlocker.get(3));
    }
}
