package r1;

import kotlin.Metadata;
import o1.C5673m;
import p1.C5745u0;
import p1.U0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJD\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020!8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010#ø\u0001\u0002\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006%À\u0006\u0003"}, d2 = {"Lr1/h;", "", "", "left", "top", "right", "bottom", "LXH/N;", "j", "(FFFF)V", "Lp1/u0;", "clipOp", "c", "(FFFFI)V", "Lp1/U0;", "path", "e", "(Lp1/U0;I)V", "d", "(FF)V", "degrees", "Lo1/g;", "pivot", "g", "(FJ)V", "scaleX", "scaleY", "f", "(FFJ)V", "Lp1/O0;", "matrix", "a", "([F)V", "Lo1/m;", "b", "()J", "size", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface h {
    static /* synthetic */ void h(h hVar, float f10, float f11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 2) != 0) {
                f11 = 0.0f;
            }
            hVar.d(f10, f11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }

    static /* synthetic */ void i(h hVar, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f12 = C5673m.l(hVar.b());
            }
            if ((i11 & 8) != 0) {
                f13 = C5673m.i(hVar.b());
            }
            if ((i11 & 16) != 0) {
                i10 = C5745u0.f27347a.b();
            }
            hVar.c(f10, f11, f12, f13, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    static /* synthetic */ void k(h hVar, U0 u02, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = C5745u0.f27347a.b();
            }
            hVar.e(u02, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    void a(float[] fArr);

    long b();

    void c(float f10, float f11, float f12, float f13, int i10);

    void d(float f10, float f11);

    void e(U0 u02, int i10);

    void f(float f10, float f11, long j10);

    void g(float f10, long j10);

    void j(float f10, float f11, float f12, float f13);
}
