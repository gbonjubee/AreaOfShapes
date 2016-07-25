package com.bee.code.blog.MoreShapes;

import com.bee.code.blog.ShapeCommon.ShapeVariableBean;
import com.bee.code.blog.ShapeController.AllShapesInterface;
import com.bee.code.blog.ShapeController.PolygonController;

/**
 *
 * @author beecodeblog
 */
public class Rectangle  {

    public double doArea(double b, double h) {
        ShapeVariableBean rectParam = new ShapeVariableBean();
        rectParam.setBase(b);
        rectParam.setHeight(h);
        AllShapesInterface service=new PolygonController();
        return service.calculateAreaOfShapes(rectParam,"RECTANGLE");
       
    }
}
