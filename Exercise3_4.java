package Exercise;
public class Exercise3_4 {
    public static void main(String[] arg){
        int i;
        double sum=0,x=0.0;
        for (i=1;i<=10000;i++){
            x=1.0/(2*i-1);
            x=Math.pow(-1,i+1)*x;
            //System.out.println(x);
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
