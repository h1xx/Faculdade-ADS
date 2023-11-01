import java.nio.file.attribute.AttributeView;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria();

        a.insere(1,
                    a.insere(2,
                            null, a.insere(4,null,null)
                                ),
                    a.insere(3,
                                a.insere(5,null, null),
                                a.insere(6,null,null))
                                );
        System.out.println(a);
    }
}