package p1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5661a;
import o1.C5667g;
import o1.C5669i;
import o1.C5671k;
import p1.U0;
import p1.Y0;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0019J/\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0019J?\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$J?\u0010'\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010$J\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010/J\"\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00012\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00106J\u001a\u00109\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J*\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010@\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010W\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q8V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010Z\u001a\u00020A8VX\u0004¢\u0006\f\u0012\u0004\bY\u00106\u001a\u0004\bN\u0010XR\u0014\u0010[\u001a\u00020A8VX\u0004¢\u0006\u0006\u001a\u0004\b[\u0010X\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Lp1/T;", "Lp1/U0;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Lo1/i;", "rect", "LXH/N;", "x", "(Lo1/i;)V", "", "y", "b", "(FF)V", "dx", "dy", "f", "d", "u", "x1", "y1", "x2", "y2", "h", "(FFFF)V", "m", "dx1", "dy1", "dx2", "dy2", "i", "q", "x3", "y3", "c", "(FFFFFF)V", "dx3", "dy3", "g", "Lp1/U0$b;", "direction", "n", "(Lo1/i;Lp1/U0$b;)V", "Lo1/k;", "roundRect", "o", "(Lo1/k;Lp1/U0$b;)V", "path", "Lo1/g;", "offset", "t", "(Lp1/U0;J)V", "close", "()V", "a", "D", "p", "(J)V", "getBounds", "()Lo1/i;", "path1", "path2", "Lp1/Y0;", "operation", "", "v", "(Lp1/U0;Lp1/U0;I)Z", "Landroid/graphics/Path;", "w", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "e", "Landroid/graphics/Matrix;", "mMatrix", "Lp1/W0;", "value", "r", "()I", "k", "(I)V", "fillType", "()Z", "isConvex$annotations", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class T implements U0 {

    /* renamed from: b  reason: collision with root package name */
    private final Path f27244b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f27245c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f27246d;

    /* renamed from: e  reason: collision with root package name */
    private Matrix f27247e;

    public T() {
        this((Path) null, 1, (DefaultConstructorMarker) null);
    }

    private final void x(C5669i iVar) {
        if (Float.isNaN(iVar.o()) || Float.isNaN(iVar.r()) || Float.isNaN(iVar.p()) || Float.isNaN(iVar.j())) {
            Y.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    public void D() {
        this.f27244b.rewind();
    }

    public void a() {
        this.f27244b.reset();
    }

    public void b(float f10, float f11) {
        this.f27244b.moveTo(f10, f11);
    }

    public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f27244b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    public void close() {
        this.f27244b.close();
    }

    public void d(float f10, float f11) {
        this.f27244b.lineTo(f10, f11);
    }

    public boolean e() {
        return this.f27244b.isConvex();
    }

    public void f(float f10, float f11) {
        this.f27244b.rMoveTo(f10, f11);
    }

    public void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f27244b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    public C5669i getBounds() {
        if (this.f27245c == null) {
            this.f27245c = new RectF();
        }
        RectF rectF = this.f27245c;
        C17542s.g(rectF);
        this.f27244b.computeBounds(rectF, true);
        return new C5669i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void h(float f10, float f11, float f12, float f13) {
        this.f27244b.quadTo(f10, f11, f12, f13);
    }

    public void i(float f10, float f11, float f12, float f13) {
        this.f27244b.rQuadTo(f10, f11, f12, f13);
    }

    public boolean isEmpty() {
        return this.f27244b.isEmpty();
    }

    public void k(int i10) {
        this.f27244b.setFillType(W0.f(i10, W0.f27257b.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public void m(float f10, float f11, float f12, float f13) {
        this.f27244b.quadTo(f10, f11, f12, f13);
    }

    public void n(C5669i iVar, U0.b bVar) {
        x(iVar);
        if (this.f27245c == null) {
            this.f27245c = new RectF();
        }
        RectF rectF = this.f27245c;
        C17542s.g(rectF);
        rectF.set(iVar.o(), iVar.r(), iVar.p(), iVar.j());
        Path path = this.f27244b;
        RectF rectF2 = this.f27245c;
        C17542s.g(rectF2);
        path.addRect(rectF2, Y.e(bVar));
    }

    public void o(C5671k kVar, U0.b bVar) {
        if (this.f27245c == null) {
            this.f27245c = new RectF();
        }
        RectF rectF = this.f27245c;
        C17542s.g(rectF);
        rectF.set(kVar.e(), kVar.g(), kVar.f(), kVar.a());
        if (this.f27246d == null) {
            this.f27246d = new float[8];
        }
        float[] fArr = this.f27246d;
        C17542s.g(fArr);
        fArr[0] = C5661a.d(kVar.h());
        fArr[1] = C5661a.e(kVar.h());
        fArr[2] = C5661a.d(kVar.i());
        fArr[3] = C5661a.e(kVar.i());
        fArr[4] = C5661a.d(kVar.c());
        fArr[5] = C5661a.e(kVar.c());
        fArr[6] = C5661a.d(kVar.b());
        fArr[7] = C5661a.e(kVar.b());
        Path path = this.f27244b;
        RectF rectF2 = this.f27245c;
        C17542s.g(rectF2);
        float[] fArr2 = this.f27246d;
        C17542s.g(fArr2);
        path.addRoundRect(rectF2, fArr2, Y.e(bVar));
    }

    public void p(long j10) {
        Matrix matrix = this.f27247e;
        if (matrix == null) {
            this.f27247e = new Matrix();
        } else {
            C17542s.g(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f27247e;
        C17542s.g(matrix2);
        matrix2.setTranslate(C5667g.m(j10), C5667g.n(j10));
        Path path = this.f27244b;
        Matrix matrix3 = this.f27247e;
        C17542s.g(matrix3);
        path.transform(matrix3);
    }

    public void q(float f10, float f11, float f12, float f13) {
        this.f27244b.rQuadTo(f10, f11, f12, f13);
    }

    public int r() {
        return this.f27244b.getFillType() == Path.FillType.EVEN_ODD ? W0.f27257b.a() : W0.f27257b.b();
    }

    public void t(U0 u02, long j10) {
        Path path = this.f27244b;
        if (u02 instanceof T) {
            path.addPath(((T) u02).w(), C5667g.m(j10), C5667g.n(j10));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void u(float f10, float f11) {
        this.f27244b.rLineTo(f10, f11);
    }

    public boolean v(U0 u02, U0 u03, int i10) {
        Y0.a aVar = Y0.f27262a;
        Path.Op op2 = Y0.f(i10, aVar.a()) ? Path.Op.DIFFERENCE : Y0.f(i10, aVar.b()) ? Path.Op.INTERSECT : Y0.f(i10, aVar.c()) ? Path.Op.REVERSE_DIFFERENCE : Y0.f(i10, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.f27244b;
        if (u02 instanceof T) {
            Path w10 = ((T) u02).w();
            if (u03 instanceof T) {
                return path.op(w10, ((T) u03).w(), op2);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final Path w() {
        return this.f27244b;
    }

    public T(Path path) {
        this.f27244b = path;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(Path path, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
