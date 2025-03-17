package SC;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import wK.C18265a7;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LSC/O1;", "", "<init>", "(Ljava/lang/String;I)V", "LwK/a7;", "b", "()LwK/a7;", "XSmall", "Small", "Medium", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum O1 {
    XSmall,
    Small,
    Medium;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115879a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                SC.O1[] r0 = SC.O1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.O1 r1 = SC.O1.XSmall     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.O1 r1 = SC.O1.Small     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                SC.O1 r1 = SC.O1.Medium     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f115879a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.O1.a.<clinit>():void");
        }
    }

    static {
        O1[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final C18265a7 b() {
        int i10 = a.f115879a[ordinal()];
        if (i10 == 1) {
            return C18265a7.XSmall;
        }
        if (i10 == 2) {
            return C18265a7.Small;
        }
        if (i10 == 3) {
            return C18265a7.Medium;
        }
        throw new t();
    }
}
