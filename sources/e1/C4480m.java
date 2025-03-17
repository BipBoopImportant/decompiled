package E1;

import c2.C5267b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LE1/m;", "LE1/H;", "LE1/q;", "measurable", "LE1/s;", "minMax", "LE1/t;", "widthHeight", "<init>", "(LE1/q;LE1/s;LE1/t;)V", "Lc2/b;", "constraints", "LE1/a0;", "i0", "(J)LE1/a0;", "", "height", "g0", "(I)I", "h0", "width", "V", "x", "a", "LE1/q;", "getMeasurable", "()LE1/q;", "b", "LE1/s;", "c", "LE1/t;", "", "h", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E1.m  reason: case insensitive filesystem */
public final class C4480m implements H {

    /* renamed from: a  reason: collision with root package name */
    private final C4484q f5944a;

    /* renamed from: b  reason: collision with root package name */
    private final C4485s f5945b;

    /* renamed from: c  reason: collision with root package name */
    private final C4486t f5946c;

    public C4480m(C4484q qVar, C4485s sVar, C4486t tVar) {
        this.f5944a = qVar;
        this.f5945b = sVar;
        this.f5946c = tVar;
    }

    public int V(int i10) {
        return this.f5944a.V(i10);
    }

    public int g0(int i10) {
        return this.f5944a.g0(i10);
    }

    public Object h() {
        return this.f5944a.h();
    }

    public int h0(int i10) {
        return this.f5944a.h0(i10);
    }

    public a0 i0(long j10) {
        int i10 = 32767;
        if (this.f5946c == C4486t.Width) {
            int h02 = this.f5945b == C4485s.Max ? this.f5944a.h0(C5267b.k(j10)) : this.f5944a.g0(C5267b.k(j10));
            if (C5267b.g(j10)) {
                i10 = C5267b.k(j10);
            }
            return new C4482o(h02, i10);
        }
        int x10 = this.f5945b == C4485s.Max ? this.f5944a.x(C5267b.l(j10)) : this.f5944a.V(C5267b.l(j10));
        if (C5267b.h(j10)) {
            i10 = C5267b.l(j10);
        }
        return new C4482o(i10, x10);
    }

    public int x(int i10) {
        return this.f5944a.x(i10);
    }
}
