package eJ;

import eJ.C17197h.b;
import eJ.C17199j;
import eJ.C17201l;
import eJ.C17206q;
import eJ.C17215z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: eJ.h  reason: case insensitive filesystem */
final class C17197h<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    private static final C17197h f143043d = new C17197h(true);

    /* renamed from: a  reason: collision with root package name */
    private final C17211v<FieldDescriptorType, Object> f143044a = C17211v.q(16);

    /* renamed from: b  reason: collision with root package name */
    private boolean f143045b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f143046c = false;

    /* renamed from: eJ.h$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f143047a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f143048b;

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
                eJ.z$b[] r0 = eJ.C17215z.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f143048b = r0
                r1 = 1
                eJ.z$b r2 = eJ.C17215z.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f143048b     // Catch:{ NoSuchFieldError -> 0x001d }
                eJ.z$b r3 = eJ.C17215z.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f143048b     // Catch:{ NoSuchFieldError -> 0x0028 }
                eJ.z$b r4 = eJ.C17215z.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f143048b     // Catch:{ NoSuchFieldError -> 0x0033 }
                eJ.z$b r5 = eJ.C17215z.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f143048b     // Catch:{ NoSuchFieldError -> 0x003e }
                eJ.z$b r6 = eJ.C17215z.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f143048b     // Catch:{ NoSuchFieldError -> 0x0049 }
                eJ.z$b r7 = eJ.C17215z.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f143048b     // Catch:{ NoSuchFieldError -> 0x0054 }
                eJ.z$b r8 = eJ.C17215z.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f143048b     // Catch:{ NoSuchFieldError -> 0x0060 }
                eJ.z$b r9 = eJ.C17215z.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x006c }
                eJ.z$b r10 = eJ.C17215z.b.STRING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x0078 }
                eJ.z$b r10 = eJ.C17215z.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x0084 }
                eJ.z$b r10 = eJ.C17215z.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x0090 }
                eJ.z$b r10 = eJ.C17215z.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x009c }
                eJ.z$b r10 = eJ.C17215z.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                eJ.z$b r10 = eJ.C17215z.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                eJ.z$b r10 = eJ.C17215z.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                eJ.z$b r10 = eJ.C17215z.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x00cc }
                eJ.z$b r10 = eJ.C17215z.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f143048b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                eJ.z$b r10 = eJ.C17215z.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                eJ.z$c[] r9 = eJ.C17215z.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f143047a = r9
                eJ.z$c r10 = eJ.C17215z.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f143047a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                eJ.z$c r9 = eJ.C17215z.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f143047a     // Catch:{ NoSuchFieldError -> 0x00fd }
                eJ.z$c r1 = eJ.C17215z.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f143047a     // Catch:{ NoSuchFieldError -> 0x0107 }
                eJ.z$c r1 = eJ.C17215z.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f143047a     // Catch:{ NoSuchFieldError -> 0x0111 }
                eJ.z$c r1 = eJ.C17215z.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f143047a     // Catch:{ NoSuchFieldError -> 0x011b }
                eJ.z$c r1 = eJ.C17215z.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f143047a     // Catch:{ NoSuchFieldError -> 0x0125 }
                eJ.z$c r1 = eJ.C17215z.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f143047a     // Catch:{ NoSuchFieldError -> 0x012f }
                eJ.z$c r1 = eJ.C17215z.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f143047a     // Catch:{ NoSuchFieldError -> 0x0139 }
                eJ.z$c r1 = eJ.C17215z.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: eJ.C17197h.a.<clinit>():void");
        }
    }

    /* renamed from: eJ.h$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        int d();

        boolean e();

        C17215z.b f();

        C17215z.c g();

        boolean i();

        C17206q.a z(C17206q.a aVar, C17206q qVar);
    }

    private C17197h() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(C17215z.b bVar, int i10, Object obj) {
        int D10 = C17195f.D(i10);
        if (bVar == C17215z.b.GROUP) {
            D10 *= 2;
        }
        return D10 + e(bVar, obj);
    }

    private static int e(C17215z.b bVar, Object obj) {
        switch (a.f143048b[bVar.ordinal()]) {
            case 1:
                return C17195f.g(((Double) obj).doubleValue());
            case 2:
                return C17195f.m(((Float) obj).floatValue());
            case 3:
                return C17195f.q(((Long) obj).longValue());
            case 4:
                return C17195f.F(((Long) obj).longValue());
            case 5:
                return C17195f.p(((Integer) obj).intValue());
            case 6:
                return C17195f.k(((Long) obj).longValue());
            case 7:
                return C17195f.j(((Integer) obj).intValue());
            case 8:
                return C17195f.b(((Boolean) obj).booleanValue());
            case 9:
                return C17195f.C((String) obj);
            case 10:
                return obj instanceof C17193d ? C17195f.e((C17193d) obj) : C17195f.c((byte[]) obj);
            case 11:
                return C17195f.E(((Integer) obj).intValue());
            case 12:
                return C17195f.x(((Integer) obj).intValue());
            case 13:
                return C17195f.y(((Long) obj).longValue());
            case 14:
                return C17195f.z(((Integer) obj).intValue());
            case 15:
                return C17195f.B(((Long) obj).longValue());
            case 16:
                return C17195f.n((C17206q) obj);
            case 17:
                return obj instanceof C17201l ? C17195f.r((C17201l) obj) : C17195f.t((C17206q) obj);
            case 18:
                return obj instanceof C17199j.a ? C17195f.i(((C17199j.a) obj).d()) : C17195f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        C17215z.b f10 = bVar.f();
        int d10 = bVar.d();
        if (!bVar.e()) {
            return d(f10, d10, obj);
        }
        int i10 = 0;
        if (bVar.i()) {
            for (Object e10 : (List) obj) {
                i10 += e(f10, e10);
            }
            return C17195f.D(d10) + i10 + C17195f.v(i10);
        }
        for (Object d11 : (List) obj) {
            i10 += d(f10, d10, d11);
        }
        return i10;
    }

    public static <T extends b<T>> C17197h<T> g() {
        return f143043d;
    }

    static int l(C17215z.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.g() == C17215z.c.MESSAGE) {
            if (bVar.e()) {
                for (C17206q isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C17206q) {
                    if (!((C17206q) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C17201l) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private void s(Map.Entry<FieldDescriptorType, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C17201l) {
            value = ((C17201l) value).e();
        }
        if (bVar.e()) {
            Object h10 = h(bVar);
            if (h10 == null) {
                h10 = new ArrayList();
            }
            for (Object c10 : (List) value) {
                ((List) h10).add(c(c10));
            }
            this.f143044a.s(bVar, h10);
        } else if (bVar.g() == C17215z.c.MESSAGE) {
            Object h11 = h(bVar);
            if (h11 == null) {
                this.f143044a.s(bVar, c(value));
                return;
            }
            this.f143044a.s(bVar, bVar.z(((C17206q) h11).toBuilder(), (C17206q) value).g());
        } else {
            this.f143044a.s(bVar, c(value));
        }
    }

    public static <T extends b<T>> C17197h<T> t() {
        return new C17197h<>();
    }

    public static Object u(C17194e eVar, C17215z.b bVar, boolean z10) {
        switch (a.f143048b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.t());
            case 4:
                return Long.valueOf(eVar.M());
            case 5:
                return Integer.valueOf(eVar.s());
            case 6:
                return Long.valueOf(eVar.p());
            case 7:
                return Integer.valueOf(eVar.o());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                return z10 ? eVar.J() : eVar.I();
            case 10:
                return eVar.l();
            case 11:
                return Integer.valueOf(eVar.L());
            case 12:
                return Integer.valueOf(eVar.E());
            case 13:
                return Long.valueOf(eVar.F());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if ((r3 instanceof eJ.C17199j.a) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof eJ.C17201l) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void w(eJ.C17215z.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = eJ.C17197h.a.f143047a
            eJ.z$c r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x002a;
                case 8: goto L_0x0021;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof eJ.C17206q
            if (r2 != 0) goto L_0x001f
            boolean r2 = r3 instanceof eJ.C17201l
            if (r2 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r1 = r0
            goto L_0x0044
        L_0x0021:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x001f
            boolean r2 = r3 instanceof eJ.C17199j.a
            if (r2 == 0) goto L_0x001e
            goto L_0x001f
        L_0x002a:
            boolean r2 = r3 instanceof eJ.C17193d
            if (r2 != 0) goto L_0x001f
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x001e
            goto L_0x001f
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0044
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0044
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0044
        L_0x003f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0044
        L_0x0042:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: eJ.C17197h.w(eJ.z$b, java.lang.Object):void");
    }

    private static void x(C17195f fVar, C17215z.b bVar, int i10, Object obj) {
        if (bVar == C17215z.b.GROUP) {
            fVar.Y(i10, (C17206q) obj);
            return;
        }
        fVar.w0(i10, l(bVar, false));
        y(fVar, bVar, obj);
    }

    private static void y(C17195f fVar, C17215z.b bVar, Object obj) {
        switch (a.f143048b[bVar.ordinal()]) {
            case 1:
                fVar.R(((Double) obj).doubleValue());
                return;
            case 2:
                fVar.X(((Float) obj).floatValue());
                return;
            case 3:
                fVar.c0(((Long) obj).longValue());
                return;
            case 4:
                fVar.z0(((Long) obj).longValue());
                return;
            case 5:
                fVar.b0(((Integer) obj).intValue());
                return;
            case 6:
                fVar.V(((Long) obj).longValue());
                return;
            case 7:
                fVar.U(((Integer) obj).intValue());
                return;
            case 8:
                fVar.M(((Boolean) obj).booleanValue());
                return;
            case 9:
                fVar.v0((String) obj);
                return;
            case 10:
                if (obj instanceof C17193d) {
                    fVar.P((C17193d) obj);
                    return;
                } else {
                    fVar.N((byte[]) obj);
                    return;
                }
            case 11:
                fVar.y0(((Integer) obj).intValue());
                return;
            case 12:
                fVar.q0(((Integer) obj).intValue());
                return;
            case 13:
                fVar.r0(((Long) obj).longValue());
                return;
            case 14:
                fVar.s0(((Integer) obj).intValue());
                return;
            case 15:
                fVar.u0(((Long) obj).longValue());
                return;
            case 16:
                fVar.Z((C17206q) obj);
                return;
            case 17:
                fVar.e0((C17206q) obj);
                return;
            case 18:
                if (obj instanceof C17199j.a) {
                    fVar.T(((C17199j.a) obj).d());
                    return;
                } else {
                    fVar.T(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void z(b<?> bVar, Object obj, C17195f fVar) {
        C17215z.b f10 = bVar.f();
        int d10 = bVar.d();
        if (bVar.e()) {
            List<Object> list = (List) obj;
            if (bVar.i()) {
                fVar.w0(d10, 2);
                int i10 = 0;
                for (Object e10 : list) {
                    i10 += e(f10, e10);
                }
                fVar.o0(i10);
                for (Object y10 : list) {
                    y(fVar, f10, y10);
                }
                return;
            }
            for (Object x10 : list) {
                x(fVar, f10, d10, x10);
            }
        } else if (obj instanceof C17201l) {
            x(fVar, f10, d10, ((C17201l) obj).e());
        } else {
            x(fVar, f10, d10, obj);
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.e()) {
            w(fielddescriptortype.f(), obj);
            Object h10 = h(fielddescriptortype);
            if (h10 == null) {
                list = new ArrayList();
                this.f143044a.s(fielddescriptortype, list);
            } else {
                list = (List) h10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C17197h<FieldDescriptorType> clone() {
        C17197h<FieldDescriptorType> t10 = t();
        for (int i10 = 0; i10 < this.f143044a.l(); i10++) {
            Map.Entry<FieldDescriptorType, Object> k10 = this.f143044a.k(i10);
            t10.v((b) k10.getKey(), k10.getValue());
        }
        for (Map.Entry next : this.f143044a.m()) {
            t10.v((b) next.getKey(), next.getValue());
        }
        t10.f143046c = this.f143046c;
        return t10;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f143044a.get(fielddescriptortype);
        return obj instanceof C17201l ? ((C17201l) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i10) {
        if (fielddescriptortype.e()) {
            Object h10 = h(fielddescriptortype);
            if (h10 != null) {
                return ((List) h10).get(i10);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.e()) {
            Object h10 = h(fielddescriptortype);
            if (h10 == null) {
                return 0;
            }
            return ((List) h10).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int k() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f143044a.l(); i11++) {
            Map.Entry<FieldDescriptorType, Object> k10 = this.f143044a.k(i11);
            i10 += f((b) k10.getKey(), k10.getValue());
        }
        for (Map.Entry next : this.f143044a.m()) {
            i10 += f((b) next.getKey(), next.getValue());
        }
        return i10;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.e()) {
            return this.f143044a.get(fielddescriptortype) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f143044a.l(); i10++) {
            if (!o(this.f143044a.k(i10))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> o10 : this.f143044a.m()) {
            if (!o(o10)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f143046c ? new C17201l.c(this.f143044a.entrySet().iterator()) : this.f143044a.entrySet().iterator();
    }

    public void q() {
        if (!this.f143045b) {
            this.f143044a.p();
            this.f143045b = true;
        }
    }

    public void r(C17197h<FieldDescriptorType> hVar) {
        for (int i10 = 0; i10 < hVar.f143044a.l(); i10++) {
            s(hVar.f143044a.k(i10));
        }
        for (Map.Entry<FieldDescriptorType, Object> s10 : hVar.f143044a.m()) {
            s(s10);
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.e()) {
            w(fielddescriptortype.f(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object w10 : arrayList) {
                w(fielddescriptortype.f(), w10);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C17201l) {
            this.f143046c = true;
        }
        this.f143044a.s(fielddescriptortype, obj);
    }

    private C17197h(boolean z10) {
        q();
    }
}
