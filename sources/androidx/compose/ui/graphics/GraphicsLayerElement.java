package androidx.compose.ui.graphics;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import p1.d1;
import p1.i1;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b3\u00100R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b4\u00100R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00100R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u00100R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00100R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010B\u001a\u0004\bN\u0010DR\u001d\u0010\u0018\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010B\u001a\u0004\bP\u0010DR\u001d\u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010(\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "LG1/V;", "Landroidx/compose/ui/graphics/e;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lp1/i1;", "shape", "", "clip", "Lp1/d1;", "renderEffect", "Lp1/v0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLp1/i1;ZLp1/d1;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/ui/graphics/e;", "node", "LXH/N;", "f", "(Landroidx/compose/ui/graphics/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "F", "getScaleX", "()F", "e", "getScaleY", "getAlpha", "getTranslationX", "g", "getTranslationY", "h", "getShadowElevation", "i", "getRotationX", "j", "getRotationY", "k", "getRotationZ", "l", "getCameraDistance", "m", "J", "getTransformOrigin-SzJe1aQ", "()J", "n", "Lp1/i1;", "getShape", "()Lp1/i1;", "o", "Z", "getClip", "()Z", "p", "getAmbientShadowColor-0d7_KjU", "q", "getSpotShadowColor-0d7_KjU", "r", "I", "getCompositingStrategy--NrFUSI", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class GraphicsLayerElement extends V<e> {
    private final float alpha;

    /* renamed from: d  reason: collision with root package name */
    private final float f18887d;

    /* renamed from: e  reason: collision with root package name */
    private final float f18888e;

    /* renamed from: f  reason: collision with root package name */
    private final float f18889f;

    /* renamed from: g  reason: collision with root package name */
    private final float f18890g;

    /* renamed from: h  reason: collision with root package name */
    private final float f18891h;

    /* renamed from: i  reason: collision with root package name */
    private final float f18892i;

    /* renamed from: j  reason: collision with root package name */
    private final float f18893j;

    /* renamed from: k  reason: collision with root package name */
    private final float f18894k;

    /* renamed from: l  reason: collision with root package name */
    private final float f18895l;

    /* renamed from: m  reason: collision with root package name */
    private final long f18896m;

    /* renamed from: n  reason: collision with root package name */
    private final i1 f18897n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f18898o;

    /* renamed from: p  reason: collision with root package name */
    private final long f18899p;

    /* renamed from: q  reason: collision with root package name */
    private final long f18900q;

    /* renamed from: r  reason: collision with root package name */
    private final int f18901r;

    public /* synthetic */ GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, i1Var, z10, d1Var, j11, j12, i10);
    }

    /* renamed from: c */
    public e a() {
        return new e(this.f18887d, this.f18888e, this.alpha, this.f18889f, this.f18890g, this.f18891h, this.f18892i, this.f18893j, this.f18894k, this.f18895l, this.f18896m, this.f18897n, this.f18898o, (d1) null, this.f18899p, this.f18900q, this.f18901r, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f18887d, graphicsLayerElement.f18887d) == 0 && Float.compare(this.f18888e, graphicsLayerElement.f18888e) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.f18889f, graphicsLayerElement.f18889f) == 0 && Float.compare(this.f18890g, graphicsLayerElement.f18890g) == 0 && Float.compare(this.f18891h, graphicsLayerElement.f18891h) == 0 && Float.compare(this.f18892i, graphicsLayerElement.f18892i) == 0 && Float.compare(this.f18893j, graphicsLayerElement.f18893j) == 0 && Float.compare(this.f18894k, graphicsLayerElement.f18894k) == 0 && Float.compare(this.f18895l, graphicsLayerElement.f18895l) == 0 && f.e(this.f18896m, graphicsLayerElement.f18896m) && C17542s.e(this.f18897n, graphicsLayerElement.f18897n) && this.f18898o == graphicsLayerElement.f18898o && C17542s.e((Object) null, (Object) null) && C5747v0.q(this.f18899p, graphicsLayerElement.f18899p) && C5747v0.q(this.f18900q, graphicsLayerElement.f18900q) && a.e(this.f18901r, graphicsLayerElement.f18901r);
    }

    /* renamed from: f */
    public void b(e eVar) {
        eVar.g(this.f18887d);
        eVar.m(this.f18888e);
        eVar.d(this.alpha);
        eVar.o(this.f18889f);
        eVar.e(this.f18890g);
        eVar.G(this.f18891h);
        eVar.j(this.f18892i);
        eVar.k(this.f18893j);
        eVar.l(this.f18894k);
        eVar.i(this.f18895l);
        eVar.L0(this.f18896m);
        eVar.Z(this.f18897n);
        eVar.A(this.f18898o);
        eVar.n((d1) null);
        eVar.v(this.f18899p);
        eVar.C(this.f18900q);
        eVar.r(this.f18901r);
        eVar.L2();
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Float.hashCode(this.f18887d) * 31) + Float.hashCode(this.f18888e)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.f18889f)) * 31) + Float.hashCode(this.f18890g)) * 31) + Float.hashCode(this.f18891h)) * 31) + Float.hashCode(this.f18892i)) * 31) + Float.hashCode(this.f18893j)) * 31) + Float.hashCode(this.f18894k)) * 31) + Float.hashCode(this.f18895l)) * 31) + f.h(this.f18896m)) * 31) + this.f18897n.hashCode()) * 31) + Boolean.hashCode(this.f18898o)) * 961) + C5747v0.w(this.f18899p)) * 31) + C5747v0.w(this.f18900q)) * 31) + a.f(this.f18901r);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f18887d + ", scaleY=" + this.f18888e + ", alpha=" + this.alpha + ", translationX=" + this.f18889f + ", translationY=" + this.f18890g + ", shadowElevation=" + this.f18891h + ", rotationX=" + this.f18892i + ", rotationY=" + this.f18893j + ", rotationZ=" + this.f18894k + ", cameraDistance=" + this.f18895l + ", transformOrigin=" + f.i(this.f18896m) + ", shape=" + this.f18897n + ", clip=" + this.f18898o + ", renderEffect=" + null + ", ambientShadowColor=" + C5747v0.x(this.f18899p) + ", spotShadowColor=" + C5747v0.x(this.f18900q) + ", compositingStrategy=" + a.g(this.f18901r) + ')';
    }

    private GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10) {
        this.f18887d = f10;
        this.f18888e = f11;
        this.alpha = f12;
        this.f18889f = f13;
        this.f18890g = f14;
        this.f18891h = f15;
        this.f18892i = f16;
        this.f18893j = f17;
        this.f18894k = f18;
        this.f18895l = f19;
        this.f18896m = j10;
        this.f18897n = i1Var;
        this.f18898o = z10;
        this.f18899p = j11;
        this.f18900q = j12;
        this.f18901r = i10;
    }
}
