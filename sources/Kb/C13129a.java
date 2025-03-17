package KB;

import GB.C12916a;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LGB/a;", "Ljava/time/format/DateTimeFormatter;", "timeFormatter", "", "a", "(LGB/a;Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;", "store-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: KB.a  reason: case insensitive filesystem */
public final class C13129a {
    public static final String a(C12916a aVar, DateTimeFormatter dateTimeFormatter) {
        C17542s.j(aVar, "<this>");
        C17542s.j(dateTimeFormatter, "timeFormatter");
        String str = null;
        if (aVar.d() == null || aVar.a() == null) {
            return null;
        }
        if (aVar.e() == null || aVar.b() == null) {
            LocalDateTime d10 = aVar.d();
            if (d10 != null) {
                return d10.format(dateTimeFormatter);
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        LocalDateTime d11 = aVar.d();
        sb2.append(d11 != null ? d11.format(dateTimeFormatter) : null);
        sb2.append(" - ");
        LocalDateTime a10 = aVar.a();
        sb2.append(a10 != null ? a10.format(dateTimeFormatter) : null);
        sb2.append(", ");
        LocalDateTime e10 = aVar.e();
        sb2.append(e10 != null ? e10.format(dateTimeFormatter) : null);
        sb2.append(" - ");
        LocalDateTime b10 = aVar.b();
        if (b10 != null) {
            str = b10.format(dateTimeFormatter);
        }
        sb2.append(str);
        return sb2.toString();
    }
}
