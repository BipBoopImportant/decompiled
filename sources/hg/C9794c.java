package hg;

import Ln.d;
import Qf.a;
import Wk.e;
import XH.C16795B;
import XH.t;
import hg.J;
import ig.C9845a;
import ip.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C10243d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aE\u0010\u000e\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0017\u001a\u00020\u0016*\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\u001d\u001a\u00020\u001c*\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a7\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 0\u001f*\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010H\u0002¢\u0006\u0004\b!\u0010\"\u001aQ\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010*\b\u0012\u0004\u0012\u00020#0\u00122\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010'\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00110&H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010)\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00110&H\u0002¢\u0006\u0004\b)\u0010(\u001aE\u0010+\u001a\u00020*2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,\u001a'\u0010/\u001a\u00020*2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100\u001a\u0017\u00101\u001a\u00020*2\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u00102\u001a\u001f\u00105\u001a\u00020*2\u0006\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"Lip/l;", "Lig/a$a;", "", "availability", "", "d", "(Lip/l;)Z", "showItemAvailability", "Lsf/d;", "preferredDelivery", "", "productNo", "", "quantity", "q", "(Lip/l;ZLsf/d;Ljava/lang/String;I)Z", "", "Lhg/J$a;", "", "Lhg/h;", "LQf/a$c;", "homeDeliveryDetails", "LQf/a$b$b;", "g", "(Ljava/util/Map;LQf/a$c;)LQf/a$b$b;", "storeId", "storeName", "collectDeliveryDetails", "LQf/a$b$a;", "i", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;LQf/a$c;)LQf/a$b$a;", "LXH/B;", "LQf/a$a;", "l", "(Ljava/util/Map;)LXH/B;", "LLn/d;", "p", "(Ljava/util/List;Lip/l;ZLsf/d;)Ljava/util/Map;", "", "f", "(Ljava/util/Set;)Z", "e", "Lhg/J;", "n", "(Lip/l;ZLsf/d;Ljava/lang/String;I)Lhg/J;", "LWk/e;", "requestedQuantity", "o", "(Lsf/d;LWk/e;I)Lhg/J;", "k", "(I)Lhg/J;", "LWk/e$b$a;", "status", "m", "(LWk/e$b$a;I)Lhg/J;", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hg.c  reason: case insensitive filesystem */
public final class C9794c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73635a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f73636b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|10|(2:11|12)|13|15|16|17|18|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
        static {
            /*
                hg.J$a[] r0 = hg.J.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                hg.J$a r2 = hg.J.a.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                hg.J$a r3 = hg.J.a.LIMITED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                hg.J$a r3 = hg.J.a.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                hg.J$a r3 = hg.J.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                hg.J$a r3 = hg.J.a.NOT_ENABLED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r4 = 5
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f73635a = r0
                sf.d[] r0 = sf.C10243d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sf.d r3 = sf.C10243d.HOME     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                sf.d r1 = sf.C10243d.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                f73636b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.C9794c.a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final boolean d(l<C9845a.C1326a, Throwable> lVar) {
        if (lVar == null || (lVar instanceof l.b)) {
            return false;
        }
        if (!(lVar instanceof l.a)) {
            if (lVar instanceof l.c) {
                Iterable<e> a10 = ((C9845a.C1326a) ((l.c) lVar).a()).a();
                if ((a10 instanceof Collection) && ((Collection) a10).isEmpty()) {
                    return false;
                }
                for (e eVar : a10) {
                    e.a.b d10 = eVar.d();
                    boolean z10 = (d10 != null ? d10.a() : null) instanceof e.b.C1890b;
                    boolean z11 = eVar.b().a() instanceof e.b.C1890b;
                    if (!z10) {
                        if (z11) {
                        }
                    }
                }
                return false;
            }
            throw new t();
        }
        return true;
    }

    private static final boolean e(Set<? extends J.a> set) {
        Iterable<J.a> iterable = set;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (J.a aVar : iterable) {
            if (aVar == J.a.LIMITED) {
                return true;
            }
        }
        return false;
    }

    private static final boolean f(Set<? extends J.a> set) {
        Iterable<J.a> iterable = set;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (J.a ordinal : iterable) {
            int i10 = a.f73635a[ordinal.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4 || i10 == 5) {
                    return true;
                }
                throw new t();
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final a.b.C1071b g(Map<J.a, ? extends List<C9799h>> map, a.c cVar) {
        C16795B<Integer, Integer, a.C1069a> l10 = l(map);
        int intValue = l10.a().intValue();
        int intValue2 = l10.b().intValue();
        a.C1069a c10 = l10.c();
        if (c10 != a.C1069a.FULL) {
            cVar = null;
        }
        return new a.b.C1071b(intValue, intValue2, c10, cVar);
    }

    static /* synthetic */ a.b.C1071b h(Map map, a.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = null;
        }
        return g(map, cVar);
    }

    /* access modifiers changed from: private */
    public static final a.b.C1070a i(Map<J.a, ? extends List<C9799h>> map, String str, String str2, a.c cVar) {
        C16795B<Integer, Integer, a.C1069a> l10 = l(map);
        int intValue = l10.a().intValue();
        int intValue2 = l10.b().intValue();
        a.C1069a c10 = l10.c();
        if (str == null || str.length() == 0) {
            return new a.b.C1070a(intValue, intValue2, str2, a.C1069a.INVALID_INPUT, (a.c) null, 16, (DefaultConstructorMarker) null);
        }
        if (c10 != a.C1069a.FULL) {
            cVar = null;
        }
        return new a.b.C1070a(intValue, intValue2, str2, c10, cVar);
    }

    static /* synthetic */ a.b.C1070a j(Map map, String str, String str2, a.c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        return i(map, str, str2, cVar);
    }

    private static final J k(int i10) {
        return new J(J.a.UNKNOWN, i10, (Integer) null);
    }

    private static final C16795B<Integer, Integer, a.C1069a> l(Map<J.a, ? extends List<C9799h>> map) {
        boolean f10 = f(map.keySet());
        boolean e10 = e(map.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            int i10 = a.f73635a[((J.a) next.getKey()).ordinal()];
            if (i10 == 1 || i10 == 2) {
                linkedHashMap.put(next.getKey(), next.getValue());
            } else if (!(i10 == 3 || i10 == 4 || i10 == 5)) {
                throw new t();
            }
        }
        int i11 = 0;
        int i12 = 0;
        for (List size : linkedHashMap.values()) {
            i12 += size.size();
        }
        for (List size2 : map.values()) {
            i11 += size2.size();
        }
        return new C16795B<>(Integer.valueOf(i11), Integer.valueOf(i12), f10 ? a.C1069a.UNKNOWN : e10 ? a.C1069a.LIMITED : i12 == 0 ? a.C1069a.NONE : i12 == i11 ? a.C1069a.FULL : i12 < i11 ? a.C1069a.PARTIAL : a.C1069a.UNKNOWN);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final hg.J m(Wk.e.b.a r4, int r5) {
        /*
            Wk.e$b$a$c r4 = r4.b()
            r0 = 0
            if (r4 == 0) goto L_0x0010
            boolean r1 = r4.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r3 == 0) goto L_0x0024
            java.lang.Integer r1 = r4.e()
            if (r1 == 0) goto L_0x0035
            int r1 = r1.intValue()
            goto L_0x0036
        L_0x0024:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 != 0) goto L_0x0035
            if (r1 != 0) goto L_0x002f
            goto L_0x0035
        L_0x002f:
            XH.t r4 = new XH.t
            r4.<init>()
            throw r4
        L_0x0035:
            r1 = r5
        L_0x0036:
            if (r4 == 0) goto L_0x0040
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0040:
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r2 == 0) goto L_0x0058
            if (r5 > r1) goto L_0x0054
            boolean r4 = r4.d()
            if (r4 == 0) goto L_0x0051
            hg.J$a r4 = hg.J.a.LIMITED
            goto L_0x0067
        L_0x0051:
            hg.J$a r4 = hg.J.a.AVAILABLE
            goto L_0x0067
        L_0x0054:
            hg.J$a r4 = hg.J.a.UNAVAILABLE
            r1 = r5
            goto L_0x0067
        L_0x0058:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = kotlin.jvm.internal.C17542s.e(r0, r4)
            if (r4 == 0) goto L_0x0063
            hg.J$a r4 = hg.J.a.UNAVAILABLE
            goto L_0x0067
        L_0x0063:
            if (r0 != 0) goto L_0x0075
            hg.J$a r4 = hg.J.a.UNKNOWN
        L_0x0067:
            hg.J r0 = new hg.J
            int r1 = java.lang.Math.min(r5, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r4, r5, r1)
            return r0
        L_0x0075:
            XH.t r4 = new XH.t
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.C9794c.m(Wk.e$b$a, int):hg.J");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: Wk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: Wk.e} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        r2 = o(r4, r0, r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final hg.J n(ip.l<ig.C9845a.C1326a, java.lang.Throwable> r2, boolean r3, sf.C10243d r4, java.lang.String r5, int r6) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0083
            if (r2 == 0) goto L_0x0076
            boolean r3 = r2 instanceof ip.l.a
            if (r3 == 0) goto L_0x000a
            goto L_0x0076
        L_0x000a:
            boolean r3 = r2 instanceof ip.l.b
            if (r3 == 0) goto L_0x003f
            ip.l$b r2 = (ip.l.b) r2
            java.lang.Object r2 = r2.a()
            ig.a$a r2 = (ig.C9845a.C1326a) r2
            if (r2 == 0) goto L_0x0076
            java.util.List r2 = r2.a()
            if (r2 == 0) goto L_0x0076
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0024:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r2.next()
            r1 = r3
            Wk.e r1 = (Wk.e) r1
            java.lang.String r1 = r1.c()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r5)
            if (r1 == 0) goto L_0x0024
            r0 = r3
        L_0x003c:
            Wk.e r0 = (Wk.e) r0
            goto L_0x0076
        L_0x003f:
            boolean r3 = r2 instanceof ip.l.c
            if (r3 == 0) goto L_0x0070
            ip.l$c r2 = (ip.l.c) r2
            java.lang.Object r2 = r2.a()
            ig.a$a r2 = (ig.C9845a.C1326a) r2
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0055:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r3 = r2.next()
            r1 = r3
            Wk.e r1 = (Wk.e) r1
            java.lang.String r1 = r1.c()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r5)
            if (r1 == 0) goto L_0x0055
            r0 = r3
        L_0x006d:
            Wk.e r0 = (Wk.e) r0
            goto L_0x0076
        L_0x0070:
            XH.t r2 = new XH.t
            r2.<init>()
            throw r2
        L_0x0076:
            if (r0 == 0) goto L_0x007e
            hg.J r2 = o(r4, r0, r6)
            if (r2 != 0) goto L_0x008a
        L_0x007e:
            hg.J r2 = k(r6)
            goto L_0x008a
        L_0x0083:
            hg.J r2 = new hg.J
            hg.J$a r3 = hg.J.a.NOT_ENABLED
            r2.<init>(r3, r6, r0)
        L_0x008a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.C9794c.n(ip.l, boolean, sf.d, java.lang.String, int):hg.J");
    }

    private static final J o(C10243d dVar, e eVar, int i10) {
        J.a aVar;
        int i11 = a.f73636b[dVar.ordinal()];
        if (i11 == 1) {
            e.b a10 = eVar.b().a();
            if (a10 instanceof e.b.a) {
                return m((e.b.a) a10, i10);
            }
            if (a10 instanceof e.b.C1890b) {
                return k(i10);
            }
            throw new t();
        } else if (i11 == 2) {
            e.a.b d10 = eVar.d();
            e.b a11 = d10 != null ? d10.a() : null;
            if (a11 instanceof e.b.a) {
                e.b.a.C1888a a12 = ((e.b.a) a11).a();
                Boolean valueOf = a12 != null ? Boolean.valueOf(a12.a()) : null;
                if (C17542s.e(valueOf, Boolean.TRUE)) {
                    aVar = J.a.AVAILABLE;
                } else if (C17542s.e(valueOf, Boolean.FALSE)) {
                    aVar = J.a.UNAVAILABLE;
                } else if (valueOf == null) {
                    aVar = J.a.UNKNOWN;
                } else {
                    throw new t();
                }
                return new J(aVar, i10, (Integer) null);
            } else if (a11 == null || (a11 instanceof e.b.C1890b)) {
                return k(i10);
            } else {
                throw new t();
            }
        } else {
            throw new t();
        }
    }

    public static final Map<J.a, List<C9799h>> p(List<d> list, l<C9845a.C1326a, Throwable> lVar, boolean z10, C10243d dVar) {
        C17542s.j(list, "<this>");
        C17542s.j(dVar, "preferredDelivery");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (d dVar2 : list) {
            J.a b10 = n(lVar, z10, dVar, dVar2.j(), dVar2.l()).b();
            Object obj = linkedHashMap.get(b10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b10, obj);
            }
            ((List) obj).add(new C9799h(dVar2, n(lVar, z10, dVar, dVar2.j(), dVar2.l())));
        }
        return linkedHashMap;
    }

    public static final boolean q(l<C9845a.C1326a, Throwable> lVar, boolean z10, C10243d dVar, String str, int i10) {
        C17542s.j(dVar, "preferredDelivery");
        C17542s.j(str, "productNo");
        return n(lVar, z10, dVar, str, i10).b() == J.a.UNAVAILABLE;
    }
}
