package androidx.compose.ui.platform;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import kotlin.Metadata;
import n0.C5614t;
import nI.C17642l;
import p1.C5701G;
import p1.C5732n0;
import p1.C5734o0;
import p1.U0;
import p1.d1;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00107\u001a\u0002058\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u00106R\u0014\u0010\f\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b2\u00108R\u0014\u0010\r\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b9\u00108R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b;\u00108R\u0014\u0010=\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b<\u00108R\u0014\u0010?\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u00108R$\u0010F\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010I\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER$\u0010L\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER$\u0010O\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\bM\u0010C\"\u0004\bN\u0010ER$\u0010R\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER$\u0010U\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b8V@VX\u000e¢\u0006\f\u001a\u0004\bS\u00108\"\u0004\bT\u0010\u0015R$\u0010W\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b8V@VX\u000e¢\u0006\f\u001a\u0004\bV\u00108\"\u0004\b6\u0010\u0015R$\u0010Z\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\bX\u0010C\"\u0004\bY\u0010ER$\u0010]\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\b[\u0010C\"\u0004\b\\\u0010ER$\u0010`\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\b^\u0010C\"\u0004\b_\u0010ER$\u0010c\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\ba\u0010C\"\u0004\bb\u0010ER$\u0010f\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\bd\u0010C\"\u0004\be\u0010ER$\u0010i\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\bg\u0010C\"\u0004\bh\u0010ER$\u0010n\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u00108V@VX\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010q\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u00108V@VX\u000e¢\u0006\f\u001a\u0004\bo\u0010k\"\u0004\bp\u0010mR$\u0010s\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u000e¢\u0006\f\u001a\u0004\b-\u0010C\"\u0004\br\u0010ER(\u0010y\u001a\u0004\u0018\u00010t2\b\u0010A\u001a\u0004\u0018\u00010t8V@VX\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR*\u0010|\u001a\u0002052\u0006\u0010A\u001a\u0002058V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bz\u00108\"\u0004\b{\u0010\u0015R\u0014\u0010~\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b}\u0010k\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006"}, d2 = {"Landroidx/compose/ui/platform/Z0;", "Landroidx/compose/ui/platform/i0;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroid/graphics/Outline;", "outline", "LXH/N;", "F", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "s", "(IIII)Z", "offset", "B", "(I)V", "u", "Lp1/o0;", "canvasHolder", "Lp1/U0;", "clipPath", "Lkotlin/Function1;", "Lp1/n0;", "drawBlock", "x", "(Lp1/o0;Lp1/U0;LnI/l;)V", "Landroid/graphics/Matrix;", "matrix", "A", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "f", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "z", "(Z)Z", "c", "()V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", "b", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/a;", "I", "internalCompositingStrategy", "()I", "w", "q", "C", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "g", "(F)V", "scaleX", "getScaleY", "m", "scaleY", "getTranslationX", "o", "translationX", "getTranslationY", "e", "translationY", "J", "t", "elevation", "getAmbientShadowColor", "G", "ambientShadowColor", "getSpotShadowColor", "spotShadowColor", "getRotationZ", "l", "rotationZ", "getRotationX", "j", "rotationX", "getRotationY", "k", "rotationY", "getCameraDistance", "i", "cameraDistance", "getPivotX", "D", "pivotX", "getPivotY", "E", "pivotY", "y", "()Z", "H", "(Z)V", "clipToOutline", "v", "h", "clipToBounds", "d", "alpha", "Lp1/d1;", "getRenderEffect", "()Lp1/d1;", "n", "(Lp1/d1;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "r", "compositingStrategy", "p", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Z0 implements C5109i0 {

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f19364a;

    /* renamed from: b  reason: collision with root package name */
    private final RenderNode f19365b = C5614t.a("Compose");

    /* renamed from: c  reason: collision with root package name */
    private int f19366c = a.f18902a.a();

    public Z0(AndroidComposeView androidComposeView) {
        this.f19364a = androidComposeView;
    }

    public void A(Matrix matrix) {
        this.f19365b.getMatrix(matrix);
    }

    public void B(int i10) {
        boolean unused = this.f19365b.offsetLeftAndRight(i10);
    }

    public int C() {
        return this.f19365b.getBottom();
    }

    public void D(float f10) {
        boolean unused = this.f19365b.setPivotX(f10);
    }

    public void E(float f10) {
        boolean unused = this.f19365b.setPivotY(f10);
    }

    public void F(Outline outline) {
        boolean unused = this.f19365b.setOutline(outline);
    }

    public void G(int i10) {
        boolean unused = this.f19365b.setAmbientShadowColor(i10);
    }

    public void H(boolean z10) {
        boolean unused = this.f19365b.setClipToOutline(z10);
    }

    public void I(int i10) {
        boolean unused = this.f19365b.setSpotShadowColor(i10);
    }

    public float J() {
        return this.f19365b.getElevation();
    }

    public float a() {
        return this.f19365b.getAlpha();
    }

    public int b() {
        return this.f19365b.getLeft();
    }

    public void c() {
        this.f19365b.discardDisplayList();
    }

    public void d(float f10) {
        boolean unused = this.f19365b.setAlpha(f10);
    }

    public void e(float f10) {
        boolean unused = this.f19365b.setTranslationY(f10);
    }

    public void f(Canvas canvas) {
        canvas.drawRenderNode(this.f19365b);
    }

    public void g(float f10) {
        boolean unused = this.f19365b.setScaleX(f10);
    }

    public int getHeight() {
        return this.f19365b.getHeight();
    }

    public int getWidth() {
        return this.f19365b.getWidth();
    }

    public void h(boolean z10) {
        boolean unused = this.f19365b.setClipToBounds(z10);
    }

    public void i(float f10) {
        boolean unused = this.f19365b.setCameraDistance(f10);
    }

    public void j(float f10) {
        boolean unused = this.f19365b.setRotationX(f10);
    }

    public void k(float f10) {
        boolean unused = this.f19365b.setRotationY(f10);
    }

    public void l(float f10) {
        boolean unused = this.f19365b.setRotationZ(f10);
    }

    public void m(float f10) {
        boolean unused = this.f19365b.setScaleY(f10);
    }

    public void n(d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            C5086a1.f19369a.a(this.f19365b, d1Var);
        }
    }

    public void o(float f10) {
        boolean unused = this.f19365b.setTranslationX(f10);
    }

    public boolean p() {
        return this.f19365b.hasDisplayList();
    }

    public int q() {
        return this.f19365b.getRight();
    }

    public void r(int i10) {
        RenderNode renderNode = this.f19365b;
        a.C0292a aVar = a.f18902a;
        if (a.e(i10, aVar.c())) {
            boolean unused = renderNode.setUseCompositingLayer(true, (Paint) null);
            boolean unused2 = renderNode.setHasOverlappingRendering(true);
        } else if (a.e(i10, aVar.b())) {
            boolean unused3 = renderNode.setUseCompositingLayer(false, (Paint) null);
            boolean unused4 = renderNode.setHasOverlappingRendering(false);
        } else {
            boolean unused5 = renderNode.setUseCompositingLayer(false, (Paint) null);
            boolean unused6 = renderNode.setHasOverlappingRendering(true);
        }
        this.f19366c = i10;
    }

    public boolean s(int i10, int i11, int i12, int i13) {
        return this.f19365b.setPosition(i10, i11, i12, i13);
    }

    public void t(float f10) {
        boolean unused = this.f19365b.setElevation(f10);
    }

    public void u(int i10) {
        boolean unused = this.f19365b.offsetTopAndBottom(i10);
    }

    public boolean v() {
        return this.f19365b.getClipToBounds();
    }

    public int w() {
        return this.f19365b.getTop();
    }

    public void x(C5734o0 o0Var, U0 u02, C17642l<? super C5732n0, C16807N> lVar) {
        RecordingCanvas a10 = this.f19365b.beginRecording();
        Canvas a11 = o0Var.a().a();
        o0Var.a().b(a10);
        C5701G a12 = o0Var.a();
        if (u02 != null) {
            a12.t();
            C5732n0.o(a12, u02, 0, 2, (Object) null);
        }
        lVar.invoke(a12);
        if (u02 != null) {
            a12.n();
        }
        o0Var.a().b(a11);
        this.f19365b.endRecording();
    }

    public boolean y() {
        return this.f19365b.getClipToOutline();
    }

    public boolean z(boolean z10) {
        return this.f19365b.setHasOverlappingRendering(z10);
    }
}
