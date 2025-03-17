package androidx.compose.ui.platform;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import p1.C5701G;
import p1.C5732n0;
import p1.C5734o0;
import p1.U0;
import p1.d1;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b0\b\u0001\u0018\u0000 w2\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ5\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010:\u001a\u0002088\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u00109R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b;\u00109\u001a\u0004\b6\u0010<\"\u0004\b=\u0010\u001bR\"\u0010\u0013\u001a\u00020\u00118\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010<\"\u0004\b@\u0010\u001bR\"\u0010\u0014\u001a\u00020\u00118\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b,\u00109\u001a\u0004\bA\u0010<\"\u0004\bB\u0010\u001bR\"\u0010\u0015\u001a\u00020\u00118\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bC\u00109\u001a\u0004\bD\u0010<\"\u0004\bE\u0010\u001bR*\u0010L\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u00168\u0016@VX\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bG\u0010KR\u0014\u0010N\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010<R\u0014\u0010P\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010<R$\u0010R\u001a\u0004\u0018\u00010Q8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\\\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\bC\u0010[R$\u0010_\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\b]\u0010Z\"\u0004\b^\u0010[R$\u0010b\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\b`\u0010Z\"\u0004\ba\u0010[R$\u0010d\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\bc\u0010Z\"\u0004\b>\u0010[R$\u0010g\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\be\u0010Z\"\u0004\bf\u0010[R$\u0010j\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00118V@VX\u000e¢\u0006\f\u001a\u0004\bh\u0010<\"\u0004\bi\u0010\u001bR$\u0010l\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00118V@VX\u000e¢\u0006\f\u001a\u0004\bk\u0010<\"\u0004\b9\u0010\u001bR$\u0010o\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\bm\u0010Z\"\u0004\bn\u0010[R$\u0010r\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\bp\u0010Z\"\u0004\bq\u0010[R$\u0010u\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\bs\u0010Z\"\u0004\bt\u0010[R$\u0010x\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\bv\u0010Z\"\u0004\bw\u0010[R$\u0010{\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\by\u0010Z\"\u0004\bz\u0010[R$\u0010~\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\b|\u0010Z\"\u0004\b}\u0010[R&\u0010\u0001\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u00168V@VX\u000e¢\u0006\r\u001a\u0004\b\u0010J\"\u0005\b\u0001\u0010KR%\u0010\u0001\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u000e¢\u0006\f\u001a\u0004\b2\u0010Z\"\u0004\b;\u0010[R-\u0010\u0001\u001a\u0002082\u0006\u0010F\u001a\u0002088V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0001\u0010<\"\u0005\b\u0001\u0010\u001bR\u0016\u0010\u0001\u001a\u00020\u00168VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010J\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/M0;", "Landroidx/compose/ui/platform/i0;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "LXH/N;", "K", "()V", "Landroid/view/RenderNode;", "renderNode", "P", "(Landroid/view/RenderNode;)V", "Landroid/graphics/Outline;", "outline", "F", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "s", "(IIII)Z", "offset", "B", "(I)V", "u", "Lp1/o0;", "canvasHolder", "Lp1/U0;", "clipPath", "Lkotlin/Function1;", "Lp1/n0;", "drawBlock", "x", "(Lp1/o0;Lp1/U0;LnI/l;)V", "Landroid/graphics/Matrix;", "matrix", "A", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "f", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "z", "(Z)Z", "c", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/a;", "I", "internalCompositingStrategy", "d", "()I", "M", "e", "w", "O", "q", "N", "g", "C", "L", "value", "h", "Z", "v", "()Z", "(Z)V", "clipToBounds", "getWidth", "width", "getHeight", "height", "Lp1/d1;", "renderEffect", "Lp1/d1;", "getRenderEffect", "()Lp1/d1;", "n", "(Lp1/d1;)V", "", "getScaleX", "()F", "(F)V", "scaleX", "getScaleY", "m", "scaleY", "getTranslationX", "o", "translationX", "getTranslationY", "translationY", "J", "t", "elevation", "getAmbientShadowColor", "G", "ambientShadowColor", "getSpotShadowColor", "spotShadowColor", "getRotationZ", "l", "rotationZ", "getRotationX", "j", "rotationX", "getRotationY", "k", "rotationY", "getCameraDistance", "i", "cameraDistance", "getPivotX", "D", "pivotX", "getPivotY", "E", "pivotY", "y", "H", "clipToOutline", "alpha", "getCompositingStrategy--NrFUSI", "r", "compositingStrategy", "p", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class M0 implements C5109i0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f19289i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f19290j = 8;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f19291k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f19292l = true;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f19293a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f19294b;

    /* renamed from: c  reason: collision with root package name */
    private int f19295c = androidx.compose.ui.graphics.a.f18902a.a();

    /* renamed from: d  reason: collision with root package name */
    private int f19296d;

    /* renamed from: e  reason: collision with root package name */
    private int f19297e;

    /* renamed from: f  reason: collision with root package name */
    private int f19298f;

    /* renamed from: g  reason: collision with root package name */
    private int f19299g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19300h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/M0$a;", "", "<init>", "()V", "", "needToValidateAccess", "Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public M0(AndroidComposeView androidComposeView) {
        this.f19293a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.f19294b = create;
        if (f19292l) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            P(create);
            K();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f19292l = false;
        }
        if (f19291k) {
            throw new NoClassDefFoundError();
        }
    }

    private final void K() {
        C5092c1.f19426a.a(this.f19294b);
    }

    private final void P(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C5095d1 d1Var = C5095d1.f19439a;
            d1Var.c(renderNode, d1Var.a(renderNode));
            d1Var.d(renderNode, d1Var.b(renderNode));
        }
    }

    public void A(Matrix matrix) {
        this.f19294b.getMatrix(matrix);
    }

    public void B(int i10) {
        M(b() + i10);
        N(q() + i10);
        this.f19294b.offsetLeftAndRight(i10);
    }

    public int C() {
        return this.f19299g;
    }

    public void D(float f10) {
        this.f19294b.setPivotX(f10);
    }

    public void E(float f10) {
        this.f19294b.setPivotY(f10);
    }

    public void F(Outline outline) {
        this.f19294b.setOutline(outline);
    }

    public void G(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C5095d1.f19439a.c(this.f19294b, i10);
        }
    }

    public void H(boolean z10) {
        this.f19294b.setClipToOutline(z10);
    }

    public void I(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C5095d1.f19439a.d(this.f19294b, i10);
        }
    }

    public float J() {
        return this.f19294b.getElevation();
    }

    public void L(int i10) {
        this.f19299g = i10;
    }

    public void M(int i10) {
        this.f19296d = i10;
    }

    public void N(int i10) {
        this.f19298f = i10;
    }

    public void O(int i10) {
        this.f19297e = i10;
    }

    public float a() {
        return this.f19294b.getAlpha();
    }

    public int b() {
        return this.f19296d;
    }

    public void c() {
        K();
    }

    public void d(float f10) {
        this.f19294b.setAlpha(f10);
    }

    public void e(float f10) {
        this.f19294b.setTranslationY(f10);
    }

    public void f(Canvas canvas) {
        C17542s.h(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f19294b);
    }

    public void g(float f10) {
        this.f19294b.setScaleX(f10);
    }

    public int getHeight() {
        return C() - w();
    }

    public int getWidth() {
        return q() - b();
    }

    public void h(boolean z10) {
        this.f19300h = z10;
        this.f19294b.setClipToBounds(z10);
    }

    public void i(float f10) {
        this.f19294b.setCameraDistance(-f10);
    }

    public void j(float f10) {
        this.f19294b.setRotationX(f10);
    }

    public void k(float f10) {
        this.f19294b.setRotationY(f10);
    }

    public void l(float f10) {
        this.f19294b.setRotation(f10);
    }

    public void m(float f10) {
        this.f19294b.setScaleY(f10);
    }

    public void n(d1 d1Var) {
    }

    public void o(float f10) {
        this.f19294b.setTranslationX(f10);
    }

    public boolean p() {
        return this.f19294b.isValid();
    }

    public int q() {
        return this.f19298f;
    }

    public void r(int i10) {
        a.C0292a aVar = androidx.compose.ui.graphics.a.f18902a;
        if (androidx.compose.ui.graphics.a.e(i10, aVar.c())) {
            this.f19294b.setLayerType(2);
            this.f19294b.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i10, aVar.b())) {
            this.f19294b.setLayerType(0);
            this.f19294b.setHasOverlappingRendering(false);
        } else {
            this.f19294b.setLayerType(0);
            this.f19294b.setHasOverlappingRendering(true);
        }
        this.f19295c = i10;
    }

    public boolean s(int i10, int i11, int i12, int i13) {
        M(i10);
        O(i11);
        N(i12);
        L(i13);
        return this.f19294b.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    public void t(float f10) {
        this.f19294b.setElevation(f10);
    }

    public void u(int i10) {
        O(w() + i10);
        L(C() + i10);
        this.f19294b.offsetTopAndBottom(i10);
    }

    public boolean v() {
        return this.f19300h;
    }

    public int w() {
        return this.f19297e;
    }

    public void x(C5734o0 o0Var, U0 u02, C17642l<? super C5732n0, C16807N> lVar) {
        Canvas start = this.f19294b.start(getWidth(), getHeight());
        Canvas a10 = o0Var.a().a();
        o0Var.a().b(start);
        C5701G a11 = o0Var.a();
        if (u02 != null) {
            a11.t();
            C5732n0.o(a11, u02, 0, 2, (Object) null);
        }
        lVar.invoke(a11);
        if (u02 != null) {
            a11.n();
        }
        o0Var.a().b(a10);
        this.f19294b.end(start);
    }

    public boolean y() {
        return this.f19294b.getClipToOutline();
    }

    public boolean z(boolean z10) {
        return this.f19294b.setHasOverlappingRendering(z10);
    }
}
