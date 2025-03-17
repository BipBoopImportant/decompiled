package I0;

import A0.a;
import U0.C4889m;
import U0.C4895p;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import m0.y0;
import p1.C5747v0;
import p1.i1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0012\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"LI0/E;", "", "<init>", "()V", "Lm0/y0;", "", "b", "Lm0/y0;", "getAnimationSpec", "()Lm0/y0;", "AnimationSpec", "Lc2/h;", "c", "F", "()F", "Elevation", "Lp1/v0;", "a", "(LU0/m;I)J", "backgroundColor", "Lp1/i1;", "d", "(LU0/m;I)Lp1/i1;", "shape", "scrimColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public static final E f7141a = new E();

    /* renamed from: b  reason: collision with root package name */
    private static final y0<Float> f7142b = new y0(256, 0, (C5525D) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f7143c = h.B((float) 16);

    private E() {
    }

    public final long a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-788676020, i10, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:758)");
        }
        long n10 = C4553d0.f7988a.a(mVar, 6).n();
        if (C4895p.J()) {
            C4895p.R();
        }
        return n10;
    }

    public final float b() {
        return f7143c;
    }

    public final long c(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(617225966, i10, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:777)");
        }
        long o10 = C5747v0.o(C4553d0.f7988a.a(mVar, 6).i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        return o10;
    }

    public final i1 d(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(2041803618, i10, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:770)");
        }
        a a10 = C4553d0.f7988a.b(mVar, 6).a();
        if (C4895p.J()) {
            C4895p.R();
        }
        return a10;
    }
}
