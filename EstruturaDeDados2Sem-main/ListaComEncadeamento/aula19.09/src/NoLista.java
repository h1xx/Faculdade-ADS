public class NoLista {
    private Integer info;
    private NoLista proximo;

    public NoLista(){
        this.info = null;
        this.proximo = null;
    }
     public NoLista(Integer info, NoLista proximo){
        this.info = info;
        this.proximo = proximo;
     }
    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public NoLista getProximo() {
        return proximo;
    }

    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }

}
