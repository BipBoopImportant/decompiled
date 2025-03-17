package Jn;

import Fn.a;
import com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableItemLevelAvailabilityIndicationResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJn/o;", "Lpp/c;", "LFn/a$a;", "Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;", "LJn/m;", "itemResponseItemTypeMapper", "LJn/n;", "itemResponsePriceRemoteModelMapper", "LJn/j;", "feesRemoteModelMapper", "LJn/b;", "itemAvailabilityMapper", "<init>", "(LJn/m;LJn/n;LJn/j;LJn/b;)V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;)LFn/a$a;", "a", "LJn/m;", "LJn/n;", "c", "LJn/j;", "d", "LJn/b;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements C11769c<a.C1553a, ItemResponseRemoteModel> {

    /* renamed from: a  reason: collision with root package name */
    private final m f82654a;

    /* renamed from: b  reason: collision with root package name */
    private final n f82655b;

    /* renamed from: c  reason: collision with root package name */
    private final j f82656c;

    /* renamed from: d  reason: collision with root package name */
    private final b f82657d;

    public o(m mVar, n nVar, j jVar, b bVar) {
        C17542s.j(mVar, "itemResponseItemTypeMapper");
        C17542s.j(nVar, "itemResponsePriceRemoteModelMapper");
        C17542s.j(jVar, "feesRemoteModelMapper");
        C17542s.j(bVar, "itemAvailabilityMapper");
        this.f82654a = mVar;
        this.f82655b = nVar;
        this.f82656c = jVar;
        this.f82657d = bVar;
    }

    /* renamed from: b */
    public a.C1553a a(ItemResponseRemoteModel itemResponseRemoteModel) {
        C17542s.j(itemResponseRemoteModel, "remote");
        String e10 = itemResponseRemoteModel.e();
        String b10 = this.f82654a.a(itemResponseRemoteModel.f());
        int i10 = (int) itemResponseRemoteModel.i();
        n nVar = this.f82655b;
        NullableItemResponsePriceRemoteModel h10 = itemResponseRemoteModel.h();
        if (h10 != null) {
            a.c.e i11 = nVar.a(h10);
            NullableFeesRemoteModel c10 = itemResponseRemoteModel.c();
            List<a.c.b> b11 = c10 != null ? this.f82656c.a(c10) : null;
            NullableItemLevelAvailabilityIndicationResponseRemoteModel b12 = itemResponseRemoteModel.b();
            return new a.C1553a(e10, b10, i11, b11, i10, b12 != null ? this.f82657d.a(b12) : null);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
