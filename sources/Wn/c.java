package Wn;

import Nn.C10812o;
import Nn.C10813p;
import Nn.u;
import XH.t;
import Yn.P;
import fo.r;
import ho.b;
import ho.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aM\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LWn/b;", "analytics", "", "Lfo/r$a;", "items", "LNn/p;", "deliveryServiceType", "LNn/u;", "serviceType", "LXH/N;", "b", "(LWn/b;Ljava/util/List;LNn/p;LNn/u;)V", "LYn/P;", "deliveryMethod", "LNn/o;", "deliveryServices", "d", "(LYn/P;LWn/b;Ljava/util/List;)V", "Lho/b$a;", "collectDeliveryOptions", "c", "(LWn/b;Ljava/util/List;)V", "", "currencyCode", "deliveryType", "Lho/b$b;", "homeDeliveryOptions", "", "showTotalExclTaxInCartAndCheckout", "a", "(LWn/b;Ljava/lang/String;LYn/P;Ljava/util/List;Ljava/util/List;Z)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f89084a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f89085b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f89086c;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(2:33|34)|35|37|38|(2:39|40)|41|43) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|41|43) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|41|43) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|37|38|39|40|41|43) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0094 */
        static {
            /*
                fo.r$b[] r0 = fo.r.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                fo.r$b r2 = fo.r.b.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                fo.r$b r3 = fo.r.b.PARTIALLY_OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                fo.r$b r4 = fo.r.b.PARTIALLY_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                fo.r$b r5 = fo.r.b.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f89084a = r0
                Nn.u[] r0 = Nn.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.u r5 = Nn.u.STANDARD_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                Nn.u r5 = Nn.u.CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                Nn.u r5 = Nn.u.EXPRESS_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x004c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                Nn.u r3 = Nn.u.EXPRESS_CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                Nn.u r3 = Nn.u.EXPRESS     // Catch:{ NoSuchFieldError -> 0x005d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r4 = 5
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                Nn.u r3 = Nn.u.EXPRESS_CURBSIDE     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r4 = 6
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                Nn.u r3 = Nn.u.LOCKER     // Catch:{ NoSuchFieldError -> 0x006f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r4 = 7
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                Nn.u r3 = Nn.u.STANDARD     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r4 = 8
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                Nn.u r3 = Nn.u.CURBSIDE     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r4 = 9
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                f89085b = r0
                Yn.P[] r0 = Yn.P.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yn.P r3 = Yn.P.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0094 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0094 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0094 }
            L_0x0094:
                Yn.P r1 = Yn.P.COLLECT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                f89086c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Wn.c.a.<clinit>():void");
        }
    }

    public static final void a(b bVar, String str, P p10, List<b.C2205b> list, List<b.a> list2, boolean z10) {
        Double d10;
        Object obj;
        C17542s.j(bVar, "analytics");
        C17542s.j(p10, "deliveryType");
        C17542s.j(list, "homeDeliveryOptions");
        C17542s.j(list2, "collectDeliveryOptions");
        int i10 = a.f89086c[p10.ordinal()];
        if (i10 == 1) {
            list2 = new ArrayList<>();
            for (Object next : list) {
                switch (a.f89085b[((b.C2205b) next).i().k().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        list2.add(next);
                        break;
                    default:
                        throw new t();
                }
            }
        } else if (i10 != 2) {
            throw new t();
        }
        Double a10 = g.a(list2, !z10);
        Iterator it = list.iterator();
        while (true) {
            d10 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((b.C2205b) obj).i().k() == u.CURBSIDE_RANGE_OF_DAYS) {
                }
            } else {
                obj = null;
            }
        }
        b.C2205b bVar2 = (b.C2205b) obj;
        if (bVar2 != null) {
            d10 = bVar2.e(Boolean.valueOf(!z10));
        }
        bVar.J(str, a10, d10);
    }

    public static final void b(b bVar, List<r.a> list, C10813p pVar, u uVar) {
        a aVar;
        C17542s.j(bVar, "analytics");
        C17542s.j(list, "items");
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(uVar, "serviceType");
        ArrayList arrayList = new ArrayList();
        for (r.a aVar2 : list) {
            int i10 = a.f89084a[aVar2.e().ordinal()];
            if (i10 == 1 || i10 == 2) {
                aVar = new a(aVar2.b(), aVar2.c());
            } else if (i10 == 3 || i10 == 4) {
                aVar = null;
            } else {
                throw new t();
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        bVar.C(arrayList, pVar, uVar);
    }

    public static final void c(b bVar, List<b.a> list) {
        C17542s.j(bVar, "analytics");
        if (list != null) {
            for (b.a aVar : list) {
                if (aVar.h()) {
                    bVar.e(aVar);
                }
            }
        }
    }

    public static final void d(P p10, b bVar, List<? extends C10812o> list) {
        C17542s.j(p10, "deliveryMethod");
        C17542s.j(bVar, "analytics");
        if (list != null) {
            for (C10812o oVar : list) {
                if (!(oVar instanceof C10812o.a)) {
                    if (oVar instanceof C10812o.d) {
                        C10812o.d dVar = (C10812o.d) oVar;
                        bVar.E(p10, dVar.i(), dVar.k());
                    } else {
                        throw new t();
                    }
                }
            }
        }
    }
}
