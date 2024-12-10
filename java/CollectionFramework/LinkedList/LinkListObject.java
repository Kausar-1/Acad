import java.util.*;

public class LinkListObject {
    public static void main(String args[]){
        LinkedList <Integer> LL = new LinkedList<>();
        LL.add(10);
        LL.add(20);
        LL.add(30);
        LL.add(121);
        LL.add(7);
        LL.add(76);
        LL.add(43);
        LL.add(13);
        LL.add(23);
        LL.add(18);
        System.out.println("original list ");
        System.out.println(LL);
        System.out.println("");
        System.out.println(" list after adding element in first  ");
        LL.addFirst(5);
        
        System.out.println(LL);
        System.out.println("");
        System.out.println("list after adding elemetn at last ");
        LL.addLast(9);
        System.out.println(LL);

        LL.removeIf(x -> x % 2 == 0);
        System.out.println("");
        System.out.println("deleting even number of the list ");
        System.out.println(LL);
        System.out.println(LL.getFirst());
        System.out.println( LL.getLast());
        

        
    }
    
}
