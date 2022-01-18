
public class Armstrongall {
public static void main(String[] arg)
{
int i=100;
double arm;
System.out.println("Armstrong numbers between 100 to 999");
while(i<1000)
{
arm=checkArmstrong(i);
if(arm==i)
System.out.println(i);
i++;
}
}
static double checkArmstrong(int num)
{
	int temp=num;
	int d=0;
	while(temp > 0) {
		temp=temp/10;
		d=d+1;
	}
int x;
double a=0;
while(num!=0)
{
	x=num%10;
	a=a+Math.pow(x, d);
	num/=10 ;
}
return a;
}
}