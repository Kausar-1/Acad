import java.util.ArrayList;
import java.util.Scanner;
public class arrayVsArrayList{
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        for(int i=0;i<=arr.length-1;i++){
        
        System.out.print(arr[i]);
        
        }
        System.out.println();
        // arr[6]=6;
        // System.out.println(arr);
       Scanner s = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<= 4; i++){
            System.out.print("Enter an element of the ArrayList: ");
            //Scanner s = new Scanner(System.in);
            al.add(s.nextInt());
        }
        System.out.println("the array List : "+al);
        al.add(100);
        System.out.println("after adding another element : "+al);
    }
}