package Wn;

import Nn.u;
import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"LWn/j;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "STANDARD", "STANDARD_RANGE_OF_DAYS", "CURBSIDE", "CURBSIDE_RANGE_OF_DAYS", "CURBSIDE_EXPRESS", "CURBSIDE_EXPRESS_RANGE_OF_DAYS", "EXPRESS", "EXPRESS_RANGE_OF_DAYS", "LOCKER", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum j {
    STANDARD("STANDARD"),
    STANDARD_RANGE_OF_DAYS("STANDARD_RANGE_OF_DAYS"),
    CURBSIDE("CURBSIDE"),
    CURBSIDE_RANGE_OF_DAYS("CURBSIDE_RANGE_OF_DAYS"),
    CURBSIDE_EXPRESS("CURBSIDE_EXPRESS"),
    CURBSIDE_EXPRESS_RANGE_OF_DAYS("CURBSIDE_EXPRESS_RANGE_OF_DAYS"),
    EXPRESS("EXPRESS"),
    EXPRESS_RANGE_OF_DAYS("EXPRESS_RANGE_OF_DAYS"),
    LOCKER("LOCKER");
    
    public static final a Companion = null;
    private final String key;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LWn/j$a;", "", "<init>", "()V", "LNn/u;", "fulfillmentServiceType", "", "a", "(LNn/u;)Ljava/lang/String;", "LWn/j;", "b", "(LNn/u;)LWn/j;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Wn.j$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1899a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f89089a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
            /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Nn.u[] r0 = Nn.u.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Nn.u r1 = Nn.u.STANDARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Nn.u r1 = Nn.u.STANDARD_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Nn.u r1 = Nn.u.LOCKER     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Nn.u r1 = Nn.u.CURBSIDE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Nn.u r1 = Nn.u.CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Nn.u r1 = Nn.u.EXPRESS     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    Nn.u r1 = Nn.u.EXPRESS_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    Nn.u r1 = Nn.u.EXPRESS_CURBSIDE     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    Nn.u r1 = Nn.u.EXPRESS_CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    f89089a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Wn.j.a.C1899a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(u uVar) {
            C17542s.j(uVar, "fulfillmentServiceType");
            return b(uVar).b();
        }

        public final j b(u uVar) {
            C17542s.j(uVar, "fulfillmentServiceType");
            switch (C1899a.f89089a[uVar.ordinal()]) {
                case 1:
                    return j.STANDARD;
                case 2:
                    return j.STANDARD_RANGE_OF_DAYS;
                case 3:
                    return j.LOCKER;
                case 4:
                    return j.CURBSIDE;
                case 5:
                    return j.CURBSIDE_RANGE_OF_DAYS;
                case 6:
                    return j.EXPRESS;
                case 7:
                    return j.EXPRESS_RANGE_OF_DAYS;
                case 8:
                    return j.CURBSIDE_EXPRESS;
                case 9:
                    return j.CURBSIDE_EXPRESS_RANGE_OF_DAYS;
                default:
                    throw new t();
            }
        }

        private a() {
        }
    }

    static {
        j[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private j(String str) {
        this.key = str;
    }

    public final String b() {
        return this.key;
    }
}
