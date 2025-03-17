package QJ;

import WJ.C16747h;
import XH.x;
import XH.y;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"LdI/e;", "", "c", "(LdI/e;)Ljava/lang/String;", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class V {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(C17164e<?> eVar) {
        Object obj;
        if (eVar instanceof C16747h) {
            return ((C16747h) eVar).toString();
        }
        try {
            x.a aVar = x.f139812b;
            obj = x.b(eVar + '@' + b(eVar));
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        Throwable e10 = x.e(obj);
        String str = obj;
        if (e10 != null) {
            str = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) str;
    }
}
