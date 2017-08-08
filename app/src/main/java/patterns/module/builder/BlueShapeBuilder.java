package patterns.module.builder;

import android.graphics.Color;

class BlueShapeBuilder extends ShapeBuilder {

    @Override
    void setColor() {
        shape.setColor(Color.BLUE);
    }

    @Override
    void setWidth() {
        shape.setWidth(150);
    }

    @Override
    void setHeight() {
        shape.setHeight(150);
    }
}
