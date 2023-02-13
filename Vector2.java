
import java.util.*;
import javax.swing.*;
class Vector2
{
    public static void main( String [] args)
    {
        Vector<Integer>x= new Vector<Integer>();
        int val=0,i=0,tot=0;
        while(true)
        {
            try
            {
                val= Integer.parseInt(JOptionPane.showInputDialog(null, "value"));

            }
            catch(Exception e)
            {
                continue;
            }
            if(val==0)
              break;
            x.add(val);
        }
        while(i<x.size())
        {
            try
            {
                val=(x.get(i)).intValue();
            }
            catch(  Exception e){}
            tot+=val;
            i++;
        }
        String str = "data\n" + x + "\n total " + tot;
       JOptionPane.showMessageDialog(null, str);
}
}

