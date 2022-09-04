import java.until.*;
class swap2
{
public ststic void main(string args[])
{
int a,b;
scanner s=new scanner(system.in);
system.out.println("enter the 2 nymbers");
a=s.nextInt();
b=s.nextInt();
a=a+b;
b=a-b;
a=a-b;
system.out.println("After swapping"+a+" "+b);
}
}
