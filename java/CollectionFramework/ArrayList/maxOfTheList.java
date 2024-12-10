import java.util.ArrayList;
import java.util.Scanner;
public class maxOfTheList {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner s= new Scanner(System.in);
        for (int i=0;i<5;i++){
        System.out.println("Enter the  element of the list : ");
        list.add(s.nextInt());
        }

        System.out.println("The original list :");
        System.out.println(list);

        //max of the list
        int max=0;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println(max+" is the max of the list.");


        //palindrome
       
        for(int i=0;i<list.size();i++){
            int temp=0;
            int rev=0;
            int rem=0;
            temp=list.get(i);
            int N=temp;
            while(temp>0){
            rem=temp%10;
            rev = rev * 10+rem;
            temp=temp/10;

            }
            if(rev==N){
                System.out.println(N+" is a palindrome number of the list.");
            }
            else{
                System.out.println(N+" is not a palindrome number of the list.");
            }

        }


        
    }
}
