package ho;

import Lg.a;
import Lg.c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import Wn.o;
import XH.C16807N;
import Yn.G;
import Yn.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import fI.C17221b;
import jo.C11436b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import tK.C18029u;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u000eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lho/a;", "LLg/a;", "Ljo/b;", "Lho/a$a;", "type", "LWn/o;", "deliveryDetailsAnalytics", "LYn/G;", "callbacks", "<init>", "(Lho/a$a;LWn/o;LYn/G;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "Lho/a$a;", "c", "LWn/o;", "LYn/G;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ho.a  reason: case insensitive filesystem */
public final class C11374a extends a<C11436b> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C2202a f98088b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final o f98089c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final G f98090d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lho/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKOUT", "CONFIRMATION", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ho.a$a  reason: collision with other inner class name */
    public enum C2202a {
        CHECKOUT,
        CONFIRMATION;

        static {
            C2202a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lho/a$b;", "LLg/c;", "Ljo/b;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lho/a;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Ljo/b;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ho.a$b */
    public final class b extends c<C11436b> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f98091h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C11374a f98092i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ho.a$b$a  reason: collision with other inner class name */
        static final class C2203a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C11374a f98093a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11436b f98094b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ho.a$b$a$a  reason: collision with other inner class name */
            static final class C2204a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C11374a f98095a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C11436b f98096b;

                C2204a(C11374a aVar, C11436b bVar) {
                    this.f98095a = aVar;
                    this.f98096b = bVar;
                }

                public final void a(C4889m mVar, int i10) {
                    int i11 = i10;
                    if ((i11 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(2018708862, i11, -1, "com.ingka.ikea.checkout.impl.delivery.delegates.DeliveryDetailsContentDelegate.ViewHolder.bind.<anonymous>.<anonymous>.<anonymous> (DeliveryDetailsContentDelegate.kt:50)");
                        }
                        d m10 = D.m(d.f18749a, 0.0f, 0.0f, 0.0f, C18029u.f147649a.a(), 7, (Object) null);
                        O.h(this.f98096b, this.f98095a.f98090d, this.f98095a.f98088b, this.f98095a.f98089c, m10, mVar, 0, 0);
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

            C2203a(C11374a aVar, C11436b bVar) {
                this.f98093a = aVar;
                this.f98094b = bVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-290606812, i10, -1, "com.ingka.ikea.checkout.impl.delivery.delegates.DeliveryDetailsContentDelegate.ViewHolder.bind.<anonymous>.<anonymous> (DeliveryDetailsContentDelegate.kt:49)");
                    }
                    e.e(false, c1.c.e(2018708862, true, new C2204a(this.f98093a, this.f98094b), mVar, 54), mVar, 48, 1);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C11374a aVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f98092i = aVar;
            this.f98091h = composeView;
        }

        /* renamed from: l */
        public void c(C11436b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            this.f98091h.setContent(c1.c.c(-290606812, true, new C2203a(this.f98092i, bVar)));
        }
    }

    public C11374a(C2202a aVar, o oVar, G g10) {
        C17542s.j(aVar, "type");
        C17542s.j(oVar, "deliveryDetailsAnalytics");
        C17542s.j(g10, "callbacks");
        this.f98088b = aVar;
        this.f98089c = oVar;
        this.f98090d = g10;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C11436b;
    }

    public c<C11436b> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new b(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
