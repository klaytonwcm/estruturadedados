package com.dio.listaencadeada;

public class ListaEncadeada<T> {

    private No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No(conteudo);
        if (this.isEmpty()) {
            refEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        validaIndex(index);
        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index) {

        No<T> noPivo = getNo(index);
         if (index == 0) {
            refEntrada = noPivo.getProximoNo();
                 return noPivo.getConteudo();
        }
            No<T> noAnterior = getNo(index - 1);
           noAnterior.setProximoNo(noPivo.getProximoNo());
         return noPivo.getConteudo();

    }

    public int size(){
        int tamanholist = 0;
        No<T> refAux = refEntrada;
        while (true){
            if(refAux != null){
                tamanholist++;
                if(refAux .getProximoNo() != null){
                    refAux = refAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanholist;
    }

    private void validaIndex(int index){

        if (index >= size()){
            int ultimoindex = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice" + index + "desta lista. Esta lista só vai até o indice" + ultimoindex + ".");
        }
    }

    public boolean isEmpty(){
        return refEntrada == null? true: false;
    }

    public No<T> getRefEntrada(){
        return refEntrada;
    }

    public void setRefEntrada(No<T> refEntrada) {
        this.refEntrada = refEntrada;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size(); i++) {
        strRetorno += "No{conteudo=" + noAuxiliar.getConteudo() + '}';
        noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno = "null";
        return strRetorno;
        }

    }
