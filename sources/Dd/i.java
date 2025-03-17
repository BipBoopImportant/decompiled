package Dd;

import E1.I;
import G1.C4504g;
import O0.P0;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import android.content.Context;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import nI.C17631a;
import nI.p;
import p1.i1;
import tK.C18030v;
import wK.J4;
import wK.X4;
import yd.C10443N;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LXH/N;", "b", "(LU0/m;I)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f59121a;

        a(Context context) {
            this.f59121a = context;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-422856542, i10, -1, "com.ikea.kompassmap.ui.components.Loading.<anonymous> (Loading.kt:19)");
                }
                d f10 = J.f(d.f18749a, 0.0f, 1, (Object) null);
                C5437c e10 = C5437c.f24302a.e();
                Context context = this.f59121a;
                I h10 = C5077h.h(e10, false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                d e11 = c.e(mVar, f10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h10, aVar.c());
                F1.c(a12, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e11, aVar.d());
                C5079j jVar = C5079j.f18125a;
                String string = context.getString(C10443N.f77912f);
                C17542s.i(string, "getString(...)");
                X4.r(string, (d) null, J4.Emphasised, false, mVar, 384, 10);
                mVar.x();
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

    public static final void b(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-888320313);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-888320313, i10, -1, "com.ikea.kompassmap.ui.components.Loading (Loading.kt:15)");
            }
            P0.a((d) null, (i1) null, C18030v.f147664a.a(k10, C18030v.f147665b).k0(), 0, 0.0f, 0.0f, (C5601g) null, c1.c.e(-422856542, true, new a((Context) k10.Q(AndroidCompositionLocals_androidKt.g())), k10, 54), k10, 12582912, 123);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new h(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, C4889m mVar, int i11) {
        b(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
