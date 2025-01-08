import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"md");
        map.put(2,"kausar");
        map.put(3,"nizam");
        map.put(4,"ankit");
        map.put(null,"abc");
        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("kausar"));
        System.out.println(map.get(3));
       
        map.put(null,"pqr");
        System.out.println(map);
        map.put(6,null);
        map.put(7,null);
        map.put(5,null);
        System.out.println(map);
    }
}
