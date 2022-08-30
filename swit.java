import java.util.Scanner;
class swit{
public static void main(String args[])
{
System.out.print("enter any value 10,20,30: ");
Scanner se=new Scanner(System.in);
int x = se.nextInt();
switch(x)
{
case 10:
System.out.println("you enter the num 10");
break;
case 20:
System.out.println("you enter the num 20");
break;
case 30:
System.out.println("you enter the num 30");
break;
default:
System.out.println("you enter the different num");
}
}
}
