package Px;

import HJ.C15854t;
import com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;", "", "b", "(Lcom/ingka/ikea/pushnotification/analytics/implementation/data/model/PushAnalyticPostData;)Z", "pushnotification-analytics-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* access modifiers changed from: private */
    public static final boolean b(PushAnalyticPostData pushAnalyticPostData) {
        boolean z10 = !C15854t.v0(pushAnalyticPostData.d()) && !C15854t.v0(pushAnalyticPostData.e()) && !C15854t.v0(pushAnalyticPostData.g()) && !C15854t.v0(pushAnalyticPostData.j()) && !C15854t.v0(pushAnalyticPostData.c()) && !C15854t.v0(pushAnalyticPostData.f()) && !C15854t.v0(pushAnalyticPostData.i()) && !C15854t.v0(pushAnalyticPostData.k()) && !C15854t.v0(pushAnalyticPostData.h()) && !C15854t.v0(pushAnalyticPostData.b());
        if (!z10) {
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Push notification analytics event data is invalid. " + pushAnalyticPostData, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = PushAnalyticPostData.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
        }
        return z10;
    }
}
