package ea;

import com.sugarcube.core.logger.DslKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f50938a;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f50939b;

    /* renamed from: c  reason: collision with root package name */
    private static final StringBuilder f50940c = new StringBuilder(33);

    static {
        Locale locale = Locale.ROOT;
        f50938a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f50939b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
    }

    public static String a(long j10) {
        return j10 >= 0 ? f50938a.format(new Date(j10)) : Long.toString(j10);
    }

    public static String b(long j10) {
        String sb2;
        StringBuilder sb3 = f50940c;
        synchronized (sb3) {
            sb3.setLength(0);
            c(j10, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public static StringBuilder c(long j10, StringBuilder sb2) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            sb2.append("0s");
            return sb2;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (i10 < 0) {
            sb2.append("-");
            if (j10 != Long.MIN_VALUE) {
                j10 = -j10;
            } else {
                j10 = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j10 >= 86400000) {
            sb2.append(j10 / 86400000);
            sb2.append("d");
            j10 %= 86400000;
        }
        if (true == z10) {
            j10 = 25975808;
        }
        if (j10 >= 3600000) {
            sb2.append(j10 / 3600000);
            sb2.append("h");
            j10 %= 3600000;
        }
        if (j10 >= 60000) {
            sb2.append(j10 / 60000);
            sb2.append(DslKt.INDICATOR_MAIN);
            j10 %= 60000;
        }
        if (j10 >= 1000) {
            sb2.append(j10 / 1000);
            sb2.append("s");
            j10 %= 1000;
        }
        if (j10 > 0) {
            sb2.append(j10);
            sb2.append("ms");
        }
        return sb2;
    }
}
