package Jn;

import Fn.a;
import com.ingka.ikea.app.caasremote.models.NullableHomeDeliveryAvailabilityRemoteModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJn/k;", "Lpp/c;", "LFn/a$c$c$a;", "Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryAvailabilityRemoteModel;", "<init>", "()V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableHomeDeliveryAvailabilityRemoteModel;)LFn/a$c$c$a;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements C11769c<a.c.C1557c.C1558a, NullableHomeDeliveryAvailabilityRemoteModel> {
    /* renamed from: b */
    public a.c.C1557c.C1558a a(NullableHomeDeliveryAvailabilityRemoteModel nullableHomeDeliveryAvailabilityRemoteModel) {
        C17542s.j(nullableHomeDeliveryAvailabilityRemoteModel, "remote");
        boolean b10 = nullableHomeDeliveryAvailabilityRemoteModel.b();
        Double c10 = nullableHomeDeliveryAvailabilityRemoteModel.c();
        double doubleValue = c10 != null ? c10.doubleValue() : 0.0d;
        Boolean d10 = nullableHomeDeliveryAvailabilityRemoteModel.d();
        return new a.c.C1557c.C1558a(b10, doubleValue, d10 != null ? d10.booleanValue() : false);
    }
}
