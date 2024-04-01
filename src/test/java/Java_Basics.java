import org.testng.Assert;
import org.testng.annotations.Test;

public class Java_Basics
{
    @Test (priority = 1)
    void reverse_a_number()
    {
        int number = 987654, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        Assert.assertEquals(reverse,456789);
        System.out.println("The reverse of the given number is: " + reverse);
    }

    @Test (priority = 2)
    void factorial_function()
    {
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        Assert.assertTrue(fact==120);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
