package RI;

import AI.C15429j;
import DI.C15558e;
import DI.C15561h;
import DI.n0;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import cJ.C17065b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import uJ.A0;
import uJ.C18084H;
import uJ.C18090N;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18100Y;
import uJ.C18113f0;
import uJ.D0;
import uJ.E0;
import uJ.G0;
import uJ.H0;
import uJ.L0;
import uJ.Q0;
import uJ.u0;
import uJ.y0;
import vJ.g;
import wJ.C18229k;
import wJ.C18230l;

public final class i extends H0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f138010e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final C16377a f138011f;

    /* renamed from: g  reason: collision with root package name */
    private static final C16377a f138012g;

    /* renamed from: c  reason: collision with root package name */
    private final g f138013c;

    /* renamed from: d  reason: collision with root package name */
    private final D0 f138014d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        L0 l02 = L0.COMMON;
        f138011f = C16378b.b(l02, false, true, (n0) null, 5, (Object) null).l(C16379c.FLEXIBLE_LOWER_BOUND);
        f138012g = C16378b.b(l02, false, true, (n0) null, 5, (Object) null).l(C16379c.FLEXIBLE_UPPER_BOUND);
    }

    public i(D0 d02) {
        g gVar = new g();
        this.f138013c = gVar;
        this.f138014d = d02 == null ? new D0(gVar, (A0) null, 2, (DefaultConstructorMarker) null) : d02;
    }

    private final v<C18113f0, Boolean> j(C18113f0 f0Var, C15558e eVar, C16377a aVar) {
        C18113f0 f0Var2 = f0Var;
        C15558e eVar2 = eVar;
        C16377a aVar2 = aVar;
        if (f0Var.N0().getParameters().isEmpty()) {
            return C16796C.a(f0Var2, Boolean.FALSE);
        }
        if (C15429j.d0(f0Var)) {
            E0 e02 = f0Var.L0().get(0);
            Q0 c10 = e02.c();
            C18096U type = e02.getType();
            C17542s.i(type, "getType(...)");
            return C16796C.a(C18099X.k(f0Var.M0(), f0Var.N0(), C16877v.e(new G0(c10, l(type, aVar2))), f0Var.O0(), (g) null, 16, (Object) null), Boolean.FALSE);
        } else if (C18100Y.a(f0Var)) {
            return C16796C.a(C18230l.d(C18229k.ERROR_RAW_TYPE, f0Var.N0().toString()), Boolean.FALSE);
        } else {
            C17656k B10 = eVar2.B(this);
            C17542s.i(B10, "getMemberScope(...)");
            u0 M02 = f0Var.M0();
            y0 k10 = eVar.k();
            C17542s.i(k10, "getTypeConstructor(...)");
            List<n0> parameters = eVar.k().getParameters();
            C17542s.i(parameters, "getParameters(...)");
            Iterable<n0> iterable = parameters;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (n0 n0Var : iterable) {
                g gVar = this.f138013c;
                C17542s.g(n0Var);
                arrayList.add(C18084H.b(gVar, n0Var, aVar, this.f138014d, (C18096U) null, 8, (Object) null));
            }
            return C16796C.a(C18099X.n(M02, k10, arrayList, f0Var.O0(), B10, new h(eVar2, this, f0Var2, aVar2)), Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    public static final C18113f0 k(C15558e eVar, i iVar, C18113f0 f0Var, C16377a aVar, g gVar) {
        C15558e b10;
        C17542s.j(gVar, "kotlinTypeRefiner");
        C17065b n10 = C17506e.n(eVar);
        if (n10 == null || (b10 = gVar.b(n10)) == null || C17542s.e(b10, eVar)) {
            return null;
        }
        return iVar.j(f0Var, b10, aVar).c();
    }

    private final C18096U l(C18096U u10, C16377a aVar) {
        C15561h e10 = u10.N0().e();
        if (e10 instanceof n0) {
            return l(this.f138014d.e((n0) e10, aVar.j(true)), aVar);
        }
        if (e10 instanceof C15558e) {
            C15561h e11 = C18090N.d(u10).N0().e();
            if (e11 instanceof C15558e) {
                v<C18113f0, Boolean> j10 = j(C18090N.c(u10), (C15558e) e10, f138011f);
                C18113f0 a10 = j10.a();
                boolean booleanValue = j10.b().booleanValue();
                v<C18113f0, Boolean> j11 = j(C18090N.d(u10), (C15558e) e11, f138012g);
                C18113f0 a11 = j11.a();
                return (booleanValue || j11.b().booleanValue()) ? new k(a10, a11) : C18099X.e(a10, a11);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + e11 + "\" while for lower it's \"" + e10 + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + e10).toString());
    }

    static /* synthetic */ C18096U m(i iVar, C18096U u10, C16377a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new C16377a(L0.COMMON, (C16379c) null, false, false, (Set) null, (C18113f0) null, 62, (DefaultConstructorMarker) null);
        }
        return iVar.l(u10, aVar);
    }

    public boolean f() {
        return false;
    }

    /* renamed from: n */
    public G0 e(C18096U u10) {
        C17542s.j(u10, "key");
        return new G0(m(this, u10, (C16377a) null, 2, (Object) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(D0 d02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : d02);
    }
}
