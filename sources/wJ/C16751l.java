package WJ;

import QJ.M;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "LXH/N;", "a", "(I)V", "LQJ/M;", "", "name", "b", "(LQJ/M;Ljava/lang/String;)LQJ/M;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.l  reason: case insensitive filesystem */
public final class C16751l {
    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
        }
    }

    public static final M b(M m10, String str) {
        return str != null ? new v(m10, str) : m10;
    }
}
