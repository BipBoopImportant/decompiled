package androidx.compose.ui.draw;

import G1.V;
import XH.C16807N;
import androidx.compose.ui.graphics.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.C5726k0;
import p1.C5747v0;
import p1.i1;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001d\u0010\u000b\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010/\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "LG1/V;", "Lp1/k0;", "Lc2/h;", "elevation", "Lp1/i1;", "shape", "", "clip", "Lp1/v0;", "ambientColor", "spotColor", "<init>", "(FLp1/i1;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "LXH/N;", "f", "()LnI/l;", "c", "()Lp1/k0;", "node", "r", "(Lp1/k0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "F", "j", "()F", "e", "Lp1/i1;", "l", "()Lp1/i1;", "Z", "i", "()Z", "g", "J", "()J", "h", "o", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShadowGraphicsLayerElement extends V<C5726k0> {

    /* renamed from: d  reason: collision with root package name */
    private final float f18773d;

    /* renamed from: e  reason: collision with root package name */
    private final i1 f18774e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f18775f;

    /* renamed from: g  reason: collision with root package name */
    private final long f18776g;

    /* renamed from: h  reason: collision with root package name */
    private final long f18777h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ShadowGraphicsLayerElement f18778c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ShadowGraphicsLayerElement shadowGraphicsLayerElement) {
            super(1);
            this.f18778c = shadowGraphicsLayerElement;
        }

        public final void a(c cVar) {
            cVar.G(cVar.H1(this.f18778c.j()));
            cVar.Z(this.f18778c.l());
            cVar.A(this.f18778c.i());
            cVar.v(this.f18778c.g());
            cVar.C(this.f18778c.o());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, i1 i1Var, boolean z10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i1Var, z10, j10, j11);
    }

    private final C17642l<c, C16807N> f() {
        return new a(this);
    }

    /* renamed from: c */
    public C5726k0 a() {
        return new C5726k0(f());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return h.D(this.f18773d, shadowGraphicsLayerElement.f18773d) && C17542s.e(this.f18774e, shadowGraphicsLayerElement.f18774e) && this.f18775f == shadowGraphicsLayerElement.f18775f && C5747v0.q(this.f18776g, shadowGraphicsLayerElement.f18776g) && C5747v0.q(this.f18777h, shadowGraphicsLayerElement.f18777h);
    }

    public final long g() {
        return this.f18776g;
    }

    public int hashCode() {
        return (((((((h.E(this.f18773d) * 31) + this.f18774e.hashCode()) * 31) + Boolean.hashCode(this.f18775f)) * 31) + C5747v0.w(this.f18776g)) * 31) + C5747v0.w(this.f18777h);
    }

    public final boolean i() {
        return this.f18775f;
    }

    public final float j() {
        return this.f18773d;
    }

    public final i1 l() {
        return this.f18774e;
    }

    public final long o() {
        return this.f18777h;
    }

    /* renamed from: r */
    public void b(C5726k0 k0Var) {
        k0Var.E2(f());
        k0Var.D2();
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + h.F(this.f18773d) + ", shape=" + this.f18774e + ", clip=" + this.f18775f + ", ambientColor=" + C5747v0.x(this.f18776g) + ", spotColor=" + C5747v0.x(this.f18777h) + ')';
    }

    private ShadowGraphicsLayerElement(float f10, i1 i1Var, boolean z10, long j10, long j11) {
        this.f18773d = f10;
        this.f18774e = i1Var;
        this.f18775f = z10;
        this.f18776g = j10;
        this.f18777h = j11;
    }
}
