package A1;

import android.view.MotionEvent;
import j0.C5468y;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LA1/h;", "", "Lj0/y;", "LA1/B;", "changes", "LA1/D;", "pointerInputEvent", "<init>", "(Lj0/y;LA1/D;)V", "LA1/A;", "pointerId", "", "a", "(J)Z", "Lj0/y;", "b", "()Lj0/y;", "LA1/D;", "getPointerInputEvent", "()LA1/D;", "c", "Z", "d", "()Z", "e", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.h  reason: case insensitive filesystem */
public final class C4341h {

    /* renamed from: a  reason: collision with root package name */
    private final C5468y<B> f4406a;

    /* renamed from: b  reason: collision with root package name */
    private final D f4407b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4408c;

    public C4341h(C5468y<B> yVar, D d10) {
        this.f4406a = yVar;
        this.f4407b = d10;
    }

    public final boolean a(long j10) {
        E e10;
        List<E> b10 = this.f4407b.b();
        int size = b10.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                e10 = null;
                break;
            }
            e10 = b10.get(i10);
            if (A.d(e10.d(), j10)) {
                break;
            }
            i10++;
        }
        E e11 = e10;
        if (e11 != null) {
            return e11.a();
        }
        return false;
    }

    public final C5468y<B> b() {
        return this.f4406a;
    }

    public final MotionEvent c() {
        return this.f4407b.a();
    }

    public final boolean d() {
        return this.f4408c;
    }

    public final void e(boolean z10) {
        this.f4408c = z10;
    }
}
