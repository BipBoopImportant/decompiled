package j7;

import HJ.C15846l;
import HJ.C15850p;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"", "Ljava/time/Instant;", "a", "(Ljava/lang/String;)Ljava/time/Instant;", "LHJ/p;", "LHJ/p;", "Rfc3339Pattern", "certificatetransparency"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final C15850p f54067a = new C15850p("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");

    public static final Instant a(String str) {
        LocalTime localTime;
        C17542s.j(str, "<this>");
        C15846l h10 = f54067a.h(str);
        if (h10 != null) {
            int i10 = 1;
            LocalDate of2 = LocalDate.of(Integer.parseInt(h10.b().get(1)), Integer.parseInt(h10.b().get(2)), Integer.parseInt(h10.b().get(3)));
            int i11 = 0;
            boolean z10 = h10.b().get(4).length() > 0;
            String str2 = h10.b().get(9);
            boolean z11 = str2.length() > 0;
            if (!z11 || z10) {
                if (z10) {
                    int parseInt = Integer.parseInt(h10.b().get(5));
                    int parseInt2 = Integer.parseInt(h10.b().get(6));
                    int parseInt3 = Integer.parseInt(h10.b().get(7));
                    CharSequence charSequence = h10.b().get(8);
                    if (charSequence.length() == 0) {
                        charSequence = ".000";
                    }
                    String substring = ((String) charSequence).substring(1);
                    C17542s.i(substring, "substring(...)");
                    localTime = LocalTime.of(parseInt, parseInt2, parseInt3, ((int) (Double.parseDouble(substring) / Math.pow(10.0d, (double) (substring.length() - 3)))) * 1000000);
                } else {
                    localTime = LocalTime.MIN;
                }
                if (z11 && Character.toUpperCase(str2.charAt(0)) != 'Z') {
                    int parseInt4 = (Integer.parseInt(h10.b().get(11)) * 60) + Integer.parseInt(h10.b().get(12));
                    if (h10.b().get(10).charAt(0) == '-') {
                        i10 = -1;
                    }
                    i11 = parseInt4 * i10;
                }
                Instant minus = of2.atTime(localTime).toInstant(ZoneOffset.UTC).minus(Duration.ofMinutes((long) i11));
                C17542s.i(minus, "minus(...)");
                return minus;
            }
            throw new NumberFormatException("Invalid RFC33339 date/time format, cannot specify time zone shift without specifying time: " + str);
        }
        throw new NumberFormatException("Invalid RFC3339 date/time format: " + str);
    }
}
