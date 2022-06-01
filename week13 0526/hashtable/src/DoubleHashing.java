// 자료구조 과제 #9 (60201901 권성중)
public class DoubleHashing<K,V> {
    private int N = 0, M = 11;
    private K[] a = (K[]) new Object[M];
    private V[] dt = (V[]) new Object[M];
    private int hash(K key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    private void put(K key, V data){
        int initialpos = hash(key);
        int i = initialpos, j = 1;
        int count = 0;
        int d = (7-(int)key %7);
        do{
            if (a[i] == null){
                a[i] = key;
                dt[i] = data; N++;
                if (count != 0){
                    System.out.print("입력 값 : "+get(a[i]));
                    System.out.println(" 충돌 횟수 : "+ (count)+"번");
                }
                return;
            }
            if (a[i].equals(key)){
                dt[i] = data;
                return;
            }
            count += 1;
            i = (initialpos+ j%d)%M;
            j++;
        }while (N<M);
        if (count != 0){
            System.out.print(get(a[i]));
            System.out.println("/t"+count);
        }
    }

    private V get(K key){
        int initialpos = hash(key);
        int i = initialpos, j = 1;
        int d = (7-(int)key%7);
        while (a[i] != null){
            if(a[i].equals(key))
                return dt[i];
            i = (initialpos+ j%d)%M;
            j++;
        }
        return null;
    }

    public static void main(String[] args) {
        DoubleHashing t = new DoubleHashing();

        t.put(71, 71);
        t.put(23, 23);
        t.put(73, 73);
        t.put(49, 49);
        t.put(54, 54);
        t.put(89, 89);
        t.put(39, 39);
        System.out.println("해시 테이블:");
        for(int i=0;i<t.M;++i) System.out.printf("\t%2d",i);
        System.out.println();
        for(int i=0;i<t.M;++i) System.out.print("\t"+t.a[i]);
    }
}
