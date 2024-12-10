import java.util.ArrayList;
import java.util.Scanner;
class cwArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Enter the element of the list: ");
            list.add(s.nextInt());
        }
        System.out.println("list = \n"+list);
        System.out.println("Adding two values again .");

        for(int i=0;i<2;i++){
            System.out.println("Enter the element of the list: ");
            list.add(s.nextInt());
        }
        System.out.println("List after adding two values.");
        System.out.println("list = "+list);
    }
}