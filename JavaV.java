import java.util.Scanner;
class JavaV
{
public static void main(String[] args)
{
System.out.println("Enter the number of rows");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for (int i=0;i<n ;i++ )
{
for (int j=0;j<n*2 ;j++ )
{
if (i==j ||i+j==2*n-1)
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