package com.ingka.ikea.discover.impl.ui;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import com.ingka.ikea.discover.impl.ui.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import ov.C11718a;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lt0/x;", "", "index", "Lov/a;", "liveShoppingSection", "Lkotlin/Function1;", "Lcom/ingka/ikea/discover/impl/ui/i;", "LXH/N;", "onScreenUiEvent", "a", "(Lt0/x;ILov/a;LnI/l;)V", "discover-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11718a f95636a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<i, C16807N> f95637b;

        a(C11718a aVar, C17642l<? super i, C16807N> lVar) {
            this.f95636a = aVar;
            this.f95637b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(i.m.f95659a);
            return C16807N.f139792a;
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-468032004, i10, -1, "com.ingka.ikea.discover.impl.ui.liveShoppingSection.<anonymous> (LiveShoppingSection.kt:20)");
                }
                C11718a aVar = this.f95636a;
                d h10 = J.h(d.f18749a, 0.0f, 1, (Object) null);
                mVar.W(-1873979269);
                boolean V10 = mVar.V(this.f95637b);
                C17642l<i, C16807N> lVar = this.f95637b;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new g(lVar);
                    mVar.u(D10);
                }
                mVar.P();
                aVar.a(h10, (C17631a) D10, mVar, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(x xVar, int i10, C11718a aVar, C17642l<? super i, C16807N> lVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(aVar, "liveShoppingSection");
        C17542s.j(lVar, "onScreenUiEvent");
        xVar.b(Integer.valueOf(i10), "LiveShopping", c.c(-468032004, true, new a(aVar, lVar)));
    }
}
