
import javax.swing.*;
import java.util.*;
public class Student3 {
    


    int no;
    String nm;
    Student3()
    {
        no=0;
        nm= new String();
    }
    Student3(int a, String b)
    {
        no=a;
        nm=b;
    }
    void setdata()
    {
       try
       {
        no= Integer.parseInt(JOptionPane.showInputDialog(null, no));
        nm=JOptionPane.showInputDialog(null, "name");
       }
       catch(Exception e){}
    }
    void setdata(int no)
    {
        this.no=no;
        nm=JOptionPane.showInputDialog(null, "name");

    }
    public String toString()
    {
        String s=" \nRoll no: " + no + "\n name :" + nm ;
        return s;
    }
    void display()
    {
        //JOptionPane.showMessageDialog(null, "data" + this);
        JOptionPane.showMessageDialog(null, "data" + toString());
    }
    public static void main(String [] args)
    {
      ArrayList<Student3>p=new ArrayList<Student3>();
      int no=0;
      while(true)
      {
        try
        {
            no = Integer.parseInt(JOptionPane.showInputDialog(null, "roll no"));
        }
        catch(Exception e){continue;}
        if(no==0)
        {
             break;
        }
        Student3 a= new Student3();
        a.setdata(no);
        p.add(a);


      }
    //   Iterator<Student3>it=p.iterator();
    //   while(it.hasNext())
    //   {
    //     Student3 k = it.next();
    //     k.display();
    //   }
      
        JOptionPane.showMessageDialog(null, "data:" + p);
    }
}

    
