package Em;

import Mm.a;
import Mm.c;
import Mm.e;
import Mm.h;
import com.ingka.ikea.benefits.impl.data.models.remote.BenefitRemote;
import com.ingka.ikea.benefits.impl.data.models.remote.CallToActionRemote;
import com.ingka.ikea.benefits.impl.data.models.remote.SvgIconRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LEm/b;", "Lpp/c;", "LMm/a;", "Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;", "LEm/c;", "callToActionToLocalMapper", "LEm/e;", "mediaToLocalMapper", "LEm/f;", "svgIconToLocalMapper", "<init>", "(LEm/c;LEm/e;LEm/f;)V", "remote", "b", "(Lcom/ingka/ikea/benefits/impl/data/models/remote/BenefitRemote;)LMm/a;", "a", "LEm/c;", "LEm/e;", "c", "LEm/f;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11769c<a, BenefitRemote> {

    /* renamed from: a  reason: collision with root package name */
    private final c f80734a;

    /* renamed from: b  reason: collision with root package name */
    private final e f80735b;

    /* renamed from: c  reason: collision with root package name */
    private final f f80736c;

    public b(c cVar, e eVar, f fVar) {
        C17542s.j(cVar, "callToActionToLocalMapper");
        C17542s.j(eVar, "mediaToLocalMapper");
        C17542s.j(fVar, "svgIconToLocalMapper");
        this.f80734a = cVar;
        this.f80735b = eVar;
        this.f80736c = fVar;
    }

    /* renamed from: b */
    public a a(BenefitRemote benefitRemote) {
        C17542s.j(benefitRemote, "remote");
        String f10 = benefitRemote.f();
        String g10 = benefitRemote.g();
        c a10 = c.Companion.a(benefitRemote.c());
        String i10 = benefitRemote.i();
        String d10 = benefitRemote.d();
        String j10 = benefitRemote.j();
        List<e> c10 = this.f80735b.c(benefitRemote.h());
        SvgIconRemote e10 = benefitRemote.e();
        h b10 = e10 != null ? this.f80736c.a(e10) : null;
        CallToActionRemote b11 = benefitRemote.b();
        return new a(f10, g10, a10, i10, d10, j10, c10, b10, b11 != null ? this.f80734a.a(b11) : null);
    }

    public List<a> c(List<BenefitRemote> list) {
        return C11769c.a.a(this, list);
    }
}
