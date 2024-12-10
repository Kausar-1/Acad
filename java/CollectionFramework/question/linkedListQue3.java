import java.util.LinkedList;


public class linkedListQue3 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(25);
        LL.add(50);
        LL.add(75);
        LL.add(100);
        LL.add(125);
        LL.add(150);
        System.out.println("Original List : "+LL);
        LL.add(1,200);
        System.out.println("List after inserting 200 at second place of the list: "+LL);
        LL.removeFirst();
        LL.removeLast();
        System.out.println("Size of the Linked List : "+LL.size());
        System.out.println("final list : " +LL);
    }
}
