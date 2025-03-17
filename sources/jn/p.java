package Jn;

import Fn.a;
import com.ingka.ikea.app.caasremote.models.ItemResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LJn/p;", "Lpp/c;", "LFn/a$b;", "Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;", "LJn/l;", "itemInfoResponseRemoteModelMapper", "LJn/j;", "feesRemoteModelMapper", "LJn/m;", "itemResponseItemTypeMapper", "LJn/n;", "itemResponsePriceRemoteModelMapper", "<init>", "(LJn/l;LJn/j;LJn/m;LJn/n;)V", "remote", "b", "(Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;)LFn/a$b;", "a", "LJn/l;", "LJn/j;", "c", "LJn/m;", "d", "LJn/n;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements C11769c<a.b, ItemResponseRemoteModel> {

    /* renamed from: a  reason: collision with root package name */
    private final l f82658a;

    /* renamed from: b  reason: collision with root package name */
    private final j f82659b;

    /* renamed from: c  reason: collision with root package name */
    private final m f82660c;

    /* renamed from: d  reason: collision with root package name */
    private final n f82661d;

    public p(l lVar, j jVar, m mVar, n nVar) {
        C17542s.j(lVar, "itemInfoResponseRemoteModelMapper");
        C17542s.j(jVar, "feesRemoteModelMapper");
        C17542s.j(mVar, "itemResponseItemTypeMapper");
        C17542s.j(nVar, "itemResponsePriceRemoteModelMapper");
        this.f82658a = lVar;
        this.f82659b = jVar;
        this.f82660c = mVar;
        this.f82661d = nVar;
    }

    /* renamed from: b */
    public a.b a(ItemResponseRemoteModel itemResponseRemoteModel) {
        C17542s.j(itemResponseRemoteModel, "remote");
        NullableItemResponsePriceRemoteModel h10 = itemResponseRemoteModel.h();
        if (h10 != null) {
            NullableItemInfoResponseRemoteModel d10 = itemResponseRemoteModel.d();
            if (d10 != null) {
                NullableFeesRemoteModel c10 = itemResponseRemoteModel.c();
                Integer num = null;
                List<a.c.b> b10 = c10 != null ? this.f82659b.a(c10) : null;
                String e10 = itemResponseRemoteModel.e();
                String b11 = this.f82660c.a(itemResponseRemoteModel.f());
                int i10 = (int) itemResponseRemoteModel.i();
                Float g10 = itemResponseRemoteModel.g();
                if (g10 != null) {
                    num = Integer.valueOf((int) g10.floatValue());
                }
                return new a.b(e10, b11, i10, this.f82661d.a(h10), b10, num, this.f82658a.a(d10));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
