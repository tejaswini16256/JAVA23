class Cmdarg
{
    public static void main(String [] args)
    {
        int n=args.length;
        if(n==0)
        {
            System.out.println("invalid argument");
            return;
        }
        int i=0,val=0,max=0;
        while(i<n)
        {
            try
            {
                val=Integer.parseInt(args[i]);
            }
            catch(Exception e)
            {
                i++;
                continue;
            }
            max=(val>max)?val:max;
            i++;
        }
        System.out.println("max: "+max);
    }
}