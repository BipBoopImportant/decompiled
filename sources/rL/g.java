package Rl;

import XH.t;
import fI.C17220a;
import fI.C17221b;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LRl/g;", "", "", "string", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "metricValue", "imperialValue", "j", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "Companion", "a", "METRIC", "IMPERIAL", "METRIC_IMPERIAL", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum g {
    METRIC("METRIC"),
    IMPERIAL("IMPERIAL"),
    METRIC_IMPERIAL("METRIC_IMPERIAL");
    
    public static final a Companion = null;
    private static final String MEASUREMENTS_FORMAT = "%s (%s)";
    /* access modifiers changed from: private */
    public static final HashMap<String, g> map = null;
    private final String string;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR3\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LRl/g$a;", "", "<init>", "()V", "", "value", "LRl/g;", "a", "(Ljava/lang/String;)LRl/g;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "Ljava/util/HashMap;", "b", "()Ljava/util/HashMap;", "MEASUREMENTS_FORMAT", "Ljava/lang/String;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(String str) {
            g gVar = b().get(str);
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalArgumentException("Value " + str + " not a valid MeasurementSystem.");
        }

        public final HashMap<String, g> b() {
            return g.map;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f86574a = null;

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
                f86574a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Rl.g.b.<clinit>():void");
        }
    }

    static {
        g[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        HashMap<String, g> hashMap = new HashMap<>();
        for (g gVar : m()) {
            hashMap.put(gVar.string, gVar);
        }
        map = hashMap;
    }

    private g(String str) {
        this.string = str;
    }

    public static C17220a<g> m() {
        return $ENTRIES;
    }

    public final String j(String str, String str2) {
        int i10 = b.f86574a[ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new t();
            } else if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                String format = String.format(MEASUREMENTS_FORMAT, Arrays.copyOf(new Object[]{str, str2}, 2));
                C17542s.i(format, "format(...)");
                return format;
            } else if (str != null && str.length() != 0) {
                return str;
            } else {
                if (str2 == null || str2.length() == 0) {
                    return null;
                }
            }
        }
        return str2;
    }

    public final String n() {
        return this.string;
    }
}
