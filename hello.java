import java.util.Scanner;
public class hello{
public static void main(String[] args)
{
System.out.print("enter the value for adding x: ");
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.print("enter the value for adding  y: ");
Scanner se = new Scanner(System.in);
int y = se.nextInt();
int z = x+y;
System.out.println("answer for x+y: " + z);

System.out.print("enter the value for sub a: ");
Scanner sa = new Scanner(System.in);
int a = sa.nextInt();
System.out.print("enter the value for sub  b: ");
Scanner sb = new Scanner(System.in);
int b = sb.nextInt();
int c = a-b;
System.out.println("answer for a-b: " + c);

System.out.print("enter the value for multi d: ");
Scanner sd = new Scanner(System.in);
int d = sd.nextInt();
System.out.print("enter the value for multi  e: ");
Scanner sw = new Scanner(System.in);
int e = sw.nextInt();
int f = d*e;
System.out.println("answer for d*e: " + f);

System.out.print("enter the value for div g: ");
Scanner sg = new Scanner(System.in);
int g = sg.nextInt();
System.out.print("enter the value for multi  h: ");
Scanner sh = new Scanner(System.in);
int h = sh.nextInt();
int i = g/h;
System.out.println("answer for g/h: " + i);

System.out.print("enter the value for madules j: ");
Scanner sj = new Scanner(System.in);
int j = sj.nextInt();
System.out.print("enter the value for multi  k: ");
Scanner sk = new Scanner(System.in);
int k = sk.nextInt();
int l = j%k;
System.out.println("answer for j%k: " + l);

}

}
