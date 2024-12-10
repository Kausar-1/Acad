import java.util.*;
public class StringLinkedList {
    public static void main(String args[]){
        //ArrayList <String> LL= new ArrayList<>();
        //Scanner s = new Scanner(System.in);
       // LinkedList <String> list = new LinkedList<>();
        //for (int i=0; i<4;i++){
          //  System.out.println("Enter the word for the list :");
            //list.add(s.nextLine());
       // }
        //System.out.println("list : "+list);
        LinkedList<String> greenForest = new LinkedList<>(Arrays.asList("lion","tiger","zebra"));
        LinkedList<String> AmazonForest= new LinkedList<>(Arrays.asList("lion","tiger","snake"));
        System.out.println("list1: " +greenForest);
        System.out.println("list2: " +AmazonForest);
        System.out.println("After removal of AmazonForest item in greenForest :");
        greenForest.removeAll(AmazonForest);
        System.out.println("list1 :"+greenForest);
        //System.out.println("list: " +AmazonForest);
    }


    
}
