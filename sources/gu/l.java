package Gu;

import Ae.o;
import XH.C16807N;
import XH.t;
import com.ingka.ikea.instore.wayfinding.impl.navigation.WayfindingRoutes$KompassMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ru.e;
import su.C11891a;
import x4.C8951o;
import x4.D;
import x4.E;
import x4.I;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LGu/l;", "Lru/e;", "Lsu/a;", "analytics", "<init>", "(Lsu/a;)V", "Lru/e$a$a;", "LAe/o;", "d", "(Lru/e$a$a;)LAe/o;", "Lx4/o;", "navController", "", "itemNo", "Lru/e$a;", "analyticsData", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Lru/e$a;)V", "Lsu/a;", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C11891a f81257a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f81258a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                ru.e$a$a[] r0 = ru.e.a.C2437a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ru.e$a$a r1 = ru.e.a.C2437a.STORE_PAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ru.e$a$a r1 = ru.e.a.C2437a.PIP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ru.e$a$a r1 = ru.e.a.C2437a.SHOPPING_LIST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ru.e$a$a r1 = ru.e.a.C2437a.SHOPPING_LIST_STORE_MODAL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f81258a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gu.l.a.<clinit>():void");
        }
    }

    public l(C11891a aVar) {
        C17542s.j(aVar, "analytics");
        this.f81257a = aVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N c(D d10) {
        C17542s.j(d10, "$this$navOptions");
        d10.e(true);
        return C16807N.f139792a;
    }

    private final o d(e.a.C2437a aVar) {
        int i10 = a.f81258a[aVar.ordinal()];
        if (i10 == 1) {
            return o.STORE_PAGE_MAP;
        }
        if (i10 == 2) {
            return o.PIP_MAP;
        }
        if (i10 == 3) {
            return o.SHOPPING_LIST;
        }
        if (i10 == 4) {
            return o.SHOPPING_LIST_STORE_MODAL;
        }
        throw new t();
    }

    public void a(C8951o oVar, String str, e.a aVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(aVar, "analyticsData");
        this.f81257a.b(str, aVar.a(), aVar.c(), d(aVar.b()));
        C8951o.f0(oVar, new WayfindingRoutes$KompassMap(str), E.a(new k()), (I.a) null, 4, (Object) null);
    }
}
