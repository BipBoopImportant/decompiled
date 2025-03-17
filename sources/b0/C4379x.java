package B0;

import T1.r;
import XH.C16807N;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.C5113j1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n1.C5626f;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"LB0/x;", "LB0/y;", "Landroidx/compose/ui/platform/j1;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/j1;)V", "LT1/r;", "imeAction", "LXH/N;", "d", "(I)V", "a", "Landroidx/compose/ui/platform/j1;", "LB0/z;", "b", "LB0/z;", "c", "()LB0/z;", "f", "(LB0/z;)V", "keyboardActions", "Ln1/f;", "Ln1/f;", "()Ln1/f;", "e", "(Ln1/f;)V", "focusManager", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B0.x  reason: case insensitive filesystem */
public final class C4379x implements C4380y {

    /* renamed from: a  reason: collision with root package name */
    private final C5113j1 f5147a;

    /* renamed from: b  reason: collision with root package name */
    public C4381z f5148b;

    /* renamed from: c  reason: collision with root package name */
    public C5626f f5149c;

    public C4379x(C5113j1 j1Var) {
        this.f5147a = j1Var;
    }

    public void a(int i10) {
        r.a aVar = r.f13620b;
        if (r.m(i10, aVar.d())) {
            b().d(d.f18832b.e());
        } else if (r.m(i10, aVar.f())) {
            b().d(d.f18832b.f());
        } else if (r.m(i10, aVar.b())) {
            C5113j1 j1Var = this.f5147a;
            if (j1Var != null) {
                j1Var.b();
            }
        } else {
            boolean z10 = true;
            if (!(r.m(i10, aVar.c()) ? true : r.m(i10, aVar.g()) ? true : r.m(i10, aVar.h()))) {
                z10 = r.m(i10, aVar.a());
            }
            if (!z10) {
                r.m(i10, aVar.e());
            }
        }
    }

    public final C5626f b() {
        C5626f fVar = this.f5149c;
        if (fVar != null) {
            return fVar;
        }
        C17542s.z("focusManager");
        return null;
    }

    public final C4381z c() {
        C4381z zVar = this.f5148b;
        if (zVar != null) {
            return zVar;
        }
        C17542s.z("keyboardActions");
        return null;
    }

    public final void d(int i10) {
        C17642l<C4380y, C16807N> lVar;
        r.a aVar = r.f13620b;
        C16807N n10 = null;
        if (r.m(i10, aVar.b())) {
            lVar = c().b();
        } else if (r.m(i10, aVar.c())) {
            lVar = c().c();
        } else if (r.m(i10, aVar.d())) {
            lVar = c().d();
        } else if (r.m(i10, aVar.f())) {
            lVar = c().e();
        } else if (r.m(i10, aVar.g())) {
            lVar = c().f();
        } else if (r.m(i10, aVar.h())) {
            lVar = c().g();
        } else {
            if (r.m(i10, aVar.a()) ? true : r.m(i10, aVar.e())) {
                lVar = null;
            } else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        if (lVar != null) {
            lVar.invoke(this);
            n10 = C16807N.f139792a;
        }
        if (n10 == null) {
            a(i10);
        }
    }

    public final void e(C5626f fVar) {
        this.f5149c = fVar;
    }

    public final void f(C4381z zVar) {
        this.f5148b = zVar;
    }
}
