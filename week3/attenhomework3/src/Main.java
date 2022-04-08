public class Main {
    public static void main(String[] args) {
        ArrList<String> s = new ArrList<String>();
        s.insertLast("apple");
        s.insertLast("orange");
        s.insertLast("cherry");
        s.insertLast("pear");

        s.insert("grape",1);
        s.insert("lemon",4);
        s.insertLast("kiwi");

        s.delete(4);
        s.delete(0);
        s.delete(0);
        s.delete(3);
        s.delete(0);

        System.out.println("1번째 항목은 "+s.peek(1)+"이다.");
        System.out.println();

    }
}
