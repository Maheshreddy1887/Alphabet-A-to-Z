import java.util.Scanner;
class JavaY
{
public static void main(String[] args)
{
System.out.println("Enter the number of rows");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for (int i=1;i<=n ;i++ )
{
for (int j=1;j<=n ;j++ )
{
if ((j==i ||j==n-i+1)&&i<=n/2+1||(j==n/2+1 &&i>n/2))
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