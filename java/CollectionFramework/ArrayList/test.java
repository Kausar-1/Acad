import java.util.ArrayList;

class test {
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(2);
        list.add(3);
        
        // System.out.println(list);
        for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
       }
    }

}