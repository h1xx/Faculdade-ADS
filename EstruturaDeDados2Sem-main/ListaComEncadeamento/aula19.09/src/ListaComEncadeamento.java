public class ListaComEncadeamento {
    private NoLista primeiro;
    private NoLista ultimo;
    private int contador;

    public ListaComEncadeamento() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public boolean isEmpty() {
        return (this.primeiro == null);
    }

    public boolean add(Integer valor) {
        NoLista no = new NoLista(valor, null);
        if (primeiro == null) {
            this.primeiro = no;
        } else {
            ultimo.setProximo(no);
        }
        this.ultimo = no;
        contador++;
        return true;
    }

    public int size() {
        return this.contador;
    }

    public void clear() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public boolean contains (Integer valor) {
        if (contador == 0) {
            return false;
        }
        NoLista tmp = this.primeiro;
        while (valor != tmp.getInfo()) {
            tmp = tmp.getProximo();
            if (tmp == null) {
                break;
            }
        }
        if (tmp == null){
            System.out.println("Retornou falso, tmp é nulo");
            return false;
        }
        System.out.println("Existe um número igual o valor");
        return true;
    }
}
