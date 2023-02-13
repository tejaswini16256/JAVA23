import java.util.*;
import javax.swing.*;
class Vector1
{
    public static void main( String [] args)
    {
        Vector<Integer>x= new Vector<Integer>();
        int val=0;
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
       JOptionPane.showMessageDialog(null, "data\n" + x);
}
}