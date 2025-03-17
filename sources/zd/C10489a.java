package zd;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15804w;
import GK.C15805x;
import WK.C16770e;
import WK.C16771f;
import WK.C16782q;
import WK.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzd/a;", "LGK/w;", "<init>", "()V", "LGK/C;", "body", "b", "(LGK/C;)LGK/C;", "requestBody", "a", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: zd.a  reason: case insensitive filesystem */
public final class C10489a implements C15804w {
    private final C15775C a(C15775C c10) {
        C16770e eVar = new C16770e();
        c10.h(eVar);
        return C15775C.f134790a.e(eVar.i0(), c10.b());
    }

    private final C15775C b(C15775C c10) {
        C16770e eVar = new C16770e();
        C16771f c11 = y.c(new C16782q(eVar));
        c10.h(c11);
        c11.close();
        return C15775C.f134790a.e(eVar.i0(), C15805x.f135130e.b("application/x-gzip"));
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        C15774B t10 = aVar.t();
        if (t10.a() == null || t10.d("Content-Encoding") != null) {
            return aVar.b(t10);
        }
        C15774B.a e10 = t10.i().e("Content-Encoding", "gzip");
        String h10 = t10.h();
        C15775C a10 = t10.a();
        C17542s.g(a10);
        return aVar.b(e10.g(h10, a(b(a10))).b());
    }
}
