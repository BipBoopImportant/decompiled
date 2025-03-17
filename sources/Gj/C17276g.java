package gJ;

import DI.C15534E;
import DI.C15544O;
import DI.C15554a;
import DI.C15555b;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.i0;
import DI.n0;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import gJ.C17284o;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import nI.p;
import uJ.y0;
import vJ.g;

/* renamed from: gJ.g  reason: case insensitive filesystem */
public final class C17276g {

    /* renamed from: a  reason: collision with root package name */
    public static final C17276g f143305a = new C17276g();

    private C17276g() {
    }

    public static /* synthetic */ boolean f(C17276g gVar, C15554a aVar, C15554a aVar2, boolean z10, boolean z11, boolean z12, g gVar2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return gVar.e(aVar, aVar2, z10, z13, z12, gVar2);
    }

    /* access modifiers changed from: private */
    public static final boolean g(C15566m mVar, C15566m mVar2) {
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean h(boolean z10, C15554a aVar, C15554a aVar2, y0 y0Var, y0 y0Var2) {
        C17542s.j(y0Var, "c1");
        C17542s.j(y0Var2, "c2");
        if (C17542s.e(y0Var, y0Var2)) {
            return true;
        }
        C15561h e10 = y0Var.e();
        C15561h e11 = y0Var2.e();
        if (!(e10 instanceof n0) || !(e11 instanceof n0)) {
            return false;
        }
        return f143305a.n((n0) e10, (n0) e11, z10, new C17275f(aVar, aVar2));
    }

    /* access modifiers changed from: private */
    public static final boolean i(C15554a aVar, C15554a aVar2, C15566m mVar, C15566m mVar2) {
        return C17542s.e(mVar, aVar) && C17542s.e(mVar2, aVar2);
    }

    private final boolean j(C15558e eVar, C15558e eVar2) {
        return C17542s.e(eVar.k(), eVar2.k());
    }

    public static /* synthetic */ boolean l(C17276g gVar, C15566m mVar, C15566m mVar2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return gVar.k(mVar, mVar2, z10, z11);
    }

    public static /* synthetic */ boolean o(C17276g gVar, n0 n0Var, n0 n0Var2, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            pVar = C17272c.f143298a;
        }
        return gVar.n(n0Var, n0Var2, z10, pVar);
    }

    /* access modifiers changed from: private */
    public static final boolean p(C15566m mVar, C15566m mVar2) {
        return false;
    }

    private final boolean q(C15566m mVar, C15566m mVar2, p<? super C15566m, ? super C15566m, Boolean> pVar, boolean z10) {
        C15566m b10 = mVar.b();
        C15566m b11 = mVar2.b();
        return ((b10 instanceof C15555b) || (b11 instanceof C15555b)) ? pVar.invoke(b10, b11).booleanValue() : l(this, b10, b11, z10, false, 8, (Object) null);
    }

    private final i0 r(C15554a aVar) {
        while (aVar instanceof C15555b) {
            C15555b bVar = (C15555b) aVar;
            if (bVar.h() != C15555b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends C15555b> e10 = bVar.e();
            C17542s.i(e10, "getOverriddenDescriptors(...)");
            aVar = (C15555b) C16877v.c1(e10);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.i();
    }

    public final boolean e(C15554a aVar, C15554a aVar2, boolean z10, boolean z11, boolean z12, g gVar) {
        C17542s.j(aVar, "a");
        C17542s.j(aVar2, DslKt.INDICATOR_BACKGROUND);
        C17542s.j(gVar, "kotlinTypeRefiner");
        if (C17542s.e(aVar, aVar2)) {
            return true;
        }
        if (!C17542s.e(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z11 && (aVar instanceof C15534E) && (aVar2 instanceof C15534E) && ((C15534E) aVar).m0() != ((C15534E) aVar2).m0()) {
            return false;
        }
        if ((C17542s.e(aVar.b(), aVar2.b()) && (!z10 || !C17542s.e(r(aVar), r(aVar2)))) || C17278i.E(aVar) || C17278i.E(aVar2) || !q(aVar, aVar2, C17273d.f143299a, z10)) {
            return false;
        }
        C17284o i10 = C17284o.i(gVar, new C17274e(z10, aVar, aVar2));
        C17542s.i(i10, "create(...)");
        C17284o.i.a c10 = i10.E(aVar, aVar2, (C15558e) null, !z12).c();
        C17284o.i.a aVar3 = C17284o.i.a.OVERRIDABLE;
        return c10 == aVar3 && i10.E(aVar2, aVar, (C15558e) null, z12 ^ true).c() == aVar3;
    }

    public final boolean k(C15566m mVar, C15566m mVar2, boolean z10, boolean z11) {
        if ((mVar instanceof C15558e) && (mVar2 instanceof C15558e)) {
            return j((C15558e) mVar, (C15558e) mVar2);
        }
        if ((mVar instanceof n0) && (mVar2 instanceof n0)) {
            return o(this, (n0) mVar, (n0) mVar2, z10, (p) null, 8, (Object) null);
        } else if (!(mVar instanceof C15554a) || !(mVar2 instanceof C15554a)) {
            return (!(mVar instanceof C15544O) || !(mVar2 instanceof C15544O)) ? C17542s.e(mVar, mVar2) : C17542s.e(((C15544O) mVar).f(), ((C15544O) mVar2).f());
        } else {
            return f(this, (C15554a) mVar, (C15554a) mVar2, z10, z11, false, g.a.f149050a, 16, (Object) null);
        }
    }

    public final boolean m(n0 n0Var, n0 n0Var2, boolean z10) {
        C17542s.j(n0Var, "a");
        C17542s.j(n0Var2, DslKt.INDICATOR_BACKGROUND);
        return o(this, n0Var, n0Var2, z10, (p) null, 8, (Object) null);
    }

    public final boolean n(n0 n0Var, n0 n0Var2, boolean z10, p<? super C15566m, ? super C15566m, Boolean> pVar) {
        C17542s.j(n0Var, "a");
        C17542s.j(n0Var2, DslKt.INDICATOR_BACKGROUND);
        C17542s.j(pVar, "equivalentCallables");
        if (C17542s.e(n0Var, n0Var2)) {
            return true;
        }
        if (!C17542s.e(n0Var.b(), n0Var2.b()) && q(n0Var, n0Var2, pVar, z10)) {
            return n0Var.getIndex() == n0Var2.getIndex();
        }
        return false;
    }
}
