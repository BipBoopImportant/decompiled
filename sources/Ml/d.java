package Ml;

import XH.t;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import kp.C11522d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LMl/d;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lkp/d$c;", "m", "()Lkp/d$c;", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "TOP", "BOTTOM", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    TOP("TOP"),
    BOTTOM("BOTTOM");
    
    private final String value;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f83455a = null;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Ml.d[] r0 = Ml.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ml.d r1 = Ml.d.TOP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ml.d r1 = Ml.d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f83455a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ml.d.a.<clinit>():void");
        }
    }

    static {
        d[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private d(String str) {
        this.value = str;
    }

    public static C17220a<d> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.value;
    }

    public final C11522d.c m() {
        int i10 = a.f83455a[ordinal()];
        if (i10 == 1) {
            return C11522d.c.TOP;
        }
        if (i10 == 2) {
            return C11522d.c.BOTTOM;
        }
        throw new t();
    }
}
