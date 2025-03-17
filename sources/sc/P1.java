package SC;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import wK.C18277b7;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LSC/P1;", "", "<init>", "(Ljava/lang/String;I)V", "LwK/b7;", "b", "()LwK/b7;", "XSmall", "Small", "Medium", "Large", "XLarge", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum P1 {
    XSmall,
    Small,
    Medium,
    Large,
    XLarge;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115882a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                SC.P1[] r0 = SC.P1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.P1 r1 = SC.P1.XSmall     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.P1 r1 = SC.P1.Small     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                SC.P1 r1 = SC.P1.Medium     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                SC.P1 r1 = SC.P1.Large     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                SC.P1 r1 = SC.P1.XLarge     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f115882a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.P1.a.<clinit>():void");
        }
    }

    static {
        P1[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final C18277b7 b() {
        int i10 = a.f115882a[ordinal()];
        if (i10 == 1) {
            return C18277b7.XSmall;
        }
        if (i10 == 2) {
            return C18277b7.Small;
        }
        if (i10 == 3) {
            return C18277b7.Medium;
        }
        if (i10 == 4) {
            return C18277b7.Large;
        }
        if (i10 == 5) {
            return C18277b7.XLarge;
        }
        throw new t();
    }
}
