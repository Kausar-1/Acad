import java.util.ArrayList;
import java.util.Scanner;
class updatingValueOfArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Enter the element of the list: ");
            list.add(s.nextInt());
        }
        System.out.println("list = "+list);


        //deleting list.
        list.remove(2);
        System.out.println(list);


        //checking values.
        System.out.println("checking values : ");
        System.out.println(list.contains(5));

        //updating list.
        System.out.println("updating list element : ");
        for(int i=0; i<list.size();i++){
            if(list.get(i)==2){
                list.set(i,10);
            }
        }
        System.out.println(list);

        //

    }
}