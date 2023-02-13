
import java.util.*;
import javax.swing.*;
 public class AcountList {
     int ano;
     String anm;
     int aopnbal;
    Vector<Integer>tls;
     boolean astate;
     AcountList()
     {
        ano=0;
        anm=new String();
        aopnbal=0;
        astate=true;
        tls= new Vector<Integer>();

     }
     int balEnd()
     {
        int bal = aopnbal,amt=0;
        int i=0,n=tls.size();
        while(i<n){
            Integer obj= tls.get(i);
            amt= obj.intValue();
            bal+=amt;
            i++;

        }
        return bal;
     }
     void set(int no)
     {
        ano=no;
        anm= JOptionPane.showInputDialog(null, "a/c holder name");
        try
        {
            aopnbal = Integer.parseInt(JOptionPane.showInputDialog(null, "opening balance"));
        }
        catch(Exception e)
        { 
            aopnbal=4000;

        }
        astate=true;
     }
     public String toString()
     {
        String a = "\n a/c no:" + ano + "\n name:" + anm + "\n opening balance" + tls + "closing balance: " + balEnd() + "\n state :" + astate;
        return a;
     }
     void display()
     {
        JOptionPane.showMessageDialog(null, toString());
     }
     void delrecord()
     {
        astate= false; 
     }
     void deposit()
     {
          int amt=0;
          try
          {
            amt= Integer.parseInt(JOptionPane.showInputDialog(null, "deposit amount"));

          }
          catch(Exception e)
          {
            amt=-1;

          }
          if(amt<=0)
          {
            JOptionPane.showMessageDialog(null,"invalid");
            return;
          }
          tls.add(amt);
     }
     void withdrow()
     {
        int amt=0;
          try
          {
            amt= Integer.parseInt(JOptionPane.showInputDialog(null, "withdrow amount"));

          }
          catch(Exception e)
          {
            amt=-1;

          }
          if(amt<=0)
          {
            JOptionPane.showMessageDialog(null,"invalid");
            return;
          }
          int bal = balEnd() - amt;
          if(bal<=500)
          {
            JOptionPane.showMessageDialog(null, "below 500");
            return;
          }
          tls.add(-amt);
     }
    
}
