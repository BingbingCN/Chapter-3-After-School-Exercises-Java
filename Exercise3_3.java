package Exercise;

public class Exercise3_3 {
    public static void main(String[] arg){
        long sum=0;
        String a;
        for (int i=1;i<=8;i++){
            a=String.valueOf('8');
            for (int j=1;j<i;j++){
                a= a+String.valueOf('8');
            }
            System.out.println(a);
            sum=sum+Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
