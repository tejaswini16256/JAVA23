import java.io.*;

import java.util.*;
class Stratic3{
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
    static void input()
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
                    x[i][j]=Integer.parseInt(br.readLine());
                }
                catch(Exception e){continue;}
                j++;
            }
            i++;
        }
    }
    static String tostring()
    {
        String a= "matrix1"+
        Arrays.toString(x[0]) + "\n" + Arrays.toString(x[1]) + "\n" + Arrays.toString(x[2]) + "\n ";
        return a;
    }
    static void display()
    {
        System.out.println(tostringObject());

    }
    public static void main()
    {
        input();
        display();
    }
}