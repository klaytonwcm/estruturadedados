package com.dio.fila;

public class Main {
    public static void main(String[] args){

        Fila<String> minhafila = new Fila<>();

        minhafila.enqueue("primeiro");
        minhafila.enqueue("Sétimo");
        minhafila.enqueue("terceiro");
        minhafila.enqueue("quarto");

        System.out.println(minhafila.dequeue());
        System.out.println(minhafila);

    }
}
