package com.dio.circular;

public class listaCircular<T> {

    private No<T> cabeca;
    private No <T> cauda;
    private int tamLista;


    public listaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.tamLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProxNo(cauda);
        }else{
            novoNo.setProxNo(this.cauda);
            this.cabeca.setProxNo(novoNo);
            this.cauda = novoNo;
        }

        this.tamLista++;
    }

    public void remove(int index){
        if(index >= this.tamLista)
            throw new IndexOutOfBoundsException("Indice é maior que o tamanho da lista");
        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getProxNo();
            this.cabeca.setProxNo(this.cauda);
        }else if(index == 1){
            this.cauda.setProxNo(this.cauda.getProxNo().getProxNo());
        }else{
            for (int i = 0; i < index-1; i++){
                 noAuxiliar = noAuxiliar.getProxNo();
            }
            noAuxiliar.setProxNo(noAuxiliar.getProxNo().getProxNo());
        }
              this.tamLista--;
    }

    public T get (int index){
        return this.getNo(index).getConteudo();
    }
    private No<T> getNo(int index){
        if(this.isEmpyt())
            throw new IndexOutOfBoundsException("A lista está Vazia!");

        if(index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getProxNo();
        }

        return noAuxiliar;
    }

    public boolean isEmpyt(){
        return this.tamLista == 0 ? true : false;
    }

    public int size(){
        return this.tamLista;
        }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProxNo();
        }

        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";

        return strRetorno;
    }
}

