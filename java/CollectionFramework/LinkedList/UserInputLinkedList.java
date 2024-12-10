import java.util.Scanner;
import java.util.LinkedList;

public class UserInputLinkedList {
    public static void main(String args[]){
        LinkedList <Integer> LL = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        for(int i=0; i<10; i++ ){
            System.out.println("Enter the element of the list : ");
            LL.add(s.nextInt());
        }
        System.out.println(LL);
        System.out.println("");
        System.out.println("Enter 1 and 2  to delete the first and last element respectively ");
        int l=s.nextInt();
        if(l==1){
            LL.remove(0);
        }else if(l==2){
            LL.remove(9);
        }else{
            System.out.println("Invalid number.");
        }
            System.out.println(LL);
        
        
    }
    
}
