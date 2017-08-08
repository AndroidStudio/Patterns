package patterns.module.builder;

import android.graphics.Color;

class RedShapeBuilder extends ShapeBuilder {

    @Override
    public void setColor() {
        shape.setColor(Color.RED);
    }

    @Override
    public void setWidth() {
        shape.setWidth(100);
    }

    @Override
    public void setHeight() {
        shape.setHeight(100);
    }
}
