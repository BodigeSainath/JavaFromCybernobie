package demo.emplyeeIdVerification;

public class EmployeeIdVerification {
    public static void main(String[] args) {
        String id="GBL/001/0321";
        String c1=id.substring(0,3);
        String c2=id.substring(4,7);
        String c3=id.substring(8);
        if(c1.equals("GBL")) {
            if (id.charAt(3) == '/') {     //use regex easy to code
                for (int i = 0; i < 3; i++) {
                    if (c2.charAt(i) >= 0 && c2.charAt(i) <= 9) {
                        //if (id.charAt(7) == '/') {
                            System.out.println("efaf");
//                        } else
//                            System.out.println("Invalid ");

                    }
//                    if (id.charAt(7) == '/') {
//                        if (Character.isDigit(Integer.parseInt(c2))) {
//                            System.out.println("login success");
//                        }
//                    else
//                        System.out.println("invalid 1");
//                }
//                    System.out.println("invalid 2");
//                }
//                System.out.println("invalid 3");
//            }
//            System.out.println("invalid 4");
                }
            }
        }

    }
}
