package patterns.module.singleton;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class SingletonActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Singleton singleton = Singleton.getInstance();
    }
}
