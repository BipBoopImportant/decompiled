package ap;

import IC.C13023e;
import IC.C13026h;
import XH.t;
import YH.C16877v;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001$B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lap/e;", "Lap/d;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "", "meters", "LIC/e;", "h", "(D)LIC/e;", "", "decimals", "g", "(DI)LIC/e;", "unitLabel", "value", "e", "(IDI)LIC/e;", "unitMetricLabel", "valueMetric", "unitImperialLabel", "valueImperial", "numberOfDecimals", "c", "(IDIDI)LIC/e;", "j", "(D)D", "i", "k", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "from", "to", "b", "(Lcom/ingka/ikea/appconfig/model/LocationLatLng;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)D", "thresholdMeters", "a", "LIl/a;", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f90373b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f90374c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f90375a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lap/e$a;", "", "<init>", "()V", "", "EARTH_RADIUS_IN_METERS", "I", "", "METERS_TO_FEET_FACTOR", "D", "METERS_TO_MILES_FACTOR", "METERS_TO_KILOMETERS_FACTOR", "ONE_DECIMAL_THRESHOLD_METERS", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f90376a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Rl.g[] r0 = Rl.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Rl.g r1 = Rl.g.METRIC     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Rl.g r1 = Rl.g.IMPERIAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Rl.g r1 = Rl.g.METRIC_IMPERIAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f90376a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ap.e.b.<clinit>():void");
        }
    }

    public e(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f90375a = aVar;
    }

    private final C13023e c(int i10, double d10, int i11, double d11, int i12) {
        String str = "%." + i12 + "f";
        V v10 = V.f144353a;
        String format = String.format(this.f90375a.A(), str, Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
        C17542s.i(format, "format(...)");
        String format2 = String.format(this.f90375a.A(), str, Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
        C17542s.i(format2, "format(...)");
        return C13026h.e(Oo.b.f84756q2, C16877v.e(C13026h.e(Oo.b.f84412J4, C16877v.q(C13026h.b(i10, format), C13026h.b(i11, format2)))));
    }

    static /* synthetic */ C13023e d(e eVar, int i10, double d10, int i11, double d11, int i12, int i13, Object obj) {
        return eVar.c(i10, d10, i11, d11, (i13 & 16) != 0 ? 0 : i12);
    }

    private final C13023e e(int i10, double d10, int i11) {
        V v10 = V.f144353a;
        String format = String.format(this.f90375a.A(), "%." + i11 + "f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
        C17542s.i(format, "format(...)");
        return C13026h.e(Oo.b.f84756q2, C16877v.e(C13026h.b(i10, format)));
    }

    static /* synthetic */ C13023e f(e eVar, int i10, double d10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return eVar.e(i10, d10, i11);
    }

    private final C13023e g(double d10, int i10) {
        int i11 = b.f90376a[this.f90375a.u().ordinal()];
        if (i11 == 1) {
            return e(Oo.b.f84637f4, j(d10), i10);
        }
        if (i11 == 2) {
            return e(Oo.b.f84422K4, k(d10), i10);
        }
        if (i11 == 3) {
            return c(Oo.b.f84637f4, j(d10), Oo.b.f84422K4, k(d10), i10);
        }
        throw new t();
    }

    private final C13023e h(double d10) {
        int i10 = b.f90376a[this.f90375a.u().ordinal()];
        if (i10 == 1) {
            return f(this, Oo.b.f84402I4, d10, 0, 4, (Object) null);
        } else if (i10 == 2) {
            return f(this, Oo.b.f84724n3, i(d10), 0, 4, (Object) null);
        } else if (i10 == 3) {
            return d(this, Oo.b.f84402I4, d10, Oo.b.f84724n3, i(d10), 0, 16, (Object) null);
        } else {
            throw new t();
        }
    }

    private final double i(double d10) {
        return d10 * 3.28084d;
    }

    private final double j(double d10) {
        return d10 / ((double) 1000);
    }

    private final double k(double d10) {
        return d10 / 1609.344d;
    }

    public C13023e a(double d10, int i10) {
        return d10 < ((double) i10) ? h(d10) : d10 < 10000.0d ? g(d10, 1) : g(d10, 0);
    }

    public double b(LocationLatLng locationLatLng, LocationLatLng locationLatLng2) {
        C17542s.j(locationLatLng, "from");
        C17542s.j(locationLatLng2, "to");
        double radians = Math.toRadians(locationLatLng2.a() - locationLatLng.a());
        double radians2 = Math.toRadians(locationLatLng2.b() - locationLatLng.b());
        double d10 = (double) 2;
        double pow = Math.pow(Math.sin(radians / d10), 2.0d) + (Math.cos(Math.toRadians(locationLatLng.a())) * Math.cos(Math.toRadians(locationLatLng2.a())) * Math.pow(Math.sin(radians2 / d10), 2.0d));
        return ((double) 6371000) * d10 * Math.atan2(Math.sqrt(pow), Math.sqrt(((double) 1) - pow));
    }
}
