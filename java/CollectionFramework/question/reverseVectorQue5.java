import java.util.Vector;

public class reverseVectorQue5 {
    public static void main(String[] args) {
        
    
    Vector <Integer> v  = new Vector<>();
    Vector<Integer> vv = new Vector<>();
    v.add(1);
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(5);

    System.out.println("Original list : "+v);
    for(int i =v.size()-1;i>=0;i--){
        vv.add(v.get(i));
    }
    System.out.println("List after reversing and storing in another list is : "+vv);
    }

}
