package CI;

import AI.C15423d;
import AI.C15432m;
import AI.C15435p;
import BI.f;
import YH.C16877v;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17068e;
import cJ.C17069f;
import cJ.C17071h;
import cJ.C17072i;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import lJ.C17558e;

/* renamed from: CI.c  reason: case insensitive filesystem */
public final class C15496c {

    /* renamed from: a  reason: collision with root package name */
    public static final C15496c f133492a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f133493b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f133494c;

    /* renamed from: d  reason: collision with root package name */
    private static final String f133495d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f133496e;

    /* renamed from: f  reason: collision with root package name */
    private static final C17065b f133497f;

    /* renamed from: g  reason: collision with root package name */
    private static final C17066c f133498g;

    /* renamed from: h  reason: collision with root package name */
    private static final C17065b f133499h;

    /* renamed from: i  reason: collision with root package name */
    private static final C17065b f133500i;

    /* renamed from: j  reason: collision with root package name */
    private static final C17065b f133501j;

    /* renamed from: k  reason: collision with root package name */
    private static final HashMap<C17067d, C17065b> f133502k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    private static final HashMap<C17067d, C17065b> f133503l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private static final HashMap<C17067d, C17066c> f133504m = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private static final HashMap<C17067d, C17066c> f133505n = new HashMap<>();

    /* renamed from: o  reason: collision with root package name */
    private static final HashMap<C17065b, C17065b> f133506o = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    private static final HashMap<C17065b, C17065b> f133507p = new HashMap<>();

    /* renamed from: q  reason: collision with root package name */
    private static final List<a> f133508q;

    /* renamed from: CI.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C17065b f133509a;

        /* renamed from: b  reason: collision with root package name */
        private final C17065b f133510b;

        /* renamed from: c  reason: collision with root package name */
        private final C17065b f133511c;

        public a(C17065b bVar, C17065b bVar2, C17065b bVar3) {
            C17542s.j(bVar, "javaClass");
            C17542s.j(bVar2, "kotlinReadOnly");
            C17542s.j(bVar3, "kotlinMutable");
            this.f133509a = bVar;
            this.f133510b = bVar2;
            this.f133511c = bVar3;
        }

        public final C17065b a() {
            return this.f133509a;
        }

        public final C17065b b() {
            return this.f133510b;
        }

        public final C17065b c() {
            return this.f133511c;
        }

