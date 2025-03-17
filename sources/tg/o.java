package tG;

import HJ.C15854t;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import androidx.lifecycle.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tG.n;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0003R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"LtG/o;", "Landroidx/lifecycle/f0;", "<init>", "()V", "LXH/N;", "F", "H", "", "searchTerm", "I", "(Ljava/lang/String;)V", "C", "G", "E", "LTJ/B;", "LtG/n;", "m", "LTJ/B;", "_uiState", "LTJ/P;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "o", "_searchTerm", "p", "D", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C16505B<n> f147228m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<n> f147229n;

    /* renamed from: o  reason: collision with root package name */
    private final C16505B<String> f147230o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<String> f147231p;

    public o() {
        C16505B<n> a10 = C16521S.a(n.a.f147224a);
        this.f147228m = a10;
        this.f147229n = a10;
        C16505B<String> a11 = C16521S.a("");
        this.f147230o = a11;
        this.f147231p = a11;
    }

    public final void C() {
        this.f147230o.setValue("");
    }

    public final C16519P<String> D() {
        return this.f147231p;
    }

    public final void E() {
        this.f147228m.setValue(n.b.f147225a);
    }

    public final void F() {
        C();
        this.f147228m.setValue(n.a.f147224a);
    }

    public final void G(String str) {
        C17542s.j(str, "searchTerm");
        this.f147230o.setValue(C15854t.z1(str).toString());
        this.f147228m.setValue(n.d.f147227a);
    }

    public final void H() {
        this.f147228m.setValue(n.c.f147226a);
    }

    public final void I(String str) {
        C17542s.j(str, "searchTerm");
        this.f147230o.setValue(str);
    }

    public final C16519P<n> m() {
        return this.f147229n;
    }
}
