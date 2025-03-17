package AI;

import DI.C15535F;
import DI.C15559f;
import DI.C15573t;
import DI.i0;
import EI.C15649h;
import GI.C15713G;
import GI.C15726U;
import GI.C15746p;
import YH.C16877v;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import tJ.C17986f;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.E0;
import uJ.Q0;
import uJ.u0;
import uJ.y0;
import vJ.g;
import wJ.C18230l;
import zJ.C18755d;

/* renamed from: AI.q  reason: case insensitive filesystem */
public final class C15436q {

    /* renamed from: a  reason: collision with root package name */
    private static final C15713G f133142a;

    static {
        C15746p pVar = new C15746p(C18230l.f149170a.i(), C15435p.f133041s);
        C15559f fVar = C15559f.INTERFACE;
        C17069f f10 = C15435p.f133044v.f();
        i0 i0Var = i0.f133841a;
        C17994n nVar = C17986f.f147352e;
        C15713G g10 = new C15713G(pVar, fVar, false, false, f10, i0Var, nVar);
        g10.M0(C15535F.ABSTRACT);
        g10.O0(C15573t.f133853e);
        g10.N0(C16877v.e(C15726U.R0(g10, C15649h.f134231V.b(), false, Q0.IN_VARIANCE, C17069f.v("T"), 0, nVar)));
        g10.K0();
        f133142a = g10;
    }

    public static final C18113f0 a(C18096U u10) {
        C17542s.j(u10, "suspendFunType");
        C15428i.r(u10);
        C15429j n10 = C18755d.n(u10);
        C15649h annotations = u10.getAnnotations();
        C18096U k10 = C15428i.k(u10);
        List<C18096U> e10 = C15428i.e(u10);
        Iterable<E0> m10 = C15428i.m(u10);
        ArrayList arrayList = new ArrayList(C16877v.y(m10, 10));
        for (E0 type : m10) {
            arrayList.add(type.getType());
        }
        u0 k11 = u0.f147932b.k();
        y0 k12 = f133142a.k();
        C17542s.i(k12, "getTypeConstructor(...)");
        List W02 = C16877v.W0(arrayList, C18099X.k(k11, k12, C16877v.e(C18755d.d(C15428i.l(u10))), false, (g) null, 16, (Object) null));
        C18113f0 J10 = C18755d.n(u10).J();
        C17542s.i(J10, "getNullableAnyType(...)");
        return C15428i.c(n10, annotations, k10, e10, W02, (List) null, J10, false, 128, (Object) null).U0(u10.O0());
    }
}
