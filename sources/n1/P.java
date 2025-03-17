package N1;

import Y1.i;
import c2.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5669i;
import p1.U0;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b#\u0010\"J\u0018\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b.\u0010*J\u001d\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b2\u00103J$\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010K\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b)\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010M\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b.\u0010H\u001a\u0004\bL\u0010JR\u001f\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bO\u0010TR\u0011\u0010W\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0011\u0010Y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010TR\u0011\u0010[\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bZ\u0010:\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"LN1/P;", "", "LN1/O;", "layoutInput", "LN1/n;", "multiParagraph", "Lc2/r;", "size", "<init>", "(LN1/O;LN1/n;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "lineIndex", "u", "(I)I", "", "visibleEnd", "o", "(IZ)I", "", "v", "(I)F", "m", "s", "t", "offset", "q", "vertical", "r", "(F)I", "usePrimaryDirection", "j", "(IZ)F", "LY1/i;", "y", "(I)LY1/i;", "c", "Lo1/g;", "position", "x", "(J)I", "Lo1/i;", "d", "(I)Lo1/i;", "LN1/W;", "C", "(I)J", "e", "start", "end", "Lp1/U0;", "z", "(II)Lp1/U0;", "a", "(LN1/O;J)LN1/P;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LN1/O;", "l", "()LN1/O;", "b", "LN1/n;", "w", "()LN1/n;", "J", "B", "()J", "F", "h", "()F", "firstBaseline", "k", "lastBaseline", "", "f", "Ljava/util/List;", "A", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "g", "didOverflowWidth", "i", "hasVisualOverflow", "n", "lineCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class P {

    /* renamed from: g  reason: collision with root package name */
    public static final int f9400g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final O f9401a;

    /* renamed from: b  reason: collision with root package name */
    private final C4679n f9402b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9403c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9404d;

    /* renamed from: e  reason: collision with root package name */
    private final float f9405e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C5669i> f9406f;

    public /* synthetic */ P(O o10, C4679n nVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, nVar, j10);
    }

    public static /* synthetic */ P b(P p10, O o10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            o10 = p10.f9401a;
        }
        if ((i10 & 2) != 0) {
            j10 = p10.f9403c;
        }
        return p10.a(o10, j10);
    }

    public static /* synthetic */ int p(P p10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return p10.o(i10, z10);
    }

    public final List<C5669i> A() {
        return this.f9406f;
    }

    public final long B() {
        return this.f9403c;
    }

    public final long C(int i10) {
        return this.f9402b.B(i10);
    }

    public final P a(O o10, long j10) {
        return new P(o10, this.f9402b, j10, (DefaultConstructorMarker) null);
    }

    public final i c(int i10) {
        return this.f9402b.c(i10);
    }

    public final C5669i d(int i10) {
        return this.f9402b.d(i10);
    }

    public final C5669i e(int i10) {
        return this.f9402b.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return C17542s.e(this.f9401a, p10.f9401a) && C17542s.e(this.f9402b, p10.f9402b) && r.f(this.f9403c, p10.f9403c) && this.f9404d == p10.f9404d && this.f9405e == p10.f9405e && C17542s.e(this.f9406f, p10.f9406f);
    }

    public final boolean f() {
        return this.f9402b.f() || ((float) r.g(this.f9403c)) < this.f9402b.h();
    }

    public final boolean g() {
        return ((float) r.h(this.f9403c)) < this.f9402b.A();
    }

    public final float h() {
        return this.f9404d;
    }

    public int hashCode() {
        return (((((((((this.f9401a.hashCode() * 31) + this.f9402b.hashCode()) * 31) + r.i(this.f9403c)) * 31) + Float.hashCode(this.f9404d)) * 31) + Float.hashCode(this.f9405e)) * 31) + this.f9406f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i10, boolean z10) {
        return this.f9402b.i(i10, z10);
    }

    public final float k() {
        return this.f9405e;
    }

    public final O l() {
        return this.f9401a;
    }

    public final float m(int i10) {
        return this.f9402b.l(i10);
    }

    public final int n() {
        return this.f9402b.m();
    }

    public final int o(int i10, boolean z10) {
        return this.f9402b.n(i10, z10);
    }

    public final int q(int i10) {
        return this.f9402b.o(i10);
    }

    public final int r(float f10) {
        return this.f9402b.p(f10);
    }

    public final float s(int i10) {
        return this.f9402b.q(i10);
    }

    public final float t(int i10) {
        return this.f9402b.r(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f9401a + ", multiParagraph=" + this.f9402b + ", size=" + r.j(this.f9403c) + ", firstBaseline=" + this.f9404d + ", lastBaseline=" + this.f9405e + ", placeholderRects=" + this.f9406f + ')';
    }

    public final int u(int i10) {
        return this.f9402b.s(i10);
    }

    public final float v(int i10) {
        return this.f9402b.t(i10);
    }

    public final C4679n w() {
        return this.f9402b;
    }

    public final int x(long j10) {
        return this.f9402b.u(j10);
    }

    public final i y(int i10) {
        return this.f9402b.v(i10);
    }

    public final U0 z(int i10, int i11) {
        return this.f9402b.x(i10, i11);
    }

    private P(O o10, C4679n nVar, long j10) {
        this.f9401a = o10;
        this.f9402b = nVar;
        this.f9403c = j10;
        this.f9404d = nVar.g();
        this.f9405e = nVar.k();
        this.f9406f = nVar.y();
    }
}
