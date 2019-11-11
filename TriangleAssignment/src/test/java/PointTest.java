/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jared - PC
 */
public class PointTest {
    
    public PointTest() {
    }
    
    @Test
    public void testGetX()
    {
        Point p = new Point(2, 2);
        double expected = 2;
        double actual = p.getX();
        assertEquals(expected, actual, 0);
        
        Point p2 = new Point(3.4, 2);
        expected = 3.4;
        actual = p2.getX();
        assertEquals(expected, actual, 0);
    }
    @Test
    public void testGetY()
    {
        Point p = new Point(2, 2);
        double expected = 2;
        double actual = p.getY();
        assertEquals(expected, actual, 0);
        
        Point p2 = new Point(2, 3.4);
        expected = 3.4;
        actual = p2.getY();
        assertEquals(expected, actual, 0);
    }
    @Test
    public void testDistanceTo()
    {
        Point p = new Point (2, 2);
        Point p2 = new Point(4, 2);
        double expected = 2;
        double actual = p.getDistanceTo(p2);
        assertEquals(expected, actual, 0);
        
        Point p3 = new Point(2, 5);
        expected = 3;
        actual = p.getDistanceTo(p3);
        assertEquals(expected, actual, 0);
        
        Point p4 = new Point(6, 5);
        expected = 5;
        actual = p.getDistanceTo(p4);
        assertEquals(expected, actual, 0);
    }
}
