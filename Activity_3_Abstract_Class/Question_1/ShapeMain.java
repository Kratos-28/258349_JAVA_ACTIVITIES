
import java.util.*;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape sha;
        System.out.println("Circle");
        System.out.println("Square");
        System.out.println("Enter the shape");
        String shape=sc.next();
        if(shape.equals("Circle")){
        System.out.print("Enter the radius");
        int s=sc.nextInt();
        Circle c=new Circle();
        sha=c;
        System.out.println("Area of circle " +sha.calculateArea(s));
        }
        else if(shape.equals("Square")){
            System.out.println("Enter the side");
            int side=sc.nextInt();
            Square s=new Square();
            sha=s;
            System.out.println("Area of square"+sha.calculateArea(side));
            
        }
    }    
}
    
