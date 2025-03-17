package SE;

import XH.t;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import fI.C17221b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSE/a;", "", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SE.a  reason: case insensitive filesystem */
public final class C13668a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2846a f116532a = new C2846a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"LSE/a$a;", "", "<init>", "()V", "", "LSE/a$a$a;", "c", "(Ljava/lang/String;)LSE/a$a$a;", "b", "(LSE/a$a$a;)Ljava/lang/String;", "countryCode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "SMARTA_PROD_US_HOST", "Ljava/lang/String;", "SMARTA_PROD_EU_HOST", "SMARTA_PROD_AP_HOST", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SE.a$a  reason: collision with other inner class name */
    public static final class C2846a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b!\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"LSE/a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "US", "CA", "GB", "JP", "KR", "DK", "IE", "FR", "DE", "ES", "NL", "SE", "PL", "CH", "AU", "AT", "IT", "BE", "FI", "PT", "NO", "CZ", "HU", "SK", "RO", "HR", "RS", "SI", "IN", "NOT_SUPPORTED", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: SE.a$a$a  reason: collision with other inner class name */
        public enum C2847a {
            US,
            CA,
            GB,
            JP,
            KR,
            DK,
            IE,
            FR,
            DE,
            ES,
            NL,
            SE,
            PL,
            CH,
            AU,
            AT,
            IT,
            BE,
            FI,
            PT,
            NO,
            CZ,
            HU,
            SK,
            RO,
            HR,
            RS,
            SI,
            IN,
            NOT_SUPPORTED;

            static {
                C2847a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: SE.a$a$b */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f116546a;

            /* JADX WARNING: Can't wrap try/catch for region: R(63:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|63) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
            /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    SE.a$a$a[] r0 = SE.C13668a.C2846a.C2847a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.US     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.CA     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.GB     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.DK     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.IE     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.FR     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.DE     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.ES     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.NL     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.SE     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r2 = 10
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.PL     // Catch:{ NoSuchFieldError -> 0x006e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                    r2 = 11
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                L_0x006e:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.CH     // Catch:{ NoSuchFieldError -> 0x0078 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                    r2 = 12
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                L_0x0078:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.AT     // Catch:{ NoSuchFieldError -> 0x0082 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                    r2 = 13
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
                L_0x0082:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.IT     // Catch:{ NoSuchFieldError -> 0x008c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                    r2 = 14
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
                L_0x008c:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.BE     // Catch:{ NoSuchFieldError -> 0x0096 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                    r2 = 15
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
                L_0x0096:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.FI     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    r2 = 16
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
                L_0x00a0:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.PT     // Catch:{ NoSuchFieldError -> 0x00aa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                    r2 = 17
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
                L_0x00aa:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.NO     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    r2 = 18
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                L_0x00b4:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.CZ     // Catch:{ NoSuchFieldError -> 0x00be }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                    r2 = 19
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
                L_0x00be:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.HU     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    r2 = 20
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
                L_0x00c8:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.SK     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    r2 = 21
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
                L_0x00d2:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.RO     // Catch:{ NoSuchFieldError -> 0x00dc }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                    r2 = 22
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
                L_0x00dc:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.HR     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    r2 = 23
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
                L_0x00e6:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.RS     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    r2 = 24
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
                L_0x00f0:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.SI     // Catch:{ NoSuchFieldError -> 0x00fa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                    r2 = 25
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
                L_0x00fa:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.JP     // Catch:{ NoSuchFieldError -> 0x0104 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                    r2 = 26
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
                L_0x0104:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.KR     // Catch:{ NoSuchFieldError -> 0x010e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                    r2 = 27
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
                L_0x010e:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.AU     // Catch:{ NoSuchFieldError -> 0x0118 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                    r2 = 28
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
                L_0x0118:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.IN     // Catch:{ NoSuchFieldError -> 0x0122 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                    r2 = 29
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
                L_0x0122:
                    SE.a$a$a r1 = SE.C13668a.C2846a.C2847a.NOT_SUPPORTED     // Catch:{ NoSuchFieldError -> 0x012c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                    r2 = 30
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
                L_0x012c:
                    f116546a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: SE.C13668a.C2846a.b.<clinit>():void");
            }
        }

        public /* synthetic */ C2846a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(C2847a aVar) {
            switch (b.f116546a[aVar.ordinal()]) {
                case 1:
                case 2:
                case 30:
                    return "api";
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                case BuildConfig.MIN_SDK_VERSION /*24*/:
                case 25:
                    return "api-eu";
                case 26:
                case 27:
                case 28:
                case 29:
                    return "api-ap";
                default:
                    throw new t();
            }
        }

        private final C2847a c(String str) {
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                C17542s.i(upperCase, "toUpperCase(...)");
                return C2847a.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return C2847a.NOT_SUPPORTED;
            }
        }

        public final String a(String str) {
            C17542s.j(str, "countryCode");
            return b(c(str));
        }

        private C2846a() {
        }
    }
}
