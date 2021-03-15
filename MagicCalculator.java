
class MagicCalculator extends Calculator


{   static double squareRoot (double num)
    {
        num = Math.sqrt(num);
        return num;
    }

    static double sin (double num)
    {
        num = Math.sin(num);
        return num;
    }
    
    static double cosine (double num)
    {
        num = Math.cos(num);
        return num;
    }
    
    static double tangent (double num)
    {
        num = Math.tan(num);
        return num;
    }
    
    static long factorial (long num)
    {
    int i,fact=1;  
       
    for(i=1;i<=num;i++){    
        fact=fact*i;  } 
    return fact;
    }

    public static void main(String[] args)
    {
        System.out.println(squareRoot(49));
        System.out.println(sin(23));
        System.out.println(cosine(14));
        System.out.println(tangent(7));
        System.out.println(factorial(5));
    }

}
