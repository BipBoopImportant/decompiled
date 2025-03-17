package aA;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LaA/b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "j", "()Z", "isLoggedIn", "FAMILY", "REGULAR", "GUEST", "usersession_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aA.b  reason: case insensitive filesystem */
public enum C13910b {
    FAMILY("family"),
    REGULAR("regular"),
    GUEST("guest");
    
    private final String key;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aA.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f118451a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aA.b r1 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                aA.b r1 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                aA.b r1 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f118451a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aA.C13910b.a.<clinit>():void");
        }
    }

    static {
        C13910b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C13910b(String str) {
        this.key = str;
    }

    public final String b() {
        return this.key;
    }

    public final boolean j() {
        int i10 = a.f118451a[ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        throw new t();
    }
}
