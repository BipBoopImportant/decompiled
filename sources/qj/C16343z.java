package QJ;

import XH.x;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "LQJ/x;", "LXH/x;", "result", "", "c", "(LQJ/x;Ljava/lang/Object;)Z", "LQJ/F0;", "parent", "a", "(LQJ/F0;)LQJ/x;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.z  reason: case insensitive filesystem */
public final class C16343z {
    public static final <T> C16339x<T> a(F0 f02) {
        return new C16341y(f02);
    }

    public static /* synthetic */ C16339x b(F0 f02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f02 = null;
        }
        return a(f02);
    }

    public static final <T> boolean c(C16339x<T> xVar, Object obj) {
        Throwable e10 = x.e(obj);
        return e10 == null ? xVar.J(obj) : xVar.g(e10);
    }
}
