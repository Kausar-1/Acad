import java.util.LinkedList;


public class checkingByLinkedList {
    public static void main(String args[]){
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(10);
        LL.add(20);
        LL.add(30);
        LL.add(40);
        LL.add(50);
        System.out.println("Original Linked List : " +LL);
        // System.out.println(LL.getLast());
        System.out.println("Peek value:"+LL.get(LL.size()-1));
        System.out.println("Pop last value  : "+LL.remove(LL.size()-1));
        System.out.println("New List : " + LL);
       
    }
}
