package AJ;

import AI.C15429j;
import DI.n0;
import EI.C15649h;
import XH.t;
import XH.v;
import YH.C16877v;
import hJ.C17331b;
import hJ.C17334e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import uJ.C18090N;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.E0;
import uJ.G0;
import uJ.I0;
import uJ.J0;
import uJ.M0;
import uJ.O0;
import uJ.P0;
import uJ.Q0;
import uJ.y0;
import uJ.z0;
import zJ.C18755d;

/* renamed from: AJ.c  reason: case insensitive filesystem */
public final class C15442c {

    /* renamed from: AJ.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f133153a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                uJ.Q0[] r0 = uJ.Q0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uJ.Q0 r1 = uJ.Q0.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uJ.Q0 r1 = uJ.Q0.IN_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uJ.Q0 r1 = uJ.Q0.OUT_VARIANCE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f133153a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: AJ.C15442c.a.<clinit>():void");
        }
    }

    /* renamed from: AJ.c$b */
    public static final class b extends z0 {
        b() {
        }

        public E0 k(y0 y0Var) {
            C17542s.j(y0Var, "key");
            C17331b bVar = y0Var instanceof C17331b ? (C17331b) y0Var : null;
            if (bVar == null) {
                return null;
            }
            return bVar.d().a() ? new G0(Q0.OUT_VARIANCE, bVar.d().getType()) : bVar.d();
        }
    }

    public static final C15440a<C18096U> b(C18096U u10) {
        Object obj;
        C17542s.j(u10, "type");
        if (C18090N.b(u10)) {
            C15440a<C18096U> b10 = b(C18090N.c(u10));
            C15440a<C18096U> b11 = b(C18090N.d(u10));
            return new C15440a<>(O0.b(C18099X.e(C18090N.c(b10.c()), C18090N.d(b11.c())), u10), O0.b(C18099X.e(C18090N.c(b10.d()), C18090N.d(b11.d())), u10));
        }
        y0 N02 = u10.N0();
        if (C17334e.f(u10)) {
            C17542s.h(N02, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            E0 d10 = ((C17331b) N02).d();
            C18096U type = d10.getType();
            C17542s.i(type, "getType(...)");
            C18096U c10 = c(type, u10);
            int i10 = a.f133153a[d10.c().ordinal()];
            if (i10 == 2) {
                return new C15440a<>(c10, C18755d.n(u10).J());
            }
            if (i10 == 3) {
                C18113f0 I10 = C18755d.n(u10).I();
                C17542s.i(I10, "getNothingType(...)");
                return new C15440a<>(c(I10, u10), c10);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + d10);
        } else if (u10.L0().isEmpty() || u10.L0().size() != N02.getParameters().size()) {
            return new C15440a<>(u10, u10);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<n0> parameters = N02.getParameters();
            C17542s.i(parameters, "getParameters(...)");
            for (v vVar : C16877v.D1(u10.L0(), parameters)) {
                E0 e02 = (E0) vVar.a();
                n0 n0Var = (n0) vVar.b();
                C17542s.g(n0Var);
                C15443d i11 = i(e02, n0Var);
                if (e02.a()) {
                    arrayList.add(i11);
                    arrayList2.add(i11);
                } else {
                    C15440a<C15443d> f10 = f(i11);
                    arrayList.add(f10.a());
                    arrayList2.add(f10.b());
                }
            }
            boolean z10 = false;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C15443d) it.next()).d()) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z10) {
                obj = C18755d.n(u10).I();
                C17542s.i(obj, "getNothingType(...)");
            } else {
                obj = g(u10, arrayList);
            }
            return new C15440a<>(obj, g(u10, arrayList2));
        }
    }

    private static final C18096U c(C18096U u10, C18096U u11) {
        C18096U q10 = M0.q(u10, u11.O0());
        C17542s.i(q10, "makeNullableIfNeeded(...)");
        return q10;
    }

    public static final E0 d(E0 e02, boolean z10) {
        if (e02 == null) {
            return null;
        }
        if (e02.a()) {
            return e02;
        }
        C18096U type = e02.getType();
        C17542s.i(type, "getType(...)");
        if (!M0.c(type, C15441b.f133152a)) {
            return e02;
        }
        Q0 c10 = e02.c();
        C17542s.i(c10, "getProjectionKind(...)");
        return c10 == Q0.OUT_VARIANCE ? new G0(c10, b(type).d()) : z10 ? new G0(c10, b(type).c()) : h(e02);
    }

    /* access modifiers changed from: private */
    public static final Boolean e(P0 p02) {
        C17542s.g(p02);
        return Boolean.valueOf(C17334e.f(p02));
    }

    private static final C15440a<C15443d> f(C15443d dVar) {
        C15440a<C18096U> b10 = b(dVar.a());
        C15440a<C18096U> b11 = b(dVar.b());
        return new C15440a<>(new C15443d(dVar.c(), b10.b(), b11.a()), new C15443d(dVar.c(), b10.a(), b11.b()));
    }

    private static final C18096U g(C18096U u10, List<C15443d> list) {
        u10.L0().size();
        list.size();
        Iterable<C15443d> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C15443d j10 : iterable) {
            arrayList.add(j(j10));
        }
        return I0.e(u10, arrayList, (C15649h) null, (List) null, 6, (Object) null);
    }

    private static final E0 h(E0 e02) {
        J0 g10 = J0.g(new b());
        C17542s.i(g10, "create(...)");
        return g10.t(e02);
    }

    private static final C15443d i(E0 e02, n0 n0Var) {
        int i10 = a.f133153a[J0.c(n0Var.o(), e02).ordinal()];
        if (i10 == 1) {
            C18096U type = e02.getType();
            C17542s.i(type, "getType(...)");
            C18096U type2 = e02.getType();
            C17542s.i(type2, "getType(...)");
            return new C15443d(n0Var, type, type2);
        } else if (i10 == 2) {
            C18096U type3 = e02.getType();
            C17542s.i(type3, "getType(...)");
            C18113f0 J10 = C17506e.m(n0Var).J();
            C17542s.i(J10, "getNullableAnyType(...)");
            return new C15443d(n0Var, type3, J10);
        } else if (i10 == 3) {
            C18113f0 I10 = C17506e.m(n0Var).I();
            C17542s.i(I10, "getNothingType(...)");
            C18096U type4 = e02.getType();
            C17542s.i(type4, "getType(...)");
            return new C15443d(n0Var, I10, type4);
        } else {
            throw new t();
        }
    }

    private static final E0 j(C15443d dVar) {
        Q0 q02;
        dVar.d();
        return (C17542s.e(dVar.a(), dVar.b()) || dVar.c().o() == (q02 = Q0.IN_VARIANCE)) ? new G0(dVar.a()) : (!C15429j.o0(dVar.a()) || dVar.c().o() == q02) ? C15429j.q0(dVar.b()) ? new G0(k(dVar, q02), dVar.a()) : new G0(k(dVar, Q0.OUT_VARIANCE), dVar.b()) : new G0(k(dVar, Q0.OUT_VARIANCE), dVar.b());
    }

    private static final Q0 k(C15443d dVar, Q0 q02) {
        return q02 == dVar.c().o() ? Q0.INVARIANT : q02;
    }
}
