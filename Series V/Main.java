import java.util.*;
class Main
{
 public static void main(String args[])
 {
           int n,a,b;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
      a=11;
      b=0;
       for(int i=0;i<n;i++)
       {
         b=a*a;
        a=a+4;
        System.out.print(b+" ");
       }
 }
}

