package Jn;

import Fn.a;
import com.ingka.ikea.app.caasremote.models.NullableSalesLocationAisleAndBinRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableSalesLocationDepartmentRemoteModel;
import com.ingka.ikea.app.caasremote.models.SalesLocationRemoteModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"LJn/q;", "Lpp/c;", "LFn/a$c$c$b$d;", "Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel;", "LJn/a;", "aisleAndBinMapper", "LJn/g;", "departmentMapper", "<init>", "(LJn/a;LJn/g;)V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/SalesLocationRemoteModel;)LFn/a$c$c$b$d;", "a", "LJn/a;", "LJn/g;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements C11769c<a.c.C1557c.b.d, SalesLocationRemoteModel> {

    /* renamed from: a  reason: collision with root package name */
    private final a f82662a;

    /* renamed from: b  reason: collision with root package name */
    private final g f82663b;

    public q(a aVar, g gVar) {
        C17542s.j(aVar, "aisleAndBinMapper");
        C17542s.j(gVar, "departmentMapper");
        this.f82662a = aVar;
        this.f82663b = gVar;
    }

    /* renamed from: b */
    public a.c.C1557c.b.d a(SalesLocationRemoteModel salesLocationRemoteModel) {
        C17542s.j(salesLocationRemoteModel, "remote");
        boolean c10 = salesLocationRemoteModel.c();
        NullableSalesLocationAisleAndBinRemoteModel a10 = salesLocationRemoteModel.a();
        a.c.C1557c.b.C1561c cVar = null;
        a.c.C1557c.b.C1559a a11 = a10 != null ? this.f82662a.a(a10.a(), a10.b()) : null;
        NullableSalesLocationDepartmentRemoteModel b10 = salesLocationRemoteModel.b();
        if (b10 != null) {
            cVar = this.f82663b.a(b10.a(), b10.b());
        }
        return new a.c.C1557c.b.d(c10, a11, cVar);
    }

    public List<a.c.C1557c.b.d> c(List<SalesLocationRemoteModel> list) {
        return C11769c.a.a(this, list);
    }
}
