import java.util.Scanner;
class JavaP
{
public static void main(String[] args)
{
System.out.println("Enter the number of rows");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int x=(n/2)+1;
for (int i=1;i<=n ;i++ )
{
for (int j=1;j<=n ;j++ )
{
if ((i==1 && j<=x)||j==1||(j==x && i<=x) || (i==x && j<=x))
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