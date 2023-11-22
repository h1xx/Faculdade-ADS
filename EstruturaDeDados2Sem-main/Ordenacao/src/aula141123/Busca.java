package aula141123;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Busca {

    public static int[] criaVetorEmbaralhado (int n) {
        Set<Integer> lista = new LinkedHashSet<>();
        Random num = new Random();
        while (lista.size() < n) {
            lista.add(num.nextInt(n));
        }
        int[] v = new int[n];
        int i = 0;
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            v[i] = it.next();
            i++;
        }
        return v;
    }
    public static void imprimeVetor( int[] v) {
        String str = "[ ";
        for ( int i = 0, j = 0; i < v.length; i ++, j ++){
            if ( j == 700){
                str += "\n";
                j = 0;
            }
            str +=""+v[i]+" ";
        }
        System.out.println(str+"]");
    }

    public static int buscaLinearV1 (int[] vet, int e) {
        for ( int i = 0; i < vet.length ; i++){
            if ( e == vet[i]){
                return i;
            }
        }
        return -1;
    }

    public static int buscaLinearV2 (int[] vet, int e) {
        Ordenacao.mergeSort(vet);
        for ( int i = 0; i < vet.length; i ++){
            if ( e == vet[i]){
                return i;
            } else {
                if ( e < vet[i]){
                    return -1;
                }
            }
        }
        return -1;
    }
    public static int buscaBinariaV1( int[] vet, int e) {
        Ordenacao.mergeSort(vet);
        int ini = 0, fim = vet.length - 1, meio;
        while ( ini <= fim){
            meio = ( ini + fim ) / 2;
            if ( e < vet[meio]){
                fim = meio - 1;
            } else {
                if ( e > vet[meio]){
                    ini = meio +1;
                } else {
                    return meio;
                }
            }
        }
        return -1;
    }

    public static int buscaBinariaV2( int[] vet, int e) {
        Ordenacao.mergeSort(vet);
        return buscaBinariaV2Aux ( vet, 0, vet.length, e);
    }

    private static int buscaBinariaV2Aux( int[] vet, int ini, int fim, int e) {
        if ( ini < fim){
            int meio = ini + ( fim - ini ) / 2;
            if ( e < vet[meio]){
                return buscaBinariaV2Aux(vet, ini, meio, e);
            } else {
                if ( e > vet[meio]){
                    return buscaBinariaV2Aux(vet, meio + 1, fim, e);
                } else {
                    return meio;
                }
            }
        }
        return -1;
    }
}
