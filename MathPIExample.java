public class MathPIExample {
    public static void main(String args[]) {
        int radius = 50;
        // Area = radius*radius*PI
        double area = (radius * radius) * Math.PI;
        System.out.println("Area of circle is " + area);
        // Circumference = PI*radius*2
        double circumference = radius * Math.PI * 2;
        System.out.println("The circumference of the circle is " + circumference);
    }
}


Output

Area of circle is 7853.981633974483
The circumference of the circle is 314.1592653589793
