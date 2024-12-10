import java.util.Vector;
public class reverseElementOfVectorQue6 {
    public static void main(String args[]){
        Vector<Integer> vd = new Vector<>();
        Vector<Integer> v = new Vector<>();
        vd.add(12);
        vd.add(32);
        vd.add(54);
        vd.add(535);
        vd.add(33345);
        System.out.println("Original List : "+vd);
        int num,rev=0,rem=0;
        for(int i = 0; i<vd.size(); i++){
            num =vd.get(i);
            while(num>0){
            
            rem = num%10;
            rev = rev*10+rem;
            num/=10;
            }
            v.add(rev);
            rev =0;

        }
        System.out.println("List after reversed each element :  "+v);
        
    }
    
}
