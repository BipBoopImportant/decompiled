package Jn;

import Fn.a;
import YH.C16877v;
import com.ingka.ikea.app.caasremote.models.MaterialPartRemoteModel;
import com.ingka.ikea.app.caasremote.models.MaterialRemoteModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LJn/r;", "Lpp/c;", "", "LFn/a$c$d;", "Lcom/ingka/ikea/app/caasremote/models/MaterialRemoteModel;", "<init>", "()V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/MaterialRemoteModel;)Ljava/util/List;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements C11769c<List<? extends a.c.d>, MaterialRemoteModel> {
    /* renamed from: b */
    public List<a.c.d> a(MaterialRemoteModel materialRemoteModel) {
        a.c.d dVar;
        C17542s.j(materialRemoteModel, "remote");
        List<MaterialPartRemoteModel> b10 = materialRemoteModel.b();
        if (b10 == null) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (MaterialPartRemoteModel materialPartRemoteModel : b10) {
            String a10 = materialPartRemoteModel.a();
            if (a10 != null) {
                String b11 = materialPartRemoteModel.b();
                if (b11 == null) {
                    b11 = materialRemoteModel.c();
                }
                dVar = new a.c.d(a10, b11);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public List<List<a.c.d>> c(List<MaterialRemoteModel> list) {
        return C11769c.a.a(this, list);
    }
}
