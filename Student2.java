
import javax.swing.*;
import java.util.*;
public class Student2 {
    


    int no;
    String nm;
    Student2()
    {
        no=0;
        nm= new String();
    }
    Student2(int a, String b)
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
        Student2 a[] = new Student2[5];
        int i=0;
        while(i<a.length)
        {
            a[i] = new Student2();
            a[i].setdata(i+1);
            i++;
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(a));
        
    }
}

    

