package Fy;

import Dy.w0;
import Jy.r;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LFy/l;", "LLg/a;", "LJy/r;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LIl/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends Lg.a<r> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Il.a f110030b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFy/l$a;", "LLg/c;", "LJy/r;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LFy/l;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/r;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<r> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f110031h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l f110032i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fy.l$a$a  reason: collision with other inner class name */
        static final class C2640a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r f110033a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f110034b;

            C2640a(r rVar, l lVar) {
                this.f110033a = rVar;
                this.f110034b = lVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-427604313, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.delegate.TotalPriceDelegate.ViewHolder.bind.<anonymous>.<anonymous> (TotalPriceDelegate.kt:30)");
                    }
                    w0.b(this.f110034b.f110030b.s(), this.f110033a.h(), this.f110033a.g(), this.f110033a.i(), mVar, 0);
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
        public a(l lVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f110032i = lVar;
            this.f110031h = composeView;
        }

        /* renamed from: l */
        public void c(r rVar) {
            C17542s.j(rVar, "viewModel");
            ComposeView composeView = this.f110031h;
            l lVar = this.f110032i;
            super.c(rVar);
            e.l(composeView, false, c1.c.c(-427604313, true, new C2640a(rVar, lVar)), 1, (Object) null);
        }
    }

    public l(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f110030b = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof r;
    }

    public c<r> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
