package Ai;

import Ei.C10691l;
import Ei.C10692m;
import J1.j;
import KJ.C15985a;
import KJ.C15987c;
import N1.P;
import Op.C10832f;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.f;
import Y1.k;
import YH.C16877v;
import androidx.compose.ui.d;
import c1.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import t0.C5938c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ai.s  reason: case insensitive filesystem */
public final class C10603s {

    /* renamed from: a  reason: collision with root package name */
    public static final C10603s f78792a = new C10603s();

    /* renamed from: b  reason: collision with root package name */
    private static q<C5938c, C4889m, Integer, C16807N> f78793b = c.c(1993981453, false, a.f78795a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f78794c = c.c(-276131822, false, b.f78796a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.s$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f78795a = new a();

        a() {
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1993981453, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ComposableSingletons$ProductsListScreenKt.lambda-1.<anonymous> (ProductsListScreen.kt:77)");
                }
                C13607l.j(j.b(Oo.b.f84494R6, mVar, 0), C13679b.C2857b.a.f116683a, e.i(d.f18749a), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.s$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78796a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N f(String str) {
            C17542s.j(str, "it");
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(String str, String str2) {
            C17542s.j(str, "<unused var>");
            C17542s.j(str2, "<unused var>");
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i() {
            return C16807N.f139792a;
        }

        public final void e(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-276131822, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ComposableSingletons$ProductsListScreenKt.lambda-2.<anonymous> (ProductsListScreen.kt:135)");
                }
                Iterable<Hx.b> a10 = E0.f78445a.a();
                ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
                for (Hx.b bVar : a10) {
                    C11522d a11 = C10832f.f85163a.a();
                    String b10 = bVar.b();
                    E0 e02 = E0.f78445a;
                    arrayList.add(new C10691l.a.C1528a(bVar.b(), bVar.b(), C10692m.a(bVar, a11, C17542s.e(b10, e02.a().get(1).b()), Boolean.valueOf(!C17542s.e(bVar.b(), e02.a().get(2).b())), true, false)));
                }
                C15987c h10 = C15985a.h(arrayList);
                mVar.W(527085388);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = new C10605t();
                    mVar.u(D10);
                }
                C17642l lVar = (C17642l) D10;
                mVar.P();
                mVar.W(527086581);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new C10607u();
                    mVar.u(D11);
                }
                p pVar = (p) D11;
                mVar.P();
                mVar.W(527087692);
                Object D12 = mVar.D();
                if (D12 == aVar.a()) {
                    D12 = new C10609v();
                    mVar.u(D12);
                }
                mVar.P();
                J0.i(h10, "123456789", false, lVar, pVar, (C17631a) D12, mVar, 224688);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final q<C5938c, C4889m, Integer, C16807N> a() {
        return f78793b;
    }
}
