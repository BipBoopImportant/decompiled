package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.u0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.k  reason: case insensitive filesystem */
final class C5158k implements u0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5157j f21368a;

    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21369a;

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
                androidx.datastore.preferences.protobuf.t0$b[] r0 = androidx.datastore.preferences.protobuf.t0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21369a = r0
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f21369a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.t0$b r1 = androidx.datastore.preferences.protobuf.t0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C5158k.a.<clinit>():void");
        }
    }

    private C5158k(C5157j jVar) {
        C5157j jVar2 = (C5157j) C5172z.b(jVar, "output");
        this.f21368a = jVar2;
        jVar2.f21354a = this;
    }

    public static C5158k P(C5157j jVar) {
        C5158k kVar = jVar.f21354a;
        return kVar != null ? kVar : new C5158k(jVar);
    }

    private void Q(int i10, C5152e eVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < eVar.size(); i13++) {
                i12 += C5157j.e(eVar.r(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < eVar.size()) {
                this.f21368a.k0(eVar.r(i11));
                i11++;
            }
            return;
        }
        while (i11 < eVar.size()) {
            this.f21368a.j0(i10, eVar.r(i11));
            i11++;
        }
    }

    private void R(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.e(list.get(i13).booleanValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.k0(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.j0(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    private <V> void S(int i10, boolean z10, V v10, K.a<Boolean, V> aVar) {
        this.f21368a.V0(i10, 2);
        this.f21368a.X0(K.b(aVar, Boolean.valueOf(z10), v10));
        K.e(this.f21368a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void T(int i10, K.a<Integer, V> aVar, Map<Integer, V> map) {
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
            this.f21368a.V0(i10, 2);
            this.f21368a.X0(K.b(aVar, Integer.valueOf(i13), v10));
            K.e(this.f21368a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void U(int i10, K.a<Long, V> aVar, Map<Long, V> map) {
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
            this.f21368a.V0(i10, 2);
            this.f21368a.X0(K.b(aVar, Long.valueOf(j10), v10));
            K.e(this.f21368a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void V(int i10, K.a<K, V> aVar, Map<K, V> map) {
        switch (a.f21369a[aVar.f21259a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    S(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    S(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                T(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                U(i10, aVar, map);
                return;
            case 12:
                W(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f21259a);
        }
    }

    private <V> void W(int i10, K.a<String, V> aVar, Map<String, V> map) {
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
            this.f21368a.V0(i10, 2);
            this.f21368a.X0(K.b(aVar, str2, v10));
            K.e(this.f21368a, aVar, str2, v10);
        }
    }

    private void X(int i10, C5159l lVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < lVar.size(); i13++) {
                i12 += C5157j.j(lVar.r(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < lVar.size()) {
                this.f21368a.q0(lVar.r(i11));
                i11++;
            }
            return;
        }
        while (i11 < lVar.size()) {
            this.f21368a.p0(i10, lVar.r(i11));
            i11++;
        }
    }

    private void Y(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.j(list.get(i13).doubleValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.q0(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.p0(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    private void Z(int i10, C5171y yVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < yVar.size(); i13++) {
                i12 += C5157j.l(yVar.getInt(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < yVar.size()) {
                this.f21368a.s0(yVar.getInt(i11));
                i11++;
            }
            return;
        }
        while (i11 < yVar.size()) {
            this.f21368a.r0(i10, yVar.getInt(i11));
            i11++;
        }
    }

    private void a0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.l(list.get(i13).intValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.s0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.r0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    private void b0(int i10, C5171y yVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < yVar.size(); i13++) {
                i12 += C5157j.n(yVar.getInt(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < yVar.size()) {
                this.f21368a.u0(yVar.getInt(i11));
                i11++;
            }
            return;
        }
        while (i11 < yVar.size()) {
            this.f21368a.t0(i10, yVar.getInt(i11));
            i11++;
        }
    }

    private void c0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.n(list.get(i13).intValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.u0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.t0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    private void d0(int i10, I i11, boolean z10) {
        int i12 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < i11.size(); i14++) {
                i13 += C5157j.p(i11.r(i14));
            }
            this.f21368a.X0(i13);
            while (i12 < i11.size()) {
                this.f21368a.w0(i11.r(i12));
                i12++;
            }
            return;
        }
        while (i12 < i11.size()) {
            this.f21368a.v0(i10, i11.r(i12));
            i12++;
        }
    }

    private void e0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.p(list.get(i13).longValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.w0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.v0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    private void f0(int i10, C5168v vVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < vVar.size(); i13++) {
                i12 += C5157j.r(vVar.r(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < vVar.size()) {
                this.f21368a.y0(vVar.r(i11));
                i11++;
            }
            return;
        }
        while (i11 < vVar.size()) {
            this.f21368a.x0(i10, vVar.r(i11));
            i11++;
        }
    }

    private void g0(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.r(list.get(i13).floatValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.y0(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.x0(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    private void h0(int i10, C5171y yVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < yVar.size(); i13++) {
                i12 += C5157j.w(yVar.getInt(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < yVar.size()) {
                this.f21368a.E0(yVar.getInt(i11));
                i11++;
            }
            return;
        }
        while (i11 < yVar.size()) {
            this.f21368a.D0(i10, yVar.getInt(i11));
            i11++;
        }
    }

    private void i0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.w(list.get(i13).intValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.E0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.D0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    private void j0(int i10, I i11, boolean z10) {
        int i12 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < i11.size(); i14++) {
                i13 += C5157j.y(i11.r(i14));
            }
            this.f21368a.X0(i13);
            while (i12 < i11.size()) {
                this.f21368a.G0(i11.r(i12));
                i12++;
            }
            return;
        }
        while (i12 < i11.size()) {
            this.f21368a.F0(i10, i11.r(i12));
            i12++;
        }
    }

    private void k0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.y(list.get(i13).longValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.G0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.F0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    private void l0(int i10, Object obj) {
        if (obj instanceof String) {
            this.f21368a.T0(i10, (String) obj);
        } else {
            this.f21368a.n0(i10, (C5154g) obj);
        }
    }

    private void m0(int i10, C5171y yVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < yVar.size(); i13++) {
                i12 += C5157j.L(yVar.getInt(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < yVar.size()) {
                this.f21368a.M0(yVar.getInt(i11));
                i11++;
            }
            return;
        }
        while (i11 < yVar.size()) {
            this.f21368a.L0(i10, yVar.getInt(i11));
            i11++;
        }
    }

    private void n0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.L(list.get(i13).intValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.M0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.L0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    private void o0(int i10, I i11, boolean z10) {
        int i12 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < i11.size(); i14++) {
                i13 += C5157j.N(i11.r(i14));
            }
            this.f21368a.X0(i13);
            while (i12 < i11.size()) {
                this.f21368a.O0(i11.r(i12));
                i12++;
            }
            return;
        }
        while (i12 < i11.size()) {
            this.f21368a.N0(i10, i11.r(i12));
            i12++;
        }
    }

    private void p0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.N(list.get(i13).longValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.O0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.N0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    private void q0(int i10, C5171y yVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < yVar.size(); i13++) {
                i12 += C5157j.P(yVar.getInt(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < yVar.size()) {
                this.f21368a.Q0(yVar.getInt(i11));
                i11++;
            }
            return;
        }
        while (i11 < yVar.size()) {
            this.f21368a.P0(i10, yVar.getInt(i11));
            i11++;
        }
    }

    private void s0(int i10, I i11, boolean z10) {
        int i12 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < i11.size(); i14++) {
                i13 += C5157j.R(i11.r(i14));
            }
            this.f21368a.X0(i13);
            while (i12 < i11.size()) {
                this.f21368a.S0(i11.r(i12));
                i12++;
            }
            return;
        }
        while (i12 < i11.size()) {
            this.f21368a.R0(i10, i11.r(i12));
            i12++;
        }
    }

    private void t0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.R(list.get(i13).longValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.S0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.R0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    private void u0(int i10, C5171y yVar, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < yVar.size(); i13++) {
                i12 += C5157j.W(yVar.getInt(i13));
            }
            this.f21368a.X0(i12);
            while (i11 < yVar.size()) {
                this.f21368a.X0(yVar.getInt(i11));
                i11++;
            }
            return;
        }
        while (i11 < yVar.size()) {
            this.f21368a.W0(i10, yVar.getInt(i11));
            i11++;
        }
    }

    private void w0(int i10, I i11, boolean z10) {
        int i12 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < i11.size(); i14++) {
                i13 += C5157j.Y(i11.r(i14));
            }
            this.f21368a.X0(i13);
            while (i12 < i11.size()) {
                this.f21368a.Z0(i11.r(i12));
                i12++;
            }
            return;
        }
        while (i12 < i11.size()) {
            this.f21368a.Y0(i10, i11.r(i12));
            i12++;
        }
    }

    private void x0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.Y(list.get(i13).longValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.Z0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.Y0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void A(int i10, List<Boolean> list, boolean z10) {
        if (list instanceof C5152e) {
            Q(i10, (C5152e) list, z10);
        } else {
            R(i10, list, z10);
        }
    }

    public void B(int i10, float f10) {
        this.f21368a.x0(i10, f10);
    }

    @Deprecated
    public void C(int i10) {
        this.f21368a.V0(i10, 4);
    }

    public void D(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C5171y) {
            q0(i10, (C5171y) list, z10);
        } else {
            r0(i10, list, z10);
        }
    }

    public void E(int i10, int i11) {
        this.f21368a.r0(i10, i11);
    }

    public void F(int i10, List<Long> list, boolean z10) {
        if (list instanceof I) {
            j0(i10, (I) list, z10);
        } else {
            k0(i10, list, z10);
        }
    }

    public void G(int i10, List<Double> list, boolean z10) {
        if (list instanceof C5159l) {
            X(i10, (C5159l) list, z10);
        } else {
            Y(i10, list, z10);
        }
    }

    public void H(int i10, int i11) {
        this.f21368a.P0(i10, i11);
    }

    public void I(int i10, List<C5154g> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f21368a.n0(i10, list.get(i11));
        }
    }

    public void J(int i10, List<?> list, h0 h0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), h0Var);
        }
    }

    public void K(int i10, C5154g gVar) {
        this.f21368a.n0(i10, gVar);
    }

    public void L(int i10, Object obj, h0 h0Var) {
        this.f21368a.H0(i10, (S) obj, h0Var);
    }

    public <K, V> void M(int i10, K.a<K, V> aVar, Map<K, V> map) {
        if (this.f21368a.d0()) {
            V(i10, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f21368a.V0(i10, 2);
            this.f21368a.X0(K.b(aVar, next.getKey(), next.getValue()));
            K.e(this.f21368a, aVar, next.getKey(), next.getValue());
        }
    }

    public void N(int i10, Object obj, h0 h0Var) {
        this.f21368a.A0(i10, (S) obj, h0Var);
    }

    public void O(int i10, List<?> list, h0 h0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), h0Var);
        }
    }

    public void a(int i10, List<Float> list, boolean z10) {
        if (list instanceof C5168v) {
            f0(i10, (C5168v) list, z10);
        } else {
            g0(i10, list, z10);
        }
    }

    public final void b(int i10, Object obj) {
        if (obj instanceof C5154g) {
            this.f21368a.K0(i10, (C5154g) obj);
        } else {
            this.f21368a.J0(i10, (S) obj);
        }
    }

    public void c(int i10, int i11) {
        this.f21368a.t0(i10, i11);
    }

    public void d(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof E) {
            E e10 = (E) list;
            while (i11 < list.size()) {
                l0(i10, e10.n(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.T0(i10, list.get(i11));
            i11++;
        }
    }

    public void e(int i10, String str) {
        this.f21368a.T0(i10, str);
    }

    public void f(int i10, long j10) {
        this.f21368a.Y0(i10, j10);
    }

    public void g(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C5171y) {
            h0(i10, (C5171y) list, z10);
        } else {
            i0(i10, list, z10);
        }
    }

    public void h(int i10, int i11) {
        this.f21368a.D0(i10, i11);
    }

    public void i(int i10, long j10) {
        this.f21368a.N0(i10, j10);
    }

    public void j(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C5171y) {
            b0(i10, (C5171y) list, z10);
        } else {
            c0(i10, list, z10);
        }
    }

    public void k(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C5171y) {
            u0(i10, (C5171y) list, z10);
        } else {
            v0(i10, list, z10);
        }
    }

    public void l(int i10, List<Long> list, boolean z10) {
        if (list instanceof I) {
            s0(i10, (I) list, z10);
        } else {
            t0(i10, list, z10);
        }
    }

    public void m(int i10, long j10) {
        this.f21368a.R0(i10, j10);
    }

    public void n(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C5171y) {
            Z(i10, (C5171y) list, z10);
        } else {
            a0(i10, list, z10);
        }
    }

    public void o(int i10, int i11) {
        this.f21368a.W0(i10, i11);
    }

    public void p(int i10, double d10) {
        this.f21368a.p0(i10, d10);
    }

    public void q(int i10, List<Long> list, boolean z10) {
        if (list instanceof I) {
            o0(i10, (I) list, z10);
        } else {
            p0(i10, list, z10);
        }
    }

    public void r(int i10, List<Long> list, boolean z10) {
        if (list instanceof I) {
            w0(i10, (I) list, z10);
        } else {
            x0(i10, list, z10);
        }
    }

    public void r0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.P(list.get(i13).intValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.Q0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.P0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void s(int i10, long j10) {
        this.f21368a.v0(i10, j10);
    }

    public u0.a t() {
        return u0.a.ASCENDING;
    }

    public void u(int i10, long j10) {
        this.f21368a.F0(i10, j10);
    }

    public void v(int i10, boolean z10) {
        this.f21368a.j0(i10, z10);
    }

    public void v0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f21368a.V0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += C5157j.W(list.get(i13).intValue());
            }
            this.f21368a.X0(i12);
            while (i11 < list.size()) {
                this.f21368a.X0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f21368a.W0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void w(int i10, int i11) {
        this.f21368a.L0(i10, i11);
    }

    @Deprecated
    public void x(int i10) {
        this.f21368a.V0(i10, 3);
    }

    public void y(int i10, List<Long> list, boolean z10) {
        if (list instanceof I) {
            d0(i10, (I) list, z10);
        } else {
            e0(i10, list, z10);
        }
    }

    public void z(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C5171y) {
            m0(i10, (C5171y) list, z10);
        } else {
            n0(i10, list, z10);
        }
    }
}
