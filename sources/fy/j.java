package Fy;

import Dy.z0;
import Jy.p;
import Lg.c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LFy/j;", "LLg/a;", "LJy/p;", "Lkotlin/Function1;", "", "LXH/N;", "onClick", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LFy/j$a;", "f", "(Landroid/view/ViewGroup;)LFy/j$a;", "b", "LnI/l;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends Lg.a<p> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<String, C16807N> f110022b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LFy/j$a;", "LLg/c;", "LJy/p;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LFy/j;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/p;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<p> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f110023h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j f110024i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fy.j$a$a  reason: collision with other inner class name */
        static final class C2638a implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f110025a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f110026b;

            C2638a(p pVar, j jVar) {
                this.f110025a = pVar;
                this.f110026b = jVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(421549517, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.delegate.OngoingOrderCardDelegate.ViewHolder.bind.<anonymous>.<anonymous> (OngoingOrderCardDelegate.kt:30)");
                    }
                    z0.c(this.f110025a, this.f110026b.f110022b, mVar, 0);
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
        public a(j jVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f110024i = jVar;
            this.f110023h = composeView;
        }

        /* renamed from: l */
        public void c(p pVar) {
            C17542s.j(pVar, "viewModel");
            ComposeView composeView = this.f110023h;
            j jVar = this.f110024i;
            super.c(pVar);
            e.l(composeView, false, c1.c.c(421549517, true, new C2638a(pVar, jVar)), 1, (Object) null);
        }
    }

    public j(C17642l<? super String, C16807N> lVar) {
        C17542s.j(lVar, "onClick");
        this.f110022b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof p;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
