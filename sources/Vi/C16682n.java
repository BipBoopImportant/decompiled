package VI;

import DI.C15544O;
import DI.C15558e;
import EJ.C15662c;
import WI.C16730a;
import XH.v;
import XI.C16830c;
import XI.l;
import YH.C16877v;
import YH.g0;
import bJ.C17046e;
import bJ.C17047f;
import bJ.C17050i;
import eJ.C17200k;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import qJ.C17821i;
import qJ.C17826n;
import qJ.C17837y;
import sJ.C17917M;
import sJ.C17941r;

/* renamed from: VI.n  reason: case insensitive filesystem */
public final class C16682n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f139391b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final Set<C16730a.C3422a> f139392c = g0.c(C16730a.C3422a.CLASS);

    /* renamed from: d  reason: collision with root package name */
    private static final Set<C16730a.C3422a> f139393d = g0.h(C16730a.C3422a.FILE_FACADE, C16730a.C3422a.MULTIFILE_CLASS_PART);

    /* renamed from: e  reason: collision with root package name */
    private static final C17046e f139394e = new C17046e(1, 1, 2);

    /* renamed from: f  reason: collision with root package name */
    private static final C17046e f139395f = new C17046e(1, 1, 11);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C17046e f139396g = new C17046e(1, 1, 13);

    /* renamed from: a  reason: collision with root package name */
    public C17826n f139397a;

    /* renamed from: VI.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17046e a() {
            return C16682n.f139396g;
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final Collection d() {
        return C16877v.n();
    }

    private final C17941r e(C16692x xVar) {
        return f().g().e() ? C17941r.STABLE : xVar.b().j() ? C17941r.UNSTABLE : C17941r.STABLE;
    }

    private final C17837y<C17046e> g(C16692x xVar) {
        if (i() || xVar.b().d().h(h())) {
            return null;
        }
        return new C17837y(xVar.b().d(), C17046e.f141178i, h(), h().k(xVar.b().d().j()), xVar.a(), xVar.k());
    }

    private final C17046e h() {
        return C15662c.a(f().g());
    }

    private final boolean i() {
        return f().g().f();
    }

    private final boolean j(C16692x xVar) {
        return !f().g().b() && xVar.b().i() && C17542s.e(xVar.b().d(), f139395f);
    }

    private final boolean k(C16692x xVar) {
        return (f().g().g() && (xVar.b().i() || C17542s.e(xVar.b().d(), f139394e))) || j(xVar);
    }

    private final String[] m(C16692x xVar, Set<? extends C16730a.C3422a> set) {
        C16730a b10 = xVar.b();
        String[] a10 = b10.a();
        if (a10 == null) {
            a10 = b10.b();
        }
        if (a10 == null || !set.contains(b10.c())) {
            return null;
        }
        return a10;
    }

    public final C17656k c(C15544O o10, C16692x xVar) {
        String[] g10;
        v<C17047f, l> vVar;
        C17542s.j(o10, "descriptor");
        C17542s.j(xVar, "kotlinClass");
        String[] m10 = m(xVar, f139393d);
        if (m10 == null || (g10 = xVar.b().g()) == null) {
            return null;
        }
        try {
            vVar = C17050i.m(m10, g10);
        } catch (C17200k e10) {
            throw new IllegalStateException("Could not read data from " + xVar.a(), e10);
        } catch (Throwable th2) {
            if (i() || xVar.b().d().h(h())) {
                throw th2;
            }
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        l b10 = vVar.b();
        C17047f a10 = vVar.a();
        C16686r rVar = new C16686r(xVar, b10, a10, g(xVar), k(xVar), e(xVar));
        return new C17917M(o10, b10, a10, xVar.b().d(), rVar, f(), "scope for " + rVar + " in " + o10, C16681m.f139390a);
    }

    public final C17826n f() {
        C17826n nVar = this.f139397a;
        if (nVar != null) {
            return nVar;
        }
        C17542s.z("components");
        return null;
    }

    public final C17821i l(C16692x xVar) {
        String[] g10;
        v<C17047f, C16830c> vVar;
        C17542s.j(xVar, "kotlinClass");
        String[] m10 = m(xVar, f139392c);
        if (m10 == null || (g10 = xVar.b().g()) == null) {
            return null;
        }
        try {
            vVar = C17050i.i(m10, g10);
        } catch (C17200k e10) {
            throw new IllegalStateException("Could not read data from " + xVar.a(), e10);
        } catch (Throwable th2) {
            if (i() || xVar.b().d().h(h())) {
                throw th2;
            }
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        return new C17821i(vVar.a(), vVar.b(), xVar.b().d(), new C16694z(xVar, g(xVar), k(xVar), e(xVar)));
    }

    public final C15558e n(C16692x xVar) {
        C17542s.j(xVar, "kotlinClass");
        C17821i l10 = l(xVar);
        if (l10 == null) {
            return null;
        }
        return f().f().e(xVar.k(), l10);
    }

    public final void o(C16679k kVar) {
        C17542s.j(kVar, "components");
        p(kVar.a());
    }

    public final void p(C17826n nVar) {
        C17542s.j(nVar, "<set-?>");
        this.f139397a = nVar;
    }
}
