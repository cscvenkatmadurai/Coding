import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
class hackerRank
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int i,j,k,t,a,b,cnt = 0,rcnt=0,m;


		t = kb.nextInt();
		for ( i = 0 ; i < t ; i++ )
		{
			a = kb.nextInt();
			b = kb.nextInt();
			m = b;
			for ( j = 0 ; j < a ; j++ )
			{
				cnt = 1 << j;
				System.out.println("cnt : "+cnt);
				for ( k = 1  ; k <= b ; k+=cnt  )
				{
					System.out.print(k + " ");
				}
				if(m==k)
				{
					rcnt++;
				}
				m = k;
				System.out.println("\n");
			}

			System.out.println(" Count : "+rcnt);
			//System.out.println((a-rcnt)+" "+rcnt);
			rcnt = 0;
		}	
	}
}