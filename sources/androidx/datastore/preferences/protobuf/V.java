package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5154g;
import androidx.datastore.preferences.protobuf.C5172z;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u0;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class V<T> implements h0<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f21268r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f21269s = r0.A();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f21270a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f21271b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21272c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21273d;

    /* renamed from: e  reason: collision with root package name */
    private final S f21274e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f21275f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f21276g;

    /* renamed from: h  reason: collision with root package name */
    private final c0 f21277h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f21278i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f21279j;

    /* renamed from: k  reason: collision with root package name */
    private final int f21280k;

    /* renamed from: l  reason: collision with root package name */
    private final int f21281l;

    /* renamed from: m  reason: collision with root package name */
    private final X f21282m;

    /* renamed from: n  reason: collision with root package name */
    private final F f21283n;

    /* renamed from: o  reason: collision with root package name */
    private final o0<?, ?> f21284o;

    /* renamed from: p  reason: collision with root package name */
    private final C5163p<?> f21285p;

    /* renamed from: q  reason: collision with root package name */
    private final M f21286q;

    private V(int[] iArr, Object[] objArr, int i10, int i11, S s10, c0 c0Var, boolean z10, int[] iArr2, int i12, int i13, X x10, F f10, o0<?, ?> o0Var, C5163p<?> pVar, M m10) {
        S s11 = s10;
        C5163p<?> pVar2 = pVar;
        this.f21270a = iArr;
        this.f21271b = objArr;
        this.f21272c = i10;
        this.f21273d = i11;
        this.f21276g = s11 instanceof C5170x;
        this.f21277h = c0Var;
        this.f21275f = pVar2 != null && pVar2.e(s10);
        this.f21278i = z10;
        this.f21279j = iArr2;
        this.f21280k = i12;
        this.f21281l = i13;
        this.f21282m = x10;
        this.f21283n = f10;
        this.f21284o = o0Var;
        this.f21285p = pVar2;
        this.f21274e = s11;
        this.f21286q = m10;
    }

    private <N> boolean A(Object obj, int i10, int i11) {
        List list = (List) r0.z(obj, S(i10));
        if (list.isEmpty()) {
            return true;
        }
        h0 t10 = t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!t10.g(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean B(T t10, int i10, int i11) {
        Map<?, ?> e10 = this.f21286q.e(r0.z(t10, S(i10)));
        if (e10.isEmpty()) {
            return true;
        }
        if (this.f21286q.b(s(i11)).f21261c.a() != t0.c.MESSAGE) {
            return true;
        }
        h0<?> h0Var = null;
        for (Object next : e10.values()) {
            if (h0Var == null) {
                h0Var = d0.a().c(next.getClass());
            }
            if (!h0Var.g(next)) {
                return false;
            }
        }
        return true;
    }

    private static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C5170x) {
            return ((C5170x) obj).B();
        }
        return true;
    }

    private boolean D(T t10, T t11, int i10) {
        long Z10 = (long) (Z(i10) & 1048575);
        return r0.w(t10, Z10) == r0.w(t11, Z10);
    }

    private boolean E(T t10, int i10, int i11) {
        return r0.w(t10, (long) (Z(i11) & 1048575)) == i10;
    }

    private static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static <T> long G(T t10, long j10) {
        return r0.x(t10, j10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.datastore.preferences.protobuf.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.datastore.preferences.protobuf.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: androidx.datastore.preferences.protobuf.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: androidx.datastore.preferences.protobuf.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v33, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v34, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v35, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v36, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v37, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v38, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v39, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v40, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v41, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v42, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v43, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v46, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v47, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v48, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v49, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v50, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v51, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v52, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v53, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v54, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v55, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v57, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v58, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v65, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v66, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v67, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v68, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v70, resolved type: UB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v69, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: androidx.datastore.preferences.protobuf.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v70, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v71, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v72, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v73, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v74, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v75, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v76, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v77, resolved type: androidx.datastore.preferences.protobuf.t<ET>} */
    /* JADX WARNING: type inference failed for: r13v65, types: [boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f8, code lost:
        r14 = r6;
        r15 = r7;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010c, code lost:
        r13 = r5;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010e, code lost:
        r15 = r7;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x064b A[Catch:{ all -> 0x0671 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x06b1 A[LOOP:6: B:201:0x06ad->B:203:0x06b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x06c6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.C5166t.b<ET>> void H(androidx.datastore.preferences.protobuf.o0<UT, UB> r19, androidx.datastore.preferences.protobuf.C5163p<ET> r20, T r21, androidx.datastore.preferences.protobuf.g0 r22, androidx.datastore.preferences.protobuf.C5162o r23) {
        /*
            r18 = this;
            r8 = r18
            r7 = r19
            r15 = r21
            r0 = r22
            r6 = r23
            r17 = 0
            r5 = r17
            r9 = r5
        L_0x000f:
            int r2 = r22.A()     // Catch:{ all -> 0x06a5 }
            int r3 = r8.Y(r2)     // Catch:{ all -> 0x06a5 }
            r10 = 0
            if (r3 >= 0) goto L_0x00b7
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x003f
            int r0 = r8.f21280k
            r4 = r5
        L_0x0022:
            int r1 = r8.f21281l
            if (r0 >= r1) goto L_0x0039
            int[] r1 = r8.f21279j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0039:
            if (r4 == 0) goto L_0x003e
            r7.o(r15, r4)
        L_0x003e:
            return
        L_0x003f:
            boolean r1 = r8.f21275f     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0048
            r4 = r20
            r12 = r17
            goto L_0x0051
        L_0x0048:
            androidx.datastore.preferences.protobuf.S r1 = r8.f21274e     // Catch:{ all -> 0x005a }
            r4 = r20
            java.lang.Object r1 = r4.b(r6, r1, r2)     // Catch:{ all -> 0x005a }
            r12 = r1
        L_0x0051:
            if (r12 == 0) goto L_0x0077
            if (r9 != 0) goto L_0x005f
            androidx.datastore.preferences.protobuf.t r1 = r20.d(r21)     // Catch:{ all -> 0x005a }
            goto L_0x0060
        L_0x005a:
            r0 = move-exception
        L_0x005b:
            r11 = r15
        L_0x005c:
            r15 = r7
            goto L_0x06a9
        L_0x005f:
            r1 = r9
        L_0x0060:
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r1
            r3 = r15
            r15 = r5
            r16 = r19
            java.lang.Object r5 = r9.g(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0074 }
            r9 = r1
        L_0x0072:
            r15 = r3
            goto L_0x000f
        L_0x0074:
            r0 = move-exception
            r11 = r3
            goto L_0x005c
        L_0x0077:
            r3 = r15
            boolean r1 = r7.q(r0)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0085
            boolean r1 = r22.D()     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0093
        L_0x0084:
            goto L_0x0072
        L_0x0085:
            if (r5 != 0) goto L_0x008c
            java.lang.Object r1 = r7.f(r3)     // Catch:{ all -> 0x0074 }
            r5 = r1
        L_0x008c:
            boolean r1 = r7.m(r5, r0, r10)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0093
            goto L_0x0084
        L_0x0093:
            int r0 = r8.f21280k
            r4 = r5
        L_0x0096:
            int r1 = r8.f21281l
            if (r0 >= r1) goto L_0x00b0
            int[] r1 = r8.f21279j
            r5 = r1[r0]
            r1 = r18
            r2 = r21
            r11 = r3
            r3 = r5
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r3 = r11
            goto L_0x0096
        L_0x00b0:
            r11 = r3
            if (r4 == 0) goto L_0x00b6
            r7.o(r11, r4)
        L_0x00b6:
            return
        L_0x00b7:
            r4 = r20
            r11 = r15
            int r12 = r8.l0(r3)     // Catch:{ all -> 0x027d }
            int r1 = k0(r12)     // Catch:{ a -> 0x0281 }
            switch(r1) {
                case 0: goto L_0x0632;
                case 1: goto L_0x0620;
                case 2: goto L_0x060e;
                case 3: goto L_0x05fc;
                case 4: goto L_0x05ea;
                case 5: goto L_0x05d7;
                case 6: goto L_0x05c4;
                case 7: goto L_0x05b1;
                case 8: goto L_0x05a6;
                case 9: goto L_0x0591;
                case 10: goto L_0x057e;
                case 11: goto L_0x056b;
                case 12: goto L_0x0545;
                case 13: goto L_0x0532;
                case 14: goto L_0x051f;
                case 15: goto L_0x050c;
                case 16: goto L_0x04f9;
                case 17: goto L_0x04e4;
                case 18: goto L_0x04d2;
                case 19: goto L_0x04c0;
                case 20: goto L_0x04ae;
                case 21: goto L_0x049c;
                case 22: goto L_0x048a;
                case 23: goto L_0x0478;
                case 24: goto L_0x0466;
                case 25: goto L_0x0454;
                case 26: goto L_0x044c;
                case 27: goto L_0x0437;
                case 28: goto L_0x0425;
                case 29: goto L_0x0413;
                case 30: goto L_0x03f2;
                case 31: goto L_0x03e0;
                case 32: goto L_0x03ce;
                case 33: goto L_0x03bc;
                case 34: goto L_0x03aa;
                case 35: goto L_0x0398;
                case 36: goto L_0x0386;
                case 37: goto L_0x0374;
                case 38: goto L_0x0362;
                case 39: goto L_0x0350;
                case 40: goto L_0x033e;
                case 41: goto L_0x032c;
                case 42: goto L_0x031a;
                case 43: goto L_0x0308;
                case 44: goto L_0x02e7;
                case 45: goto L_0x02d5;
                case 46: goto L_0x02c3;
                case 47: goto L_0x02b1;
                case 48: goto L_0x029f;
                case 49: goto L_0x0284;
                case 50: goto L_0x0260;
                case 51: goto L_0x024c;
                case 52: goto L_0x0238;
                case 53: goto L_0x0224;
                case 54: goto L_0x0210;
                case 55: goto L_0x01fc;
                case 56: goto L_0x01e8;
                case 57: goto L_0x01d4;
                case 58: goto L_0x01c0;
                case 59: goto L_0x01b8;
                case 60: goto L_0x01a6;
                case 61: goto L_0x0196;
                case 62: goto L_0x0182;
                case 63: goto L_0x015d;
                case 64: goto L_0x014a;
                case 65: goto L_0x0137;
                case 66: goto L_0x0124;
                case 67: goto L_0x0111;
                case 68: goto L_0x00fc;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            if (r5 != 0) goto L_0x00d2
            java.lang.Object r5 = r7.f(r11)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x00d2
        L_0x00cc:
            r0 = move-exception
            goto L_0x005c
        L_0x00ce:
            r14 = r6
            r15 = r7
            goto L_0x0645
        L_0x00d2:
            boolean r1 = r7.m(r5, r0, r10)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            if (r1 != 0) goto L_0x00f8
            int r0 = r8.f21280k
            r4 = r5
        L_0x00db:
            int r1 = r8.f21281l
            if (r0 >= r1) goto L_0x00f2
            int[] r1 = r8.f21279j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x00db
        L_0x00f2:
            if (r4 == 0) goto L_0x00f7
            r7.o(r11, r4)
        L_0x00f7:
            return
        L_0x00f8:
            r14 = r6
            r15 = r7
            goto L_0x06a0
        L_0x00fc:
            java.lang.Object r1 = r8.N(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.S r1 = (androidx.datastore.preferences.protobuf.S) r1     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.h0 r12 = r8.t(r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r0.O(r1, r12, r6)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.j0(r11, r2, r3, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
        L_0x010c:
            r13 = r5
            r14 = r6
        L_0x010e:
            r15 = r7
            goto L_0x0643
        L_0x0111:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            long r14 = r22.y()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0124:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            int r1 = r22.l()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0137:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            long r14 = r22.f()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x014a:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            int r1 = r22.E()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x015d:
            int r1 = r22.k()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.z$e r13 = r8.r(r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            if (r13 == 0) goto L_0x0173
            boolean r13 = r13.a(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            if (r13 == 0) goto L_0x016e
            goto L_0x0173
        L_0x016e:
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.j0.J(r11, r2, r1, r5, r7)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x00f8
        L_0x0173:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0182:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            int r1 = r22.h()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0196:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.g r1 = r22.o()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01a6:
            java.lang.Object r1 = r8.N(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.S r1 = (androidx.datastore.preferences.protobuf.S) r1     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.h0 r12 = r8.t(r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r0.J(r1, r12, r6)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.j0(r11, r2, r3, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01b8:
            r8.c0(r11, r12, r0)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01c0:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            boolean r1 = r22.e()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01d4:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            int r1 = r22.u()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01e8:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            long r14 = r22.b()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x01fc:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            int r1 = r22.p()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0210:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            long r14 = r22.s()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0224:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            long r14 = r22.H()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0238:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            float r1 = r22.readFloat()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x024c:
            long r12 = S(r12)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            double r14 = r22.readDouble()     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            java.lang.Double r1 = java.lang.Double.valueOf(r14)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            androidx.datastore.preferences.protobuf.r0.O(r11, r12, r1)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            r8.g0(r11, r2, r3)     // Catch:{ a -> 0x00ce, all -> 0x00cc }
            goto L_0x010c
        L_0x0260:
            java.lang.Object r12 = r8.s(r3)     // Catch:{ a -> 0x0281 }
            r1 = r18
            r2 = r21
            r4 = r12
            r13 = r5
            r5 = r23
            r14 = r6
            r6 = r22
            r1.I(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0279, all -> 0x0274 }
            goto L_0x010e
        L_0x0274:
            r0 = move-exception
            r15 = r7
        L_0x0276:
            r5 = r13
            goto L_0x06a9
        L_0x0279:
            r15 = r7
        L_0x027a:
            r5 = r13
            goto L_0x0645
        L_0x027d:
            r0 = move-exception
            r13 = r5
            goto L_0x005c
        L_0x0281:
            r13 = r5
            goto L_0x00ce
        L_0x0284:
            r13 = r5
            r14 = r6
            long r4 = S(r12)     // Catch:{ a -> 0x0279, all -> 0x0274 }
            androidx.datastore.preferences.protobuf.h0 r6 = r8.t(r3)     // Catch:{ a -> 0x0279, all -> 0x0274 }
            r1 = r18
            r2 = r21
            r3 = r4
            r5 = r22
            r15 = r7
            r7 = r23
            r1.a0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x029d:
            r0 = move-exception
            goto L_0x0276
        L_0x029f:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.d(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x02b1:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.r(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x02c3:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.v(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x02d5:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.c(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x02e7:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r4 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r4 = r1.c(r11, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.j(r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.z$e r5 = r8.r(r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r13
            r6 = r19
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.j0.A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x06a0
        L_0x0308:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.t(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x031a:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.m(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x032c:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.x(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x033e:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.q(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0350:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.w(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0362:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.g(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0374:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.i(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0386:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.C(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0398:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.G(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03aa:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.d(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03bc:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.r(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03ce:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.v(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03e0:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.c(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x03f2:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r4 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r4 = r1.c(r11, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.j(r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.z$e r5 = r8.r(r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r13
            r6 = r19
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.j0.A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x06a0
        L_0x0413:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.t(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0425:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.F(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0437:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.h0 r5 = r8.t(r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r1 = r18
            r2 = r21
            r3 = r12
            r4 = r22
            r6 = r23
            r1.b0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x044c:
            r13 = r5
            r14 = r6
            r15 = r7
            r8.d0(r11, r12, r0)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0454:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.m(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0466:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.x(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0478:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.q(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x048a:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.w(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x049c:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.g(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04ae:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.i(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04c0:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.C(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04d2:
            r13 = r5
            r14 = r6
            r15 = r7
            androidx.datastore.preferences.protobuf.F r1 = r8.f21283n     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r2 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            java.util.List r1 = r1.c(r11, r2)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.G(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04e4:
            r13 = r5
            r14 = r6
            r15 = r7
            java.lang.Object r1 = r8.M(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.S r1 = (androidx.datastore.preferences.protobuf.S) r1     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.h0 r2 = r8.t(r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.O(r1, r2, r14)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.i0(r11, r3, r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x04f9:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r4 = r22.y()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.N(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x050c:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            int r4 = r22.l()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.M(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x051f:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r4 = r22.f()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.N(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0532:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            int r4 = r22.E()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.M(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0545:
            r13 = r5
            r14 = r6
            r15 = r7
            int r1 = r22.k()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.z$e r4 = r8.r(r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            if (r4 == 0) goto L_0x055f
            boolean r4 = r4.a(r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            if (r4 == 0) goto L_0x0559
            goto L_0x055f
        L_0x0559:
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.j0.J(r11, r2, r1, r13, r15)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x06a0
        L_0x055f:
            long r4 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.M(r11, r4, r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x056b:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            int r4 = r22.h()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.M(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x057e:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.g r4 = r22.o()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.O(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0591:
            r13 = r5
            r14 = r6
            r15 = r7
            java.lang.Object r1 = r8.M(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.S r1 = (androidx.datastore.preferences.protobuf.S) r1     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.h0 r2 = r8.t(r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r0.J(r1, r2, r14)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.i0(r11, r3, r1)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05a6:
            r13 = r5
            r14 = r6
            r15 = r7
            r8.c0(r11, r12, r0)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05b1:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            boolean r4 = r22.e()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.E(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05c4:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            int r4 = r22.u()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.M(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05d7:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r4 = r22.b()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.N(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05ea:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            int r4 = r22.p()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.M(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x05fc:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r4 = r22.s()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.N(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x060e:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            long r4 = r22.H()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.N(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0620:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            float r4 = r22.readFloat()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.L(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
            goto L_0x0643
        L_0x0632:
            r13 = r5
            r14 = r6
            r15 = r7
            long r1 = S(r12)     // Catch:{ a -> 0x027a, all -> 0x029d }
            double r4 = r22.readDouble()     // Catch:{ a -> 0x027a, all -> 0x029d }
            androidx.datastore.preferences.protobuf.r0.K(r11, r1, r4)     // Catch:{ a -> 0x027a, all -> 0x029d }
            r8.f0(r11, r3)     // Catch:{ a -> 0x027a, all -> 0x029d }
        L_0x0643:
            r5 = r13
            goto L_0x06a0
        L_0x0645:
            boolean r1 = r15.q(r0)     // Catch:{ all -> 0x0671 }
            if (r1 == 0) goto L_0x0673
            boolean r1 = r22.D()     // Catch:{ all -> 0x0671 }
            if (r1 != 0) goto L_0x06a0
            int r0 = r8.f21280k
            r4 = r5
        L_0x0654:
            int r1 = r8.f21281l
            if (r0 >= r1) goto L_0x066b
            int[] r1 = r8.f21279j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0654
        L_0x066b:
            if (r4 == 0) goto L_0x0670
            r15.o(r11, r4)
        L_0x0670:
            return
        L_0x0671:
            r0 = move-exception
            goto L_0x06a9
        L_0x0673:
            if (r5 != 0) goto L_0x067a
            java.lang.Object r1 = r15.f(r11)     // Catch:{ all -> 0x0671 }
            r5 = r1
        L_0x067a:
            boolean r1 = r15.m(r5, r0, r10)     // Catch:{ all -> 0x0671 }
            if (r1 != 0) goto L_0x06a0
            int r0 = r8.f21280k
            r4 = r5
        L_0x0683:
            int r1 = r8.f21281l
            if (r0 >= r1) goto L_0x069a
            int[] r1 = r8.f21279j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0683
        L_0x069a:
            if (r4 == 0) goto L_0x069f
            r15.o(r11, r4)
        L_0x069f:
            return
        L_0x06a0:
            r6 = r14
            r7 = r15
            r15 = r11
            goto L_0x000f
        L_0x06a5:
            r0 = move-exception
            r13 = r5
            goto L_0x005b
        L_0x06a9:
            int r1 = r8.f21280k
            r7 = r1
            r4 = r5
        L_0x06ad:
            int r1 = r8.f21281l
            if (r7 >= r1) goto L_0x06c4
            int[] r1 = r8.f21279j
            r3 = r1[r7]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x06ad
        L_0x06c4:
            if (r4 == 0) goto L_0x06c9
            r15.o(r11, r4)
        L_0x06c9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.V.H(androidx.datastore.preferences.protobuf.o0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.g0, androidx.datastore.preferences.protobuf.o):void");
    }

    private final <K, V> void I(Object obj, int i10, Object obj2, C5162o oVar, g0 g0Var) {
        long S10 = S(l0(i10));
        Object z10 = r0.z(obj, S10);
        if (z10 == null) {
            z10 = this.f21286q.d(obj2);
            r0.O(obj, S10, z10);
        } else if (this.f21286q.h(z10)) {
            Object d10 = this.f21286q.d(obj2);
            this.f21286q.a(d10, z10);
            r0.O(obj, S10, d10);
            z10 = d10;
        }
        g0Var.N(this.f21286q.c(z10), this.f21286q.b(obj2), oVar);
    }

    private void J(T t10, T t11, int i10) {
        if (x(t11, i10)) {
            long S10 = S(l0(i10));
            Unsafe unsafe = f21269s;
            Object object = unsafe.getObject(t11, S10);
            if (object != null) {
                h0 t12 = t(i10);
                if (!x(t10, i10)) {
                    if (!C(object)) {
                        unsafe.putObject(t10, S10, object);
                    } else {
                        Object e10 = t12.e();
                        t12.a(e10, object);
                        unsafe.putObject(t10, S10, e10);
                    }
                    f0(t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, S10);
                if (!C(object2)) {
                    Object e11 = t12.e();
                    t12.a(e11, object2);
                    unsafe.putObject(t10, S10, e11);
                    object2 = e11;
                }
                t12.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t11);
        }
    }

    private void K(T t10, T t11, int i10) {
        int R10 = R(i10);
        if (E(t11, R10, i10)) {
            long S10 = S(l0(i10));
            Unsafe unsafe = f21269s;
            Object object = unsafe.getObject(t11, S10);
            if (object != null) {
                h0 t12 = t(i10);
                if (!E(t10, R10, i10)) {
                    if (!C(object)) {
                        unsafe.putObject(t10, S10, object);
                    } else {
                        Object e10 = t12.e();
                        t12.a(e10, object);
                        unsafe.putObject(t10, S10, e10);
                    }
                    g0(t10, R10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, S10);
                if (!C(object2)) {
                    Object e11 = t12.e();
                    t12.a(e11, object2);
                    unsafe.putObject(t10, S10, e11);
                    object2 = e11;
                }
                t12.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t11);
        }
    }

    private void L(T t10, T t11, int i10) {
        int l02 = l0(i10);
        long S10 = S(l02);
        int R10 = R(i10);
        switch (k0(l02)) {
            case 0:
                if (x(t11, i10)) {
                    r0.K(t10, S10, r0.u(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (x(t11, i10)) {
                    r0.L(t10, S10, r0.v(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (x(t11, i10)) {
                    r0.N(t10, S10, r0.x(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 3:
                if (x(t11, i10)) {
                    r0.N(t10, S10, r0.x(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 4:
                if (x(t11, i10)) {
                    r0.M(t10, S10, r0.w(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 5:
                if (x(t11, i10)) {
                    r0.N(t10, S10, r0.x(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 6:
                if (x(t11, i10)) {
                    r0.M(t10, S10, r0.w(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 7:
                if (x(t11, i10)) {
                    r0.E(t10, S10, r0.p(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (x(t11, i10)) {
                    r0.O(t10, S10, r0.z(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 9:
                J(t10, t11, i10);
                return;
            case 10:
                if (x(t11, i10)) {
                    r0.O(t10, S10, r0.z(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 11:
                if (x(t11, i10)) {
                    r0.M(t10, S10, r0.w(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 12:
                if (x(t11, i10)) {
                    r0.M(t10, S10, r0.w(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 13:
                if (x(t11, i10)) {
                    r0.M(t10, S10, r0.w(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 14:
                if (x(t11, i10)) {
                    r0.N(t10, S10, r0.x(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 15:
                if (x(t11, i10)) {
                    r0.M(t10, S10, r0.w(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 16:
                if (x(t11, i10)) {
                    r0.N(t10, S10, r0.x(t11, S10));
                    f0(t10, i10);
                    return;
                }
                return;
            case 17:
                J(t10, t11, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
            case BuildConfig.MIN_SDK_VERSION /*24*/:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case BuildConfig.TARGET_SDK_VERSION /*33*/:
            case 34:
            case ImageFormat.YUV_420_888 /*35*/:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f21283n.b(t10, t11, S10);
                return;
            case 50:
                j0.F(this.f21286q, t10, t11, S10);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(t11, R10, i10)) {
                    r0.O(t10, S10, r0.z(t11, S10));
                    g0(t10, R10, i10);
                    return;
                }
                return;
            case 60:
                K(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t11, R10, i10)) {
                    r0.O(t10, S10, r0.z(t11, S10));
                    g0(t10, R10, i10);
                    return;
                }
                return;
            case 68:
                K(t10, t11, i10);
                return;
            default:
                return;
        }
    }

    private Object M(T t10, int i10) {
        h0 t11 = t(i10);
        long S10 = S(l0(i10));
        if (!x(t10, i10)) {
            return t11.e();
        }
        Object object = f21269s.getObject(t10, S10);
        if (C(object)) {
            return object;
        }
        Object e10 = t11.e();
        if (object != null) {
            t11.a(e10, object);
        }
        return e10;
    }

    private Object N(T t10, int i10, int i11) {
        h0 t11 = t(i11);
        if (!E(t10, i10, i11)) {
            return t11.e();
        }
        Object object = f21269s.getObject(t10, S(l0(i11)));
        if (C(object)) {
            return object;
        }
        Object e10 = t11.e();
        if (object != null) {
            t11.a(e10, object);
        }
        return e10;
    }

    static <T> V<T> O(Class<T> cls, P p10, X x10, F f10, o0<?, ?> o0Var, C5163p<?> pVar, M m10) {
        return p10 instanceof f0 ? Q((f0) p10, x10, f10, o0Var, pVar, m10) : P((l0) p10, x10, f10, o0Var, pVar, m10);
    }

    static <T> V<T> P(l0 l0Var, X x10, F f10, o0<?, ?> o0Var, C5163p<?> pVar, M m10) {
        C5165s[] e10 = l0Var.e();
        if (e10.length == 0) {
            int length = e10.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e10.length <= 0) {
                int[] d10 = l0Var.d();
                if (d10 == null) {
                    d10 = f21268r;
                }
                if (e10.length <= 0) {
                    int[] iArr2 = f21268r;
                    int[] iArr3 = f21268r;
                    int[] iArr4 = new int[(d10.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d10, 0, iArr4, 0, d10.length);
                    System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
                    return new V(iArr, objArr, 0, 0, l0Var.b(), l0Var.c(), true, iArr4, d10.length, d10.length + iArr2.length, x10, f10, o0Var, pVar, m10);
                }
                C5165s sVar = e10[0];
                throw null;
            }
            C5165s sVar2 = e10[0];
            throw null;
        }
        C5165s sVar3 = e10[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> androidx.datastore.preferences.protobuf.V<T> Q(androidx.datastore.preferences.protobuf.f0 r31, androidx.datastore.preferences.protobuf.X r32, androidx.datastore.preferences.protobuf.F r33, androidx.datastore.preferences.protobuf.o0<?, ?> r34, androidx.datastore.preferences.protobuf.C5163p<?> r35, androidx.datastore.preferences.protobuf.M r36) {
        /*
            java.lang.String r0 = r31.e()
            int r1 = r0.length()
            r2 = 0
            char r3 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L_0x001d
            r3 = 1
        L_0x0013:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x001e
            r3 = r6
            goto L_0x0013
        L_0x001d:
            r6 = 1
        L_0x001e:
            int r3 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x003d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x002a:
            int r9 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x003a
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r8
            r6 = r6 | r3
            int r8 = r8 + 13
            r3 = r9
            goto L_0x002a
        L_0x003a:
            int r3 = r3 << r8
            r6 = r6 | r3
            r3 = r9
        L_0x003d:
            if (r6 != 0) goto L_0x004e
            int[] r6 = f21268r
            r10 = r2
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r17 = r15
            r16 = r6
            r6 = r17
            goto L_0x0158
        L_0x004e:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x006d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x005a:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x006a
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r3 = r3 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x005a
        L_0x006a:
            int r6 = r6 << r8
            r3 = r3 | r6
            r6 = r9
        L_0x006d:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x008c
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0079:
            int r10 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0089
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x0079
        L_0x0089:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r10
        L_0x008c:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00ab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0098:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00a8
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0098
        L_0x00a8:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r11
        L_0x00ab:
            int r10 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00ca
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00b7:
            int r12 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00c7
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00b7
        L_0x00c7:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00ca:
            int r11 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00e9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00d6:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00e6
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00d6
        L_0x00e6:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00e9:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x0108
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00f5:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0105
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00f5
        L_0x0105:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x0108:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0127
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0114:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0124
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x0114
        L_0x0124:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0127:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0148
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0133:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0144
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0133
        L_0x0144:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0148:
            int r15 = r13 + r11
            int r15 = r15 + r12
            int[] r12 = new int[r15]
            int r15 = r3 * 2
            int r15 = r15 + r6
            r6 = r3
            r16 = r12
            r17 = r13
            r3 = r14
            r12 = r8
            r13 = r9
        L_0x0158:
            sun.misc.Unsafe r8 = f21269s
            java.lang.Object[] r9 = r31.d()
            androidx.datastore.preferences.protobuf.S r14 = r31.b()
            java.lang.Class r14 = r14.getClass()
            int r2 = r10 * 3
            int[] r2 = new int[r2]
            int r10 = r10 * 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r19 = r17 + r11
            r21 = r17
            r22 = r19
            r11 = 0
            r20 = 0
        L_0x0177:
            if (r3 >= r1) goto L_0x03bc
            int r23 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x019f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r7 = r23
            r23 = 13
        L_0x0187:
            int r24 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x0199
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r23
            r3 = r3 | r7
            int r23 = r23 + 13
            r7 = r24
            goto L_0x0187
        L_0x0199:
            int r7 = r7 << r23
            r3 = r3 | r7
            r7 = r24
            goto L_0x01a1
        L_0x019f:
            r7 = r23
        L_0x01a1:
            int r23 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x01c7
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01af:
            int r25 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01c1
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r7 = r7 | r4
            int r23 = r23 + 13
            r4 = r25
            goto L_0x01af
        L_0x01c1:
            int r4 = r4 << r23
            r7 = r7 | r4
            r4 = r25
            goto L_0x01c9
        L_0x01c7:
            r4 = r23
        L_0x01c9:
            r5 = r7 & 255(0xff, float:3.57E-43)
            r25 = r1
            r1 = r7 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x01d6
            int r1 = r11 + 1
            r16[r11] = r20
            r11 = r1
        L_0x01d6:
            r1 = 51
            r27 = r11
            if (r5 < r1) goto L_0x027f
            int r1 = r4 + 1
            char r4 = r0.charAt(r4)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r11) goto L_0x0205
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x01eb:
            int r30 = r1 + 1
            char r1 = r0.charAt(r1)
            if (r1 < r11) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r29
            r4 = r4 | r1
            int r29 = r29 + 13
            r1 = r30
            r11 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01eb
        L_0x0200:
            int r1 = r1 << r29
            r4 = r4 | r1
            r1 = r30
        L_0x0205:
            int r11 = r5 + -51
            r29 = r1
            r1 = 9
            if (r11 == r1) goto L_0x0234
            r1 = 17
            if (r11 != r1) goto L_0x0212
            goto L_0x0234
        L_0x0212:
            r1 = 12
            if (r11 != r1) goto L_0x0241
            androidx.datastore.preferences.protobuf.c0 r1 = r31.c()
            androidx.datastore.preferences.protobuf.c0 r11 = androidx.datastore.preferences.protobuf.c0.PROTO2
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0226
            r1 = r7 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0241
        L_0x0226:
            int r1 = r20 / 3
            int r1 = r1 * 2
            r11 = 1
            int r1 = r1 + r11
            int r11 = r15 + 1
            r15 = r9[r15]
            r10[r1] = r15
        L_0x0232:
            r15 = r11
            goto L_0x0241
        L_0x0234:
            int r1 = r20 / 3
            int r1 = r1 * 2
            r11 = 1
            int r1 = r1 + r11
            int r11 = r15 + 1
            r15 = r9[r15]
            r10[r1] = r15
            goto L_0x0232
        L_0x0241:
            int r4 = r4 * 2
            r1 = r9[r4]
            boolean r11 = r1 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x024e
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x024b:
            r30 = r12
            goto L_0x0257
        L_0x024e:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = e0(r14, r1)
            r9[r4] = r1
            goto L_0x024b
        L_0x0257:
            long r11 = r8.objectFieldOffset(r1)
            int r1 = (int) r11
            int r4 = r4 + 1
            r11 = r9[r4]
            boolean r12 = r11 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x0267
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x026f
        L_0x0267:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = e0(r14, r11)
            r9[r4] = r11
        L_0x026f:
            long r11 = r8.objectFieldOffset(r11)
            int r4 = (int) r11
            r26 = r13
            r23 = r15
            r12 = r29
            r15 = r0
            r0 = r4
            r4 = 0
            goto L_0x037a
        L_0x027f:
            r30 = r12
            int r1 = r15 + 1
            r11 = r9[r15]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = e0(r14, r11)
            r12 = 9
            if (r5 == r12) goto L_0x0293
            r12 = 17
            if (r5 != r12) goto L_0x0298
        L_0x0293:
            r26 = r13
            r13 = 1
            goto L_0x0302
        L_0x0298:
            r12 = 27
            if (r5 == r12) goto L_0x02a0
            r12 = 49
            if (r5 != r12) goto L_0x02a4
        L_0x02a0:
            r26 = r13
            r13 = 1
            goto L_0x02f6
        L_0x02a4:
            r12 = 12
            if (r5 == r12) goto L_0x02da
            r12 = 30
            if (r5 == r12) goto L_0x02da
            r12 = 44
            if (r5 != r12) goto L_0x02b1
            goto L_0x02da
        L_0x02b1:
            r12 = 50
            if (r5 != r12) goto L_0x02d1
            int r12 = r21 + 1
            r16[r21] = r20
            int r21 = r20 / 3
            int r21 = r21 * 2
            int r26 = r15 + 2
            r1 = r9[r1]
            r10[r21] = r1
            r1 = r7 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x02d5
            int r21 = r21 + 1
            int r1 = r15 + 3
            r15 = r9[r26]
            r10[r21] = r15
            r21 = r12
        L_0x02d1:
            r26 = r13
        L_0x02d3:
            r13 = 1
            goto L_0x030d
        L_0x02d5:
            r21 = r12
            r1 = r26
            goto L_0x02d1
        L_0x02da:
            androidx.datastore.preferences.protobuf.c0 r12 = r31.c()
            r26 = r13
            androidx.datastore.preferences.protobuf.c0 r13 = androidx.datastore.preferences.protobuf.c0.PROTO2
            if (r12 == r13) goto L_0x02e8
            r12 = r7 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x02d3
        L_0x02e8:
            int r12 = r20 / 3
            int r12 = r12 * 2
            r13 = 1
            int r12 = r12 + r13
            int r15 = r15 + 2
            r1 = r9[r1]
            r10[r12] = r1
        L_0x02f4:
            r1 = r15
            goto L_0x030d
        L_0x02f6:
            int r12 = r20 / 3
            int r12 = r12 * 2
            int r12 = r12 + r13
            int r15 = r15 + 2
            r1 = r9[r1]
            r10[r12] = r1
            goto L_0x02f4
        L_0x0302:
            int r12 = r20 / 3
            int r12 = r12 * 2
            int r12 = r12 + r13
            java.lang.Class r15 = r11.getType()
            r10[r12] = r15
        L_0x030d:
            long r11 = r8.objectFieldOffset(r11)
            int r11 = (int) r11
            r12 = r7 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0363
            r12 = 17
            if (r5 > r12) goto L_0x0363
            int r12 = r4 + 1
            char r4 = r0.charAt(r4)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x0340
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L_0x0329:
            int r24 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r15) goto L_0x033b
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r23
            r4 = r4 | r12
            int r23 = r23 + 13
            r12 = r24
            goto L_0x0329
        L_0x033b:
            int r12 = r12 << r23
            r4 = r4 | r12
            r12 = r24
        L_0x0340:
            int r23 = r6 * 2
            int r24 = r4 / 32
            int r23 = r23 + r24
            r13 = r9[r23]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0352
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x034e:
            r15 = r0
            r23 = r1
            goto L_0x035b
        L_0x0352:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = e0(r14, r13)
            r9[r23] = r13
            goto L_0x034e
        L_0x035b:
            long r0 = r8.objectFieldOffset(r13)
            int r0 = (int) r0
            int r4 = r4 % 32
            goto L_0x036b
        L_0x0363:
            r15 = r0
            r23 = r1
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r4
            r4 = 0
        L_0x036b:
            r1 = 18
            if (r5 < r1) goto L_0x0379
            r1 = 49
            if (r5 > r1) goto L_0x0379
            int r1 = r22 + 1
            r16[r22] = r11
            r22 = r1
        L_0x0379:
            r1 = r11
        L_0x037a:
            int r11 = r20 + 1
            r2[r20] = r3
            int r3 = r20 + 2
            r13 = r7 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0387
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0388
        L_0x0387:
            r13 = 0
        L_0x0388:
            r28 = r6
            r6 = r7 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0391
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0392
        L_0x0391:
            r6 = 0
        L_0x0392:
            r6 = r6 | r13
            r7 = r7 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x039a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x039b
        L_0x039a:
            r7 = 0
        L_0x039b:
            r6 = r6 | r7
            int r5 = r5 << 20
            r5 = r5 | r6
            r1 = r1 | r5
            r2[r11] = r1
            int r20 = r20 + 3
            int r1 = r4 << 20
            r0 = r0 | r1
            r2[r3] = r0
            r3 = r12
            r0 = r15
            r15 = r23
            r1 = r25
            r13 = r26
            r11 = r27
            r6 = r28
            r12 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0177
        L_0x03bc:
            r30 = r12
            r26 = r13
            androidx.datastore.preferences.protobuf.V r0 = new androidx.datastore.preferences.protobuf.V
            androidx.datastore.preferences.protobuf.S r13 = r31.b()
            androidx.datastore.preferences.protobuf.c0 r14 = r31.c()
            r15 = 0
            r8 = r0
            r9 = r2
            r11 = r30
            r12 = r26
            r18 = r19
            r19 = r32
            r20 = r33
            r21 = r34
            r22 = r35
            r23 = r36
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.V.Q(androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.X, androidx.datastore.preferences.protobuf.F, androidx.datastore.preferences.protobuf.o0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.M):androidx.datastore.preferences.protobuf.V");
    }

    private int R(int i10) {
        return this.f21270a[i10];
    }

    private static long S(int i10) {
        return (long) (i10 & 1048575);
    }

    private static <T> boolean T(T t10, long j10) {
        return ((Boolean) r0.z(t10, j10)).booleanValue();
    }

    private static <T> double U(T t10, long j10) {
        return ((Double) r0.z(t10, j10)).doubleValue();
    }

    private static <T> float V(T t10, long j10) {
        return ((Float) r0.z(t10, j10)).floatValue();
    }

    private static <T> int W(T t10, long j10) {
        return ((Integer) r0.z(t10, j10)).intValue();
    }

    private static <T> long X(T t10, long j10) {
        return ((Long) r0.z(t10, j10)).longValue();
    }

    private int Y(int i10) {
        if (i10 < this.f21272c || i10 > this.f21273d) {
            return -1;
        }
        return h0(i10, 0);
    }

    private int Z(int i10) {
        return this.f21270a[i10 + 2];
    }

    private <E> void a0(Object obj, long j10, g0 g0Var, h0<E> h0Var, C5162o oVar) {
        g0Var.P(this.f21283n.c(obj, j10), h0Var, oVar);
    }

    private <E> void b0(Object obj, int i10, g0 g0Var, h0<E> h0Var, C5162o oVar) {
        g0Var.K(this.f21283n.c(obj, S(i10)), h0Var, oVar);
    }

    private void c0(Object obj, int i10, g0 g0Var) {
        if (w(i10)) {
            r0.O(obj, S(i10), g0Var.I());
        } else if (this.f21276g) {
            r0.O(obj, S(i10), g0Var.z());
        } else {
            r0.O(obj, S(i10), g0Var.o());
        }
    }

    private boolean d(T t10, T t11, int i10) {
        return x(t10, i10) == x(t11, i10);
    }

    private void d0(Object obj, int i10, g0 g0Var) {
        if (w(i10)) {
            g0Var.n(this.f21283n.c(obj, S(i10)));
        } else {
            g0Var.B(this.f21283n.c(obj, S(i10)));
        }
    }

    private static Field e0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void f0(T t10, int i10) {
        int Z10 = Z(i10);
        long j10 = (long) (1048575 & Z10);
        if (j10 != 1048575) {
            r0.M(t10, j10, (1 << (Z10 >>> 20)) | r0.w(t10, j10));
        }
    }

    private void g0(T t10, int i10, int i11) {
        r0.M(t10, (long) (Z(i11) & 1048575), i10);
    }

    private int h0(int i10, int i11) {
        int length = (this.f21270a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int R10 = R(i13);
            if (i10 == R10) {
                return i13;
            }
            if (i10 < R10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void i0(T t10, int i10, Object obj) {
        f21269s.putObject(t10, S(l0(i10)), obj);
        f0(t10, i10);
    }

    private void j0(T t10, int i10, int i11, Object obj) {
        f21269s.putObject(t10, S(l0(i11)), obj);
        g0(t10, i10, i11);
    }

    private static <T> boolean k(T t10, long j10) {
        return r0.p(t10, j10);
    }

    private static int k0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static void l(Object obj) {
        if (!C(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    private int l0(int i10) {
        return this.f21270a[i10 + 1];
    }

    private static <T> double m(T t10, long j10) {
        return r0.u(t10, j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ba, code lost:
        r19 = r4;
        r20 = r11;
        r16 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0617, code lost:
        r15 = r15 + 3;
        r0 = r9;
        r1 = r16;
        r2 = r17;
        r11 = r20;
        r13 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        r20 = r11;
        r16 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m0(T r22, androidx.datastore.preferences.protobuf.u0 r23) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r23
            boolean r0 = r6.f21275f
            if (r0 == 0) goto L_0x0022
            androidx.datastore.preferences.protobuf.p<?> r0 = r6.f21285p
            androidx.datastore.preferences.protobuf.t r0 = r0.c(r7)
            boolean r1 = r0.n()
            if (r1 != 0) goto L_0x0022
            java.util.Iterator r0 = r0.t()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r10 = r0
            goto L_0x0024
        L_0x0022:
            r1 = 0
            r10 = 0
        L_0x0024:
            int[] r0 = r6.f21270a
            int r11 = r0.length
            sun.misc.Unsafe r12 = f21269s
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r13
            r2 = 0
            r15 = 0
        L_0x002f:
            if (r15 >= r11) goto L_0x0625
            int r3 = r6.l0(r15)
            int r5 = r6.R(r15)
            int r4 = k0(r3)
            r9 = 17
            if (r4 > r9) goto L_0x006a
            int[] r9 = r6.f21270a
            int r16 = r15 + 2
            r9 = r9[r16]
            r14 = r9 & r13
            if (r14 == r0) goto L_0x005b
            if (r14 != r13) goto L_0x0051
            r17 = r1
            r2 = 0
            goto L_0x0059
        L_0x0051:
            r17 = r1
            long r0 = (long) r14
            int r0 = r12.getInt(r7, r0)
            r2 = r0
        L_0x0059:
            r0 = r14
            goto L_0x005d
        L_0x005b:
            r17 = r1
        L_0x005d:
            int r1 = r9 >>> 20
            r9 = 1
            int r1 = r9 << r1
            r9 = r0
            r18 = r1
            r14 = r17
        L_0x0067:
            r17 = r2
            goto L_0x0072
        L_0x006a:
            r17 = r1
            r9 = r0
            r14 = r17
            r18 = 0
            goto L_0x0067
        L_0x0072:
            if (r14 == 0) goto L_0x0091
            androidx.datastore.preferences.protobuf.p<?> r0 = r6.f21285p
            int r0 = r0.a(r14)
            if (r0 > r5) goto L_0x0091
            androidx.datastore.preferences.protobuf.p<?> r0 = r6.f21285p
            r0.j(r8, r14)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r14 = r0
            goto L_0x0072
        L_0x008f:
            r14 = 0
            goto L_0x0072
        L_0x0091:
            long r2 = S(r3)
            switch(r4) {
                case 0: goto L_0x05f8;
                case 1: goto L_0x05d8;
                case 2: goto L_0x05b8;
                case 3: goto L_0x0597;
                case 4: goto L_0x0576;
                case 5: goto L_0x0555;
                case 6: goto L_0x0534;
                case 7: goto L_0x0513;
                case 8: goto L_0x04f2;
                case 9: goto L_0x04cd;
                case 10: goto L_0x04aa;
                case 11: goto L_0x0489;
                case 12: goto L_0x0468;
                case 13: goto L_0x0447;
                case 14: goto L_0x0426;
                case 15: goto L_0x0405;
                case 16: goto L_0x03e4;
                case 17: goto L_0x03be;
                case 18: goto L_0x03ae;
                case 19: goto L_0x039e;
                case 20: goto L_0x038e;
                case 21: goto L_0x037e;
                case 22: goto L_0x036e;
                case 23: goto L_0x035e;
                case 24: goto L_0x034e;
                case 25: goto L_0x033e;
                case 26: goto L_0x032f;
                case 27: goto L_0x031c;
                case 28: goto L_0x030d;
                case 29: goto L_0x02fe;
                case 30: goto L_0x02ef;
                case 31: goto L_0x02e0;
                case 32: goto L_0x02d1;
                case 33: goto L_0x02c2;
                case 34: goto L_0x02ac;
                case 35: goto L_0x029c;
                case 36: goto L_0x028c;
                case 37: goto L_0x027c;
                case 38: goto L_0x026c;
                case 39: goto L_0x025c;
                case 40: goto L_0x024c;
                case 41: goto L_0x023c;
                case 42: goto L_0x022c;
                case 43: goto L_0x021c;
                case 44: goto L_0x020c;
                case 45: goto L_0x01fc;
                case 46: goto L_0x01ec;
                case 47: goto L_0x01dc;
                case 48: goto L_0x01cc;
                case 49: goto L_0x01b9;
                case 50: goto L_0x01b0;
                case 51: goto L_0x01a1;
                case 52: goto L_0x0192;
                case 53: goto L_0x0183;
                case 54: goto L_0x0174;
                case 55: goto L_0x0165;
                case 56: goto L_0x0156;
                case 57: goto L_0x0147;
                case 58: goto L_0x0138;
                case 59: goto L_0x0129;
                case 60: goto L_0x0116;
                case 61: goto L_0x0106;
                case 62: goto L_0x00f8;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00dc;
                case 65: goto L_0x00ce;
                case 66: goto L_0x00c0;
                case 67: goto L_0x00b2;
                case 68: goto L_0x00a0;
                default: goto L_0x0098;
            }
        L_0x0098:
            r20 = r11
            r16 = r14
            r19 = 0
            goto L_0x0617
        L_0x00a0:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r15)
            r8.N(r5, r0, r1)
            goto L_0x0098
        L_0x00b2:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.m(r5, r0)
            goto L_0x0098
        L_0x00c0:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.H(r5, r0)
            goto L_0x0098
        L_0x00ce:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.i(r5, r0)
            goto L_0x0098
        L_0x00dc:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.w(r5, r0)
            goto L_0x0098
        L_0x00ea:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.E(r5, r0)
            goto L_0x0098
        L_0x00f8:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.o(r5, r0)
            goto L_0x0098
        L_0x0106:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C5154g) r0
            r8.K(r5, r0)
            goto L_0x0098
        L_0x0116:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r15)
            r8.L(r5, r0, r1)
            goto L_0x0098
        L_0x0129:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            r6.p0(r5, r0, r8)
            goto L_0x0098
        L_0x0138:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            boolean r0 = T(r7, r2)
            r8.v(r5, r0)
            goto L_0x0098
        L_0x0147:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.c(r5, r0)
            goto L_0x0098
        L_0x0156:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.s(r5, r0)
            goto L_0x0098
        L_0x0165:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = W(r7, r2)
            r8.h(r5, r0)
            goto L_0x0098
        L_0x0174:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.f(r5, r0)
            goto L_0x0098
        L_0x0183:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = X(r7, r2)
            r8.u(r5, r0)
            goto L_0x0098
        L_0x0192:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            float r0 = V(r7, r2)
            r8.B(r5, r0)
            goto L_0x0098
        L_0x01a1:
            boolean r0 = r6.E(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            double r0 = U(r7, r2)
            r8.p(r5, r0)
            goto L_0x0098
        L_0x01b0:
            java.lang.Object r0 = r12.getObject(r7, r2)
            r6.o0(r8, r5, r0, r15)
            goto L_0x0098
        L_0x01b9:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0 r2 = r6.t(r15)
            androidx.datastore.preferences.protobuf.j0.T(r0, r1, r8, r2)
            goto L_0x0098
        L_0x01cc:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 1
            androidx.datastore.preferences.protobuf.j0.a0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01dc:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.Z(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01ec:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.Y(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01fc:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.X(r0, r1, r8, r4)
            goto L_0x0098
        L_0x020c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.P(r0, r1, r8, r4)
            goto L_0x0098
        L_0x021c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.c0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x022c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.M(r0, r1, r8, r4)
            goto L_0x0098
        L_0x023c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.Q(r0, r1, r8, r4)
            goto L_0x0098
        L_0x024c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.R(r0, r1, r8, r4)
            goto L_0x0098
        L_0x025c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.U(r0, r1, r8, r4)
            goto L_0x0098
        L_0x026c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.d0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x027c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.V(r0, r1, r8, r4)
            goto L_0x0098
        L_0x028c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.S(r0, r1, r8, r4)
            goto L_0x0098
        L_0x029c:
            r4 = 1
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.O(r0, r1, r8, r4)
            goto L_0x0098
        L_0x02ac:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            androidx.datastore.preferences.protobuf.j0.a0(r0, r1, r8, r4)
        L_0x02ba:
            r19 = r4
            r20 = r11
            r16 = r14
            goto L_0x0617
        L_0x02c2:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.Z(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02d1:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.Y(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02e0:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.X(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02ef:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.P(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02fe:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.c0(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x030d:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.N(r0, r1, r8)
            goto L_0x0098
        L_0x031c:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0 r2 = r6.t(r15)
            androidx.datastore.preferences.protobuf.j0.W(r0, r1, r8, r2)
            goto L_0x0098
        L_0x032f:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.b0(r0, r1, r8)
            goto L_0x0098
        L_0x033e:
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            androidx.datastore.preferences.protobuf.j0.M(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x034e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.Q(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x035e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.R(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x036e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.U(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x037e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.d0(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x038e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.V(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x039e:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.S(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x03ae:
            r4 = 0
            int r0 = r6.R(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.j0.O(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x03be:
            r4 = 0
            r0 = r21
            r1 = r22
            r16 = r14
            r13 = r2
            r2 = r15
            r3 = r9
            r19 = r4
            r4 = r17
            r20 = r11
            r11 = r5
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r15)
            r8.N(r11, r0, r1)
            goto L_0x0617
        L_0x03e4:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.m(r11, r0)
            goto L_0x0617
        L_0x0405:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.H(r11, r0)
            goto L_0x0617
        L_0x0426:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.i(r11, r0)
            goto L_0x0617
        L_0x0447:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.w(r11, r0)
            goto L_0x0617
        L_0x0468:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.E(r11, r0)
            goto L_0x0617
        L_0x0489:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.o(r11, r0)
            goto L_0x0617
        L_0x04aa:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C5154g) r0
            r8.K(r11, r0)
            goto L_0x0617
        L_0x04cd:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r15)
            r8.L(r11, r0, r1)
            goto L_0x0617
        L_0x04f2:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            r6.p0(r11, r0, r8)
            goto L_0x0617
        L_0x0513:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            boolean r0 = k(r7, r13)
            r8.v(r11, r0)
            goto L_0x0617
        L_0x0534:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.c(r11, r0)
            goto L_0x0617
        L_0x0555:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.s(r11, r0)
            goto L_0x0617
        L_0x0576:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.h(r11, r0)
            goto L_0x0617
        L_0x0597:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.f(r11, r0)
            goto L_0x0617
        L_0x05b8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.u(r11, r0)
            goto L_0x0617
        L_0x05d8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            float r0 = q(r7, r13)
            r8.B(r11, r0)
            goto L_0x0617
        L_0x05f8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            double r0 = m(r7, r13)
            r8.p(r11, r0)
        L_0x0617:
            int r15 = r15 + 3
            r0 = r9
            r1 = r16
            r2 = r17
            r11 = r20
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002f
        L_0x0625:
            r17 = r1
        L_0x0627:
            if (r1 == 0) goto L_0x063e
            androidx.datastore.preferences.protobuf.p<?> r0 = r6.f21285p
            r0.j(r8, r1)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x063c
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1 = r0
            goto L_0x0627
        L_0x063c:
            r1 = 0
            goto L_0x0627
        L_0x063e:
            androidx.datastore.preferences.protobuf.o0<?, ?> r0 = r6.f21284o
            r6.q0(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.V.m0(java.lang.Object, androidx.datastore.preferences.protobuf.u0):void");
    }

    private boolean n(T t10, T t11, int i10) {
        int l02 = l0(i10);
        long S10 = S(l02);
        switch (k0(l02)) {
            case 0:
                return d(t10, t11, i10) && Double.doubleToLongBits(r0.u(t10, S10)) == Double.doubleToLongBits(r0.u(t11, S10));
            case 1:
                return d(t10, t11, i10) && Float.floatToIntBits(r0.v(t10, S10)) == Float.floatToIntBits(r0.v(t11, S10));
            case 2:
                return d(t10, t11, i10) && r0.x(t10, S10) == r0.x(t11, S10);
            case 3:
                return d(t10, t11, i10) && r0.x(t10, S10) == r0.x(t11, S10);
            case 4:
                return d(t10, t11, i10) && r0.w(t10, S10) == r0.w(t11, S10);
            case 5:
                return d(t10, t11, i10) && r0.x(t10, S10) == r0.x(t11, S10);
            case 6:
                return d(t10, t11, i10) && r0.w(t10, S10) == r0.w(t11, S10);
            case 7:
                return d(t10, t11, i10) && r0.p(t10, S10) == r0.p(t11, S10);
            case 8:
                return d(t10, t11, i10) && j0.I(r0.z(t10, S10), r0.z(t11, S10));
            case 9:
                return d(t10, t11, i10) && j0.I(r0.z(t10, S10), r0.z(t11, S10));
            case 10:
                return d(t10, t11, i10) && j0.I(r0.z(t10, S10), r0.z(t11, S10));
            case 11:
                return d(t10, t11, i10) && r0.w(t10, S10) == r0.w(t11, S10);
            case 12:
                return d(t10, t11, i10) && r0.w(t10, S10) == r0.w(t11, S10);
            case 13:
                return d(t10, t11, i10) && r0.w(t10, S10) == r0.w(t11, S10);
            case 14:
                return d(t10, t11, i10) && r0.x(t10, S10) == r0.x(t11, S10);
            case 15:
                return d(t10, t11, i10) && r0.w(t10, S10) == r0.w(t11, S10);
            case 16:
                return d(t10, t11, i10) && r0.x(t10, S10) == r0.x(t11, S10);
            case 17:
                return d(t10, t11, i10) && j0.I(r0.z(t10, S10), r0.z(t11, S10));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
            case BuildConfig.MIN_SDK_VERSION /*24*/:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case BuildConfig.TARGET_SDK_VERSION /*33*/:
            case 34:
            case ImageFormat.YUV_420_888 /*35*/:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return j0.I(r0.z(t10, S10), r0.z(t11, S10));
            case 50:
                return j0.I(r0.z(t10, S10), r0.z(t11, S10));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return D(t10, t11, i10) && j0.I(r0.z(t10, S10), r0.z(t11, S10));
            default:
                return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void n0(T r11, androidx.datastore.preferences.protobuf.u0 r12) {
        /*
            r10 = this;
            androidx.datastore.preferences.protobuf.o0<?, ?> r0 = r10.f21284o
            r10.q0(r0, r11, r12)
            boolean r0 = r10.f21275f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.p<?> r0 = r10.f21285p
            androidx.datastore.preferences.protobuf.t r0 = r0.c(r11)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f21270a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.l0(r3)
            int r5 = r10.R(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            androidx.datastore.preferences.protobuf.p<?> r6 = r10.f21285p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            androidx.datastore.preferences.protobuf.p<?> r6 = r10.f21285p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = k0(r4)
            r7 = 0
            r8 = 1
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            androidx.datastore.preferences.protobuf.h0 r6 = r10.t(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            androidx.datastore.preferences.protobuf.g r4 = (androidx.datastore.preferences.protobuf.C5154g) r4
            r12.K(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            androidx.datastore.preferences.protobuf.h0 r6 = r10.t(r3)
            r12.L(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            r10.p0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            boolean r4 = T(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = W(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = X(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            float r4 = V(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            double r6 = U(r11, r6)
            r12.p(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            r10.o0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0 r6 = r10.t(r3)
            androidx.datastore.preferences.protobuf.j0.T(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.X(r5, r4, r12, r8)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.c0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.M(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.U(r5, r4, r12, r8)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.O(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.X(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.c0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.N(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0 r6 = r10.t(r3)
            androidx.datastore.preferences.protobuf.j0.W(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.R(r3)
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.b0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.M(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.U(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.R(r3)
            long r8 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.j0.O(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            androidx.datastore.preferences.protobuf.h0 r6 = r10.t(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            androidx.datastore.preferences.protobuf.g r4 = (androidx.datastore.preferences.protobuf.C5154g) r4
            r12.K(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            androidx.datastore.preferences.protobuf.h0 r6 = r10.t(r3)
            r12.L(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.r0.z(r11, r6)
            r10.p0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            boolean r4 = k(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            int r4 = v(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            long r6 = G(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            float r4 = q(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.x(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = S(r4)
            double r6 = m(r11, r6)
            r12.p(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            androidx.datastore.preferences.protobuf.p<?> r11 = r10.f21285p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.V.n0(java.lang.Object, androidx.datastore.preferences.protobuf.u0):void");
    }

    private <UT, UB> UB o(Object obj, int i10, UB ub2, o0<UT, UB> o0Var, Object obj2) {
        C5172z.e r10;
        int R10 = R(i10);
        Object z10 = r0.z(obj, S(l0(i10)));
        if (z10 == null || (r10 = r(i10)) == null) {
            return ub2;
        }
        return p(i10, R10, this.f21286q.c(z10), r10, ub2, o0Var, obj2);
    }

    private <K, V> void o0(u0 u0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            u0Var.M(i10, this.f21286q.b(s(i11)), this.f21286q.e(obj));
        }
    }

    private <K, V, UT, UB> UB p(int i10, int i11, Map<K, V> map, C5172z.e eVar, UB ub2, o0<UT, UB> o0Var, Object obj) {
        K.a<?, ?> b10 = this.f21286q.b(s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = o0Var.f(obj);
                }
                C5154g.h x10 = C5154g.x(K.b(b10, next.getKey(), next.getValue()));
                try {
                    K.e(x10.b(), b10, next.getKey(), next.getValue());
                    o0Var.d(ub2, i11, x10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void p0(int i10, Object obj, u0 u0Var) {
        if (obj instanceof String) {
            u0Var.e(i10, (String) obj);
        } else {
            u0Var.K(i10, (C5154g) obj);
        }
    }

    private static <T> float q(T t10, long j10) {
        return r0.v(t10, j10);
    }

    private <UT, UB> void q0(o0<UT, UB> o0Var, T t10, u0 u0Var) {
        o0Var.t(o0Var.g(t10), u0Var);
    }

    private C5172z.e r(int i10) {
        return (C5172z.e) this.f21271b[((i10 / 3) * 2) + 1];
    }

    private Object s(int i10) {
        return this.f21271b[(i10 / 3) * 2];
    }

    private h0 t(int i10) {
        int i11 = (i10 / 3) * 2;
        h0 h0Var = (h0) this.f21271b[i11];
        if (h0Var != null) {
            return h0Var;
        }
        h0 c10 = d0.a().c((Class) this.f21271b[i11 + 1]);
        this.f21271b[i11] = c10;
        return c10;
    }

    private <UT, UB> int u(o0<UT, UB> o0Var, T t10) {
        return o0Var.h(o0Var.g(t10));
    }

    private static <T> int v(T t10, long j10) {
        return r0.w(t10, j10);
    }

    private static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean x(T t10, int i10) {
        int Z10 = Z(i10);
        long j10 = (long) (1048575 & Z10);
        if (j10 == 1048575) {
            int l02 = l0(i10);
            long S10 = S(l02);
            switch (k0(l02)) {
                case 0:
                    return Double.doubleToRawLongBits(r0.u(t10, S10)) != 0;
                case 1:
                    return Float.floatToRawIntBits(r0.v(t10, S10)) != 0;
                case 2:
                    return r0.x(t10, S10) != 0;
                case 3:
                    return r0.x(t10, S10) != 0;
                case 4:
                    return r0.w(t10, S10) != 0;
                case 5:
                    return r0.x(t10, S10) != 0;
                case 6:
                    return r0.w(t10, S10) != 0;
                case 7:
                    return r0.p(t10, S10);
                case 8:
                    Object z10 = r0.z(t10, S10);
                    if (z10 instanceof String) {
                        return !((String) z10).isEmpty();
                    }
                    if (z10 instanceof C5154g) {
                        return !C5154g.f21312b.equals(z10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return r0.z(t10, S10) != null;
                case 10:
                    return !C5154g.f21312b.equals(r0.z(t10, S10));
                case 11:
                    return r0.w(t10, S10) != 0;
                case 12:
                    return r0.w(t10, S10) != 0;
                case 13:
                    return r0.w(t10, S10) != 0;
                case 14:
                    return r0.x(t10, S10) != 0;
                case 15:
                    return r0.w(t10, S10) != 0;
                case 16:
                    return r0.x(t10, S10) != 0;
                case 17:
                    return r0.z(t10, S10) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (r0.w(t10, j10) & (1 << (Z10 >>> 20))) != 0;
        }
    }

    private boolean y(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? x(t10, i10) : (i12 & i13) != 0;
    }

    private static boolean z(Object obj, int i10, h0 h0Var) {
        return h0Var.g(r0.z(obj, S(i10)));
    }

    public void a(T t10, T t11) {
        l(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f21270a.length; i10 += 3) {
            L(t10, t11, i10);
        }
        j0.G(this.f21284o, t10, t11);
        if (this.f21275f) {
            j0.E(this.f21285p, t10, t11);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f21270a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.l0(r1)
            int r4 = r8.R(r1)
            long r5 = S(r3)
            int r3 = k0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020d;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01bf;
                case 9: goto L_0x01b4;
                case 10: goto L_0x01a8;
                case 11: goto L_0x01a0;
                case 12: goto L_0x0198;
                case 13: goto L_0x0190;
                case 14: goto L_0x0184;
                case 15: goto L_0x017c;
                case 16: goto L_0x0170;
                case 17: goto L_0x0161;
                case 18: goto L_0x0155;
                case 19: goto L_0x0155;
                case 20: goto L_0x0155;
                case 21: goto L_0x0155;
                case 22: goto L_0x0155;
                case 23: goto L_0x0155;
                case 24: goto L_0x0155;
                case 25: goto L_0x0155;
                case 26: goto L_0x0155;
                case 27: goto L_0x0155;
                case 28: goto L_0x0155;
                case 29: goto L_0x0155;
                case 30: goto L_0x0155;
                case 31: goto L_0x0155;
                case 32: goto L_0x0155;
                case 33: goto L_0x0155;
                case 34: goto L_0x0155;
                case 35: goto L_0x0155;
                case 36: goto L_0x0155;
                case 37: goto L_0x0155;
                case 38: goto L_0x0155;
                case 39: goto L_0x0155;
                case 40: goto L_0x0155;
                case 41: goto L_0x0155;
                case 42: goto L_0x0155;
                case 43: goto L_0x0155;
                case 44: goto L_0x0155;
                case 45: goto L_0x0155;
                case 46: goto L_0x0155;
                case 47: goto L_0x0155;
                case 48: goto L_0x0155;
                case 49: goto L_0x0155;
                case 50: goto L_0x0149;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x010f;
                case 54: goto L_0x00fd;
                case 55: goto L_0x00ef;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00bd;
                case 59: goto L_0x00a9;
                case 60: goto L_0x0098;
                case 61: goto L_0x0087;
                case 62: goto L_0x007a;
                case 63: goto L_0x006d;
                case 64: goto L_0x0060;
                case 65: goto L_0x004f;
                case 66: goto L_0x0042;
                case 67: goto L_0x0031;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0229
        L_0x001e:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0229
        L_0x0031:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x0060:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x006d:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x007a:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x0087:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0098:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00a9:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00bd:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = T(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.c(r3)
            goto L_0x002e
        L_0x00cf:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x00dd:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x00ef:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = W(r9, r5)
            goto L_0x002e
        L_0x00fd:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x010f:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = X(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x0121:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = V(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0133:
            boolean r3 = r8.E(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = U(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x0149:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0155:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0161:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
        L_0x016b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x0170:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.r0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x017c:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.r0.w(r9, r5)
            goto L_0x002e
        L_0x0184:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.r0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x0190:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.r0.w(r9, r5)
            goto L_0x002e
        L_0x0198:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.r0.w(r9, r5)
            goto L_0x002e
        L_0x01a0:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.r0.w(r9, r5)
            goto L_0x002e
        L_0x01a8:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01b4:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
            goto L_0x016b
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.r0.z(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01cd:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.r0.p(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.c(r3)
            goto L_0x002e
        L_0x01d9:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.r0.w(r9, r5)
            goto L_0x002e
        L_0x01e1:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.r0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.r0.w(r9, r5)
            goto L_0x002e
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.r0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x0201:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.r0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x020d:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.r0.v(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0219:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.r0.u(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C5172z.f(r3)
            goto L_0x002e
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.o0<?, ?> r0 = r8.f21284o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f21275f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.p<?> r0 = r8.f21285p
            androidx.datastore.preferences.protobuf.t r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.V.b(java.lang.Object):int");
    }

    public boolean c(T t10, T t11) {
        int length = this.f21270a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f21284o.g(t10).equals(this.f21284o.g(t11))) {
            return false;
        }
        if (this.f21275f) {
            return this.f21285p.c(t10).equals(this.f21285p.c(t11));
        }
        return true;
    }

    public T e() {
        return this.f21282m.a(this.f21274e);
    }

    public void f(T t10) {
        if (C(t10)) {
            if (t10 instanceof C5170x) {
                C5170x xVar = (C5170x) t10;
                xVar.m();
                xVar.l();
                xVar.D();
            }
            int length = this.f21270a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int l02 = l0(i10);
                long S10 = S(l02);
                int k02 = k0(l02);
                if (k02 != 9) {
                    if (k02 == 60 || k02 == 68) {
                        if (E(t10, R(i10), i10)) {
                            t(i10).f(f21269s.getObject(t10, S10));
                        }
                    } else {
                        switch (k02) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                            case BuildConfig.MIN_SDK_VERSION /*24*/:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case BuildConfig.TARGET_SDK_VERSION /*33*/:
                            case 34:
                            case ImageFormat.YUV_420_888 /*35*/:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f21283n.a(t10, S10);
                                continue;
                            case 50:
                                Unsafe unsafe = f21269s;
                                Object object = unsafe.getObject(t10, S10);
                                if (object != null) {
                                    unsafe.putObject(t10, S10, this.f21286q.f(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (x(t10, i10)) {
                    t(i10).f(f21269s.getObject(t10, S10));
                }
            }
            this.f21284o.j(t10);
            if (this.f21275f) {
                this.f21285p.f(t10);
            }
        }
    }

    public final boolean g(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f21280k) {
            int i15 = this.f21279j[i14];
            int R10 = R(i15);
            int l02 = l0(i15);
            int i16 = this.f21270a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f21269s.getInt(t11, (long) i17);
                }
                i10 = i13;
                i11 = i17;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (F(l02) && !y(t10, i15, i11, i10, i18)) {
                return false;
            }
            int k02 = k0(l02);
            if (k02 != 9 && k02 != 17) {
                if (k02 != 27) {
                    if (k02 == 60 || k02 == 68) {
                        if (E(t11, R10, i15) && !z(t11, l02, t(i15))) {
                            return false;
                        }
                    } else if (k02 != 49) {
                        if (k02 == 50 && !B(t11, l02, i15)) {
                            return false;
                        }
                    }
                }
                if (!A(t11, l02, i15)) {
                    return false;
                }
            } else if (y(t10, i15, i11, i10, i18) && !z(t11, l02, t(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        return !this.f21275f || this.f21285p.c(t11).p();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x034d, code lost:
        r12 = r12 + r0;
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0602, code lost:
        r11 = r11 + 3;
        r0 = r14;
        r1 = r16;
        r10 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bc, code lost:
        r1 = (r1 + r2) + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h(T r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            sun.misc.Unsafe r8 = f21269s
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r10
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x000d:
            int[] r2 = r6.f21270a
            int r2 = r2.length
            if (r11 >= r2) goto L_0x060c
            int r2 = r6.l0(r11)
            int r3 = k0(r2)
            int r13 = r6.R(r11)
            int[] r4 = r6.f21270a
            int r5 = r11 + 2
            r4 = r4[r5]
            r5 = r4 & r10
            r14 = 17
            r15 = 1
            if (r3 > r14) goto L_0x0042
            if (r5 == r0) goto L_0x0038
            if (r5 != r10) goto L_0x0031
            r1 = 0
            goto L_0x0037
        L_0x0031:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
            r1 = r0
        L_0x0037:
            r0 = r5
        L_0x0038:
            int r4 = r4 >>> 20
            int r4 = r15 << r4
            r14 = r0
            r16 = r1
            r17 = r4
            goto L_0x0047
        L_0x0042:
            r14 = r0
            r16 = r1
            r17 = 0
        L_0x0047:
            long r1 = S(r2)
            androidx.datastore.preferences.protobuf.u r0 = androidx.datastore.preferences.protobuf.C5167u.DOUBLE_LIST_PACKED
            int r0 = r0.a()
            if (r3 < r0) goto L_0x005c
            androidx.datastore.preferences.protobuf.u r0 = androidx.datastore.preferences.protobuf.C5167u.SINT64_LIST_PACKED
            int r0 = r0.a()
            if (r3 > r0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            r4 = 0
            r9 = 0
            switch(r3) {
                case 0: goto L_0x05e9;
                case 1: goto L_0x05d1;
                case 2: goto L_0x05b6;
                case 3: goto L_0x059b;
                case 4: goto L_0x0580;
                case 5: goto L_0x056a;
                case 6: goto L_0x0552;
                case 7: goto L_0x053c;
                case 8: goto L_0x0513;
                case 9: goto L_0x04f4;
                case 10: goto L_0x04d7;
                case 11: goto L_0x04bc;
                case 12: goto L_0x04a1;
                case 13: goto L_0x048a;
                case 14: goto L_0x0474;
                case 15: goto L_0x0459;
                case 16: goto L_0x043e;
                case 17: goto L_0x041d;
                case 18: goto L_0x0410;
                case 19: goto L_0x0403;
                case 20: goto L_0x03f6;
                case 21: goto L_0x03e9;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03cf;
                case 24: goto L_0x03c2;
                case 25: goto L_0x03b6;
                case 26: goto L_0x03aa;
                case 27: goto L_0x039a;
                case 28: goto L_0x038e;
                case 29: goto L_0x0381;
                case 30: goto L_0x0375;
                case 31: goto L_0x0369;
                case 32: goto L_0x035d;
                case 33: goto L_0x0351;
                case 34: goto L_0x0342;
                case 35: goto L_0x0324;
                case 36: goto L_0x0306;
                case 37: goto L_0x02e8;
                case 38: goto L_0x02ca;
                case 39: goto L_0x02ac;
                case 40: goto L_0x028e;
                case 41: goto L_0x0270;
                case 42: goto L_0x0252;
                case 43: goto L_0x0234;
                case 44: goto L_0x0217;
                case 45: goto L_0x01fa;
                case 46: goto L_0x01dd;
                case 47: goto L_0x01c0;
                case 48: goto L_0x01a0;
                case 49: goto L_0x0190;
                case 50: goto L_0x0180;
                case 51: goto L_0x0172;
                case 52: goto L_0x0166;
                case 53: goto L_0x0156;
                case 54: goto L_0x0146;
                case 55: goto L_0x0136;
                case 56: goto L_0x012a;
                case 57: goto L_0x011e;
                case 58: goto L_0x0112;
                case 59: goto L_0x00f4;
                case 60: goto L_0x00e1;
                case 61: goto L_0x00d0;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b2;
                case 64: goto L_0x00a5;
                case 65: goto L_0x009a;
                case 66: goto L_0x008b;
                case 67: goto L_0x007c;
                case 68: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0079
        L_0x0064:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.S r0 = (androidx.datastore.preferences.protobuf.S) r0
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.s(r13, r0, r1)
        L_0x0078:
            int r12 = r12 + r0
        L_0x0079:
            r15 = 0
            goto L_0x0602
        L_0x007c:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = X(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.Q(r13, r0)
            goto L_0x0078
        L_0x008b:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.O(r13, r0)
            goto L_0x0078
        L_0x009a:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C5157j.M(r13, r9)
            goto L_0x0078
        L_0x00a5:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.C5157j.K(r13, r0)
        L_0x00b0:
            int r12 = r12 + r1
            goto L_0x0079
        L_0x00b2:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.k(r13, r0)
            goto L_0x0078
        L_0x00c1:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.V(r13, r0)
            goto L_0x0078
        L_0x00d0:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C5154g) r0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.g(r13, r0)
            goto L_0x0078
        L_0x00e1:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.j0.o(r13, r0, r1)
            goto L_0x0078
        L_0x00f4:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C5154g
            if (r1 == 0) goto L_0x010a
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C5154g) r0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.g(r13, r0)
            goto L_0x0078
        L_0x010a:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.S(r13, r0)
            goto L_0x0078
        L_0x0112:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C5157j.d(r13, r15)
            goto L_0x0078
        L_0x011e:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.C5157j.m(r13, r0)
            goto L_0x00b0
        L_0x012a:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C5157j.o(r13, r9)
            goto L_0x0078
        L_0x0136:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.v(r13, r0)
            goto L_0x0078
        L_0x0146:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = X(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.X(r13, r0)
            goto L_0x0078
        L_0x0156:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = X(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.x(r13, r0)
            goto L_0x0078
        L_0x0166:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C5157j.q(r13, r4)
            goto L_0x0078
        L_0x0172:
            boolean r0 = r6.E(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.i(r13, r0)
            goto L_0x0078
        L_0x0180:
            androidx.datastore.preferences.protobuf.M r0 = r6.f21286q
            java.lang.Object r1 = r8.getObject(r7, r1)
            java.lang.Object r2 = r6.s(r11)
            int r0 = r0.g(r13, r1, r2)
            goto L_0x0078
        L_0x0190:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.j0.j(r13, r0, r1)
            goto L_0x0078
        L_0x01a0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.t(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x01b4
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01b4:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
        L_0x01bc:
            int r1 = r1 + r2
            int r1 = r1 + r0
            goto L_0x00b0
        L_0x01c0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.r(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x01d4
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01d4:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x01dd:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x01f1
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01f1:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x01fa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x020e
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x020e:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x0217:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.e(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x022b
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x022b:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x0234:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.w(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x0248
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0248:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x0252:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.b(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x0266
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0266:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x0270:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x0284
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0284:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x028e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x02a2
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02a2:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x02ac:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.l(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x02c0
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02c0:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x02ca:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.y(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x02de
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02de:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x02e8:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.n(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x02fc
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02fc:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x0306:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x031a
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x031a:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x0324:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f21278i
            if (r1 == 0) goto L_0x0338
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0338:
            int r1 = androidx.datastore.preferences.protobuf.C5157j.U(r13)
            int r2 = androidx.datastore.preferences.protobuf.C5157j.W(r0)
            goto L_0x01bc
        L_0x0342:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = androidx.datastore.preferences.protobuf.j0.s(r13, r0, r3)
        L_0x034d:
            int r12 = r12 + r0
            r15 = r3
            goto L_0x0602
        L_0x0351:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.q(r13, r0, r3)
            goto L_0x034d
        L_0x035d:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.h(r13, r0, r3)
            goto L_0x034d
        L_0x0369:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.f(r13, r0, r3)
            goto L_0x034d
        L_0x0375:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.d(r13, r0, r3)
            goto L_0x034d
        L_0x0381:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.v(r13, r0, r3)
            goto L_0x0078
        L_0x038e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.c(r13, r0)
            goto L_0x0078
        L_0x039a:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.j0.p(r13, r0, r1)
            goto L_0x0078
        L_0x03aa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.u(r13, r0)
            goto L_0x0078
        L_0x03b6:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = androidx.datastore.preferences.protobuf.j0.a(r13, r0, r3)
            goto L_0x034d
        L_0x03c2:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.f(r13, r0, r3)
            goto L_0x034d
        L_0x03cf:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.h(r13, r0, r3)
            goto L_0x034d
        L_0x03dc:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.k(r13, r0, r3)
            goto L_0x034d
        L_0x03e9:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.x(r13, r0, r3)
            goto L_0x034d
        L_0x03f6:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.m(r13, r0, r3)
            goto L_0x034d
        L_0x0403:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.f(r13, r0, r3)
            goto L_0x034d
        L_0x0410:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.j0.h(r13, r0, r3)
            goto L_0x0078
        L_0x041d:
            r0 = r18
            r9 = r1
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.S r0 = (androidx.datastore.preferences.protobuf.S) r0
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.s(r13, r0, r1)
            goto L_0x0078
        L_0x043e:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.Q(r13, r0)
            goto L_0x0078
        L_0x0459:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.O(r13, r0)
            goto L_0x0078
        L_0x0474:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C5157j.M(r13, r9)
            goto L_0x0078
        L_0x048a:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.C5157j.K(r13, r0)
            goto L_0x00b0
        L_0x04a1:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.k(r13, r0)
            goto L_0x0078
        L_0x04bc:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.V(r13, r0)
            goto L_0x0078
        L_0x04d7:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C5154g) r0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.g(r13, r0)
            goto L_0x0078
        L_0x04f4:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.h0 r1 = r6.t(r11)
            int r0 = androidx.datastore.preferences.protobuf.j0.o(r13, r0, r1)
            goto L_0x0078
        L_0x0513:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C5154g
            if (r1 == 0) goto L_0x0534
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C5154g) r0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.g(r13, r0)
            goto L_0x0078
        L_0x0534:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.S(r13, r0)
            goto L_0x0078
        L_0x053c:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C5157j.d(r13, r15)
            goto L_0x0078
        L_0x0552:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            r15 = 0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.m(r13, r15)
        L_0x0567:
            int r12 = r12 + r0
            goto L_0x0602
        L_0x056a:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = androidx.datastore.preferences.protobuf.C5157j.o(r13, r9)
            goto L_0x0567
        L_0x0580:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.v(r13, r0)
            goto L_0x0567
        L_0x059b:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.X(r13, r0)
            goto L_0x0567
        L_0x05b6:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C5157j.x(r13, r0)
            goto L_0x0567
        L_0x05d1:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = androidx.datastore.preferences.protobuf.C5157j.q(r13, r9)
            goto L_0x0567
        L_0x05e9:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            r0 = 0
            int r0 = androidx.datastore.preferences.protobuf.C5157j.i(r13, r0)
            goto L_0x0567
        L_0x0602:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x060c:
            androidx.datastore.preferences.protobuf.o0<?, ?> r0 = r6.f21284o
            int r0 = r6.u(r0, r7)
            int r12 = r12 + r0
            boolean r0 = r6.f21275f
            if (r0 == 0) goto L_0x0622
            androidx.datastore.preferences.protobuf.p<?> r0 = r6.f21285p
            androidx.datastore.preferences.protobuf.t r0 = r0.c(r7)
            int r0 = r0.l()
            int r12 = r12 + r0
        L_0x0622:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.V.h(java.lang.Object):int");
    }

    public void i(T t10, g0 g0Var, C5162o oVar) {
        oVar.getClass();
        l(t10);
        H(this.f21284o, this.f21285p, t10, g0Var, oVar);
    }

    public void j(T t10, u0 u0Var) {
        if (u0Var.t() == u0.a.DESCENDING) {
            n0(t10, u0Var);
        } else {
            m0(t10, u0Var);
        }
    }
}
