package g2;

import c2.c;
import c2.d;
import c2.h;
import c2.t;
import kotlin.Metadata;
import m2.g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010!\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lg2/X;", "Lm2/g;", "Landroidx/constraintlayout/compose/SolverState;", "Lc2/d;", "density", "<init>", "(Lc2/d;)V", "", "value", "", "e", "(Ljava/lang/Object;)I", "l", "Lc2/d;", "getDensity", "()Lc2/d;", "Lc2/b;", "m", "J", "H", "()J", "I", "(J)V", "rootIncomingConstraints", "Lc2/t;", "n", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "setLayoutDirection", "(Lc2/t;)V", "getLayoutDirection$annotations", "()V", "layoutDirection", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class X extends g {

    /* renamed from: l  reason: collision with root package name */
    private final d f23645l;

    /* renamed from: m  reason: collision with root package name */
    private long f23646m = c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: n  reason: collision with root package name */
    private t f23647n = t.Ltr;

    public X(d dVar) {
        this.f23645l = dVar;
        x(new W(this));
    }

    /* access modifiers changed from: private */
    public static final float G(X x10, float f10) {
        return x10.f23645l.getDensity() * f10;
    }

    public final long H() {
        return this.f23646m;
    }

    public final void I(long j10) {
        this.f23646m = j10;
    }

    public int e(Object obj) {
        return obj instanceof h ? this.f23645l.K0(((h) obj).G()) : super.e(obj);
    }
}
