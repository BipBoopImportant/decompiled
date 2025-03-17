package WJ;

import QJ.P0;
import XH.C16820k;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LWJ/r;", "", "factories", "LQJ/P0;", "e", "(LWJ/r;Ljava/util/List;)LQJ/P0;", "", "c", "(LQJ/P0;)Z", "", "cause", "", "errorHint", "LWJ/u;", "a", "(Ljava/lang/Throwable;Ljava/lang/String;)LWJ/u;", "", "d", "()Ljava/lang/Void;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    private static final u a(Throwable th2, String str) {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new C16820k();
    }

    static /* synthetic */ u b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(P0 p02) {
        return p02.P0() instanceof u;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final P0 e(r rVar, List<? extends r> list) {
        try {
            return rVar.b(list);
        } catch (Throwable th2) {
            return a(th2, rVar.a());
        }
    }
}
