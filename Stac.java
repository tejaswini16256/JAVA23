import javax.swing.*;

class Stac {
    static int top;
    static int arr[];
    static
    {
    arr=new int[5];top=-1;
    }
    static boolean isfull()
    {
        return top==arr.length-1;
    }
    static boolean isempty()
    {
        return top==-1;
    }
    static void push()
    {
        if(isfull())
        {
          JOptionPane.showMessageDialog(null, "overflo");
          return;
        }
        int d=0;
        try
        {
            d = Integer.parseInt(JOptionPane.showInputDialog(null, "data"));
        }
        catch(Exception e)
        {
            return;
        }
        arr[++top]=d;
        
    }
    static void pop()
    {
        if(isempty())
        {
            JOptionPane.showMessageDialog(null, "underflow");
          return;
        }
        top--;
    }
    static void display()
    {
        String str ="stack";
        if(isempty())
        {
            str = str + " " + isempty();
        }
        else
        {
            for(int i=top;i>0;i--)
            {
                str = str + " " + arr[i];
            }
        }
        JOptionPane.showMessageDialog(null,str);
    }
    static void menu()
    {
        String [] choice = new String[]{
            "push","pop", "Display ","exit"};
        int opt=0;
        while(true)
        {
            opt =  JOptionPane.showOptionDialog(null, "choose option","matrix",JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE,null,choice,0 );
            if(opt==4)
            {
                break;
            }
            switch(opt)
            {
                case 0:
                   push();;break;
                case 1:
                  pop();;break;
                case 2:
                  display();break;
                
               

            }
        }

    }
    public static void main(String [] args)
    {
       
        menu();
        
        
    }
 
}
