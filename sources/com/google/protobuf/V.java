package com.google.protobuf;

import com.google.ar.core.ImageFormat;
import com.google.protobuf.C9572e;
import com.google.protobuf.C9575h;
import com.google.protobuf.C9592z;
import com.google.protobuf.K;
import com.google.protobuf.u0;
import com.google.protobuf.v0;
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
    private static final int[] f69237r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f69238s = s0.D();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f69239a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f69240b;

    /* renamed from: c  reason: collision with root package name */
    private final int f69241c;

    /* renamed from: d  reason: collision with root package name */
    private final int f69242d;

    /* renamed from: e  reason: collision with root package name */
    private final S f69243e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f69244f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f69245g;

    /* renamed from: h  reason: collision with root package name */
    private final c0 f69246h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f69247i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f69248j;

    /* renamed from: k  reason: collision with root package name */
    private final int f69249k;

    /* renamed from: l  reason: collision with root package name */
    private final int f69250l;

    /* renamed from: m  reason: collision with root package name */
    private final X f69251m;

    /* renamed from: n  reason: collision with root package name */
    private final H f69252n;

    /* renamed from: o  reason: collision with root package name */
    private final o0<?, ?> f69253o;

    /* renamed from: p  reason: collision with root package name */
    private final C9584q<?> f69254p;

    /* renamed from: q  reason: collision with root package name */
    private final M f69255q;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f69256a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.u0$b[] r0 = com.google.protobuf.u0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69256a = r0
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f69256a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.u0$b r1 = com.google.protobuf.u0.b.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.a.<clinit>():void");
        }
    }

    private V(int[] iArr, Object[] objArr, int i10, int i11, S s10, c0 c0Var, boolean z10, int[] iArr2, int i12, int i13, X x10, H h10, o0<?, ?> o0Var, C9584q<?> qVar, M m10) {
        S s11 = s10;
        C9584q<?> qVar2 = qVar;
        this.f69239a = iArr;
        this.f69240b = objArr;
        this.f69241c = i10;
        this.f69242d = i11;
        this.f69245g = s11 instanceof GeneratedMessageLite;
        this.f69246h = c0Var;
        this.f69244f = qVar2 != null && qVar2.e(s10);
        this.f69247i = z10;
        this.f69248j = iArr2;
        this.f69249k = i12;
        this.f69250l = i13;
        this.f69251m = x10;
        this.f69252n = h10;
        this.f69253o = o0Var;
        this.f69254p = qVar2;
        this.f69243e = s11;
        this.f69255q = m10;
    }

    private static boolean A(int i10) {
        return (i10 & 536870912) != 0;
    }

    private <UT, UB> void A0(o0<UT, UB> o0Var, T t10, v0 v0Var) {
        o0Var.t(o0Var.g(t10), v0Var);
    }

    private boolean B(T t10, int i10) {
        int j02 = j0(i10);
        long j10 = (long) (1048575 & j02);
        if (j10 == 1048575) {
            int v02 = v0(i10);
            long X10 = X(v02);
            switch (u0(v02)) {
                case 0:
                    return Double.doubleToRawLongBits(s0.x(t10, X10)) != 0;
                case 1:
                    return Float.floatToRawIntBits(s0.y(t10, X10)) != 0;
                case 2:
                    return s0.A(t10, X10) != 0;
                case 3:
                    return s0.A(t10, X10) != 0;
                case 4:
                    return s0.z(t10, X10) != 0;
                case 5:
                    return s0.A(t10, X10) != 0;
                case 6:
                    return s0.z(t10, X10) != 0;
                case 7:
                    return s0.r(t10, X10);
                case 8:
                    Object C10 = s0.C(t10, X10);
                    if (C10 instanceof String) {
                        return !((String) C10).isEmpty();
                    }
                    if (C10 instanceof C9575h) {
                        return !C9575h.f69286b.equals(C10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return s0.C(t10, X10) != null;
                case 10:
                    return !C9575h.f69286b.equals(s0.C(t10, X10));
                case 11:
                    return s0.z(t10, X10) != 0;
                case 12:
                    return s0.z(t10, X10) != 0;
                case 13:
                    return s0.z(t10, X10) != 0;
                case 14:
                    return s0.A(t10, X10) != 0;
                case 15:
                    return s0.z(t10, X10) != 0;
                case 16:
                    return s0.A(t10, X10) != 0;
                case 17:
                    return s0.C(t10, X10) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (s0.z(t10, j10) & (1 << (j02 >>> 20))) != 0;
        }
    }

    private boolean C(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? B(t10, i10) : (i12 & i13) != 0;
    }

    private static boolean D(Object obj, int i10, h0 h0Var) {
        return h0Var.g(s0.C(obj, X(i10)));
    }

    private static boolean E(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    private <N> boolean F(Object obj, int i10, int i11) {
        List list = (List) s0.C(obj, X(i10));
        if (list.isEmpty()) {
            return true;
        }
        h0 w10 = w(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!w10.g(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean G(T t10, int i10, int i11) {
        Map<?, ?> e10 = this.f69255q.e(s0.C(t10, X(i10)));
        if (e10.isEmpty()) {
            return true;
        }
        if (this.f69255q.b(v(i11)).f69230c.a() != u0.c.MESSAGE) {
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

    private static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean I(T t10, T t11, int i10) {
        long j02 = (long) (j0(i10) & 1048575);
        return s0.z(t10, j02) == s0.z(t11, j02);
    }

    private boolean J(T t10, int i10, int i11) {
        return s0.z(t10, (long) (j0(i11) & 1048575)) == i10;
    }

    private static boolean K(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static <T> long L(T t10, long j10) {
        return s0.A(t10, j10);
    }

    /* JADX WARNING: type inference failed for: r12v65, types: [boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fc, code lost:
        r13 = r6;
        r14 = r7;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0110, code lost:
        r12 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0112, code lost:
        r14 = r7;
        r12 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x064f A[Catch:{ all -> 0x0675 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x06b5 A[LOOP:6: B:204:0x06b1->B:206:0x06b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x06ca  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <UT, UB, ET extends com.google.protobuf.C9587u.b<ET>> void M(com.google.protobuf.o0<UT, UB> r19, com.google.protobuf.C9584q<ET> r20, T r21, com.google.protobuf.g0 r22, com.google.protobuf.C9583p r23) {
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
            int r2 = r22.A()     // Catch:{ all -> 0x06a9 }
            int r3 = r8.h0(r2)     // Catch:{ all -> 0x06a9 }
            if (r3 >= 0) goto L_0x00bb
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x003e
            int r0 = r8.f69249k
            r4 = r5
        L_0x0021:
            int r1 = r8.f69250l
            if (r0 >= r1) goto L_0x0038
            int[] r1 = r8.f69248j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            r7.o(r15, r4)
        L_0x003d:
            return
        L_0x003e:
            boolean r1 = r8.f69244f     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x0047
            r4 = r20
            r12 = r17
            goto L_0x0050
        L_0x0047:
            com.google.protobuf.S r1 = r8.f69243e     // Catch:{ all -> 0x00b8 }
            r4 = r20
            java.lang.Object r1 = r4.b(r6, r1, r2)     // Catch:{ all -> 0x00b8 }
            r12 = r1
        L_0x0050:
            if (r12 == 0) goto L_0x0078
            if (r9 != 0) goto L_0x005e
            com.google.protobuf.u r1 = r20.d(r21)     // Catch:{ all -> 0x0059 }
            goto L_0x005f
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            r14 = r7
            r10 = r15
            goto L_0x06ad
        L_0x005e:
            r1 = r9
        L_0x005f:
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r1
            r3 = r15
            r15 = r5
            r16 = r19
            java.lang.Object r5 = r9.g(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0073 }
            r9 = r1
        L_0x0071:
            r15 = r3
            goto L_0x000f
        L_0x0073:
            r0 = move-exception
            r10 = r3
        L_0x0075:
            r14 = r7
            goto L_0x06ad
        L_0x0078:
            r3 = r15
            boolean r1 = r7.q(r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0086
            boolean r1 = r22.D()     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0094
        L_0x0085:
            goto L_0x0071
        L_0x0086:
            if (r5 != 0) goto L_0x008d
            java.lang.Object r1 = r7.f(r3)     // Catch:{ all -> 0x0073 }
            r5 = r1
        L_0x008d:
            boolean r1 = r7.m(r5, r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0094
            goto L_0x0085
        L_0x0094:
            int r0 = r8.f69249k
            r4 = r5
        L_0x0097:
            int r1 = r8.f69250l
            if (r0 >= r1) goto L_0x00b1
            int[] r1 = r8.f69248j
            r5 = r1[r0]
            r1 = r18
            r2 = r21
            r10 = r3
            r3 = r5
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r3 = r10
            goto L_0x0097
        L_0x00b1:
            r10 = r3
            if (r4 == 0) goto L_0x00b7
            r7.o(r10, r4)
        L_0x00b7:
            return
        L_0x00b8:
            r0 = move-exception
            r10 = r15
            goto L_0x0075
        L_0x00bb:
            r4 = r20
            r10 = r15
            int r11 = r8.v0(r3)     // Catch:{ all -> 0x0281 }
            int r1 = u0(r11)     // Catch:{ a -> 0x0285 }
            switch(r1) {
                case 0: goto L_0x0636;
                case 1: goto L_0x0624;
                case 2: goto L_0x0612;
                case 3: goto L_0x0600;
                case 4: goto L_0x05ee;
                case 5: goto L_0x05db;
                case 6: goto L_0x05c8;
                case 7: goto L_0x05b5;
                case 8: goto L_0x05aa;
                case 9: goto L_0x0595;
                case 10: goto L_0x0582;
                case 11: goto L_0x056f;
                case 12: goto L_0x0549;
                case 13: goto L_0x0536;
                case 14: goto L_0x0523;
                case 15: goto L_0x0510;
                case 16: goto L_0x04fd;
                case 17: goto L_0x04e8;
                case 18: goto L_0x04d6;
                case 19: goto L_0x04c4;
                case 20: goto L_0x04b2;
                case 21: goto L_0x04a0;
                case 22: goto L_0x048e;
                case 23: goto L_0x047c;
                case 24: goto L_0x046a;
                case 25: goto L_0x0458;
                case 26: goto L_0x0450;
                case 27: goto L_0x043b;
                case 28: goto L_0x0429;
                case 29: goto L_0x0417;
                case 30: goto L_0x03f6;
                case 31: goto L_0x03e4;
                case 32: goto L_0x03d2;
                case 33: goto L_0x03c0;
                case 34: goto L_0x03ae;
                case 35: goto L_0x039c;
                case 36: goto L_0x038a;
                case 37: goto L_0x0378;
                case 38: goto L_0x0366;
                case 39: goto L_0x0354;
                case 40: goto L_0x0342;
                case 41: goto L_0x0330;
                case 42: goto L_0x031e;
                case 43: goto L_0x030c;
                case 44: goto L_0x02eb;
                case 45: goto L_0x02d9;
                case 46: goto L_0x02c7;
                case 47: goto L_0x02b5;
                case 48: goto L_0x02a3;
                case 49: goto L_0x0288;
                case 50: goto L_0x0264;
                case 51: goto L_0x0250;
                case 52: goto L_0x023c;
                case 53: goto L_0x0228;
                case 54: goto L_0x0214;
                case 55: goto L_0x0200;
                case 56: goto L_0x01ec;
                case 57: goto L_0x01d8;
                case 58: goto L_0x01c4;
                case 59: goto L_0x01bc;
                case 60: goto L_0x01aa;
                case 61: goto L_0x019a;
                case 62: goto L_0x0186;
                case 63: goto L_0x0161;
                case 64: goto L_0x014e;
                case 65: goto L_0x013b;
                case 66: goto L_0x0128;
                case 67: goto L_0x0115;
                case 68: goto L_0x0100;
                default: goto L_0x00c9;
            }
        L_0x00c9:
            if (r5 != 0) goto L_0x00d6
            java.lang.Object r5 = r7.f(r10)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x00d6
        L_0x00d0:
            r0 = move-exception
            goto L_0x0075
        L_0x00d2:
            r13 = r6
            r14 = r7
            goto L_0x0649
        L_0x00d6:
            boolean r1 = r7.m(r5, r0)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            if (r1 != 0) goto L_0x00fc
            int r0 = r8.f69249k
            r4 = r5
        L_0x00df:
            int r1 = r8.f69250l
            if (r0 >= r1) goto L_0x00f6
            int[] r1 = r8.f69248j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x00df
        L_0x00f6:
            if (r4 == 0) goto L_0x00fb
            r7.o(r10, r4)
        L_0x00fb:
            return
        L_0x00fc:
            r13 = r6
            r14 = r7
            goto L_0x06a4
        L_0x0100:
            java.lang.Object r1 = r8.S(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.S r1 = (com.google.protobuf.S) r1     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.h0 r11 = r8.w(r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r0.O(r1, r11, r6)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.t0(r10, r2, r3, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
        L_0x0110:
            r12 = r5
            r13 = r6
        L_0x0112:
            r14 = r7
            goto L_0x0647
        L_0x0115:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.y()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0128:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.l()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x013b:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.f()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x014e:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.E()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0161:
            int r1 = r22.k()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.z$e r12 = r8.u(r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            if (r12 == 0) goto L_0x0177
            boolean r12 = r12.a(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            if (r12 == 0) goto L_0x0172
            goto L_0x0177
        L_0x0172:
            java.lang.Object r5 = com.google.protobuf.j0.J(r10, r2, r1, r5, r7)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x00fc
        L_0x0177:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0186:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.h()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x019a:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.h r1 = r22.o()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01aa:
            java.lang.Object r1 = r8.S(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.S r1 = (com.google.protobuf.S) r1     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.h0 r11 = r8.w(r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r0.P(r1, r11, r6)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.t0(r10, r2, r3, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01bc:
            r8.m0(r10, r11, r0)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01c4:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            boolean r1 = r22.e()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01d8:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.u()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x01ec:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.b()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0200:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            int r1 = r22.p()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0214:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.s()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0228:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            long r13 = r22.H()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x023c:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            float r1 = r22.readFloat()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0250:
            long r11 = X(r11)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            double r13 = r22.readDouble()     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            java.lang.Double r1 = java.lang.Double.valueOf(r13)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            com.google.protobuf.s0.R(r10, r11, r1)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            r8.q0(r10, r2, r3)     // Catch:{ a -> 0x00d2, all -> 0x00d0 }
            goto L_0x0110
        L_0x0264:
            java.lang.Object r11 = r8.v(r3)     // Catch:{ a -> 0x0285 }
            r1 = r18
            r2 = r21
            r4 = r11
            r12 = r5
            r5 = r23
            r13 = r6
            r6 = r22
            r1.N(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027d, all -> 0x0278 }
            goto L_0x0112
        L_0x0278:
            r0 = move-exception
            r14 = r7
        L_0x027a:
            r5 = r12
            goto L_0x06ad
        L_0x027d:
            r14 = r7
        L_0x027e:
            r5 = r12
            goto L_0x0649
        L_0x0281:
            r0 = move-exception
            r12 = r5
            goto L_0x0075
        L_0x0285:
            r12 = r5
            goto L_0x00d2
        L_0x0288:
            r12 = r5
            r13 = r6
            long r4 = X(r11)     // Catch:{ a -> 0x027d, all -> 0x0278 }
            com.google.protobuf.h0 r6 = r8.w(r3)     // Catch:{ a -> 0x027d, all -> 0x0278 }
            r1 = r18
            r2 = r21
            r3 = r4
            r5 = r22
            r14 = r7
            r7 = r23
            r1.k0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02a1:
            r0 = move-exception
            goto L_0x027a
        L_0x02a3:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.d(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02b5:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.r(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02c7:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.v(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02d9:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.c(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x02eb:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r4 = r1.e(r10, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.j(r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.z$e r5 = r8.u(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.protobuf.j0.A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x030c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.t(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x031e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.m(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0330:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.x(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0342:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.q(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0354:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.w(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0366:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.g(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0378:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.i(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x038a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.C(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x039c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.G(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03ae:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.d(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03c0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.r(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03d2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.v(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03e4:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.c(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x03f6:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r4 = r1.e(r10, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.j(r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.z$e r5 = r8.u(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.protobuf.j0.A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x0417:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.t(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0429:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.F(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x043b:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.h0 r5 = r8.w(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r1 = r18
            r2 = r21
            r3 = r11
            r4 = r22
            r6 = r23
            r1.l0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0450:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.n0(r10, r11, r0)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0458:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.m(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x046a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.x(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x047c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.q(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x048e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.w(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04a0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.g(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04b2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.i(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04c4:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.C(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04d6:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.H r1 = r8.f69252n     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r2 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.G(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04e8:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.R(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.S r1 = (com.google.protobuf.S) r1     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.h0 r2 = r8.w(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.O(r1, r2, r13)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.s0(r10, r3, r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x04fd:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.y()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0510:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.l()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0523:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.f()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0536:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.E()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0549:
            r12 = r5
            r13 = r6
            r14 = r7
            int r1 = r22.k()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.z$e r4 = r8.u(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            if (r4 == 0) goto L_0x0563
            boolean r4 = r4.a(r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            if (r4 == 0) goto L_0x055d
            goto L_0x0563
        L_0x055d:
            java.lang.Object r5 = com.google.protobuf.j0.J(r10, r2, r1, r12, r14)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x06a4
        L_0x0563:
            long r4 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.P(r10, r4, r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x056f:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.h()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0582:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.h r4 = r22.o()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.R(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0595:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.R(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.S r1 = (com.google.protobuf.S) r1     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.h0 r2 = r8.w(r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r0.P(r1, r2, r13)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.s0(r10, r3, r1)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05aa:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.m0(r10, r11, r0)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05b5:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            boolean r4 = r22.e()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.H(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05c8:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.u()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05db:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.b()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x05ee:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            int r4 = r22.p()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.P(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0600:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.s()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0612:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            long r4 = r22.H()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.Q(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0624:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            float r4 = r22.readFloat()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.O(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            goto L_0x0647
        L_0x0636:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = X(r11)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            double r4 = r22.readDouble()     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            com.google.protobuf.s0.N(r10, r1, r4)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
            r8.p0(r10, r3)     // Catch:{ a -> 0x027e, all -> 0x02a1 }
        L_0x0647:
            r5 = r12
            goto L_0x06a4
        L_0x0649:
            boolean r1 = r14.q(r0)     // Catch:{ all -> 0x0675 }
            if (r1 == 0) goto L_0x0677
            boolean r1 = r22.D()     // Catch:{ all -> 0x0675 }
            if (r1 != 0) goto L_0x06a4
            int r0 = r8.f69249k
            r4 = r5
        L_0x0658:
            int r1 = r8.f69250l
            if (r0 >= r1) goto L_0x066f
            int[] r1 = r8.f69248j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0658
        L_0x066f:
            if (r4 == 0) goto L_0x0674
            r14.o(r10, r4)
        L_0x0674:
            return
        L_0x0675:
            r0 = move-exception
            goto L_0x06ad
        L_0x0677:
            if (r5 != 0) goto L_0x067e
            java.lang.Object r1 = r14.f(r10)     // Catch:{ all -> 0x0675 }
            r5 = r1
        L_0x067e:
            boolean r1 = r14.m(r5, r0)     // Catch:{ all -> 0x0675 }
            if (r1 != 0) goto L_0x06a4
            int r0 = r8.f69249k
            r4 = r5
        L_0x0687:
            int r1 = r8.f69250l
            if (r0 >= r1) goto L_0x069e
            int[] r1 = r8.f69248j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0687
        L_0x069e:
            if (r4 == 0) goto L_0x06a3
            r14.o(r10, r4)
        L_0x06a3:
            return
        L_0x06a4:
            r15 = r10
            r6 = r13
            r7 = r14
            goto L_0x000f
        L_0x06a9:
            r0 = move-exception
            r12 = r5
            goto L_0x005a
        L_0x06ad:
            int r1 = r8.f69249k
            r7 = r1
            r4 = r5
        L_0x06b1:
            int r1 = r8.f69250l
            if (r7 >= r1) goto L_0x06c8
            int[] r1 = r8.f69248j
            r3 = r1[r7]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x06b1
        L_0x06c8:
            if (r4 == 0) goto L_0x06cd
            r14.o(r10, r4)
        L_0x06cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.M(com.google.protobuf.o0, com.google.protobuf.q, java.lang.Object, com.google.protobuf.g0, com.google.protobuf.p):void");
    }

    private final <K, V> void N(Object obj, int i10, Object obj2, C9583p pVar, g0 g0Var) {
        long X10 = X(v0(i10));
        Object C10 = s0.C(obj, X10);
        if (C10 == null) {
            C10 = this.f69255q.d(obj2);
            s0.R(obj, X10, C10);
        } else if (this.f69255q.h(C10)) {
            Object d10 = this.f69255q.d(obj2);
            this.f69255q.a(d10, C10);
            s0.R(obj, X10, d10);
            C10 = d10;
        }
        g0Var.M(this.f69255q.c(C10), this.f69255q.b(obj2), pVar);
    }

    private void O(T t10, T t11, int i10) {
        if (B(t11, i10)) {
            long X10 = X(v0(i10));
            Unsafe unsafe = f69238s;
            Object object = unsafe.getObject(t11, X10);
            if (object != null) {
                h0 w10 = w(i10);
                if (!B(t10, i10)) {
                    if (!H(object)) {
                        unsafe.putObject(t10, X10, object);
                    } else {
                        Object e10 = w10.e();
                        w10.a(e10, object);
                        unsafe.putObject(t10, X10, e10);
                    }
                    p0(t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, X10);
                if (!H(object2)) {
                    Object e11 = w10.e();
                    w10.a(e11, object2);
                    unsafe.putObject(t10, X10, e11);
                    object2 = e11;
                }
                w10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + W(i10) + " is present but null: " + t11);
        }
    }

    private void P(T t10, T t11, int i10) {
        int W10 = W(i10);
        if (J(t11, W10, i10)) {
            long X10 = X(v0(i10));
            Unsafe unsafe = f69238s;
            Object object = unsafe.getObject(t11, X10);
            if (object != null) {
                h0 w10 = w(i10);
                if (!J(t10, W10, i10)) {
                    if (!H(object)) {
                        unsafe.putObject(t10, X10, object);
                    } else {
                        Object e10 = w10.e();
                        w10.a(e10, object);
                        unsafe.putObject(t10, X10, e10);
                    }
                    q0(t10, W10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, X10);
                if (!H(object2)) {
                    Object e11 = w10.e();
                    w10.a(e11, object2);
                    unsafe.putObject(t10, X10, e11);
                    object2 = e11;
                }
                w10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + W(i10) + " is present but null: " + t11);
        }
    }

    private void Q(T t10, T t11, int i10) {
        int v02 = v0(i10);
        long X10 = X(v02);
        int W10 = W(i10);
        switch (u0(v02)) {
            case 0:
                if (B(t11, i10)) {
                    s0.N(t10, X10, s0.x(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (B(t11, i10)) {
                    s0.O(t10, X10, s0.y(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (B(t11, i10)) {
                    s0.Q(t10, X10, s0.A(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 3:
                if (B(t11, i10)) {
                    s0.Q(t10, X10, s0.A(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 4:
                if (B(t11, i10)) {
                    s0.P(t10, X10, s0.z(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 5:
                if (B(t11, i10)) {
                    s0.Q(t10, X10, s0.A(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 6:
                if (B(t11, i10)) {
                    s0.P(t10, X10, s0.z(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 7:
                if (B(t11, i10)) {
                    s0.H(t10, X10, s0.r(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (B(t11, i10)) {
                    s0.R(t10, X10, s0.C(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 9:
                O(t10, t11, i10);
                return;
            case 10:
                if (B(t11, i10)) {
                    s0.R(t10, X10, s0.C(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 11:
                if (B(t11, i10)) {
                    s0.P(t10, X10, s0.z(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 12:
                if (B(t11, i10)) {
                    s0.P(t10, X10, s0.z(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 13:
                if (B(t11, i10)) {
                    s0.P(t10, X10, s0.z(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 14:
                if (B(t11, i10)) {
                    s0.Q(t10, X10, s0.A(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 15:
                if (B(t11, i10)) {
                    s0.P(t10, X10, s0.z(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 16:
                if (B(t11, i10)) {
                    s0.Q(t10, X10, s0.A(t11, X10));
                    p0(t10, i10);
                    return;
                }
                return;
            case 17:
                O(t10, t11, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
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
            case ImageFormat.YUV_420_888:
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
                this.f69252n.d(t10, t11, X10);
                return;
            case 50:
                j0.F(this.f69255q, t10, t11, X10);
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
                if (J(t11, W10, i10)) {
                    s0.R(t10, X10, s0.C(t11, X10));
                    q0(t10, W10, i10);
                    return;
                }
                return;
            case 60:
                P(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (J(t11, W10, i10)) {
                    s0.R(t10, X10, s0.C(t11, X10));
                    q0(t10, W10, i10);
                    return;
                }
                return;
            case 68:
                P(t10, t11, i10);
                return;
            default:
                return;
        }
    }

    private Object R(T t10, int i10) {
        h0 w10 = w(i10);
        long X10 = X(v0(i10));
        if (!B(t10, i10)) {
            return w10.e();
        }
        Object object = f69238s.getObject(t10, X10);
        if (H(object)) {
            return object;
        }
        Object e10 = w10.e();
        if (object != null) {
            w10.a(e10, object);
        }
        return e10;
    }

    private Object S(T t10, int i10, int i11) {
        h0 w10 = w(i11);
        if (!J(t10, i10, i11)) {
            return w10.e();
        }
        Object object = f69238s.getObject(t10, X(v0(i11)));
        if (H(object)) {
            return object;
        }
        Object e10 = w10.e();
        if (object != null) {
            w10.a(e10, object);
        }
        return e10;
    }

    static <T> V<T> T(Class<T> cls, P p10, X x10, H h10, o0<?, ?> o0Var, C9584q<?> qVar, M m10) {
        return p10 instanceof f0 ? V((f0) p10, x10, h10, o0Var, qVar, m10) : U((l0) p10, x10, h10, o0Var, qVar, m10);
    }

    static <T> V<T> U(l0 l0Var, X x10, H h10, o0<?, ?> o0Var, C9584q<?> qVar, M m10) {
        C9586t[] e10 = l0Var.e();
        if (e10.length == 0) {
            int length = e10.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e10.length <= 0) {
                int[] d10 = l0Var.d();
                if (d10 == null) {
                    d10 = f69237r;
                }
                if (e10.length <= 0) {
                    int[] iArr2 = f69237r;
                    int[] iArr3 = f69237r;
                    int[] iArr4 = new int[(d10.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d10, 0, iArr4, 0, d10.length);
                    System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
                    return new V(iArr, objArr, 0, 0, l0Var.b(), l0Var.c(), true, iArr4, d10.length, d10.length + iArr2.length, x10, h10, o0Var, qVar, m10);
                }
                C9586t tVar = e10[0];
                throw null;
            }
            C9586t tVar2 = e10[0];
            throw null;
        }
        C9586t tVar3 = e10[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.protobuf.V<T> V(com.google.protobuf.f0 r31, com.google.protobuf.X r32, com.google.protobuf.H r33, com.google.protobuf.o0<?, ?> r34, com.google.protobuf.C9584q<?> r35, com.google.protobuf.M r36) {
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
            int[] r6 = f69237r
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
            sun.misc.Unsafe r8 = f69238s
            java.lang.Object[] r9 = r31.d()
            com.google.protobuf.S r14 = r31.b()
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
            com.google.protobuf.c0 r1 = r31.c()
            com.google.protobuf.c0 r11 = com.google.protobuf.c0.PROTO2
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
            java.lang.reflect.Field r1 = o0(r14, r1)
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
            java.lang.reflect.Field r11 = o0(r14, r11)
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
            java.lang.reflect.Field r11 = o0(r14, r11)
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
            com.google.protobuf.c0 r12 = r31.c()
            r26 = r13
            com.google.protobuf.c0 r13 = com.google.protobuf.c0.PROTO2
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
            java.lang.reflect.Field r13 = o0(r14, r13)
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
            com.google.protobuf.V r0 = new com.google.protobuf.V
            com.google.protobuf.S r13 = r31.b()
            com.google.protobuf.c0 r14 = r31.c()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.V(com.google.protobuf.f0, com.google.protobuf.X, com.google.protobuf.H, com.google.protobuf.o0, com.google.protobuf.q, com.google.protobuf.M):com.google.protobuf.V");
    }

    private int W(int i10) {
        return this.f69239a[i10];
    }

    private static long X(int i10) {
        return (long) (i10 & 1048575);
    }

    private static <T> boolean Y(T t10, long j10) {
        return ((Boolean) s0.C(t10, j10)).booleanValue();
    }

    private static <T> double Z(T t10, long j10) {
        return ((Double) s0.C(t10, j10)).doubleValue();
    }

    private static <T> float a0(T t10, long j10) {
        return ((Float) s0.C(t10, j10)).floatValue();
    }

    private static <T> int b0(T t10, long j10) {
        return ((Integer) s0.C(t10, j10)).intValue();
    }

    private static <T> long c0(T t10, long j10) {
        return ((Long) s0.C(t10, j10)).longValue();
    }

    private <K, V> int d0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C9572e.b bVar) {
        T t11 = t10;
        long j11 = j10;
        Unsafe unsafe = f69238s;
        int i13 = i12;
        Object v10 = v(i12);
        Object object = unsafe.getObject(t10, j11);
        if (this.f69255q.h(object)) {
            Object d10 = this.f69255q.d(v10);
            this.f69255q.a(d10, object);
            unsafe.putObject(t10, j11, d10);
            object = d10;
        }
        return n(bArr, i10, i11, this.f69255q.b(v10), this.f69255q.c(object), bVar);
    }

    private int f0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C9572e.b bVar) {
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        C9572e.b bVar2 = bVar;
        Unsafe unsafe = f69238s;
        long j12 = (long) (this.f69239a[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(C9572e.d(bArr, i10)));
                    int i23 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(C9572e.l(bArr, i10)));
                    int i24 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int L10 = C9572e.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(bVar2.f69273b));
                    unsafe.putInt(t11, j12, i20);
                    return L10;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int I10 = C9572e.I(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(bVar2.f69272a));
                    unsafe.putInt(t11, j12, i20);
                    return I10;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(C9572e.j(bArr, i10)));
                    int i25 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(C9572e.h(bArr, i10)));
                    int i26 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i26;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int L11 = C9572e.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Boolean.valueOf(bVar2.f69273b != 0));
                    unsafe.putInt(t11, j12, i20);
                    return L11;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int I11 = C9572e.I(bArr2, i18, bVar2);
                    int i27 = bVar2.f69272a;
                    if (i27 == 0) {
                        unsafe.putObject(t11, j11, "");
                    } else if ((i15 & 536870912) == 0 || t0.n(bArr2, I11, I11 + i27)) {
                        unsafe.putObject(t11, j11, new String(bArr2, I11, i27, C9592z.f69430b));
                        I11 += i27;
                    } else {
                        throw B.d();
                    }
                    unsafe.putInt(t11, j12, i20);
                    return I11;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object S10 = S(t11, i20, i22);
                    int O10 = C9572e.O(S10, w(i22), bArr, i10, i11, bVar);
                    t0(t11, i20, i22, S10);
                    return O10;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int b10 = C9572e.b(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, bVar2.f69274c);
                    unsafe.putInt(t11, j12, i20);
                    return b10;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int I12 = C9572e.I(bArr2, i18, bVar2);
                    int i28 = bVar2.f69272a;
                    C9592z.e u10 = u(i22);
                    if (u10 == null || u10.a(i28)) {
                        unsafe.putObject(t11, j11, Integer.valueOf(i28));
                        unsafe.putInt(t11, j12, i20);
                    } else {
                        x(t10).n(i19, Long.valueOf((long) i28));
                    }
                    return I12;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int I13 = C9572e.I(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(C9576i.b(bVar2.f69272a)));
                    unsafe.putInt(t11, j12, i20);
                    return I13;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int L12 = C9572e.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(C9576i.c(bVar2.f69273b)));
                    unsafe.putInt(t11, j12, i20);
                    return L12;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object S11 = S(t11, i20, i22);
                    int N10 = C9572e.N(S11, w(i22), bArr, i10, i11, (i19 & -8) | 4, bVar);
                    t0(t11, i20, i22, S11);
                    return N10;
                }
                break;
        }
        return i18;
    }

    private int g0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C9572e.b bVar) {
        int i17;
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i14;
        int i20 = i15;
        long j12 = j11;
        C9572e.b bVar2 = bVar;
        Unsafe unsafe = f69238s;
        C9592z.i iVar = (C9592z.i) unsafe.getObject(t10, j12);
        if (!iVar.u()) {
            int size = iVar.size();
            iVar = iVar.f(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j12, iVar);
        }
        switch (i16) {
            case 18:
            case ImageFormat.YUV_420_888:
                if (i19 == 2) {
                    return C9572e.s(bArr, i18, iVar, bVar2);
                }
                if (i19 == 1) {
                    return C9572e.e(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i19 == 2) {
                    return C9572e.v(bArr, i18, iVar, bVar2);
                }
                if (i19 == 5) {
                    return C9572e.m(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i19 == 2) {
                    return C9572e.z(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9572e.M(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i19 == 2) {
                    return C9572e.y(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9572e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case 32:
            case 40:
            case 46:
                if (i19 == 2) {
                    return C9572e.u(bArr, i18, iVar, bVar2);
                }
                if (i19 == 1) {
                    return C9572e.k(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case BuildConfig.MIN_SDK_VERSION /*24*/:
            case 31:
            case 41:
            case 45:
                if (i19 == 2) {
                    return C9572e.t(bArr, i18, iVar, bVar2);
                }
                if (i19 == 5) {
                    return C9572e.i(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i19 == 2) {
                    return C9572e.r(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9572e.a(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 26:
                if (i19 == 2) {
                    return (j10 & 536870912) == 0 ? C9572e.D(i12, bArr, i10, i11, iVar, bVar) : C9572e.E(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 27:
                if (i19 == 2) {
                    return C9572e.q(w(i20), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 28:
                if (i19 == 2) {
                    return C9572e.c(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i19 == 2) {
                    i17 = C9572e.y(bArr, i18, iVar, bVar2);
                } else if (i19 == 0) {
                    i17 = C9572e.J(i12, bArr, i10, i11, iVar, bVar);
                }
                j0.A(t10, i13, iVar, u(i20), null, this.f69253o);
                return i17;
            case BuildConfig.TARGET_SDK_VERSION /*33*/:
            case 47:
                if (i19 == 2) {
                    return C9572e.w(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9572e.A(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i19 == 2) {
                    return C9572e.x(bArr, i18, iVar, bVar2);
                }
                if (i19 == 0) {
                    return C9572e.B(i12, bArr, i10, i11, iVar, bVar);
                }
                break;
            case 49:
                if (i19 == 3) {
                    return C9572e.o(w(i20), i12, bArr, i10, i11, iVar, bVar);
                }
                break;
        }
        return i18;
    }

    private int h0(int i10) {
        if (i10 < this.f69241c || i10 > this.f69242d) {
            return -1;
        }
        return r0(i10, 0);
    }

    private int i0(int i10, int i11) {
        if (i10 < this.f69241c || i10 > this.f69242d) {
            return -1;
        }
        return r0(i10, i11);
    }

    private int j0(int i10) {
        return this.f69239a[i10 + 2];
    }

    private boolean k(T t10, T t11, int i10) {
        return B(t10, i10) == B(t11, i10);
    }

    private <E> void k0(Object obj, long j10, g0 g0Var, h0<E> h0Var, C9583p pVar) {
        g0Var.J(this.f69252n.e(obj, j10), h0Var, pVar);
    }

    private static <T> boolean l(T t10, long j10) {
        return s0.r(t10, j10);
    }

    private <E> void l0(Object obj, int i10, g0 g0Var, h0<E> h0Var, C9583p pVar) {
        g0Var.K(this.f69252n.e(obj, X(i10)), h0Var, pVar);
    }

    private static void m(Object obj) {
        if (!H(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    private void m0(Object obj, int i10, g0 g0Var) {
        if (A(i10)) {
            s0.R(obj, X(i10), g0Var.I());
        } else if (this.f69245g) {
            s0.R(obj, X(i10), g0Var.z());
        } else {
            s0.R(obj, X(i10), g0Var.o());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <K, V> int n(byte[] r15, int r16, int r17, com.google.protobuf.K.a<K, V> r18, java.util.Map<K, V> r19, com.google.protobuf.C9572e.b r20) {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = com.google.protobuf.C9572e.I(r15, r0, r10)
            int r1 = r10.f69272a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.f69229b
            V r2 = r9.f69231d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.protobuf.C9572e.H(r0, r15, r1, r10)
            int r1 = r10.f69272a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            com.google.protobuf.u0$b r1 = r9.f69230c
            int r1 = r1.b()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.u0$b r4 = r9.f69230c
            V r0 = r9.f69231d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.f69274c
            goto L_0x001d
        L_0x0057:
            com.google.protobuf.u0$b r1 = r9.f69228a
            int r1 = r1.b()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.u0$b r4 = r9.f69228a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.f69274c
            goto L_0x001d
        L_0x006f:
            int r0 = com.google.protobuf.C9572e.P(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            com.google.protobuf.B r0 = com.google.protobuf.B.h()
            throw r0
        L_0x0081:
            com.google.protobuf.B r0 = com.google.protobuf.B.k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.n(byte[], int, int, com.google.protobuf.K$a, java.util.Map, com.google.protobuf.e$b):int");
    }

    private void n0(Object obj, int i10, g0 g0Var) {
        if (A(i10)) {
            g0Var.n(this.f69252n.e(obj, X(i10)));
        } else {
            g0Var.B(this.f69252n.e(obj, X(i10)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r3 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int o(byte[] r2, int r3, int r4, com.google.protobuf.u0.b r5, java.lang.Class<?> r6, com.google.protobuf.C9572e.b r7) {
        /*
            r1 = this;
            int[] r0 = com.google.protobuf.V.a.f69256a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0089;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x0071;
                case 7: goto L_0x0071;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = com.google.protobuf.C9572e.F(r2, r3, r7)
            goto L_0x00ae
        L_0x0019:
            int r2 = com.google.protobuf.C9572e.L(r2, r3, r7)
            long r3 = r7.f69273b
            long r3 = com.google.protobuf.C9576i.c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f69274c = r3
            goto L_0x00ae
        L_0x002b:
            int r2 = com.google.protobuf.C9572e.I(r2, r3, r7)
            int r3 = r7.f69272a
            int r3 = com.google.protobuf.C9576i.b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f69274c = r3
            goto L_0x00ae
        L_0x003d:
            com.google.protobuf.d0 r5 = com.google.protobuf.d0.a()
            com.google.protobuf.h0 r5 = r5.c(r6)
            int r2 = com.google.protobuf.C9572e.p(r5, r2, r3, r4, r7)
            goto L_0x00ae
        L_0x004a:
            int r2 = com.google.protobuf.C9572e.L(r2, r3, r7)
            long r3 = r7.f69273b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f69274c = r3
            goto L_0x00ae
        L_0x0057:
            int r2 = com.google.protobuf.C9572e.I(r2, r3, r7)
            int r3 = r7.f69272a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f69274c = r3
            goto L_0x00ae
        L_0x0064:
            float r2 = com.google.protobuf.C9572e.l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.f69274c = r2
        L_0x006e:
            int r2 = r3 + 4
            goto L_0x00ae
        L_0x0071:
            long r4 = com.google.protobuf.C9572e.j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.f69274c = r2
        L_0x007b:
            int r2 = r3 + 8
            goto L_0x00ae
        L_0x007e:
            int r2 = com.google.protobuf.C9572e.h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.f69274c = r2
            goto L_0x006e
        L_0x0089:
            double r4 = com.google.protobuf.C9572e.d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.f69274c = r2
            goto L_0x007b
        L_0x0094:
            int r2 = com.google.protobuf.C9572e.b(r2, r3, r7)
            goto L_0x00ae
        L_0x0099:
            int r2 = com.google.protobuf.C9572e.L(r2, r3, r7)
            long r3 = r7.f69273b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.f69274c = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.o(byte[], int, int, com.google.protobuf.u0$b, java.lang.Class, com.google.protobuf.e$b):int");
    }

    private static Field o0(Class<?> cls, String str) {
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

    private static <T> double p(T t10, long j10) {
        return s0.x(t10, j10);
    }

    private void p0(T t10, int i10) {
        int j02 = j0(i10);
        long j10 = (long) (1048575 & j02);
        if (j10 != 1048575) {
            s0.P(t10, j10, (1 << (j02 >>> 20)) | s0.z(t10, j10));
        }
    }

    private boolean q(T t10, T t11, int i10) {
        int v02 = v0(i10);
        long X10 = X(v02);
        switch (u0(v02)) {
            case 0:
                return k(t10, t11, i10) && Double.doubleToLongBits(s0.x(t10, X10)) == Double.doubleToLongBits(s0.x(t11, X10));
            case 1:
                return k(t10, t11, i10) && Float.floatToIntBits(s0.y(t10, X10)) == Float.floatToIntBits(s0.y(t11, X10));
            case 2:
                return k(t10, t11, i10) && s0.A(t10, X10) == s0.A(t11, X10);
            case 3:
                return k(t10, t11, i10) && s0.A(t10, X10) == s0.A(t11, X10);
            case 4:
                return k(t10, t11, i10) && s0.z(t10, X10) == s0.z(t11, X10);
            case 5:
                return k(t10, t11, i10) && s0.A(t10, X10) == s0.A(t11, X10);
            case 6:
                return k(t10, t11, i10) && s0.z(t10, X10) == s0.z(t11, X10);
            case 7:
                return k(t10, t11, i10) && s0.r(t10, X10) == s0.r(t11, X10);
            case 8:
                return k(t10, t11, i10) && j0.I(s0.C(t10, X10), s0.C(t11, X10));
            case 9:
                return k(t10, t11, i10) && j0.I(s0.C(t10, X10), s0.C(t11, X10));
            case 10:
                return k(t10, t11, i10) && j0.I(s0.C(t10, X10), s0.C(t11, X10));
            case 11:
                return k(t10, t11, i10) && s0.z(t10, X10) == s0.z(t11, X10);
            case 12:
                return k(t10, t11, i10) && s0.z(t10, X10) == s0.z(t11, X10);
            case 13:
                return k(t10, t11, i10) && s0.z(t10, X10) == s0.z(t11, X10);
            case 14:
                return k(t10, t11, i10) && s0.A(t10, X10) == s0.A(t11, X10);
            case 15:
                return k(t10, t11, i10) && s0.z(t10, X10) == s0.z(t11, X10);
            case 16:
                return k(t10, t11, i10) && s0.A(t10, X10) == s0.A(t11, X10);
            case 17:
                return k(t10, t11, i10) && j0.I(s0.C(t10, X10), s0.C(t11, X10));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
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
            case ImageFormat.YUV_420_888:
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
                return j0.I(s0.C(t10, X10), s0.C(t11, X10));
            case 50:
                return j0.I(s0.C(t10, X10), s0.C(t11, X10));
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
                return I(t10, t11, i10) && j0.I(s0.C(t10, X10), s0.C(t11, X10));
            default:
                return true;
        }
    }

    private void q0(T t10, int i10, int i11) {
        s0.P(t10, (long) (j0(i11) & 1048575), i10);
    }

    private <UT, UB> UB r(Object obj, int i10, UB ub2, o0<UT, UB> o0Var, Object obj2) {
        C9592z.e u10;
        int W10 = W(i10);
        Object C10 = s0.C(obj, X(v0(i10)));
        if (C10 == null || (u10 = u(i10)) == null) {
            return ub2;
        }
        return s(i10, W10, this.f69255q.c(C10), u10, ub2, o0Var, obj2);
    }

    private int r0(int i10, int i11) {
        int length = (this.f69239a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int W10 = W(i13);
            if (i10 == W10) {
                return i13;
            }
            if (i10 < W10) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private <K, V, UT, UB> UB s(int i10, int i11, Map<K, V> map, C9592z.e eVar, UB ub2, o0<UT, UB> o0Var, Object obj) {
        K.a<?, ?> b10 = this.f69255q.b(v(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = o0Var.f(obj);
                }
                C9575h.C1193h x10 = C9575h.x(K.b(b10, next.getKey(), next.getValue()));
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

    private void s0(T t10, int i10, Object obj) {
        f69238s.putObject(t10, X(v0(i10)), obj);
        p0(t10, i10);
    }

    private static <T> float t(T t10, long j10) {
        return s0.y(t10, j10);
    }

    private void t0(T t10, int i10, int i11, Object obj) {
        f69238s.putObject(t10, X(v0(i11)), obj);
        q0(t10, i10, i11);
    }

    private C9592z.e u(int i10) {
        return (C9592z.e) this.f69240b[((i10 / 3) * 2) + 1];
    }

    private static int u0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private Object v(int i10) {
        return this.f69240b[(i10 / 3) * 2];
    }

    private int v0(int i10) {
        return this.f69239a[i10 + 1];
    }

    private h0 w(int i10) {
        int i11 = (i10 / 3) * 2;
        h0 h0Var = (h0) this.f69240b[i11];
        if (h0Var != null) {
            return h0Var;
        }
        h0 c10 = d0.a().c((Class) this.f69240b[i11 + 1]);
        this.f69240b[i11] = c10;
        return c10;
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
    private void w0(T r22, com.google.protobuf.v0 r23) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r23
            boolean r0 = r6.f69244f
            if (r0 == 0) goto L_0x0022
            com.google.protobuf.q<?> r0 = r6.f69254p
            com.google.protobuf.u r0 = r0.c(r7)
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
            int[] r0 = r6.f69239a
            int r11 = r0.length
            sun.misc.Unsafe r12 = f69238s
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r13
            r2 = 0
            r15 = 0
        L_0x002f:
            if (r15 >= r11) goto L_0x0625
            int r3 = r6.v0(r15)
            int r5 = r6.W(r15)
            int r4 = u0(r3)
            r9 = 17
            if (r4 > r9) goto L_0x006a
            int[] r9 = r6.f69239a
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
            com.google.protobuf.q<?> r0 = r6.f69254p
            int r0 = r0.a(r14)
            if (r0 > r5) goto L_0x0091
            com.google.protobuf.q<?> r0 = r6.f69254p
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
            long r2 = X(r3)
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
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            com.google.protobuf.h0 r1 = r6.w(r15)
            r8.K(r5, r0, r1)
            goto L_0x0098
        L_0x00b2:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = c0(r7, r2)
            r8.m(r5, r0)
            goto L_0x0098
        L_0x00c0:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = b0(r7, r2)
            r8.H(r5, r0)
            goto L_0x0098
        L_0x00ce:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = c0(r7, r2)
            r8.i(r5, r0)
            goto L_0x0098
        L_0x00dc:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = b0(r7, r2)
            r8.w(r5, r0)
            goto L_0x0098
        L_0x00ea:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = b0(r7, r2)
            r8.E(r5, r0)
            goto L_0x0098
        L_0x00f8:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = b0(r7, r2)
            r8.o(r5, r0)
            goto L_0x0098
        L_0x0106:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            com.google.protobuf.h r0 = (com.google.protobuf.C9575h) r0
            r8.L(r5, r0)
            goto L_0x0098
        L_0x0116:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            com.google.protobuf.h0 r1 = r6.w(r15)
            r8.N(r5, r0, r1)
            goto L_0x0098
        L_0x0129:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            r6.z0(r5, r0, r8)
            goto L_0x0098
        L_0x0138:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            boolean r0 = Y(r7, r2)
            r8.v(r5, r0)
            goto L_0x0098
        L_0x0147:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = b0(r7, r2)
            r8.c(r5, r0)
            goto L_0x0098
        L_0x0156:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = c0(r7, r2)
            r8.s(r5, r0)
            goto L_0x0098
        L_0x0165:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = b0(r7, r2)
            r8.h(r5, r0)
            goto L_0x0098
        L_0x0174:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = c0(r7, r2)
            r8.f(r5, r0)
            goto L_0x0098
        L_0x0183:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = c0(r7, r2)
            r8.u(r5, r0)
            goto L_0x0098
        L_0x0192:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            float r0 = a0(r7, r2)
            r8.B(r5, r0)
            goto L_0x0098
        L_0x01a1:
            boolean r0 = r6.J(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            double r0 = Z(r7, r2)
            r8.p(r5, r0)
            goto L_0x0098
        L_0x01b0:
            java.lang.Object r0 = r12.getObject(r7, r2)
            r6.y0(r8, r5, r0, r15)
            goto L_0x0098
        L_0x01b9:
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.h0 r2 = r6.w(r15)
            com.google.protobuf.j0.T(r0, r1, r8, r2)
            goto L_0x0098
        L_0x01cc:
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 1
            com.google.protobuf.j0.a0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01dc:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.Z(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01ec:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.Y(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01fc:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.X(r0, r1, r8, r4)
            goto L_0x0098
        L_0x020c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.P(r0, r1, r8, r4)
            goto L_0x0098
        L_0x021c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.c0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x022c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.M(r0, r1, r8, r4)
            goto L_0x0098
        L_0x023c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.Q(r0, r1, r8, r4)
            goto L_0x0098
        L_0x024c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.R(r0, r1, r8, r4)
            goto L_0x0098
        L_0x025c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.U(r0, r1, r8, r4)
            goto L_0x0098
        L_0x026c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.d0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x027c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.V(r0, r1, r8, r4)
            goto L_0x0098
        L_0x028c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.S(r0, r1, r8, r4)
            goto L_0x0098
        L_0x029c:
            r4 = 1
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.O(r0, r1, r8, r4)
            goto L_0x0098
        L_0x02ac:
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            com.google.protobuf.j0.a0(r0, r1, r8, r4)
        L_0x02ba:
            r19 = r4
            r20 = r11
            r16 = r14
            goto L_0x0617
        L_0x02c2:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.Z(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02d1:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.Y(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02e0:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.X(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02ef:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.P(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02fe:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.c0(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x030d:
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.N(r0, r1, r8)
            goto L_0x0098
        L_0x031c:
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.h0 r2 = r6.w(r15)
            com.google.protobuf.j0.W(r0, r1, r8, r2)
            goto L_0x0098
        L_0x032f:
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.b0(r0, r1, r8)
            goto L_0x0098
        L_0x033e:
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            com.google.protobuf.j0.M(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x034e:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.Q(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x035e:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.R(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x036e:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.U(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x037e:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.d0(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x038e:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.V(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x039e:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.S(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x03ae:
            r4 = 0
            int r0 = r6.W(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.protobuf.j0.O(r0, r1, r8, r4)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            com.google.protobuf.h0 r1 = r6.w(r15)
            r8.K(r11, r0, r1)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            com.google.protobuf.h r0 = (com.google.protobuf.C9575h) r0
            r8.L(r11, r0)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            com.google.protobuf.h0 r1 = r6.w(r15)
            r8.N(r11, r0, r1)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            r6.z0(r11, r0, r8)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            boolean r0 = l(r7, r13)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            float r0 = t(r7, r13)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            double r0 = p(r7, r13)
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
            com.google.protobuf.q<?> r0 = r6.f69254p
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
            com.google.protobuf.o0<?, ?> r0 = r6.f69253o
            r6.A0(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.w0(java.lang.Object, com.google.protobuf.v0):void");
    }

    static p0 x(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        p0 p0Var = generatedMessageLite.unknownFields;
        if (p0Var != p0.c()) {
            return p0Var;
        }
        p0 k10 = p0.k();
        generatedMessageLite.unknownFields = k10;
        return k10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void x0(T r11, com.google.protobuf.v0 r12) {
        /*
            r10 = this;
            com.google.protobuf.o0<?, ?> r0 = r10.f69253o
            r10.A0(r0, r11, r12)
            boolean r0 = r10.f69244f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.q<?> r0 = r10.f69254p
            com.google.protobuf.u r0 = r0.c(r11)
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
            int[] r3 = r10.f69239a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.v0(r3)
            int r5 = r10.W(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.q<?> r6 = r10.f69254p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.q<?> r6 = r10.f69254p
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
            int r6 = u0(r4)
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
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            com.google.protobuf.h0 r6 = r10.w(r3)
            r12.K(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = c0(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = b0(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = c0(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = b0(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = b0(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = b0(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            com.google.protobuf.h r4 = (com.google.protobuf.C9575h) r4
            r12.L(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            com.google.protobuf.h0 r6 = r10.w(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            r10.z0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            boolean r4 = Y(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = b0(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = c0(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = b0(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = c0(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = c0(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            float r4 = a0(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.J(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            double r6 = Z(r11, r6)
            r12.p(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            r10.y0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.h0 r6 = r10.w(r3)
            com.google.protobuf.j0.T(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.X(r5, r4, r12, r8)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.c0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.M(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.U(r5, r4, r12, r8)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.O(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.X(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.c0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.N(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.h0 r6 = r10.w(r3)
            com.google.protobuf.j0.W(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.W(r3)
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.b0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.M(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.U(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.W(r3)
            long r8 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.j0.O(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            com.google.protobuf.h0 r6 = r10.w(r3)
            r12.K(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = L(r11, r6)
            r12.m(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = z(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = L(r11, r6)
            r12.i(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = z(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = z(r11, r6)
            r12.E(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = z(r11, r6)
            r12.o(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            com.google.protobuf.h r4 = (com.google.protobuf.C9575h) r4
            r12.L(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            com.google.protobuf.h0 r6 = r10.w(r3)
            r12.N(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            java.lang.Object r4 = com.google.protobuf.s0.C(r11, r6)
            r10.z0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            boolean r4 = l(r11, r6)
            r12.v(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = z(r11, r6)
            r12.c(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = L(r11, r6)
            r12.s(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            int r4 = z(r11, r6)
            r12.h(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = L(r11, r6)
            r12.f(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            long r6 = L(r11, r6)
            r12.u(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            float r4 = t(r11, r6)
            r12.B(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = X(r4)
            double r6 = p(r11, r6)
            r12.p(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.q<?> r11 = r10.f69254p
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.x0(java.lang.Object, com.google.protobuf.v0):void");
    }

    private <UT, UB> int y(o0<UT, UB> o0Var, T t10) {
        return o0Var.h(o0Var.g(t10));
    }

    private <K, V> void y0(v0 v0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            v0Var.O(i10, this.f69255q.b(v(i11)), this.f69255q.e(obj));
        }
    }

    private static <T> int z(T t10, long j10) {
        return s0.z(t10, j10);
    }

    private void z0(int i10, Object obj, v0 v0Var) {
        if (obj instanceof String) {
            v0Var.e(i10, (String) obj);
        } else {
            v0Var.L(i10, (C9575h) obj);
        }
    }

    public void a(T t10, T t11) {
        m(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f69239a.length; i10 += 3) {
            Q(t10, t11, i10);
        }
        j0.G(this.f69253o, t10, t11);
        if (this.f69244f) {
            j0.E(this.f69254p, t10, t11);
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
            int[] r0 = r8.f69239a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.v0(r1)
            int r4 = r8.W(r1)
            long r5 = X(r3)
            int r3 = u0(r3)
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
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0229
        L_0x0031:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = c0(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = b0(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = c0(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x0060:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = b0(r9, r5)
            goto L_0x002e
        L_0x006d:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = b0(r9, r5)
            goto L_0x002e
        L_0x007a:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = b0(r9, r5)
            goto L_0x002e
        L_0x0087:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0098:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00a9:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00bd:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = Y(r9, r5)
            int r3 = com.google.protobuf.C9592z.c(r3)
            goto L_0x002e
        L_0x00cf:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = b0(r9, r5)
            goto L_0x002e
        L_0x00dd:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = c0(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x00ef:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = b0(r9, r5)
            goto L_0x002e
        L_0x00fd:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = c0(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x010f:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = c0(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x0121:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = a0(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0133:
            boolean r3 = r8.J(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = Z(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x0149:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0155:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0161:
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
        L_0x016b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x0170:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.s0.A(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x017c:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x0184:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.s0.A(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x0190:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x0198:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x01a0:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x01a8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01b4:
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
            goto L_0x016b
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.s0.C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01cd:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.s0.r(r9, r5)
            int r3 = com.google.protobuf.C9592z.c(r3)
            goto L_0x002e
        L_0x01d9:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x01e1:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.s0.A(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.s0.z(r9, r5)
            goto L_0x002e
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.s0.A(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.s0.A(r9, r5)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.s0.y(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.s0.x(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C9592z.f(r3)
            goto L_0x002e
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            com.google.protobuf.o0<?, ?> r0 = r8.f69253o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f69244f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            com.google.protobuf.q<?> r0 = r8.f69254p
            com.google.protobuf.u r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.b(java.lang.Object):int");
    }

    public boolean c(T t10, T t11) {
        int length = this.f69239a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!q(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f69253o.g(t10).equals(this.f69253o.g(t11))) {
            return false;
        }
        if (this.f69244f) {
            return this.f69254p.c(t10).equals(this.f69254p.c(t11));
        }
        return true;
    }

    public void d(T t10, v0 v0Var) {
        if (v0Var.t() == v0.a.DESCENDING) {
            x0(t10, v0Var);
        } else {
            w0(t10, v0Var);
        }
    }

    public T e() {
        return this.f69251m.a(this.f69243e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.protobuf.p0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0370, code lost:
        if (r0 != r15) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x038c, code lost:
        r8 = r35;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03c2, code lost:
        if (r0 != r15) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03e3, code lost:
        if (r0 != r15) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        r11 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        r33 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
        r1 = r7 | r20;
        r11 = r6;
        r7 = r8;
        r2 = r12;
        r3 = r13;
        r8 = -1;
        r13 = r34;
        r6 = r1;
        r12 = r10;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013d, code lost:
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0173, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0174, code lost:
        r2 = r12;
        r3 = r13;
        r1 = r17;
        r8 = -1;
        r13 = r34;
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x024b, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024d, code lost:
        r6 = r7 | r20;
        r7 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02cf, code lost:
        r26 = r33;
        r20 = r7;
        r2 = r8;
        r27 = r9;
        r25 = r12;
        r9 = r13;
        r18 = -1;
        r8 = r35;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0417  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int e0(T r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.C9572e.b r36) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r36
            m(r31)
            sun.misc.Unsafe r9 = f69238s
            r16 = 0
            r8 = -1
            r0 = r33
            r1 = r8
            r2 = r16
            r3 = r2
            r6 = r3
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            if (r0 >= r13) goto L_0x0436
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.protobuf.C9572e.H(r0, r12, r3, r11)
            int r3 = r11.f69272a
            r4 = r0
            r5 = r3
            goto L_0x002f
        L_0x002d:
            r5 = r0
            r4 = r3
        L_0x002f:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r10 = 3
            if (r3 <= r1) goto L_0x003d
            int r2 = r2 / r10
            int r1 = r15.i0(r3, r2)
        L_0x003b:
            r2 = r1
            goto L_0x0042
        L_0x003d:
            int r1 = r15.h0(r3)
            goto L_0x003b
        L_0x0042:
            if (r2 != r8) goto L_0x0056
            r17 = r3
            r2 = r4
            r20 = r6
            r26 = r7
            r18 = r8
            r27 = r9
            r25 = r16
            r8 = r35
            r9 = r5
            goto L_0x03e6
        L_0x0056:
            int[] r1 = r15.f69239a
            int r18 = r2 + 1
            r1 = r1[r18]
            int r10 = u0(r1)
            long r11 = X(r1)
            r8 = 17
            r19 = r5
            if (r10 > r8) goto L_0x02df
            int[] r8 = r15.f69239a
            int r20 = r2 + 2
            r8 = r8[r20]
            int r20 = r8 >>> 20
            r5 = 1
            int r20 = r5 << r20
            r22 = r11
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r11
            if (r8 == r7) goto L_0x0092
            if (r7 == r11) goto L_0x0086
            long r11 = (long) r7
            r9.putInt(r14, r11, r6)
            r11 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0086:
            if (r8 != r11) goto L_0x008b
            r6 = r16
            goto L_0x0090
        L_0x008b:
            long r6 = (long) r8
            int r6 = r9.getInt(r14, r6)
        L_0x0090:
            r7 = r6
            goto L_0x0094
        L_0x0092:
            r8 = r7
            goto L_0x0090
        L_0x0094:
            r6 = 5
            switch(r10) {
                case 0: goto L_0x02b6;
                case 1: goto L_0x029c;
                case 2: goto L_0x026d;
                case 3: goto L_0x026d;
                case 4: goto L_0x0253;
                case 5: goto L_0x0230;
                case 6: goto L_0x0216;
                case 7: goto L_0x01e4;
                case 8: goto L_0x01c0;
                case 9: goto L_0x019a;
                case 10: goto L_0x0182;
                case 11: goto L_0x0253;
                case 12: goto L_0x013f;
                case 13: goto L_0x0216;
                case 14: goto L_0x0230;
                case 15: goto L_0x0114;
                case 16: goto L_0x00e6;
                case 17: goto L_0x00a6;
                default: goto L_0x0098;
            }
        L_0x0098:
            r10 = r32
            r11 = r36
            r12 = r2
            r17 = r3
            r33 = r8
            r13 = r19
        L_0x00a3:
            r8 = r4
            goto L_0x02cf
        L_0x00a6:
            r1 = 3
            if (r0 != r1) goto L_0x00da
            java.lang.Object r10 = r15.R(r14, r2)
            int r0 = r3 << 3
            r5 = r0 | 4
            com.google.protobuf.h0 r1 = r15.w(r2)
            r0 = r10
            r12 = r2
            r2 = r32
            r17 = r3
            r3 = r4
            r4 = r34
            r6 = r19
            r13 = r6
            r6 = r36
            int r0 = com.google.protobuf.C9572e.N(r0, r1, r2, r3, r4, r5, r6)
            r15.s0(r14, r12, r10)
            r6 = r7 | r20
            r11 = r36
            r7 = r8
            r2 = r12
            r3 = r13
            r1 = r17
        L_0x00d3:
            r8 = -1
            r12 = r32
            r13 = r34
            goto L_0x001c
        L_0x00da:
            r12 = r2
            r17 = r3
            r13 = r19
            r10 = r32
        L_0x00e1:
            r11 = r36
        L_0x00e3:
            r33 = r8
            goto L_0x00a3
        L_0x00e6:
            r12 = r2
            r17 = r3
            r13 = r19
            r10 = r32
            if (r0 != 0) goto L_0x00e1
            r6 = r36
            r2 = r22
            int r19 = com.google.protobuf.C9572e.L(r10, r4, r6)
            long r0 = r6.f69273b
            long r4 = com.google.protobuf.C9576i.c(r0)
            r0 = r9
            r1 = r31
            r0.putLong(r1, r2, r4)
            r0 = r7 | r20
            r11 = r6
            r7 = r8
            r2 = r12
            r3 = r13
            r1 = r17
            r8 = -1
            r13 = r34
            r6 = r0
            r12 = r10
            r0 = r19
            goto L_0x001c
        L_0x0114:
            r10 = r32
            r6 = r36
            r12 = r2
            r17 = r3
            r13 = r19
            r2 = r22
            if (r0 != 0) goto L_0x013d
            int r0 = com.google.protobuf.C9572e.I(r10, r4, r6)
            int r1 = r6.f69272a
            int r1 = com.google.protobuf.C9576i.b(r1)
            r9.putInt(r14, r2, r1)
        L_0x012e:
            r1 = r7 | r20
            r11 = r6
            r7 = r8
            r2 = r12
            r3 = r13
            r8 = -1
            r13 = r34
            r6 = r1
            r12 = r10
            r1 = r17
            goto L_0x001c
        L_0x013d:
            r11 = r6
            goto L_0x00e3
        L_0x013f:
            r10 = r32
            r6 = r36
            r12 = r2
            r17 = r3
            r13 = r19
            r2 = r22
            if (r0 != 0) goto L_0x013d
            int r0 = com.google.protobuf.C9572e.I(r10, r4, r6)
            int r4 = r6.f69272a
            com.google.protobuf.z$e r5 = r15.u(r12)
            boolean r1 = E(r1)
            if (r1 == 0) goto L_0x017e
            if (r5 == 0) goto L_0x017e
            boolean r1 = r5.a(r4)
            if (r1 == 0) goto L_0x0165
            goto L_0x017e
        L_0x0165:
            com.google.protobuf.p0 r1 = x(r31)
            long r2 = (long) r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.n(r13, r2)
            r11 = r6
            r6 = r7
        L_0x0173:
            r7 = r8
        L_0x0174:
            r2 = r12
            r3 = r13
            r1 = r17
            r8 = -1
            r13 = r34
            r12 = r10
            goto L_0x001c
        L_0x017e:
            r9.putInt(r14, r2, r4)
            goto L_0x012e
        L_0x0182:
            r10 = r32
            r6 = r36
            r12 = r2
            r17 = r3
            r13 = r19
            r2 = r22
            r1 = 2
            if (r0 != r1) goto L_0x013d
            int r0 = com.google.protobuf.C9572e.b(r10, r4, r6)
            java.lang.Object r1 = r6.f69274c
            r9.putObject(r14, r2, r1)
            goto L_0x012e
        L_0x019a:
            r10 = r32
            r6 = r36
            r12 = r2
            r17 = r3
            r13 = r19
            r1 = 2
            if (r0 != r1) goto L_0x013d
            java.lang.Object r5 = r15.R(r14, r12)
            com.google.protobuf.h0 r1 = r15.w(r12)
            r0 = r5
            r2 = r32
            r3 = r4
            r4 = r34
            r11 = r5
            r5 = r36
            int r0 = com.google.protobuf.C9572e.O(r0, r1, r2, r3, r4, r5)
            r15.s0(r14, r12, r11)
            goto L_0x012e
        L_0x01c0:
            r10 = r32
            r6 = r36
            r12 = r2
            r17 = r3
            r13 = r19
            r2 = r22
            r5 = 2
            if (r0 != r5) goto L_0x013d
            boolean r0 = A(r1)
            if (r0 == 0) goto L_0x01d9
            int r0 = com.google.protobuf.C9572e.F(r10, r4, r6)
            goto L_0x01dd
        L_0x01d9:
            int r0 = com.google.protobuf.C9572e.C(r10, r4, r6)
        L_0x01dd:
            java.lang.Object r1 = r6.f69274c
            r9.putObject(r14, r2, r1)
            goto L_0x012e
        L_0x01e4:
            r10 = r32
            r6 = r36
            r12 = r2
            r17 = r3
            r13 = r19
            r2 = r22
            if (r0 != 0) goto L_0x013d
            int r0 = com.google.protobuf.C9572e.L(r10, r4, r6)
            r33 = r0
            long r0 = r6.f69273b
            r21 = 0
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            r5 = r16
        L_0x0202:
            com.google.protobuf.s0.H(r14, r2, r5)
            r0 = r7 | r20
            r11 = r6
            r7 = r8
            r2 = r12
            r3 = r13
            r1 = r17
            r8 = -1
            r13 = r34
            r6 = r0
            r12 = r10
            r0 = r33
            goto L_0x001c
        L_0x0216:
            r10 = r32
            r11 = r36
            r12 = r2
            r17 = r3
            r13 = r19
            r2 = r22
            if (r0 != r6) goto L_0x00e3
            int r0 = com.google.protobuf.C9572e.h(r10, r4)
            r9.putInt(r14, r2, r0)
            int r0 = r4 + 4
            r6 = r7 | r20
            goto L_0x0173
        L_0x0230:
            r10 = r32
            r11 = r36
            r12 = r2
            r17 = r3
            r13 = r19
            r2 = r22
            if (r0 != r5) goto L_0x00e3
            long r5 = com.google.protobuf.C9572e.j(r10, r4)
            r0 = r9
            r1 = r31
            r33 = r8
            r8 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
        L_0x024b:
            int r0 = r8 + 8
        L_0x024d:
            r6 = r7 | r20
            r7 = r33
            goto L_0x0174
        L_0x0253:
            r10 = r32
            r11 = r36
            r12 = r2
            r17 = r3
            r33 = r8
            r13 = r19
            r2 = r22
            r8 = r4
            if (r0 != 0) goto L_0x02cf
            int r0 = com.google.protobuf.C9572e.I(r10, r8, r11)
            int r1 = r11.f69272a
            r9.putInt(r14, r2, r1)
            goto L_0x024d
        L_0x026d:
            r10 = r32
            r11 = r36
            r12 = r2
            r17 = r3
            r33 = r8
            r13 = r19
            r2 = r22
            r8 = r4
            if (r0 != 0) goto L_0x02cf
            int r6 = com.google.protobuf.C9572e.L(r10, r8, r11)
            long r4 = r11.f69273b
            r0 = r9
            r1 = r31
            r0.putLong(r1, r2, r4)
            r0 = r7 | r20
            r7 = r33
            r2 = r12
            r3 = r13
            r1 = r17
            r8 = -1
            r13 = r34
            r12 = r10
            r28 = r6
            r6 = r0
            r0 = r28
            goto L_0x001c
        L_0x029c:
            r10 = r32
            r11 = r36
            r12 = r2
            r17 = r3
            r33 = r8
            r13 = r19
            r2 = r22
            r8 = r4
            if (r0 != r6) goto L_0x02cf
            float r0 = com.google.protobuf.C9572e.l(r10, r8)
            com.google.protobuf.s0.O(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x024d
        L_0x02b6:
            r10 = r32
            r11 = r36
            r12 = r2
            r17 = r3
            r33 = r8
            r13 = r19
            r2 = r22
            r8 = r4
            if (r0 != r5) goto L_0x02cf
            double r0 = com.google.protobuf.C9572e.d(r10, r8)
            com.google.protobuf.s0.N(r14, r2, r0)
            goto L_0x024b
        L_0x02cf:
            r26 = r33
            r20 = r7
            r2 = r8
            r27 = r9
            r25 = r12
            r9 = r13
            r18 = -1
            r8 = r35
            goto L_0x03e6
        L_0x02df:
            r17 = r3
            r8 = r4
            r13 = r19
            r28 = r11
            r11 = r36
            r12 = r2
            r2 = r28
            r4 = 27
            if (r10 != r4) goto L_0x033a
            r4 = 2
            if (r0 != r4) goto L_0x032b
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.protobuf.z$i r0 = (com.google.protobuf.C9592z.i) r0
            boolean r1 = r0.u()
            if (r1 != 0) goto L_0x0310
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0307
            r1 = 10
            goto L_0x0309
        L_0x0307:
            int r1 = r1 * 2
        L_0x0309:
            com.google.protobuf.z$i r0 = r0.f(r1)
            r9.putObject(r14, r2, r0)
        L_0x0310:
            r5 = r0
            com.google.protobuf.h0 r0 = r15.w(r12)
            r1 = r13
            r2 = r32
            r3 = r8
            r4 = r34
            r20 = r6
            r6 = r36
            int r0 = com.google.protobuf.C9572e.q(r0, r1, r2, r3, r4, r5, r6)
            r2 = r12
            r3 = r13
            r1 = r17
            r6 = r20
            goto L_0x00d3
        L_0x032b:
            r20 = r6
            r26 = r7
            r15 = r8
            r27 = r9
            r25 = r12
            r24 = r13
            r18 = -1
            goto L_0x03c5
        L_0x033a:
            r20 = r6
            r4 = 49
            if (r10 > r4) goto L_0x0393
            long r5 = (long) r1
            r4 = r0
            r0 = r30
            r1 = r31
            r22 = r2
            r2 = r32
            r3 = r8
            r33 = r4
            r4 = r34
            r24 = r5
            r5 = r13
            r6 = r17
            r26 = r7
            r7 = r33
            r15 = r8
            r18 = -1
            r8 = r12
            r27 = r9
            r19 = r10
            r9 = r24
            r11 = r19
            r25 = r12
            r24 = r13
            r12 = r22
            r14 = r36
            int r0 = r0.g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x038c
        L_0x0372:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r36
            r1 = r17
            r8 = r18
            r6 = r20
            r3 = r24
        L_0x0384:
            r2 = r25
            r7 = r26
            r9 = r27
            goto L_0x001c
        L_0x038c:
            r8 = r35
            r2 = r0
        L_0x038f:
            r9 = r24
            goto L_0x03e6
        L_0x0393:
            r33 = r0
            r22 = r2
            r26 = r7
            r15 = r8
            r27 = r9
            r19 = r10
            r25 = r12
            r24 = r13
            r18 = -1
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x03c9
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x03c5
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r25
            r6 = r22
            r8 = r36
            int r0 = r0.d0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x038c
            goto L_0x0372
        L_0x03c5:
            r8 = r35
            r2 = r15
            goto L_0x038f
        L_0x03c9:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r24
            r6 = r17
            r10 = r22
            r12 = r25
            r13 = r36
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x038c
            goto L_0x0372
        L_0x03e6:
            if (r9 != r8) goto L_0x03f5
            if (r8 == 0) goto L_0x03f5
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r30
            r6 = r2
            r0 = r20
            r7 = r26
            goto L_0x0446
        L_0x03f5:
            r10 = r30
            boolean r0 = r10.f69244f
            r11 = r36
            if (r0 == 0) goto L_0x0417
            com.google.protobuf.p r0 = r11.f69275d
            com.google.protobuf.p r1 = com.google.protobuf.C9583p.b()
            if (r0 == r1) goto L_0x0417
            com.google.protobuf.S r5 = r10.f69243e
            com.google.protobuf.o0<?, ?> r6 = r10.f69253o
            r0 = r9
            r1 = r32
            r3 = r34
            r4 = r31
            r7 = r36
            int r0 = com.google.protobuf.C9572e.g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0426
        L_0x0417:
            com.google.protobuf.p0 r4 = x(r31)
            r0 = r9
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.protobuf.C9572e.G(r0, r1, r2, r3, r4, r5)
        L_0x0426:
            r14 = r31
            r12 = r32
            r13 = r34
            r3 = r9
            r15 = r10
            r1 = r17
            r8 = r18
            r6 = r20
            goto L_0x0384
        L_0x0436:
            r8 = r35
            r20 = r6
            r26 = r7
            r27 = r9
            r10 = r15
            r6 = r0
            r9 = r3
            r0 = r20
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0446:
            if (r7 == r1) goto L_0x0451
            long r1 = (long) r7
            r7 = r31
            r3 = r27
            r3.putInt(r7, r1, r0)
            goto L_0x0453
        L_0x0451:
            r7 = r31
        L_0x0453:
            int r0 = r10.f69249k
            r1 = 0
            r11 = r0
            r3 = r1
        L_0x0458:
            int r0 = r10.f69250l
            if (r11 >= r0) goto L_0x0472
            int[] r0 = r10.f69248j
            r2 = r0[r11]
            com.google.protobuf.o0<?, ?> r4 = r10.f69253o
            r0 = r30
            r1 = r31
            r5 = r31
            java.lang.Object r0 = r0.r(r1, r2, r3, r4, r5)
            r3 = r0
            com.google.protobuf.p0 r3 = (com.google.protobuf.p0) r3
            int r11 = r11 + 1
            goto L_0x0458
        L_0x0472:
            if (r3 == 0) goto L_0x0479
            com.google.protobuf.o0<?, ?> r0 = r10.f69253o
            r0.o(r7, r3)
        L_0x0479:
            if (r8 != 0) goto L_0x0485
            r0 = r34
            if (r6 != r0) goto L_0x0480
            goto L_0x048b
        L_0x0480:
            com.google.protobuf.B r0 = com.google.protobuf.B.h()
            throw r0
        L_0x0485:
            r0 = r34
            if (r6 > r0) goto L_0x048c
            if (r9 != r8) goto L_0x048c
        L_0x048b:
            return r6
        L_0x048c:
            com.google.protobuf.B r0 = com.google.protobuf.B.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.e0(java.lang.Object, byte[], int, int, int, com.google.protobuf.e$b):int");
    }

    public void f(T t10) {
        if (H(t10)) {
            if (t10 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.f69239a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int v02 = v0(i10);
                long X10 = X(v02);
                int u02 = u0(v02);
                if (u02 != 9) {
                    if (u02 == 60 || u02 == 68) {
                        if (J(t10, W(i10), i10)) {
                            w(i10).f(f69238s.getObject(t10, X10));
                        }
                    } else {
                        switch (u02) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
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
                            case ImageFormat.YUV_420_888:
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
                                this.f69252n.c(t10, X10);
                                continue;
                            case 50:
                                Unsafe unsafe = f69238s;
                                Object object = unsafe.getObject(t10, X10);
                                if (object != null) {
                                    unsafe.putObject(t10, X10, this.f69255q.f(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (B(t10, i10)) {
                    w(i10).f(f69238s.getObject(t10, X10));
                }
            }
            this.f69253o.j(t10);
            if (this.f69244f) {
                this.f69254p.f(t10);
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
        while (i14 < this.f69249k) {
            int i15 = this.f69248j[i14];
            int W10 = W(i15);
            int v02 = v0(i15);
            int i16 = this.f69239a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f69238s.getInt(t11, (long) i17);
                }
                i10 = i13;
                i11 = i17;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (K(v02) && !C(t10, i15, i11, i10, i18)) {
                return false;
            }
            int u02 = u0(v02);
            if (u02 != 9 && u02 != 17) {
                if (u02 != 27) {
                    if (u02 == 60 || u02 == 68) {
                        if (J(t11, W10, i15) && !D(t11, v02, w(i15))) {
                            return false;
                        }
                    } else if (u02 != 49) {
                        if (u02 == 50 && !G(t11, v02, i15)) {
                            return false;
                        }
                    }
                }
                if (!F(t11, v02, i15)) {
                    return false;
                }
            } else if (C(t10, i15, i11, i10, i18) && !D(t11, v02, w(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        return !this.f69244f || this.f69254p.c(t11).p();
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
            sun.misc.Unsafe r8 = f69238s
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r10
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x000d:
            int[] r2 = r6.f69239a
            int r2 = r2.length
            if (r11 >= r2) goto L_0x060c
            int r2 = r6.v0(r11)
            int r3 = u0(r2)
            int r13 = r6.W(r11)
            int[] r4 = r6.f69239a
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
            long r1 = X(r2)
            com.google.protobuf.v r0 = com.google.protobuf.C9588v.DOUBLE_LIST_PACKED
            int r0 = r0.a()
            if (r3 < r0) goto L_0x005c
            com.google.protobuf.v r0 = com.google.protobuf.C9588v.SINT64_LIST_PACKED
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
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.protobuf.S r0 = (com.google.protobuf.S) r0
            com.google.protobuf.h0 r1 = r6.w(r11)
            int r0 = com.google.protobuf.C9578k.s(r13, r0, r1)
        L_0x0078:
            int r12 = r12 + r0
        L_0x0079:
            r15 = 0
            goto L_0x0602
        L_0x007c:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = c0(r7, r1)
            int r0 = com.google.protobuf.C9578k.P(r13, r0)
            goto L_0x0078
        L_0x008b:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = b0(r7, r1)
            int r0 = com.google.protobuf.C9578k.N(r13, r0)
            goto L_0x0078
        L_0x009a:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = com.google.protobuf.C9578k.L(r13, r9)
            goto L_0x0078
        L_0x00a5:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = com.google.protobuf.C9578k.J(r13, r0)
        L_0x00b0:
            int r12 = r12 + r1
            goto L_0x0079
        L_0x00b2:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = b0(r7, r1)
            int r0 = com.google.protobuf.C9578k.k(r13, r0)
            goto L_0x0078
        L_0x00c1:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = b0(r7, r1)
            int r0 = com.google.protobuf.C9578k.U(r13, r0)
            goto L_0x0078
        L_0x00d0:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.protobuf.h r0 = (com.google.protobuf.C9575h) r0
            int r0 = com.google.protobuf.C9578k.g(r13, r0)
            goto L_0x0078
        L_0x00e1:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.protobuf.h0 r1 = r6.w(r11)
            int r0 = com.google.protobuf.j0.o(r13, r0, r1)
            goto L_0x0078
        L_0x00f4:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            boolean r1 = r0 instanceof com.google.protobuf.C9575h
            if (r1 == 0) goto L_0x010a
            com.google.protobuf.h r0 = (com.google.protobuf.C9575h) r0
            int r0 = com.google.protobuf.C9578k.g(r13, r0)
            goto L_0x0078
        L_0x010a:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.protobuf.C9578k.R(r13, r0)
            goto L_0x0078
        L_0x0112:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = com.google.protobuf.C9578k.d(r13, r15)
            goto L_0x0078
        L_0x011e:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = com.google.protobuf.C9578k.m(r13, r0)
            goto L_0x00b0
        L_0x012a:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = com.google.protobuf.C9578k.o(r13, r9)
            goto L_0x0078
        L_0x0136:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = b0(r7, r1)
            int r0 = com.google.protobuf.C9578k.v(r13, r0)
            goto L_0x0078
        L_0x0146:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = c0(r7, r1)
            int r0 = com.google.protobuf.C9578k.W(r13, r0)
            goto L_0x0078
        L_0x0156:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = c0(r7, r1)
            int r0 = com.google.protobuf.C9578k.x(r13, r0)
            goto L_0x0078
        L_0x0166:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = com.google.protobuf.C9578k.q(r13, r4)
            goto L_0x0078
        L_0x0172:
            boolean r0 = r6.J(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r0 = com.google.protobuf.C9578k.i(r13, r0)
            goto L_0x0078
        L_0x0180:
            com.google.protobuf.M r0 = r6.f69255q
            java.lang.Object r1 = r8.getObject(r7, r1)
            java.lang.Object r2 = r6.v(r11)
            int r0 = r0.g(r13, r1, r2)
            goto L_0x0078
        L_0x0190:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.protobuf.h0 r1 = r6.w(r11)
            int r0 = com.google.protobuf.j0.j(r13, r0, r1)
            goto L_0x0078
        L_0x01a0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.t(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x01b4
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01b4:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
        L_0x01bc:
            int r1 = r1 + r2
            int r1 = r1 + r0
            goto L_0x00b0
        L_0x01c0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.r(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x01d4
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01d4:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x01dd:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x01f1
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01f1:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x01fa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x020e
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x020e:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x0217:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.e(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x022b
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x022b:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x0234:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.w(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x0248
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0248:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x0252:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.b(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x0266
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0266:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x0270:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x0284
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0284:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x028e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x02a2
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02a2:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x02ac:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.l(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x02c0
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02c0:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x02ca:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.y(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x02de
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02de:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x02e8:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.n(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x02fc
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02fc:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x0306:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x031a
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x031a:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x0324:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f69247i
            if (r1 == 0) goto L_0x0338
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0338:
            int r1 = com.google.protobuf.C9578k.T(r13)
            int r2 = com.google.protobuf.C9578k.V(r0)
            goto L_0x01bc
        L_0x0342:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = com.google.protobuf.j0.s(r13, r0, r3)
        L_0x034d:
            int r12 = r12 + r0
            r15 = r3
            goto L_0x0602
        L_0x0351:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.q(r13, r0, r3)
            goto L_0x034d
        L_0x035d:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.h(r13, r0, r3)
            goto L_0x034d
        L_0x0369:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.f(r13, r0, r3)
            goto L_0x034d
        L_0x0375:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.d(r13, r0, r3)
            goto L_0x034d
        L_0x0381:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.v(r13, r0, r3)
            goto L_0x0078
        L_0x038e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.c(r13, r0)
            goto L_0x0078
        L_0x039a:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.protobuf.h0 r1 = r6.w(r11)
            int r0 = com.google.protobuf.j0.p(r13, r0, r1)
            goto L_0x0078
        L_0x03aa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.u(r13, r0)
            goto L_0x0078
        L_0x03b6:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = com.google.protobuf.j0.a(r13, r0, r3)
            goto L_0x034d
        L_0x03c2:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.f(r13, r0, r3)
            goto L_0x034d
        L_0x03cf:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.h(r13, r0, r3)
            goto L_0x034d
        L_0x03dc:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.k(r13, r0, r3)
            goto L_0x034d
        L_0x03e9:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.x(r13, r0, r3)
            goto L_0x034d
        L_0x03f6:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.m(r13, r0, r3)
            goto L_0x034d
        L_0x0403:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.f(r13, r0, r3)
            goto L_0x034d
        L_0x0410:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.protobuf.j0.h(r13, r0, r3)
            goto L_0x0078
        L_0x041d:
            r0 = r18
            r9 = r1
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.protobuf.S r0 = (com.google.protobuf.S) r0
            com.google.protobuf.h0 r1 = r6.w(r11)
            int r0 = com.google.protobuf.C9578k.s(r13, r0, r1)
            goto L_0x0078
        L_0x043e:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.protobuf.C9578k.P(r13, r0)
            goto L_0x0078
        L_0x0459:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.protobuf.C9578k.N(r13, r0)
            goto L_0x0078
        L_0x0474:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = com.google.protobuf.C9578k.L(r13, r9)
            goto L_0x0078
        L_0x048a:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = com.google.protobuf.C9578k.J(r13, r0)
            goto L_0x00b0
        L_0x04a1:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.protobuf.C9578k.k(r13, r0)
            goto L_0x0078
        L_0x04bc:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.protobuf.C9578k.U(r13, r0)
            goto L_0x0078
        L_0x04d7:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.protobuf.h r0 = (com.google.protobuf.C9575h) r0
            int r0 = com.google.protobuf.C9578k.g(r13, r0)
            goto L_0x0078
        L_0x04f4:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.protobuf.h0 r1 = r6.w(r11)
            int r0 = com.google.protobuf.j0.o(r13, r0, r1)
            goto L_0x0078
        L_0x0513:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            boolean r1 = r0 instanceof com.google.protobuf.C9575h
            if (r1 == 0) goto L_0x0534
            com.google.protobuf.h r0 = (com.google.protobuf.C9575h) r0
            int r0 = com.google.protobuf.C9578k.g(r13, r0)
            goto L_0x0078
        L_0x0534:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.protobuf.C9578k.R(r13, r0)
            goto L_0x0078
        L_0x053c:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = com.google.protobuf.C9578k.d(r13, r15)
            goto L_0x0078
        L_0x0552:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            r15 = 0
            int r0 = com.google.protobuf.C9578k.m(r13, r15)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = com.google.protobuf.C9578k.o(r13, r9)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.protobuf.C9578k.v(r13, r0)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.protobuf.C9578k.W(r13, r0)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.protobuf.C9578k.x(r13, r0)
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
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = com.google.protobuf.C9578k.q(r13, r9)
            goto L_0x0567
        L_0x05e9:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            r0 = 0
            int r0 = com.google.protobuf.C9578k.i(r13, r0)
            goto L_0x0567
        L_0x0602:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x060c:
            com.google.protobuf.o0<?, ?> r0 = r6.f69253o
            int r0 = r6.y(r0, r7)
            int r12 = r12 + r0
            boolean r0 = r6.f69244f
            if (r0 == 0) goto L_0x0622
            com.google.protobuf.q<?> r0 = r6.f69254p
            com.google.protobuf.u r0 = r0.c(r7)
            int r0 = r0.l()
            int r12 = r12 + r0
        L_0x0622:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.h(java.lang.Object):int");
    }

    public void i(T t10, g0 g0Var, C9583p pVar) {
        pVar.getClass();
        m(t10);
        M(this.f69253o, this.f69254p, t10, g0Var, pVar);
    }

    public void j(T t10, byte[] bArr, int i10, int i11, C9572e.b bVar) {
        e0(t10, bArr, i10, i11, 0, bVar);
    }
}
