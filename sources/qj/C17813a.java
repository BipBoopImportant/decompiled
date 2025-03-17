package qJ;

import XI.C16829b;
import XI.C16831d;
import XI.g;
import XI.i;
import XI.n;
import XI.q;
import XI.s;
import XI.u;
import YH.C16877v;
import ZI.c;
import eJ.C17198i;
import eJ.C17206q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import pJ.C17755a;
import qJ.C17801N;

/* renamed from: qJ.a  reason: case insensitive filesystem */
public abstract class C17813a<A> implements C17820h<A> {

    /* renamed from: a  reason: collision with root package name */
    private final C17755a f146542a;

    /* renamed from: qJ.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C4261a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f146543a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                qJ.d[] r0 = qJ.C17816d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                qJ.d r1 = qJ.C17816d.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                qJ.d r1 = qJ.C17816d.PROPERTY_GETTER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                qJ.d r1 = qJ.C17816d.PROPERTY_SETTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f146543a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qJ.C17813a.C4261a.<clinit>():void");
        }
    }

    public C17813a(C17755a aVar) {
        C17542s.j(aVar, "protocol");
        this.f146542a = aVar;
    }

    public List<A> b(s sVar, c cVar) {
        C17542s.j(sVar, "proto");
        C17542s.j(cVar, "nameResolver");
        List list = (List) sVar.p(this.f146542a.p());
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C16829b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b i10 : iterable) {
            arrayList.add(i(i10, cVar));
        }
        return arrayList;
    }

    public List<A> c(C17801N n10, n nVar) {
        C17542s.j(n10, "container");
        C17542s.j(nVar, "proto");
        C17198i.f j10 = this.f146542a.j();
        List list = j10 != null ? (List) nVar.p(j10) : null;
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C16829b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b i10 : iterable) {
            arrayList.add(i(i10, n10.b()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<A> e(qJ.C17801N r4, eJ.C17206q r5, qJ.C17816d r6) {
        /*
            r3 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            boolean r0 = r5 instanceof XI.i
            r1 = 0
            if (r0 == 0) goto L_0x0026
            pJ.a r6 = r3.f146542a
            eJ.i$f r6 = r6.g()
            if (r6 == 0) goto L_0x0068
            XI.i r5 = (XI.i) r5
            java.lang.Object r5 = r5.p(r6)
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            goto L_0x0068
        L_0x0026:
            boolean r0 = r5 instanceof XI.n
            if (r0 == 0) goto L_0x0098
            int[] r0 = qJ.C17813a.C4261a.f146543a
            int r2 = r6.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L_0x0057
            r2 = 2
            if (r0 == r2) goto L_0x0057
            r2 = 3
            if (r0 != r2) goto L_0x003c
            goto L_0x0057
        L_0x003c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unsupported callable kind with property proto for receiver annotations: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0057:
            pJ.a r6 = r3.f146542a
            eJ.i$f r6 = r6.l()
            if (r6 == 0) goto L_0x0068
            XI.n r5 = (XI.n) r5
            java.lang.Object r5 = r5.p(r6)
            r1 = r5
            java.util.List r1 = (java.util.List) r1
        L_0x0068:
            if (r1 != 0) goto L_0x006e
            java.util.List r1 = YH.C16877v.n()
        L_0x006e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = YH.C16877v.y(r1, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r1.iterator()
        L_0x007f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r6.next()
            XI.b r0 = (XI.C16829b) r0
            ZI.c r1 = r4.b()
            java.lang.Object r0 = r3.i(r0, r1)
            r5.add(r0)
            goto L_0x007f
        L_0x0097:
            return r5
        L_0x0098:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Unknown message: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qJ.C17813a.e(qJ.N, eJ.q, qJ.d):java.util.List");
    }

    public List<A> f(C17801N.a aVar) {
        C17542s.j(aVar, "container");
        List list = (List) aVar.f().p(this.f146542a.a());
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C16829b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b i10 : iterable) {
            arrayList.add(i(i10, aVar.b()));
        }
        return arrayList;
    }

    public List<A> g(C17801N n10, n nVar) {
        C17542s.j(n10, "container");
        C17542s.j(nVar, "proto");
        C17198i.f k10 = this.f146542a.k();
        List list = k10 != null ? (List) nVar.p(k10) : null;
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C16829b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b i10 : iterable) {
            arrayList.add(i(i10, n10.b()));
        }
        return arrayList;
    }

    public List<A> h(q qVar, c cVar) {
        C17542s.j(qVar, "proto");
        C17542s.j(cVar, "nameResolver");
        List list = (List) qVar.p(this.f146542a.o());
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C16829b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b i10 : iterable) {
            arrayList.add(i(i10, cVar));
        }
        return arrayList;
    }

    public List<A> j(C17801N n10, C17206q qVar, C17816d dVar) {
        List list;
        C17542s.j(n10, "container");
        C17542s.j(qVar, "proto");
        C17542s.j(dVar, "kind");
        if (qVar instanceof C16831d) {
            list = (List) ((C16831d) qVar).p(this.f146542a.c());
        } else if (qVar instanceof i) {
            list = (List) ((i) qVar).p(this.f146542a.f());
        } else if (qVar instanceof n) {
            int i10 = C4261a.f146543a[dVar.ordinal()];
            if (i10 == 1) {
                list = (List) ((n) qVar).p(this.f146542a.i());
            } else if (i10 == 2) {
                list = (List) ((n) qVar).p(this.f146542a.m());
            } else if (i10 == 3) {
                list = (List) ((n) qVar).p(this.f146542a.n());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto");
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + qVar).toString());
        }
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C16829b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b i11 : iterable) {
            arrayList.add(i(i11, n10.b()));
        }
        return arrayList;
    }

    public List<A> k(C17801N n10, g gVar) {
        C17542s.j(n10, "container");
        C17542s.j(gVar, "proto");
        List list = (List) gVar.p(this.f146542a.d());
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C16829b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b i10 : iterable) {
            arrayList.add(i(i10, n10.b()));
        }
        return arrayList;
    }

    public List<A> l(C17801N n10, C17206q qVar, C17816d dVar, int i10, u uVar) {
        C17542s.j(n10, "container");
        C17542s.j(qVar, "callableProto");
        C17542s.j(dVar, "kind");
        C17542s.j(uVar, "proto");
        List list = (List) uVar.p(this.f146542a.h());
        if (list == null) {
            list = C16877v.n();
        }
        Iterable<C16829b> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C16829b i11 : iterable) {
            arrayList.add(i(i11, n10.b()));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final C17755a m() {
        return this.f146542a;
    }
}
