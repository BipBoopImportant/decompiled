package O0;

import S0.C4800b;
import S0.C4801c;
import S0.C4802d;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.BuildConfig;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.app.base.network.models.UploadKt;
import d9.M;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aø\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aø\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010'\u001a\u001e\u0010*\u001a\u00020\u0000*\u00020%2\u0006\u0010)\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001a\u0010,\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a&\u00100\u001a\u00020\u0000*\u00020%2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.H\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001e\u00102\u001a\u00020\u0000*\u00020%2\u0006\u0010/\u001a\u00020.H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001b\u00106\u001a\u00020\u0000*\u00020%2\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b6\u00107\" \u0010<\u001a\b\u0012\u0004\u0012\u00020%088\u0000X\u0004¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b:\u0010;\"\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020=088\u0006¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\b>\u0010;\"\u0018\u00105\u001a\u00020\u0000*\u0002048AX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Lp1/v0;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "LO0/t;", "j", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)LO0/t;", "d", "backgroundColor", "b", "(LO0/t;J)J", "c", "(JLU0/m;I)J", "Lc2/h;", "elevation", "a", "(LO0/t;JFLU0/m;I)J", "l", "(LO0/t;F)J", "LS0/d;", "value", "f", "(LO0/t;LS0/d;)J", "LU0/I0;", "LU0/I0;", "g", "()LU0/I0;", "LocalColorScheme", "", "h", "LocalTonalElevationEnabled", "i", "(LS0/d;LU0/m;I)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.u  reason: case insensitive filesystem */
public final class C4755u {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C4753t> f11536a = C4910x.f(a.f11538c);

