package AD;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;
import p0.v;
import s0.C5857c;
import zD.p;
import zD.t;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp0/v;", "orientation", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Lp0/v;Landroidx/compose/ui/d;LU0/m;II)V", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: AD.c  reason: case insensitive filesystem */
public final class C12565c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AD.c$a */
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f107627a;

        a(v vVar) {
            this.f107627a = vVar;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$FlippableCard");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1259874582, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.loading.LoadingCard.<anonymous> (LoadingCard.kt:23)");
                }
                t.h(this.f107627a, J.f(d.f18749a, 0.0f, 1, (Object) null), mVar, 48, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(v vVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(vVar, "orientation");
        C4889m k10 = mVar.k(-1004092595);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(vVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1004092595, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.loading.LoadingCard (LoadingCard.kt:17)");
            }
            p.j(vVar, false, c.e(1259874582, true, new a(vVar), k10, 54), C12563a.f107620a.a(), dVar, 0, k10, (i12 & 14) | 3504 | ((i12 << 9) & 57344), 32);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12564b(vVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(v vVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(vVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
