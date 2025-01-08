public class hash{
  public static int simpleHash(String key){
    int sum =0;
    for(char c: key.toCharArray()){
      sum +=(int) c;
    }
    return sum%10;
  }
  public static void main(String[] args) {
    System.out.println(simpleHash("Aman"));
    System.out.println(simpleHash("man"));
    System.out.println(simpleHash("Chaman"));
    System.out.println(simpleHash("Saman"));

  }
}