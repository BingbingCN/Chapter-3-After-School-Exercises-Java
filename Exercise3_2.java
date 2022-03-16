package Exercise;
//使用while语句计算1000以内同时被3，7整除的整数之和
public class Exercise3_2 {
    public static void main(String[] arg) {
        int x, i = 1, sum=0;
        while (i <= 1000) {
            if(i%3==0 && i%7==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
