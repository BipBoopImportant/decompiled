package SC;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import wK.Z2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LSC/A0;", "", "<init>", "(Ljava/lang/String;I)V", "LwK/Z2;", "b", "()LwK/Z2;", "Regular", "Success", "Error", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum A0 {
    Regular,
    Success,
    Error;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115657a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                SC.A0[] r0 = SC.A0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.A0 r1 = SC.A0.Regular     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.A0 r1 = SC.A0.Success     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                SC.A0 r1 = SC.A0.Error     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f115657a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.A0.a.<clinit>():void");
        }
    }

    static {
        A0[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final Z2 b() {
        int i10 = a.f115657a[ordinal()];
        if (i10 == 1) {
            return Z2.Regular;
        }
        if (i10 == 2) {
            return Z2.Success;
        }
        if (i10 == 3) {
            return Z2.Error;
        }
        throw new t();
    }
}
