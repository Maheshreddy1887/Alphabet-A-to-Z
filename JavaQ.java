import java.util.Scanner;
class JavaQ
{
public static void main(String[] args)
{
System.out.println("Enter the number of rows");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int x=n-n/2+1;
for (int i=1;i<=n ;i++ )
{
for (int j=1;j<=n ;j++ )
{
if (((i==1 || i==x+1)&&j<=x+1)||((j==1|| j==x+1 )&& i<=x+1))
{
System.out.print("* ");
}
else if(j==i && i>=x)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}