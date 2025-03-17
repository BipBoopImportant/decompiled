package JF;

import android.text.format.DateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/time/Instant;", "Ljava/util/Locale;", "locale", "", "a", "(Ljava/time/Instant;Ljava/util/Locale;)Ljava/lang/String;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: JF.G  reason: case insensitive filesystem */
public final class C13085G {
    public static final String a(Instant instant, Locale locale) {
        C17542s.j(instant, "<this>");
        C17542s.j(locale, "locale");
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, "dd MMM yyyy");
        C17542s.i(bestDateTimePattern, "getBestDateTimePattern(...)");
        String format = DateTimeFormatter.ofPattern(bestDateTimePattern, locale).withZone(ZoneId.systemDefault()).format(instant);
        C17542s.i(format, "format(...)");
        return format;
    }
}
