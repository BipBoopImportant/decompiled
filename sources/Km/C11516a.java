package km;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import jm.C11429a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import ug.C10272a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkm/a;", "Ljm/a;", "Lug/a;", "debugFeatures", "", "baseUrl", "<init>", "(Lug/a;Ljava/lang/String;)V", "LXH/N;", "b", "(Lug/a;)V", "a", "Ljava/lang/String;", "value", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "servicesBaseUrl", "backendconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: km.a  reason: case insensitive filesystem */
public final class C11516a implements C11429a {

    /* renamed from: a  reason: collision with root package name */
    private final String f98973a;

    /* renamed from: b  reason: collision with root package name */
    private String f98974b;

    public C11516a(C10272a aVar, String str) {
        C17542s.j(aVar, "debugFeatures");
        C17542s.j(str, "baseUrl");
        this.f98973a = str;
        this.f98974b = str;
        b(aVar);
    }

    private final void b(C10272a aVar) {
        String str;
        String a10 = aVar.a();
        if (a10 != null) {
            c(a10);
            String simpleName = C11516a.class.getSimpleName();
            C17542s.i(simpleName, "getSimpleName(...)");
            e eVar = e.DEBUG;
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
                    String a11 = C11818a.a("BackendUrl is " + a10, (Throwable) null);
                    if (a11 != null) {
                        str2 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + simpleName;
                } else {
                    str = str3;
                }
                bVar.a(eVar, str, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str;
            }
        }
    }

    public String a() {
        return this.f98974b;
    }

    public void c(String str) {
        C17542s.j(str, "value");
        throw new IllegalStateException("Not allowed to change base url for release builds");
    }
}
