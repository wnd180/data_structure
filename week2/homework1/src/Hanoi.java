import java.util.Scanner;

// 자료구조 과제 #1 (60201901 권성중)
public class Hanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        System.out.printf("원반이 %d개인 경우\n",num);
        if (num == 3){
            System.out.println("(원반 이름:크기가 작은-큰 순서 1-2-3)");
        }else{
            System.out.println("(원반 이름:크기가 작은-큰 순서 1-2-3-4)");
        }
        hanoi("A","B","C",num);
    }

    public static void hanoi(String from, String m,String to,int num){
        if(num ==0)
            return;
        hanoi(from,to,m,num-1);
        System.out.printf("원반 %s을 %s에서 %s로 이동\n", num,from,to);
        hanoi(m,from,to,num-1);
    }

}
