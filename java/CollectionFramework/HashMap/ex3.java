import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        Scanner s = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the roll number and name of the student : ");
        for(int i =0;i<5;i++){
            System.out.print("Enter roll number : ");
            int roll = s.nextInt();
            System.out.print("Enter name : ");
            String name = ss.nextLine();
            map.put(roll,name);
            System.out.println("Added Successfully");
            count++;

        }

        System.out.println(map);
        System.out.println("Number of students records : "+count);
        System.out.println(".................Record....................");
        System.out.println("Roll       :         Name");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(" "+ entry.getKey() + "       "+entry.getValue());
        }
    }
}
