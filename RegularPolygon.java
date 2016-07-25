package com.bee.code.blog.MoreShapes;

import com.bee.code.blog.ShapeCommon.ShapeVariableBean;
import com.bee.code.blog.ShapeController.AllShapesInterface;
import com.bee.code.blog.ShapeController.PolygonController;

/**
 *
 * @author beecodeblog
 */
public class RegularPolygon {

    public double doArea(double a, double p) {
        ShapeVariableBean polyParam = new ShapeVariableBean();
        polyParam.setApothem(a);
        polyParam.setPerimeter(p);
        AllShapesInterface service=new PolygonController();
        return service.calculateAreaOfShapes(polyParam,"OTHERS");
       
    }
}
