package JH;

import QJ.F0;
import QJ.N;
import QJ.b1;
import dI.C17160a;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LQJ/F0;", "parent", "LdI/i;", "a", "(LQJ/F0;)LdI/i;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"JH/n$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends C17160a implements N {
        public a(N.a aVar) {
            super(aVar);
        }

        public void handleException(C17168i iVar, Throwable th2) {
        }
    }

    public static final C17168i a(F0 f02) {
        return b1.a(f02).plus(new a(N.f137593c0));
    }

    public static /* synthetic */ C17168i b(F0 f02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f02 = null;
        }
        return a(f02);
    }
}
