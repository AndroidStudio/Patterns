package patterns.module.generictype;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.ArrayList;

public class GenericTypeActivity extends Activity {

    /*
    * Pisanie kodu bez wcześniejszej znajomości typów danych
    * Rożne typy danych na liście
    * */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GenericTypeList<BaseModel> genericTypeListBase = new GenericTypeList<>();
        genericTypeListBase.addItem(new ModelB());
        genericTypeListBase.addItem(new ModelA());
        genericTypeListBase.addItem(new BaseModel());

        ArrayList<BaseModel> types = genericTypeListBase.getTypes();
    }
}
