    import java.lang.Math.*;
    public class Pie {
      public static void main(String[] args) {
       //radius and length
       double radius = 5;
       double len = 15;
       // calculate the area using PI
       double area = radius * radius * Math.PI;
       //and now volume
       double volume = area * len;
       System.out.println("Volume of cylinder is: " + volume);
      }
    }
	
