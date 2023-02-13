
import java.util.*;
import javax.swing.*;
class Use_vector3
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
       
        
       JOptionPane.showMessageDialog(null, "data\n" + x);
       String str ="data\n";
       while(i<x.size())
       {
        str = str + " " + x.get(i);
       }
       JOptionPane.showMessageDialog(null, str);
       Iterator<Integer> it =x.iterator();
       str = "data:\n";
       while(it.hasNext())
       {
           str = str + " "  + it.next();
       }
       JOptionPane.showMessageDialog(null, str);
              
}



}

