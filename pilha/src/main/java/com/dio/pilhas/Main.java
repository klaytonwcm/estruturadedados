package com.dio.pilhas;

public class Main {
    public static void main(String[] args) {
        Pilha minhapilha = new Pilha();
        minhapilha.push(new No(1));
        minhapilha.push(new No(2));
        minhapilha.push(new No(3));
        minhapilha.push(new No(4));
        minhapilha.push(new No(5));
        minhapilha.push(new No(6));



        System.out.println(minhapilha.top());

        System.out.println(minhapilha);
    }
}
