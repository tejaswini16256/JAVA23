

class Cmdarg3c
{

    public static void main(String [] args)
    {
        if(args.length!=1)
          return;
        StringBuffer a=new StringBuffer(args[0]);
        StringBuffer b=a.reverse();
        String c=new String(b);

        System.out.println(c);
        StringBuffer d=b.append(123);
        System.out.println("data:"+ d);
        
    }
}