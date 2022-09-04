import java.until.*;
class reverse
{
public ststic void main(string args[])
{
int a,r=0,n;
scanner s=new scanner(system.in);
system.out.println(ënter the nymber");
n=s.nextInt();
while(n!=0)
{
a=n%10;
r=r*10+a;
n=n/10;
}
system.out.println("reverse of number "+r);
}
}
