import java.util.ArrayList;
import java.util.Collections;

public class arrayListQue2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Arjun");
        al.add("Karn");
        al.add("Visma");
        al.add("Parsuram");
        System.out.println("Original List : "+ al);
        boolean search=al.contains("Visma");
        if(search==true)
        System.out.println("Visma is present in the list.");
        else
        System.out.println("Visma is not present in the list.");
        al.remove("Arjun");
        System.out.println("List after removing Arjun from the lis: "+ al);
        Collections.sort(al);
        System.out.println("List after sorting : "+al);
    }
}
