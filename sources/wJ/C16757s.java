package WJ;

import GJ.C15768k;
import QJ.P0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LWJ/s;", "", "<init>", "()V", "LQJ/P0;", "a", "()LQJ/P0;", "b", "LQJ/P0;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WJ.s  reason: case insensitive filesystem */
public final class C16757s {

    /* renamed from: a  reason: collision with root package name */
    public static final C16757s f139580a;

    /* renamed from: b  reason: collision with root package name */
    public static final P0 f139581b;

    static {
        C16757s sVar = new C16757s();
        f139580a = sVar;
        C16736E.f("kotlinx.coroutines.fast.service.loader", true);
        f139581b = sVar.a();
    }

    private C16757s() {
    }

    private final P0 a() {
        Object obj;
        Class<r> cls = r.class;
        try {
            List<T> a02 = C15768k.a0(C15768k.h(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator it = a02.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int c10 = ((r) obj).c();
                    do {
                        Object next = it.next();
                        int c11 = ((r) next).c();
                        if (c10 < c11) {
                            obj = next;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            }
            r rVar = (r) obj;
            if (rVar != null) {
                P0 e10 = t.e(rVar, a02);
                if (e10 != null) {
                    return e10;
                }
            }
            t.b((Throwable) null, (String) null, 3, (Object) null);
            return null;
        } catch (Throwable th2) {
            t.b(th2, (String) null, 2, (Object) null);
            return null;
        }
    }
}
