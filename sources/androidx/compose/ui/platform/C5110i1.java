package androidx.compose.ui.platform;

import XH.t;
import kotlin.Metadata;
import o1.C5661a;
import o1.C5669i;
import o1.C5671k;
import p1.Q0;
import p1.U0;
import p1.Y;
import p1.Y0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lp1/Q0;", "outline", "", "x", "y", "Lp1/U0;", "tmpTouchPointPath", "tmpOpPath", "", "b", "(Lp1/Q0;FFLp1/U0;Lp1/U0;)Z", "Lo1/i;", "rect", "e", "(Lo1/i;FF)Z", "Lp1/Q0$c;", "touchPointPath", "opPath", "f", "(Lp1/Q0$c;FFLp1/U0;Lp1/U0;)Z", "Lo1/k;", "a", "(Lo1/k;)Z", "Lo1/a;", "cornerRadius", "centerX", "centerY", "g", "(FFJFF)Z", "path", "d", "(Lp1/U0;FFLp1/U0;Lp1/U0;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.i1  reason: case insensitive filesystem */
public final class C5110i1 {
    private static final boolean a(C5671k kVar) {
        return C5661a.d(kVar.h()) + C5661a.d(kVar.i()) <= kVar.j() && C5661a.d(kVar.b()) + C5661a.d(kVar.c()) <= kVar.j() && C5661a.e(kVar.h()) + C5661a.e(kVar.b()) <= kVar.d() && C5661a.e(kVar.i()) + C5661a.e(kVar.c()) <= kVar.d();
    }

    public static final boolean b(Q0 q02, float f10, float f11, U0 u02, U0 u03) {
        if (q02 instanceof Q0.b) {
            return e(((Q0.b) q02).b(), f10, f11);
        }
        if (q02 instanceof Q0.c) {
            return f((Q0.c) q02, f10, f11, u02, u03);
        }
        if (q02 instanceof Q0.a) {
            return d(((Q0.a) q02).b(), f10, f11, u02, u03);
        }
        throw new t();
    }

    public static /* synthetic */ boolean c(Q0 q02, float f10, float f11, U0 u02, U0 u03, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            u02 = null;
        }
        if ((i10 & 16) != 0) {
            u03 = null;
        }
        return b(q02, f10, f11, u02, u03);
    }

    private static final boolean d(U0 u02, float f10, float f11, U0 u03, U0 u04) {
        C5669i iVar = new C5669i(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (u03 == null) {
            u03 = Y.a();
        }
        U0.j(u03, iVar, (U0.b) null, 2, (Object) null);
        if (u04 == null) {
            u04 = Y.a();
        }
        u04.v(u02, u03, Y0.f27262a.b());
        boolean isEmpty = u04.isEmpty();
        u04.a();
        u03.a();
        return !isEmpty;
    }

    private static final boolean e(C5669i iVar, float f10, float f11) {
        return iVar.o() <= f10 && f10 < iVar.p() && iVar.r() <= f11 && f11 < iVar.j();
    }

    private static final boolean f(Q0.c cVar, float f10, float f11, U0 u02, U0 u03) {
        float f12 = f10;
        float f13 = f11;
        U0 u04 = u03;
        C5671k b10 = cVar.b();
        if (f12 < b10.e() || f12 >= b10.f() || f13 < b10.g() || f13 >= b10.a()) {
            return false;
        }
        if (!a(b10)) {
            U0 a10 = u04 == null ? Y.a() : u04;
            U0.s(a10, b10, (U0.b) null, 2, (Object) null);
            return d(a10, f10, f11, u02, u04);
        }
        float d10 = C5661a.d(b10.h()) + b10.e();
        float e10 = C5661a.e(b10.h()) + b10.g();
        float f14 = b10.f() - C5661a.d(b10.i());
        float e11 = C5661a.e(b10.i()) + b10.g();
        float f15 = b10.f() - C5661a.d(b10.c());
        float a11 = b10.a() - C5661a.e(b10.c());
        float a12 = b10.a() - C5661a.e(b10.b());
        float d11 = C5661a.d(b10.b()) + b10.e();
        if (f12 < d10 && f13 < e10) {
            return g(f10, f11, b10.h(), d10, e10);
        } else if (f12 < d11 && f13 > a12) {
            return g(f10, f11, b10.b(), d11, a12);
        } else if (f12 > f14 && f13 < e11) {
            return g(f10, f11, b10.i(), f14, e11);
        } else if (f12 <= f15 || f13 <= a11) {
            return true;
        } else {
            return g(f10, f11, b10.c(), f15, a11);
        }
    }

    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float d10 = C5661a.d(j10);
        float e10 = C5661a.e(j10);
        return ((f14 * f14) / (d10 * d10)) + ((f15 * f15) / (e10 * e10)) <= 1.0f;
    }
}
