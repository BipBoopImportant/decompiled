package ZB;

import HJ.C15854t;
import am.e;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import fC.C14445a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LZB/q;", "LfC/a;", "Lam/e;", "googleCompatibilityApi", "<init>", "(Lam/e;)V", "Lx4/o;", "navController", "", "storeId", "Lx4/C;", "navOptions", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Lx4/C;)V", "Lam/e;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements C14445a {

    /* renamed from: a  reason: collision with root package name */
    private final e f118318a;

    public q(e eVar) {
        C17542s.j(eVar, "googleCompatibilityApi");
        this.f118318a = eVar;
    }

    public void a(C8951o oVar, String str, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "storeId");
        C17542s.j(c10, "navOptions");
        if (!this.f118318a.a()) {
            IllegalStateException illegalStateException = new IllegalStateException("No google play on this device");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str3 == null) {
                    String name = q.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str3;
                bVar.a(eVar, str4, false, illegalStateException, str2);
                str3 = str4;
            }
            return;
        }
        Uri build = Uri.parse(c.b("ikea://navigation/store?storeId={storeId}")).buildUpon().appendQueryParameter("storeId", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }
}
