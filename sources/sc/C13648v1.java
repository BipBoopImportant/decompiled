package SC;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import wK.A5;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LSC/v1;", "", "<init>", "(Ljava/lang/String;I)V", "LwK/A5;", "b", "()LwK/A5;", "Family", "Business", "BusinessNetwork", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.v1  reason: case insensitive filesystem */
public enum C13648v1 {
    Family,
    Business,
    BusinessNetwork;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.v1$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116465a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                SC.v1[] r0 = SC.C13648v1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.v1 r1 = SC.C13648v1.Family     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.v1 r1 = SC.C13648v1.Business     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                SC.v1 r1 = SC.C13648v1.BusinessNetwork     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f116465a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.C13648v1.a.<clinit>():void");
        }
    }

    static {
        C13648v1[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final A5 b() {
        int i10 = a.f116465a[ordinal()];
        if (i10 == 1) {
            return A5.Family;
        }
        if (i10 == 2) {
            return A5.Business;
        }
        if (i10 == 3) {
            return A5.BusinessNetwork;
        }
        throw new t();
    }
}
