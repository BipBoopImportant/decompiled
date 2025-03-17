package jz;

import Fn.c;
import XH.t;
import YH.C16877v;
import gz.d;
import gz.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.X;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljz/h;", "", "<init>", "()V", "", "LFn/c;", "discountCodes", "Lgz/d;", "a", "(Ljava/util/List;)Ljava/util/List;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f128296a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Fn.c$a[] r0 = Fn.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fn.c$a r1 = Fn.c.a.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Fn.c$a r1 = Fn.c.a.NOT_STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Fn.c$a r1 = Fn.c.a.REDEEMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Fn.c$a r1 = Fn.c.a.INVALID     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Fn.c$a r1 = Fn.c.a.FAMILY_ONLY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Fn.c$a r1 = Fn.c.a.INVALID_CONTEXT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f128296a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jz.h.a.<clinit>():void");
        }
    }

    public final List<d> a(List<c> list) {
        X x10;
        C17542s.j(list, "discountCodes");
        Iterable<c> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (c cVar : iterable) {
            c.a c10 = cVar.c();
            g gVar = null;
            switch (c10 == null ? -1 : a.f128296a[c10.ordinal()]) {
                case -1:
                case 6:
                    x10 = null;
                    break;
                case 1:
                    x10 = X.COUPON_BAG_ERROR_EXPIRED;
                    break;
                case 2:
                    x10 = X.COUPON_BAG_ERROR_NOT_STARTED;
                    break;
                case 3:
                    x10 = X.COUPON_BAG_ERROR_REDEEMED;
                    break;
                case 4:
                    x10 = X.COUPON_BAG_ERROR_INVALID;
                    break;
                case 5:
                    x10 = X.COUPON_BAG_ERROR_FAMILY;
                    break;
                default:
                    throw new t();
            }
            String a10 = cVar.a();
            if (x10 != null) {
                gVar = new g(x10);
            }
            arrayList.add(new d(a10, true, gVar));
        }
        return arrayList;
    }
}
