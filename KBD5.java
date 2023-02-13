import java.util.*;
import java.io.*;
class KBD5 
{
    public static void main(String [] args)
    {
        BufferedReader br =null;
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e)
        {

        }
        int no=0,i=1,sum=0;
        while(i<=10)
        {
            System.out.println("no");
            try
            {
                no=Integer.parseInt(br.readLine());
                sum+=no;

            }
            catch(Exception e)
            {
                continue;
            }
            i++;
        }
        System.out.println("sum:" +sum);
    }
}