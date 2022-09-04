import java.until.*;
class armstrong
{
public ststic void main(string args[])
{
int u,l,i;
scanner sc=new scanner(system.in);
system.out.println(ënter the lower limit");
l=sc.nextInt();
for(i=l;i<=u;i++)
{
int r,c=i,s=0;
while(c!=0)
{
r=c%10;
s=s+(r*r*r);
c=c/10;
}
if(s==i)
{
system.out.println(" "+i);
}}
}
}