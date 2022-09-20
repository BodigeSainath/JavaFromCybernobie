package demo.findAndreplcae;

public class FindAndReplace {
    public static void main(String[] args) {
        String s="today is sunday";
       String search="sunday";
       String rep="sat";
       if(s.contains(search)){
           String r=s.replace(search,rep);
           System.out.println(r);
       }else
           System.out.println("not found");
    }
}
