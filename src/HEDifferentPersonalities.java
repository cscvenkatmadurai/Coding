import java.util.Scanner;
class tabletennis
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            String str=s.next();
            int len=str.length();
            int i=0;
            int count=0;
            int anticount=0;
            int win=0;
            int lose=0;
            while(len>0)
            {
                int a=Character.getNumericValue(str.charAt(i));
                if(a==1)
                    count++;
                else
                    anticount++;

                if(count==10 && anticount==10)
                {

                    while(len>0)
                    {
                        int b=Character.getNumericValue(str.charAt(i+1));
                        // System.out.print(b);
                        if(b==1)
                            count++;
                        else
                            anticount++;

                        if(count-anticount==2)
                        {
                            win=1;
                            len=0;
                            System.out.println("WIN");

                        }
                        else if(anticount-count==2)
                        {
                            lose=1;
                            len=0;
                            System.out.println("LOSE");

                        }
                        len--;
                        i++;
                    }
                }
                //  System.out.print(a);

                len--;
                i++;
            }
            if(win==1 || lose==1)
            {}
            else
            {
                if(count>anticount)
                    System.out.println("WIN");
                else
                    System.out.println("LOSE");
            }

            // System.out.println();
            t--;

        }
    }
}