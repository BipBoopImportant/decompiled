package Sj;

import Pj.b;
import Rj.a;
import TC.e;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import c1.c;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPj/b;", "viewModel", "LSj/j;", "actions", "LXH/N;", "b", "(LPj/b;LSj/j;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class S {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1<a.c> f87136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10923j f87137b;

        a(A1<a.c> a12, C10923j jVar) {
            this.f87136a = a12;
            this.f87137b = jVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1899660002, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaImportProductScreen.<anonymous> (UpptackaImportProductScreen.kt:19)");
                }
                v.m(this.f87136a.getValue(), this.f87137b, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(b bVar, C10923j jVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(bVar, "viewModel");
        C17542s.j(jVar, "actions");
        C4889m k10 = mVar.k(1269857348);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(jVar) : k10.F(jVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1269857348, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaImportProductScreen (UpptackaImportProductScreen.kt:16)");
            }
            e.e(false, c.e(-1899660002, true, new a(p1.b(bVar.K(), (C17168i) null, k10, 0, 1), jVar), k10, 54), k10, 48, 1);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new Q(bVar, jVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(b bVar, C10923j jVar, int i10, C4889m mVar, int i11) {
        b(bVar, jVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
