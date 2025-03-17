package U5;

import T5.n;
import kotlin.Metadata;
import o1.C5667g;
import o1.C5673m;
import o1.C5674n;
import r1.d;
import r1.f;
import t1.C5942c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LU5/m;", "Lt1/c;", "LT5/n;", "image", "<init>", "(LT5/n;)V", "Lr1/f;", "LXH/N;", "j", "(Lr1/f;)V", "g", "LT5/n;", "getImage", "()LT5/n;", "Lo1/m;", "h", "()J", "intrinsicSize", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends C5942c {

    /* renamed from: g  reason: collision with root package name */
    private final n f40253g;

    public m(n nVar) {
        this.f40253g = nVar;
    }

    public long h() {
        int width = this.f40253g.getWidth();
        float f10 = Float.NaN;
        float f11 = width > 0 ? (float) width : Float.NaN;
        int height = this.f40253g.getHeight();
        if (height > 0) {
            f10 = (float) height;
        }
        return C5674n.a(f11, f10);
    }

    /* access modifiers changed from: protected */
    public void j(f fVar) {
        int width = this.f40253g.getWidth();
        float f10 = 1.0f;
        float l10 = width > 0 ? C5673m.l(fVar.b()) / ((float) width) : 1.0f;
        int height = this.f40253g.getHeight();
        if (height > 0) {
            f10 = C5673m.i(fVar.b()) / ((float) height);
        }
        long c10 = C5667g.f26701b.c();
        d I12 = fVar.I1();
        long b10 = I12.b();
        I12.e().t();
        try {
            I12.c().f(l10, f10, c10);
            this.f40253g.c(n.c(fVar.I1().e()));
        } finally {
            I12.e().n();
            I12.g(b10);
        }
    }
}
