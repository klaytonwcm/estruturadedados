package com.dio.listdpencad;

public class listadp<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamlist;

    public listadp() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamlist = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T element){
        NoDuplo<T> novoNo = new NoDuplo<>(element);
        novoNo.setNoProx(null);
        novoNo.setNoAnt(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if (ultimoNo != null){
            ultimoNo.setNoProx(novoNo);
        }
        ultimoNo = novoNo;
        tamlist++;
    }

    public void remove(int index){

        if (index == 0){
            primeiroNo = primeiroNo.getNoProx();
            if(primeiroNo != null){
                primeiroNo.setNoAnt(null);
            }
        }else{
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoAnt().setNoProx(noAux.getNoProx());

            if(noAux!= ultimoNo){
                noAux.getNoProx().setNoAnt(noAux.getNoAnt());
            }else{
                ultimoNo = noAux;
            }
        }
        this.tamlist--;
    }

    public void add(int index, T element){
        NoDuplo<T> noAux = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(element);
        novoNo.setNoProx(noAux);

        if(novoNo.getNoProx() != null){
            novoNo.setNoAnt(noAux.getNoAnt());
            novoNo.getNoProx().setNoAnt(novoNo);
        }else{
            novoNo.setNoAnt(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;
            }else{
                novoNo.getNoAnt().setNoProx(novoNo);
            }
        }



    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAux= primeiroNo;
        for (int i = 0; (i < index) && (noAux != null); i++);{
            noAux = noAux.getNoProx();
        }
        return noAux;
    }

    public int size(){
        return this.tamlist;
    }

    @Override
    public String toString() {
        String strReturn = "";

        NoDuplo<T> noAux = primeiroNo;
        for (int i = 0; i < size(); i++){
            strReturn += "[No{conteudo=" + noAux.getConteudo() + "}]--->";
            noAux = noAux.getNoProx();
        }

        strReturn += "null";
        return strReturn;
    }
}
