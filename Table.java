class Table
{
    public static void main(String [] args)
    {
        String str = "table\n";
        int n = (int)(Math.random()*100);
        for(int i=0;i<=10;i++)
        {
            str=str + " " +(n*i);
        }
        System.out.println(str);

    }
}