package O0;

import S0.n;
import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JX\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u00020\u0004*\u00020\u00118@X\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LO0/i0;", "", "<init>", "()V", "LO0/h0;", "a", "(LU0/m;I)LO0/h0;", "Lp1/v0;", "selectedIconColor", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "b", "(JJJJJJJLU0/m;II)LO0/h0;", "LO0/t;", "c", "(LO0/t;)LO0/h0;", "defaultNavigationBarItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.i0  reason: case insensitive filesystem */
public final class C4733i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C4733i0 f10846a = new C4733i0();

    /* renamed from: b  reason: collision with root package name */
    public static final int f10847b = 0;

    private C4733i0() {
    }

    public final C4731h0 a(C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1018883954, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:311)");
        }
        C4731h0 c10 = c(X.f10101a.a(mVar, 6));
        if (C4895p.J()) {
            C4895p.R();
        }
        return c10;
    }

    public final C4731h0 b(long j10, long j11, long j12, long j13, long j14, long j15, long j16, C4889m mVar, int i10, int i11) {
        long j17;
        long i12 = (i11 & 1) != 0 ? C5747v0.f27350b.i() : j10;
        long i13 = (i11 & 2) != 0 ? C5747v0.f27350b.i() : j11;
        long i14 = (i11 & 4) != 0 ? C5747v0.f27350b.i() : j12;
        long i15 = (i11 & 8) != 0 ? C5747v0.f27350b.i() : j13;
        long i16 = (i11 & 16) != 0 ? C5747v0.f27350b.i() : j14;
        long i17 = (i11 & 32) != 0 ? C5747v0.f27350b.i() : j15;
        long i18 = (i11 & 64) != 0 ? C5747v0.f27350b.i() : j16;
        if (C4895p.J()) {
            j17 = i18;
            C4895p.S(-1618564327, i10, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:336)");
        } else {
            j17 = i18;
        }
        C4731h0 a10 = c(X.f10101a.a(mVar, 6)).a(i12, i13, i14, i15, i16, i17, j17);
        if (C4895p.J()) {
            C4895p.R();
        }
        return a10;
    }

    public final C4731h0 c(C4753t tVar) {
        C4753t tVar2 = tVar;
        C4731h0 g10 = tVar.g();
        if (g10 != null) {
            return g10;
        }
        n nVar = n.f12987a;
        C4731h0 h0Var = new C4731h0(C4755u.f(tVar2, nVar.a()), C4755u.f(tVar2, nVar.f()), C4755u.f(tVar2, nVar.b()), C4755u.f(tVar2, nVar.j()), C4755u.f(tVar2, nVar.k()), C5747v0.o(C4755u.f(tVar2, nVar.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C5747v0.o(C4755u.f(tVar2, nVar.k()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        tVar2.X(h0Var);
        return h0Var;
    }
}
