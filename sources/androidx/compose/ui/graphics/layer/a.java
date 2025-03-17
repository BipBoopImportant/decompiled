package androidx.compose.ui.graphics.layer;

import XH.C16807N;
import android.graphics.Matrix;
import android.graphics.Outline;
import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import p1.C5732n0;
import p1.C5747v0;
import p1.C5749w0;
import p1.d1;
import r1.f;
import r1.g;
import s1.C5905c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u0000 02\u00020\u0001:\u00010J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"R\"\u0010(\u001a\u00020#8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010.\u001a\u00020)8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u00104\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u0002058&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u001e\u0010>\u001a\u0004\u0018\u0001098&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u00101\"\u0004\b@\u00103R\u001c\u0010D\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u00101\"\u0004\bC\u00103R\u001c\u0010G\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bE\u00101\"\u0004\bF\u00103R\u001c\u0010J\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bH\u00101\"\u0004\bI\u00103R\u001c\u0010M\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bK\u00101\"\u0004\bL\u00103R\"\u0010P\u001a\u00020N8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0003\u0010+\"\u0004\bO\u0010-R\"\u0010S\u001a\u00020N8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bQ\u0010+\"\u0004\bR\u0010-R\u001c\u0010V\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bT\u00101\"\u0004\bU\u00103R\u001c\u0010Y\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bW\u00101\"\u0004\bX\u00103R\u001c\u0010\\\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bZ\u00101\"\u0004\b[\u00103R\u001c\u0010^\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u00101\"\u0004\b]\u00103R\u001c\u0010d\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010j\u001a\u0004\u0018\u00010e8&@&X¦\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001c\u0010k\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR\u0014\u0010n\u001a\u00020_8VX\u0004¢\u0006\u0006\u001a\u0004\bm\u0010aø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006oÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/a;", "", "", "x", "y", "Lc2/r;", "size", "LXH/N;", "w", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "H", "(Landroid/graphics/Outline;J)V", "Lp1/n0;", "canvas", "u", "(Lp1/n0;)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "Ls1/c;", "layer", "Lkotlin/Function1;", "Lr1/f;", "block", "z", "(Lc2/d;Lc2/t;Ls1/c;LnI/l;)V", "c", "()V", "Landroid/graphics/Matrix;", "D", "()Landroid/graphics/Matrix;", "Ls1/b;", "t", "()I", "J", "(I)V", "compositingStrategy", "Lo1/g;", "getPivotOffset-F1C5BW0", "()J", "I", "(J)V", "pivotOffset", "", "a", "()F", "d", "(F)V", "alpha", "Lp1/d0;", "q", "setBlendMode-s9anfk8", "blendMode", "Lp1/w0;", "h", "()Lp1/w0;", "setColorFilter", "(Lp1/w0;)V", "colorFilter", "F", "g", "scaleX", "Q", "m", "scaleY", "M", "o", "translationX", "L", "e", "translationY", "K", "G", "shadowElevation", "Lp1/v0;", "v", "ambientShadowColor", "B", "C", "spotShadowColor", "N", "j", "rotationX", "s", "k", "rotationY", "f", "l", "rotationZ", "i", "cameraDistance", "", "getClip", "()Z", "A", "(Z)V", "clip", "Lp1/d1;", "r", "()Lp1/d1;", "n", "(Lp1/d1;)V", "renderEffect", "isInvalidated", "E", "p", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0293a f18962a = C0293a.f18963a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/a$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lr1/f;", "LXH/N;", "b", "LnI/l;", "a", "()LnI/l;", "DefaultDrawBlock", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.layer.a$a  reason: collision with other inner class name */
    public static final class C0293a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0293a f18963a = new C0293a();

        /* renamed from: b  reason: collision with root package name */
        private static final C17642l<f, C16807N> f18964b = C0294a.f18965c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.graphics.layer.a$a$a  reason: collision with other inner class name */
        static final class C0294a extends C17544u implements C17642l<f, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0294a f18965c = new C0294a();

            C0294a() {
                super(1);
            }

            public final void a(f fVar) {
                f.q1(fVar, C5747v0.f27350b.h(), 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((f) obj);
                return C16807N.f139792a;
            }
        }

        private C0293a() {
        }

        public final C17642l<f, C16807N> a() {
            return f18964b;
        }
    }

    void A(boolean z10);

    long B();

    void C(long j10);

    Matrix D();

    void E(boolean z10);

    float F();

    void G(float f10);

    void H(Outline outline, long j10);

    void I(long j10);

    void J(int i10);

    float K();

    float L();

    float M();

    float N();

    float Q();

    float a();

    void c();

    void d(float f10);

    void e(float f10);

    float f();

    void g(float f10);

    C5749w0 h();

    void i(float f10);

    void j(float f10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    void n(d1 d1Var);

    void o(float f10);

    boolean p() {
        return true;
    }

    int q();

    d1 r();

    float s();

    int t();

    void u(C5732n0 n0Var);

    void v(long j10);

    void w(int i10, int i11, long j10);

    long x();

    float y();

    void z(d dVar, t tVar, C5905c cVar, C17642l<? super f, C16807N> lVar);
}
