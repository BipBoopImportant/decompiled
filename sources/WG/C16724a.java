package WG;

import E1.C4478k;
import J1.e;
import J1.j;
import OE.n;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import com.sugarcube.decorate.v2.internal.RotateControlView;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.C5749w0;
import s0.C5861g;
import tK.C18030v;
import uK.C18148c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: WG.a  reason: case insensitive filesystem */
public final class C16724a {

    /* renamed from: a  reason: collision with root package name */
    public static final C16724a f139472a = new C16724a();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5861g, C4889m, Integer, C16807N> f139473b = c.c(1710204011, false, C3421a.f139475a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f139474c = c.c(-1799064524, false, b.f139476a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WG.a$a  reason: collision with other inner class name */
    static final class C3421a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3421a f139475a = new C3421a();

        C3421a() {
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C17542s.j(gVar, "$this$Card");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1710204011, i10, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.rotate.ComposableSingletons$RotateToolbarKt.lambda-1.<anonymous> (RotateToolbar.kt:92)");
                }
                C5583F.a(e.c(C18148c.Checkmark.m(), mVar, 0), j.b(n.f113400l, mVar, 0), J.f(d.f18749a, 0.0f, 1, (Object) null), (C5437c) null, C4478k.f5915a.f(), 0.0f, C5749w0.a.b(C5749w0.f27365b, C18030v.f147664a.a(mVar, C18030v.f147665b).K0(), 0, 2, (Object) null), mVar, 24960, 40);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WG.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f139476a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final void e(float f10) {
        }

        /* access modifiers changed from: private */
        public static final C16807N f() {
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1799064524, i10, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.rotate.ComposableSingletons$RotateToolbarKt.lambda-2.<anonymous> (RotateToolbar.kt:169)");
                }
                mVar.W(661821626);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = new C16725b();
                    mVar.u(D10);
                }
                RotateControlView.OnItemRotateListener onItemRotateListener = (RotateControlView.OnItemRotateListener) D10;
                mVar.P();
                mVar.W(661822426);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new C16726c();
                    mVar.u(D11);
                }
                mVar.P();
                g.d(0.0f, onItemRotateListener, (C17631a) D11, (h) null, mVar, 390, 8);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5861g, C4889m, Integer, C16807N> a() {
        return f139473b;
    }
}
