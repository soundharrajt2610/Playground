import java.util.Scanner;
class Main
{
	public static void main(String[] args)     
    {
      Scanner sc=new Scanner(System.in);
      String n; 
      n=sc.next();
		n=n.replaceAll("[aei]","");
		System.out.println(n);
	}
}

