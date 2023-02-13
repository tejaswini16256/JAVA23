import java.util.*;
import javax.swing.*;

public class Stack2 {
   static int top;
   static int arr[];
  
 static Stack<Integer>obj;
   static void push()
   {
     
    int d=0;
    try
    {
        d=Integer.parseInt(JOptionPane.showInputDialog(null, "data"));
    }
    catch(Exception e){return ;}
    
    obj.push(d);
    }
    static void pop()
    {
        if(obj.empty())
        {
          
        JOptionPane.showMessageDialog(null, "underflow");
        }
        JOptionPane.showMessageDialog(null, "popped element" + obj.pop());
        return;
        

    }
    static void display()
    {
        String str="Stack\n";
       if(obj.empty())
       {
        JOptionPane.showMessageDialog(null, str);

       }
        else
        {
          JOptionPane.showMessageDialog(null,"Stack\n " + obj);
        }
        
    }

    static void menu()
   {
    String []choice=new String[]
    { "Push","Pop","Display","Exit" };
    int opt=0;
    while(true)
    {
        opt=JOptionPane.showOptionDialog(null,"Choose option","Stack Menu:",JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE,null,choice,0);
        if(opt==3)
         break;
        switch (opt) {
            case 1: 
                push(); break;
            case 2: 
               pop(); break;
            
            case 3:
               display(); break;
        
         
        }
    }
}
public static void main(String []args) {
menu();
}
}