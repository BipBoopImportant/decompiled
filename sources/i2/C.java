package I2;

import android.view.MotionEvent;

public final class C {
    public static boolean a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
