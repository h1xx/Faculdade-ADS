package aula141123;

public class Ordenacao {

    public static void bubbleSortIterativoV1(int[] v){
        int n = v.length;
        for(int i = n-1; i >=1; i--){
            for (int j = 0; j < i; j++){
                if (v[j] > v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
    public static void bubbleSortIterativoV2(int[] v){
        int n = v.length;
        for (int i = n-1;i>0;i--){
            boolean troca = false;
            for (int j = 0; j < i; j++){
                if (v[j] > v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                    troca = true;
                }
            }
        }
    }
    public static void bubbleSortRecursivo(int[] v){
        bubbleSorRecursivoAux(v.length, v);
    }
    private static void bubbleSorRecursivoAux(int n, int v[]){
        boolean troca = false;
        for (int i = 0; i<n-1;i++){
            if (v[i]>v[i+1]){
                int temp = v[i];
                v[i] = v[i+1];
                v[i+1] = temp;
                troca = true;
            }
        }
        if (troca){
            bubbleSorRecursivoAux(n-1,v);
        }
    }

    public static void quickSort(int[] v){
        quickSortRec(v, 1, v.length-1);
    }
    private static void quickSortRec(int[] v, int a, int b){
        if (a>=b){
            return;
        }
        int indice = particiona(v,a,b);
        quickSortRec(v,a,indice);
        quickSortRec(v,indice+1,b);
    }
    private static void troca(int v[], int a, int b){
        int temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }
    private static int particiona(int v[], int a, int b){
        int x = v[a];
        while (a < b){
            while (v[a] < x){
                a++;
            }
            while (v[b] > x){
                b--;
            }
            troca(v,a,b);
        }
        return a;
    }
    public static void mergeSort(int[] v){
        //TO-DO: implementar
    }
    private static void mergeSortRec(int[] v, int ini, int fim){
        //TO-DO: implementar
    }
}
