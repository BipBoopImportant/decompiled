package tH;

import AH.C15413d;
import GK.C15776D;
import GK.C15786e;
import GK.C15787f;
import QJ.C16320n;
import XH.x;
import XH.y;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LtH/b;", "LGK/f;", "LAH/d;", "requestData", "LQJ/n;", "LGK/D;", "continuation", "<init>", "(LAH/d;LQJ/n;)V", "LGK/e;", "call", "Ljava/io/IOException;", "e", "LXH/N;", "c", "(LGK/e;Ljava/io/IOException;)V", "response", "(LGK/e;LGK/D;)V", "a", "LAH/d;", "b", "LQJ/n;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: tH.b  reason: case insensitive filesystem */
final class C17959b implements C15787f {

    /* renamed from: a  reason: collision with root package name */
    private final C15413d f147233a;

    /* renamed from: b  reason: collision with root package name */
    private final C16320n<C15776D> f147234b;

    public C17959b(C15413d dVar, C16320n<? super C15776D> nVar) {
        C17542s.j(dVar, "requestData");
        C17542s.j(nVar, "continuation");
        this.f147233a = dVar;
        this.f147234b = nVar;
    }

    public void c(C15786e eVar, IOException iOException) {
        C17542s.j(eVar, "call");
        C17542s.j(iOException, "e");
        if (!this.f147234b.isCancelled()) {
            C16320n<C15776D> nVar = this.f147234b;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(y.a(h.f(this.f147233a, iOException))));
        }
    }

    public void e(C15786e eVar, C15776D d10) {
        C17542s.j(eVar, "call");
        C17542s.j(d10, "response");
        if (!eVar.J()) {
            this.f147234b.resumeWith(x.b(d10));
        }
    }
}
