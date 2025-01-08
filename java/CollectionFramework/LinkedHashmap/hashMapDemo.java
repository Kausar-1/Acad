import java.util.*;
import java.util.HashMap;
public class hashMapDemo{
  public static void main(String args[]){
    HashMap<Integer,String> mapG  = new HashMap<>();
    mapG.put(1, "bread");
    mapG.put(2,"jam");
    mapG.put(3,"Tomato Sauce");
    mapG.put(4,"Chilli sauce");  

    for(Map.Entry<Integer,String>entry : mapG.entrySet()){
      System.out.println(entry.getKey()+" "+ entry.getValue());
    }
  }
}
