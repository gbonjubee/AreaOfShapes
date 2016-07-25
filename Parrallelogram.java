package com.bee.code.blog.MoreShapes;

import com.bee.code.blog.ShapeCommon.ShapeVariableBean;
import com.bee.code.blog.ShapeController.AllShapesInterface;
import com.bee.code.blog.ShapeController.PolygonController;

/**
 *
 * @author 'beecodeblog
 */
public class Parrallelogram{

    public double doArea(double b, double h) {
        ShapeVariableBean parralParam = new ShapeVariableBean();
        parralParam.setBase(b);
        parralParam.setHeight(h);
        
        AllShapesInterface service=new PolygonController();
        return service.calculateAreaOfShapes(parralParam,"PARRALLELOGRAM");
    }
}
