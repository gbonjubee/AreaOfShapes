package com.bee.code.blog.ShapeCommon;

import com.bee.code.blog.MoreShapes.Parrallelogram;
import com.bee.code.blog.MoreShapes.Rectangle;
import com.bee.code.blog.MoreShapes.RegularPolygon;
import com.bee.code.blog.MoreShapes.Square;
import com.bee.code.blog.MoreShapes.Triangle;
import java.util.Scanner;

/**
 *
 * @author 'beecodeblog
 */
public class AreaCalculator {

    public static void main(String[] args) {

        double area = 0.0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome Math Proffessor: Please\n Enter '1' - for Area of Parrallelogram\n Enter '2' - for Area of Rectangle \n Enter '3' - for Area of Square\n Enter '4' - for Area of Triangle  ");
        System.out.println("Enter a number: ");
        final int n = reader.nextInt();

        switch (n) {
            case 1:
                System.out.println("You selected area of a Parrallelogram, Enter 'NO' to terminate and 'YES' to proceed:");
                String parrallelogram = reader.next();
                if (parrallelogram.toUpperCase().equals("YES")) {
                    System.out.println("Enter base value: ");
                    double base = reader.nextDouble();
                    System.out.println("Enter height value: ");
                    double height = reader.nextDouble();
                    area = new Parrallelogram().doArea(base, height);
                    break;
                } else {
                    return;
                }
            case 2:
                System.out.println("You selected area of a Rectangle, Enter 'NO' to terminate and 'YES' to proceed:");
                String rectangle = reader.next();
                if (rectangle.toUpperCase().equals("YES")) {
                    System.out.println("Enter base value: ");
                    double base = reader.nextDouble();
                    System.out.println("Enter height value: ");
                    double height = reader.nextDouble();
                    area = new Rectangle().doArea(base, height);
                    break;
                } else {
                    return;
                }
            case 3:
                System.out.println("You selected area of a Square, Enter 'NO' to terminate and 'YES' to proceed:");
                String square = reader.next();
                if (square.toUpperCase().equals("YES")) {
                    System.out.println("Enter base value: ");
                    double base = reader.nextDouble();
                    System.out.println("Enter height value: ");
                    double height = reader.nextDouble();
                    area = new Square().doArea(base, height);
                    break;
                } else {
                    return;
                }
            case 4:
                System.out.println("You selected area of a Triangle, Enter 'NO' to terminate and 'YES' to proceed:");
                String triangle = reader.next();
                if (triangle.toUpperCase().equals("YES")) {
                    System.out.println("Enter base value: ");
                    double base = reader.nextDouble();
                    System.out.println("Enter height value: ");
                    double height = reader.nextDouble();
                    area = new Triangle().doArea(base, height);
                    break;
                } else {
                    return;
                }
            default:
                System.out.println("You have not selected any option- Is the shape a regular polygon? Enter 'I' for Irregular Polygon , 'R' to Regular Polygon and 'NO' to terminate:");
                String regularPolygon = reader.next();
                if (regularPolygon.toUpperCase().equals("YES")) {
                    System.out.println("Enter base value: ");
                    double base = reader.nextDouble();
                    System.out.println("Enter height value: ");
                    double height = reader.nextDouble();
                    area = new RegularPolygon().doArea(base, height);
                    break;
                } else if (regularPolygon.toUpperCase().equals("NO")) {
                    System.out.println("Sorry, no implementation for Irregular Polygons...");
                    break;
                } else {
                    return;
                }
        }
        System.out.println("Area is : " + area);
    }

}
