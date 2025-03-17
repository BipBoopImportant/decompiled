package ei;

import Lg.c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import c2.h;
import ci.M;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00060\u000fR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lei/b0;", "LLg/a;", "Lei/c0;", "Lkotlin/Function0;", "LXH/N;", "onReloadClicked", "<init>", "(LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lei/b0$a;", "f", "(Landroid/view/ViewGroup;)Lei/b0$a;", "b", "LnI/a;", "e", "()LnI/a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 extends Lg.a<c0> {

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f72822b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lei/b0$a;", "LLg/c;", "Lei/c0;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/b0;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lei/c0;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<c0> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72823h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b0 f72824i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.b0$a$a  reason: collision with other inner class name */
        static final class C1258a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c0 f72825a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b0 f72826b;

            C1258a(c0 c0Var, b0 b0Var) {
                this.f72825a = c0Var;
                this.f72826b = b0Var;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1453358223, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.ReloadErrorDelegate.ViewHolder.bind.<anonymous>.<anonymous> (ReloadErrorDelegate.kt:40)");
                    }
                    M.b(this.f72825a.b(), this.f72826b.e(), J.b(J.h(d.f18749a, 0.0f, 1, (Object) null), 0.0f, this.f72825a.a() ? h.B((float) 800) : h.B((float) 240), 1, (Object) null), mVar, 0, 0);
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
        public a(b0 b0Var, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72824i = b0Var;
            this.f72823h = composeView;
        }

        /* renamed from: l */
        public void c(c0 c0Var) {
            C17542s.j(c0Var, "viewModel");
            super.c(c0Var);
            e.l(this.f72823h, false, c1.c.c(1453358223, true, new C1258a(c0Var, this.f72824i)), 1, (Object) null);
        }
    }

    public b0(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "onReloadClicked");
        this.f72822b = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof c0;
    }

    public final C17631a<C16807N> e() {
        return this.f72822b;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
