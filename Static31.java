import java.io.*;

import java.util.*;
class Stratic31{
    static BufferedReader br;
    static int x[][];
    static
    {
        x=new int[3][3];
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e)
        {

        }

    }
    static void input(int p[][])
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                System.out.println("data:");
                try
                {
                    p[i][j]=Integer.parseInt(br.readLine());
                }
                catch(Exception e){continue;}
                j++;
            }
            i++;
        }
    }
    static String tostringObject(int p[][])
    {
        String a= "matrix1"+
        Arrays.toString(p[0]) + "\n" + Arrays.toString(p[1]) + "\n" + Arrays.toString(p[2]) + "\n ";
        return a;
    }
    static void display(int q[][])
    {
        System.out.println(tostringObject(q));

    }
    public static void main(String [] args)
    {
        input(x);
        display(x);
    }
}