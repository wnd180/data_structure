// 자료구조 과제 #2 (60201901 권성중)

public class main {
    public static void main(String[] args) {
        SList<Integer> Sorted_List_1 = new SList<Integer>();
        SList<Integer> Sorted_List_2 = new SList<Integer>();
        SList<Integer> Merged_List = new SList<Integer>();

        Sorted_List_1.insertFront(50);
        Sorted_List_1.insertFront(40);
        Sorted_List_1.insertFront(30);
        Sorted_List_1.insertFront(20);
        Sorted_List_1.insertFront(10);

        Sorted_List_2.insertFront(55);
        Sorted_List_2.insertFront(37);
        Sorted_List_2.insertFront(35);
        Sorted_List_2.insertFront(18);
        Sorted_List_2.insertFront(15);

        System.out.print("Sorted List 1:  ");
        Sorted_List_1.print();
        System.out.print("Sorted List 2:  ");
        Sorted_List_2.print();



        System.out.print("Merged List:  ");
        Merged_List.mergeLists(Sorted_List_1.head,Sorted_List_2.head);
        System.out.println("------------------------");

        SList<Integer> Single_List = new SList<Integer>();
        Single_List.insertFront(45);
        Single_List.insertFront(17);
        Single_List.insertFront(20);
        Single_List.insertFront(50);
        Single_List.insertFront(57);
        Single_List.insertFront(35);
        Single_List.insertFront(10);
        Single_List.insertFront(15);
        Single_List.insertFront(90);
        Single_List.insertFront(10);


        System.out.println();
        System.out.print("Single List:  ");

    }
}


