import java.until.*;
class employee
{
string name;
int id;
float
result,ass1,ass2,ass3,percentage;
employee()
{
scanner s=new scanner(system.in);
system.out.println(ënter the name,id and 3 markd");
name=s.nextline();
id=s.nextint;()
ass1=s.nextfloat();
ass2=s.nextfloat();
ass3=s.nextfloat();
result=ass1+ass2+ass3;
percentage=(result/300)*100;
system.out.println("Name :"+name);
system.out.println("Employee id :"+id);
system.out.println("Result :"+result);
system.out.println("percentage:"+percentage+"%");
if(percentage>=70)
{
system.out.println("promoted");
}
else
{
system.out.println("not promoted");
}
}
public static void main(string arg[])
{
employee emp=new employee();
}}