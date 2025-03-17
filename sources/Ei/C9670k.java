package ei;

import Lg.c;
import Op.C10824b;
import Op.C10828d;
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
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lei/k;", "LLg/a;", "LOp/d$b;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ei.k  reason: case insensitive filesystem */
public final class C9670k extends Lg.a<C10828d.b> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/k$a;", "LLg/c;", "LOp/d$b;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/k;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LOp/d$b;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ei.k$a */
    public final class a extends c<C10828d.b> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72876h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C9670k f72877i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.k$a$a  reason: collision with other inner class name */
        static final class C1263a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C10828d.b f72878a;

            C1263a(C10828d.b bVar) {
                this.f72878a = bVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-492523925, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.BadgeDelegate.ViewHolder.bind.<anonymous>.<anonymous> (BadgeDelegate.kt:35)");
                    }
                    C10824b.b(this.f72878a, D.k(e.i(d.f18749a), 0.0f, h.B((float) 8), 1, (Object) null), mVar, 0, 0);
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
        public a(C9670k kVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72877i = kVar;
            this.f72876h = composeView;
        }

        /* renamed from: l */
        public void c(C10828d.b bVar) {
            C17542s.j(bVar, "viewModel");
            super.c(bVar);
            e.l(this.f72876h, false, c1.c.c(-492523925, true, new C1263a(bVar)), 1, (Object) null);
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10828d.b;
    }

    public c<C10828d.b> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
