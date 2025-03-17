package Jn;

import Fn.a;
import HJ.C15854t;
import XH.u;
import com.ingka.ikea.app.caasremote.models.ProductTagRemoteModel;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJn/t;", "Lpp/c;", "LFn/a$c$f;", "Lcom/ingka/ikea/app/caasremote/models/ProductTagRemoteModel;", "<init>", "()V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/ProductTagRemoteModel;)LFn/a$c$f;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements C11769c<a.c.f, ProductTagRemoteModel> {
    /* renamed from: b */
    public a.c.f a(ProductTagRemoteModel productTagRemoteModel) {
        T t10;
        C17542s.j(productTagRemoteModel, "remote");
        Iterator<T> it = a.c.f.C1564a.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((a.c.f.C1564a) t10).name(), productTagRemoteModel.b().name())) {
                break;
            }
        }
        a.c.f.C1564a aVar = (a.c.f.C1564a) t10;
        if (aVar != null) {
            return new a.c.f(aVar, productTagRemoteModel.c(), productTagRemoteModel.d());
        }
        u uVar = new u("No mapping for " + productTagRemoteModel.b().name());
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
                String a10 = C11818a.a((String) null, uVar);
                if (a10 == null) {
                    return null;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = t.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, uVar, str3);
            str = str3;
            str2 = str4;
        }
        return null;
    }

    public List<a.c.f> c(List<ProductTagRemoteModel> list) {
        return C11769c.a.a(this, list);
    }
}
