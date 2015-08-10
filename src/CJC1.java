
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class CJC1
{
    
   /* public static String calc( String s , long repeat , int check)
    {
        String ans="" ;
        int a[][] = { {1 , 2 , 3 ,4} , {2, -1 ,4 ,-3 , } , {3 ,-4 ,-1 ,2, } , {4 ,3 , -2, -1} };
        int an ;
        
        for ( int i = 0 ; i < 4 ; i ++) 
        {
            for (int  j = 0 ; j < 4 ; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        
        for ( )
        
        return ans;
    }
    */
    public static void main(String args[])throws Exception
    {
       
        //BufferedReader br = new BufferedReader(new InputStreamReader ( System.in));
        BufferedReader br = new BufferedReader( new FileReader("C-small-attempt0 (1).in"));
        BufferedWriter write = new BufferedWriter(new FileWriter("ans.txt"));
        int tt = Integer.parseInt(br.readLine()) , i  , j , k , start , count , xpos ,ypos=0 , t;
        long l , x , lx;
        String str , st[] , s , ans , temp;
        StringBuilder sb;
        int a[][] = {  {0,0,0,0,0} , {0 ,1 , 2 , 3 ,4} , {0, 2, -1 ,4 ,-3 } , {0, 3 ,-4 ,-1 ,2 } , {0, 4 ,3 , -2, -1} };
        
        for ( i = 0 ; i < tt ; i++)
        {
            str = br.readLine();
            st = str.split(" ");
            ans = "Case #"+(i+1)+": ";
            l = Long.parseLong(st[0]);
            x = Long.parseLong(st[1]);
            s = br.readLine();
            lx = l * x ;
            sb = new StringBuilder(s);
            
                    
            for ( long l1 = 1 ; l1 <= x ; l1++)
            {
                sb.append(s);
            }
            s = sb.toString();
            
            if ( l == 1 )
            {
                ans+="NO";
                //System.out.println("in 1");
            }
            else if ( lx == 3)
            {
                if ( s.charAt(0) == 'i' && s.charAt(1) == 'j' && s.charAt(2) == 'k')
                {
                    ans+="YES";
                    //System.out.println("in 2");
                }
                else
                {
                    ans+="NO";
                    //System.out.println("in 3");
                }
            }
            else if ( lx <= 2)
            {
                ans+="NO";
                //System.out.println("in 4");
            }
            else 
            {
                    temp = "";
                    start = 1;
                    xpos = s.charAt(0)-'g';
                    
                    if ( xpos == 2)
                    {
                        temp+="1";
                    }
                    else
                    {
                        t = 1;
                        while( start < lx && !temp.equals("1") )
                        {
                            ypos = s.charAt(start)-'g';
                            //System.out.println(" xpos is " + xpos + " y pos is " + ypos);
                            k = a[xpos][ypos];
                            //System.out.println(" k is " + k);
                           
                            if ( k < 0)
                            {
                                if ( t < 0) t = -1 * k;
                                else t = k;
                                xpos = -1 * k;
                            }
                            else
                            {
                                if ( t < 0) t = -1 * k;
                                else t =  k;
                                xpos = k;
                            }
                            
                            if ( t == 2)
                            {
                                temp+="1";
                            }
                            start++;

                        }
                    
                        //System.out.println(" temp is in i loop " + temp );
                        
                    }
                    
                    if ( start < lx)
                    {
                        //System.out.println(" start is " + start);
                        xpos =  s.charAt(start)-'g';
                        //System.out.println(" xpos is " + xpos);

                        start++;
                        t = 1;
                        if ( xpos == 3)
                        {
                            temp+="2";
                        }

                        else
                        {
                            while( start< lx && !temp.equals("12"))
                            {
                                ypos = s.charAt(start)-'g';
                                //System.out.println(" y pos is " + ypos);
                                k = a[xpos][ypos];
                                //System.out.println(" the k is " + k);
                                if ( k < 0)
                                {
                                    if ( t < 0) t = -1 * k;
                                    else t = k;
                                    xpos = -1 * k;
                                }
                                else
                                {
                                    if ( t < 0) t = -1 * k;
                                    else t =  k;
                                    xpos = k;
                                }

                                if ( t == 3)
                                {
                                    temp+="2";
                                }
                                start++;
                            }

                           //System.out.println(" temp is in j loop " + temp);
                        }
                       
                    }
                    
                    if ( start < lx)
                    {
                        xpos =  s.charAt(start)-'g';
                        //System.out.println(" xpos is " + xpos);
                        //System.out.println(" x pos is " + xpos + " y pos is " + ypos + " start is " + start + " count is " + count);
                        start++;
                        //System.out.println(" start is " + start + " count is " + count);
                        t = 1;
                        while( start < lx  )
                        {
                            ypos = s.charAt(start)-'g';
                            //System.out.println("xpos is " + xpos + " ypos is " + ypos); ;
                            k = a[xpos][ypos];
                            //System.out.println(" k is " + k);
                            if ( k < 0)
                            {
                                if ( t < 0) t = -1 * k;
                                else t = k;
                                xpos = -1 * k;
                            }
                            else
                            {   
                                if ( t < 0) t = -1 * k;
                                else t =  k;
                                xpos = k;
                            }

                            start++;
                            //System.out.println(" count is " + count);


                        }
                        //System.out.println(t);
                        if ( t == 4)
                        {
                            temp+="3";
                        }

                        //System.out.println("temp in k loop is " + temp);
                        
                    }
                    if ( temp.equals("123"))
                    {
                            ans+="YES";
                    }
                    else
                    {
                            ans+="NO";
                            //System.out.println("in 6");
                    }
                    
                
            }
            System.out.println(ans);
            write.write(ans);
            write.newLine();
        }
        write.close();
        
        
               
        
    }    

    
}