    /* renamed from: b  reason: collision with root package name */
    private static final I0<Boolean> f11537b = C4910x.f(b.f11539c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO0/t;", "b", "()LO0/t;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.u$a */
    static final class a extends C17544u implements C17631a<C4753t> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f11538c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C4753t invoke() {
            return C4755u.k(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 15, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.u$b */
    static final class b extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f11539c = new b();

        b() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.u$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11540a;

        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(2:71|72)|73|75) */
        /* JADX WARNING: Can't wrap try/catch for region: R(75:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|75) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x015e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                S0.d[] r0 = S0.C4802d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                S0.d r1 = S0.C4802d.Background     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                S0.d r1 = S0.C4802d.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                S0.d r1 = S0.C4802d.ErrorContainer     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                S0.d r1 = S0.C4802d.InverseOnSurface     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                S0.d r1 = S0.C4802d.InversePrimary     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                S0.d r1 = S0.C4802d.InverseSurface     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                S0.d r1 = S0.C4802d.OnBackground     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                S0.d r1 = S0.C4802d.OnError     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                S0.d r1 = S0.C4802d.OnErrorContainer     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                S0.d r1 = S0.C4802d.OnPrimary     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                S0.d r1 = S0.C4802d.OnPrimaryContainer     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                S0.d r1 = S0.C4802d.OnSecondary     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                S0.d r1 = S0.C4802d.OnSecondaryContainer     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                S0.d r1 = S0.C4802d.OnSurface     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                S0.d r1 = S0.C4802d.OnSurfaceVariant     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                S0.d r1 = S0.C4802d.SurfaceTint     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                S0.d r1 = S0.C4802d.OnTertiary     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                S0.d r1 = S0.C4802d.OnTertiaryContainer     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                S0.d r1 = S0.C4802d.Outline     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                S0.d r1 = S0.C4802d.OutlineVariant     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                S0.d r1 = S0.C4802d.Primary     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                S0.d r1 = S0.C4802d.PrimaryContainer     // Catch:{ NoSuchFieldError -> 0x00dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
            L_0x00dc:
                S0.d r1 = S0.C4802d.Scrim     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                S0.d r1 = S0.C4802d.Secondary     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                S0.d r1 = S0.C4802d.SecondaryContainer     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                S0.d r1 = S0.C4802d.Surface     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                S0.d r1 = S0.C4802d.SurfaceVariant     // Catch:{ NoSuchFieldError -> 0x010e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
            L_0x010e:
                S0.d r1 = S0.C4802d.SurfaceBright     // Catch:{ NoSuchFieldError -> 0x0118 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
            L_0x0118:
                S0.d r1 = S0.C4802d.SurfaceContainer     // Catch:{ NoSuchFieldError -> 0x0122 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
            L_0x0122:
                S0.d r1 = S0.C4802d.SurfaceContainerHigh     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                S0.d r1 = S0.C4802d.SurfaceContainerHighest     // Catch:{ NoSuchFieldError -> 0x0136 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
            L_0x0136:
                S0.d r1 = S0.C4802d.SurfaceContainerLow     // Catch:{ NoSuchFieldError -> 0x0140 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
            L_0x0140:
                S0.d r1 = S0.C4802d.SurfaceContainerLowest     // Catch:{ NoSuchFieldError -> 0x014a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
            L_0x014a:
                S0.d r1 = S0.C4802d.SurfaceDim     // Catch:{ NoSuchFieldError -> 0x0154 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
            L_0x0154:
                S0.d r1 = S0.C4802d.Tertiary     // Catch:{ NoSuchFieldError -> 0x015e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
            L_0x015e:
                S0.d r1 = S0.C4802d.TertiaryContainer     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                f11540a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.C4755u.c.<clinit>():void");
        }
    }

    public static final long a(C4753t tVar, long j10, float f10, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1610977682, i10, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:895)");
        }
        boolean booleanValue = ((Boolean) mVar.Q(f11537b)).booleanValue();
        if (C5747v0.q(j10, tVar.G()) && booleanValue) {
            j10 = l(tVar, f10);
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        return j10;
    }

    public static final long b(C4753t tVar, long j10) {
        return C5747v0.q(j10, tVar.B()) ? tVar.r() : C5747v0.q(j10, tVar.E()) ? tVar.t() : C5747v0.q(j10, tVar.Q()) ? tVar.x() : C5747v0.q(j10, tVar.a()) ? tVar.o() : C5747v0.q(j10, tVar.j()) ? tVar.p() : C5747v0.q(j10, tVar.C()) ? tVar.s() : C5747v0.q(j10, tVar.F()) ? tVar.u() : C5747v0.q(j10, tVar.R()) ? tVar.y() : C5747v0.q(j10, tVar.k()) ? tVar.q() : C5747v0.q(j10, tVar.n()) ? tVar.l() : C5747v0.q(j10, tVar.G()) ? tVar.v() : C5747v0.q(j10, tVar.P()) ? tVar.w() : C5747v0.q(j10, tVar.H()) ? tVar.v() : C5747v0.q(j10, tVar.I()) ? tVar.v() : C5747v0.q(j10, tVar.J()) ? tVar.v() : C5747v0.q(j10, tVar.K()) ? tVar.v() : C5747v0.q(j10, tVar.L()) ? tVar.v() : C5747v0.q(j10, tVar.M()) ? tVar.v() : C5747v0.f27350b.i();
    }

    public static final long c(long j10, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(509589638, i10, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:878)");
        }
        mVar.W(-1680936624);
        long b10 = b(X.f10101a.a(mVar, 6), j10);
        if (b10 == 16) {
            b10 = ((C5747v0) mVar.Q(E.a())).y();
        }
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        return b10;
    }

    public static final C4753t d(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new C4753t(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C4753t e(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        int i12 = i10;
        long t10 = (i12 & 1) != 0 ? C4800b.f12756a.t() : j10;
        return d(t10, (i12 & 2) != 0 ? C4800b.f12756a.j() : j11, (i12 & 4) != 0 ? C4800b.f12756a.u() : j12, (i12 & 8) != 0 ? C4800b.f12756a.k() : j13, (i12 & 16) != 0 ? C4800b.f12756a.e() : j14, (i12 & 32) != 0 ? C4800b.f12756a.w() : j15, (i12 & 64) != 0 ? C4800b.f12756a.l() : j16, (i12 & 128) != 0 ? C4800b.f12756a.x() : j17, (i12 & 256) != 0 ? C4800b.f12756a.m() : j18, (i12 & 512) != 0 ? C4800b.f12756a.H() : j19, (i12 & 1024) != 0 ? C4800b.f12756a.p() : j20, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? C4800b.f12756a.I() : j21, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? C4800b.f12756a.q() : j22, (i12 & 8192) != 0 ? C4800b.f12756a.a() : j23, (i12 & 16384) != 0 ? C4800b.f12756a.g() : j24, (i12 & 32768) != 0 ? C4800b.f12756a.y() : j25, (i12 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? C4800b.f12756a.n() : j26, (i12 & 131072) != 0 ? C4800b.f12756a.G() : j27, (i12 & 262144) != 0 ? C4800b.f12756a.o() : j28, (i12 & ImageMetadata.LENS_APERTURE) != 0 ? t10 : j29, (i12 & ImageMetadata.SHADING_MODE) != 0 ? C4800b.f12756a.f() : j30, (i12 & UploadKt.MAX_CHUNK_SIZE) != 0 ? C4800b.f12756a.d() : j31, (i12 & 4194304) != 0 ? C4800b.f12756a.b() : j32, (i12 & 8388608) != 0 ? C4800b.f12756a.h() : j33, (i12 & 16777216) != 0 ? C4800b.f12756a.c() : j34, (i12 & 33554432) != 0 ? C4800b.f12756a.i() : j35, (i12 & 67108864) != 0 ? C4800b.f12756a.r() : j36, (i12 & 134217728) != 0 ? C4800b.f12756a.s() : j37, (i12 & 268435456) != 0 ? C4800b.f12756a.v() : j38, (i12 & 536870912) != 0 ? C4800b.f12756a.z() : j39, (i12 & CatalogRepository.FETCH_FLAG_SDB) != 0 ? C4800b.f12756a.A() : j40, (i12 & Integer.MIN_VALUE) != 0 ? C4800b.f12756a.B() : j41, (i11 & 1) != 0 ? C4800b.f12756a.C() : j42, (i11 & 2) != 0 ? C4800b.f12756a.D() : j43, (i11 & 4) != 0 ? C4800b.f12756a.E() : j44, (i11 & 8) != 0 ? C4800b.f12756a.F() : j45);
    }

    public static final long f(C4753t tVar, C4802d dVar) {
        switch (c.f11540a[dVar.ordinal()]) {
            case 1:
                return tVar.a();
            case 2:
                return tVar.j();
            case 3:
                return tVar.k();
            case 4:
                return tVar.l();
            case 5:
                return tVar.m();
            case 6:
                return tVar.n();
            case 7:
                return tVar.o();
            case 8:
                return tVar.p();
            case 9:
                return tVar.q();
            case 10:
                return tVar.r();
            case 11:
                return tVar.s();
            case 12:
                return tVar.t();
            case 13:
                return tVar.u();
            case 14:
                return tVar.v();
            case 15:
                return tVar.w();
            case 16:
                return tVar.O();
            case 17:
                return tVar.x();
            case 18:
                return tVar.y();
            case 19:
                return tVar.z();
            case 20:
                return tVar.A();
            case 21:
                return tVar.B();
            case 22:
                return tVar.C();
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                return tVar.D();
            case BuildConfig.MIN_SDK_VERSION /*24*/:
                return tVar.E();
            case 25:
                return tVar.F();
            case 26:
                return tVar.G();
            case 27:
                return tVar.P();
            case 28:
                return tVar.H();
            case 29:
                return tVar.I();
            case 30:
                return tVar.J();
            case 31:
                return tVar.K();
            case 32:
                return tVar.L();
            case BuildConfig.TARGET_SDK_VERSION /*33*/:
                return tVar.M();
            case 34:
                return tVar.N();
            case ImageFormat.YUV_420_888 /*35*/:
                return tVar.Q();
            case 36:
                return tVar.R();
            default:
                return C5747v0.f27350b.i();
        }
    }

