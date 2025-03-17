package BG;

import J1.e;
import J1.j;
import N1.P;
import N1.Y;
import O0.V;
import O0.d1;
import OE.n;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import c2.h;
import c2.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;
import s0.C5842M;
import s0.C5844O;
import t1.C5942c;
import tK.C18030v;
import uK.C18148c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: BG.a  reason: case insensitive filesystem */
public final class C15450a {

    /* renamed from: a  reason: collision with root package name */
    public static final C15450a f133166a = new C15450a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5842M, C4889m, Integer, C16807N> f133167b = c.c(115652542, false, C3285a.f133168a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BG.a$a  reason: collision with other inner class name */
    static final class C3285a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3285a f133168a = new C3285a();

        C3285a() {
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(m10, "$this$Button");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(115652542, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.ComposableSingletons$MiniCatalogExpandButtonKt.lambda-1.<anonymous> (MiniCatalogExpandButton.kt:51)");
                }
                d.a aVar = d.f18749a;
                d a10 = C5116k1.a(J.t(aVar, h.B((float) 14)), "EXPAND_BUTTON_ICON_TEST_TAG");
                C5942c c10 = e.c(C18148c.Expand.m(), mVar2, 0);
                String b10 = j.b(n.f113456t, mVar2, 0);
                C18030v vVar = C18030v.f147664a;
                int i12 = C18030v.f147665b;
                V.a(c10, b10, a10, vVar.a(mVar2, i12).x0(), mVar, 384, 0);
                C5844O.a(J.y(aVar, h.B((float) 2)), mVar2, 6);
                d a11 = C5116k1.a(aVar, "EXPAND_BUTTON_TEXT_TEST_TAG");
                String b11 = j.b(n.f113456t, mVar2, 0);
                Y l10 = vVar.c(mVar2, i12).l();
                d1.b(b11, a11, vVar.a(mVar2, i12).x0(), w.i(10), (C4830x) null, C.f13316b.e(), (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, l10, mVar, 199728, 384, 61392);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5842M, C4889m, Integer, C16807N> a() {
        return f133167b;
    }
}
