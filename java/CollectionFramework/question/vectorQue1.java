import java.util.Vector;
public class vectorQue1{
    public static void main(String[] args) {
        Vector <Integer> v = new Vector<>();
        v.add(5);
        v.add(10);
        v.add(15);
        v.add(20);
        v.add(25);
        System.out.println("Original List: "+v);
        v.add(1,30);
        System.out.println("List after adding 30 at index 1 : "+v);
        v.remove(3);
        System.out.println("List after removing element of index 3: "+v);
        v.set(1,50);
        System.out.println("List after replacing 50 at index 1 : "+v);
    }
}