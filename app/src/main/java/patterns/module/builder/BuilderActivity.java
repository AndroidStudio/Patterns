package patterns.module.builder;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class BuilderActivity extends Activity {

    /*
    * Zarządza procesem budowy obiektu
    * */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buildRedShape();
        buildBlueShape();
    }

    private void buildBlueShape() {
        ShapeCreator shapeCreator = new ShapeCreator();
        shapeCreator.setShapeBuilder(new BlueShapeBuilder());
        shapeCreator.buildShape();

        Shape shape = shapeCreator.getShape();
        int color = shape.getColor();
        int height = shape.getHeight();
        int width = shape.getWidth();
    }

    private void buildRedShape() {
        ShapeCreator shapeCreator = new ShapeCreator();
        shapeCreator.setShapeBuilder(new RedShapeBuilder());
        shapeCreator.buildShape();

        Shape shape = shapeCreator.getShape();
        int color = shape.getColor();
        int height = shape.getHeight();
        int width = shape.getWidth();
    }
}
