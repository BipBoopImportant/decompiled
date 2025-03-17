package I0;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"LI0/D0;", "", "<init>", "()V", "Lp1/v0;", "a", "(LU0/m;I)J", "backgroundColor", "b", "primaryActionColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D0 {

    /* renamed from: a  reason: collision with root package name */
    public static final D0 f7140a = new D0();

    private D0() {
    }

    public final long a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1630911716, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:204)");
        }
        C4553d0 d0Var = C4553d0.f7988a;
        long h10 = C5751x0.h(C5747v0.o(d0Var.a(mVar, 6).i(), 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null), d0Var.a(mVar, 6).n());
        if (C4895p.J()) {
            C4895p.R();
        }
        return h10;
    }

    public final long b(C4889m mVar, int i10) {
        long j10;
        if (C4895p.J()) {
            C4895p.S(-810329402, i10, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:224)");
        }
        C4568l a10 = C4553d0.f7988a.a(mVar, 6);
        if (a10.o()) {
            j10 = C5751x0.h(C5747v0.o(a10.n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), a10.j());
        } else {
            j10 = a10.k();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return j10;
    }
}
