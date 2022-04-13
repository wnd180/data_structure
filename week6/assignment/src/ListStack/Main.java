//자료구조 과제 #4 (60201901 권성중)

package ListStack;
import java.util.Stack;

public class Main {

    private static void pyogi(String s){
        Stack<Character> pyogistack = new Stack<Character>();
        for (int i = 0; i<s.length();i++){
            if(s.charAt(i)=='-' || s.charAt(i)=='+'){
                while ((pyogistack.size()>0) && (pyogistack.peek() != '(')){
                    System.out.print(pyogistack.pop());
                }
                pyogistack.push(s.charAt(i));
            }else if (s.charAt(i)=='*' || s.charAt(i)=='/') {
                while ((pyogistack.size()>0) && (pyogistack.peek() == '*' || pyogistack.peek() == '/')){
                    System.out.print(pyogistack.pop());
                }
                pyogistack.push(s.charAt(i));

            } else if(s.charAt(i) == '('){
                pyogistack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                while ((pyogistack.size()>0) && (pyogistack.peek() != '(')){
                    System.out.print(pyogistack.pop());
                }
                pyogistack.pop();
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
        while (pyogistack.size()>0){
            System.out.print(pyogistack.pop());
        }

        System.out.println();
    }

    public static void main(String[] args) {
        pyogi("A-B+C/D");
        pyogi("A/B-C*D");
        pyogi("A-B*C+D/E-F");
        pyogi("(A-B)*C-(D/(E+F))");
    }
}
