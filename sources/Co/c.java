package Co;

import HJ.C15854t;
import Nn.C10804g;
import Nn.C10808k;
import Nn.C10811n;
import Nn.C10812o;
import Nn.C10813p;
import Nn.G;
import Nn.J;
import Nn.K;
import Nn.P;
import Nn.Q;
import Nn.u;
import XH.t;
import YH.C16877v;
import bI.C17035a;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet;
import com.sugarcube.core.logger.DslKt;
import ho.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rv.C11849b;
import uK.C18146a;

@Metadata(d1 = {"\u0000r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0000*\b\u0012\u0004\u0012\u00020\t0\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\n*\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00040\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0000*\b\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010 \u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\"\u001a\u00020\u000e*\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\"\u0010#\u001a'\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*\u001a\u0017\u0010+\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010/\u001a\u00020(2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b/\u00100\u001a\u001f\u00102\u001a\u0004\u0018\u00010&2\f\u00101\u001a\b\u0012\u0004\u0012\u00020&0\u0000H\u0002¢\u0006\u0004\b2\u00103\u001a!\u00104\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0003¢\u0006\u0004\b4\u00105\u001a'\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u0000*\u00020\u00012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b8\u00109\u001a\u001f\u0010:\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"", "LNn/o;", "LNn/K;", "selectedDeliveryServiceHolder", "Lho/b$b;", "r", "(Ljava/util/List;LNn/K;)Ljava/util/List;", "q", "(LNn/o;LNn/K;)Lho/b$b;", "LNn/k;", "Lho/b$a;", "p", "o", "(LNn/k;LNn/K;)Lho/b$a;", "", "exclTax", "t", "(Ljava/util/List;Z)Ljava/util/List;", "s", "LNn/p;", "deliveryServiceType", "LNn/J$b;", "j", "(LNn/p;)LNn/J$b;", "LNn/g;", "showExclTax", "LMn/a;", "c", "(LNn/g;Z)LMn/a;", "", "productDescription", "measurement", "i", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "l", "(LNn/K;)Z", "LNn/u;", "fulfillmentServiceType", "LNn/P;", "transportMethod", "", "g", "(LNn/p;LNn/u;LNn/P;)I", "f", "(LNn/p;)I", "Lho/b;", "deliveryOption", "e", "(Lho/b;)I", "list", "d", "(Ljava/util/List;)LNn/P;", "h", "(LNn/u;LNn/P;)I", "deliveryId", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$e;", "m", "(LNn/o;Ljava/lang/String;)Ljava/util/List;", "k", "(LNn/p;LNn/P;)I", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f79644a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f79645b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f79646c;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(2:45|46)|47|49) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|49) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|49) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|49) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0098 */
        static {
            /*
                Nn.p[] r0 = Nn.C10813p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Nn.p r2 = Nn.C10813p.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Nn.p r3 = Nn.C10813p.PICKUP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                Nn.p r4 = Nn.C10813p.PICKUP_STORE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                Nn.p r5 = Nn.C10813p.CLICK_AND_COLLECT_STORE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                Nn.p r6 = Nn.C10813p.CLICK_AND_COLLECT_NEAR_YOU     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                r6 = 6
                Nn.p r7 = Nn.C10813p.LOCKER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f79644a = r0
                Nn.P[] r0 = Nn.P.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.P r7 = Nn.P.PARCEL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                Nn.P r7 = Nn.P.TRUCK     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r7] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                f79645b = r0
                Nn.u[] r0 = Nn.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.u r7 = Nn.u.STANDARD     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                Nn.u r1 = Nn.u.STANDARD_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x006f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                Nn.u r1 = Nn.u.CURBSIDE     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                Nn.u r1 = Nn.u.CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                Nn.u r1 = Nn.u.EXPRESS     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                Nn.u r1 = Nn.u.EXPRESS_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                Nn.u r1 = Nn.u.EXPRESS_CURBSIDE     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                Nn.u r1 = Nn.u.EXPRESS_CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                f79646c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Co.c.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f79647a;

        public b(boolean z10) {
            this.f79647a = z10;
        }

        public final int compare(T t10, T t11) {
            Double e10 = ((b.a) t10).e(Boolean.valueOf(!this.f79647a));
            if (e10 == null) {
                e10 = Double.valueOf(Double.MAX_VALUE);
            }
            Double e11 = ((b.a) t11).e(Boolean.valueOf(!this.f79647a));
            if (e11 == null) {
                e11 = Double.valueOf(Double.MAX_VALUE);
            }
            return C17035a.e(e10, e11);
        }
    }

    public static final Mn.a c(C10804g gVar, boolean z10) {
        double d10;
        C17542s.j(gVar, "<this>");
        String b10 = gVar.b();
        int c10 = gVar.c();
        if (z10) {
            d10 = gVar.d();
        } else {
            Double e10 = gVar.e();
            d10 = e10 != null ? e10.doubleValue() : 0.0d;
        }
        return new Mn.a(b10, c10, d10);
    }

    private static final P d(List<? extends P> list) {
        Iterable<P> iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (P p10 : iterable) {
                if (p10 != C16877v.y0(list)) {
                    return null;
                }
            }
        }
        return (P) C16877v.y0(list);
    }

    public static final int e(ho.b bVar) {
        C17542s.j(bVar, "deliveryOption");
        if (bVar instanceof b.a) {
            C10808k i10 = ((b.a) bVar).i();
            if (i10 instanceof C10808k.b) {
                return C11849b.f102360w0;
            }
            if (i10 instanceof C10808k.c) {
                return C11849b.f102368y0;
            }
            if (i10 instanceof C10808k.d) {
                return C11849b.f102372z0;
            }
            if (i10 instanceof C10808k.a) {
                return C11849b.f102364x0;
            }
            throw new t();
        } else if (bVar instanceof b.C2205b) {
            b.C2205b bVar2 = (b.C2205b) bVar;
            u k10 = bVar2.i().k();
            Iterable<C10812o.b> b10 = bVar2.i().b();
            ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
            for (C10812o.b d10 : b10) {
                arrayList.add(d10.d());
            }
            return h(k10, d(arrayList));
        } else {
            throw new t();
        }
    }

    public static final int f(C10813p pVar) {
        C17542s.j(pVar, "deliveryServiceType");
        switch (a.f79644a[pVar.ordinal()]) {
            case 1:
                return C18146a.f148385c3;
            case 2:
            case 3:
            case 4:
                return C18146a.f148352a2;
            case 5:
                return C18146a.f148352a2;
            case 6:
                return C18146a.f148221R6;
            default:
                throw new t();
        }
    }

    public static final int g(C10813p pVar, u uVar, P p10) {
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(uVar, "fulfillmentServiceType");
        C17542s.j(p10, "transportMethod");
        switch (a.f79644a[pVar.ordinal()]) {
            case 1:
                return h(uVar, p10);
            case 2:
                return C11849b.f102368y0;
            case 3:
            case 4:
                return C11849b.f102372z0;
            case 5:
                return C11849b.f102364x0;
            case 6:
                return C11849b.f102360w0;
            default:
                throw new t();
        }
    }

    private static final int h(u uVar, P p10) {
        switch (a.f79646c[uVar.ordinal()]) {
            case 1:
                int i10 = p10 == null ? -1 : a.f79645b[p10.ordinal()];
                if (i10 == -1) {
                    return C11849b.f102316l0;
                }
                if (i10 == 1) {
                    return C11849b.f102348t0;
                }
                if (i10 == 2) {
                    return C11849b.f102356v0;
                }
                throw new t();
            case 2:
                return C11849b.f102352u0;
            case 3:
                return C11849b.f102320m0;
            case 4:
                return C11849b.f102324n0;
            case 5:
                int i11 = p10 == null ? -1 : a.f79645b[p10.ordinal()];
                if (i11 != -1) {
                    if (i11 == 1) {
                        return C11849b.f102340r0;
                    }
                    if (i11 != 2) {
                        throw new t();
                    }
                }
                return C11849b.f102328o0;
            case 6:
                return C11849b.f102344s0;
            case 7:
                return C11849b.f102332p0;
            case 8:
                return C11849b.f102336q0;
            default:
                IllegalStateException illegalStateException = new IllegalStateException("Not a valid home delivery");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            return C11849b.f102316l0;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "getHomeDeliveryStringRes";
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
                return C11849b.f102316l0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r1 = ip.o.a(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String i(java.lang.String r1, java.lang.String r2) {
        /*
            if (r2 == 0) goto L_0x001d
            boolean r0 = HJ.C15854t.v0(r2)
            if (r0 == 0) goto L_0x0009
            goto L_0x001d
        L_0x0009:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r2 = "%s, %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
        L_0x001d:
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = ip.o.a(r1)
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Co.c.i(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final J.b j(C10813p pVar) {
        C17542s.j(pVar, "deliveryServiceType");
        switch (a.f79644a[pVar.ordinal()]) {
            case 1:
                return J.b.HOME;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return J.b.COLLECT;
            default:
                throw new t();
        }
    }

    public static final int k(C10813p pVar, P p10) {
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(p10, "transportMethod");
        switch (a.f79644a[pVar.ordinal()]) {
            case 1:
                int i10 = a.f79645b[p10.ordinal()];
                if (i10 == 1) {
                    return C11849b.f102282d0;
                }
                if (i10 == 2) {
                    return C11849b.f102300h0;
                }
                throw new t();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return C11849b.f102222P;
            default:
                throw new t();
        }
    }

    public static final boolean l(K k10) {
        List<K.b> a10;
        boolean z10 = false;
        if (!(k10 == null || (a10 = k10.a()) == null || a10.size() != 1)) {
            z10 = true;
        }
        return !z10;
    }

    public static final List<ChangePickupPointBottomSheet.e> m(C10812o oVar, String str) {
        C10812o.b bVar;
        List<G> a10;
        List<Q> n10;
        C17542s.j(oVar, "<this>");
        if (str == null) {
            bVar = (C10812o.b) C16877v.y0(oVar.b());
        } else {
            for (C10812o.b bVar2 : oVar.b()) {
                if (C17542s.e(bVar2.c(), str)) {
                    bVar = bVar2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (bVar == null || (a10 = bVar.a()) == null) {
            return null;
        }
        Iterable<G> iterable = a10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (G g10 : iterable) {
            Iterator<C10812o.b> it = oVar.b().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (C17542s.e(it.next().c(), bVar.c())) {
                    break;
                } else {
                    i10++;
                }
            }
            C10811n g11 = i10 >= 1 ? null : oVar.g();
            String h10 = oVar.h();
            String c10 = bVar.c();
            if (oVar instanceof C10812o.a) {
                n10 = C16877v.n();
            } else if (oVar instanceof C10812o.d) {
                n10 = ((C10812o.d) oVar).n();
            } else {
                throw new t();
            }
            arrayList.add(new ChangePickupPointBottomSheet.e(h10, c10, g10, n10, g11, oVar.k(), oVar.i()));
        }
        return arrayList;
    }

    public static /* synthetic */ List n(C10812o oVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return m(oVar, str);
    }

    public static final b.a o(C10808k kVar, K k10) {
        Object obj;
        boolean z10;
        boolean z11;
        C10812o oVar;
        Object obj2;
        Object obj3;
        Double d10;
        C17542s.j(kVar, "<this>");
        Iterator it = kVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C10812o) obj).h(), k10 != null ? k10.f() : null)) {
                break;
            }
        }
        C10812o oVar2 = (C10812o) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : kVar.a()) {
            C10812o oVar3 = (C10812o) next;
            C10811n g10 = oVar3.g();
            if (g10 == null || (d10 = g10.a()) == null) {
                C10811n g11 = oVar3.g();
                d10 = g11 != null ? g11.b() : null;
            }
            Object obj4 = linkedHashMap.get(d10);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap.put(d10, obj4);
            }
            ((List) obj4).add(next);
        }
        boolean z12 = false;
        boolean z13 = linkedHashMap.size() > 1;
        Iterable a10 = kVar.a();
        if (!(a10 instanceof Collection) || !((Collection) a10).isEmpty()) {
            Iterator it2 = a10.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C10812o) it2.next()).l().c()) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        Iterable a11 = kVar.a();
        if (!(a11 instanceof Collection) || !((Collection) a11).isEmpty()) {
            Iterator it3 = a11.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C10812o oVar4 = (C10812o) it3.next();
                if (!C17542s.b(oVar4.l().b(), oVar4.l().a())) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z14 = z13 || z10 || z11;
        if (oVar2 == null) {
            Iterator it4 = kVar.a().iterator();
            if (!it4.hasNext()) {
                obj3 = null;
            } else {
                obj3 = it4.next();
                if (it4.hasNext()) {
                    Double j10 = ((C10812o) obj3).j();
                    double doubleValue = j10 != null ? j10.doubleValue() : Double.MAX_VALUE;
                    do {
                        Object next2 = it4.next();
                        Double j11 = ((C10812o) next2).j();
                        double doubleValue2 = j11 != null ? j11.doubleValue() : Double.MAX_VALUE;
                        if (Double.compare(doubleValue, doubleValue2) > 0) {
                            obj3 = next2;
                            doubleValue = doubleValue2;
                        }
                    } while (it4.hasNext());
                }
            }
            oVar = (C10812o) obj3;
        } else {
            oVar = oVar2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next3 : kVar.a()) {
            Long d11 = ((C10812o) next3).d();
            if (d11 != null && d11.longValue() > 0) {
                arrayList.add(next3);
            }
        }
        Iterator it5 = arrayList.iterator();
        if (!it5.hasNext()) {
            obj2 = null;
        } else {
            obj2 = it5.next();
            if (it5.hasNext()) {
                Long d12 = ((C10812o) obj2).d();
                long longValue = d12 != null ? d12.longValue() : Long.MAX_VALUE;
                do {
                    Object next4 = it5.next();
                    Long d13 = ((C10812o) next4).d();
                    long longValue2 = d13 != null ? d13.longValue() : Long.MAX_VALUE;
                    if (longValue > longValue2) {
                        obj2 = next4;
                        longValue = longValue2;
                    }
                } while (it5.hasNext());
            }
        }
        C10812o oVar5 = (C10812o) obj2;
        String c10 = oVar5 != null ? oVar5.c() : null;
        if (oVar != null) {
            if (oVar2 != null) {
                z12 = true;
            }
            return new b.a(kVar, oVar, c10, z12, z14);
        }
        throw new IllegalArgumentException("No delivery services available");
    }

    public static final List<b.a> p(List<? extends C10808k> list, K k10) {
        C17542s.j(list, "<this>");
        Iterable<C10808k> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C10808k o10 : iterable) {
            arrayList.add(o(o10, k10));
        }
        return arrayList;
    }

    public static final b.C2205b q(C10812o oVar, K k10) {
        C17542s.j(oVar, "<this>");
        u uVar = null;
        C10813p c10 = k10 != null ? k10.c() : null;
        if (k10 != null) {
            uVar = k10.e();
        }
        boolean z10 = false;
        if (oVar instanceof C10812o.a) {
            C10812o.a aVar = (C10812o.a) oVar;
            if (aVar.i() == c10 && aVar.k() == uVar) {
                z10 = true;
            }
        } else if (!(oVar instanceof C10812o.d)) {
            throw new t();
        }
        return new b.C2205b(oVar, z10);
    }

    public static final List<b.C2205b> r(List<? extends C10812o> list, K k10) {
        C17542s.j(list, "<this>");
        Iterable<C10812o> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C10812o q10 : iterable) {
            arrayList.add(q(q10, k10));
        }
        return arrayList;
    }

    public static final List<b.a> s(List<b.a> list, boolean z10) {
        C17542s.j(list, "<this>");
        return C16877v.g1(list, new b(z10));
    }

    public static final List<b.C2205b> t(List<b.C2205b> list, boolean z10) {
        C17542s.j(list, "<this>");
        return C16877v.g1(list, C17035a.c(new a(), new b(z10)));
    }

    /* access modifiers changed from: private */
    public static final Comparable u(b.C2205b bVar) {
        C17542s.j(bVar, "it");
        C10812o i10 = bVar.i();
        if (i10 instanceof C10812o.a) {
            return 0;
        }
        if (i10 instanceof C10812o.d) {
            return 1;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final Comparable v(boolean z10, b.C2205b bVar) {
        C17542s.j(bVar, "it");
        Double e10 = bVar.e(Boolean.valueOf(!z10));
        return e10 != null ? e10 : Double.valueOf(Double.MAX_VALUE);
    }
}
