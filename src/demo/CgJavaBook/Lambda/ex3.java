package demo.CgJavaBook.Lambda;

interface test{
    boolean  test(String uname,String password);
}
public class ex3 {
    public static void main(String[] args) {
        test t=(uname, password) -> {
          if(uname.equals("Admin") && password.equals("admin")){
              return  true;
          }
          else
              return false;
        };
        System.out.println(t.test("admin","admin"));
    }
}
