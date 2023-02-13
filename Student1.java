
import javax.swing.*;
public class Student1 {
    int no;
    String nm;
    Student1()
    {
        no=0;
        nm= new String();
    }
    Student1(int a, String b)
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
        String s="Roll no \n" + no + "\n name \n" + nm ;
        return s;
    }
    void display()
    {
        //JOptionPane.showMessageDialog(null, "data" + this);
        JOptionPane.showMessageDialog(null, "data" + toString());
    }
    public static void main(String [] args)
    {
        Student1 a= new Student1();
        a.setdata(23);
        a.display();

    }
}
