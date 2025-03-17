package MI;

import CJ.C15519a;
import HJ.C15854t;
import YH.C16877v;
import cJ.C17069f;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.N  reason: case insensitive filesystem */
public final class C16053N {
    public static final List<C17069f> a(C17069f fVar) {
        C17542s.j(fVar, "name");
        String b10 = fVar.b();
        C17542s.i(b10, "asString(...)");
        return C16047H.c(b10) ? C16877v.r(b(fVar)) : C16047H.d(b10) ? f(fVar) : C16066j.f136376a.b(fVar);
    }

    public static final C17069f b(C17069f fVar) {
        C17542s.j(fVar, "methodName");
        C17069f e10 = e(fVar, "get", false, (String) null, 12, (Object) null);
        return e10 == null ? e(fVar, "is", false, (String) null, 8, (Object) null) : e10;
    }

    public static final C17069f c(C17069f fVar, boolean z10) {
        C17542s.j(fVar, "methodName");
        return e(fVar, "set", false, z10 ? "is" : null, 4, (Object) null);
    }

    private static final C17069f d(C17069f fVar, String str, boolean z10, String str2) {
        if (fVar.B()) {
            return null;
        }
        String m10 = fVar.m();
        C17542s.i(m10, "getIdentifier(...)");
        if (!C15854t.W(m10, str, false, 2, (Object) null) || m10.length() == str.length()) {
            return null;
        }
        char charAt = m10.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            return null;
        }
        if (str2 != null) {
            return C17069f.v(str2 + C15854t.O0(m10, str));
        } else if (!z10) {
            return fVar;
        } else {
            String c10 = C15519a.c(C15854t.O0(m10, str), true);
            if (!C17069f.C(c10)) {
                return null;
            }
            return C17069f.v(c10);
        }
    }

    static /* synthetic */ C17069f e(C17069f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List<C17069f> f(C17069f fVar) {
        C17542s.j(fVar, "methodName");
        return C16877v.s(c(fVar, false), c(fVar, true));
    }
}
