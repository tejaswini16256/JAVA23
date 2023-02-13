class KBD1
{
    public static void main(String [] args)
    {
        int i=1,uc=0,lc=0,dc=0,oc=0,val=0;
        while(i<=10)
        {
            System.out.println("type a charactere");
           
            try
            {
            System.in.skip(5);//skip over and discards n byte of data from the input string 
            val=System.in.read();
            }
            catch(Exception e)
            {

            }
            if(val>=65 && val<=90)
              uc++;
            else
            {
                if(val>=97 && val<=122)
                  lc++;
                else
                {
                    if(val>=48 && val<=57)
                      dc++;
                    else
                      oc++;
                }
            }
            i++;
        }
        System.out.println("upper:" +uc + "\n lowercase"+lc +"\n digitc:" +dc +"\n other :" + oc);
    }
}