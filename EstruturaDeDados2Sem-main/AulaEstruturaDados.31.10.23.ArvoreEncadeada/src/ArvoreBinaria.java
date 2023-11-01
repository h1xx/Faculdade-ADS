public class ArvoreBinaria {

   private  NoArvoreBinaria raiz;

    public ArvoreBinaria(){
        raiz = null;
    }
    public NoArvoreBinaria insere(int v, NoArvoreBinaria esq, NoArvoreBinaria dir){
        NoArvoreBinaria no = new NoArvoreBinaria(v, esq, dir);
        raiz = no;
        return no;
    }

    public boolean vazia (){
        return (raiz == null);
    }

    public boolean pertence(NoArvoreBinaria raiz, int info){
        return pertence(raiz, info);
    }
    private boolean pertence(NoArvoreBinaria no, Integer valor){
        if (no == null){
            return false;
        }
        else{
            return ((no.getInfo().equals(valor)) || pertence(no.getEsq(), valor) || pertence(no.getDir(), valor));
        }
    }

    @Override
    public String toString(){
        return imprimePos(raiz);
    }
    private String imprimePre(NoArvoreBinaria no){
        String s = new String("");
        s = s+"<";
        if (no != null){
            s += no.getInfo();
            s += imprimePre(no.getEsq());
            s += imprimePre(no.getDir());
        }
        s = s+">";
        return s;
    }
    private String imprimeIn(NoArvoreBinaria no){
        String s = "";
        if (no != null){
            s += imprimePos(no.getEsq());
            s += no.getInfo() + " ";
            s += imprimePos(no.getDir());
        }
        return s;

    }

    private String imprimePos(NoArvoreBinaria no){
        String s = "";
        if (no != null){
            s += imprimePos(no.getEsq());
            s += imprimePos(no.getDir());
            s += no.getInfo() + " ";
        }
        return s;
    }

}
