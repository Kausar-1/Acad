import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class prgm1 {
    public static void main(String args[]){
        CopyOnWriteArrayList<String> market = new CopyOnWriteArrayList<>();
        //ArrayList<String> market = new ArrayList<>();
        market.add("Sugar");
        market.add("Milk");
        market.add("TeaLeaf");
        System.out.println("Original List : "+ market);
        for(String item : market){
            System.out.println(item);
            if(item.equals("Milk")){
                market.add("Butter");
                System.out.println("Added butter while reading");
            }
        }
        System.out.println("Final market are : " +market);
    }
}
