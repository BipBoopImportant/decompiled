package sh;

import GK.C15776D;
import GK.C15804w;
import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sf.C10242c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsh/c;", "LGK/w;", "Lsf/c;", "userDataRepository", "<init>", "(Lsf/c;)V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "Lsf/c;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sh.c  reason: case insensitive filesystem */
public final class C10247c implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    private final C10242c f76555a;

    public C10247c(C10242c cVar) {
        C17542s.j(cVar, "userDataRepository");
        this.f76555a = cVar;
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        String vVar = aVar.t().k().toString();
        if (!C15854t.d0(vVar, "%7Bcc%7D", false, 2, (Object) null) && !C15854t.d0(vVar, "%7Blc%7D", false, 2, (Object) null)) {
            return aVar.b(aVar.t());
        }
        String c10 = this.f76555a.c();
        String a10 = this.f76555a.a();
        if (c10 != null && c10.length() != 0 && a10 != null && a10.length() != 0) {
            return aVar.b(aVar.t().i().n(C15854t.S(C15854t.S(vVar, "%7Bcc%7D", c10, false, 4, (Object) null), "%7Blc%7D", a10, false, 4, (Object) null)).b());
        }
        e eVar = e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a11 = C11818a.a("Unable to execute request, no market set", (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str = C11820c.a(a11);
            }
            if (str2 == null) {
                String name = C10247c.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            bVar.a(eVar, str2, false, (Throwable) null, str);
        }
        throw new IOException("No market/language set.");
    }
}
