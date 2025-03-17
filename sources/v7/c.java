package V7;

import U7.d;
import Y7.l;
import android.graphics.drawable.Drawable;

public abstract class c<T> implements i<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f40455a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40456b;

    /* renamed from: c  reason: collision with root package name */
    private d f40457c;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final d b() {
        return this.f40457c;
    }

    public final void c(h hVar) {
    }

    public void e(Drawable drawable) {
    }

    public void g() {
    }

    public final void h(h hVar) {
        hVar.e(this.f40455a, this.f40456b);
    }

    public final void i(d dVar) {
        this.f40457c = dVar;
    }

    public void k() {
    }

    public void l() {
    }

    public void m(Drawable drawable) {
    }

    public c(int i10, int i11) {
        if (l.u(i10, i11)) {
            this.f40455a = i10;
            this.f40456b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }
}
