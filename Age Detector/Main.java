import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        
      Scanner sc = new Scanner(System.in);
      int b= sc.nextInt();
      int cy= sc.nextInt();
      int x=b-cy;
      if(x<0)
      {
        int c = 100-b;
        int d = 100-cy;
        int y = c-d;
        System.out.println(y);
      }
      else
      {
        int c = 100-b;
        int d = cy;
        int y = c+d;
        System.out.println(y);
      }
       
    }
}

