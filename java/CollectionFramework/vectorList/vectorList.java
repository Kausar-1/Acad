import java.util.*;

public class vectorList{
    public static void main(String args[]){
        //Vector <Integer> V= new Vector<>();
        Vector<Integer> vec= new Vector<>(12,3 );
        //System.out.println("vector capacity: " + vec.capacity());
        vec.add(3);
        vec.add(5);
        vec.add(10);
        vec.add(11);
        vec.add(12);
        vec.add(13);
        vec.add(14);
        vec.add(15);
        vec.add(16);
        vec.add(17);
        vec.add(18);
        vec.add(7);
        System.out.println("vector list: "+vec);
        System.out.println(vec.size());
        System.out.println("vector capacity: " + vec.capacity());
        vec.add(6);
        System.out.println(vec.size());
        System.out.println("vector capacity: " + vec.capacity());

    }
}