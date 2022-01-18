
public class ExceptionHandlingDEmo {
    public static void main(String[] args) {
	
    	int a = 10;
    	int b = 0;
    	int c;
    	//local variables cannot have access modifiers
    	try {
    	c= a/b;
    	System.out.println(" c is "+c);
    	
    	int[] intArr = {1 ,2 ,3 ,4, 5};
    	System.out.println(intArr[10]);
    	}
    	catch(ArithmeticException e) {
    		System.out.println("Value of b cannot be 0");
    	}catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("Invalid array index");
    	}catch(Exception e) {
    		System.out.println("Exception Occured");
    	}finally {
    		System.out.println("Finally Block");
    	}
	}
}

//Stacktrace of exception
// Detailed information of Exception
