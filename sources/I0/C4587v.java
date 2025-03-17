package I0;

import U0.C4889m;
import U0.C4895p;
import c2.h;
import kotlin.Metadata;
import p1.C5751x0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"LI0/v;", "LI0/L;", "<init>", "()V", "Lp1/v0;", "color", "Lc2/h;", "elevation", "a", "(JFLU0/m;I)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.v  reason: case insensitive filesystem */
final class C4587v implements L {

    /* renamed from: a  reason: collision with root package name */
    public static final C4587v f8383a = new C4587v();

    private C4587v() {
    }

    public long a(long j10, float f10, C4889m mVar, int i10) {
        mVar.W(-1687113661);
        if (C4895p.J()) {
            C4895p.S(-1687113661, i10, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        C4568l a10 = C4553d0.f7988a.a(mVar, 6);
        if (h.v(f10, h.B((float) 0)) <= 0 || a10.o()) {
            mVar.W(1169152471);
            mVar.P();
        } else {
            mVar.W(1169013963);
            j10 = C5751x0.h(M.b(j10, f10, mVar, i10 & 126), j10);
            mVar.P();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j10;
    }
}
