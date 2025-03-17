package na;

import A2.a;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.sugarcube.core.logger.DslKt;
import ea.V;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final DecimalFormat f55152a;

    /* renamed from: b  reason: collision with root package name */
    private static final DecimalFormat f55153b;

    /* renamed from: c  reason: collision with root package name */
    private static final StringBuilder f55154c = new StringBuilder();

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f55155d = 0;

    static {
        Locale locale = Locale.ROOT;
        f55152a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f55153b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }

    public static StringBuilder a(Location location, StringBuilder sb2) {
        sb2.ensureCapacity(100);
        String str = null;
        if (location == null) {
            sb2.append((String) null);
            return sb2;
        }
        sb2.append("{");
        sb2.append(location.getProvider());
        sb2.append(", ");
        if (a.h(location)) {
            sb2.append("mock, ");
        }
        DecimalFormat decimalFormat = f55152a;
        sb2.append(decimalFormat.format(location.getLatitude()));
        sb2.append(",");
        sb2.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb2.append("±");
            sb2.append(f55153b.format((double) location.getAccuracy()));
            sb2.append(DslKt.INDICATOR_MAIN);
        }
        if (location.hasAltitude()) {
            sb2.append(", alt=");
            DecimalFormat decimalFormat2 = f55153b;
            sb2.append(decimalFormat2.format(location.getAltitude()));
            if (a.g(location)) {
                sb2.append("±");
                sb2.append(decimalFormat2.format((double) a.d(location)));
            }
            sb2.append(DslKt.INDICATOR_MAIN);
        }
        if (location.hasSpeed()) {
            sb2.append(", spd=");
            DecimalFormat decimalFormat3 = f55153b;
            sb2.append(decimalFormat3.format((double) location.getSpeed()));
            if (a.f(location)) {
                sb2.append("±");
                sb2.append(decimalFormat3.format((double) a.c(location)));
            }
            sb2.append("m/s");
        }
        if (location.hasBearing()) {
            sb2.append(", brg=");
            DecimalFormat decimalFormat4 = f55153b;
            sb2.append(decimalFormat4.format((double) location.getBearing()));
            if (a.e(location)) {
                sb2.append("±");
                sb2.append(decimalFormat4.format((double) a.a(location)));
            }
            sb2.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb2.append(", fl=");
            sb2.append(string);
        }
        Bundle extras2 = location.getExtras();
        if (extras2 != null) {
            str = extras2.getString("levelId");
        }
        if (str != null) {
            sb2.append(", lv=");
            sb2.append(str);
        }
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb2.append(", ert=");
        sb2.append(V.a(a.b(location) + currentTimeMillis));
        sb2.append('}');
        return sb2;
    }
}
