//자료구조 과제 #3 (60201901 권성중)

package ListStack;
import java.util.Stack;

public class Main {
    private static String check(String s){

        if(s.length()%2 != 0) return ("입력 값의 개수가 홀수라 짝이 맞지 않습니다.");

        Stack<Character> stack = new Stack<Character>();

        for (int i=0;i<s.length();i++){
            if(s.charAt(i) =='(' || s.charAt(i) =='{' ){
                stack.push(s.charAt(i));
            }
            else{
                if (stack.peek() == '{')
                    if (s.charAt(i) == '}')
                        stack.pop();
                    else{
                        return ("입력스트링의 "+(i+1)+" 번째에서 "+s.charAt(i)+"의 짝이 맞지 않습니다.");
                }else if (stack.peek() == '('){
                    if (s.charAt(i) == ')'){
                        stack.pop();
                    }else{
                        return ("입력스트링의 "+(i+1)+" 번째에서 "+s.charAt(i)+"의 짝이 맞지 않습니다.");
                    }
                }
            }
        }
        return ("괄호 짝이 맞습니다.");
    }

    public static void main(String[] args) {
//        ListStack<String> stack = new ListStack<String>();
        System.out.println(check("{{(){()}}}"));
        System.out.println(check("{{(){()})()}"));

//        stack.push("apple");
//        stack.push("orange");
//        stack.push("cherry");
//        stack.print();
//
//        System.out.println(stack.peek());
//        stack.push("pear");
//        stack.print();
//
//        stack.pop();
//        stack.print();
//
//        System.out.println(stack.peek());
//        stack.push("grape");
//        stack.print();
    }
}
