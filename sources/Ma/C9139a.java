package Ma;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: Ma.a  reason: case insensitive filesystem */
public class C9139a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f61692a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61693b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61694c;

    /* renamed from: d  reason: collision with root package name */
    private final int f61695d;

    public C9139a(Dialog dialog, Rect rect) {
        this.f61692a = dialog;
        this.f61693b = rect.left;
        this.f61694c = rect.top;
        this.f61695d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f61693b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f61694c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f61695d;
            obtain.setLocation((float) ((-i10) - 1), (float) ((-i10) - 1));
        }
        view.performClick();
        return this.f61692a.onTouchEvent(obtain);
    }
}
