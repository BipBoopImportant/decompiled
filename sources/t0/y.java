package t0;

import U0.C4877g1;
import U0.C4894o0;
import kotlin.Metadata;
import v0.C6128B;
import v0.u;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0017\u0010&\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Lt0/y;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "LXH/N;", "g", "Lt0/r;", "measureResult", "h", "(Lt0/r;)V", "i", "(I)V", "d", "Lt0/l;", "itemProvider", "j", "(Lt0/l;I)I", "<set-?>", "a", "LU0/o0;", "()I", "e", "b", "c", "f", "", "Z", "hadFirstNotEmptyLayout", "Ljava/lang/Object;", "lastKnownFirstItemKey", "Lv0/B;", "Lv0/B;", "()Lv0/B;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final C4894o0 f29310a;

    /* renamed from: b  reason: collision with root package name */
    private final C4894o0 f29311b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29312c;

    /* renamed from: d  reason: collision with root package name */
    private Object f29313d;

    /* renamed from: e  reason: collision with root package name */
    private final C6128B f29314e;

    public y(int i10, int i11) {
        this.f29310a = C4877g1.a(i10);
        this.f29311b = C4877g1.a(i11);
        this.f29314e = new C6128B(i10, 30, 100);
    }

    private final void f(int i10) {
        this.f29311b.g(i10);
    }

    private final void g(int i10, int i11) {
        if (((float) i10) >= 0.0f) {
            e(i10);
            this.f29314e.m(i10);
            f(i11);
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
    }

    public final int a() {
        return this.f29310a.e();
    }

    public final C6128B b() {
        return this.f29314e;
    }

    public final int c() {
        return this.f29311b.e();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f29313d = null;
    }

    public final void e(int i10) {
        this.f29310a.g(i10);
    }

    public final void h(r rVar) {
        s p10 = rVar.p();
        this.f29313d = p10 != null ? p10.getKey() : null;
        if (this.f29312c || rVar.f() > 0) {
            this.f29312c = true;
            int q10 = rVar.q();
            if (((float) q10) >= 0.0f) {
                s p11 = rVar.p();
                g(p11 != null ? p11.getIndex() : 0, q10);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + q10 + ')').toString());
        }
    }

    public final void i(int i10) {
        if (((float) i10) >= 0.0f) {
            f(i10);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
    }

    public final int j(l lVar, int i10) {
        int a10 = u.a(lVar, this.f29313d, i10);
        if (i10 != a10) {
            e(a10);
            this.f29314e.m(i10);
        }
        return a10;
    }
}
