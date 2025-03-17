package wn;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import on.C11687b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lon/b$e;", "type", "Lwn/a;", "a", "(Lon/b$e;)Lwn/a;", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wn.b  reason: case insensitive filesystem */
public final class C12287b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wn.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f105879a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                on.b$e[] r0 = on.C11687b.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                on.b$e r1 = on.C11687b.e.CATEGORY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                on.b$e r1 = on.C11687b.e.ROOM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                on.b$e r1 = on.C11687b.e.CAMPAIGNS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                on.b$e r1 = on.C11687b.e.SEARCH_RESULTS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                on.b$e r1 = on.C11687b.e.USER_RECOMMENDATION     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                on.b$e r1 = on.C11687b.e.OFFERS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                on.b$e r1 = on.C11687b.e.PRODUCTS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f105879a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wn.C12287b.a.<clinit>():void");
        }
    }

    public static final C12286a a(C11687b.e eVar) {
        C17542s.j(eVar, "type");
        switch (a.f105879a[eVar.ordinal()]) {
            case 1:
                return C12286a.CATEGORIES;
            case 2:
                return C12286a.ROOMS;
            case 3:
                return C12286a.COMM_POSTS;
            case 4:
                return C12286a.SEARCH;
            case 5:
                return C12286a.RECOMMENDATION;
            case 6:
                return C12286a.OFFERS;
            case 7:
                return C12286a.PRODUCTS;
            default:
                throw new t();
        }
    }
}
