package eo;

import Lg.c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Yn.a0;
import Yn.b0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Leo/b;", "LLg/a;", "LYn/b0;", "Lkotlin/Function0;", "LXH/N;", "onGooglePayClick", "onContinueCheckout", "<init>", "(LnI/a;LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/a;", "c", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends Lg.a<b0> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17631a<C16807N> f97153b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17631a<C16807N> f97154c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Leo/b$a;", "LLg/c;", "LYn/b0;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Leo/b;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LYn/b0;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<b0> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f97155h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f97156i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eo.b$a$a  reason: collision with other inner class name */
        static final class C2157a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b0 f97157a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f97158b;

            C2157a(b0 b0Var, b bVar) {
                this.f97157a = b0Var;
                this.f97158b = bVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1096814695, i10, -1, "com.ingka.ikea.checkout.impl.delegates.GooglePayExpressDelegate.ViewHolder.bind.<anonymous>.<anonymous> (GooglePayExpressDelegate.kt:37)");
                    }
                    a0.b(this.f97157a, this.f97158b.f97153b, this.f97158b.f97154c, mVar, 0);
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
        public a(b bVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f97156i = bVar;
            this.f97155h = composeView;
        }

        /* renamed from: l */
        public void c(b0 b0Var) {
            C17542s.j(b0Var, "viewModel");
            super.c(b0Var);
            e.l(this.f97155h, false, c1.c.c(1096814695, true, new C2157a(b0Var, this.f97156i)), 1, (Object) null);
        }
    }

    public b(C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        C17542s.j(aVar, "onGooglePayClick");
        C17542s.j(aVar2, "onContinueCheckout");
        this.f97153b = aVar;
        this.f97154c = aVar2;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof b0;
    }

    public c<b0> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
