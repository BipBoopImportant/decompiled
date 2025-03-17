package QJ;

import WJ.C16735D;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006*\u001e\b\u0002\u0010\f\u001a\u0004\b\u0000\u0010\n\"\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0012\u0004\u0012\u00028\u00000\u000b¨\u0006\r"}, d2 = {"", "timeMillis", "c", "(J)J", "LWJ/D;", "a", "LWJ/D;", "DISPOSED_TASK", "b", "CLOSED_EMPTY", "T", "LWJ/q;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.s0  reason: case insensitive filesystem */
public final class C16330s0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16735D f137681a = new C16735D("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C16735D f137682b = new C16735D("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
