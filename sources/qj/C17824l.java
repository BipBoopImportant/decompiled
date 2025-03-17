package qJ;

import AI.C15435p;
import DI.C15544O;
import DI.C15549U;
import DI.C15558e;
import DI.i0;
import FI.C15686b;
import XI.C16830c;
import XI.t;
import XI.w;
import YH.g0;
import ZI.C17004a;
import ZI.c;
import ZI.g;
import ZI.h;
import cJ.C17065b;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import sJ.C17936m;
import sJ.C17942s;

/* renamed from: qJ.l  reason: case insensitive filesystem */
public final class C17824l {

    /* renamed from: c  reason: collision with root package name */
    public static final b f146559c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Set<C17065b> f146560d = g0.c(C17065b.f141241d.c(C15435p.a.f133096d.m()));

    /* renamed from: a  reason: collision with root package name */
    private final C17826n f146561a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<a, C15558e> f146562b;

    /* renamed from: qJ.l$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C17065b f146563a;

        /* renamed from: b  reason: collision with root package name */
        private final C17821i f146564b;

        public a(C17065b bVar, C17821i iVar) {
            C17542s.j(bVar, "classId");
            this.f146563a = bVar;
            this.f146564b = iVar;
        }

        public final C17821i a() {
            return this.f146564b;
        }

        public final C17065b b() {
            return this.f146563a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C17542s.e(this.f146563a, ((a) obj).f146563a);
        }

        public int hashCode() {
            return this.f146563a.hashCode();
        }
    }

    /* renamed from: qJ.l$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<C17065b> a() {
            return C17824l.f146560d;
        }

        private b() {
        }
    }

    public C17824l(C17826n nVar) {
        C17542s.j(nVar, "components");
        this.f146561a = nVar;
        this.f146562b = nVar.u().e(new C17823k(this));
    }

    /* access modifiers changed from: private */
    public static final C15558e c(C17824l lVar, a aVar) {
        C17542s.j(aVar, "key");
        return lVar.d(aVar);
    }

    private final C15558e d(a aVar) {
        Object obj;
        C17828p a10;
        C17065b b10 = aVar.b();
        for (C15686b b11 : this.f146561a.l()) {
            C15558e b12 = b11.b(b10);
            if (b12 != null) {
                return b12;
            }
        }
        if (f146560d.contains(b10)) {
            return null;
        }
        C17821i a11 = aVar.a();
        if (a11 == null && (a11 = this.f146561a.e().a(b10)) == null) {
            return null;
        }
        c a12 = a11.a();
        C16830c b13 = a11.b();
        C17004a c10 = a11.c();
        i0 d10 = a11.d();
        C17065b e10 = b10.e();
        if (e10 != null) {
            C15558e f10 = f(this, e10, (C17821i) null, 2, (Object) null);
            C17936m mVar = f10 instanceof C17936m ? (C17936m) f10 : null;
            if (mVar == null || !mVar.k1(b10.h())) {
                return null;
            }
            a10 = mVar.d1();
        } else {
            Iterator it = C15549U.c(this.f146561a.s(), b10.f()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C15544O o10 = (C15544O) obj;
                if (o10 instanceof C17830r) {
                    if (((C17830r) o10).K0(b10.h())) {
                        break;
                    }
                } else {
                    break;
                }
            }
            C15544O o11 = (C15544O) obj;
            if (o11 == null) {
                return null;
            }
            C17826n nVar = this.f146561a;
            t c12 = b13.c1();
            C17542s.i(c12, "getTypeTable(...)");
            g gVar = new g(c12);
            h.a aVar2 = h.f140844b;
            w e12 = b13.e1();
            C17542s.i(e12, "getVersionRequirementTable(...)");
            a10 = nVar.a(o11, a12, gVar, aVar2.a(e12), c10, (C17942s) null);
        }
        return new C17936m(a10, b13, a12, c10, d10);
    }

    public static /* synthetic */ C15558e f(C17824l lVar, C17065b bVar, C17821i iVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = null;
        }
        return lVar.e(bVar, iVar);
    }

    public final C15558e e(C17065b bVar, C17821i iVar) {
        C17542s.j(bVar, "classId");
        return this.f146562b.invoke(new a(bVar, iVar));
    }
}
