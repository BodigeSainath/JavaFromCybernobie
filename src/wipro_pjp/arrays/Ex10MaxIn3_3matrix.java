package wipro_pjp.arrays;

public class Ex10MaxIn3_3matrix {
    public static void main(String[] args) {
        int[][] a={{100,2,3},{4,23,4},{4,43,32}};
        int m=a[0][0];
        for(int i=0;i< a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]>m){
                    m=a[i][j];
                }
            }
        }
        System.out.println(m);
    }
}
