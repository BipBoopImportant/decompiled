package com.google.protobuf;

import com.google.protobuf.K;
import com.google.protobuf.v0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.l  reason: case insensitive filesystem */
final class C9579l implements v0 {

    /* renamed from: a  reason: collision with root package name */
    private final C9578k f69350a;

    /* renamed from: com.google.protobuf.l$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f69351a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.u0$b[] r0 = com.google.protobuf.u0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69351a = r0
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f69351a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C9579l.a.<clinit>():void");
        }
    }

    private C9579l(C9578k kVar) {
        C9578k kVar2 = (C9578k) C9592z.b(kVar, "output");
        this.f69350a = kVar2;
        kVar2.f69323a = this;
    }

    public static C9579l P(C9578k kVar) {
        C9579l lVar = kVar.f69323a;
        return lVar != null ? lVar : new C9579l(kVar);
    }

    private <V> void Q(int i10, boolean z10, V v10, K.a<Boolean, V> aVar) {
        this.f69350a.S0(i10, 2);
        this.f69350a.U0(K.b(aVar, Boolean.valueOf(z10), v10));
        K.e(this.f69350a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void R(int i10, K.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i11 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i11] = intValue.intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f69350a.S0(i10, 2);
            this.f69350a.U0(K.b(aVar, Integer.valueOf(i13), v10));
            K.e(this.f69350a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, K.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i11 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i11] = longValue.longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f69350a.S0(i10, 2);
            this.f69350a.U0(K.b(aVar, Long.valueOf(j10), v10));
            K.e(this.f69350a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, K.a<K, V> aVar, Map<K, V> map) {
        switch (a.f69351a[aVar.f69228a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f69228a);
        }
    }

    private <V> void U(int i10, K.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i11 = 0;
        for (String str : map.keySet()) {
            strArr[i11] = str;
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str2 = strArr[i12];
            V v10 = map.get(str2);
            this.f69350a.S0(i10, 2);
            this.f69350a.U0(K.b(aVar, str2, v10));
            K.e(this.f69350a, aVar, str2, v10);
        }
    }

    private void V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f69350a.Q0(i10, (String) obj);
        } else {
            this.f69350a.k0(i10, (C9575h) obj);
        }
    }

    public void A(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.e(list.get(i13).booleanValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.h0(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.g0(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public void B(int i10, float f10) {
        this.f69350a.u0(i10, f10);
    }

    @Deprecated
    public void C(int i10) {
        this.f69350a.S0(i10, 4);
    }

    public void D(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.O(list.get(i13).intValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.N0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.M0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void E(int i10, int i11) {
        this.f69350a.o0(i10, i11);
    }

    public void F(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.y(list.get(i13).longValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.D0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.C0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void G(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.j(list.get(i13).doubleValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.n0(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.m0(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    public void H(int i10, int i11) {
        this.f69350a.M0(i10, i11);
    }

    public void I(int i10, List<C9575h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f69350a.k0(i10, list.get(i11));
        }
    }

    public void J(int i10, List<?> list, h0 h0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), h0Var);
        }
    }

    public void K(int i10, Object obj, h0 h0Var) {
        this.f69350a.x0(i10, (S) obj, h0Var);
    }

    public void L(int i10, C9575h hVar) {
        this.f69350a.k0(i10, hVar);
    }

    public void M(int i10, List<?> list, h0 h0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), h0Var);
        }
    }

    public void N(int i10, Object obj, h0 h0Var) {
        this.f69350a.E0(i10, (S) obj, h0Var);
    }

    public <K, V> void O(int i10, K.a<K, V> aVar, Map<K, V> map) {
        if (this.f69350a.b0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f69350a.S0(i10, 2);
            this.f69350a.U0(K.b(aVar, next.getKey(), next.getValue()));
            K.e(this.f69350a, aVar, next.getKey(), next.getValue());
        }
    }

    public void a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.r(list.get(i13).floatValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.v0(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.u0(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    public final void b(int i10, Object obj) {
        if (obj instanceof C9575h) {
            this.f69350a.H0(i10, (C9575h) obj);
        } else {
            this.f69350a.G0(i10, (S) obj);
        }
    }

    public void c(int i10, int i11) {
        this.f69350a.q0(i10, i11);
    }

    public void d(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof G) {
            G g10 = (G) list;
            while (i11 < list.size()) {
                V(i10, g10.n(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.Q0(i10, list.get(i11));
            i11++;
        }
    }

    public void e(int i10, String str) {
        this.f69350a.Q0(i10, str);
    }

    public void f(int i10, long j10) {
        this.f69350a.V0(i10, j10);
    }

    public void g(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.w(list.get(i13).intValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.B0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.A0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void h(int i10, int i11) {
        this.f69350a.A0(i10, i11);
    }

    public void i(int i10, long j10) {
        this.f69350a.K0(i10, j10);
    }

    public void j(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.n(list.get(i13).intValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.r0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.q0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void k(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.V(list.get(i13).intValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.U0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.T0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void l(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.Q(list.get(i13).longValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.P0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.O0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void m(int i10, long j10) {
        this.f69350a.O0(i10, j10);
    }

    public void n(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.l(list.get(i13).intValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.p0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.o0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void o(int i10, int i11) {
        this.f69350a.T0(i10, i11);
    }

    public void p(int i10, double d10) {
        this.f69350a.m0(i10, d10);
    }

    public void q(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.M(list.get(i13).longValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.L0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.K0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void r(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.X(list.get(i13).longValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.W0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.V0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void s(int i10, long j10) {
        this.f69350a.s0(i10, j10);
    }

    public v0.a t() {
        return v0.a.ASCENDING;
    }

    public void u(int i10, long j10) {
        this.f69350a.C0(i10, j10);
    }

    public void v(int i10, boolean z10) {
        this.f69350a.g0(i10, z10);
    }

    public void w(int i10, int i11) {
        this.f69350a.I0(i10, i11);
    }

    @Deprecated
    public void x(int i10) {
        this.f69350a.S0(i10, 3);
    }

    public void y(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.p(list.get(i13).longValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.t0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.s0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void z(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f69350a.S0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C9578k.K(list.get(i13).intValue());
            }
            this.f69350a.U0(i12);
            while (i11 < list.size()) {
                this.f69350a.J0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f69350a.I0(i10, list.get(i11).intValue());
            i11++;
        }
    }
}
