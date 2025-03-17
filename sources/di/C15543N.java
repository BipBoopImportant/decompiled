package DI;

import EI.C15649h;
import GI.C15726U;
import GI.C15740j;
import GI.C15746p;
import YH.C16877v;
import YH.U;
import YH.g0;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import nJ.C17656k;
import tI.C17974j;
import tI.C17978n;
import tJ.C17987g;
import tJ.C17994n;
import uJ.C18113f0;
import uJ.C18141v;
import uJ.Q0;
import vJ.g;

/* renamed from: DI.N  reason: case insensitive filesystem */
public final class C15543N {

    /* renamed from: a  reason: collision with root package name */
    private final C17994n f133814a;

    /* renamed from: b  reason: collision with root package name */
    private final C15538I f133815b;

    /* renamed from: c  reason: collision with root package name */
    private final C17987g<C17066c, C15544O> f133816c;

    /* renamed from: d  reason: collision with root package name */
    private final C17987g<a, C15558e> f133817d;

    /* renamed from: DI.N$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C17065b f133818a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Integer> f133819b;

        public a(C17065b bVar, List<Integer> list) {
            C17542s.j(bVar, "classId");
            C17542s.j(list, "typeParametersCount");
            this.f133818a = bVar;
            this.f133819b = list;
        }

        public final C17065b a() {
            return this.f133818a;
        }

        public final List<Integer> b() {
            return this.f133819b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f133818a, aVar.f133818a) && C17542s.e(this.f133819b, aVar.f133819b);
        }

        public int hashCode() {
            return (this.f133818a.hashCode() * 31) + this.f133819b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f133818a + ", typeParametersCount=" + this.f133819b + ')';
        }
    }

    /* renamed from: DI.N$b */
    public static final class b extends C15740j {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f133820i;

        /* renamed from: j  reason: collision with root package name */
        private final List<n0> f133821j;

        /* renamed from: k  reason: collision with root package name */
        private final C18141v f133822k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17994n nVar, C15566m mVar, C17069f fVar, boolean z10, int i10) {
            super(nVar, mVar, fVar, i0.f133841a, false);
            C17542s.j(nVar, "storageManager");
            C17542s.j(mVar, "container");
            C17542s.j(fVar, "name");
            this.f133820i = z10;
            C17974j w10 = C17978n.w(0, i10);
            ArrayList arrayList = new ArrayList(C16877v.y(w10, 10));
            Iterator it = w10.iterator();
            while (it.hasNext()) {
                int c10 = ((U) it).c();
                C15649h b10 = C15649h.f134231V.b();
                Q0 q02 = Q0.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(c10);
                arrayList.add(C15726U.R0(this, b10, false, q02, C17069f.v(sb2.toString()), c10, nVar));
            }
            this.f133821j = arrayList;
            this.f133822k = new C18141v(this, r0.g(this), g0.c(C17506e.s(this).p().i()), nVar);
        }

        public C15557d F() {
            return null;
        }

        public boolean I0() {
            return false;
        }

        /* renamed from: K0 */
        public C17656k.b o0() {
            return C17656k.b.f144864b;
        }

        /* renamed from: L0 */
        public C18141v k() {
            return this.f133822k;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M0 */
        public C17656k.b j0(g gVar) {
            C17542s.j(gVar, "kotlinTypeRefiner");
            return C17656k.b.f144864b;
        }

        public s0<C18113f0> V() {
            return null;
        }

        public boolean Y() {
            return false;
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
            return C15559f.CLASS;
        }

        public boolean isExternal() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        public Collection<C15557d> l() {
            return g0.d();
        }

        public Collection<C15558e> m() {
            return C16877v.n();
        }

        public boolean m0() {
            return false;
        }

        public boolean n() {
            return this.f133820i;
        }

        public C15558e p0() {
            return null;
        }

        public List<n0> t() {
            return this.f133821j;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        public C15535F u() {
            return C15535F.FINAL;
        }

        public boolean v() {
            return false;
        }
    }

    public C15543N(C17994n nVar, C15538I i10) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(i10, "module");
        this.f133814a = nVar;
        this.f133815b = i10;
        this.f133816c = nVar.g(new C15541L(this));
        this.f133817d = nVar.g(new C15542M(this));
    }

    /* access modifiers changed from: private */
    public static final C15558e c(C15543N n10, a aVar) {
        C15566m invoke;
        C17542s.j(aVar, "<destruct>");
        C17065b a10 = aVar.a();
        List<Integer> b10 = aVar.b();
        if (!a10.i()) {
            C17065b e10 = a10.e();
            if (e10 == null || (invoke = n10.d(e10, C16877v.n0(b10, 1))) == null) {
                invoke = n10.f133816c.invoke(a10.f());
            }
            C15566m mVar = invoke;
            boolean j10 = a10.j();
            C17994n nVar = n10.f133814a;
            C17069f h10 = a10.h();
            Integer num = (Integer) C16877v.y0(b10);
            return new b(nVar, mVar, h10, j10, num != null ? num.intValue() : 0);
        }
        throw new UnsupportedOperationException("Unresolved local class: " + a10);
    }

    /* access modifiers changed from: private */
    public static final C15544O e(C15543N n10, C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return new C15746p(n10.f133815b, cVar);
    }

    public final C15558e d(C17065b bVar, List<Integer> list) {
        C17542s.j(bVar, "classId");
        C17542s.j(list, "typeParametersCount");
        return this.f133817d.invoke(new a(bVar, list));
    }
}
