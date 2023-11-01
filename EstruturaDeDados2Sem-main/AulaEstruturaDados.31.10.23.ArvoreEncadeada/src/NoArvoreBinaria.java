public class NoArvoreBinaria {

    private Integer info;
    private NoArvoreBinaria esq;
    private NoArvoreBinaria dir;

    public NoArvoreBinaria(){ // Construtor completo;
        this(null, null, null);
    }

    public NoArvoreBinaria(Integer info, NoArvoreBinaria esq, NoArvoreBinaria dir) {
        this.info = info;
        this.esq = esq;
        this.dir = dir;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public NoArvoreBinaria getEsq() {
        return esq;
    }

    public void setEsq(NoArvoreBinaria esq) {
        this.esq = esq;
    }

    public NoArvoreBinaria getDir() {
        return dir;
    }

    public void setDir(NoArvoreBinaria dir) {
        this.dir = dir;
    }


    private boolean pertence(NoArvoreBinaria no, int info){
        if (no == null){
            return false;
        }
        else{
            return ((no.getInfo() == info) || pertence(no.getEsq(), info) || pertence(no.getDir(), getInfo()));
        }
    }
}


