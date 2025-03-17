package vk;

import J1.j;
import Oo.b;
import SC.W1;
import SC.Z1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.ui.d;
import androidx.compose.ui.window.h;
import com.google.ar.core.ImageMetadata;
import hk.f;
import hk.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import pk.s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpk/s$m;", "result", "Lkotlin/Function0;", "LXH/N;", "onDismissed", "b", "(Lpk/s$m;LnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i1 {
    public static final void b(s.m mVar, C17631a<C16807N> aVar, C4889m mVar2, int i10) {
        int i11;
        C17542s.j(aVar, "onDismissed");
        C4889m k10 = mVar2.k(-1894648726);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(mVar) : k10.F(mVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1894648726, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ShareListContent (ShareListContent.kt:19)");
            }
            if (mVar instanceof s.m.a) {
                k10.W(-999776684);
                Z1.d(j.b(b.f84853z3, k10, 0), new W1(j.b(b.f84616d5, k10, 0), aVar), aVar, (d) null, (h) null, C12161n.f104871a.a(), k10, (W1.f116045c << 3) | ImageMetadata.EDGE_MODE | ((i11 << 3) & 896), 24);
                k10.P();
            } else if (mVar instanceof s.m.b) {
                k10.W(-999764814);
                s.m.b bVar = (s.m.b) mVar;
                f.e(new g.b(bVar.a(), bVar.b(), false), aVar, k10, (i11 & 112) | g.b.f98077e);
                k10.P();
            } else if (mVar == null) {
                k10.W(-999756918);
                k10.P();
            } else {
                k10.W(-999778054);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new h1(mVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(s.m mVar, C17631a aVar, int i10, C4889m mVar2, int i11) {
        b(mVar, aVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
