public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho = 0 ;
    }
    public int getTamanho() {
        return tamanho;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public ListaLigada setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
        return this;
    }
    public ListaLigada setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
        return this;
    }
    public ListaLigada setTamanho(int tamanho) {
        this.tamanho = tamanho;
        return this;
    }
    public  void adicionar ( String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        if(this.primeiro == null && this.ultimo == null ){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho ++;
    }
    public void remover(String valorProcurado){
        Elemento anterior = null;
        //elemento no meio;
        Elemento  atual = this.primeiro;
        for(int i = 0; i < this.getTamanho(); i ++){

            if(atual.getValor().equalsIgnoreCase(valorProcurado)){
                if(atual == primeiro && atual == ultimo){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if(atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if(atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo( null);
                }else{
                    anterior.setProximo(atual.getProximo()) ;
                    atual = null;
                }
                this.tamanho --;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for(int i = 0; i < posicao; i ++){
            if(atual.getProximo() !=null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

}
