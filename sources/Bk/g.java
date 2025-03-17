package bK;

import WJ.C16735D;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"", "locked", "LbK/a;", "a", "(Z)LbK/a;", "LWJ/D;", "LWJ/D;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16735D f141205a = new C16735D("NO_OWNER");

    /* renamed from: b  reason: collision with root package name */
    private static final C16735D f141206b = new C16735D("ALREADY_LOCKED_BY_OWNER");

    public static final C17052a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ C17052a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
