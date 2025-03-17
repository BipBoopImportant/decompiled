package Em;

import Mm.f;
import com.ingka.ikea.benefits.impl.data.models.remote.MediaRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LEm/e;", "Lpp/c;", "LMm/e;", "Lcom/ingka/ikea/benefits/impl/data/models/remote/MediaRemote;", "<init>", "()V", "remote", "b", "(Lcom/ingka/ikea/benefits/impl/data/models/remote/MediaRemote;)LMm/e;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements C11769c<Mm.e, MediaRemote> {
    /* renamed from: b */
    public Mm.e a(MediaRemote mediaRemote) {
        C17542s.j(mediaRemote, "remote");
        return new Mm.e(f.Companion.a(mediaRemote.a()), mediaRemote.b());
    }

    public List<Mm.e> c(List<MediaRemote> list) {
        return C11769c.a.a(this, list);
    }
}
