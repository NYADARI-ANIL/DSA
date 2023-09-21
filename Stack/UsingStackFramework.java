import java.util.*;


public class UsingStackFramework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.err.print(s.peek()+ " ");
            s.pop();
        }
    }
}
