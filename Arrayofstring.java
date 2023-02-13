
import java.util.*;
import java.io.*;
class Arrayofstring
{
    public static void main(String [] args)
    {
        BufferedReader br=null;
        try
        {
            br= new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e){}
        String []a=new String[5];
        int i=0;
        while(i<a.length)
        {
            System.out.println("city name");
            try
            {
                a[i]=br.readLine();
            }
            catch(Exception e)
            {}
            i++;
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

}