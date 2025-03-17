package bm;

import am.i;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lbm/f;", "Lam/i;", "<init>", "()V", "Ljava/util/TimeZone;", "a", "()Ljava/util/TimeZone;", "current", "appservice-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bm.f  reason: case insensitive filesystem */
public final class C11109f implements i {
    public TimeZone a() {
        TimeZone timeZone = TimeZone.getDefault();
        C17542s.i(timeZone, "getDefault(...)");
        return timeZone;
    }
}
