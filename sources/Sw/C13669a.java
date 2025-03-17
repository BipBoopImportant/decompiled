package Sw;

import IC.C13026h;
import Nn.t;
import Wg.a;
import Wg.c;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rv.C11849b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LBa/i;", "", "b", "(LBa/i;)Z", "LNn/t;", "", "LWg/a;", "c", "(LNn/t;)Ljava/util/List;", "LNn/t$d$a;", "a", "(LNn/t$d$a;)LWg/a;", "onlinepayment-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Sw.a  reason: case insensitive filesystem */
public final class C13669a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sw.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C2848a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116547a;

        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|(2:37|38)|39|41) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|41) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Nn.t$d$a[] r0 = Nn.t.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.t$d$a r1 = Nn.t.d.a.STATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Nn.t$d$a r1 = Nn.t.d.a.SHIPPING_STATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_STATE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Nn.t$d$a r1 = Nn.t.d.a.SHIPPING_LAST_NAME     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_LAST_NAME     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Nn.t$d$a r1 = Nn.t.d.a.SHIPPING_ADDRESS_LINE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_ADDRESS_LINE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                Nn.t$d$a r1 = Nn.t.d.a.SHIPPING_MOBILE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_MOBILE_NUMBER     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                Nn.t$d$a r1 = Nn.t.d.a.SHIPPING_EMAIL     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_EMAIL     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                Nn.t$d$a r1 = Nn.t.d.a.SHIPPING_COUNTRY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_COUNTRY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                Nn.t$d$a r1 = Nn.t.d.a.SHIPPING_PHONETIC_FIRST_NAME     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_PHONETIC_FIRST_NAME     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                Nn.t$d$a r1 = Nn.t.d.a.SHIPPING_PHONETIC_LAST_NAME     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_PHONETIC_LAST_NAME     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_ZIP_CODE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                Nn.t$d$a r1 = Nn.t.d.a.BILLING_CITY     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                f116547a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Sw.C13669a.C2848a.<clinit>():void");
        }
    }

    private static final a a(t.d.a aVar) {
        switch (C2848a.f116547a[aVar.ordinal()]) {
            case 1:
                return new a(c.STATE_CODE, C13026h.a(C11849b.f102302h2));
            case 2:
                return new a(c.SHIPPING_STATE, C13026h.a(C11849b.f102302h2));
            case 3:
                return new a(c.BILLING_STATE, C13026h.a(C11849b.f102302h2));
            case 4:
                return new a(c.SHIPPING_LAST_NAME, C13026h.a(C11849b.f102279c2));
            case 5:
                return new a(c.BILLING_LAST_NAME, C13026h.a(C11849b.f102279c2));
            case 6:
                return new a(c.SHIPPING_STREET, C13026h.a(C11849b.f102298g2));
            case 7:
                return new a(c.BILLING_STREET, C13026h.a(C11849b.f102252W1));
            case 8:
                return new a(c.SHIPPING_MOBILE, C13026h.a(C11849b.f102284d2));
            case 9:
                return new a(c.BILLING_MOBILE, C13026h.a(C11849b.f102284d2));
            case 10:
                return new a(c.SHIPPING_EMAIL, C13026h.a(C11849b.f102269a2));
            case 11:
                return new a(c.BILLING_EMAIL, C13026h.a(C11849b.f102269a2));
            case 12:
                return new a(c.SHIPPING_COUNTRY, C13026h.a(C11849b.f102264Z1));
            case 13:
                return new a(c.BILLING_COUNTRY, C13026h.a(C11849b.f102264Z1));
            case 14:
                return new a(c.SHIPPING_PHONETIC_FIRST_NAME, C13026h.a(C11849b.f102289e2));
            case 15:
                return new a(c.BILLING_PHONETIC_FIRST_NAME, C13026h.a(C11849b.f102289e2));
            case 16:
                return new a(c.SHIPPING_PHONETIC_LAST_NAME, C13026h.a(C11849b.f102294f2));
            case 17:
                return new a(c.BILLING_PHONETIC_LAST_NAME, C13026h.a(C11849b.f102294f2));
            case 18:
                return new a(c.BILLING_ZIP_CODE, C13026h.a(C11849b.f102256X1));
            case 19:
                return new a(c.BILLING_CITY, C13026h.a(C11849b.f102260Y1));
            default:
                throw new XH.t();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r0 = kK.j.j(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(Ba.C6385i r24) {
        /*
            r1 = 0
            if (r24 != 0) goto L_0x0004
            return r1
        L_0x0004:
            r2 = 1
            r3 = 0
            kK.c$a r0 = kK.C17514c.f144280d     // Catch:{ Exception -> 0x002e }
            java.lang.String r4 = r24.U()     // Catch:{ Exception -> 0x002e }
            java.lang.String r5 = "toJson(...)"
            kotlin.jvm.internal.C17542s.i(r4, r5)     // Catch:{ Exception -> 0x002e }
            kotlinx.serialization.json.JsonElement r0 = r0.i(r4)     // Catch:{ Exception -> 0x002e }
            kotlinx.serialization.json.JsonObject r0 = kK.j.i(r0)     // Catch:{ Exception -> 0x002e }
            java.lang.String r4 = "email"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x002e }
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch:{ Exception -> 0x002e }
            if (r0 == 0) goto L_0x0030
            kotlinx.serialization.json.JsonPrimitive r0 = kK.j.j(r0)     // Catch:{ Exception -> 0x002e }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = kK.j.f(r0)     // Catch:{ Exception -> 0x002e }
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            goto L_0x003d
        L_0x0030:
            r0 = r3
        L_0x0031:
            if (r0 == 0) goto L_0x0039
            int r0 = r0.length()     // Catch:{ Exception -> 0x002e }
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r1 = r2
        L_0x003a:
            r1 = r1 ^ r2
            goto L_0x018f
        L_0x003d:
            qv.e r10 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0050:
            boolean r6 = r4.hasNext()
            r11 = 1
            if (r6 == 0) goto L_0x0068
            java.lang.Object r6 = r4.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r10, r11)
            if (r7 == 0) goto L_0x0050
            r5.add(r6)
            goto L_0x0050
        L_0x0068:
            java.util.Iterator r12 = r5.iterator()
            r4 = r3
            r5 = r4
        L_0x006e:
            boolean r6 = r12.hasNext()
            java.lang.String r7 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r13 = "main"
            java.lang.String r14 = "Kt"
            r15 = 46
            r1 = 36
            java.lang.Class<Ba.i> r16 = Ba.C6385i.class
            java.lang.String r11 = "Unable to parse payment data json"
            r2 = 2
            if (r6 == 0) goto L_0x00ed
            java.lang.Object r6 = r12.next()
            qv.b r6 = (qv.C11819b) r6
            if (r4 != 0) goto L_0x009a
            java.lang.String r4 = qv.C11818a.a(r11, r0)
            if (r4 != 0) goto L_0x0096
            goto L_0x00ed
        L_0x0096:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x009a:
            r11 = r4
            if (r5 != 0) goto L_0x00d9
            java.lang.String r4 = r16.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            java.lang.String r1 = HJ.C15854t.s1(r4, r1, r3, r2, r3)
            java.lang.String r1 = HJ.C15854t.o1(r1, r15, r3, r2, r3)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x00b3
            goto L_0x00b7
        L_0x00b3:
            java.lang.String r4 = HJ.C15854t.P0(r1, r14)
        L_0x00b7:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r2 = 1
            boolean r1 = HJ.C15854t.b0(r1, r13, r2)
            if (r1 == 0) goto L_0x00c7
            r8 = r9
        L_0x00c7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r7)
            r1.append(r4)
            java.lang.String r5 = r1.toString()
        L_0x00d9:
            r1 = r5
            r4 = r6
            r5 = r10
            r6 = r1
            r17 = 1
            r7 = r17
            r8 = r0
            r9 = r11
            r4.a(r5, r6, r7, r8, r9)
            r5 = r1
            r4 = r11
            r11 = r17
            r1 = 0
            r2 = 1
            goto L_0x006e
        L_0x00ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r11)
            qv.e r4 = qv.e.ERROR
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0105:
            boolean r10 = r5.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x011d
            java.lang.Object r10 = r5.next()
            r12 = r10
            qv.b r12 = (qv.C11819b) r12
            boolean r11 = r12.b(r4, r11)
            if (r11 == 0) goto L_0x0105
            r6.add(r10)
            goto L_0x0105
        L_0x011d:
            java.util.Iterator r5 = r6.iterator()
            r6 = r3
            r10 = r6
        L_0x0123:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x018e
            java.lang.Object r12 = r5.next()
            r18 = r12
            qv.b r18 = (qv.C11819b) r18
            if (r6 != 0) goto L_0x013e
            java.lang.String r6 = qv.C11818a.a(r3, r0)
            if (r6 != 0) goto L_0x013a
            goto L_0x018e
        L_0x013a:
            java.lang.String r6 = qv.C11820c.a(r6)
        L_0x013e:
            if (r10 != 0) goto L_0x017e
            java.lang.String r10 = r16.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            java.lang.String r12 = HJ.C15854t.s1(r10, r1, r3, r2, r3)
            java.lang.String r12 = HJ.C15854t.o1(r12, r15, r3, r2, r3)
            int r17 = r12.length()
            if (r17 != 0) goto L_0x0156
            goto L_0x015a
        L_0x0156:
            java.lang.String r10 = HJ.C15854t.P0(r12, r14)
        L_0x015a:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r1 = 1
            boolean r12 = HJ.C15854t.b0(r12, r13, r1)
            if (r12 == 0) goto L_0x016b
            r12 = r9
            goto L_0x016c
        L_0x016b:
            r12 = r8
        L_0x016c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r7)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
        L_0x017e:
            r19 = r4
            r20 = r10
            r21 = r11
            r22 = r0
            r23 = r6
            r18.a(r19, r20, r21, r22, r23)
            r1 = 36
            goto L_0x0123
        L_0x018e:
            r1 = 0
        L_0x018f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Sw.C13669a.b(Ba.i):boolean");
    }

    public static final List<a> c(t tVar) {
        C17542s.j(tVar, "<this>");
        if (C17542s.e(tVar, t.a.f84151a)) {
            return C16877v.e(new a(c.ADDRESS_GENERIC, C13026h.a(C11849b.f102274b2)));
        }
        if (C17542s.e(tVar, t.c.f84153a)) {
            return C16877v.e(new a(c.TAX_ID_ERROR, C13026h.a(C11849b.f102314k2)));
        }
        if (C17542s.e(tVar, t.e.f84155a)) {
            return C16877v.e(new a(c.ZIP_MISMATCH, C13026h.a(C11849b.f102322m2)));
        }
        if (C17542s.e(tVar, t.b.f84152a)) {
            return C16877v.e(new a(c.STATE_MISMATCH, C13026h.a(C11849b.f102306i2)));
        }
        if (tVar instanceof t.d) {
            Iterable<t.d.a> a10 = ((t.d) tVar).a();
            ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
            for (t.d.a a11 : a10) {
                arrayList.add(a(a11));
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            return arrayList2 == null ? C16877v.e(new a(c.ADDRESS_VALIDATION, C13026h.a(C11849b.f102274b2))) : arrayList2;
        }
        throw new XH.t();
    }
}
