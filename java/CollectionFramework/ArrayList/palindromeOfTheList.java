import java.util.Scanner;
import java.util.ArrayList;
public class palindromeOfTheList {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter the element of the number: ");
            list.add(s.nextInt());
        }
        System.out.println("list = "+list);

        for(int i=0;i<list.size();i++){
            int temp=list.get(i);
            int N=temp;
            int rem=0;
            int rev=0;
            while(temp>0){
                rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(N==rev){
                System.out.println(N+" is a palindrome number of the list.");
            }
            else{
                System.out.println(N+ " is not a palindrome number of the list. ");
            }
        }
    }
    
}
