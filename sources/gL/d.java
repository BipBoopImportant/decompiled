package Gl;

import Gl.b;
import KJ.C15985a;
import KJ.C15987c;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.t;
import androidx.lifecycle.f0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow.f;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"LGl/d;", "Landroidx/lifecycle/f0;", "", "Low/f;", "navigationTabItems", "<init>", "(Ljava/util/Set;)V", "LGl/b;", "event", "LXH/N;", "h", "(LGl/b;)V", "LTJ/B;", "LGl/c;", "m", "LTJ/B;", "state", "LTJ/P;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C16505B<c> f81159m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<c> f81160n;

    public d(Set<f> set) {
        C17542s.j(set, "navigationTabItems");
        C16505B<c> a10 = C16521S.a(new c(C15985a.l(set), 0, 2, (DefaultConstructorMarker) null));
        this.f81159m = a10;
        this.f81160n = C16534i.c(a10);
    }

    public final void h(b bVar) {
        c value;
        c cVar;
        C17542s.j(bVar, "event");
        if (bVar instanceof b.a) {
            C16505B<c> b10 = this.f81159m;
            do {
                value = b10.getValue();
                cVar = value;
            } while (!b10.e(value, c.b(cVar, (C15987c) null, cVar.e().indexOf(((b.a) bVar).a()), 1, (Object) null)));
            return;
        }
        throw new t();
    }

    public final C16519P<c> m() {
        return this.f81160n;
    }
}
