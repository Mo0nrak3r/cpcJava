// Java java.lang.Math class is imported by default

public class Problem1{

    public static void main(String args[])  
    {  
        int diameter_sun = 865000; //miles
        int diameter_earth = 7917; //miles
        int radius_sun = diameter_sun/2;
        int radius_earth = diameter_earth/2;
        double volume_sun = 0.0;
        double volume_earth = 0.0;
        double volume_ratio = 0.0;
        volume_sun = (4/3)*Math.PI*Math.pow(radius_sun,3.0); //miles^3
        volume_earth = (4/3)*Math.PI*Math.pow(radius_earth,3.0); //miles^3
        volume_ratio = volume_sun/volume_earth;

        System.out.println("The volume of the Earth is "+ volume_earth + " cubic miles, the volume of the sun is "+volume_sun+" cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is "+volume_ratio);
    }  
}
/*
OUTPUT:
The volume of the Earth is 1.947947475190844E11 cubic miles, 
the volume of the sun is 2.54160588899484096E17 cubic miles, 
and the ratio of the volume of the Sun to the volume of the Earth is 1304760.9965693941 
*/