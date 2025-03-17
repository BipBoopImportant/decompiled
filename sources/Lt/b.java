package Lt;

import IC.C13023e;
import IC.C13026h;
import Mt.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import st.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLt/b;", "LLt/a;", "<init>", "()V", "LMm/a;", "benefit", "", "isFamilyMember", "storeModeEnabled", "LMt/a;", "a", "(LMm/a;ZZ)LMt/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {
    public a a(Mm.a aVar, boolean z10, boolean z11) {
        C13023e a10;
        C17542s.j(aVar, "benefit");
        if (!z10 || !z11) {
            a10 = z10 ? C13026h.a(c.f102808t) : C13026h.a(c.f102814v);
        } else {
            String g10 = aVar.g();
            if (g10 == null || (a10 = C13026h.c(g10)) == null) {
                a10 = C13026h.a(c.f102811u);
            }
        }
        return new a(C13026h.a(c.f102820x), a10, C13026h.a((!z11 || !z10) ? Oo.b.f84681j4 : c.f102817w), C13026h.a(z10 ? c.f102817w : c.f102823y), aVar);
    }
}
