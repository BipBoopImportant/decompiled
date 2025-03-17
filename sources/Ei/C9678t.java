package ei;

import KJ.C15985a;
import Lg.c;
import TC.e;
import Th.b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ci.C9486l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lei/t;", "LLg/a;", "LTh/b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ei.t  reason: case insensitive filesystem */
public final class C9678t extends Lg.a<b> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/t$a;", "LLg/c;", "LTh/b;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/t;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LTh/b;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ei.t$a */
    public final class a extends c<b> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72915h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C9678t f72916i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.t$a$a  reason: collision with other inner class name */
        static final class C1267a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f72917a;

            C1267a(b bVar) {
                this.f72917a = bVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1666917109, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.DisclaimerDelegate.ViewHolder.bind.<anonymous> (DisclaimerDelegate.kt:33)");
                    }
                    C9486l.b(C15985a.l(this.f72917a.b()), this.f72917a.a(), mVar, 0);
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
        public a(C9678t tVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72916i = tVar;
            this.f72915h = composeView;
        }

        /* renamed from: l */
        public void c(b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            e.l(this.f72915h, false, c1.c.c(-1666917109, true, new C1267a(bVar)), 1, (Object) null);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof b;
    }

    public c<b> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
