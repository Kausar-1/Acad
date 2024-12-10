import java.util.*;
class node{
    public int value;
    public node next;
}

public class test {
    public static void main(String args[]){
        node n1 = new node();
        node n2 = new node();
        n2.value =10;
        n1.value = 20;
        n1.next = n2; 
        n2.next= null;

        System.out.println("n1 value : "+n1.value +n1.next + "  n2 value :"+ n2.value +" "+n2.next );

    }
    
}
