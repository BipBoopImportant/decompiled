package uJ;

import DI.C15558e;
import DI.C15561h;
import DI.n0;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.v;
import YH.C16877v;
import YH.X;
import YH.g0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;
import tJ.C17986f;
import tJ.C17987g;
import uJ.z0;
import vJ.C18200d;
import wJ.C18227i;
import wJ.C18229k;
import wJ.C18230l;
import zJ.C18755d;

public final class D0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f147803f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C18084H f147804a;

    /* renamed from: b  reason: collision with root package name */
    private final A0 f147805b;

    /* renamed from: c  reason: collision with root package name */
    private final C17986f f147806c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f147807d;

    /* renamed from: e  reason: collision with root package name */
    private final C17987g<b, C18096U> f147808e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C18096U a(C18096U u10, J0 j02, Set<? extends n0> set, boolean z10) {
            P0 p02;
            C18096U type;
            C18096U type2;
            C18096U type3;
            J0 j03 = j02;
            Set<? extends n0> set2 = set;
            C17542s.j(u10, "<this>");
            C17542s.j(j03, "substitutor");
            P0 Q02 = u10.Q0();
            if (Q02 instanceof C18087K) {
                C18087K k10 = (C18087K) Q02;
                C18113f0 V02 = k10.V0();
                if (!V02.N0().getParameters().isEmpty() && V02.N0().e() != null) {
                    List<n0> parameters = V02.N0().getParameters();
                    C17542s.i(parameters, "getParameters(...)");
                    Iterable<n0> iterable = parameters;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (n0 n0Var : iterable) {
                        E0 e02 = (E0) C16877v.z0(u10.L0(), n0Var.getIndex());
                        if (!z10 || e02 == null || (type3 = e02.getType()) == null || C18755d.i(type3)) {
                            boolean z11 = set2 != null && set2.contains(n0Var);
                            if (e02 != null && !z11) {
                                H0 j10 = j02.j();
                                C18096U type4 = e02.getType();
                                C17542s.i(type4, "getType(...)");
                                if (j10.e(type4) != null) {
                                }
                            }
                            e02 = new C18127m0(n0Var);
                        }
                        arrayList.add(e02);
                    }
                    V02 = I0.f(V02, arrayList, (u0) null, 2, (Object) null);
                }
                C18113f0 W02 = k10.W0();
                if (!W02.N0().getParameters().isEmpty() && W02.N0().e() != null) {
                    List<n0> parameters2 = W02.N0().getParameters();
                    C17542s.i(parameters2, "getParameters(...)");
                    Iterable<n0> iterable2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                    for (n0 n0Var2 : iterable2) {
                        E0 e03 = (E0) C16877v.z0(u10.L0(), n0Var2.getIndex());
                        if (!z10 || e03 == null || (type2 = e03.getType()) == null || C18755d.i(type2)) {
                            boolean z12 = set2 != null && set2.contains(n0Var2);
                            if (e03 != null && !z12) {
                                H0 j11 = j02.j();
                                C18096U type5 = e03.getType();
                                C17542s.i(type5, "getType(...)");
                                if (j11.e(type5) != null) {
                                }
                            }
                            e03 = new C18127m0(n0Var2);
                        }
                        arrayList2.add(e03);
                    }
                    W02 = I0.f(W02, arrayList2, (u0) null, 2, (Object) null);
                }
                p02 = C18099X.e(V02, W02);
            } else if (Q02 instanceof C18113f0) {
                C18113f0 f0Var = (C18113f0) Q02;
                if (f0Var.N0().getParameters().isEmpty() || f0Var.N0().e() == null) {
                    p02 = f0Var;
                } else {
                    List<n0> parameters3 = f0Var.N0().getParameters();
                    C17542s.i(parameters3, "getParameters(...)");
                    Iterable<n0> iterable3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(C16877v.y(iterable3, 10));
                    for (n0 n0Var3 : iterable3) {
                        E0 e04 = (E0) C16877v.z0(u10.L0(), n0Var3.getIndex());
                        if (!z10 || e04 == null || (type = e04.getType()) == null || C18755d.i(type)) {
                            boolean z13 = set2 != null && set2.contains(n0Var3);
                            if (e04 != null && !z13) {
                                H0 j12 = j02.j();
                                C18096U type6 = e04.getType();
                                C17542s.i(type6, "getType(...)");
                                if (j12.e(type6) != null) {
                                }
                            }
                            e04 = new C18127m0(n0Var3);
                        }
                        arrayList3.add(e04);
                    }
                    p02 = I0.f(f0Var, arrayList3, (u0) null, 2, (Object) null);
                }
            } else {
                throw new t();
            }
            C18096U n10 = j03.n(O0.b(p02, Q02), Q0.OUT_VARIANCE);
            C17542s.i(n10, "safeSubstitute(...)");
            return n10;
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final n0 f147809a;

        /* renamed from: b  reason: collision with root package name */
        private final C18085I f147810b;

        public b(n0 n0Var, C18085I i10) {
            C17542s.j(n0Var, "typeParameter");
            C17542s.j(i10, "typeAttr");
            this.f147809a = n0Var;
            this.f147810b = i10;
        }

        public final C18085I a() {
            return this.f147810b;
        }

        public final n0 b() {
            return this.f147809a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(bVar.f147809a, this.f147809a) && C17542s.e(bVar.f147810b, this.f147810b);
        }

        public int hashCode() {
            int hashCode = this.f147809a.hashCode();
            return hashCode + (hashCode * 31) + this.f147810b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f147809a + ", typeAttr=" + this.f147810b + ')';
        }
    }

    public D0(C18084H h10, A0 a02) {
        C17542s.j(h10, "projectionComputer");
        C17542s.j(a02, "options");
        this.f147804a = h10;
        this.f147805b = a02;
        C17986f fVar = new C17986f("Type parameter upper bound erasure results");
        this.f147806c = fVar;
        this.f147807d = C16825p.b(new B0(this));
        C17987g<b, C18096U> g10 = fVar.g(new C0(this));
        C17542s.i(g10, "createMemoizedFunction(...)");
        this.f147808e = g10;
    }

    /* access modifiers changed from: private */
    public static final C18227i c(D0 d02) {
        return C18230l.d(C18229k.CANNOT_COMPUTE_ERASED_BOUND, d02.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = zJ.C18755d.D(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final uJ.C18096U d(uJ.C18085I r1) {
        /*
            r0 = this;
            uJ.f0 r1 = r1.a()
            if (r1 == 0) goto L_0x000c
            uJ.U r1 = zJ.C18755d.D(r1)
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            wJ.i r1 = r0.h()
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uJ.D0.d(uJ.I):uJ.U");
    }

    /* access modifiers changed from: private */
    public static final C18096U f(D0 d02, b bVar) {
        return d02.g(bVar.b(), bVar.a());
    }

    private final C18096U g(n0 n0Var, C18085I i10) {
        E0 e02;
        Set<n0> c10 = i10.c();
        if (c10 != null && c10.contains(n0Var.a())) {
            return d(i10);
        }
        C18113f0 r10 = n0Var.r();
        C17542s.i(r10, "getDefaultType(...)");
        Iterable<n0> l10 = C18755d.l(r10, c10);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(l10, 10)), 16));
        for (n0 n0Var2 : l10) {
            if (c10 == null || !c10.contains(n0Var2)) {
                e02 = this.f147804a.a(n0Var2, i10, this, e(n0Var2, i10.d(n0Var)));
            } else {
                e02 = M0.t(n0Var2, i10);
                C17542s.i(e02, "makeStarProjection(...)");
            }
            v a10 = C16796C.a(n0Var2.k(), e02);
            linkedHashMap.put(a10.c(), a10.d());
        }
        J0 g10 = J0.g(z0.a.e(z0.f147956c, linkedHashMap, false, 2, (Object) null));
        C17542s.i(g10, "create(...)");
        List<C18096U> upperBounds = n0Var.getUpperBounds();
        C17542s.i(upperBounds, "getUpperBounds(...)");
        Set<C18096U> i11 = i(g10, upperBounds, i10);
        if (i11.isEmpty()) {
            return d(i10);
        }
        if (this.f147805b.a()) {
            Iterable<C18096U> t12 = C16877v.t1(i11);
            ArrayList arrayList = new ArrayList(C16877v.y(t12, 10));
            for (C18096U Q02 : t12) {
                arrayList.add(Q02.Q0());
            }
            return C18200d.a(arrayList);
        } else if (i11.size() == 1) {
            return (C18096U) C16877v.a1(i11);
        } else {
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
    }

    private final C18227i h() {
        return (C18227i) this.f147807d.getValue();
    }

    private final Set<C18096U> i(J0 j02, List<? extends C18096U> list, C18085I i10) {
        Set b10 = g0.b();
        for (C18096U u10 : list) {
            C15561h e10 = u10.N0().e();
            if (e10 instanceof C15558e) {
                b10.add(f147803f.a(u10, j02, i10.c(), this.f147805b.b()));
            } else if (e10 instanceof n0) {
                Set<n0> c10 = i10.c();
                if (c10 == null || !c10.contains(e10)) {
                    List<C18096U> upperBounds = ((n0) e10).getUpperBounds();
                    C17542s.i(upperBounds, "getUpperBounds(...)");
                    b10.addAll(i(j02, upperBounds, i10));
                } else {
                    b10.add(d(i10));
                }
            }
            if (!this.f147805b.a()) {
                break;
            }
        }
        return g0.a(b10);
    }

    public final C18096U e(n0 n0Var, C18085I i10) {
        C17542s.j(n0Var, "typeParameter");
        C17542s.j(i10, "typeAttr");
        C18096U invoke = this.f147808e.invoke(new b(n0Var, i10));
        C17542s.i(invoke, "invoke(...)");
        return invoke;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D0(C18084H h10, A0 a02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(h10, (i10 & 2) != 0 ? new A0(false, false) : a02);
    }
}
