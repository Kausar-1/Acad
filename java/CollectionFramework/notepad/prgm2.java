import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class prgm2 {
    public static void main(String[] args) {
        ArrayList<String> abc = new ArrayList<>();
        abc.add("item1");
        abc.add("item2");
        abc.add("item3");
        Thread readerThread = new Thread(()->{
            try{
                while (true){
                    for(String item : abc){
                        System.out.println("Reading item");
                        Thread.sleep(500);

                    }
                }
            }catch(Exception e){
                System.out.println("Exception "+ e);
            }
        });

        Thread writeThread = new Thread(()->{
        try{
            Thread.sleep(500);
            abc.add("item 4");
            System.out.println("added item4  to the list ");
            Thread.sleep(500);
            abc.remove("item1");
            System.out.println("item 1 removed from the list");
        }catch(Exception e){
            System.out.println(e);

        }

    });
    readerThread.start();
    writeThread.start();
    }
    

}
