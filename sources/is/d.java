package Is;

import HJ.C15854t;
import Ps.g;
import YH.X;
import Yz.b;
import com.sugarcube.core.logger.DslKt;
import fK.q;
import gK.C17294a;
import java.util.ArrayList;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LIs/d;", "", "<init>", "()V", "", "value", "LPs/g;", "d", "(Ljava/lang/String;)LPs/g;", "source", "a", "(LPs/g;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)Ljava/util/Map;", "b", "(Ljava/util/Map;)Ljava/lang/String;", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {
    public final String a(g gVar) {
        C17542s.j(gVar, "source");
        return gVar.j();
    }

    public final String b(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        C17514c b10 = b.f118278a.b();
        V v10 = V.f144353a;
        return b10.b(C17294a.k(C17294a.K(v10), C17294a.K(v10)), map);
    }

    public final Map<String, String> c(String str) {
        C17542s.j(str, "value");
        try {
            C17514c b10 = b.f118278a.b();
            V v10 = V.f144353a;
            return (Map) b10.c(C17294a.k(C17294a.K(v10), C17294a.K(v10)), str);
        } catch (q e10) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
            return X.j();
        }
    }

    public final g d(String str) {
        C17542s.j(str, "value");
        return g.Companion.a(str);
    }
}
