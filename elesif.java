import java.util.Scanner;
class elesif{
public static void main(String args[])
{
System.out.print("enter cc of duke bike ");
Scanner se = new Scanner(System.in);
int x = se.nextInt();
if(x==125)
{
System.out.println("bike is duke 125 or rc 125");
}
else if(x==200)
{
System.out.println("bike is duke 200 or rc 200");
}
else if(x==250)
{
System.out.println("bike is duke 250 ");
}
else if(x==390)
{
System.out.println("bike is duke 390 or rc 390 ");
}
else{
System.out.println("no bike in this cc edition");
}
}
}
