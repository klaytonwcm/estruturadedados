package com.dio.circular;

public class Main {

    public static void main(String[] args) {
        listaCircular<String> minhalistacircular = new listaCircular<>();

        minhalistacircular.add("c0");
        System.out.println(minhalistacircular);

        minhalistacircular.remove(0);
        System.out.println(minhalistacircular);

        minhalistacircular.add("c2");
        minhalistacircular.add("c3");
        minhalistacircular.add("c4");

        System.out.println(minhalistacircular);

        System.out.println(minhalistacircular.get(0));
        System.out.println(minhalistacircular.get(1));
        System.out.println(minhalistacircular.get(2));
        System.out.println(minhalistacircular.get(3));
    }
}
