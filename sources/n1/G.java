package N1;

import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U1.e;
import Y1.a;
import Y1.k;
import Y1.n;
import Y1.o;
import androidx.recyclerview.widget.RecyclerView;
import c2.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5728l0;
import p1.C5747v0;
import p1.g1;
import r1.g;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010$J\u001b\u0010&\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b&\u0010'JÈ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u0010.J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u000200H\u0000¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u00105R\u001d\u0010\u0010\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010:\u001a\u0004\bQ\u0010<R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u0010R\u001a\u0004\bE\u0010SR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bO\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b;\u0010W\u001a\u0004\bX\u0010YR\u001d\u0010\u0018\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bA\u0010<R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bG\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b?\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bQ\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bX\u0010c\u001a\u0004\bP\u0010dR\u0017\u0010#\u001a\u00020\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bM\u0010<R\u0013\u0010g\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bI\u0010fR\u0011\u0010j\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\b=\u0010i\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"LN1/G;", "", "LY1/n;", "textForegroundStyle", "Lc2/v;", "fontSize", "LS1/C;", "fontWeight", "LS1/x;", "fontStyle", "LS1/y;", "fontSynthesis", "LS1/m;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LY1/a;", "baselineShift", "LY1/o;", "textGeometricTransform", "LU1/e;", "localeList", "Lp1/v0;", "background", "LY1/k;", "textDecoration", "Lp1/g1;", "shadow", "LN1/D;", "platformStyle", "Lr1/g;", "drawStyle", "<init>", "(LY1/n;JLS1/C;LS1/x;LS1/y;LS1/m;Ljava/lang/String;JLY1/a;LY1/o;LU1/e;JLY1/k;Lp1/g1;LN1/D;Lr1/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "(JJLS1/C;LS1/x;LS1/y;LS1/m;Ljava/lang/String;JLY1/a;LY1/o;LU1/e;JLY1/k;Lp1/g1;LN1/D;Lr1/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "y", "(LN1/G;)LN1/G;", "a", "(JJLS1/C;LS1/x;LS1/y;LS1/m;Ljava/lang/String;JLY1/a;LY1/o;LU1/e;JLY1/k;Lp1/g1;LN1/D;Lr1/g;)LN1/G;", "", "equals", "(Ljava/lang/Object;)Z", "v", "(LN1/G;)Z", "w", "", "hashCode", "()I", "x", "toString", "()Ljava/lang/String;", "LY1/n;", "t", "()LY1/n;", "b", "J", "k", "()J", "c", "LS1/C;", "n", "()LS1/C;", "d", "LS1/x;", "l", "()LS1/x;", "e", "LS1/y;", "m", "()LS1/y;", "f", "LS1/m;", "i", "()LS1/m;", "g", "Ljava/lang/String;", "j", "h", "o", "LY1/a;", "()LY1/a;", "LY1/o;", "u", "()LY1/o;", "LU1/e;", "p", "()LU1/e;", "LY1/k;", "s", "()LY1/k;", "Lp1/g1;", "r", "()Lp1/g1;", "LN1/D;", "q", "()LN1/D;", "Lr1/g;", "()Lr1/g;", "Lp1/l0;", "()Lp1/l0;", "brush", "", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final n f9358a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9359b;

    /* renamed from: c  reason: collision with root package name */
    private final C f9360c;

    /* renamed from: d  reason: collision with root package name */
    private final C4830x f9361d;

    /* renamed from: e  reason: collision with root package name */
    private final C4831y f9362e;

    /* renamed from: f  reason: collision with root package name */
    private final C4820m f9363f;

    /* renamed from: g  reason: collision with root package name */
    private final String f9364g;

    /* renamed from: h  reason: collision with root package name */
    private final long f9365h;

    /* renamed from: i  reason: collision with root package name */
    private final a f9366i;

    /* renamed from: j  reason: collision with root package name */
    private final o f9367j;

    /* renamed from: k  reason: collision with root package name */
    private final e f9368k;

    /* renamed from: l  reason: collision with root package name */
    private final long f9369l;

    /* renamed from: m  reason: collision with root package name */
    private final k f9370m;

    /* renamed from: n  reason: collision with root package name */
    private final g1 f9371n;

    /* renamed from: o  reason: collision with root package name */
    private final D f9372o;

    /* renamed from: p  reason: collision with root package name */
    private final g f9373p;

    public /* synthetic */ G(long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, D d10, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, c10, xVar, yVar, mVar, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, d10, gVar);
    }

    public static /* synthetic */ G b(G g10, long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, D d10, g gVar, int i10, Object obj) {
        G g11 = g10;
        int i11 = i10;
        return g10.a((i11 & 1) != 0 ? g10.g() : j10, (i11 & 2) != 0 ? g11.f9359b : j11, (i11 & 4) != 0 ? g11.f9360c : c10, (i11 & 8) != 0 ? g11.f9361d : xVar, (i11 & 16) != 0 ? g11.f9362e : yVar, (i11 & 32) != 0 ? g11.f9363f : mVar, (i11 & 64) != 0 ? g11.f9364g : str, (i11 & 128) != 0 ? g11.f9365h : j12, (i11 & 256) != 0 ? g11.f9366i : aVar, (i11 & 512) != 0 ? g11.f9367j : oVar, (i11 & 1024) != 0 ? g11.f9368k : eVar, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? g11.f9369l : j13, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? g11.f9370m : kVar, (i11 & 8192) != 0 ? g11.f9371n : g1Var, (i11 & 16384) != 0 ? g11.f9372o : d10, (i11 & 32768) != 0 ? g11.f9373p : gVar);
    }

    public final G a(long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, D d10, g gVar) {
        n b10;
        long j14 = j10;
        if (C5747v0.q(j14, g())) {
            b10 = this.f9358a;
        } else {
            b10 = n.f14805a.b(j14);
        }
        return new G(b10, j11, c10, xVar, yVar, mVar, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, d10, gVar, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.f9358a.a();
    }

    public final long d() {
        return this.f9369l;
    }

    public final a e() {
        return this.f9366i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return v(g10) && w(g10);
    }

    public final C5728l0 f() {
        return this.f9358a.d();
    }

    public final long g() {
        return this.f9358a.b();
    }

    public final g h() {
        return this.f9373p;
    }

    public int hashCode() {
        int w10 = C5747v0.w(g()) * 31;
        C5728l0 f10 = f();
        int i10 = 0;
        int hashCode = (((((w10 + (f10 != null ? f10.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + v.i(this.f9359b)) * 31;
        C c10 = this.f9360c;
        int hashCode2 = (hashCode + (c10 != null ? c10.hashCode() : 0)) * 31;
        C4830x xVar = this.f9361d;
        int g10 = (hashCode2 + (xVar != null ? C4830x.g(xVar.i()) : 0)) * 31;
        C4831y yVar = this.f9362e;
        int i11 = (g10 + (yVar != null ? C4831y.i(yVar.m()) : 0)) * 31;
        C4820m mVar = this.f9363f;
        int hashCode3 = (i11 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        String str = this.f9364g;
        int hashCode4 = (((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + v.i(this.f9365h)) * 31;
        a aVar = this.f9366i;
        int h10 = (hashCode4 + (aVar != null ? a.h(aVar.j()) : 0)) * 31;
        o oVar = this.f9367j;
        int hashCode5 = (h10 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        e eVar = this.f9368k;
        int hashCode6 = (((hashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31) + C5747v0.w(this.f9369l)) * 31;
        k kVar = this.f9370m;
        int hashCode7 = (hashCode6 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        g1 g1Var = this.f9371n;
        int hashCode8 = (hashCode7 + (g1Var != null ? g1Var.hashCode() : 0)) * 31;
        D d10 = this.f9372o;
        int hashCode9 = (hashCode8 + (d10 != null ? d10.hashCode() : 0)) * 31;
        g gVar = this.f9373p;
        if (gVar != null) {
            i10 = gVar.hashCode();
        }
        return hashCode9 + i10;
    }

    public final C4820m i() {
        return this.f9363f;
    }

    public final String j() {
        return this.f9364g;
    }

    public final long k() {
        return this.f9359b;
    }

    public final C4830x l() {
        return this.f9361d;
    }

    public final C4831y m() {
        return this.f9362e;
    }

    public final C n() {
        return this.f9360c;
    }

    public final long o() {
        return this.f9365h;
    }

    public final e p() {
        return this.f9368k;
    }

    public final D q() {
        return this.f9372o;
    }

    public final g1 r() {
        return this.f9371n;
    }

    public final k s() {
        return this.f9370m;
    }

    public final n t() {
        return this.f9358a;
    }

    public String toString() {
        return "SpanStyle(color=" + C5747v0.x(g()) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + v.j(this.f9359b) + ", fontWeight=" + this.f9360c + ", fontStyle=" + this.f9361d + ", fontSynthesis=" + this.f9362e + ", fontFamily=" + this.f9363f + ", fontFeatureSettings=" + this.f9364g + ", letterSpacing=" + v.j(this.f9365h) + ", baselineShift=" + this.f9366i + ", textGeometricTransform=" + this.f9367j + ", localeList=" + this.f9368k + ", background=" + C5747v0.x(this.f9369l) + ", textDecoration=" + this.f9370m + ", shadow=" + this.f9371n + ", platformStyle=" + this.f9372o + ", drawStyle=" + this.f9373p + ')';
    }

    public final o u() {
        return this.f9367j;
    }

    public final boolean v(G g10) {
        if (this == g10) {
            return true;
        }
        return v.e(this.f9359b, g10.f9359b) && C17542s.e(this.f9360c, g10.f9360c) && C17542s.e(this.f9361d, g10.f9361d) && C17542s.e(this.f9362e, g10.f9362e) && C17542s.e(this.f9363f, g10.f9363f) && C17542s.e(this.f9364g, g10.f9364g) && v.e(this.f9365h, g10.f9365h) && C17542s.e(this.f9366i, g10.f9366i) && C17542s.e(this.f9367j, g10.f9367j) && C17542s.e(this.f9368k, g10.f9368k) && C5747v0.q(this.f9369l, g10.f9369l) && C17542s.e(this.f9372o, g10.f9372o);
    }

    public final boolean w(G g10) {
        return C17542s.e(this.f9358a, g10.f9358a) && C17542s.e(this.f9370m, g10.f9370m) && C17542s.e(this.f9371n, g10.f9371n) && C17542s.e(this.f9373p, g10.f9373p);
    }

    public final int x() {
        int i10 = v.i(this.f9359b) * 31;
        C c10 = this.f9360c;
        int i11 = 0;
        int hashCode = (i10 + (c10 != null ? c10.hashCode() : 0)) * 31;
        C4830x xVar = this.f9361d;
        int g10 = (hashCode + (xVar != null ? C4830x.g(xVar.i()) : 0)) * 31;
        C4831y yVar = this.f9362e;
        int i12 = (g10 + (yVar != null ? C4831y.i(yVar.m()) : 0)) * 31;
        C4820m mVar = this.f9363f;
        int hashCode2 = (i12 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        String str = this.f9364g;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + v.i(this.f9365h)) * 31;
        a aVar = this.f9366i;
        int h10 = (hashCode3 + (aVar != null ? a.h(aVar.j()) : 0)) * 31;
        o oVar = this.f9367j;
        int hashCode4 = (h10 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        e eVar = this.f9368k;
        int hashCode5 = (((hashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31) + C5747v0.w(this.f9369l)) * 31;
        D d10 = this.f9372o;
        if (d10 != null) {
            i11 = d10.hashCode();
        }
        return hashCode5 + i11;
    }

    public final G y(G g10) {
        G g11 = g10;
        if (g11 == null) {
            return this;
        }
        return H.b(this, g11.f9358a.b(), g11.f9358a.d(), g11.f9358a.a(), g11.f9359b, g11.f9360c, g11.f9361d, g11.f9362e, g11.f9363f, g11.f9364g, g11.f9365h, g11.f9366i, g11.f9367j, g11.f9368k, g11.f9369l, g11.f9370m, g11.f9371n, g11.f9372o, g11.f9373p);
    }

    public /* synthetic */ G(n nVar, long j10, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j11, a aVar, o oVar, e eVar, long j12, k kVar, g1 g1Var, D d10, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, j10, c10, xVar, yVar, mVar, str, j11, aVar, oVar, eVar, j12, kVar, g1Var, d10, gVar);
    }

    private G(n nVar, long j10, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j11, a aVar, o oVar, e eVar, long j12, k kVar, g1 g1Var, D d10, g gVar) {
        this.f9358a = nVar;
        this.f9359b = j10;
        this.f9360c = c10;
        this.f9361d = xVar;
        this.f9362e = yVar;
        this.f9363f = mVar;
        this.f9364g = str;
        this.f9365h = j11;
        this.f9366i = aVar;
        this.f9367j = oVar;
        this.f9368k = eVar;
        this.f9369l = j12;
        this.f9370m = kVar;
        this.f9371n = g1Var;
        this.f9372o = d10;
        this.f9373p = gVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ G(long r22, long r24, S1.C r26, S1.C4830x r27, S1.C4831y r28, S1.C4820m r29, java.lang.String r30, long r31, Y1.a r33, Y1.o r34, U1.e r35, long r36, Y1.k r38, p1.g1 r39, N1.D r40, r1.g r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            p1.v0$a r1 = p1.C5747v0.f27350b
            long r1 = r1.i()
            goto L_0x000f
        L_0x000d:
            r1 = r22
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            c2.v$a r3 = c2.v.f23057b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r24
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r26
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r27
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r28
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r29
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r30
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            c2.v$a r11 = c2.v.f23057b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r31
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r33
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r34
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r35
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            p1.v0$a r6 = p1.C5747v0.f27350b
            long r16 = r6.i()
            goto L_0x0076
        L_0x0074:
            r16 = r36
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r38
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r39
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r40
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x009b
            r0 = 0
            goto L_0x009d
        L_0x009b:
            r0 = r41
        L_0x009d:
            r20 = 0
            r43 = r20
            r22 = r21
            r23 = r1
            r25 = r3
            r27 = r5
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r16
            r39 = r18
            r40 = r19
            r41 = r6
            r42 = r0
            r22.<init>((long) r23, (long) r25, (S1.C) r27, (S1.C4830x) r28, (S1.C4831y) r29, (S1.C4820m) r30, (java.lang.String) r31, (long) r32, (Y1.a) r34, (Y1.o) r35, (U1.e) r36, (long) r37, (Y1.k) r39, (p1.g1) r40, (N1.D) r41, (r1.g) r42, (kotlin.jvm.internal.DefaultConstructorMarker) r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.G.<init>(long, long, S1.C, S1.x, S1.y, S1.m, java.lang.String, long, Y1.a, Y1.o, U1.e, long, Y1.k, p1.g1, N1.D, r1.g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private G(long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, D d10, g gVar) {
        this(n.f14805a.b(j10), j11, c10, xVar, yVar, mVar, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, d10, gVar, (DefaultConstructorMarker) null);
        long j14 = j11;
    }
}
