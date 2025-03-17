package ZA;

import Ah.C9048d;
import Ah.t;
import Ah.w;
import Ah.y;
import Bh.d;
import HJ.C15854t;
import Rl.g;
import WA.C13763a;
import WA.C13764b;
import WA.C13765c;
import WA.C13766d;
import WA.C13767e;
import WA.h;
import WA.i;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import aB.C13912b;
import bB.C13999a;
import bB.b;
import bB.c;
import bB.e;
import bB.f;
import com.sugarcube.core.logger.DslKt;
import gB.C14501c;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import np.C11664a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tI.C17974j;
import yh.C10478b;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001f\u001a\u00020\u001e*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010#\u001a\u00020\"*\u00020!H\u0000¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010&\u001a\u00020%*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020(H\u0000¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010.\u001a\u00020!*\u00020-2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b.\u0010/\u001a\u0017\u00101\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u000100H\u0001¢\u0006\u0004\b1\u00102\u001a\u001f\u00105\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000eH\u0001¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u0001002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b7\u00108\u001aC\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180)*\u0002092\u0006\u0010:\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010;\u001a\u0004\u0018\u0001002\u0006\u0010<\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b=\u0010>\u001a\u001b\u0010B\u001a\u00020A*\u00020?2\u0006\u0010@\u001a\u00020\u0003H\u0002¢\u0006\u0004\bB\u0010C\u001a3\u0010E\u001a\u0004\u0018\u00010\u000e2\u0006\u0010D\u001a\u00020A2\b\u0010;\u001a\u0004\u0018\u0001002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\bE\u0010F\u001a\u001d\u0010I\u001a\u0004\u0018\u00010\u000e*\u00020-2\u0006\u0010H\u001a\u00020GH\u0000¢\u0006\u0004\bI\u0010J\u001a\u0013\u0010M\u001a\u00020L*\u00020KH\u0000¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"LAh/t;", "LRl/g;", "measurementSystem", "", "showPricesInclVat", "Lkp/d;", "currencyConfig", "LbB/f;", "n", "(LAh/t;LRl/g;ZLkp/d;)LbB/f;", "LAh/d$a;", "LbB/a;", "k", "(LAh/d$a;LRl/g;)LbB/a;", "", "rawValue", "Ljava/time/Instant;", "r", "(Ljava/lang/String;)Ljava/time/Instant;", "LbB/e;", "listId", "LWA/h;", "j", "(LbB/e;Ljava/lang/String;)LWA/h;", "LbB/d;", "itemNo", "LWA/e;", "i", "(LbB/d;Ljava/lang/String;)LWA/e;", "parentItemNo", "LWA/c;", "g", "(LbB/a;Ljava/lang/String;Ljava/lang/String;)LWA/c;", "LbB/c;", "LWA/d;", "h", "(LbB/c;)LWA/d;", "LWA/i;", "q", "(LbB/e;Ljava/lang/String;)LWA/i;", "LAh/d$c;", "", "Lnp/a;", "o", "(LAh/d$c;)Ljava/util/List;", "LAh/y;", "m", "(LAh/y;LRl/g;)LbB/c;", "LAh/y$a;", "a", "(LAh/y$a;)Ljava/lang/String;", "description", "category", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "f", "(LAh/y$a;LRl/g;)Ljava/lang/String;", "LAh/d$i;", "showPricesWithTax", "displayUnit", "isFamilyItem", "p", "(LAh/d$i;ZLRl/g;LAh/y$a;ZLkp/d;)Ljava/util/List;", "LAh/w;", "withTax", "", "e", "(LAh/w;Z)D", "price", "b", "(DLAh/y$a;LRl/g;Lkp/d;)Ljava/lang/String;", "LaB/b$c;", "quality", "c", "(LAh/y;LaB/b$c;)Ljava/lang/String;", "Lyh/b$b;", "LbB/b;", "l", "(Lyh/b$b;)LbB/b;", "shoppinglist-datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZA.b  reason: case insensitive filesystem */
public final class C13872b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZA.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f118280a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f118281b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|31) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|31) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|29|31) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0061 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        static {
            /*
                Bh.d[] r0 = Bh.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Bh.d r2 = Bh.d.UNKNOWN__     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Bh.d r3 = Bh.d.AREA     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                Bh.d r4 = Bh.d.METERWARE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Bh.d r4 = Bh.d.MULTIPACK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Bh.d r4 = Bh.d.PIECE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r5 = 5
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Bh.d r4 = Bh.d.VOLUME     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r5 = 6
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Bh.d r4 = Bh.d.WEIGHT     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r5 = 7
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                Bh.d r4 = Bh.d.WEIGHTWARE     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r5 = 8
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f118280a = r0
                Rl.g[] r0 = Rl.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Rl.g r4 = Rl.g.METRIC     // Catch:{ NoSuchFieldError -> 0x0061 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                Rl.g r1 = Rl.g.METRIC_IMPERIAL     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                Rl.g r1 = Rl.g.IMPERIAL     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                f118281b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ZA.C13872b.a.<clinit>():void");
        }
    }

    public static final String a(y.a aVar) {
        d c10 = aVar != null ? aVar.c() : null;
        int i10 = c10 == null ? -1 : a.f118280a[c10.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return null;
        }
        return aVar.c().b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String b(double r7, Ah.y.a r9, Rl.g r10, kp.C11522d r11) {
        /*
            java.lang.String r0 = "measurementSystem"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "currencyConfig"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            int[] r0 = ZA.C13872b.a.f118281b
            int r10 = r10.ordinal()
            r10 = r0[r10]
            r0 = 2
            r1 = 1
            if (r10 == r1) goto L_0x0023
            if (r10 == r0) goto L_0x0023
            r1 = 3
            if (r10 != r1) goto L_0x001d
            r1 = 0
            goto L_0x0023
        L_0x001d:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        L_0x0023:
            r10 = 0
            if (r9 == 0) goto L_0x002b
            Bh.d r2 = r9.c()
            goto L_0x002c
        L_0x002b:
            r2 = r10
        L_0x002c:
            if (r2 != 0) goto L_0x0030
            r2 = -1
            goto L_0x0038
        L_0x0030:
            int[] r3 = ZA.C13872b.a.f118280a
            int r2 = r2.ordinal()
            r2 = r3[r2]
        L_0x0038:
            switch(r2) {
                case -1: goto L_0x00b2;
                case 0: goto L_0x003b;
                case 1: goto L_0x00b2;
                case 2: goto L_0x0041;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00b2;
                case 7: goto L_0x00b2;
                case 8: goto L_0x00b2;
                default: goto L_0x003b;
            }
        L_0x003b:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        L_0x0041:
            if (r1 == 0) goto L_0x0050
            Ah.y$e r2 = r9.b()
            if (r2 == 0) goto L_0x004e
            java.lang.String r2 = r2.a()
            goto L_0x005a
        L_0x004e:
            r2 = r10
            goto L_0x005a
        L_0x0050:
            Ah.y$c r2 = r9.a()
            if (r2 == 0) goto L_0x004e
            java.lang.String r2 = r2.a()
        L_0x005a:
            if (r1 == 0) goto L_0x006f
            Ah.y$e r9 = r9.b()
            if (r9 == 0) goto L_0x006d
            java.lang.String r9 = r9.b()
            if (r9 == 0) goto L_0x006d
            java.lang.Double r9 = HJ.C15854t.q(r9)
            goto L_0x007f
        L_0x006d:
            r9 = r10
            goto L_0x007f
        L_0x006f:
            Ah.y$c r9 = r9.a()
            if (r9 == 0) goto L_0x006d
            java.lang.String r9 = r9.b()
            if (r9 == 0) goto L_0x006d
            java.lang.Double r9 = HJ.C15854t.q(r9)
        L_0x007f:
            if (r9 == 0) goto L_0x00b2
            double r3 = r9.doubleValue()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b2
            if (r2 == 0) goto L_0x00b2
            int r1 = r2.length()
            if (r1 != 0) goto L_0x0094
            goto L_0x00b2
        L_0x0094:
            double r9 = r9.doubleValue()
            double r7 = r7 / r9
            qx.a r9 = qx.C14956a.f130484a
            java.lang.String r7 = r9.b(r7, r11)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r2}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String r8 = "%s / %s"
            java.lang.String r10 = java.lang.String.format(r8, r7)
            java.lang.String r7 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r10, r7)
        L_0x00b2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ZA.C13872b.b(double, Ah.y$a, Rl.g, kp.d):java.lang.String");
    }

    public static final String c(y yVar, C13912b.c cVar) {
        Object obj;
        C17542s.j(yVar, "<this>");
        C17542s.j(cVar, "quality");
        if (yVar.d().size() < 8) {
            return null;
        }
        int size = yVar.d().size() - 1;
        Iterator it = C16877v.e1(yVar.d(), C17542s.e(yVar.d().get(4).a(), C13912b.c.S5.b()) ? new C17974j(5, Math.min(10, size)) : new C17974j(4, Math.min(8, size))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((y.b) obj).a(), cVar.b())) {
                break;
            }
        }
        y.b bVar = (y.b) obj;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public static final String d(String str, String str2) {
        C17542s.j(str, "description");
        C17542s.j(str2, "category");
        if (C15854t.v0(str) && C15854t.v0(str2)) {
            return "";
        }
        if (C15854t.v0(str2)) {
            return str;
        }
        if (C15854t.v0(str)) {
            return str2;
        }
        String format = String.format("%s, %s", Arrays.copyOf(new Object[]{str2, str}, 2));
        C17542s.i(format, "format(...)");
        return format;
    }

    private static final double e(w wVar, boolean z10) {
        if (!z10) {
            return wVar.a();
        }
        Double b10 = wVar.b();
        return b10 != null ? b10.doubleValue() : wVar.a();
    }

    public static final String f(y.a aVar, g gVar) {
        v vVar;
        C17542s.j(gVar, "measurementSystem");
        if (aVar == null) {
            return null;
        }
        int i10 = a.f118281b[gVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            y.e b10 = aVar.b();
            String b11 = b10 != null ? b10.b() : null;
            y.e b12 = aVar.b();
            vVar = C16796C.a(b11, b12 != null ? b12.a() : null);
        } else if (i10 == 3) {
            y.c a10 = aVar.a();
            String b13 = a10 != null ? a10.b() : null;
            y.c a11 = aVar.a();
            vVar = C16796C.a(b13, a11 != null ? a11.a() : null);
        } else {
            throw new t();
        }
        String str = (String) vVar.a();
        String str2 = (String) vVar.b();
        if (str == null) {
            return null;
        }
        if (C17542s.e(str, "1")) {
            return str2;
        }
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{str, str2}, 2));
        C17542s.i(format, "format(...)");
        return format;
    }

    public static final C13765c g(C13999a aVar, String str, String str2) {
        C17542s.j(aVar, "<this>");
        C17542s.j(str, "parentItemNo");
        C17542s.j(str2, "listId");
        C13764b bVar = new C13764b(aVar.a(), str, str2);
        String a10 = aVar.a();
        int b10 = aVar.b();
        int d10 = aVar.d();
        c c10 = aVar.c();
        return new C13765c(bVar, new C13763a(str, a10, b10, d10, c10 != null ? h(c10) : null));
    }

    public static final C13766d h(c cVar) {
        C17542s.j(cVar, "<this>");
        return new C13766d(cVar.f(), cVar.b(), cVar.e(), cVar.g(), cVar.h(), cVar.d(), cVar.a(), cVar.c());
    }

    public static final C13767e i(bB.d dVar, String str) {
        C17542s.j(dVar, "<this>");
        C17542s.j(str, "itemNo");
        String b10 = dVar.f().b();
        double d10 = dVar.d();
        double e10 = dVar.e();
        String a10 = dVar.a();
        String g10 = dVar.g();
        return new C13767e(str, b10, d10, e10, a10, g10 != null ? LocalDate.parse(g10) : null, dVar.c(), dVar.b());
    }

    public static final h j(e eVar, String str) {
        C17542s.j(eVar, "<this>");
        C17542s.j(str, "listId");
        String c10 = eVar.c();
        String d10 = eVar.d();
        int h10 = eVar.h();
        Instant j10 = eVar.j();
        int e10 = eVar.e();
        boolean f10 = eVar.f();
        boolean l10 = eVar.l();
        boolean k10 = eVar.k();
        boolean m10 = eVar.m();
        List<C11664a> b10 = eVar.b();
        c g10 = eVar.g();
        return new h(str, c10, d10, h10, j10, e10, f10, l10, k10, m10, b10, g10 != null ? h(g10) : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r2 = r2.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final bB.C13999a k(Ah.C9048d.a r3, Rl.g r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "measurementSystem"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            bB.a r0 = new bB.a
            java.lang.String r1 = r3.a()
            Ah.d$k r2 = r3.c()
            if (r2 == 0) goto L_0x0021
            Ah.y r2 = r2.a()
            if (r2 == 0) goto L_0x0021
            bB.c r4 = m(r2, r4)
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            java.util.List r2 = r3.b()
            int r2 = r2.size()
            int r3 = r3.d()
            r0.<init>(r1, r4, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ZA.C13872b.k(Ah.d$a, Rl.g):bB.a");
    }

    public static final b l(C10478b.C1445b bVar) {
        C17542s.j(bVar, "<this>");
        return new b(bVar.a(), bVar.b(), r(bVar.c()));
    }

    public static final c m(y yVar, g gVar) {
        Object obj;
        C17542s.j(yVar, "<this>");
        C17542s.j(gVar, "measurementSystem");
        String f10 = yVar.f();
        String b10 = yVar.b();
        String str = "";
        if (b10 == null) {
            b10 = str;
        }
        String a10 = yVar.a();
        if (a10 != null) {
            str = a10;
        }
        String d10 = d(b10, str);
        y.d dVar = (y.d) C16877v.y0(yVar.e());
        String j10 = dVar != null ? gVar.j(dVar.b(), dVar.a()) : null;
        String f11 = f(yVar.c(), gVar);
        y.a c10 = yVar.c();
        String a11 = c10 != null ? a(c10) : null;
        Iterator it = yVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((y.b) obj).a(), "S3")) {
                break;
            }
        }
        y.b bVar = (y.b) obj;
        String b11 = bVar != null ? bVar.b() : null;
        String c11 = c(yVar, C13912b.c.S5);
        y.f g10 = yVar.g();
        return new c(f10, d10, j10, f11, a11, b11, c11, g10 != null ? g10.b() : null);
    }

    public static final f n(Ah.t tVar, g gVar, boolean z10, C11522d dVar) {
        String str;
        y a10;
        C9048d.c b10;
        Iterator it;
        Iterator it2;
        g gVar2 = gVar;
        C17542s.j(tVar, "<this>");
        C17542s.j(gVar2, "measurementSystem");
        C17542s.j(dVar, "currencyConfig");
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it3.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it3.next();
            if (str2 == null) {
                String a11 = C11818a.a("fetched remote list: " + tVar.b(), (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str2 = C11820c.a(a11);
            }
            if (str3 == null) {
                String name = tVar.getClass().getName();
                C17542s.g(name);
                it2 = it3;
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            } else {
                it2 = it3;
            }
            bVar.a(eVar, str3, true, (Throwable) null, str2);
            it3 = it2;
        }
        Iterable<t.a> a12 = tVar.a();
        ArrayList arrayList2 = new ArrayList(C16877v.y(a12, 10));
        for (t.a a13 : a12) {
            C9048d a14 = a13.a();
            C9048d.j d10 = a14.d();
            y a15 = d10 != null ? d10.a() : null;
            if (a15 == null) {
                qv.e eVar2 = qv.e.WARN;
                ArrayList arrayList3 = new ArrayList();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList3.add(next2);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                String str4 = null;
                String str5 = null;
                while (it4.hasNext()) {
                    C11819b bVar2 = (C11819b) it4.next();
                    if (str4 == null) {
                        String a16 = C11818a.a("No product information for: " + a14.b(), (Throwable) null);
                        if (a16 == null) {
                            break;
                        }
                        str4 = C11820c.a(a16);
                    }
                    if (str5 == null) {
                        String name2 = Ah.t.class.getName();
                        C17542s.g(name2);
                        it = it4;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        it = it4;
                    }
                    bVar2.a(eVar2, str5, false, (Throwable) null, str4);
                    Ah.t tVar2 = tVar;
                    it4 = it;
                }
            }
            String b11 = a14.b();
            String b12 = a14.g().b();
            int e10 = a14.e();
            C9048d.f a17 = a14.c().a();
            List<C11664a> o10 = (a17 == null || (b10 = a17.b()) == null) ? null : o(b10);
            if (o10 == null) {
                o10 = C16877v.n();
            }
            List<C11664a> list = o10;
            c m10 = a15 != null ? m(a15, gVar2) : null;
            C9048d.i c10 = a14.c();
            boolean l10 = a14.l();
            C9048d.j d11 = a14.d();
            List<bB.d> p10 = p(c10, z10, gVar, (d11 == null || (a10 = d11.a()) == null) ? null : a10.c(), l10, dVar);
            Iterable<C9048d.a> a18 = a14.a();
            ArrayList arrayList4 = new ArrayList(C16877v.y(a18, 10));
            for (C9048d.a k10 : a18) {
                arrayList4.add(k(k10, gVar2));
            }
            boolean j10 = a14.j();
            boolean k11 = a14.k();
            int i10 = 0;
            for (C9048d.a b13 : a14.a()) {
                i10 += b13.b().size();
            }
            Instant ofEpochSecond = Instant.ofEpochSecond((long) a14.h());
            C17542s.i(ofEpochSecond, "ofEpochSecond(...)");
            arrayList2.add(new e(b11, b12, e10, m10, list, p10, arrayList4, j10, k11, a14.i(), a14.m(), i10, ofEpochSecond));
            Ah.t tVar3 = tVar;
        }
        return new f(tVar.b(), tVar.c(), arrayList2, r(tVar.e()));
    }

    public static final List<C11664a> o(C9048d.c cVar) {
        C17542s.j(cVar, "<this>");
        ArrayList arrayList = new ArrayList();
        Double a10 = cVar.a();
        if (a10 != null) {
            arrayList.add(new C11664a(C11664a.C2303a.ECO, a10.doubleValue()));
        }
        Double b10 = cVar.b();
        if (b10 != null) {
            arrayList.add(new C11664a(C11664a.C2303a.WEEE, b10.doubleValue()));
        }
        return arrayList;
    }

    public static final List<bB.d> p(C9048d.i iVar, boolean z10, g gVar, y.a aVar, boolean z11, C11522d dVar) {
        C9048d.f a10;
        C9048d.b a11;
        double a12;
        w a13;
        C9048d.l c10;
        double a14;
        C14501c cVar;
        w a15;
        w a16;
        boolean z12 = z10;
        g gVar2 = gVar;
        y.a aVar2 = aVar;
        C11522d dVar2 = dVar;
        C17542s.j(iVar, "<this>");
        C17542s.j(gVar2, "measurementSystem");
        C17542s.j(dVar2, "currencyConfig");
        ArrayList arrayList = new ArrayList();
        C9048d.f a17 = iVar.a();
        double d10 = 0.0d;
        Double d11 = null;
        if (!(a17 == null || (c10 = a17.c()) == null)) {
            if (z12) {
                Double b10 = c10.a().b();
                a14 = b10 != null ? b10.doubleValue() : c10.a().a();
            } else {
                a14 = c10.a().a();
            }
            double d12 = a14;
            C9048d.e c11 = c10.a().c();
            Double valueOf = (c11 == null || (a16 = c11.a()) == null) ? null : Double.valueOf(e(a16, z12));
            if (c10.a().h()) {
                cVar = C14501c.NLP;
            } else {
                String g10 = c10.a().g();
                cVar = (g10 == null || C15854t.v0(g10)) ? C14501c.REGULAR : C14501c.TRO;
            }
            C14501c cVar2 = cVar;
            Double e10 = c10.a().e();
            double doubleValue = e10 != null ? e10.doubleValue() : 0.0d;
            String g11 = c10.a().h() ? null : c10.a().g();
            String b11 = b(d12, aVar2, gVar2, dVar2);
            C9048d.h d13 = c10.a().d();
            arrayList.add(new bB.d(cVar2, d12, doubleValue, b11, g11, (d13 == null || (a15 = d13.a()) == null) ? null : Double.valueOf(e(a15, z12)), valueOf));
        }
        if (!(!z11 || (a10 = iVar.a()) == null || (a11 = a10.a()) == null)) {
            if (z12) {
                Double b12 = a11.a().b();
                a12 = b12 != null ? b12.doubleValue() : a11.a().a();
            } else {
                a12 = a11.a().a();
            }
            double d14 = a12;
            C9048d.C0962d c12 = a11.a().c();
            if (!(c12 == null || (a13 = c12.a()) == null)) {
                d11 = Double.valueOf(e(a13, z12));
            }
            Double d15 = d11;
            C14501c cVar3 = C14501c.FAMILY;
            Double d16 = a11.a().d();
            if (d16 != null) {
                d10 = d16.doubleValue();
            }
            arrayList.add(new bB.d(cVar3, d14, d10, b(d14, aVar2, gVar2, dVar2), a11.a().f(), (Double) null, d15));
        }
        return arrayList;
    }

    public static final i q(e eVar, String str) {
        C17542s.j(eVar, "<this>");
        C17542s.j(str, "listId");
        h j10 = j(eVar, str);
        Iterable<C13999a> a10 = eVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (C13999a g10 : a10) {
            arrayList.add(g(g10, eVar.c(), str));
        }
        Iterable<bB.d> i10 = eVar.i();
        ArrayList arrayList2 = new ArrayList(C16877v.y(i10, 10));
        for (bB.d i11 : i10) {
            arrayList2.add(i(i11, eVar.c()));
        }
        return new i(j10, arrayList, arrayList2);
    }

    private static final Instant r(String str) {
        Instant parse = Instant.parse(str);
        C17542s.i(parse, "parse(...)");
        return parse;
    }
}
