public class Elemento {
    private String valor;
    private Elemento proximo;

    public Elemento(String novoValor){
        this.valor = novoValor;
    }
    public String getValor() {
        return valor;
    }
    public Elemento getProximo() {
        return proximo;
    }
    public Elemento setValor(String valor) {
        this.valor = valor;
        return this;
    }
    public Elemento setProximo(Elemento proximo) {
        this.proximo = proximo;
        return this;
    }
}
