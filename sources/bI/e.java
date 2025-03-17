package BI;

import AI.C15428i;
import BJ.t;
import DI.C15535F;
import DI.C15555b;
import DI.C15566m;
import DI.C15573t;
import DI.C15579z;
import DI.d0;
import DI.i0;
import DI.n0;
import DI.u0;
import EI.C15649h;
import GI.C15721O;
import GI.C15727V;
import GI.C15749s;
import XH.v;
import YH.C16877v;
import YH.Q;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.J0;
import uJ.Q0;

public final class e extends C15721O {

    /* renamed from: E  reason: collision with root package name */
    public static final a f133282E = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final u0 b(e eVar, int i10, n0 n0Var) {
            String str;
            String b10 = n0Var.getName().b();
            C17542s.i(b10, "asString(...)");
            if (C17542s.e(b10, "T")) {
                str = "instance";
            } else if (C17542s.e(b10, "E")) {
                str = "receiver";
            } else {
                str = b10.toLowerCase(Locale.ROOT);
                C17542s.i(str, "toLowerCase(...)");
            }
            C15649h b11 = C15649h.f134231V.b();
            C17069f v10 = C17069f.v(str);
            C17542s.i(v10, "identifier(...)");
            C18113f0 r10 = n0Var.r();
            C17542s.i(r10, "getDefaultType(...)");
            i0 i0Var = i0.f133841a;
            C17542s.i(i0Var, "NO_SOURCE");
            return new C15727V(eVar, (u0) null, i10, b11, v10, r10, false, false, false, (C18096U) null, i0Var);
        }

        public final e a(C15464b bVar, boolean z10) {
            C17542s.j(bVar, "functionClass");
            List<n0> t10 = bVar.t();
            e eVar = new e(bVar, (e) null, C15555b.a.DECLARATION, z10, (DefaultConstructorMarker) null);
            d0 J02 = bVar.J0();
            List n10 = C16877v.n();
            List n11 = C16877v.n();
            ArrayList arrayList = new ArrayList();
            for (Object next : t10) {
                if (((n0) next).o() != Q0.IN_VARIANCE) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<Q> B12 = C16877v.B1(arrayList);
            ArrayList arrayList2 = new ArrayList(C16877v.y(B12, 10));
            for (Q q10 : B12) {
                arrayList2.add(e.f133282E.b(eVar, q10.c(), (n0) q10.d()));
            }
            eVar.R0((d0) null, J02, n10, n11, arrayList2, ((n0) C16877v.I0(t10)).r(), C15535F.ABSTRACT, C15573t.f133853e);
            eVar.Z0(true);
            return eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(C15566m mVar, e eVar, C15555b.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, eVar, aVar, z10);
    }

    private final C15579z p1(List<C17069f> list) {
        C17069f fVar;
        int size = j().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List<u0> j10 = j();
            C17542s.i(j10, "getValueParameters(...)");
            Iterable<v> D12 = C16877v.D1(list, j10);
            if (!(D12 instanceof Collection) || !((Collection) D12).isEmpty()) {
                for (v vVar : D12) {
                    if (!C17542s.e((C17069f) vVar.a(), ((u0) vVar.b()).getName())) {
                    }
                }
            }
            return this;
        }
        List<u0> j11 = j();
        C17542s.i(j11, "getValueParameters(...)");
        Iterable<u0> iterable = j11;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (u0 u0Var : iterable) {
            C17069f name = u0Var.getName();
            C17542s.i(name, "getName(...)");
            int index = u0Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(u0Var.f0(this, name, index));
        }
        C15749s.c S02 = S0(J0.f147823b);
        Iterable iterable2 = list;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it = iterable2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C17069f) it.next()) == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            C15749s.c O10 = S02.H(z10).b(arrayList).s(a());
            C17542s.i(O10, "setOriginal(...)");
            C15579z M02 = super.M0(O10);
            C17542s.g(M02);
            return M02;
        }
        z10 = false;
        C15749s.c O102 = S02.H(z10).b(arrayList).s(a());
        C17542s.i(O102, "setOriginal(...)");
        C15579z M022 = super.M0(O102);
        C17542s.g(M022);
        return M022;
    }

    public boolean E() {
        return false;
    }

    /* access modifiers changed from: protected */
    public C15749s L0(C15566m mVar, C15579z zVar, C15555b.a aVar, C17069f fVar, C15649h hVar, i0 i0Var) {
        C17542s.j(mVar, "newOwner");
        C17542s.j(aVar, "kind");
        C17542s.j(hVar, "annotations");
        C17542s.j(i0Var, "source");
        return new e(mVar, (e) zVar, aVar, isSuspend());
    }

    /* access modifiers changed from: protected */
    public C15579z M0(C15749s.c cVar) {
        C17542s.j(cVar, "configuration");
        e eVar = (e) super.M0(cVar);
        if (eVar == null) {
            return null;
        }
        List<u0> j10 = eVar.j();
        C17542s.i(j10, "getValueParameters(...)");
        Iterable<u0> iterable = j10;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return eVar;
        }
        for (u0 type : iterable) {
            C18096U type2 = type.getType();
            C17542s.i(type2, "getType(...)");
            if (C15428i.d(type2) != null) {
                List<u0> j11 = eVar.j();
                C17542s.i(j11, "getValueParameters(...)");
                Iterable<u0> iterable2 = j11;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable2, 10));
                for (u0 type3 : iterable2) {
                    C18096U type4 = type3.getType();
                    C17542s.i(type4, "getType(...)");
                    arrayList.add(C15428i.d(type4));
                }
                return eVar.p1(arrayList);
            }
        }
        return eVar;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    private e(C15566m mVar, e eVar, C15555b.a aVar, boolean z10) {
        super(mVar, eVar, C15649h.f134231V.b(), t.f133381i, aVar, i0.f133841a);
        f1(true);
        h1(z10);
        Y0(false);
    }
}
