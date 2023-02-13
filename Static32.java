import java.io.*;
import javax.swing.*;

import java.util.*;
class Stratic32{
    static BufferedReader br;
    static int x[][];
    static int y[][];
    static int z[][];
    static
    {
        x=new int[3][3];
        y=new int[3][3];
        z=new int[3][3];
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
    static void add()
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                z[i][j]=x[i][j]+y[i][j];
                j++;
            }
            i++;
        }

    }
    static void sub()
    {
        int i=0,j=0;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                z[i][j]=x[i][j]-y[i][j];
                j++;
            }
            i++;
        }

    }
    static void mul( )
    {
        int i=0,j=0,k;
        while(i<3)
        {
            j=0;
            while(j<3)
            {
                z[i][j]=0;
                for(k=0;k<3;k++)
                {
                    z[i][j]+=(x[i][k]*y[k][j]);

                }
                j++;
            }
            i++;
        }
    }
    static void menu()
    {
        String [] choice = new String[]{
            "Input x","Input y", "Display x","display y" , "disp[lay z", "add", "sub", "mul", "exit"};
        int opt=0;
        while(true)
        {
            opt =  JOptionPane.showOptionDialog(null, "choose option","matrix",JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE,null,choice,0 );
            if(opt==8)
            {
                break;
            }
            switch(opt)
            {
                case 0:
                   input(x);break;
                case 1:
                  input(y);break;
                case 2:
                  display(x);break;
                case 3:
                  display(y);break;
                case 4:
                  display(z);break;
                case 5:
                  add();break;
                case 6:
                  sub();break;
                case 7:
                  mul(x);break;
               

            }
        }

    }
    public static void main(String [] args)
    {
       
        menu();
        
        
    }
}