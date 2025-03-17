package Jn;

import Fn.a;
import YH.C16877v;
import com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LJn/j;", "Lpp/c;", "", "LFn/a$c$b;", "Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;", "<init>", "()V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;)Ljava/util/List;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements C11769c<List<? extends a.c.b>, NullableFeesRemoteModel> {
    /* renamed from: b */
    public List<a.c.b> a(NullableFeesRemoteModel nullableFeesRemoteModel) {
        C17542s.j(nullableFeesRemoteModel, "remote");
        Double a10 = nullableFeesRemoteModel.a();
        Double b10 = nullableFeesRemoteModel.b();
        List c10 = C16877v.c();
        if (a10 != null) {
            c10.add(new a.c.b(a.c.b.C1556a.ECO, a10.doubleValue()));
        }
        if (b10 != null) {
            c10.add(new a.c.b(a.c.b.C1556a.WEEE, b10.doubleValue()));
        }
        return C16877v.a(c10);
    }
}
