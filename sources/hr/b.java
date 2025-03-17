package hr;

import KJ.C15985a;
import XH.t;
import gr.C11349a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kr.C11527a;
import kr.d;
import kr.e;
import nr.j;
import nr.k;
import nr.l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lhr/b;", "Lhr/a;", "Lgr/a;", "listContentFactory", "<init>", "(Lgr/a;)V", "Lkr/e;", "viewModelState", "Lkr/d;", "a", "(Lkr/e;)Lkr/d;", "Lgr/a;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11379a {

    /* renamed from: a  reason: collision with root package name */
    private final C11349a f98156a;

    public b(C11349a aVar) {
        C17542s.j(aVar, "listContentFactory");
        this.f98156a = aVar;
    }

    public d a(e eVar) {
        C17542s.j(eVar, "viewModelState");
        j.a.b b10 = eVar.e().b();
        j.a.C2312a a10 = eVar.e().a();
        C11527a d10 = eVar.d();
        if (b10 instanceof j.a.b.C2315a) {
            return new d.c(d10);
        }
        if (b10 instanceof l) {
            return new d.b(d10);
        }
        if (!(b10 instanceof k)) {
            throw new t();
        } else if (a10 instanceof j.a.C2312a.b) {
            return new d.c(d10);
        } else {
            if (a10 instanceof j.a.C2312a.C2313a) {
                k kVar = (k) b10;
                return new d.a(kVar.b(), C15985a.l(this.f98156a.a(kVar, (j.a.C2312a.C2313a) a10)), d10, eVar.c());
            }
            throw new t();
        }
    }
}
