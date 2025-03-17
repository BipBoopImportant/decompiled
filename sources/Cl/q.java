package CL;

import android.graphics.PointF;
import android.view.MotionEvent;

public class q {
    public static PointF a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < pointerCount; i10++) {
            f10 += motionEvent.getX(i10);
            f11 += motionEvent.getY(i10);
        }
        float f12 = (float) pointerCount;
        return new PointF(f10 / f12, f11 / f12);
    }

    public static float b(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        if (i10 < motionEvent.getPointerCount()) {
            return motionEvent.getX(i10) + rawX;
        }
        return 0.0f;
    }

    public static float c(MotionEvent motionEvent, int i10) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        if (i10 < motionEvent.getPointerCount()) {
            return motionEvent.getY(i10) + rawY;
        }
        return 0.0f;
    }
}
