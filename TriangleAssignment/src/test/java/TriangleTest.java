/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
*/
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jared - PC
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @Test
    public void testGetArea()
    {
        Point a = new Point(0,0);
        Point b = new Point(0,2);
        Point c = new Point(2,0);
        Triangle t = new Triangle(a, b, c);
        double expected = 2;
        double actual = t.getArea();
        assertEquals(expected, actual, 0.1);
        
        b = new Point(6, 0);
        c = new Point(0, 6);
        t = new Triangle(a, b, c);
        expected = 18;
        actual = t.getArea();
        assertEquals(expected, actual, 0.1);
        
        t = new Triangle(3, 4, 5);
        expected = 6;
        actual = t.getArea();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void testTriangleConstruction()
    {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(5, 4, 3);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(3, 5, 4);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(4, 3, 5);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(3, 3, 5);
        assertEquals("This Triangle is not a Right Triangle and is a(n) Isosceles Triangle.", t.toString());
        
        t = new Triangle(4, 3, 3);
        assertEquals("This Triangle is not a Right Triangle and is a(n) Isosceles Triangle.", t.toString());
        
        t = new Triangle(4, 5, 5);
        assertEquals("This Triangle is not a Right Triangle and is a(n) Isosceles Triangle.", t.toString());
        
        t = new Triangle(4, 4, 4);
        assertEquals("This Triangle is not a Right Triangle and is a(n) Equilateral Triangle.", t.toString());
        
        t = new Triangle(1, 1, 8);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(1, 8, 1);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(8, 1, 1);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        Point a = new Point(0,0);
        Point b = new Point(0,2);
        Point c = new Point(0,8);
        t = new Triangle(a, b, c);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(0, 5, 6);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(5,0,6);
        assertEquals("This Triangle is a Right Triangle and is a(n) Scalene Triangle.", t.toString());
        
        t = new Triangle(5,6,5);
        assertEquals("This Triangle is not a Right Triangle and is a(n) Isosceles Triangle.", t.toString());
    }
}
