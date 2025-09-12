
 import java.util.Scanner;
public class Node {
    Node next;
    Processos processo;

    public void criacao(Processos processo) {
        this.processo = processo;
        this.next=null;
    }
}
