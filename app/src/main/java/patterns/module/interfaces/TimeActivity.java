package patterns.module.interfaces;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class TimeActivity extends Activity implements TimeListener {
    private TimeTask timeTask;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timeTask = new TimeTask();
        timeTask.setTimeListener(this);
    }

    @Override
    public void onUpdate(int seconds) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        timeTask.startTask();
    }

    @Override
    protected void onPause() {
        super.onPause();
        timeTask.stopTask();
    }
}
