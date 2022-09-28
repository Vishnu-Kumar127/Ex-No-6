package oops;

import java.util.Scanner;

public class CalculatorDemo2 
{

    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        calculator o=new calculator();
        
        double a,b;
        int c,i=1;
        OUTER:
        while(i<6)
        {
            System.out.println("1.addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
            try
            {
                double h=Math.random();
                double i1=Math.random();
                System.out.print("Enter Your Choice:");
                c=obj.nextInt();
                a=h*5000;
                b=i1*5000;
                    switch(c)
                    {
                        case 1 -> o.add(a, b);
                        case 2 -> o.sub(a, b);
                        case 3 -> o.mul(a, b);
                        case 4 -> o.div(a, b);
                        case 5 -> o.mol(a, b);
                        case 6 -> {
                            break OUTER;
                        }
                    }
            }
            catch(Exception e)
            {
                System.out.println(e+" : Wrong Input");
                if (i!=6)
                {  
                   obj.nextLine();
                }
               
            }
            i++;
        
        }
        System.out.println("Successfully Done!!!!");
    }
    
}
class calculator
{
    double result;
    void add(double n,double v)
    {
        try 
        {
            result=n+v;
            System.out.println("The Addition of "+n+" + "+v+" = "+result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void sub(double n,double v)
    {
        try 
        {
            result=n-v;
            System.out.println("The Substraction of "+n+" - "+v+" = "+result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void mul(double n,double v)
    {
        try 
        {
            result=n*v;
            System.out.println("The Multiplication of "+n+" * "+v+" = "+result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void div(double n,double v)
    {
        try 
        {
            result=n/v;
            System.out.println("The Division of "+n+" / "+v+" = "+result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void mol(double n,double v)
    {
        try 
        {
            result=n%v;
            System.out.println("The Modulus(Remainder) of "+n+" % "+v+" = "+result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}