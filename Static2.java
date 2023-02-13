
import java.io.*;
import java.util.*;
class Static2{
    static int x[];
    static BufferedReader br;
    static
    {
        x =  new int[5];
        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        catch(Exception e){}
    }

static void input()
{
    for(int i=0;i<x.length;i++)
    {
        try
        {
            x[i]=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {x[i]=0;} 
    }
   
}
static int total()
{
    int i=1,tot=x[0];
    
    while(i<x.length)
    {
        tot+=x[i++];
    }
    return tot;
   
}
static int display()
{
    return total()/x.length;
}
static int avg()
{
    return total()/x.length;
}
static void search()
{
    int sv=0;
    System.out.println("search value");
    try
    {
        sv=Integer.parseInt(br.readLine());
    }
    catch(Exception e){return;}
    Arrays.sort(x);
    if(Arrays.binarySearch(x,sv)<0)
    {
        System.out.println("not found");
    }
    else
    {
        System.out.println(" found");
    }
}


public static void  main(String [] args) {
    input();
    String a="data:\n" + Arrays.toString(x) + "\n total:" + total() + "\n avg:" + avg();
    System.out.println(a);
    search();
    
}
}
