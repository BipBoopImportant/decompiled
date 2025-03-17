package y1;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0001\u0004\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0015"}, d2 = {"Ly1/b;", "", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "nativeKeyEvent", "b", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "", "e", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", "d", "(Landroid/view/KeyEvent;)I", "other", "", "c", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "a", "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: y1.b  reason: case insensitive filesystem */
public final class C6254b {

    /* renamed from: a  reason: collision with root package name */
    private final KeyEvent f32259a;

    private /* synthetic */ C6254b(KeyEvent keyEvent) {
        this.f32259a = keyEvent;
    }

    public static final /* synthetic */ C6254b a(KeyEvent keyEvent) {
        return new C6254b(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof C6254b) && C17542s.e(keyEvent, ((C6254b) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f32259a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f32259a;
    }

    public int hashCode() {
        return d(this.f32259a);
    }

    public String toString() {
        return e(this.f32259a);
    }
}
