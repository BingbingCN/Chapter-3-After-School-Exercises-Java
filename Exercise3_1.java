package Exercise;
import java.util.*;
public class Exercise3_1 {
    public static void main(String[] arg){
        Scanner reader=new Scanner(System.in);
        double x,y;
        y=0;
        x=reader.nextDouble();
        if (x<0)
            y=-1+2*x;
        else if(x==0)
            y=-1;
        else if(x>0)
            y=-1+3*x;
        System.out.println(y);

    }

}
