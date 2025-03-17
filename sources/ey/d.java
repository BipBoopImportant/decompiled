package ey;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import ay.C13992a;
import com.ingka.ikea.reassurance.impl.ReassuranceFragment;
import dy.C14367v;
import fy.C14483a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.e;
import l3.a;
import m3.c;
import nI.C17631a;
import nI.r;
import qw.i;
import x4.C8935A;
import x4.C8948l;
import x4.C8951o;
import x4.I;
import x4.y;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00138\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Ley/d;", "Lay/a;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "LXH/N;", "c", "(Landroidx/fragment/app/FragmentManager;)V", "Lx4/o;", "navController", "b", "(Lx4/o;)V", "Lx4/y;", "navgraphBuilder", "Lx4/A;", "navHostController", "d", "(Lx4/y;Lx4/A;)V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "reassuranceHelpRoute", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C13992a {

    /* renamed from: a  reason: collision with root package name */
    private final String f126819a = "reassurance/help";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<e, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8935A f126820a;

        a(C8935A a10) {
            this.f126820a = a10;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C8935A a10) {
            a10.k0();
            return C16807N.f139792a;
        }

        public final void b(e eVar, C8948l lVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$modalNavigationComposable");
            C17542s.j(lVar, "it");
            if (C4895p.J()) {
                C4895p.S(-1641517400, i10, -1, "com.ingka.ikea.reassurance.impl.navigation.ReassuranceNavigationImpl.addReassuranceDialog.<anonymous> (ReassuranceNavigationImpl.kt:47)");
            }
            mVar.C(1890788296);
            k0 a10 = m3.a.f26247a.a(mVar, m3.a.f26249c);
            if (a10 != null) {
                i0.c a11 = f3.a.a(a10, mVar, 0);
                mVar.C(1729797275);
                f0 b10 = c.b(C14483a.class, a10, (String) null, a11, a10 instanceof C5212o ? ((C5212o) a10).getDefaultViewModelCreationExtras() : a.C0407a.f25486b, mVar, 36936, 0);
                mVar.U();
                mVar.U();
                C14483a aVar = (C14483a) b10;
                mVar.W(143539501);
                boolean F10 = mVar.F(this.f126820a);
                C8935A a12 = this.f126820a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C14436c(a12);
                    mVar.u(D10);
                }
                mVar.P();
                C14367v.s(aVar, (C17631a) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            b((e) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    public String a() {
        return this.f126819a;
    }

    public void b(C8951o oVar) {
        C17542s.j(oVar, "navController");
        C8951o.g0(oVar, "reassurance/help", rw.c.f28698a.d().a(), (I.a) null, 4, (Object) null);
    }

    public void c(FragmentManager fragmentManager) {
        C17542s.j(fragmentManager, "fragmentManager");
        new ReassuranceFragment().show(fragmentManager, "reassurance_fragment");
    }

    public void d(y yVar, C8935A a10) {
        C17542s.j(yVar, "navgraphBuilder");
        C17542s.j(a10, "navHostController");
        i.t(yVar, "reassurance/help", (List) null, (List) null, c1.c.c(-1641517400, true, new a(a10)), 6, (Object) null);
    }
}
