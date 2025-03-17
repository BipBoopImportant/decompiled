package gr;

import KJ.C15987c;
import Qq.q;
import Qq.r;
import XH.t;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kr.c;
import nr.j;
import nr.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgr/b;", "Lgr/a;", "<init>", "()V", "Lnr/k;", "rewards", "Lnr/j$a$a$a;", "interactions", "", "Lkr/c;", "a", "(Lnr/k;Lnr/j$a$a$a;)Ljava/util/List;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gr.b  reason: case insensitive filesystem */
public final class C11350b implements C11349a {
    public List<c> a(k kVar, j.a.C2312a.C2313a aVar) {
        C17542s.j(kVar, "rewards");
        C17542s.j(aVar, "interactions");
        List c10 = C16877v.c();
        c10.add(c.g.f99108a);
        if (!kVar.c().isEmpty()) {
            c10.add(new c.b(kVar.c()));
        }
        if (!kVar.a().isEmpty()) {
            c10.add(new c.a(kVar.a()));
        }
        if (!kVar.d().isEmpty()) {
            c10.add(new c.h(kVar.d()));
        }
        if (!(aVar instanceof j.a.C2312a.C2313a.b)) {
            if (aVar instanceof j.a.C2312a.C2313a.C2314a) {
                c10.add(c.e.f99106a);
                j.a.C2312a.C2313a.C2314a aVar2 = (j.a.C2312a.C2313a.C2314a) aVar;
                q a10 = aVar2.a();
                if (a10 != null) {
                    c10.add(new c.C2246c(a10));
                }
                C15987c<r> b10 = aVar2.b();
                if (!b10.isEmpty()) {
                    c10.add(new c.d(b10));
                }
            } else {
                throw new t();
            }
        }
        return C16877v.a(c10);
    }
}
