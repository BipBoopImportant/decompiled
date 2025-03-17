package s1;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.layer.a;
import c2.d;
import c2.r;
import c2.s;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5614t;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import p1.C5701G;
import p1.C5702H;
import p1.C5712d0;
import p1.C5732n0;
import p1.C5734o0;
import p1.C5747v0;
import p1.C5749w0;
import p1.C5751x0;
import p1.d1;
import r1.C5815a;
import r1.f;
import s1.C5904b;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J*\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J;\u0010,\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n0)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010\u001b\u001a\u00020?8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR*\u0010R\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\b:\u0010QR0\u0010Z\u001a\u00020S2\u0006\u0010L\u001a\u00020S8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR.\u0010a\u001a\u0004\u0018\u00010[2\b\u0010L\u001a\u0004\u0018\u00010[8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\bE\u0010^\"\u0004\b_\u0010`R0\u0010f\u001a\u00020b2\u0006\u0010L\u001a\u00020b8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bc\u00106\u001a\u0004\bd\u00108\"\u0004\bU\u0010eR*\u0010h\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bg\u0010N\u001a\u0004\bN\u0010P\"\u0004\bB\u0010QR*\u0010k\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bi\u0010N\u001a\u0004\bj\u0010P\"\u0004\bc\u0010QR*\u0010n\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bl\u0010N\u001a\u0004\bm\u0010P\"\u0004\bi\u0010QR*\u0010p\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bV\u0010N\u001a\u0004\bo\u0010P\"\u0004\b<\u0010QR*\u0010t\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bq\u0010N\u001a\u0004\br\u0010P\"\u0004\bs\u0010QR0\u0010x\u001a\u00020u2\u0006\u0010L\u001a\u00020u8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bv\u00106\u001a\u0004\b\u0018\u00108\"\u0004\bw\u0010eR0\u0010|\u001a\u00020u2\u0006\u0010L\u001a\u00020u8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\by\u00106\u001a\u0004\bz\u00108\"\u0004\b{\u0010eR*\u0010~\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b0\u0010N\u001a\u0004\b}\u0010P\"\u0004\bM\u0010QR*\u0010\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bw\u0010N\u001a\u0004\bv\u0010P\"\u0004\bT\u0010QR+\u0010\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010N\u001a\u0004\b@\u0010P\"\u0004\b\\\u0010QR+\u0010\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010N\u001a\u0004\b\u0019\u0010P\"\u0004\bH\u0010QR.\u0010\u0001\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u00138\u0016@VX\u000e¢\u0006\u0015\n\u0004\b\u0019\u0010I\u001a\u0005\b\u0001\u0010\u0015\"\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010IR\u0018\u0010\u0001\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010IR0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bz\u0010U\u001a\u0004\by\u0010W\"\u0004\b6\u0010YR&\u0010\u0001\u001a\u00020\u00138\u0016@\u0016X\u000e¢\u0006\u0015\n\u0004\b{\u0010I\u001a\u0005\b\u0001\u0010\u0015\"\u0006\b\u0001\u0010\u0001R5\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010L\u001a\u0005\u0018\u00010\u00018\u0016@VX\u000e¢\u0006\u0016\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bq\u0010\u0001\"\u0005\bg\u0010\u0001R\u0015\u0010\u0001\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u0015\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Ls1/C;", "Landroidx/compose/ui/graphics/layer/a;", "", "ownerId", "Lp1/o0;", "canvasHolder", "Lr1/a;", "canvasDrawScope", "<init>", "(JLp1/o0;Lr1/a;)V", "LXH/N;", "b", "()V", "Landroid/graphics/RenderNode;", "Ls1/b;", "compositingStrategy", "O", "(Landroid/graphics/RenderNode;I)V", "T", "", "R", "()Z", "S", "", "x", "y", "Lc2/r;", "size", "w", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "H", "(Landroid/graphics/Outline;J)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "Ls1/c;", "layer", "Lkotlin/Function1;", "Lr1/f;", "block", "z", "(Lc2/d;Lc2/t;Ls1/c;LnI/l;)V", "Lp1/n0;", "canvas", "u", "(Lp1/n0;)V", "Landroid/graphics/Matrix;", "D", "()Landroid/graphics/Matrix;", "c", "J", "getOwnerId", "()J", "Lp1/o0;", "d", "Lr1/a;", "e", "Landroid/graphics/RenderNode;", "renderNode", "Lo1/m;", "f", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "", "value", "j", "F", "a", "()F", "(F)V", "alpha", "Lp1/d0;", "k", "I", "q", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Lp1/w0;", "l", "Lp1/w0;", "()Lp1/w0;", "setColorFilter", "(Lp1/w0;)V", "colorFilter", "Lo1/g;", "m", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", "n", "scaleX", "o", "Q", "scaleY", "p", "M", "translationX", "L", "translationY", "r", "K", "G", "shadowElevation", "Lp1/v0;", "s", "v", "ambientShadowColor", "t", "B", "C", "spotShadowColor", "N", "rotationX", "rotationY", "rotationZ", "cameraDistance", "P", "A", "(Z)V", "clip", "clipToBounds", "clipToOutline", "isInvalidated", "E", "Lp1/d1;", "renderEffect", "Lp1/d1;", "()Lp1/d1;", "(Lp1/d1;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.C  reason: case insensitive filesystem */
public final class C5883C implements a {

    /* renamed from: A  reason: collision with root package name */
    private boolean f28857A;

    /* renamed from: B  reason: collision with root package name */
    private int f28858B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f28859C;

    /* renamed from: b  reason: collision with root package name */
    private final long f28860b;

    /* renamed from: c  reason: collision with root package name */
    private final C5734o0 f28861c;

    /* renamed from: d  reason: collision with root package name */
    private final C5815a f28862d;

    /* renamed from: e  reason: collision with root package name */
    private final RenderNode f28863e;

    /* renamed from: f  reason: collision with root package name */
    private long f28864f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f28865g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f28866h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f28867i;

    /* renamed from: j  reason: collision with root package name */
    private float f28868j;

    /* renamed from: k  reason: collision with root package name */
    private int f28869k;

    /* renamed from: l  reason: collision with root package name */
    private C5749w0 f28870l;

    /* renamed from: m  reason: collision with root package name */
    private long f28871m;

    /* renamed from: n  reason: collision with root package name */
    private float f28872n;

    /* renamed from: o  reason: collision with root package name */
    private float f28873o;

    /* renamed from: p  reason: collision with root package name */
    private float f28874p;

    /* renamed from: q  reason: collision with root package name */
    private float f28875q;

    /* renamed from: r  reason: collision with root package name */
    private float f28876r;

    /* renamed from: s  reason: collision with root package name */
    private long f28877s;

    /* renamed from: t  reason: collision with root package name */
    private long f28878t;

    /* renamed from: u  reason: collision with root package name */
    private float f28879u;

    /* renamed from: v  reason: collision with root package name */
    private float f28880v;

    /* renamed from: w  reason: collision with root package name */
    private float f28881w;

    /* renamed from: x  reason: collision with root package name */
    private float f28882x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f28883y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f28884z;

    public C5883C(long j10, C5734o0 o0Var, C5815a aVar) {
        this.f28860b = j10;
        this.f28861c = o0Var;
        this.f28862d = aVar;
        RenderNode a10 = C5614t.a("graphicsLayer");
        this.f28863e = a10;
        this.f28864f = C5673m.f26722b.b();
        boolean unused = a10.setClipToBounds(false);
        C5904b.a aVar2 = C5904b.f28939a;
        O(a10, aVar2.a());
        this.f28868j = 1.0f;
        this.f28869k = C5712d0.f27280a.B();
        this.f28871m = C5667g.f26701b.b();
        this.f28872n = 1.0f;
        this.f28873o = 1.0f;
        C5747v0.a aVar3 = C5747v0.f27350b;
        this.f28877s = aVar3.a();
        this.f28878t = aVar3.a();
        this.f28882x = 8.0f;
        this.f28858B = aVar2.a();
        this.f28859C = true;
    }

    private final void O(RenderNode renderNode, int i10) {
        C5904b.a aVar = C5904b.f28939a;
        if (C5904b.e(i10, aVar.c())) {
            boolean unused = renderNode.setUseCompositingLayer(true, this.f28865g);
            boolean unused2 = renderNode.setHasOverlappingRendering(true);
        } else if (C5904b.e(i10, aVar.b())) {
            boolean unused3 = renderNode.setUseCompositingLayer(false, this.f28865g);
            boolean unused4 = renderNode.setHasOverlappingRendering(false);
        } else {
            boolean unused5 = renderNode.setUseCompositingLayer(false, this.f28865g);
            boolean unused6 = renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean R() {
        if (C5904b.e(t(), C5904b.f28939a.c()) || S()) {
            return true;
        }
        r();
        return false;
    }

    private final boolean S() {
        return !C5712d0.E(q(), C5712d0.f27280a.B()) || h() != null;
    }

    private final void T() {
        if (R()) {
            O(this.f28863e, C5904b.f28939a.c());
        } else {
            O(this.f28863e, t());
        }
    }

    private final void b() {
        boolean z10 = false;
        boolean z11 = P() && !this.f28867i;
        if (P() && this.f28867i) {
            z10 = true;
        }
        if (z11 != this.f28884z) {
            this.f28884z = z11;
            boolean unused = this.f28863e.setClipToBounds(z11);
        }
        if (z10 != this.f28857A) {
            this.f28857A = z10;
            boolean unused2 = this.f28863e.setClipToOutline(z10);
        }
    }

    public void A(boolean z10) {
        this.f28883y = z10;
        b();
    }

    public long B() {
        return this.f28878t;
    }

    public void C(long j10) {
        this.f28878t = j10;
        boolean unused = this.f28863e.setSpotShadowColor(C5751x0.k(j10));
    }

    public Matrix D() {
        Matrix matrix = this.f28866h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f28866h = matrix;
        }
        this.f28863e.getMatrix(matrix);
        return matrix;
    }

    public void E(boolean z10) {
        this.f28859C = z10;
    }

    public float F() {
        return this.f28872n;
    }

    public void G(float f10) {
        this.f28876r = f10;
        boolean unused = this.f28863e.setElevation(f10);
    }

    public void H(Outline outline, long j10) {
        boolean unused = this.f28863e.setOutline(outline);
        this.f28867i = outline != null;
        b();
    }

    public void I(long j10) {
        this.f28871m = j10;
        if (C5668h.d(j10)) {
            boolean unused = this.f28863e.resetPivot();
            return;
        }
        boolean unused2 = this.f28863e.setPivotX(C5667g.m(j10));
        boolean unused3 = this.f28863e.setPivotY(C5667g.n(j10));
    }

    public void J(int i10) {
        this.f28858B = i10;
        T();
    }

    public float K() {
        return this.f28876r;
    }

    public float L() {
        return this.f28875q;
    }

    public float M() {
        return this.f28874p;
    }

    public float N() {
        return this.f28879u;
    }

    public boolean P() {
        return this.f28883y;
    }

    public float Q() {
        return this.f28873o;
    }

    public float a() {
        return this.f28868j;
    }

    public void c() {
        this.f28863e.discardDisplayList();
    }

    public void d(float f10) {
        this.f28868j = f10;
        boolean unused = this.f28863e.setAlpha(f10);
    }

    public void e(float f10) {
        this.f28875q = f10;
        boolean unused = this.f28863e.setTranslationY(f10);
    }

    public float f() {
        return this.f28881w;
    }

    public void g(float f10) {
        this.f28872n = f10;
        boolean unused = this.f28863e.setScaleX(f10);
    }

    public C5749w0 h() {
        return this.f28870l;
    }

    public void i(float f10) {
        this.f28882x = f10;
        boolean unused = this.f28863e.setCameraDistance(f10);
    }

    public void j(float f10) {
        this.f28879u = f10;
        boolean unused = this.f28863e.setRotationX(f10);
    }

    public void k(float f10) {
        this.f28880v = f10;
        boolean unused = this.f28863e.setRotationY(f10);
    }

    public void l(float f10) {
        this.f28881w = f10;
        boolean unused = this.f28863e.setRotationZ(f10);
    }

    public void m(float f10) {
        this.f28873o = f10;
        boolean unused = this.f28863e.setScaleY(f10);
    }

    public void n(d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            C5895O.f28930a.a(this.f28863e, d1Var);
        }
    }

    public void o(float f10) {
        this.f28874p = f10;
        boolean unused = this.f28863e.setTranslationX(f10);
    }

    public boolean p() {
        return this.f28863e.hasDisplayList();
    }

    public int q() {
        return this.f28869k;
    }

    public d1 r() {
        return null;
    }

    public float s() {
        return this.f28880v;
    }

    public int t() {
        return this.f28858B;
    }

    public void u(C5732n0 n0Var) {
        C5702H.d(n0Var).drawRenderNode(this.f28863e);
    }

    public void v(long j10) {
        this.f28877s = j10;
        boolean unused = this.f28863e.setAmbientShadowColor(C5751x0.k(j10));
    }

    public void w(int i10, int i11, long j10) {
        boolean unused = this.f28863e.setPosition(i10, i11, r.h(j10) + i10, r.g(j10) + i11);
        this.f28864f = s.d(j10);
    }

    public long x() {
        return this.f28877s;
    }

    public float y() {
        return this.f28882x;
    }

    /* JADX INFO: finally extract failed */
    public void z(d dVar, t tVar, C5905c cVar, C17642l<? super f, C16807N> lVar) {
        RecordingCanvas a10 = this.f28863e.beginRecording();
        try {
            C5734o0 o0Var = this.f28861c;
            Canvas a11 = o0Var.a().a();
            o0Var.a().b(a10);
            C5701G a12 = o0Var.a();
            r1.d I12 = this.f28862d.I1();
            I12.a(dVar);
            I12.d(tVar);
            I12.i(cVar);
            I12.g(this.f28864f);
            I12.f(a12);
            lVar.invoke(this.f28862d);
            o0Var.a().b(a11);
            this.f28863e.endRecording();
            E(false);
        } catch (Throwable th2) {
            this.f28863e.endRecording();
            throw th2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5883C(long j10, C5734o0 o0Var, C5815a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? new C5734o0() : o0Var, (i10 & 4) != 0 ? new C5815a() : aVar);
    }
}
