package demo.initcap;

public class InitCap {
    public static void main(String[] args) {
        String s="I want to be a successful programmer";
        String[] ar=s.split(" ");
       for (int i=0;i< ar.length;i++){
//            String word=ar[i];
//            char f=word.charAt(0);
//            String st=word.substring(1);
//        if(!Character.isUpperCase(f)){
//            f=Character.toUpperCase(f);
//        }
//        System.out.println(f+st);
//        }
           char c=ar[i].charAt(0);
           if(!Character.isUpperCase(c)){

              c= Character.toUpperCase(c);
           }
            System.out.println(ar[i]);
        }
//        for(int i=0;i<ar.length;i++)
//            System.out.println();
    }
}
