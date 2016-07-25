package com.bee.code.blog.ShapeController;

import com.bee.code.blog.ShapeCommon.ShapeVariableBean;

/**
 *
 * @author 'beecodeblog
 */
public class NonPolygonController implements AllShapesInterface {

    public NonPolygonController() {
    }

    @Override
    public double calculateAreaOfShapes(ShapeVariableBean param, String type) {
        double area = 0.0;
        if (type.equalsIgnoreCase("CIRCLE")) {
            area = calculateAreaOfCircle(param);
        } else if (type.equalsIgnoreCase("SPHERE")) {
            area = calculateAreaOfSphere(param);
        } else {
            System.out.println("Sorry, shape not found!!!");
        }

        return area;
    }

    // Area of circle= pie *radius *radius
    private double calculateAreaOfCircle(ShapeVariableBean param) {
        double result = 0.0;
        if (param.getRadius() != 0.0) {
            result = ShapeVariableBean.PIE_VALUE * param.getRadius() * param.getRadius();
        }
        return result;
    }

    //Area of a sphere= 4 * pie *radius * radius
    private double calculateAreaOfSphere(ShapeVariableBean param) {
        double result = 0.0;
        if (param.getRadius() != 0.0) {
            result = 4 * ShapeVariableBean.PIE_VALUE * param.getRadius() * param.getRadius();
        }
        return result;
    }
}
