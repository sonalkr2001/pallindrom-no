import java.util.Scanner;
class pallin
{
  public static void main(String arg[])
  {
     Scanner sc=new Scanner(System.in);
      int n,n1,r,s=0;
      System.out.println("enter a no");
       n=sc.nextInt();
       n1=n;
       while(n>0)
		{
		   r=n%10;
		   s=(s*10)+r;
		   n=n/10;
		}
	if(n1==s)
	System.out.println("no is pallindrom =" +n1);
	else
	System.out.println("no is not pallindrom=" +n1);
  }
 }
 