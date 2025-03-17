package vJ;

import AI.C15429j;
import DI.C15561h;
import DI.n0;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import hJ.C17331b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import uJ.C18096U;
import uJ.E0;
import uJ.P0;
import zJ.C18755d;

public final class n implements C17331b {

    /* renamed from: a  reason: collision with root package name */
    private final E0 f149063a;

    /* renamed from: b  reason: collision with root package name */
    private C17631a<? extends List<? extends P0>> f149064b;

    /* renamed from: c  reason: collision with root package name */
    private final n f149065c;

    /* renamed from: d  reason: collision with root package name */
    private final n0 f149066d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f149067e;

    public n(E0 e02, C17631a<? extends List<? extends P0>> aVar, n nVar, n0 n0Var) {
        C17542s.j(e02, "projection");
        this.f149063a = e02;
        this.f149064b = aVar;
        this.f149065c = nVar;
        this.f149066d = n0Var;
        this.f149067e = C16825p.a(s.PUBLICATION, new j(this));
    }

    /* access modifiers changed from: private */
    public static final List g(List list) {
        return list;
    }

    /* access modifiers changed from: private */
    public static final List h(n nVar) {
        C17631a<? extends List<? extends P0>> aVar = nVar.f149064b;
        if (aVar != null) {
            return (List) aVar.invoke();
        }
        return null;
    }

    private final List<P0> n() {
        return (List) this.f149067e.getValue();
    }

    /* access modifiers changed from: private */
    public static final List q(List list) {
        return list;
    }

    /* access modifiers changed from: private */
    public static final List s(n nVar, g gVar) {
        Iterable<P0> m10 = nVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(m10, 10));
        for (P0 S02 : m10) {
            arrayList.add(S02.S0(gVar));
        }
        return arrayList;
    }

    public E0 d() {
        return this.f149063a;
    }

    public C15561h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f149065c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f149065c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    public boolean f() {
        return false;
    }

    public List<n0> getParameters() {
        return C16877v.n();
    }

    public int hashCode() {
        n nVar = this.f149065c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    /* renamed from: m */
    public List<P0> a() {
        List<P0> n10 = n();
        return n10 == null ? C16877v.n() : n10;
    }

    public final void o(List<? extends P0> list) {
        C17542s.j(list, "supertypes");
        this.f149064b = new l(list);
    }

    public C15429j p() {
        C18096U type = d().getType();
        C17542s.i(type, "getType(...)");
        return C18755d.n(type);
    }

    /* renamed from: r */
    public n b(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        E0 b10 = d().b(gVar);
        C17542s.i(b10, "refine(...)");
        m mVar = this.f149064b != null ? new m(this, gVar) : null;
        n nVar = this.f149065c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(b10, mVar, nVar, this.f149066d);
    }

    public String toString() {
        return "CapturedType(" + d() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(E0 e02, C17631a aVar, n nVar, n0 n0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e02, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : n0Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(E0 e02, List list, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e02, list, (i10 & 4) != 0 ? null : nVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(E0 e02, List<? extends P0> list, n nVar) {
        this(e02, new k(list), nVar, (n0) null, 8, (DefaultConstructorMarker) null);
        C17542s.j(e02, "projection");
        C17542s.j(list, "supertypes");
    }
}
