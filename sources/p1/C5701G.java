package p1;

import XH.C16807N;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import c2.n;
import c2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5667g;
import o1.C5669i;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\"\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0014\u0010)\u001a\u00020(*\u00020 ø\u0001\u0000¢\u0006\u0004\b)\u0010*J*\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010/J7\u00100\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101JG\u00104\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105J7\u00106\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00101J*\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:JO\u0010?\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\r2\u0006\u0010>\u001a\u00020=2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010BJ*\u0010F\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJB\u0010N\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020H2\u0006\u0010M\u001a\u00020J2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010\u0003J\u000f\u0010Q\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010\u0003R,\u0010Z\u001a\u00060Rj\u0002`S8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\bT\u0010U\u0012\u0004\bY\u0010\u0003\u001a\u0004\bT\u0010V\"\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010\\\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Lp1/G;", "Lp1/n0;", "<init>", "()V", "LXH/N;", "t", "n", "Lo1/i;", "bounds", "Lp1/S0;", "paint", "i", "(Lo1/i;Lp1/S0;)V", "", "dx", "dy", "d", "(FF)V", "sx", "sy", "f", "degrees", "s", "(F)V", "Lp1/O0;", "matrix", "v", "([F)V", "left", "top", "right", "bottom", "Lp1/u0;", "clipOp", "c", "(FFFFI)V", "Lp1/U0;", "path", "e", "(Lp1/U0;I)V", "Landroid/graphics/Region$Op;", "B", "(I)Landroid/graphics/Region$Op;", "Lo1/g;", "p1", "p2", "q", "(JJLp1/S0;)V", "k", "(FFFFLp1/S0;)V", "radiusX", "radiusY", "l", "(FFFFFFLp1/S0;)V", "x", "center", "radius", "m", "(JFLp1/S0;)V", "startAngle", "sweepAngle", "", "useCenter", "y", "(FFFFFFZLp1/S0;)V", "h", "(Lp1/U0;Lp1/S0;)V", "Lp1/J0;", "image", "topLeftOffset", "j", "(Lp1/J0;JLp1/S0;)V", "Lc2/n;", "srcOffset", "Lc2/r;", "srcSize", "dstOffset", "dstSize", "w", "(Lp1/J0;JJJJLp1/S0;)V", "r", "u", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "a", "Landroid/graphics/Canvas;", "()Landroid/graphics/Canvas;", "b", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.G  reason: case insensitive filesystem */
public final class C5701G implements C5732n0 {

    /* renamed from: a  reason: collision with root package name */
    private Canvas f27200a = C5702H.f27206a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f27201b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f27202c;

    public final Region.Op B(int i10) {
        return C5745u0.d(i10, C5745u0.f27347a.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    public final Canvas a() {
        return this.f27200a;
    }

    public final void b(Canvas canvas) {
        this.f27200a = canvas;
    }

    public void c(float f10, float f11, float f12, float f13, int i10) {
        this.f27200a.clipRect(f10, f11, f12, f13, B(i10));
    }

    public void d(float f10, float f11) {
        this.f27200a.translate(f10, f11);
    }

    public void e(U0 u02, int i10) {
        Canvas canvas = this.f27200a;
        if (u02 instanceof T) {
            canvas.clipPath(((T) u02).w(), B(i10));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void f(float f10, float f11) {
        this.f27200a.scale(f10, f11);
    }

    public void h(U0 u02, S0 s02) {
        Canvas canvas = this.f27200a;
        if (u02 instanceof T) {
            canvas.drawPath(((T) u02).w(), s02.o());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void i(C5669i iVar, S0 s02) {
        this.f27200a.saveLayer(iVar.o(), iVar.r(), iVar.p(), iVar.j(), s02.o(), 31);
    }

    public void j(J0 j02, long j10, S0 s02) {
        this.f27200a.drawBitmap(O.b(j02), C5667g.m(j10), C5667g.n(j10), s02.o());
    }

    public void k(float f10, float f11, float f12, float f13, S0 s02) {
        this.f27200a.drawRect(f10, f11, f12, f13, s02.o());
    }

    public void l(float f10, float f11, float f12, float f13, float f14, float f15, S0 s02) {
        this.f27200a.drawRoundRect(f10, f11, f12, f13, f14, f15, s02.o());
    }

    public void m(long j10, float f10, S0 s02) {
        this.f27200a.drawCircle(C5667g.m(j10), C5667g.n(j10), f10, s02.o());
    }

    public void n() {
        this.f27200a.restore();
    }

    public void q(long j10, long j11, S0 s02) {
        this.f27200a.drawLine(C5667g.m(j10), C5667g.n(j10), C5667g.m(j11), C5667g.n(j11), s02.o());
    }

    public void r() {
        C5738q0.f27341a.a(this.f27200a, true);
    }

    public void s(float f10) {
        this.f27200a.rotate(f10);
    }

    public void t() {
        this.f27200a.save();
    }

    public void u() {
        C5738q0.f27341a.a(this.f27200a, false);
    }

    public void v(float[] fArr) {
        if (!P0.c(fArr)) {
            Matrix matrix = new Matrix();
            P.a(matrix, fArr);
            this.f27200a.concat(matrix);
        }
    }

    public void w(J0 j02, long j10, long j11, long j12, long j13, S0 s02) {
        if (this.f27201b == null) {
            this.f27201b = new Rect();
            this.f27202c = new Rect();
        }
        Canvas canvas = this.f27200a;
        Bitmap b10 = O.b(j02);
        Rect rect = this.f27201b;
        C17542s.g(rect);
        rect.left = n.h(j10);
        rect.top = n.i(j10);
        rect.right = n.h(j10) + r.h(j11);
        rect.bottom = n.i(j10) + r.g(j11);
        C16807N n10 = C16807N.f139792a;
        Rect rect2 = this.f27202c;
        C17542s.g(rect2);
        rect2.left = n.h(j12);
        rect2.top = n.i(j12);
        rect2.right = n.h(j12) + r.h(j13);
        rect2.bottom = n.i(j12) + r.g(j13);
        canvas.drawBitmap(b10, rect, rect2, s02.o());
    }

    public void x(float f10, float f11, float f12, float f13, S0 s02) {
        this.f27200a.drawOval(f10, f11, f12, f13, s02.o());
    }

    public void y(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, S0 s02) {
        this.f27200a.drawArc(f10, f11, f12, f13, f14, f15, z10, s02.o());
    }
}
