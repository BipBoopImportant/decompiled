package fp;

import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/time/LocalDateTime;", "startTime", "endTime", "", "a", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Z", "core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fp.a  reason: case insensitive filesystem */
public final class C11279a {
    public static final boolean a(LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3) {
        C17542s.j(localDateTime, "<this>");
        C17542s.j(localDateTime2, "startTime");
        C17542s.j(localDateTime3, "endTime");
        return !localDateTime.isBefore(localDateTime2) && !localDateTime.isAfter(localDateTime3);
    }
}
