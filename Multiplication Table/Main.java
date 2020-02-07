import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      int n=sc.nextInt();
      
      //  int i = 2;
        for(int num = 1; num <=n; ++num)
        {
            System.out.printf("%d*%d=%d \n", num, i, num * i);
        }
    }
}