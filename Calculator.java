
public class Calculator
{
    protected static int addition (int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
    
    protected static int subtraction (int num1, int num2)
    {
        int difference = num1 - num2;
        return difference;
    }
    
    protected static int multiplication (int num1, int num2)
    {
        int product = num1 * num2;
        return product;
    }
    
    protected static int division (int num1, int num2)
    {
        int quotient = num1 / num2;
        return quotient;
    }
    
    protected static int square (int num1)
    {
        int square = num1 * num1;
        return square;
    }
    

    public static void main(String[] args)
    {
        System.out.println(addition(34, 67));
        System.out.println(subtraction (79, 10));
        System.out.println(division(26, 4));
        System.out.println(multiplication(7,6));
        System.out.println(square(12));
      

    }

}
