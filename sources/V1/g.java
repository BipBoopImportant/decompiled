package V1;

import U0.A1;
import W1.d;
import Y1.k;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import o1.C5667g;
import o1.C5673m;
import p1.C5712d0;
import p1.C5728l0;
import p1.C5751x0;
import p1.S;
import p1.S0;
import p1.T0;
import p1.e1;
import p1.g1;
import r1.f;
import r1.j;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\u00020'8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b0\u0010\n\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0012R*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u001c\u00101\u0012\u0004\b6\u0010\n\u001a\u0004\b2\u00103\"\u0004\b4\u00105R2\u0010?\u001a\u0012\u0012\f\u0012\n\u0018\u000108j\u0004\u0018\u0001`9\u0018\u0001078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R0\u0010F\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0004\b \u0010@\u0012\u0004\bE\u0010\n\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010I\u001a\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010HR*\u0010M\u001a\u00020'2\u0006\u0010J\u001a\u00020'8F@FX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b%\u0010K\"\u0004\b+\u0010L\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"LV1/g;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "LXH/N;", "a", "()V", "LY1/k;", "textDecoration", "i", "(LY1/k;)V", "Lp1/g1;", "shadow", "h", "(Lp1/g1;)V", "Lp1/v0;", "color", "f", "(J)V", "Lp1/l0;", "brush", "Lo1/m;", "size", "alpha", "e", "(Lp1/l0;JF)V", "Lr1/g;", "drawStyle", "g", "(Lr1/g;)V", "Lp1/S0;", "Lp1/S0;", "backingComposePaint", "b", "LY1/k;", "Lp1/d0;", "c", "I", "backingBlendMode", "d", "Lp1/g1;", "getShadow$ui_text_release", "()Lp1/g1;", "setShadow$ui_text_release", "getShadow$ui_text_release$annotations", "Lp1/l0;", "getBrush$ui_text_release", "()Lp1/l0;", "setBrush$ui_text_release", "(Lp1/l0;)V", "getBrush$ui_text_release$annotations", "LU0/A1;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "LU0/A1;", "getShaderState$ui_text_release", "()LU0/A1;", "setShaderState$ui_text_release", "(LU0/A1;)V", "shaderState", "Lo1/m;", "getBrushSize-VsRJwc0$ui_text_release", "()Lo1/m;", "setBrushSize-iaC8Vc4$ui_text_release", "(Lo1/m;)V", "getBrushSize-VsRJwc0$ui_text_release$annotations", "brushSize", "Lr1/g;", "()Lp1/S0;", "composePaint", "value", "()I", "(I)V", "blendMode", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    private S0 f14570a;

    /* renamed from: b  reason: collision with root package name */
    private k f14571b = k.f14792b.c();

    /* renamed from: c  reason: collision with root package name */
    private int f14572c = f.f28623w0.a();

    /* renamed from: d  reason: collision with root package name */
    private g1 f14573d = g1.f27310d.a();

    /* renamed from: e  reason: collision with root package name */
    private C5728l0 f14574e;

    /* renamed from: f  reason: collision with root package name */
    private A1<? extends Shader> f14575f;

    /* renamed from: g  reason: collision with root package name */
    private C5673m f14576g;

    /* renamed from: h  reason: collision with root package name */
    private r1.g f14577h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Shader> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5728l0 f14578c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f14579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5728l0 l0Var, long j10) {
            super(0);
            this.f14578c = l0Var;
            this.f14579d = j10;
        }

        /* renamed from: b */
        public final Shader invoke() {
            return ((e1) this.f14578c).b(this.f14579d);
        }
    }

    public g(int i10, float f10) {
        super(i10);
        this.density = f10;
    }

    private final void a() {
        this.f14575f = null;
        this.f14574e = null;
        this.f14576g = null;
        setShader((Shader) null);
    }

    private final S0 c() {
        S0 s02 = this.f14570a;
        if (s02 != null) {
            return s02;
        }
        S0 b10 = S.b(this);
        this.f14570a = b10;
        return b10;
    }

    public final int b() {
        return this.f14572c;
    }

    public final void d(int i10) {
        if (!C5712d0.E(i10, this.f14572c)) {
            c().e(i10);
            this.f14572c = i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ((r0 == null ? false : o1.C5673m.h(r0.q(), r6)) == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(p1.C5728l0 r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0006
            r4.a()
            goto L_0x006a
        L_0x0006:
            boolean r0 = r5 instanceof p1.j1
            if (r0 == 0) goto L_0x0018
            p1.j1 r5 = (p1.j1) r5
            long r5 = r5.b()
            long r5 = Y1.m.c(r5, r8)
            r4.f(r5)
            goto L_0x006a
        L_0x0018:
            boolean r0 = r5 instanceof p1.e1
            if (r0 == 0) goto L_0x006a
            p1.l0 r0 = r4.f14574e
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r5)
            r1 = 0
            if (r0 == 0) goto L_0x0035
            o1.m r0 = r4.f14576g
            if (r0 != 0) goto L_0x002b
            r0 = r1
            goto L_0x0033
        L_0x002b:
            long r2 = r0.q()
            boolean r0 = o1.C5673m.h(r2, r6)
        L_0x0033:
            if (r0 != 0) goto L_0x0054
        L_0x0035:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
            r1 = 1
        L_0x003f:
            if (r1 == 0) goto L_0x0054
            r4.f14574e = r5
            o1.m r0 = o1.C5673m.c(r6)
            r4.f14576g = r0
            V1.g$a r0 = new V1.g$a
            r0.<init>(r5, r6)
            U0.A1 r5 = U0.p1.e(r0)
            r4.f14575f = r5
        L_0x0054:
            p1.S0 r5 = r4.c()
            U0.A1<? extends android.graphics.Shader> r6 = r4.f14575f
            if (r6 == 0) goto L_0x0063
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            r5.p(r6)
            V1.h.a(r4, r8)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.g.e(p1.l0, long, float):void");
    }

    public final void f(long j10) {
        if (j10 != 16) {
            setColor(C5751x0.k(j10));
            a();
        }
    }

    public final void g(r1.g gVar) {
        if (gVar != null && !C17542s.e(this.f14577h, gVar)) {
            this.f14577h = gVar;
            if (C17542s.e(gVar, j.f28627a)) {
                setStyle(Paint.Style.FILL);
            } else if (gVar instanceof r1.k) {
                c().v(T0.f27248a.b());
                r1.k kVar = (r1.k) gVar;
                c().w(kVar.f());
                c().s(kVar.d());
                c().i(kVar.c());
                c().c(kVar.b());
                c().u(kVar.e());
            }
        }
    }

    public final void h(g1 g1Var) {
        if (g1Var != null && !C17542s.e(this.f14573d, g1Var)) {
            this.f14573d = g1Var;
            if (C17542s.e(g1Var, g1.f27310d.a())) {
                clearShadowLayer();
            } else {
                setShadowLayer(d.b(this.f14573d.b()), C5667g.m(this.f14573d.d()), C5667g.n(this.f14573d.d()), C5751x0.k(this.f14573d.c()));
            }
        }
    }

    public final void i(k kVar) {
        if (kVar != null && !C17542s.e(this.f14571b, kVar)) {
            this.f14571b = kVar;
            k.a aVar = k.f14792b;
            setUnderlineText(kVar.d(aVar.d()));
            setStrikeThruText(this.f14571b.d(aVar.b()));
        }
    }
}
