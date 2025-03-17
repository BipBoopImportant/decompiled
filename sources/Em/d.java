package Em;

import com.ingka.ikea.benefits.impl.data.models.remote.BenefitsRemote;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LEm/d;", "Lpp/c;", "LMm/d;", "Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitsRemote;", "LEm/b;", "benefitToLocalMapper", "<init>", "(LEm/b;)V", "remote", "b", "(Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitsRemote;)LMm/d;", "a", "LEm/b;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C11769c<Mm.d, BenefitsRemote> {

    /* renamed from: a  reason: collision with root package name */
    private final b f80737a;

    public d(b bVar) {
        C17542s.j(bVar, "benefitToLocalMapper");
        this.f80737a = bVar;
    }

    /* renamed from: b */
    public Mm.d a(BenefitsRemote benefitsRemote) {
        C17542s.j(benefitsRemote, "remote");
        return new Mm.d(this.f80737a.c(benefitsRemote.b()), this.f80737a.c(benefitsRemote.d()), this.f80737a.c(benefitsRemote.c()));
    }
}
