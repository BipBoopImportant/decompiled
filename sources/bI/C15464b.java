package BI;

import AI.C15435p;
import BI.f;
import DI.C15535F;
import DI.C15538I;
import DI.C15544O;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15573t;
import DI.C15574u;
import DI.C15578y;
import DI.i0;
import DI.l0;
import DI.n0;
import DI.s0;
import EI.C15649h;
import FJ.C15689a;
import GI.C15726U;
import GI.C15731a;
import XH.C16807N;
import XH.C16820k;
import YH.C16877v;
import YH.U;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import tI.C17974j;
import tJ.C17994n;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18104b;
import uJ.C18113f0;
import uJ.G0;
import uJ.Q0;
import uJ.u0;
import uJ.y0;
import vJ.g;

/* renamed from: BI.b  reason: case insensitive filesystem */
public final class C15464b extends C15731a {

    /* renamed from: n  reason: collision with root package name */
    public static final a f133270n = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final C17065b f133271o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final C17065b f133272p;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C17994n f133273f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C15544O f133274g;

    /* renamed from: h  reason: collision with root package name */
    private final f f133275h;

    /* renamed from: i  reason: collision with root package name */
    private final int f133276i;

    /* renamed from: j  reason: collision with root package name */
    private final C3287b f133277j = new C3287b();

    /* renamed from: k  reason: collision with root package name */
    private final d f133278k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final List<n0> f133279l;

    /* renamed from: m  reason: collision with root package name */
    private final c f133280m;

    /* renamed from: BI.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: BI.b$b  reason: collision with other inner class name */
    private final class C3287b extends C18104b {
        public C3287b() {
            super(C15464b.this.f133273f);
        }

        /* renamed from: K */
        public C15464b e() {
            return C15464b.this;
        }

        public boolean f() {
            return true;
        }

        public List<n0> getParameters() {
            return C15464b.this.f133279l;
        }

        /* access modifiers changed from: protected */
        public Collection<C18096U> s() {
            List list;
            f U02 = C15464b.this.U0();
            f.a aVar = f.a.f133287e;
            if (C17542s.e(U02, aVar)) {
                list = C16877v.e(C15464b.f133271o);
            } else if (C17542s.e(U02, f.b.f133288e)) {
                list = C16877v.q(C15464b.f133272p, new C17065b(C15435p.f133015A, aVar.c(C15464b.this.Q0())));
            } else {
                f.d dVar = f.d.f133290e;
                if (C17542s.e(U02, dVar)) {
                    list = C16877v.e(C15464b.f133271o);
                } else if (C17542s.e(U02, f.c.f133289e)) {
                    list = C16877v.q(C15464b.f133272p, new C17065b(C15435p.f133041s, dVar.c(C15464b.this.Q0())));
                } else {
                    C15689a.b((String) null, 1, (Object) null);
                    throw new C16820k();
                }
            }
            C15538I b10 = C15464b.this.f133274g.b();
            Iterable<C17065b> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C17065b bVar : iterable) {
                C15558e b11 = C15578y.b(b10, bVar);
                if (b11 != null) {
                    Iterable<n0> l12 = C16877v.l1(getParameters(), b11.k().getParameters().size());
                    ArrayList arrayList2 = new ArrayList(C16877v.y(l12, 10));
                    for (n0 r10 : l12) {
                        arrayList2.add(new G0(r10.r()));
                    }
                    arrayList.add(C18099X.h(u0.f147932b.k(), b11, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
            }
            return C16877v.t1(arrayList);
        }

        public String toString() {
            return e().toString();
        }

        /* access modifiers changed from: protected */
        public l0 w() {
            return l0.a.f133844a;
        }
    }

    static {
        C17066c cVar = C15435p.f133015A;
        C17069f v10 = C17069f.v("Function");
        C17542s.i(v10, "identifier(...)");
        f133271o = new C17065b(cVar, v10);
        C17066c cVar2 = C15435p.f133046x;
        C17069f v11 = C17069f.v("KFunction");
        C17542s.i(v11, "identifier(...)");
        f133272p = new C17065b(cVar2, v11);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15464b(C17994n nVar, C15544O o10, f fVar, int i10) {
        super(nVar, fVar.c(i10));
        C17542s.j(nVar, "storageManager");
        C17542s.j(o10, "containingDeclaration");
        C17542s.j(fVar, "functionTypeKind");
        this.f133273f = nVar;
        this.f133274g = o10;
        this.f133275h = fVar;
        this.f133276i = i10;
        this.f133278k = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        C17974j jVar = new C17974j(1, i10);
        ArrayList arrayList2 = new ArrayList(C16877v.y(jVar, 10));
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            int c10 = ((U) it).c();
            Q0 q02 = Q0.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(c10);
            K0(arrayList, this, q02, sb2.toString());
            arrayList2.add(C16807N.f139792a);
        }
        K0(arrayList, this, Q0.OUT_VARIANCE, "R");
        this.f133279l = C16877v.t1(arrayList);
        this.f133280m = c.Companion.a(this.f133275h);
    }

    private static final void K0(ArrayList<n0> arrayList, C15464b bVar, Q0 q02, String str) {
        arrayList.add(C15726U.R0(bVar, C15649h.f134231V.b(), false, q02, C17069f.v(str), arrayList.size(), bVar.f133273f));
    }

    public /* bridge */ /* synthetic */ C15557d F() {
        return (C15557d) Y0();
    }

    public boolean I0() {
        return false;
    }

    public final int Q0() {
        return this.f133276i;
    }

    public Void R0() {
        return null;
    }

    /* renamed from: S0 */
    public List<C15557d> l() {
        return C16877v.n();
    }

    /* renamed from: T0 */
    public C15544O b() {
        return this.f133274g;
    }

    public final f U0() {
        return this.f133275h;
    }

    public s0<C18113f0> V() {
        return null;
    }

    /* renamed from: V0 */
    public List<C15558e> m() {
        return C16877v.n();
    }

    /* renamed from: W0 */
    public C17656k.b o0() {
        return C17656k.b.f144864b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public d j0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return this.f133278k;
    }

    public boolean Y() {
        return false;
    }

    public Void Y0() {
        return null;
    }

    public boolean b0() {
        return false;
    }

    public boolean g0() {
        return false;
    }

    public C15649h getAnnotations() {
        return C15649h.f134231V.b();
    }

    public C15574u getVisibility() {
        C15574u uVar = C15573t.f133853e;
        C17542s.i(uVar, "PUBLIC");
        return uVar;
    }

    public C15559f h() {
        return C15559f.INTERFACE;
    }

    public i0 i() {
        i0 i0Var = i0.f133841a;
        C17542s.i(i0Var, "NO_SOURCE");
        return i0Var;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public y0 k() {
        return this.f133277j;
    }

    public boolean m0() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public /* bridge */ /* synthetic */ C15558e p0() {
        return (C15558e) R0();
    }

    public List<n0> t() {
        return this.f133279l;
    }

    public String toString() {
        String b10 = getName().b();
        C17542s.i(b10, "asString(...)");
        return b10;
    }

    public C15535F u() {
        return C15535F.ABSTRACT;
    }

    public boolean v() {
        return false;
    }
}
