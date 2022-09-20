package demo.CgJavaBook.Lambda;
@FunctionalInterface
interface name{
    void test(String s);
}
public class ex2 {
    public static void main(String[] args) {
        name n = (s) -> {
         char [] chars=s.toCharArray();
            for(char c: chars){
                System.out.print(c+" ");
            }
        };
      n.test("Sainath");

    }
}
