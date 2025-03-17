package Jn;

import Il.a;
import YH.C16877v;
import com.ingka.ikea.app.caasremote.models.MeasurementRemoteModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u0004\u0018\u00010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LJn/s;", "Lpp/c;", "", "", "Lcom/ingka/ikea/app/caasremote/models/MeasurementRemoteModel;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "remote", "b", "(Ljava/util/List;)Ljava/lang/String;", "a", "LIl/a;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements C11769c<String, List<? extends MeasurementRemoteModel>> {

    /* renamed from: a  reason: collision with root package name */
    private final a f82664a;

    public s(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f82664a = aVar;
    }

    /* renamed from: b */
    public String a(List<MeasurementRemoteModel> list) {
        C17542s.j(list, "remote");
        MeasurementRemoteModel measurementRemoteModel = (MeasurementRemoteModel) C16877v.y0(list);
        if (measurementRemoteModel != null) {
            return this.f82664a.u().j(measurementRemoteModel.b(), measurementRemoteModel.a());
        }
        return null;
    }
}
