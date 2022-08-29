import java.util.Scanner;
class nif{
public static void main(String args[])
{
System.out.print("enter the runs in x ");
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.print("enter the runs in y ");
Scanner se = new Scanner(System.in);
int y = se.nextInt();
if(x==0 && y==0)
{
System.out.println("over is median");
}
else
{
System.out.println("over is not an median");
}
}
}
