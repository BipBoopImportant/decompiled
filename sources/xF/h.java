package xf;

import XH.t;
import com.ingka.ikea.analytics.Interaction$Component;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lxf/h;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "b", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "AUTOCOMPLETE_TEXT", "AUTOCOMPLETE_CATEGORY", "RECENTLY_SEARCHED", "REGULAR", "COMMON_SEARCH_TERM", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum h {
    AUTOCOMPLETE_TEXT,
    AUTOCOMPLETE_CATEGORY,
    RECENTLY_SEARCHED,
    REGULAR,
    COMMON_SEARCH_TERM;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f77757a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                xf.h[] r0 = xf.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xf.h r1 = xf.h.AUTOCOMPLETE_TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xf.h r1 = xf.h.AUTOCOMPLETE_CATEGORY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xf.h r1 = xf.h.RECENTLY_SEARCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xf.h r1 = xf.h.REGULAR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                xf.h r1 = xf.h.COMMON_SEARCH_TERM     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f77757a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xf.h.a.<clinit>():void");
        }
    }

    static {
        h[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final Interaction$Component b() {
        int i10 = a.f77757a[ordinal()];
        if (i10 == 1) {
            return Interaction$Component.AUTOCOMPLETE;
        }
        if (i10 == 2) {
            return Interaction$Component.AUTOCOMPLETE_CATEGORY;
        }
        if (i10 == 3) {
            return Interaction$Component.SEARCH_RECENTLY_SEARCHED;
        }
        if (i10 == 4) {
            return Interaction$Component.SEARCH_BAR;
        }
        if (i10 == 5) {
            return Interaction$Component.COMMON_SEARCHES;
        }
        throw new t();
    }
}
