import java.util.HashMap;

public class hashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Gopalganj" );
        map.put(2,"Siwan");
        map.put(3, "Chhapra");
        System.out.println(map);
        System.out.println(map.get(2));
    }
}
