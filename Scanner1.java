import java.util.*;
public class Scanner1 {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        String name;
        System.out.println("Enter Your Name::");
        name= sc.nextLine();
        System.out.println("Name: "+ name);
        sc.close();



    }
    
}
