package tn;

import HJ.C15854t;
import com.ingka.ikea.browseandsearch.plp.datalayer.model.InjectablePriority;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/model/InjectablePriority;", "b", "(Ljava/lang/String;)Lcom/ingka/ikea/browseandsearch/plp/datalayer/model/InjectablePriority;", "datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: tn.a  reason: case insensitive filesystem */
public final class C11926a {
    /* access modifiers changed from: private */
    public static final InjectablePriority b(String str) {
        T t10;
        Iterator<T> it = InjectablePriority.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((InjectablePriority) t10).name(), str)) {
                break;
            }
        }
        InjectablePriority injectablePriority = (InjectablePriority) t10;
        if (injectablePriority != null) {
            return injectablePriority;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid priority type: " + str);
        e eVar = e.ERROR;
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
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    return null;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = str.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalArgumentException, str4);
            str2 = str4;
            str3 = str5;
        }
        return null;
    }
}
