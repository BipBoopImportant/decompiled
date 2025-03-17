package Px;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPx/f;", "LPx/e;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {
    public String a() {
        String uuid = UUID.randomUUID().toString();
        C17542s.i(uuid, "toString(...)");
        return uuid;
    }
}
