package ListaEncadeada;

public class Lista {
    No inicio;
    int quantidade;

    public Lista(No inicio, int quantidade) {
        this.inicio = inicio;
        this.quantidade = quantidade;
    }

    public void adicionarNo(Pessoa p) {
        No novoNo = new No(p);
        if(verificarListaVazia()) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while(atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        quantidade++;

    }
    public boolean verificarListaVazia(){
        return inicio == null;
    }
    public void RetirarNo() {
        if(verificarListaVazia()) {
            System.out.println("Lista vazia");
            return;
        }
        inicio = inicio.proximo;
        quantidade--;
    }
}
