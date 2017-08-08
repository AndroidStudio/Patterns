package patterns.module.builder;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.Locale;

public class BuilderActivity extends Activity {

    /*
    * Zarządza procesem budowy obiektu
    * */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buildRedShape();
        buildBlueShape();
        fluentBuilder();
    }

    /*
    * fluent builder
    * */
    private void fluentBuilder() {
        Enemy enemy = new Enemy.Builder("Rekin")
                .setColor(Color.BLUE)
                .build();

        int color = enemy.getColor();
    }

    /*
    * budowniczy klasyczny
    * */
    private void buildBlueShape() {
        Director director = new Director();
        director.setShapeBuilder(new BlueShapeBuilder());
        director.buildShape();

        Shape shape = director.getShape();
        int color = shape.getColor();
        int height = shape.getHeight();
        int width = shape.getWidth();
    }

    /*
    * budowniczy klasyczny
    * */
    private void buildRedShape() {
        Director director = new Director();
        director.setShapeBuilder(new RedShapeBuilder());
        director.buildShape();

        Shape shape = director.getShape();
        int color = shape.getColor();
        int height = shape.getHeight();
        int width = shape.getWidth();
    }
}
