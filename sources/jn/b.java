package Jn;

import Fn.a;
import com.ingka.ikea.app.caasremote.models.NullableHomeDeliveryAvailabilityRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableStoreAvailabilityRemoteModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJn/b;", "Lpp/c;", "LFn/a$c$c;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemLevelAvailabilityIndicationResponseRemoteModel;", "LJn/u;", "storeAvailabilityMapper", "LJn/k;", "homeDeliveryAvailabilityMapper", "LJn/q;", "salesLocationMapper", "LJn/f;", "childItemsSalesLocationsMapper", "<init>", "(LJn/u;LJn/k;LJn/q;LJn/f;)V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemLevelAvailabilityIndicationResponseRemoteModel;)LFn/a$c$c;", "a", "LJn/u;", "LJn/k;", "c", "LJn/q;", "d", "LJn/f;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11769c<a.c.C1557c, NullableItemLevelAvailabilityIndicationResponseRemoteModel> {

    /* renamed from: a  reason: collision with root package name */
    private final u f82627a;

    /* renamed from: b  reason: collision with root package name */
    private final k f82628b;

    /* renamed from: c  reason: collision with root package name */
    private final q f82629c;

    /* renamed from: d  reason: collision with root package name */
    private final f f82630d;

    public b(u uVar, k kVar, q qVar, f fVar) {
        C17542s.j(uVar, "storeAvailabilityMapper");
        C17542s.j(kVar, "homeDeliveryAvailabilityMapper");
        C17542s.j(qVar, "salesLocationMapper");
        C17542s.j(fVar, "childItemsSalesLocationsMapper");
        this.f82627a = uVar;
        this.f82628b = kVar;
        this.f82629c = qVar;
        this.f82630d = fVar;
    }

    /* renamed from: b */
    public a.c.C1557c a(NullableItemLevelAvailabilityIndicationResponseRemoteModel nullableItemLevelAvailabilityIndicationResponseRemoteModel) {
        C17542s.j(nullableItemLevelAvailabilityIndicationResponseRemoteModel, "remote");
        NullableStoreAvailabilityRemoteModel e10 = nullableItemLevelAvailabilityIndicationResponseRemoteModel.e();
        a.c.C1557c.C1558a aVar = null;
        a.c.C1557c.C1562c b10 = e10 != null ? this.f82627a.a(e10) : null;
        NullableHomeDeliveryAvailabilityRemoteModel c10 = nullableItemLevelAvailabilityIndicationResponseRemoteModel.c();
        if (c10 != null) {
            aVar = this.f82628b.a(c10);
        }
        return new a.c.C1557c(aVar, b10, this.f82629c.c(nullableItemLevelAvailabilityIndicationResponseRemoteModel.d()), this.f82630d.c(nullableItemLevelAvailabilityIndicationResponseRemoteModel.b()));
    }
}
