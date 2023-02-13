import javax.swing.*;
import java.util.*;


class Array6
{
    float []k=new float[5];
    int i=0;
    while(i < k.length)
    {
        try
        {
            k[i]=Float.parseFlot(JOptionPane.showInputDialog(null,"data"));
        }
        catch(Exception e){continue;}
        i++;
    }
    JOptionPane.showMessageDialog(null,Arrays.toString(k));

}