package Fy;

import Dy.o0;
import Jy.m;
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
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LFy/h;", "LLg/a;", "LJy/m;", "", "storeSelected", "<init>", "(Z)V", "", "item", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends Lg.a<m> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f110011b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFy/h$a;", "LLg/c;", "LJy/m;", "Landroidx/compose/ui/platform/ComposeView;", "binding", "<init>", "(LFy/h;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/m;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "getBinding", "()Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a extends c<m> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f110012h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f110013i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fy.h$a$a  reason: collision with other inner class name */
        static final class C2636a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f110014a;

            C2636a(h hVar) {
                this.f110014a = hVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1172667749, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.delegate.EmptyCartDelegate.ViewHolder.bind.<anonymous>.<anonymous> (EmptyCartDelegate.kt:30)");
                    }
                    o0.b(this.f110014a.f110011b, mVar, 0);
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
        public a(h hVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "binding");
            this.f110013i = hVar;
            this.f110012h = composeView;
        }

        /* renamed from: l */
        public void c(m mVar) {
            C17542s.j(mVar, "viewModel");
            ComposeView composeView = this.f110012h;
            h hVar = this.f110013i;
            super.c(mVar);
            e.l(composeView, false, c1.c.c(-1172667749, true, new C2636a(hVar)), 1, (Object) null);
        }
    }

    public h(boolean z10) {
        this.f110011b = z10;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof m;
    }

    public c<m> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
