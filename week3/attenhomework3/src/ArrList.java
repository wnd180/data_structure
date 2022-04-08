import java.util.NoSuchElementException;

public class ArrList <E>{
    private E a[]; //E 제네릭타입 -> 어떤 타입 들어올지 모름
    private int size;
    public ArrList(){
        a = (E[]) new Object[1];
        size = 0;
    }
    public E peek (int k){
        if (isEmpty())
            throw new NoSuchElementException();
        return a[k];
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public void insertLast(E newItem){
        if(size == a.length) //빈공간없으면
            resize(2*a.length); //배열 크기 2배확장

        a[size++] = newItem; //새항목 삽
    }
    public void insert(E newItem, int k){
        if (size == a.length)
            resize(2*a.length);
        for (int i= size-1; i>=k; i--)
            a[i+1] = a[i];
        a[k] = newItem;
        size++;
    }
    private void resize(int newSize){
        Object[] t = new Object[newSize];
        for (int i=0;i<size;i++)
            t[i]= a[i];
        a=(E[]) t;
    }
    public E delete(int k){
        if(isEmpty())
            throw new NoSuchElementException();

        E item = a[k];

        for (int i=k; i<size;i++)
            a[i] = a[i+1];
        size--;
        if (size > 0 && size == a.length/4)
            resize(a.length/2);
        return item;
    }
}

