package Vz;

import Qz.a;
import com.ingka.ikea.seasonability.impl.data.models.remote.PromoMediaItemsRemote;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVz/b;", "Lpp/c;", "LQz/a;", "Lcom/ingka/ikea/seasonability/impl/data/models/remote/PromoMediaItemsRemote;", "LVz/c;", "seasonabilityPromoMapper", "<init>", "(LVz/c;)V", "remote", "b", "(Lcom/ingka/ikea/seasonability/impl/data/models/remote/PromoMediaItemsRemote;)LQz/a;", "a", "LVz/c;", "seasonability-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11769c<a, PromoMediaItemsRemote> {

    /* renamed from: a  reason: collision with root package name */
    private final c f117451a;

    public b(c cVar) {
        C17542s.j(cVar, "seasonabilityPromoMapper");
        this.f117451a = cVar;
    }

    /* renamed from: b */
    public a a(PromoMediaItemsRemote promoMediaItemsRemote) {
        C17542s.j(promoMediaItemsRemote, "remote");
        return new a(this.f117451a.c(promoMediaItemsRemote.b()));
    }
}
