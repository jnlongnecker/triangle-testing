/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.Math;

/**
 *
 * @author Jared
 */
public class Point 
{
    private double x;
    private double y;
    
    public Point(double a, double b)
    {
        x = a; y = b;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getDistanceTo(Point p)
    {
        double a = Math.abs(x - p.getX());
        double b = Math.abs(y - p.getY());
        double distance = Math.sqrt((a*a) + (b*b));
        return distance;
    }
}