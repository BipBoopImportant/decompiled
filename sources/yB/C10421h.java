package yb;

import java.security.GeneralSecurityException;
import java.util.List;
import qb.C10177v;
import qb.C10178w;
import qb.C10179x;

/* renamed from: yb.h  reason: case insensitive filesystem */
public class C10421h implements C10178w<C10420g, C10420g> {

    /* renamed from: a  reason: collision with root package name */
    private static final C10421h f77838a = new C10421h();

    /* renamed from: yb.h$b */
    private static class b implements C10420g {

        /* renamed from: a  reason: collision with root package name */
        private final C10177v<C10420g> f77839a;

        private b(C10177v<C10420g> vVar) {
            this.f77839a = vVar;
        }
    }

    private C10421h() {
    }

    static void d() {
        C10179x.n(f77838a);
    }

    public Class<C10420g> b() {
        return C10420g.class;
    }

    public Class<C10420g> c() {
        return C10420g.class;
    }

    /* renamed from: e */
    public C10420g a(C10177v<C10420g> vVar) {
        if (vVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        } else if (vVar.e() != null) {
            for (List<C10177v.c<C10420g>> it : vVar.c()) {
                for (C10177v.c a10 : it) {
                    C10420g gVar = (C10420g) a10.a();
                }
            }
            return new b(vVar);
        } else {
            throw new GeneralSecurityException("no primary in primitive set");
        }
    }
}
