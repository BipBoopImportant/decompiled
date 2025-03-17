package Ll;

import HJ.C15854t;
import Yz.b;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import gK.C17294a;
import jK.C17446c0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLl/f;", "", "<init>", "()V", "", "json", "", "b", "(Ljava/lang/String;)Ljava/util/Map;", "map", "a", "(Ljava/util/Map;)Ljava/lang/String;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {
    public final String a(Map<String, String> map) {
        C17542s.j(map, "map");
        C17514c b10 = b.f118278a.b();
        b10.a();
        Y0 y02 = Y0.f144077a;
        return b10.b(new C17446c0(y02, y02), map);
    }

    public final Map<String, String> b(String str) {
        Object obj;
        C17542s.j(str, FeatureVariable.JSON_TYPE);
        try {
            C17514c b10 = b.f118278a.b();
            b10.a();
            Y0 y02 = Y0.f144077a;
            obj = b10.c(C17294a.u(new C17446c0(y02, y02)), str);
        } catch (Exception e10) {
            e eVar = e.WARN;
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
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Error deserializing json";
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
            obj = null;
        }
        return (Map) obj;
    }
}
