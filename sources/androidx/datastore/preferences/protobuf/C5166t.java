package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C5166t.b;
import androidx.datastore.preferences.protobuf.C5172z;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.t  reason: case insensitive filesystem */
final class C5166t<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final C5166t<?> f21439d = new C5166t<>(true);

    /* renamed from: a  reason: collision with root package name */
    private final k0<T, Object> f21440a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21441b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21442c;

    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21443a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f21444b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                androidx.datastore.preferences.protobuf.t0$b[] r0 = androidx.datastore.preferences.protobuf.t0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21444b = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.t0$b r2 = androidx.datastore.preferences.protobuf.t0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f21444b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.t0$b r3 = androidx.datastore.preferences.protobuf.t0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f21444b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.t0$b r4 = androidx.datastore.preferences.protobuf.t0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f21444b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.t0$b r5 = androidx.datastore.preferences.protobuf.t0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f21444b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.t0$b r6 = androidx.datastore.preferences.protobuf.t0.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f21444b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.t0$b r7 = androidx.datastore.preferences.protobuf.t0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f21444b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.t0$b r8 = androidx.datastore.preferences.protobuf.t0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f21444b     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.t0$b r9 = androidx.datastore.preferences.protobuf.t0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f21444b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.t0$b r10 = androidx.datastore.preferences.protobuf.t0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                androidx.datastore.preferences.protobuf.t0$c[] r9 = androidx.datastore.preferences.protobuf.t0.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f21443a = r9
                androidx.datastore.preferences.protobuf.t0$c r10 = androidx.datastore.preferences.protobuf.t0.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f21443a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                androidx.datastore.preferences.protobuf.t0$c r9 = androidx.datastore.preferences.protobuf.t0.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f21443a     // Catch:{ NoSuchFieldError -> 0x00fd }
                androidx.datastore.preferences.protobuf.t0$c r1 = androidx.datastore.preferences.protobuf.t0.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f21443a     // Catch:{ NoSuchFieldError -> 0x0107 }
                androidx.datastore.preferences.protobuf.t0$c r1 = androidx.datastore.preferences.protobuf.t0.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f21443a     // Catch:{ NoSuchFieldError -> 0x0111 }
                androidx.datastore.preferences.protobuf.t0$c r1 = androidx.datastore.preferences.protobuf.t0.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f21443a     // Catch:{ NoSuchFieldError -> 0x011b }
                androidx.datastore.preferences.protobuf.t0$c r1 = androidx.datastore.preferences.protobuf.t0.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f21443a     // Catch:{ NoSuchFieldError -> 0x0125 }
                androidx.datastore.preferences.protobuf.t0$c r1 = androidx.datastore.preferences.protobuf.t0.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f21443a     // Catch:{ NoSuchFieldError -> 0x012f }
                androidx.datastore.preferences.protobuf.t0$c r1 = androidx.datastore.preferences.protobuf.t0.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f21443a     // Catch:{ NoSuchFieldError -> 0x0139 }
                androidx.datastore.preferences.protobuf.t0$c r1 = androidx.datastore.preferences.protobuf.t0.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C5166t.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        int d();

        boolean e();

        t0.b f();

        t0.c g();

        boolean i();

        S.a s(S.a aVar, S s10);
    }

    private C5166t() {
        this.f21440a = k0.u();
    }

    static void A(C5157j jVar, t0.b bVar, int i10, Object obj) {
        if (bVar == t0.b.GROUP) {
            jVar.z0(i10, (S) obj);
            return;
        }
        jVar.V0(i10, m(bVar, false));
        B(jVar, bVar, obj);
    }

    static void B(C5157j jVar, t0.b bVar, Object obj) {
        switch (a.f21444b[bVar.ordinal()]) {
            case 1:
                jVar.q0(((Double) obj).doubleValue());
                return;
            case 2:
                jVar.y0(((Float) obj).floatValue());
                return;
            case 3:
                jVar.G0(((Long) obj).longValue());
                return;
            case 4:
                jVar.Z0(((Long) obj).longValue());
                return;
            case 5:
                jVar.E0(((Integer) obj).intValue());
                return;
            case 6:
                jVar.w0(((Long) obj).longValue());
                return;
            case 7:
                jVar.u0(((Integer) obj).intValue());
                return;
            case 8:
                jVar.k0(((Boolean) obj).booleanValue());
                return;
            case 9:
                jVar.B0((S) obj);
                return;
            case 10:
                jVar.I0((S) obj);
                return;
            case 11:
                if (obj instanceof C5154g) {
                    jVar.o0((C5154g) obj);
                    return;
                } else {
                    jVar.U0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C5154g) {
                    jVar.o0((C5154g) obj);
                    return;
                } else {
                    jVar.l0((byte[]) obj);
                    return;
                }
            case 13:
                jVar.X0(((Integer) obj).intValue());
                return;
            case 14:
                jVar.M0(((Integer) obj).intValue());
                return;
            case 15:
                jVar.O0(((Long) obj).longValue());
                return;
            case 16:
                jVar.Q0(((Integer) obj).intValue());
                return;
            case 17:
                jVar.S0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C5172z.c) {
                    jVar.s0(((C5172z.c) obj).d());
                    return;
                } else {
                    jVar.s0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(t0.b bVar, int i10, Object obj) {
        int U10 = C5157j.U(i10);
        if (bVar == t0.b.GROUP) {
            U10 *= 2;
        }
        return U10 + e(bVar, obj);
    }

    static int e(t0.b bVar, Object obj) {
        switch (a.f21444b[bVar.ordinal()]) {
            case 1:
                return C5157j.j(((Double) obj).doubleValue());
            case 2:
                return C5157j.r(((Float) obj).floatValue());
            case 3:
                return C5157j.y(((Long) obj).longValue());
            case 4:
                return C5157j.Y(((Long) obj).longValue());
            case 5:
                return C5157j.w(((Integer) obj).intValue());
            case 6:
                return C5157j.p(((Long) obj).longValue());
            case 7:
                return C5157j.n(((Integer) obj).intValue());
            case 8:
                return C5157j.e(((Boolean) obj).booleanValue());
            case 9:
                return C5157j.t((S) obj);
            case 10:
                return obj instanceof C ? C5157j.B((C) obj) : C5157j.G((S) obj);
            case 11:
                return obj instanceof C5154g ? C5157j.h((C5154g) obj) : C5157j.T((String) obj);
            case 12:
                return obj instanceof C5154g ? C5157j.h((C5154g) obj) : C5157j.f((byte[]) obj);
            case 13:
                return C5157j.W(((Integer) obj).intValue());
            case 14:
                return C5157j.L(((Integer) obj).intValue());
            case 15:
                return C5157j.N(((Long) obj).longValue());
            case 16:
                return C5157j.P(((Integer) obj).intValue());
            case 17:
                return C5157j.R(((Long) obj).longValue());
            case 18:
                return obj instanceof C5172z.c ? C5157j.l(((C5172z.c) obj).d()) : C5157j.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        t0.b f10 = bVar.f();
        int d10 = bVar.d();
        if (!bVar.e()) {
            return d(f10, d10, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.i()) {
            int i11 = 0;
            while (i10 < size) {
                i11 += d(f10, d10, list.get(i10));
                i10++;
            }
            return i11;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            int i12 = 0;
            while (i10 < size) {
                i12 += e(f10, list.get(i10));
                i10++;
            }
            return C5157j.U(d10) + i12 + C5157j.W(i12);
        }
    }

    public static <T extends b<T>> C5166t<T> h() {
        return f21439d;
    }

    private int k(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        return (bVar.g() != t0.c.MESSAGE || bVar.e() || bVar.i()) ? f(bVar, value) : value instanceof C ? C5157j.z(((b) entry.getKey()).d(), (C) value) : C5157j.D(((b) entry.getKey()).d(), (S) value);
    }

    static int m(t0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.g() != t0.c.MESSAGE) {
            return true;
        }
        if (!bVar.e()) {
            return r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!r(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof T) {
            return ((T) obj).isInitialized();
        }
        if (obj instanceof C) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(t0.b bVar, Object obj) {
        C5172z.a(obj);
        switch (a.f21443a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof C5154g) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C5172z.c);
            case 9:
                return (obj instanceof S) || (obj instanceof C);
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof C;
        if (bVar.e()) {
            if (!z10) {
                Object i10 = i(bVar);
                if (i10 == null) {
                    i10 = new ArrayList();
                }
                for (Object c10 : (List) value) {
                    ((List) i10).add(c(c10));
                }
                this.f21440a.put(bVar, i10);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (bVar.g() == t0.c.MESSAGE) {
            Object i11 = i(bVar);
            if (i11 == null) {
                this.f21440a.put(bVar, c(value));
                if (z10) {
                    this.f21442c = true;
                    return;
                }
                return;
            }
            if (z10) {
                value = ((C) value).f();
            }
            this.f21440a.put(bVar, bVar.s(((S) i11).toBuilder(), (S) value).g());
        } else if (!z10) {
            this.f21440a.put(bVar, c(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    public static <T extends b<T>> C5166t<T> x() {
        return new C5166t<>();
    }

    private void z(T t10, Object obj) {
        if (!s(t10.f(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t10.d()), t10.f().a(), obj.getClass().getName()}));
        }
    }

    public void a(T t10, Object obj) {
        List list;
        if (t10.e()) {
            z(t10, obj);
            Object i10 = i(t10);
            if (i10 == null) {
                list = new ArrayList();
                this.f21440a.put(t10, list);
            } else {
                list = (List) i10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C5166t<T> clone() {
        C5166t<T> x10 = x();
        int n10 = this.f21440a.n();
        for (int i10 = 0; i10 < n10; i10++) {
            Map.Entry<T, Object> m10 = this.f21440a.m(i10);
            x10.y((b) m10.getKey(), m10.getValue());
        }
        for (Map.Entry next : this.f21440a.p()) {
            x10.y((b) next.getKey(), next.getValue());
        }
        x10.f21442c = this.f21442c;
        return x10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5166t)) {
            return false;
        }
        return this.f21440a.equals(((C5166t) obj).f21440a);
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return n() ? Collections.emptyIterator() : this.f21442c ? new C.c(this.f21440a.k().iterator()) : this.f21440a.k().iterator();
    }

    public int hashCode() {
        return this.f21440a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f21440a.get(t10);
        return obj instanceof C ? ((C) obj).f() : obj;
    }

    public int j() {
        int n10 = this.f21440a.n();
        int i10 = 0;
        for (int i11 = 0; i11 < n10; i11++) {
            i10 += k(this.f21440a.m(i11));
        }
        for (Map.Entry<T, Object> k10 : this.f21440a.p()) {
            i10 += k(k10);
        }
        return i10;
    }

    public int l() {
        int n10 = this.f21440a.n();
        int i10 = 0;
        for (int i11 = 0; i11 < n10; i11++) {
            Map.Entry<T, Object> m10 = this.f21440a.m(i11);
            i10 += f((b) m10.getKey(), m10.getValue());
        }
        for (Map.Entry next : this.f21440a.p()) {
            i10 += f((b) next.getKey(), next.getValue());
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f21440a.isEmpty();
    }

    public boolean o() {
        return this.f21441b;
    }

    public boolean p() {
        int n10 = this.f21440a.n();
        for (int i10 = 0; i10 < n10; i10++) {
            if (!q(this.f21440a.m(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q10 : this.f21440a.p()) {
            if (!q(q10)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        return n() ? Collections.emptyIterator() : this.f21442c ? new C.c(this.f21440a.entrySet().iterator()) : this.f21440a.entrySet().iterator();
    }

    public void u() {
        if (!this.f21441b) {
            int n10 = this.f21440a.n();
            for (int i10 = 0; i10 < n10; i10++) {
                Map.Entry<T, Object> m10 = this.f21440a.m(i10);
                if (m10.getValue() instanceof C5170x) {
                    ((C5170x) m10.getValue()).C();
                }
            }
            this.f21440a.t();
            this.f21441b = true;
        }
    }

    public void v(C5166t<T> tVar) {
        int n10 = tVar.f21440a.n();
        for (int i10 = 0; i10 < n10; i10++) {
            w(tVar.f21440a.m(i10));
        }
        for (Map.Entry<T, Object> w10 : tVar.f21440a.p()) {
            w(w10);
        }
    }

    public void y(T t10, Object obj) {
        if (!t10.e()) {
            z(t10, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object z10 : arrayList) {
                z(t10, z10);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C) {
            this.f21442c = true;
        }
        this.f21440a.put(t10, obj);
    }

    private C5166t(boolean z10) {
        this(k0.u());
        u();
    }

    private C5166t(k0<T, Object> k0Var) {
        this.f21440a = k0Var;
        u();
    }
}
