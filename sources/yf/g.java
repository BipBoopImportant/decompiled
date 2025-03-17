package yf;

import XH.t;
import com.ingka.ikea.analytics.Interaction$Component;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lyf/g;", "", "<init>", "(Ljava/lang/String;I)V", "", "m", "()Ljava/lang/String;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "j", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "CATEGORIES", "ROOMS", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum g {
    CATEGORIES,
    ROOMS;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f78035a = null;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                yf.g[] r0 = yf.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yf.g r1 = yf.g.CATEGORIES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yf.g r1 = yf.g.ROOMS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f78035a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yf.g.a.<clinit>():void");
        }
    }

    static {
        g[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public static C17220a<g> b() {
        return $ENTRIES;
    }

    public final Interaction$Component j() {
        int i10 = a.f78035a[ordinal()];
        if (i10 == 1) {
            return Interaction$Component.CATEGORIES_CAROUSEL;
        }
        if (i10 == 2) {
            return Interaction$Component.ROOMS_CAROUSEL;
        }
        throw new t();
    }

    public final String m() {
        int i10 = a.f78035a[ordinal()];
        if (i10 == 1) {
            return "category_carousel";
        }
        if (i10 == 2) {
            return "room_carousel";
        }
        throw new t();
    }
}
