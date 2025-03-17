package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5170x;
import androidx.datastore.preferences.protobuf.C5172z;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.t0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.q  reason: case insensitive filesystem */
final class C5164q extends C5163p<C5170x.d> {

    /* renamed from: androidx.datastore.preferences.protobuf.q$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21411a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.t0$b[] r0 = androidx.datastore.preferences.protobuf.t0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21411a = r0
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f21411a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C5164q.a.<clinit>():void");
        }
    }

    C5164q() {
    }

    /* access modifiers changed from: package-private */
    public int a(Map.Entry<?, ?> entry) {
        return ((C5170x.d) entry.getKey()).d();
    }

    /* access modifiers changed from: package-private */
    public Object b(C5162o oVar, S s10, int i10) {
        return oVar.a(s10, i10);
    }

    /* access modifiers changed from: package-private */
    public C5166t<C5170x.d> c(Object obj) {
        return ((C5170x.c) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    public C5166t<C5170x.d> d(Object obj) {
        return ((C5170x.c) obj).N();
    }

    /* access modifiers changed from: package-private */
    public boolean e(S s10) {
        return s10 instanceof C5170x.c;
    }

    /* access modifiers changed from: package-private */
    public void f(Object obj) {
        c(obj).u();
    }

    /* access modifiers changed from: package-private */
    public <UT, UB> UB g(Object obj, g0 g0Var, Object obj2, C5162o oVar, C5166t<C5170x.d> tVar, UB ub2, o0<UT, UB> o0Var) {
        Object i10;
        ArrayList arrayList;
        C5170x.e eVar = (C5170x.e) obj2;
        int c10 = eVar.c();
        if (!eVar.f21464b.e() || !eVar.f21464b.i()) {
            Object obj3 = null;
            if (eVar.a() != t0.b.ENUM) {
                int[] iArr = a.f21411a;
                switch (iArr[eVar.a().ordinal()]) {
                    case 1:
                        obj3 = Double.valueOf(g0Var.readDouble());
                        break;
                    case 2:
                        obj3 = Float.valueOf(g0Var.readFloat());
                        break;
                    case 3:
                        obj3 = Long.valueOf(g0Var.H());
                        break;
                    case 4:
                        obj3 = Long.valueOf(g0Var.s());
                        break;
                    case 5:
                        obj3 = Integer.valueOf(g0Var.p());
                        break;
                    case 6:
                        obj3 = Long.valueOf(g0Var.b());
                        break;
                    case 7:
                        obj3 = Integer.valueOf(g0Var.u());
                        break;
                    case 8:
                        obj3 = Boolean.valueOf(g0Var.e());
                        break;
                    case 9:
                        obj3 = Integer.valueOf(g0Var.h());
                        break;
                    case 10:
                        obj3 = Integer.valueOf(g0Var.E());
                        break;
                    case 11:
                        obj3 = Long.valueOf(g0Var.f());
                        break;
                    case 12:
                        obj3 = Integer.valueOf(g0Var.l());
                        break;
                    case 13:
                        obj3 = Long.valueOf(g0Var.y());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj3 = g0Var.o();
                        break;
                    case 16:
                        obj3 = g0Var.z();
                        break;
                    case 17:
                        if (!eVar.d()) {
                            Object i11 = tVar.i(eVar.f21464b);
                            if (i11 instanceof C5170x) {
                                h0 d10 = d0.a().d(i11);
                                if (!((C5170x) i11).B()) {
                                    Object e10 = d10.e();
                                    d10.a(e10, i11);
                                    tVar.y(eVar.f21464b, e10);
                                    i11 = e10;
                                }
                                g0Var.O(i11, d10, oVar);
                                return ub2;
                            }
                        }
                        obj3 = g0Var.M(eVar.b().getClass(), oVar);
                        break;
                    case 18:
                        if (!eVar.d()) {
                            Object i12 = tVar.i(eVar.f21464b);
                            if (i12 instanceof C5170x) {
                                h0 d11 = d0.a().d(i12);
                                if (!((C5170x) i12).B()) {
                                    Object e11 = d11.e();
                                    d11.a(e11, i12);
                                    tVar.y(eVar.f21464b, e11);
                                    i12 = e11;
                                }
                                g0Var.J(i12, d11, oVar);
                                return ub2;
                            }
                        }
                        obj3 = g0Var.L(eVar.b().getClass(), oVar);
                        break;
                }
                if (eVar.d()) {
                    tVar.a(eVar.f21464b, obj3);
                } else {
                    int i13 = iArr[eVar.a().ordinal()];
                    if ((i13 == 17 || i13 == 18) && (i10 = tVar.i(eVar.f21464b)) != null) {
                        obj3 = C5172z.g(i10, obj3);
                    }
                    tVar.y(eVar.f21464b, obj3);
                }
            } else {
                g0Var.p();
                eVar.f21464b.b();
                throw null;
            }
        } else {
            switch (a.f21411a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    g0Var.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    g0Var.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    g0Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    g0Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    g0Var.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    g0Var.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    g0Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    g0Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    g0Var.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    g0Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    g0Var.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    g0Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    g0Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    g0Var.j(arrayList);
                    eVar.f21464b.b();
                    ub2 = j0.z(obj, c10, arrayList, (C5172z.d<?>) null, ub2, o0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f21464b.f());
            }
            tVar.y(eVar.f21464b, arrayList);
        }
        return ub2;
    }

    /* access modifiers changed from: package-private */
    public void h(g0 g0Var, Object obj, C5162o oVar, C5166t<C5170x.d> tVar) {
        C5170x.e eVar = (C5170x.e) obj;
        tVar.y(eVar.f21464b, g0Var.L(eVar.b().getClass(), oVar));
    }

    /* access modifiers changed from: package-private */
    public void i(C5154g gVar, Object obj, C5162o oVar, C5166t<C5170x.d> tVar) {
        C5170x.e eVar = (C5170x.e) obj;
        S.a newBuilderForType = eVar.b().newBuilderForType();
        C5155h y10 = gVar.y();
        newBuilderForType.a1(y10, oVar);
        tVar.y(eVar.f21464b, newBuilderForType.q());
        y10.a(0);
    }

    /* access modifiers changed from: package-private */
    public void j(u0 u0Var, Map.Entry<?, ?> entry) {
        C5170x.d dVar = (C5170x.d) entry.getKey();
        if (dVar.e()) {
            switch (a.f21411a[dVar.f().ordinal()]) {
                case 1:
                    j0.O(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 2:
                    j0.S(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 3:
                    j0.V(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 4:
                    j0.d0(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 5:
                    j0.U(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 6:
                    j0.R(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 7:
                    j0.Q(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 8:
                    j0.M(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 9:
                    j0.c0(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 10:
                    j0.X(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 11:
                    j0.Y(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 12:
                    j0.Z(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 13:
                    j0.a0(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 14:
                    j0.U(dVar.d(), (List) entry.getValue(), u0Var, dVar.i());
                    return;
                case 15:
                    j0.N(dVar.d(), (List) entry.getValue(), u0Var);
                    return;
                case 16:
                    j0.b0(dVar.d(), (List) entry.getValue(), u0Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        j0.T(dVar.d(), (List) entry.getValue(), u0Var, d0.a().c(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        j0.W(dVar.d(), (List) entry.getValue(), u0Var, d0.a().c(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (a.f21411a[dVar.f().ordinal()]) {
                case 1:
                    u0Var.p(dVar.d(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    u0Var.B(dVar.d(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    u0Var.u(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    u0Var.f(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    u0Var.h(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    u0Var.s(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    u0Var.c(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    u0Var.v(dVar.d(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    u0Var.o(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    u0Var.w(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    u0Var.i(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    u0Var.H(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    u0Var.m(dVar.d(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    u0Var.h(dVar.d(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    u0Var.K(dVar.d(), (C5154g) entry.getValue());
                    return;
                case 16:
                    u0Var.e(dVar.d(), (String) entry.getValue());
                    return;
                case 17:
                    u0Var.N(dVar.d(), entry.getValue(), d0.a().c(entry.getValue().getClass()));
                    return;
                case 18:
                    u0Var.L(dVar.d(), entry.getValue(), d0.a().c(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
