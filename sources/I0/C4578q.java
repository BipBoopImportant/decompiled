package I0;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"LI0/q;", "", "<init>", "()V", "", "highContrastAlpha", "lowContrastAlpha", "a", "(FFLU0/m;I)F", "c", "(LU0/m;I)F", "high", "d", "medium", "b", "disabled", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.q  reason: case insensitive filesystem */
public final class C4578q {

    /* renamed from: a  reason: collision with root package name */
    public static final C4578q f8304a = new C4578q();

    private C4578q() {
    }

    private final float a(float f10, float f11, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1528360391, i10, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:76)");
        }
        long y10 = ((C5747v0) mVar.Q(C4581s.a())).y();
        if (!C4553d0.f7988a.a(mVar, 6).o() ? ((double) C5751x0.j(y10)) >= 0.5d : ((double) C5751x0.j(y10)) <= 0.5d) {
            f10 = f11;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return f10;
    }

    public final float b(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(621183615, i10, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:57)");
        }
        float a10 = a(0.38f, 0.38f, mVar, ((i10 << 6) & 896) | 54);
        if (C4895p.J()) {
            C4895p.R();
        }
        return a10;
    }

    public final float c(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(629162431, i10, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:35)");
        }
        float a10 = a(1.0f, 0.87f, mVar, ((i10 << 6) & 896) | 54);
        if (C4895p.J()) {
            C4895p.R();
        }
        return a10;
    }

    public final float d(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1999054879, i10, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:46)");
        }
        float a10 = a(0.74f, 0.6f, mVar, ((i10 << 6) & 896) | 54);
        if (C4895p.J()) {
            C4895p.R();
        }
        return a10;
    }
}
