package LH;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"", "timestamp", "LLH/b;", "a", "(Ljava/lang/Long;)LLH/b;", "Ljava/util/Calendar;", "c", "(Ljava/util/Calendar;Ljava/lang/Long;)LLH/b;", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "Ljava/util/TimeZone;", "GMT_TIMEZONE", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: LH.a  reason: case insensitive filesystem */
public final class C16011a {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeZone f136077a = TimeZone.getTimeZone("GMT");

    public static final C16012b a(Long l10) {
        Calendar instance = Calendar.getInstance(f136077a, Locale.ROOT);
        C17542s.g(instance);
        return c(instance, l10);
    }

    public static /* synthetic */ C16012b b(Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return a(l10);
    }

    public static final C16012b c(Calendar calendar, Long l10) {
        C17542s.j(calendar, "<this>");
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        int i10 = calendar.get(15) + calendar.get(16);
        return new C16012b(calendar.get(13), calendar.get(12), calendar.get(11), d.Companion.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), C16013c.Companion.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + ((long) i10));
    }
}
