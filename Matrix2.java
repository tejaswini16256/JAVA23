import java.util.*;
import javax.swing.*;
class Matrix2
{
    public static void main(String [] args)
    {
        int x[][]=null;
        x=new int[3][];
        int i=0,j=0;
        while(i<x.length)
        {
            x[i]=new int[i+1];
            i++;
        }
        i=0;
        while(i<x.length)
        {
            j=0;
            while(j<x.length)
            {
                try
                {
                    x[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "value"));
                }
                catch(Exception e){continue;}
                j++;
            }
            i++;
        }
        String s="matrix\n";
        for(i=0;i<x.length;i++)
        {
            s=s+Arrays.toString(x[i]) + "\n";
        }
        JOptionPane.showMessageDialog(null, s);

    }
}