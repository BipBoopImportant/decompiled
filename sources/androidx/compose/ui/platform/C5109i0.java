package androidx.compose.ui.platform;

import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.Metadata;
import nI.C17642l;
import p1.C5732n0;
import p1.C5734o0;
import p1.U0;
import p1.d1;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0011J5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00101\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*R\u001c\u00107\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010:\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001c\u0010=\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001c\u0010@\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001c\u0010C\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001c\u0010F\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010*\"\u0004\bE\u0010\u0011R\u001c\u0010I\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010*\"\u0004\bH\u0010\u0011R\u001c\u0010L\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\u001c\u0010O\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001c\u0010R\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R\u001c\u0010U\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001c\u0010X\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00104\"\u0004\bW\u00106R\u001c\u0010[\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\u001c\u0010`\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010c\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\u001c\u0010f\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u00104\"\u0004\be\u00106R\u001e\u0010l\u001a\u0004\u0018\u00010g8&@&X¦\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010]R\"\u0010r\u001a\u00020o8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bp\u0010*\"\u0004\bq\u0010\u0011ø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006sÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/i0;", "", "Landroid/graphics/Outline;", "outline", "LXH/N;", "F", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "s", "(IIII)Z", "offset", "B", "(I)V", "u", "Lp1/o0;", "canvasHolder", "Lp1/U0;", "clipPath", "Lkotlin/Function1;", "Lp1/n0;", "drawBlock", "x", "(Lp1/o0;Lp1/U0;LnI/l;)V", "Landroid/graphics/Matrix;", "matrix", "A", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "f", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "z", "(Z)Z", "c", "()V", "b", "()I", "w", "q", "C", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "g", "(F)V", "scaleX", "getScaleY", "m", "scaleY", "getTranslationX", "o", "translationX", "getTranslationY", "e", "translationY", "J", "t", "elevation", "getAmbientShadowColor", "G", "ambientShadowColor", "getSpotShadowColor", "I", "spotShadowColor", "getRotationZ", "l", "rotationZ", "getRotationX", "j", "rotationX", "getRotationY", "k", "rotationY", "getCameraDistance", "i", "cameraDistance", "getPivotX", "D", "pivotX", "getPivotY", "E", "pivotY", "y", "()Z", "H", "(Z)V", "clipToOutline", "v", "h", "clipToBounds", "a", "d", "alpha", "Lp1/d1;", "getRenderEffect", "()Lp1/d1;", "n", "(Lp1/d1;)V", "renderEffect", "p", "hasDisplayList", "Landroidx/compose/ui/graphics/a;", "getCompositingStrategy--NrFUSI", "r", "compositingStrategy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.i0  reason: case insensitive filesystem */
public interface C5109i0 {
    void A(Matrix matrix);

    void B(int i10);

    int C();

    void D(float f10);

    void E(float f10);

    void F(Outline outline);

    void G(int i10);

    void H(boolean z10);

    void I(int i10);

    float J();

    float a();

    int b();

    void c();

    void d(float f10);

    void e(float f10);

    void f(Canvas canvas);

    void g(float f10);

    int getHeight();

    int getWidth();

    void h(boolean z10);

    void i(float f10);

    void j(float f10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    void n(d1 d1Var);

    void o(float f10);

    boolean p();

    int q();

    void r(int i10);

    boolean s(int i10, int i11, int i12, int i13);

    void t(float f10);

    void u(int i10);

    boolean v();

    int w();

    void x(C5734o0 o0Var, U0 u02, C17642l<? super C5732n0, C16807N> lVar);

    boolean y();

    boolean z(boolean z10);
}
