package I0;

import U0.C4899r0;
import U0.p1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R1\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR1\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR1\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR1\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR1\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b!\u0010\u001b\"\u0004\b(\u0010\u001dR1\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR1\u0010\t\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b-\u0010\u001dR1\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001a\u0004\b,\u0010\u001b\"\u0004\b/\u0010\u001dR1\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b1\u0010\u001dR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b'\u0010\u001b\"\u0004\b2\u0010\u001dR1\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b0\u0010\u001b\"\u0004\b3\u0010\u001dR1\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@@X\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b)\u0010\u001b\"\u0004\b4\u0010\u001dR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f8F@@X\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0019\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"LI0/l;", "", "Lp1/v0;", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "", "isLight", "<init>", "(JJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(JJJJJJJJJJJJZ)LI0/l;", "", "toString", "()Ljava/lang/String;", "<set-?>", "LU0/r0;", "j", "()J", "x", "(J)V", "b", "k", "y", "c", "l", "z", "d", "m", "A", "e", "p", "f", "n", "B", "g", "q", "h", "u", "i", "v", "s", "w", "t", "o", "()Z", "r", "(Z)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.l  reason: case insensitive filesystem */
public final class C4568l {

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0 f8218a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f8219b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f8220c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f8221d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f8222e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f8223f;

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f8224g;

    /* renamed from: h  reason: collision with root package name */
    private final C4899r0 f8225h;

    /* renamed from: i  reason: collision with root package name */
    private final C4899r0 f8226i;

    /* renamed from: j  reason: collision with root package name */
    private final C4899r0 f8227j;

    /* renamed from: k  reason: collision with root package name */
    private final C4899r0 f8228k;

    /* renamed from: l  reason: collision with root package name */
    private final C4899r0 f8229l;

    /* renamed from: m  reason: collision with root package name */
    private final C4899r0 f8230m;

    public /* synthetic */ C4568l(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, z10);
    }

    public static /* synthetic */ C4568l b(C4568l lVar, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10, int i10, Object obj) {
        int i11 = i10;
        return lVar.a((i11 & 1) != 0 ? lVar.j() : j10, (i11 & 2) != 0 ? lVar.k() : j11, (i11 & 4) != 0 ? lVar.l() : j12, (i11 & 8) != 0 ? lVar.m() : j13, (i11 & 16) != 0 ? lVar.c() : j14, (i11 & 32) != 0 ? lVar.n() : j15, (i11 & 64) != 0 ? lVar.d() : j16, (i11 & 128) != 0 ? lVar.g() : j17, (i11 & 256) != 0 ? lVar.h() : j18, (i11 & 512) != 0 ? lVar.e() : j19, (i11 & 1024) != 0 ? lVar.i() : j20, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? lVar.f() : j21, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? lVar.o() : z10);
    }

    public final void A(long j10) {
        this.f8221d.setValue(C5747v0.k(j10));
    }

    public final void B(long j10) {
        this.f8223f.setValue(C5747v0.k(j10));
    }

    public final C4568l a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10) {
        return new C4568l(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, z10, (DefaultConstructorMarker) null);
    }

    public final long c() {
        return ((C5747v0) this.f8222e.getValue()).y();
    }

    public final long d() {
        return ((C5747v0) this.f8224g.getValue()).y();
    }

    public final long e() {
        return ((C5747v0) this.f8227j.getValue()).y();
    }

    public final long f() {
        return ((C5747v0) this.f8229l.getValue()).y();
    }

    public final long g() {
        return ((C5747v0) this.f8225h.getValue()).y();
    }

    public final long h() {
        return ((C5747v0) this.f8226i.getValue()).y();
    }

    public final long i() {
        return ((C5747v0) this.f8228k.getValue()).y();
    }

    public final long j() {
        return ((C5747v0) this.f8218a.getValue()).y();
    }

    public final long k() {
        return ((C5747v0) this.f8219b.getValue()).y();
    }

    public final long l() {
        return ((C5747v0) this.f8220c.getValue()).y();
    }

    public final long m() {
        return ((C5747v0) this.f8221d.getValue()).y();
    }

    public final long n() {
        return ((C5747v0) this.f8223f.getValue()).y();
    }

    public final boolean o() {
        return ((Boolean) this.f8230m.getValue()).booleanValue();
    }

    public final void p(long j10) {
        this.f8222e.setValue(C5747v0.k(j10));
    }

    public final void q(long j10) {
        this.f8224g.setValue(C5747v0.k(j10));
    }

    public final void r(boolean z10) {
        this.f8230m.setValue(Boolean.valueOf(z10));
    }

    public final void s(long j10) {
        this.f8227j.setValue(C5747v0.k(j10));
    }

    public final void t(long j10) {
        this.f8229l.setValue(C5747v0.k(j10));
    }

    public String toString() {
        return "Colors(primary=" + C5747v0.x(j()) + ", primaryVariant=" + C5747v0.x(k()) + ", secondary=" + C5747v0.x(l()) + ", secondaryVariant=" + C5747v0.x(m()) + ", background=" + C5747v0.x(c()) + ", surface=" + C5747v0.x(n()) + ", error=" + C5747v0.x(d()) + ", onPrimary=" + C5747v0.x(g()) + ", onSecondary=" + C5747v0.x(h()) + ", onBackground=" + C5747v0.x(e()) + ", onSurface=" + C5747v0.x(i()) + ", onError=" + C5747v0.x(f()) + ", isLight=" + o() + ')';
    }

    public final void u(long j10) {
        this.f8225h.setValue(C5747v0.k(j10));
    }

    public final void v(long j10) {
        this.f8226i.setValue(C5747v0.k(j10));
    }

    public final void w(long j10) {
        this.f8228k.setValue(C5747v0.k(j10));
    }

    public final void x(long j10) {
        this.f8218a.setValue(C5747v0.k(j10));
    }

    public final void y(long j10) {
        this.f8219b.setValue(C5747v0.k(j10));
    }

    public final void z(long j10) {
        this.f8220c.setValue(C5747v0.k(j10));
    }

    private C4568l(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, boolean z10) {
        this.f8218a = p1.i(C5747v0.k(j10), p1.s());
        this.f8219b = p1.i(C5747v0.k(j11), p1.s());
        this.f8220c = p1.i(C5747v0.k(j12), p1.s());
        this.f8221d = p1.i(C5747v0.k(j13), p1.s());
        this.f8222e = p1.i(C5747v0.k(j14), p1.s());
        this.f8223f = p1.i(C5747v0.k(j15), p1.s());
        this.f8224g = p1.i(C5747v0.k(j16), p1.s());
        this.f8225h = p1.i(C5747v0.k(j17), p1.s());
        this.f8226i = p1.i(C5747v0.k(j18), p1.s());
        this.f8227j = p1.i(C5747v0.k(j19), p1.s());
        this.f8228k = p1.i(C5747v0.k(j20), p1.s());
        this.f8229l = p1.i(C5747v0.k(j21), p1.s());
        this.f8230m = p1.i(Boolean.valueOf(z10), p1.s());
    }
}
