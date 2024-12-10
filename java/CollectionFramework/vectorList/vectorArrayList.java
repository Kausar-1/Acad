import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
public class vectorArrayList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        Vector<Integer> v = new Vector<>();
        Thread t1 = new Thread(()->{
           
            for(int i=0;i<500;i++)arr.add(i);
            for(int i=0;i<500;i++)v.add(i);
        });
        Thread t2 = new Thread(()->{
            
            for(int i=0;i<500;i++)arr.add(i);
            for(int i=0;i<500;i++)v.add(i);
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of the Array List is : "+arr.size());
        System.out.println("Size of the Vector List is : "+ v.size());
       
    }
}
