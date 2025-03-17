package SC;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import wK.C18349h7;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LSC/S1;", "", "Lc2/v;", "fontSize", "<init>", "(Ljava/lang/String;IJ)V", "LwK/h7;", "b", "()LwK/h7;", "J", "getFontSize-XSAIIZE", "()J", "Small", "Medium", "Size700", "Large", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum S1 {
    Small(C18349h7.Small.b()),
    Medium(C18349h7.Medium.b()),
    Size700(C18349h7.Size700.b()),
    Large(C18349h7.Large.b());
    
    private final long fontSize;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115957a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                SC.S1[] r0 = SC.S1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.S1 r1 = SC.S1.Small     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.S1 r1 = SC.S1.Medium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                SC.S1 r1 = SC.S1.Size700     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                SC.S1 r1 = SC.S1.Large     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f115957a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.S1.a.<clinit>():void");
        }
    }

    static {
        S1[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private S1(long j10) {
        this.fontSize = j10;
    }

    public final C18349h7 b() {
        int i10 = a.f115957a[ordinal()];
        if (i10 == 1) {
            return C18349h7.Small;
        }
        if (i10 == 2) {
            return C18349h7.Medium;
        }
        if (i10 == 3) {
            return C18349h7.Size700;
        }
        if (i10 == 4) {
            return C18349h7.Large;
        }
        throw new t();
    }
}
