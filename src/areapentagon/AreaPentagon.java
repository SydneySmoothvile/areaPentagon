 
package areapentagon;
import java.util.Scanner;
public class AreaPentagon {

    public static void main(String[] args) {
       Scanner fig = new Scanner(System.in);
       int side = fig.nextInt();
              System.out.println("Enter the number of sides of the pentagon: ");
              
              System.out.println("The area of the pentagon is: " +area(side));
                        }
    
    public static double area(int side){
        return  ((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5)));
    }
    
}
