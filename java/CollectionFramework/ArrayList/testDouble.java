import java.util.ArrayList;

class testDouble{
    public static void main (String args[]){
        ArrayList <Double> list = new ArrayList<>();

        list.add(10.3);
        list.add(2.1);
        list.add(3.6);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
        }
    }
}