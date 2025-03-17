package p1;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010#\"\u0004\b\u0016\u0010$R*\u0010'\u001a\u00020&2\u0006\u0010'\u001a\u00020&8V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\r\u0010(\"\u0004\b)\u0010*R*\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b\u001b\u0010-R*\u00102\u001a\u00020/2\u0006\u0010\u001a\u001a\u00020/8V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010-R$\u00105\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u000e¢\u0006\f\u001a\u0004\b3\u0010#\"\u0004\b4\u0010$R*\u00108\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b7\u0010,\"\u0004\b\u0012\u0010-R*\u0010<\u001a\u0002092\u0006\u0010\u001a\u001a\u0002098V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b:\u0010,\"\u0004\b;\u0010-R$\u0010?\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u000e¢\u0006\f\u001a\u0004\b=\u0010#\"\u0004\b>\u0010$R*\u0010C\u001a\u00020@2\u0006\u0010\u001a\u001a\u00020@8V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bA\u0010,\"\u0004\bB\u0010-R4\u0010H\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u001a\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010M\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158V@VX\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Lp1/Q;", "Lp1/S0;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "o", "()Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "Lp1/d0;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "Landroid/graphics/Shader;", "internalShader", "Lp1/w0;", "d", "Lp1/w0;", "internalColorFilter", "Lp1/V0;", "value", "e", "Lp1/V0;", "k", "()Lp1/V0;", "u", "(Lp1/V0;)V", "pathEffect", "", "()F", "(F)V", "alpha", "Lp1/v0;", "color", "()J", "j", "(J)V", "q", "()I", "(I)V", "blendMode", "Lp1/T0;", "getStyle-TiuSbCo", "v", "style", "x", "w", "strokeWidth", "Lp1/k1;", "g", "strokeCap", "Lp1/l1;", "l", "i", "strokeJoin", "m", "s", "strokeMiterLimit", "Lp1/E0;", "t", "f", "filterQuality", "r", "()Landroid/graphics/Shader;", "p", "(Landroid/graphics/Shader;)V", "shader", "h", "()Lp1/w0;", "n", "(Lp1/w0;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q implements S0 {

    /* renamed from: a  reason: collision with root package name */
    private Paint f27232a;

    /* renamed from: b  reason: collision with root package name */
    private int f27233b;

    /* renamed from: c  reason: collision with root package name */
    private Shader f27234c;

    /* renamed from: d  reason: collision with root package name */
    private C5749w0 f27235d;

    /* renamed from: e  reason: collision with root package name */
    private V0 f27236e;

    public Q(Paint paint) {
        this.f27232a = paint;
        this.f27233b = C5712d0.f27280a.B();
    }

    public float a() {
        return S.c(this.f27232a);
    }

    public long b() {
        return S.d(this.f27232a);
    }

    public void c(int i10) {
        S.r(this.f27232a, i10);
    }

    public void d(float f10) {
        S.k(this.f27232a, f10);
    }

    public void e(int i10) {
        if (!C5712d0.E(this.f27233b, i10)) {
            this.f27233b = i10;
            S.l(this.f27232a, i10);
        }
    }

    public void f(int i10) {
        S.o(this.f27232a, i10);
    }

    public int g() {
        return S.f(this.f27232a);
    }

    public C5749w0 h() {
        return this.f27235d;
    }

    public void i(int i10) {
        S.s(this.f27232a, i10);
    }

    public void j(long j10) {
        S.m(this.f27232a, j10);
    }

    public V0 k() {
        return this.f27236e;
    }

    public int l() {
        return S.g(this.f27232a);
    }

    public float m() {
        return S.h(this.f27232a);
    }

    public void n(C5749w0 w0Var) {
        this.f27235d = w0Var;
        S.n(this.f27232a, w0Var);
    }

    public Paint o() {
        return this.f27232a;
    }

    public void p(Shader shader) {
        this.f27234c = shader;
        S.q(this.f27232a, shader);
    }

    public int q() {
        return this.f27233b;
    }

    public Shader r() {
        return this.f27234c;
    }

    public void s(float f10) {
        S.t(this.f27232a, f10);
    }

    public int t() {
        return S.e(this.f27232a);
    }

    public void u(V0 v02) {
        S.p(this.f27232a, v02);
        this.f27236e = v02;
    }

    public void v(int i10) {
        S.v(this.f27232a, i10);
    }

    public void w(float f10) {
        S.u(this.f27232a, f10);
    }

    public float x() {
        return S.i(this.f27232a);
    }

    public Q() {
        this(S.j());
    }
}
