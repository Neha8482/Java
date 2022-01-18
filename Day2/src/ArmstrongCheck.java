
public class ArmstrongCheck {

		  public static void main(String[] args)  {  
		    int result=0,a,temp;  
		    int number=153;  
		    temp=number;  
		    while(number>0)  
		    {  
		    a=number % 10;  
		    number = number / 10;  
		    result=result+(a*a*a);  
		    }  
		    if(temp==result)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
}
