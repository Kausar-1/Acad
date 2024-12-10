
import java.util.Vector;
import java.util.LinkedList;
public class mergeTwoVectorQue4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> vv = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        System.out.println("First vector list : "+v);

        vv.add(6);
        vv.add(7);
        vv.add(8);
        vv.add(9);
        vv.add(10);
        System.out.println("Second vector list : "+vv);

        LinkedList<Integer> LL = new LinkedList<>();
        LL.addAll(v);
        LL.addAll(vv);
        System.out.println("List after merge of two vector list : "+LL);


    }
    
}
