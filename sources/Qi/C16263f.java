package QI;

import DI.C15534E;
import DI.C15558e;
import DI.C15561h;
import DI.C15562i;
import DI.a0;
import DI.h0;
import DJ.C15580a;
import KI.C15984a;
import LI.C16015b;
import PI.C16201k;
import TI.u;
import VI.C16692x;
import YH.C16870n;
import YH.C16877v;
import YH.g0;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nJ.C17656k;
import nJ.C17658m;
import tJ.C17989i;
import tJ.C17993m;
import uI.C18064m;

/* renamed from: QI.f  reason: case insensitive filesystem */
public final class C16263f implements C17656k {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f137485f = {P.h(new G(C16263f.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* renamed from: b  reason: collision with root package name */
    private final C16201k f137486b;

    /* renamed from: c  reason: collision with root package name */
    private final C16252D f137487c;

    /* renamed from: d  reason: collision with root package name */
    private final C16255G f137488d;

    /* renamed from: e  reason: collision with root package name */
    private final C17989i f137489e;

    public C16263f(C16201k kVar, u uVar, C16252D d10) {
        C17542s.j(kVar, "c");
        C17542s.j(uVar, "jPackage");
        C17542s.j(d10, "packageFragment");
        this.f137486b = kVar;
        this.f137487c = d10;
        this.f137488d = new C16255G(kVar, uVar, d10);
        this.f137489e = kVar.e().d(new C16262e(this));
    }

    private final C17656k[] j() {
        return (C17656k[]) C17993m.a(this.f137489e, this, f137485f[0]);
    }

    /* access modifiers changed from: private */
    public static final C17656k[] k(C16263f fVar) {
        ArrayList arrayList = new ArrayList();
        for (C16692x c10 : fVar.f137487c.O0().values()) {
            C17656k c11 = fVar.f137486b.a().b().c(fVar.f137487c, c10);
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        return (C17656k[]) C15580a.b(arrayList).toArray(new C17656k[0]);
    }

    public Set<C17069f> a() {
        C17656k[] j10 = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C17656k a10 : j10) {
            C16877v.E(linkedHashSet, a10.a());
        }
        linkedHashSet.addAll(this.f137488d.a());
        return linkedHashSet;
    }

    public Collection<a0> b(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        l(fVar, bVar);
        C16255G g10 = this.f137488d;
        C17656k[] j10 = j();
        Collection b10 = g10.b(fVar, bVar);
        for (C17656k b11 : j10) {
            b10 = C15580a.a(b10, b11.b(fVar, bVar));
        }
        return b10 == null ? g0.d() : b10;
    }

    public Set<C17069f> c() {
        C17656k[] j10 = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C17656k c10 : j10) {
            C16877v.E(linkedHashSet, c10.c());
        }
        linkedHashSet.addAll(this.f137488d.c());
        return linkedHashSet;
    }

    public Collection<h0> d(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        l(fVar, bVar);
        C16255G g10 = this.f137488d;
        C17656k[] j10 = j();
        Collection d10 = g10.d(fVar, bVar);
        for (C17656k d11 : j10) {
            d10 = C15580a.a(d10, d11.d(fVar, bVar));
        }
        return d10 == null ? g0.d() : d10;
    }

    public C15561h e(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        l(fVar, bVar);
        C15558e l02 = this.f137488d.e(fVar, bVar);
        if (l02 != null) {
            return l02;
        }
        C15561h hVar = null;
        for (C17656k e10 : j()) {
            C15561h e11 = e10.e(fVar, bVar);
            if (e11 != null) {
                if (!(e11 instanceof C15562i) || !((C15534E) e11).m0()) {
                    return e11;
                }
                if (hVar == null) {
                    hVar = e11;
                }
            }
        }
        return hVar;
    }

    public Set<C17069f> f() {
        Set<C17069f> a10 = C17658m.a(C16870n.T(j()));
        if (a10 == null) {
            return null;
        }
        a10.addAll(this.f137488d.f());
        return a10;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [nI.l<? super cJ.f, java.lang.Boolean>, java.lang.Object, nI.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<DI.C15566m> g(nJ.C17649d r6, nI.C17642l<? super cJ.C17069f, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            QI.G r0 = r5.f137488d
            nJ.k[] r1 = r5.j()
            java.util.Collection r0 = r0.g(r6, r7)
            int r2 = r1.length
            r3 = 0
        L_0x0016:
            if (r3 >= r2) goto L_0x0025
            r4 = r1[r3]
            java.util.Collection r4 = r4.g(r6, r7)
            java.util.Collection r0 = DJ.C15580a.a(r0, r4)
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0025:
            if (r0 != 0) goto L_0x002e
            java.util.Set r6 = YH.g0.d()
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QI.C16263f.g(nJ.d, nI.l):java.util.Collection");
    }

    public final C16255G i() {
        return this.f137488d;
    }

    public void l(C17069f fVar, C16015b bVar) {
        C17542s.j(fVar, "name");
        C17542s.j(bVar, "location");
        C15984a.b(this.f137486b.a().l(), bVar, this.f137487c, fVar);
    }

    public String toString() {
        return "scope for " + this.f137487c;
    }
}
