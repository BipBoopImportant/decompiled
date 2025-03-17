package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/T;", "Landroidx/compose/ui/platform/w1;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "a", "Landroid/view/ViewConfiguration;", "", "c", "()J", "longPressTimeoutMillis", "doubleTapTimeoutMillis", "b", "doubleTapMinTimeMillis", "", "g", "()F", "touchSlop", "d", "handwritingSlop", "f", "maximumFlingVelocity", "h", "handwritingGestureLineMargin", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class T implements w1 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewConfiguration f19333a;

    public T(ViewConfiguration viewConfiguration) {
        this.f19333a = viewConfiguration;
    }

    public long a() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public long b() {
        return 40;
    }

    public long c() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    public float d() {
        return Build.VERSION.SDK_INT >= 34 ? W.f19360a.b(this.f19333a) : super.d();
    }

    public float f() {
        return (float) this.f19333a.getScaledMaximumFlingVelocity();
    }

    public float g() {
        return (float) this.f19333a.getScaledTouchSlop();
    }

    public float h() {
        return Build.VERSION.SDK_INT >= 34 ? W.f19360a.a(this.f19333a) : super.h();
    }
}
