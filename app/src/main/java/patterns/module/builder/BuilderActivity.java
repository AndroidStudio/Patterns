package patterns.module.builder;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class BuilderActivity extends Activity {

    /*
    * Tworzy obiekt oraz dodaje do niego parametry
    * */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buildRedShape();
        buildBlueShape();
    }

    private void buildBlueShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.setShapeBuilder(new BlueShapeBuilder());
        shapeFactory.buildShape();

        Shape shape = shapeFactory.getShape();
        int color = shape.getColor();
        int height = shape.getHeight();
        int width = shape.getWidth();
    }

    private void buildRedShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.setShapeBuilder(new RedShapeBuilder());
        shapeFactory.buildShape();

        Shape shape = shapeFactory.getShape();
        int color = shape.getColor();
        int height = shape.getHeight();
        int width = shape.getWidth();
    }
}
