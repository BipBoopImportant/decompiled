package UI;

import CI.C15496c;
import MI.C16044E;
import MI.C16058b;
import MI.C16059c;
import MI.w;
import YH.C16877v;
import cJ.C17067d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import yJ.C18740i;
import yJ.m;
import yJ.n;
import yJ.o;
import yJ.p;
import yJ.u;

/* renamed from: UI.d  reason: case insensitive filesystem */
public abstract class C16583d<TAnnotation> {

    /* renamed from: UI.d$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C18740i f139015a;

        /* renamed from: b  reason: collision with root package name */
        private final C16044E f139016b;

        /* renamed from: c  reason: collision with root package name */
        private final o f139017c;

        public a(C18740i iVar, C16044E e10, o oVar) {
            this.f139015a = iVar;
            this.f139016b = e10;
            this.f139017c = oVar;
        }

        public final C16044E a() {
            return this.f139016b;
        }

        public final C18740i b() {
            return this.f139015a;
        }

        public final o c() {
            return this.f139017c;
        }
    }

    private final C16591l G(C16591l lVar, C16591l lVar2) {
        return lVar == null ? lVar2 : lVar2 == null ? lVar : (!lVar.d() || lVar2.d()) ? (lVar.d() || !lVar2.d()) ? (lVar.c().compareTo(lVar2.c()) >= 0 && lVar.c().compareTo(lVar2.c()) > 0) ? lVar : lVar2 : lVar : lVar2;
    }

    private final List<a> H(C18740i iVar) {
        return j(new a(iVar, f(iVar, r()), (o) null), new C16582c(this, A()));
    }

    /* access modifiers changed from: private */
    public static final Iterable I(C16583d dVar, p pVar, a aVar) {
        C18740i b10;
        n f02;
        List<o> M10;
        C18740i b11;
        C17542s.j(aVar, "it");
        if ((dVar.z() && (b11 = aVar.b()) != null && pVar.T(b11)) || (b10 = aVar.b()) == null || (f02 = pVar.f0(b10)) == null || (M10 = pVar.M(f02)) == null) {
            return null;
        }
        Iterable iterable = M10;
        Iterable k02 = pVar.k0(aVar.b());
        Iterator it = iterable.iterator();
        Iterator it2 = k02.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C16877v.y(iterable, 10), C16877v.y(k02, 10)));
        while (it.hasNext() && it2.hasNext()) {
            o oVar = (o) it.next();
            C18740i Y10 = pVar.Y((m) it2.next());
            arrayList.add(Y10 == null ? new a((C18740i) null, aVar.a(), oVar) : new a(Y10, dVar.f(Y10, aVar.a()), oVar));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C16587h e(r0 r0Var, C16587h[] hVarArr, int i10) {
        Map<Integer, C16587h> b10;
        C16587h hVar;
        return (r0Var == null || (b10 = r0Var.b()) == null || (hVar = b10.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= hVarArr.length) ? C16587h.f139036e.a() : hVarArr[i10] : hVar;
    }

    private final C16044E f(C18740i iVar, C16044E e10) {
        return m().d(e10, n(iVar));
    }

    private final C16587h g(C18740i iVar) {
        C16590k kVar;
        C16590k y10 = y(iVar);
        C16588i iVar2 = null;
        if (y10 == null) {
            C18740i v10 = v(iVar);
            kVar = v10 != null ? y(v10) : null;
        } else {
            kVar = y10;
        }
        p A10 = A();
        C15496c cVar = C15496c.f133492a;
        if (cVar.l(x(A10.p(iVar)))) {
            iVar2 = C16588i.READ_ONLY;
        } else if (cVar.k(x(A10.z(iVar)))) {
            iVar2 = C16588i.MUTABLE;
        }
        boolean z10 = true;
        boolean z11 = A().y0(iVar) || F(iVar);
        if (kVar == y10) {
            z10 = false;
        }
        return new C16587h(kVar, iVar2, z11, z10);
    }

    private final C16587h h(a aVar) {
        Iterable iterable;
        C16591l lVar;
        C18740i b10;
        n f02;
        C16590k kVar = null;
        if (aVar.b() == null) {
            p A10 = A();
            o c10 = aVar.c();
            if ((c10 != null ? A10.u(c10) : null) == u.IN) {
                return C16587h.f139036e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = aVar.c() == null;
        C18740i b11 = aVar.b();
        if (b11 == null || (iterable = n(b11)) == null) {
            iterable = C16877v.n();
        }
        p A11 = A();
        C18740i b12 = aVar.b();
        o h02 = (b12 == null || (f02 = A11.f0(b12)) == null) ? null : A11.h0(f02);
        boolean z12 = q() == C16059c.TYPE_PARAMETER_BOUNDS;
        if (z11) {
            if (z12 || !u() || (b10 = aVar.b()) == null || !B(b10)) {
                iterable = C16877v.T0(p(), iterable);
            } else {
                Iterable p10 = p();
                ArrayList arrayList = new ArrayList();
                for (Object next : p10) {
                    if (!m().p(next)) {
                        arrayList.add(next);
                    }
                }
                iterable = C16877v.V0(arrayList, iterable);
            }
        }
        C16588i g10 = m().g(iterable);
        C16591l h10 = m().h(iterable, new C16580a(this, aVar));
        if (h10 != null) {
            C16590k c11 = h10.c();
            if (h10.c() == C16590k.NOT_NULL && h02 != null) {
                z10 = true;
            }
            return new C16587h(c11, g10, z10, h10.d());
        }
        C16059c q10 = (z11 || z12) ? q() : C16059c.TYPE_USE;
        C16044E a10 = aVar.a();
        w a11 = a10 != null ? a10.a(q10) : null;
        C16591l o10 = h02 != null ? o(h02) : null;
        C16591l t10 = t(o10, a11);
        boolean z13 = (o10 != null ? o10.c() : null) == C16590k.NOT_NULL || !(h02 == null || a11 == null || !a11.c());
        o c12 = aVar.c();
        if (c12 == null || (lVar = o(c12)) == null) {
            lVar = null;
        } else if (lVar.c() == C16590k.NULLABLE) {
            lVar = C16591l.b(lVar, C16590k.FORCE_FLEXIBILITY, false, 2, (Object) null);
        }
        C16591l G10 = G(lVar, t10);
        if (G10 != null) {
            kVar = G10.c();
        }
        if (G10 != null && G10.d()) {
            z10 = true;
        }
        return new C16587h(kVar, g10, z13, z10);
    }

    /* access modifiers changed from: private */
    public static final boolean i(C16583d dVar, a aVar, Object obj) {
        C17542s.j(obj, "$this$extractNullability");
        return dVar.l(obj, aVar.b());
    }

    private final <T> List<T> j(T t10, C17642l<? super T, ? extends Iterable<? extends T>> lVar) {
        ArrayList arrayList = new ArrayList(1);
        k(t10, arrayList, lVar);
        return arrayList;
    }

    private final <T> void k(T t10, List<T> list, C17642l<? super T, ? extends Iterable<? extends T>> lVar) {
        list.add(t10);
        Iterable<Object> iterable = (Iterable) lVar.invoke(t10);
        if (iterable != null) {
            for (Object k10 : iterable) {
                k(k10, list, lVar);
            }
        }
    }

    private final C16591l o(o oVar) {
        List<C18740i> list;
        C16590k kVar;
        p A10 = A();
        if (!E(oVar)) {
            return null;
        }
        List<C18740i> j10 = A10.j(oVar);
        Iterable<C18740i> iterable = j10;
        boolean z10 = iterable instanceof Collection;
        if (!z10 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!A10.j0((C18740i) it.next())) {
                    if (!z10 || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (y((C18740i) it2.next()) != null) {
                                    list = j10;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z10 || !((Collection) iterable).isEmpty()) {
                        for (C18740i v10 : iterable) {
                            if (v(v10) != null) {
                                list = new ArrayList<>();
                                for (C18740i v11 : iterable) {
                                    C18740i v12 = v(v11);
                                    if (v12 != null) {
                                        list.add(v12);
                                    }
                                }
                                Iterable iterable2 = list;
                                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                    Iterator it3 = iterable2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!A10.F((C18740i) it3.next())) {
                                                kVar = C16590k.NOT_NULL;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                kVar = C16590k.NULLABLE;
                                return new C16591l(kVar, list != j10);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final C16590k y(C18740i iVar) {
        p A10 = A();
        if (A10.d0(A10.p(iVar))) {
            return C16590k.NULLABLE;
        }
        if (!A10.d0(A10.z(iVar))) {
            return C16590k.NOT_NULL;
        }
        return null;
    }

    public abstract p A();

    public abstract boolean B(C18740i iVar);

    public abstract boolean C();

    public abstract boolean D(C18740i iVar, C18740i iVar2);

    public abstract boolean E(o oVar);

    public abstract boolean F(C18740i iVar);

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        r8 = r8.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nI.C17642l<java.lang.Integer, UI.C16587h> d(yJ.C18740i r10, java.lang.Iterable<? extends yJ.C18740i> r11, UI.r0 r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.util.List r0 = r9.H(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = YH.C16877v.y(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            yJ.i r3 = (yJ.C18740i) r3
            java.util.List r3 = r9.H(r3)
            r1.add(r3)
            goto L_0x001d
        L_0x0031:
            boolean r2 = r9.w()
            r3 = 1
            if (r2 != 0) goto L_0x0068
            boolean r2 = r9.C()
            if (r2 == 0) goto L_0x0063
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L_0x004c
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x004c
            goto L_0x0063
        L_0x004c:
            java.util.Iterator r11 = r11.iterator()
        L_0x0050:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r11.next()
            yJ.i r2 = (yJ.C18740i) r2
            boolean r2 = r9.D(r10, r2)
            if (r2 != 0) goto L_0x0050
            goto L_0x0068
        L_0x0063:
            int r10 = r0.size()
            goto L_0x0069
        L_0x0068:
            r10 = r3
        L_0x0069:
            UI.h[] r11 = new UI.C16587h[r10]
            r2 = 0
            r4 = r2
        L_0x006d:
            if (r4 >= r10) goto L_0x00c7
            java.lang.Object r5 = r0.get(r4)
            UI.d$a r5 = (UI.C16583d.a) r5
            UI.h r5 = r9.h(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x0082:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00a8
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = YH.C16877v.z0(r8, r4)
            UI.d$a r8 = (UI.C16583d.a) r8
            if (r8 == 0) goto L_0x00a1
            yJ.i r8 = r8.b()
            if (r8 == 0) goto L_0x00a1
            UI.h r8 = r9.g(r8)
            goto L_0x00a2
        L_0x00a1:
            r8 = 0
        L_0x00a2:
            if (r8 == 0) goto L_0x0082
            r6.add(r8)
            goto L_0x0082
        L_0x00a8:
            if (r4 != 0) goto L_0x00b2
            boolean r7 = r9.C()
            if (r7 == 0) goto L_0x00b2
            r7 = r3
            goto L_0x00b3
        L_0x00b2:
            r7 = r2
        L_0x00b3:
            if (r4 != 0) goto L_0x00bd
            boolean r8 = r9.s()
            if (r8 == 0) goto L_0x00bd
            r8 = r3
            goto L_0x00be
        L_0x00bd:
            r8 = r2
        L_0x00be:
            UI.h r5 = UI.t0.a(r5, r6, r7, r8, r13)
            r11[r4] = r5
            int r4 = r4 + 1
            goto L_0x006d
        L_0x00c7:
            UI.b r10 = new UI.b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: UI.C16583d.d(yJ.i, java.lang.Iterable, UI.r0, boolean):nI.l");
    }

    public abstract boolean l(TAnnotation tannotation, C18740i iVar);

    public abstract C16058b<TAnnotation> m();

    public abstract Iterable<TAnnotation> n(C18740i iVar);

    public abstract Iterable<TAnnotation> p();

    public abstract C16059c q();

    public abstract C16044E r();

    public abstract boolean s();

    /* access modifiers changed from: protected */
    public abstract C16591l t(C16591l lVar, w wVar);

    public abstract boolean u();

    public abstract C18740i v(C18740i iVar);

    public boolean w() {
        return false;
    }

    public abstract C17067d x(C18740i iVar);

    public abstract boolean z();
}
