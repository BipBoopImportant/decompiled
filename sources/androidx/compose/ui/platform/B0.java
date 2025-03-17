package androidx.compose.ui.platform;

import android.view.MotionEvent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/B0;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "", "index", "", "a", "(Landroid/view/MotionEvent;I)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class B0 {

    /* renamed from: a  reason: collision with root package name */
    public static final B0 f19153a = new B0();

    private B0() {
    }

    public final boolean a(MotionEvent motionEvent, int i10) {
        float a10 = motionEvent.getRawX(i10);
        if (!Float.isInfinite(a10) && !Float.isNaN(a10)) {
            float a11 = motionEvent.getRawY(i10);
            return !Float.isInfinite(a11) && !Float.isNaN(a11);
        }
    }
}
