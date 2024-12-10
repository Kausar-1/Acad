
import java.util.Scanner;
import java.util.ArrayList;
public class checkVowelsOfVectorQue7 {
    public static void main(String args[]){
       
        ArrayList<String> v = new ArrayList<>();
        ArrayList<String> vv = new ArrayList<>();
        
        Scanner s = new Scanner(System.in);
        for(int i= 0 ; i<10; i++){
            System.out.println("Enter a character : ");
            v.add(s.next());
        }
        System.out.println("Original List : "+v);
        int Vowel = 0;
        for(int i=0;i<v.size();i++){
            if(v.get(i).equals("a")|| v.get(i).equals("e") || v.get(i).equals("i") ||
             v.get(i).equals("o") || v.get(i).equals("u")){
                Vowel++;
                vv.add(v.get(i));
            }
        }
        System.out.println("Number of Vowels in the list : "+Vowel);
       System.out.println("List of vowels : "+vv);

    }    
}
