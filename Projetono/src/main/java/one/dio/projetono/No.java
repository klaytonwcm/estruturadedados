package one.dio.projetono;

public class No<T> {
    private String conteudo;
    private No<T> proximono;

    public No(String conteudo) {
        this.proximono = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximono() {
        return proximono;
    }

    public void setProximono(No proximono) {
        this.proximono = proximono;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}