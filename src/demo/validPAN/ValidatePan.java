package demo.validPAN;

public class ValidatePan {
    public static void main(String[] args) {
        String s="ASEEF5433K";
        if(s.length()==10){
            for(int i=0;i<5;i++){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    continue;
                }else {
                    System.out.println("Invalid PAN 1");
                  System.exit(0);
                }
            }
            for(int i=s.length()/2+1;i<s.length()-1;i++){
                if(s.charAt(i)>= 48  && s.charAt(i)<= 57 ){
                    continue;
                }else{
                    System.out.println("Invalid PAN 2");
                    System.exit(0);
                }
            }
            if(s.charAt(s.length()-1)>='A' && s.charAt(s.length()-1)<='Z'){
                System.out.println("Valid PAN 3");
            }else
                System.out.println("INvca;lid 4");
        }else
            System.out.println("Invalid PAN 5");
    }
}
