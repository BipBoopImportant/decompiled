package nJ;

import DI.C15561h;
import DI.C15566m;
import LI.C16015b;
import cJ.C17069f;
import java.util.Collection;
import nI.C17642l;

/* renamed from: nJ.n  reason: case insensitive filesystem */
public interface C17659n {

    /* renamed from: nJ.n$a */
    public static final class a {
        public static /* synthetic */ Collection a(C17659n nVar, C17649d dVar, C17642l<C17069f, Boolean> lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    dVar = C17649d.f144835o;
                }
                if ((i10 & 2) != 0) {
                    lVar = C17656k.f144861a.c();
                }
                return nVar.g(dVar, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    C15561h e(C17069f fVar, C16015b bVar);

    Collection<C15566m> g(C17649d dVar, C17642l<? super C17069f, Boolean> lVar);
}
