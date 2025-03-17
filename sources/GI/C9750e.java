package gi;

import IC.C13023e;
import IC.C13026h;
import Ph.e;
import SC.L2;
import XH.t;
import XH.u;
import YH.C16877v;
import com.ingka.ikea.app.stockinfo.network.d;
import gi.C9749d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0011\u001a\u00020\r*\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0014\u001a\u00020\r*\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/d;", "", "d", "(Lcom/ingka/ikea/app/stockinfo/network/d;)Z", "Lgi/d$c$a;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/d;)Lgi/d$c$a;", "Llm/a$c;", "Lgi/d$d;", "availabilityStatus", "", "deliveryPrice", "isPupIncludedInDeliveryPrice", "LIC/e;", "e", "(Llm/a$c;Lgi/d$d;Ljava/lang/String;Z)LIC/e;", "Llm/a$c$c;", "b", "(Llm/a$c$c;Lgi/d$d;Ljava/lang/String;Z)LIC/e;", "Llm/a$c$b;", "a", "(Llm/a$c$b;Lgi/d$d;Ljava/lang/String;)LIC/e;", "LSC/L2;", "f", "(Lgi/d$d;)LSC/L2;", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.e  reason: case insensitive filesystem */
public final class C9750e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.e$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73416a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                gi.d$d[] r0 = gi.C9749d.C1283d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                gi.d$d r1 = gi.C9749d.C1283d.MISSING_INPUT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                gi.d$d r1 = gi.C9749d.C1283d.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                gi.d$d r1 = gi.C9749d.C1283d.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                gi.d$d r1 = gi.C9749d.C1283d.LIMITED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                gi.d$d r1 = gi.C9749d.C1283d.FEATURE_TURNED_OFF     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                gi.d$d r1 = gi.C9749d.C1283d.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f73416a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gi.C9750e.a.<clinit>():void");
        }
    }

    private static final C13023e a(C11550a.c.b bVar, C9749d.C1283d dVar, String str) {
        switch (a.f73416a[dVar.ordinal()]) {
            case 1:
                return C13026h.a(e.f62866r);
            case 2:
                return (str == null || str.length() == 0) ? C13026h.b(e.f62861m, bVar.c()) : C13026h.b(e.f62862n, bVar.c(), str);
            case 3:
                return C13026h.b(e.f62865q, bVar.c());
            case 4:
                return C13026h.b(e.f62863o, bVar.c());
            case 5:
            case 6:
                return C13026h.b(e.f62864p, bVar.c());
            default:
                throw new t();
        }
    }

    private static final C13023e b(C11550a.c.C2258c cVar, C9749d.C1283d dVar, String str, boolean z10) {
        switch (a.f73416a[dVar.ordinal()]) {
            case 1:
                return C13026h.a(e.f62866r);
            case 2:
                return (str == null || str.length() == 0) ? C13026h.b(e.f62867s, cVar.c()) : z10 ? C13026h.b(e.f62869u, cVar.c(), str) : C13026h.b(e.f62868t, cVar.c(), str);
            case 3:
                return C13026h.b(e.f62872x, cVar.c());
            case 4:
                return C13026h.b(e.f62870v, cVar.c());
            case 5:
            case 6:
                return C13026h.b(e.f62871w, cVar.c());
            default:
                throw new t();
        }
    }

    public static final C9749d.c.a c(d dVar) {
        C17542s.j(dVar, "<this>");
        return d(dVar) ? C9749d.c.a.IS_IN_STOCK : dVar == d.OUT_OF_STOCK ? C9749d.c.a.OUT_OF_STOCK : C9749d.c.a.UNDEFINED;
    }

    public static final boolean d(d dVar) {
        C17542s.j(dVar, "<this>");
        return C16877v.q(d.HIGH_IN_STOCK, d.MEDIUM_IN_STOCK, d.LOW_IN_STOCK).contains(dVar);
    }

    public static final C13023e e(C11550a.c cVar, C9749d.C1283d dVar, String str, boolean z10) {
        C17542s.j(dVar, "availabilityStatus");
        if (cVar == null) {
            return dVar == C9749d.C1283d.FEATURE_TURNED_OFF ? C13026h.a(e.f62857i) : C13026h.a(e.f62866r);
        }
        if (cVar instanceof C11550a.c.C2258c) {
            return b((C11550a.c.C2258c) cVar, dVar, str, z10);
        }
        if (cVar instanceof C11550a.c.b) {
            return a((C11550a.c.b) cVar, dVar, str);
        }
        if (cVar instanceof C11550a.c.C2255a) {
            throw new u((String) null, 1, (DefaultConstructorMarker) null);
        }
        throw new t();
    }

    public static final L2 f(C9749d.C1283d dVar) {
        C17542s.j(dVar, "<this>");
        switch (a.f73416a[dVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return L2.Available;
            case 3:
                return L2.Unavailable;
            case 4:
                return L2.Low;
            case 5:
            case 6:
                return L2.Indeterminate;
            default:
                throw new t();
        }
    }
}
