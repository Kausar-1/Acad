import java.util.Stack;
import java.util.Scanner;
public class stackTest {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        
        Stack <Integer> stk = new Stack<>();
        for(int i=0;i<5;i++){
            System.out.println("Enter the element of the stack : ");
            stk.push(s.nextInt());
        }
        // stk.push(10);
        // stk.push(20);
        // stk.push(30);
        // stk.push(40);
        // stk.push(50);
        System.out.println("Original Stack :"+stk);
        int popValue=stk.pop();
        System.out.println("Poped Value : "+ popValue);
        //System.out.println("Poped Values : "+stk.pop());
        System.out.println("New Stack after pop :"+ stk);
        System.out.println("Top Value: "+stk.peek());
        //System.out.println("Enter value for Search Value: " );

        System.out.println("Searched Value: " + stk.search(2));
        

    }
}
