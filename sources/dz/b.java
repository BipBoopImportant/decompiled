package Dz;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import yz.C15324a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LDz/b;", "LDz/a;", "LCz/b;", "shouldUserGiveFeedbackRepository", "<init>", "(LCz/b;)V", "Lyz/a;", "giveFeedbackFor", "LXH/N;", "a", "(Lyz/a;)V", "LCz/b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Cz.b f109313a;

    public b(Cz.b bVar) {
        C17542s.j(bVar, "shouldUserGiveFeedbackRepository");
        this.f109313a = bVar;
    }

    public void a(C15324a aVar) {
        C17542s.j(aVar, "giveFeedbackFor");
        if (C17542s.e(aVar, C15324a.C3270a.f132353a)) {
            return;
        }
        if (aVar instanceof C15324a.b) {
            this.f109313a.c((C15324a.b) aVar);
            return;
        }
        throw new t();
    }
}
