
import java.lang.Math;

/**
 *
 * @author Jared Longnecker
 * UHID 1494285
 */
public class Triangle 
{
    private double sideA;
    private double sideB;
    private double sideC;
    private double semiPer;
    private boolean isRight;
    private String type;
    
    public Triangle(double a, double b, double c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
        if(!whatType())
        {
            System.out.println("An invalid triangle was input. Creating default 3 4 5 triangle.");
            sideA = 3;
            sideB = 4;
            sideC = 5;
            whatType();
        }
        semiPer = (sideA + sideB + sideC)/2;
    }
    public Triangle(Point a, Point b, Point c)
    {
        sideA = a.getDistanceTo(b);
        sideB = a.getDistanceTo(c);
        sideC = b.getDistanceTo(c);
        if(!whatType())
        {
            System.out.println("An invalid triangle was input. Creating default 3 4 5 triangle.");
            sideA = 3;
            sideB = 4;
            sideC = 5;
            whatType();
        }
        semiPer = (sideA + sideB + sideC)/2;
    }
    private boolean whatType()
    {
        if( 
                (sideA+sideB) <= sideC ||
                (sideA+sideC) <= sideB ||
                (sideB+sideC) <= sideA /*||
                sideA <= 0 || sideB <= 0 || sideC <= 0*/
           )
        {
            return false;
        }
        else if(sideA == sideB && sideB == sideC)
        {
            type = "Equilateral";
        }
        else if(sideA != sideB && sideB != sideC && sideA != sideC)
        {
            type = "Scalene";
        }
        else
        {
            type = "Isosceles";
        }
        
        if(sideA > sideB && sideA > sideC)
        {
            isRight = (sideA*sideA == (sideB*sideB + sideC*sideC));
        }
        else if(sideB > sideA && sideB > sideC)
        {
            isRight = (sideB*sideB == (sideA*sideA + sideC*sideC));
        }
        else
        {
            isRight = (sideC*sideC == (sideA*sideA + sideB*sideB));
        }
        return true;
    }
    
    public double getArea()
    {
        return Math.sqrt(semiPer*(semiPer - sideA)*(semiPer - sideB)*(semiPer - sideC));
    }
    public String toString()
    {
        String right;
        if(isRight)
            right = "a Right";
        else
            right = "not a Right";
        return "This Triangle is " + right + " Triangle and is a(n) " + type + " Triangle.";
    }
}