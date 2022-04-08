// 자료구조 과제 #2 (60201901 권성중)
import java.util.NoSuchElementException;

public class SList <E extends Comparable<E>> {
    protected Node head;
    private int size;

    public SList(){
        head = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public int search(E target){
        Node p = head;

        for(int k=0; k<size;k++){
            if(target==p.getItem()) return k;
            p = p.getNext();
        }
        return -1;
    }
    public void insertFront(E newItem){
        head = new Node(newItem,head);
        size++;
    }
    public void insertAfter(E newItem, Node p){
        p.setNext(new Node(newItem, p.getNext()));
        size++;
    }
    public void deleteFront(){
        if(isEmpty()) throw new NoSuchElementException();

        head = head.getNext();
        size--;
    }
    public void deleteAfter(Node p){
        if (p==null) throw new NoSuchElementException();

        Node t = p.getNext();
        p.setNext(t.getNext());
        t.setNext(null);
        size--;
    }
    public void print(){
        for (Node p = head; p!=null; p=p.getNext())
            System.out.print(p.getItem()+"\t");
        System.out.println();
    }
    public void mergeLists(Node p1, Node p2){
        SList temp = new SList<>();
        if(p1.getItem().compareTo(p2.getItem()) > 0) {
            temp.head = p2;
            p2 = p2.getNext();
        }else {
            temp.head = p1;
            p1 = p1.getNext();
        }
        while(temp.size() != 10){
            if(p1.getItem().compareTo(p2.getItem()) > 0) {
                temp.insertAfter(p1.getItem(),temp.head);
                p1 = p1.getNext();
            }else {
                temp.insertAfter(p2.getItem(),temp.head);
                p2 = p2.getNext();
            }
        }
        System.out.println(temp);
    }

    public void splitList(Node p, int k, SList l1, SList l2){

    }
}
