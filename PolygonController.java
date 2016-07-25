package com.bee.code.blog.ShapeController;

import com.bee.code.blog.ShapeCommon.ShapeVariableBean;

/**
 *
 * @author 'beecodeblog
 */
public class PolygonController implements AllShapesInterface {

    public PolygonController() {
    }
    

    @Override
    public double calculateAreaOfShapes(ShapeVariableBean param, String type) {
        double area = 0.0;
        if (type.equalsIgnoreCase("TRIANGLE")) {
            area = calculateAreaOfTriangle(param);
        } else if (type.equalsIgnoreCase("SQUARE")) {
            area = calculateAreaOfSquare(param);
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            area = calculateAreaOfRectangle(param);
        } else if (type.equalsIgnoreCase("PARRALLELOGRAM")) {
            area = calculateAreaOfParralelogram(param);
        } else {
            area = calculateAreaOfOtherPolygon(param);
        }
        return area;
    }

// Area of a triangle =1/2(bh)
    private double calculateAreaOfTriangle(ShapeVariableBean param) {
        double result = 0.0;
        if (param.getBase() != 0.0 && param.getHeight() != 0.0) {
            result = (0.5) * (param.getBase() * param.getHeight());
        }
        return result;
    }

    // Area of a square =l*l
    private double calculateAreaOfSquare(ShapeVariableBean param) {
        double result = 0.0;
        if (param.getLength() != 0.0) {
            result = (param.getLength() * param.getLength());
        }
        return result;
    }

// Area of a rectangle =lb
    private double calculateAreaOfRectangle(ShapeVariableBean param) {
        double result = 0.0;
        if (param.getBase() != 0.0 && param.getHeight() != 0.0) {
            result = (param.getBase() * param.getHeight());
        }
        return result;
    }

// Area of a parralelogram =bh
    private double calculateAreaOfParralelogram(ShapeVariableBean param) {
        double result = 0.0;
        if (param.getBase() != 0.0 && param.getHeight() != 0.0) {
            result = (param.getBase() * param.getHeight());
        }
        return result;
    }

//Area of a regular polygon= 1/2(pa)
    private double calculateAreaOfOtherPolygon(ShapeVariableBean param) {
        double result = 0.0;
        if (param.getApothem() != 0.0 && param.getPerimeter() != 0.0) {
            result = (0.5) * (param.getApothem() * param.getPerimeter());
        }
        return result;
    }

}
