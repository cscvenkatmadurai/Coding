import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by HARISH on 8/8/2015.
 */
public class Trignometry {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double i,f,test,b,d,a,x,y,c;
  //      int tt = kb.nextInt();
//        while (tt-- > 0){
            a = kb.nextDouble();
            d = kb.nextDouble();
        if (  (0<a && a<=57*d)     || (0 <d && d<=(1.7*a))){
            f = 60;
            double radians = Math.toRadians(f);
            y = d / Math.sin(radians);
            c = y * Math.cos(Math.toRadians(f));
            x = a - c;
            System.out.println("X= " + new DecimalFormat("##.00000000000").format(x));
            System.out.println("Y= " + new DecimalFormat("##.00000000000").format(y));

        }else {
            System.out.println("Invalid Input");
        }


        //}

        /*

	double i,f,test,b,c,d,a,x,y;
	cin>>test;
	for(i==0;i<test;i++)
	{
		cin>>a>>d;
		f=60;
		y=d/(sin(f));

		c=y*cos(f);
		x=a-c;
		cout<<"X ="<<x;
		cout<<"    Y ="<<y<<endl;
		return 0;

         */
    }
}
