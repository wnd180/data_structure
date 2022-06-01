// 자료구조 과제 #9 (60201901 권성중)
public class QuadProbing<K,V> {
    private int N = 0, M = 11;
    private K[] a = (K[]) new Object[M];
    private V[] d = (V[]) new Object[M];
    private int hash(K key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    private void put(K key, V data){
        int initialpos = hash(key);
        int i = initialpos, j = 1;
        int count = 0;
        do{
            if (a[i] == null){
                a[i] = key;
                d[i] = data; N++;
                if (count != 0){
                    System.out.print("입력 값 : "+get(a[i]));
                    System.out.println(" 충돌 횟수 : "+ (count)+"번");
                }
                return;
            }
            if (a[i].equals(key)){
                d[i] = data;
                return;
            }
            count += 1;
            i = (initialpos+ j*j++)%M;
        }while (N<M);
    }

    private V get(K key){
        int initialpos = hash(key);
        int i = initialpos, j = 1;
        while (a[i] != null){
            if(a[i].equals(key))
                return d[i];
            i = (initialpos + j*j++)%M;
        }
        return null;
    }

    public static void main(String[] args) {
        QuadProbing t = new QuadProbing<>();

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