        public final C17065b d() {
            return this.f133509a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f133509a, aVar.f133509a) && C17542s.e(this.f133510b, aVar.f133510b) && C17542s.e(this.f133511c, aVar.f133511c);
        }

        public int hashCode() {
            return (((this.f133509a.hashCode() * 31) + this.f133510b.hashCode()) * 31) + this.f133511c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f133509a + ", kotlinReadOnly=" + this.f133510b + ", kotlinMutable=" + this.f133511c + ')';
        }
    }

    static {
        C15496c cVar = new C15496c();
        f133492a = cVar;
        StringBuilder sb2 = new StringBuilder();
        f.a aVar = f.a.f133287e;
        sb2.append(aVar.b());
        sb2.append('.');
        sb2.append(aVar.a());
        f133493b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        f.b bVar = f.b.f133288e;
        sb3.append(bVar.b());
        sb3.append('.');
        sb3.append(bVar.a());
        f133494c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        f.d dVar = f.d.f133290e;
        sb4.append(dVar.b());
        sb4.append('.');
        sb4.append(dVar.a());
        f133495d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        f.c cVar2 = f.c.f133289e;
        sb5.append(cVar2.b());
        sb5.append('.');
        sb5.append(cVar2.a());
        f133496e = sb5.toString();
        C17065b.a aVar2 = C17065b.f141241d;
        C17065b c10 = aVar2.c(new C17066c("kotlin.jvm.functions.FunctionN"));
        f133497f = c10;
        f133498g = c10.a();
        C17072i iVar = C17072i.f141319a;
        f133499h = iVar.k();
        f133500i = iVar.j();
        f133501j = cVar.g(Class.class);
        C17065b c11 = aVar2.c(C15435p.a.f133086W);
        a aVar3 = new a(cVar.g(Iterable.class), c11, new C17065b(c11.f(), C17068e.g(C15435p.a.f133099e0, c11.f()), false));
        C17065b c12 = aVar2.c(C15435p.a.f133085V);
        a aVar4 = new a(cVar.g(Iterator.class), c12, new C17065b(c12.f(), C17068e.g(C15435p.a.f133097d0, c12.f()), false));
        C17065b c13 = aVar2.c(C15435p.a.f133087X);
        a aVar5 = new a(cVar.g(Collection.class), c13, new C17065b(c13.f(), C17068e.g(C15435p.a.f133101f0, c13.f()), false));
        C17065b c14 = aVar2.c(C15435p.a.f133088Y);
        a aVar6 = new a(cVar.g(List.class), c14, new C17065b(c14.f(), C17068e.g(C15435p.a.f133103g0, c14.f()), false));
        C17065b c15 = aVar2.c(C15435p.a.f133091a0);
        a aVar7 = new a(cVar.g(Set.class), c15, new C17065b(c15.f(), C17068e.g(C15435p.a.f133107i0, c15.f()), false));
        C17065b c16 = aVar2.c(C15435p.a.f133089Z);
        a aVar8 = new a(cVar.g(ListIterator.class), c16, new C17065b(c16.f(), C17068e.g(C15435p.a.f133105h0, c16.f()), false));
        C17066c cVar3 = C15435p.a.f133093b0;
        C17065b c17 = aVar2.c(cVar3);
        a aVar9 = new a(cVar.g(Map.class), c17, new C17065b(c17.f(), C17068e.g(C15435p.a.f133109j0, c17.f()), false));
        C17065b d10 = aVar2.c(cVar3).d(C15435p.a.f133095c0.f());
        List<a> q10 = C16877v.q(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(cVar.g(Map.Entry.class), d10, new C17065b(d10.f(), C17068e.g(C15435p.a.f133111k0, d10.f()), false)));
        f133508q = q10;
        cVar.f(Object.class, C15435p.a.f133092b);
        cVar.f(String.class, C15435p.a.f133104h);
        cVar.f(CharSequence.class, C15435p.a.f133102g);
        cVar.e(Throwable.class, C15435p.a.f133130u);
        cVar.f(Cloneable.class, C15435p.a.f133096d);
        cVar.f(Number.class, C15435p.a.f133124r);
        cVar.e(Comparable.class, C15435p.a.f133132v);
        cVar.f(Enum.class, C15435p.a.f133126s);
        cVar.e(Annotation.class, C15435p.a.f133061G);
        for (a d11 : q10) {
            f133492a.d(d11);
        }
        for (C17558e eVar : C17558e.values()) {
            C15496c cVar4 = f133492a;
            C17065b.a aVar10 = C17065b.f141241d;
            C17066c B10 = eVar.B();
            C17542s.i(B10, "getWrapperFqName(...)");
            C17065b c18 = aVar10.c(B10);
            C15432m v10 = eVar.v();
            C17542s.i(v10, "getPrimitiveType(...)");
            cVar4.a(c18, aVar10.c(C15435p.c(v10)));
        }
        for (C17065b next : C15423d.f132979a.a()) {
            f133492a.a(C17065b.f141241d.c(new C17066c("kotlin.jvm.internal." + next.h().b() + "CompanionObject")), next.d(C17071h.f141265d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            C15496c cVar5 = f133492a;
            cVar5.a(C17065b.f141241d.c(new C17066c("kotlin.jvm.functions.Function" + i10)), C15435p.a(i10));
            cVar5.c(new C17066c(f133494c + i10), f133499h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            f.c cVar6 = f.c.f133289e;
            f133492a.c(new C17066c((cVar6.b() + '.' + cVar6.a()) + i11), f133499h);
        }
        C15496c cVar7 = f133492a;
        cVar7.c(C15435p.a.f133094c.m(), cVar7.g(Void.class));
    }

    private C15496c() {
    }

    private final void a(C17065b bVar, C17065b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    private final void b(C17065b bVar, C17065b bVar2) {
        f133502k.put(bVar.a().i(), bVar2);
    }

    private final void c(C17066c cVar, C17065b bVar) {
        f133503l.put(cVar.i(), bVar);
    }

    private final void d(a aVar) {
        C17065b a10 = aVar.a();
        C17065b b10 = aVar.b();
        C17065b c10 = aVar.c();
        a(a10, b10);
        c(c10.a(), a10);
        f133506o.put(c10, b10);
        f133507p.put(b10, c10);
        C17066c a11 = b10.a();
        C17066c a12 = c10.a();
        f133504m.put(c10.a().i(), a11);
        f133505n.put(a11.i(), a12);
    }

    private final void e(Class<?> cls, C17066c cVar) {
        a(g(cls), C17065b.f141241d.c(cVar));
    }

    private final void f(Class<?> cls, C17067d dVar) {
        e(cls, dVar.m());
    }

    private final C17065b g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C17065b.a aVar = C17065b.f141241d;
            String canonicalName = cls.getCanonicalName();
            C17542s.i(canonicalName, "getCanonicalName(...)");
            return aVar.c(new C17066c(canonicalName));
        }
        C17065b g10 = g(declaringClass);
        C17069f v10 = C17069f.v(cls.getSimpleName());
        C17542s.i(v10, "identifier(...)");
        return g10.d(v10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        r5 = HJ.C15854t.t(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean j(cJ.C17067d r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r5 = r5.a()
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r3 = HJ.C15854t.W(r5, r6, r0, r1, r2)
            if (r3 != 0) goto L_0x000e
            return r0
        L_0x000e:
            int r6 = r6.length()
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r6 = "substring(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            r6 = 48
            boolean r6 = HJ.C15854t.e1(r5, r6, r0, r1, r2)
            if (r6 != 0) goto L_0x0032
            java.lang.Integer r5 = HJ.C15854t.t(r5)
            if (r5 == 0) goto L_0x0032
            int r5 = r5.intValue()
            r6 = 23
            if (r5 < r6) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: CI.C15496c.j(cJ.d, java.lang.String):boolean");
    }

    public final C17066c h() {
        return f133498g;
    }

    public final List<a> i() {
        return f133508q;
    }

    public final boolean k(C17067d dVar) {
        return f133504m.containsKey(dVar);
    }

    public final boolean l(C17067d dVar) {
        return f133505n.containsKey(dVar);
    }

    public final C17065b m(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return f133502k.get(cVar.i());
    }

    public final C17065b n(C17067d dVar) {
        C17542s.j(dVar, "kotlinFqName");
        return j(dVar, f133493b) ? f133497f : j(dVar, f133495d) ? f133497f : j(dVar, f133494c) ? f133499h : j(dVar, f133496e) ? f133499h : f133503l.get(dVar);
    }

    public final C17066c o(C17067d dVar) {
        return f133504m.get(dVar);
    }

    public final C17066c p(C17067d dVar) {
        return f133505n.get(dVar);
    }
}
