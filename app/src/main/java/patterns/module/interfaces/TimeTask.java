package patterns.module.interfaces;

import android.os.Handler;

/*
* Co sekunde zwiększa licznik sekund
* */
class TimeTask implements Runnable {

    private final Handler handler = new Handler();

    private TimeListener timeListener = null;

    private int seconds = 0;

    void setTimeListener(TimeListener timeListener) {
        this.timeListener = timeListener;
    }

    @Override
    public void run() {
        seconds++;
        updateListener();
        handler.postDelayed(this, 1000);
    }

    private void updateListener() {
        if (timeListener != null) {
            timeListener.onUpdate(seconds);
        }
    }

    void startTask() {
        handler.postDelayed(this, 1000);
    }

    void stopTask() {
        handler.removeCallbacksAndMessages(null);
    }
}
