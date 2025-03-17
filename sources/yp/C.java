package Yp;

import HC.T;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.d;
import aq.C11079a;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.g;
import kp.i;
import nI.C17642l;
import nI.q;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt0/x;", "", "index", "Laq/a$b;", "uiModel", "Lkotlin/Function1;", "Lkp/g;", "LXH/N;", "onCategoryClicked", "Lkp/i;", "onShopppableImageClicked", "a", "(Lt0/x;ILaq/a$b;LnI/l;LnI/l;)V", "discover-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11079a.b f89547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<g, C16807N> f89548b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<i, C16807N> f89549c;

        a(C11079a.b bVar, C17642l<? super g, C16807N> lVar, C17642l<? super i, C16807N> lVar2) {
            this.f89547a = bVar;
            this.f89548b = lVar;
            this.f89549c = lVar2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1341987656, i10, -1, "com.ingka.ikea.discover.impl.ui.visualMessageSection.<anonymous> (DiscoverVisualMessage.kt:21)");
                }
                T.g(this.f89547a.a(), this.f89548b, this.f89549c, (d) null, mVar, 0, 8);
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

    public static final void a(x xVar, int i10, C11079a.b bVar, C17642l<? super g, C16807N> lVar, C17642l<? super i, C16807N> lVar2) {
        C17542s.j(xVar, "<this>");
        C17542s.j(bVar, "uiModel");
        C17542s.j(lVar, "onCategoryClicked");
        C17542s.j(lVar2, "onShopppableImageClicked");
        xVar.b("VisualMessage" + i10, "VisualMessage", c.c(-1341987656, true, new a(bVar, lVar, lVar2)));
    }
}
