package QJ;

import XH.x;
import XH.y;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "LXH/x;", "", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "LQJ/n;", "caller", "c", "(Ljava/lang/Object;LQJ/n;)Ljava/lang/Object;", "state", "LdI/e;", "uCont", "a", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.E  reason: case insensitive filesystem */
public final class C16287E {
    public static final <T> Object a(Object obj, C17164e<? super T> eVar) {
        if (!(obj instanceof C16285C)) {
            return x.b(obj);
        }
        x.a aVar = x.f139812b;
        return x.b(y.a(((C16285C) obj).f137555a));
    }

    public static final <T> Object b(Object obj) {
        Throwable e10 = x.e(obj);
        return e10 == null ? obj : new C16285C(e10, false, 2, (DefaultConstructorMarker) null);
    }

    public static final <T> Object c(Object obj, C16320n<?> nVar) {
        Throwable e10 = x.e(obj);
        return e10 == null ? obj : new C16285C(e10, false, 2, (DefaultConstructorMarker) null);
    }
}
