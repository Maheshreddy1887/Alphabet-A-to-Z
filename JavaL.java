import java.util.Scanner;
class JavaL
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
if ((j==1||(i==n &&j<=(n/2)+1)))
{
System.out.print("* ");
}
}
System.out.println();
}
}
}