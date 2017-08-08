package patterns.module.nullobject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

class NullObjectActivity extends Activity {

    /*
    * Nie trzeba sprawdzać czy wyszukiwany objekt jest nulem
    * */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseModel test = getModel("test");
        String name = test.getName();
    }

    private static final String[] NAMES = {"TEST1", "TEST2", "TEST3"};

    public BaseModel getModel(String name) {
        for (String NAME : NAMES) {
            if (NAME.equalsIgnoreCase(name)) {
                return new RealModel(name);
            }
        }
        return new NullObjectModel();
    }
}
