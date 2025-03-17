package n0;

import G1.C4507j;
import G1.C4509l;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import y1.C6255c;
import y1.C6256d;
import y1.C6258f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\f8@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\u0001*\u00020\f8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0018\u0010\u0013\u001a\u00020\u0001*\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"LG1/j;", "", "c", "(LG1/j;)Z", "Landroid/view/View;", "e", "(Landroid/view/View;)Z", "", "a", "J", "()J", "TapIndicationDelay", "Ly1/b;", "f", "(Landroid/view/KeyEvent;)Z", "isPress", "b", "isClick", "d", "isEnter", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.k  reason: case insensitive filesystem */
public final class C5605k {

    /* renamed from: a  reason: collision with root package name */
    private static final long f26462a = ((long) ViewConfiguration.getTapTimeout());

    public static final long a() {
        return f26462a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        return C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.b()) && d(keyEvent);
    }

    public static final boolean c(C4507j jVar) {
        return e(C4509l.a(jVar));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int b10 = C6258f.b(C6256d.a(keyEvent));
        return b10 == 23 || b10 == 66 || b10 == 160;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.a()) && d(keyEvent);
    }
}
