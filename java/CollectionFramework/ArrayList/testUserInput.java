import java.util.ArrayList;
import java.util.Scanner;

class testUserInput{
    public static void main(String args[]){
        ArrayList <Integer> list= new ArrayList<>();

        Scanner s = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("Enter the element of the list : ");
            list.add(s.nextInt());
        }
        for(int i=0;i<list.size(); i++){
                System.out.println(list.get(i));
        }
        list.add(40);
        System.out.println(list);

    }
}