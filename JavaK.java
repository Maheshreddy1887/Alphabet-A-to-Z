import java.util.Scanner;
class JavaK
{
public static void main(String[] args)
{
System.out.println("Enter the number of rows");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int x=n/2+1;
for (int i=1; i<=n; i++)
{
for (int j=1;j<=n/2+1 ;j++ )
{
if ((j==1||j==x))
{
System.out.print("* ");
}
else
{
System.out.print(" ");
}
}
if(i<=n/2)
{
x--;
}
else
{
x++;
}
System.out.println();
}
}
}