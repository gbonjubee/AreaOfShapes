package com.bee.code.blog.MoreShapes;

import com.bee.code.blog.ShapeCommon.ShapeVariableBean;
import com.bee.code.blog.ShapeController.AllShapesInterface;
import com.bee.code.blog.ShapeController.PolygonController;

/**
 *
 * @author 'beecodeblog
 */
public class Square  {

    public double doArea(double b, double h) {
        ShapeVariableBean squareParam = new ShapeVariableBean();
        squareParam.setLength(h);
        AllShapesInterface service=new PolygonController();
        return service.calculateAreaOfShapes(squareParam,"SQUARE");
       
    }
}
