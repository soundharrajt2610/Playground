import java.util.Scanner;
class Main
     {
public static void main(String args[])
    {
             int i,n,c;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        if(i%2==0)
        {
          c=(i*i)-2;
          System.out.print(c+" ");
        }
        else
        {
          c=(i*i)-1;
          System.out.print(c+" ");
        }
      }
}
}

