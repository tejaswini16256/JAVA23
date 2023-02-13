import java.io.*;

class KBD2
{
    public static void main(String [] args)
    { 
        InputStreamReader isr = null;
        BufferedReader br =null;
        try
        {
           isr = new InputStreamReader(System.in);
           br = new.BufferedReader(isr);
        }
        catch(Exception e)
        {

        }
        String isr ="";
        System.out.println("enter a line");
        try
        {
           str=br.readLine();
        }
        catch(Exception e)
        {}
        System.out.println(str);


    }
}