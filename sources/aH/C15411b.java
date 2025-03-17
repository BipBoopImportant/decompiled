package AH;

import EH.C15612Q;
import EH.C15633r;
import EH.C15636u;
import JH.C15955b;
import QJ.Q;
import dI.C17168i;
import kotlin.Metadata;
import qH.C17777b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LAH/b;", "LEH/r;", "LQJ/Q;", "LqH/b;", "h0", "()LqH/b;", "call", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "LEH/u;", "U", "()LEH/u;", "method", "LEH/Q;", "getUrl", "()LEH/Q;", "url", "LJH/b;", "getAttributes", "()LJH/b;", "attributes", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: AH.b  reason: case insensitive filesystem */
public interface C15411b extends C15633r, Q {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: AH.b$a */
    public static final class a {
        public static C17168i a(C15411b bVar) {
            return bVar.h0().getCoroutineContext();
        }
    }

    C15636u U();

    C15955b getAttributes();

    C17168i getCoroutineContext();

    C15612Q getUrl();

    C17777b h0();
}
