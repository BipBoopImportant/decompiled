package VI;

import RI.k;
import XI.q;
import aJ.C17030a;
import kotlin.jvm.internal.C17542s;
import qJ.C17836x;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import wJ.C18229k;
import wJ.C18230l;

/* renamed from: VI.p  reason: case insensitive filesystem */
public final class C16684p implements C17836x {

    /* renamed from: a  reason: collision with root package name */
    public static final C16684p f139400a = new C16684p();

    private C16684p() {
    }

    public C18096U a(q qVar, String str, C18113f0 f0Var, C18113f0 f0Var2) {
        C17542s.j(qVar, "proto");
        C17542s.j(str, "flexibleId");
        C17542s.j(f0Var, "lowerBound");
        C17542s.j(f0Var2, "upperBound");
        return !C17542s.e(str, "kotlin.jvm.PlatformType") ? C18230l.d(C18229k.ERROR_FLEXIBLE_TYPE, str, f0Var.toString(), f0Var2.toString()) : qVar.s(C17030a.f140993g) ? new k(f0Var, f0Var2) : C18099X.e(f0Var, f0Var2);
    }
}
