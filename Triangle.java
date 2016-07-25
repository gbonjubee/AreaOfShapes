package com.bee.code.blog.MoreShapes;

import com.bee.code.blog.ShapeCommon.ShapeVariableBean;
import com.bee.code.blog.ShapeController.AllShapesInterface;
import com.bee.code.blog.ShapeController.PolygonController;

/**
 *
 * @author 'beecodeblog
 */
public class Triangle {

    public double doArea(double b, double h) {
        ShapeVariableBean triParam = new ShapeVariableBean();
        triParam.setBase(b);
        triParam.setHeight(h);
        AllShapesInterface service=new PolygonController();
        return service.calculateAreaOfShapes(triParam,"TRIANGLE");
       
    }
}
