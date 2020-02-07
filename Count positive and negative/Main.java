import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b[]=new int[a];
      int z=0;
      int neg=0;
      for(int i=0;i<a;i++)
      {
        b[i]=sc.nextInt();
      }
       for(int i=0;i<a;i++)
       {
         if(b[i]>0)
         {
           z++;
         }
         else
         {
           neg++;
         }
       }
      System.out.println("Number of positive numbers is "+z+" and the number of negative numbers is "+neg);
    }
    }