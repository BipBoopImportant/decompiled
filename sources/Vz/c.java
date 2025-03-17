package Vz;

import com.ingka.ikea.seasonability.impl.data.models.remote.SeasonabilityPromoRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVz/c;", "Lpp/c;", "LQz/c;", "Lcom/ingka/ikea/seasonability/impl/data/models/remote/SeasonabilityPromoRemote;", "LVz/a;", "mediaItemMapper", "<init>", "(LVz/a;)V", "remote", "b", "(Lcom/ingka/ikea/seasonability/impl/data/models/remote/SeasonabilityPromoRemote;)LQz/c;", "a", "LVz/a;", "seasonability-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11769c<Qz.c, SeasonabilityPromoRemote> {

    /* renamed from: a  reason: collision with root package name */
    private final a f117452a;

    public c(a aVar) {
        C17542s.j(aVar, "mediaItemMapper");
        this.f117452a = aVar;
    }

    /* renamed from: b */
    public Qz.c a(SeasonabilityPromoRemote seasonabilityPromoRemote) {
        C17542s.j(seasonabilityPromoRemote, "remote");
        return new Qz.c(this.f117452a.a(seasonabilityPromoRemote.a()));
    }

    public List<Qz.c> c(List<SeasonabilityPromoRemote> list) {
        return C11769c.a.a(this, list);
    }
}
