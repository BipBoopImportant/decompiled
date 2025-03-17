package t5;

import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/time/Duration;", "", "a", "(Ljava/time/Duration;)J", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.f  reason: case insensitive filesystem */
public final class C8811f {
    public static final long a(Duration duration) {
        C17542s.j(duration, "<this>");
        return duration.toMillis();
    }
}
