package exceptions;

public class Example2
{
    public static void main(String[] args)
    {
	int        i, ratio;
	int[]      numbers = {100,10,-1,5,2,8,-4,30};
	i = 0;
	try
        {
		
	    for (i=0; i < numbers.length-1; i++)
            {
		ratio = numbers[i] / numbers[i+1];
		System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
	    }
	} 
        catch (ArithmeticException ae)
        {
	    System.out.println("Couldn't calculate "+
			       numbers[i]+"/"+numbers[i+1]);
	}
    }
}