    public static final I0<C4753t> g() {
        return f11536a;
    }

    public static final I0<Boolean> h() {
        return f11537b;
    }

    public static final long i(C4802d dVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-810780884, i10, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1009)");
        }
        long f10 = f(X.f10101a.a(mVar, 6), dVar);
        if (C4895p.J()) {
            C4895p.R();
        }
        return f10;
    }

    public static final C4753t j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45) {
        return new C4753t(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j45, j40, j41, j42, j43, j44, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C4753t k(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, int i10, int i11, Object obj) {
        int i12 = i10;
        long t10 = (i12 & 1) != 0 ? C4801c.f12805a.t() : j10;
        return j(t10, (i12 & 2) != 0 ? C4801c.f12805a.j() : j11, (i12 & 4) != 0 ? C4801c.f12805a.u() : j12, (i12 & 8) != 0 ? C4801c.f12805a.k() : j13, (i12 & 16) != 0 ? C4801c.f12805a.e() : j14, (i12 & 32) != 0 ? C4801c.f12805a.w() : j15, (i12 & 64) != 0 ? C4801c.f12805a.l() : j16, (i12 & 128) != 0 ? C4801c.f12805a.x() : j17, (i12 & 256) != 0 ? C4801c.f12805a.m() : j18, (i12 & 512) != 0 ? C4801c.f12805a.H() : j19, (i12 & 1024) != 0 ? C4801c.f12805a.p() : j20, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? C4801c.f12805a.I() : j21, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? C4801c.f12805a.q() : j22, (i12 & 8192) != 0 ? C4801c.f12805a.a() : j23, (i12 & 16384) != 0 ? C4801c.f12805a.g() : j24, (i12 & 32768) != 0 ? C4801c.f12805a.y() : j25, (i12 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? C4801c.f12805a.n() : j26, (i12 & 131072) != 0 ? C4801c.f12805a.G() : j27, (i12 & 262144) != 0 ? C4801c.f12805a.o() : j28, (i12 & ImageMetadata.LENS_APERTURE) != 0 ? t10 : j29, (i12 & ImageMetadata.SHADING_MODE) != 0 ? C4801c.f12805a.f() : j30, (i12 & UploadKt.MAX_CHUNK_SIZE) != 0 ? C4801c.f12805a.d() : j31, (i12 & 4194304) != 0 ? C4801c.f12805a.b() : j32, (i12 & 8388608) != 0 ? C4801c.f12805a.h() : j33, (i12 & 16777216) != 0 ? C4801c.f12805a.c() : j34, (i12 & 33554432) != 0 ? C4801c.f12805a.i() : j35, (i12 & 67108864) != 0 ? C4801c.f12805a.r() : j36, (i12 & 134217728) != 0 ? C4801c.f12805a.s() : j37, (i12 & 268435456) != 0 ? C4801c.f12805a.v() : j38, (i12 & 536870912) != 0 ? C4801c.f12805a.z() : j39, (i12 & CatalogRepository.FETCH_FLAG_SDB) != 0 ? C4801c.f12805a.A() : j40, (i12 & Integer.MIN_VALUE) != 0 ? C4801c.f12805a.B() : j41, (i11 & 1) != 0 ? C4801c.f12805a.C() : j42, (i11 & 2) != 0 ? C4801c.f12805a.D() : j43, (i11 & 4) != 0 ? C4801c.f12805a.E() : j44, (i11 & 8) != 0 ? C4801c.f12805a.F() : j45);
    }

    public static final long l(C4753t tVar, float f10) {
        if (h.D(f10, h.B((float) 0))) {
            return tVar.G();
        }
        return C5751x0.h(C5747v0.o(tVar.O(), ((((float) Math.log((double) (f10 + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), tVar.G());
    }
}
