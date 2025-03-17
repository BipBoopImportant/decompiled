package LG;

import OE.C13316h;
import OE.n;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import YH.C16877v;
import androidx.lifecycle.f0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"LLG/k;", "Landroidx/lifecycle/f0;", "<init>", "()V", "LXH/N;", "C", "LLG/c;", "item", "", "D", "(LLG/c;)Z", "LTJ/B;", "LLG/j;", "m", "LTJ/B;", "_uiState", "LTJ/P;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C16505B<j> f136075m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<j> f136076n;

    public k() {
        C16505B<j> a10 = C16521S.a(new j(n.f113291U3, C16877v.n(), (C16006c) null));
        this.f136075m = a10;
        this.f136076n = C16534i.c(a10);
        C();
    }

    private final void C() {
        List q10 = C16877v.q(new C16006c(C13316h.f112857g, n.f113308X2, 1), new C16006c(C13316h.f112859h, n.f113290U2, 2), new C16006c(C13316h.f112861i, n.f113302W2, 3), new C16006c(C13316h.f112863j, n.f113314Y2, 4), new C16006c(C13316h.f112865k, n.f113296V2, 5));
        C16505B<j> b10 = this.f136075m;
        b10.setValue(j.b(b10.getValue(), 0, q10, (C16006c) null, 5, (Object) null));
    }

    public final boolean D(C16006c cVar) {
        C17542s.j(cVar, "item");
        if (this.f136075m.getValue().d() != null) {
            return false;
        }
        C16505B<j> b10 = this.f136075m;
        b10.setValue(j.b(b10.getValue(), n.f113315Y3, (List) null, cVar, 2, (Object) null));
        return true;
    }

    public final C16519P<j> m() {
        return this.f136076n;
    }
}
