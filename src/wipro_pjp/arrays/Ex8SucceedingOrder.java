package wipro_pjp.arrays;

public class Ex8SucceedingOrder {
    public static void main(String[] args) {
        //   int[] a={6,7};int f=0,l=0,sum=0; //mycode
        //   for(int i=0;i<a.length;i++){
        //       if(a[i]==6){
        //           f=i;
        //       }
        //   }
        //   for(int i=0;i<a.length;i++){
        //       if(a[i]==7){
        //           l=i;
        //       }
        //   }
        //   if(f<l){
        //       for(int i=0;i<f;i++){
        //       sum+=a[i];
        //       }
        //       for(int i=l+1;i<a.length;i++){
        //           sum+=a[i];
        //       }
        //       System.out.println(sum);
        //   }
        //   else
        //   {
        //       for(int i=0;i<a.length;i++){
        //           sum+=a[i];
        //       }
        //       System.out.println(sum);
        //   }
        int[] array= {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        int flag = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 6)
                flag = 1;
            else if(array[i] == 7) {
                flag = 0;
                System.out.println(i);
                i++;
                System.out.println(i);
            }
            if(flag != 1)
                sum = sum + array[i];
        }
        System.out.println(sum);
    }

}
