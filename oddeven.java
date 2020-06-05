import java.util.*;
public class oddeven
{
    public static void main(String h[]) 
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        double n = x.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The given number "+n+" is Even ");
        }
        else
        {
            System.out.println("The given number "+n+" is Odd ");
	}
    }
}