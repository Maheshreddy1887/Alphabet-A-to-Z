import java.util.Scanner;
class JavaM
{
public static void main(String[] args)
{
System.out.println("Enter the number of rows");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for (int i=0;i<n ;i++ )
{
for (int j=0;j<n+1 ;j++ )
{
if (j==0||j==n ||(i==j || i+j==n) &&i<n-2)
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