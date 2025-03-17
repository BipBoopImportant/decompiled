package n6;

import T5.n;
import a8.f;
import a8.g;
import android.graphics.RectF;
import k6.C8450q;
import kotlin.Metadata;
import m6.C8554b;
import m6.C8557e;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0014\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\u0015\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Ln6/a;", "Ln6/b;", "La8/g;", "svg", "<init>", "(La8/g;)V", "", "value", "LXH/N;", "c", "([F)V", "", "a", "(Ljava/lang/String;)V", "b", "Lk6/q;", "options", "e", "(Lk6/q;)V", "", "width", "height", "LT5/n;", "f", "(II)LT5/n;", "La8/g;", "La8/f;", "La8/f;", "renderOptions", "d", "()[F", "viewBox", "", "getWidth", "()F", "getHeight", "coil-svg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: n6.a  reason: case insensitive filesystem */
final class C8581a implements C8582b {

    /* renamed from: a  reason: collision with root package name */
    private final g f55098a;

    /* renamed from: b  reason: collision with root package name */
    private f f55099b;

    public C8581a(g gVar) {
        this.f55098a = gVar;
    }

    public void a(String str) {
        this.f55098a.A(str);
    }

    public void b(String str) {
        this.f55098a.x(str);
    }

    public void c(float[] fArr) {
        g gVar = this.f55098a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        gVar.y(f10, f11, fArr[2] - f10, fArr[3] - f11);
    }

    public float[] d() {
        RectF g10 = this.f55098a.g();
        if (g10 == null) {
            return null;
        }
        return new float[]{g10.left, g10.top, g10.right, g10.bottom};
    }

    public void e(C8450q qVar) {
        String a10 = C8554b.a(qVar);
        if (a10 != null) {
            f fVar = new f();
            fVar.a(a10);
            this.f55099b = fVar;
        }
    }

    public n f(int i10, int i11) {
        return new C8557e(this.f55098a, this.f55099b, i10, i11);
    }

    public float getHeight() {
        return this.f55098a.f();
    }

    public float getWidth() {
        return this.f55098a.h();
    }
}
