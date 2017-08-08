package patterns.module.decorator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class DecoratorActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RedText redText = new RedText();
        redText.getText();

        UnderlinedTextDecorator underlinedTextDecorator = new UnderlinedTextDecorator(new RedText());
        underlinedTextDecorator.getText();

        BoldTextDecorator boldTextDecorator = new BoldTextDecorator(new RedText());
        boldTextDecorator.getText();
    }
}
