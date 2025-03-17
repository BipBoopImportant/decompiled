package H1;

import J2.t;
import L1.c;
import L1.l;
import L1.m;
import L1.p;
import L1.s;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import o1.C5667g;
import o1.C5668h;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\b*\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LL1/p;", "node", "LJ2/t;", "info", "LXH/N;", "d", "(LL1/p;LJ2/t;)V", "e", "", "b", "(LL1/p;)Z", "", "items", "a", "(Ljava/util/List;)Z", "LL1/b;", "LJ2/t$e;", "kotlin.jvm.PlatformType", "f", "(LL1/b;)LJ2/t$e;", "LL1/c;", "itemNode", "LJ2/t$f;", "g", "(LL1/c;LL1/p;)LJ2/t$f;", "c", "(LL1/b;)Z", "isLazyCollection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H1.a$a  reason: collision with other inner class name */
    static final class C0084a extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0084a f7048c = new C0084a();

        C0084a() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f7049c = new b();

        b() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<p> list) {
        List list2;
        long j10;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = C16877v.n();
        } else {
            list2 = new ArrayList();
            p pVar = list.get(0);
            int p10 = C16877v.p(list);
            int i10 = 0;
            while (i10 < p10) {
                i10++;
                p pVar2 = list.get(i10);
                p pVar3 = pVar2;
                p pVar4 = pVar;
                list2.add(C5667g.d(C5668h.a(Math.abs(C5667g.m(pVar4.i().m()) - C5667g.m(pVar3.i().m())), Math.abs(C5667g.n(pVar4.i().m()) - C5667g.n(pVar3.i().m())))));
                pVar = pVar2;
            }
        }
        if (list2.size() == 1) {
            j10 = ((C5667g) C16877v.w0(list2)).v();
        } else if (!list2.isEmpty()) {
            Object w02 = C16877v.w0(list2);
            int p11 = C16877v.p(list2);
            if (1 <= p11) {
                int i11 = 1;
                while (true) {
                    w02 = C5667g.d(C5667g.r(((C5667g) w02).v(), ((C5667g) list2.get(i11)).v()));
                    if (i11 == p11) {
                        break;
                    }
                    i11++;
                }
            }
            j10 = ((C5667g) w02).v();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        return C5667g.n(j10) < C5667g.m(j10);
    }

    public static final boolean b(p pVar) {
        l n10 = pVar.n();
        s sVar = s.f9010a;
        return (m.a(n10, sVar.a()) == null && m.a(pVar.n(), sVar.z()) == null) ? false : true;
    }

    private static final boolean c(L1.b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(p pVar, t tVar) {
        l n10 = pVar.n();
        s sVar = s.f9010a;
        L1.b bVar = (L1.b) m.a(n10, sVar.a());
        if (bVar != null) {
            tVar.k0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (m.a(pVar.n(), sVar.z()) != null) {
            List<p> t10 = pVar.t();
            int size = t10.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar2 = t10.get(i10);
                if (pVar2.n().k(s.f9010a.A())) {
                    arrayList.add(pVar2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean a10 = a(arrayList);
            int i11 = 1;
            int size2 = a10 ? 1 : arrayList.size();
            if (a10) {
                i11 = arrayList.size();
            }
            tVar.k0(t.e.b(size2, i11, false, 0));
        }
    }

    public static final void e(p pVar, t tVar) {
        l n10 = pVar.n();
        s sVar = s.f9010a;
        c cVar = (c) m.a(n10, sVar.b());
        if (cVar != null) {
            tVar.l0(g(cVar, pVar));
        }
        p r10 = pVar.r();
        if (r10 != null && m.a(r10.n(), sVar.z()) != null) {
            L1.b bVar = (L1.b) m.a(r10.n(), sVar.a());
            if ((bVar == null || !c(bVar)) && pVar.n().k(sVar.A())) {
                ArrayList arrayList = new ArrayList();
                List<p> t10 = r10.t();
                int size = t10.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    p pVar2 = t10.get(i11);
                    if (pVar2.n().k(s.f9010a.A())) {
                        arrayList.add(pVar2);
                        if (pVar2.q().r0() < pVar.q().r0()) {
                            i10++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a10 = a(arrayList);
                    t.f a11 = t.f.a(a10 ? 0 : i10, 1, a10 ? i10 : 0, 1, false, ((Boolean) pVar.n().s(s.f9010a.A(), C0084a.f7048c)).booleanValue());
                    if (a11 != null) {
                        tVar.l0(a11);
                    }
                }
            }
        }
    }

    private static final t.e f(L1.b bVar) {
        return t.e.b(bVar.b(), bVar.a(), false, 0);
    }

    private static final t.f g(c cVar, p pVar) {
        return t.f.a(cVar.c(), cVar.d(), cVar.a(), cVar.b(), false, ((Boolean) pVar.n().s(s.f9010a.A(), b.f7049c)).booleanValue());
    }
}
