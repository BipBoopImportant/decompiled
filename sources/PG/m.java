package pg;

import Lg.c;
import SC.C13611m;
import SC.R0;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qg.o;
import tK.C18029u;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpg/m;", "LLg/a;", "Lqg/o;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends Lg.a<o> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpg/m$a;", "LLg/c;", "Lqg/o;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lpg/m;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lqg/o;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<o> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f75915h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ m f75916i;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"pg/m$a$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pg.m$a$a  reason: collision with other inner class name */
        public static final class C1392a implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f75917a;

            public C1392a(View view) {
                this.f75917a = view;
            }

            public void onViewAttachedToWindow(View view) {
                this.f75917a.removeOnAttachStateChangeListener(this);
                C17542s.h(view, "null cannot be cast to non-null type android.view.ViewGroup");
                View childAt = ((ViewGroup) view).getChildAt(0);
                if (childAt != null) {
                    childAt.setFocusable(false);
                }
            }

            public void onViewDetachedFromWindow(View view) {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f75918a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: pg.m$a$b$a  reason: collision with other inner class name */
            static final class C1393a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ o f75919a;

                C1393a(o oVar) {
                    this.f75919a = oVar;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(-1358005354, i10, -1, "com.ingka.ikea.app.dynamicfields.ui.delegate.InformationMessageDelegate.ViewHolder.bind.<anonymous>.<anonymous>.<anonymous> (InformationMessageDelegate.kt:61)");
                        }
                        R0.e(this.f75919a.y(), C13611m.INFORMATIVE, false, D.k(e.i(d.f18749a), 0.0f, C18029u.f147649a.a(), 1, (Object) null), (String) null, true, mVar, 197040, 16);
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

            b(o oVar) {
                this.f75918a = oVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(410932156, i10, -1, "com.ingka.ikea.app.dynamicfields.ui.delegate.InformationMessageDelegate.ViewHolder.bind.<anonymous>.<anonymous> (InformationMessageDelegate.kt:60)");
                    }
                    e.e(false, c1.c.e(-1358005354, true, new C1393a(this.f75918a), mVar, 54), mVar, 48, 1);
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
        public a(m mVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f75916i = mVar;
            this.f75915h = composeView;
            composeView.setFocusable(false);
            composeView.setFocusableInTouchMode(false);
            if (composeView.isAttachedToWindow()) {
                C17542s.h(composeView, "null cannot be cast to non-null type android.view.ViewGroup");
                View childAt = composeView.getChildAt(0);
                if (childAt != null) {
                    childAt.setFocusable(false);
                    return;
                }
                return;
            }
            composeView.addOnAttachStateChangeListener(new C1392a(composeView));
        }

        /* renamed from: l */
        public void c(o oVar) {
            C17542s.j(oVar, "viewModel");
            super.c(oVar);
            this.f75915h.setContent(c1.c.c(410932156, true, new b(oVar)));
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof o;
    }

    public c<o> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
