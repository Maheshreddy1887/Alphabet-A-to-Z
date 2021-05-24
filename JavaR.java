import java.util.Scanner;
class JavaR
{
public static void main(String[] args)
{
System.out.println("Enter the number of rows");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for (int i=0;i<n;i++ )
{
for (int j=0;j<n/2+1 ;j++ )
{
if (j==0 || j==i+1|| i+j==n/2+2 || i==(j+n/2))
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