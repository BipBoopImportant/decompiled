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
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import ci.C9490p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lei/v;", "LLg/a;", "Lei/w;", "Lei/u;", "extraDisclaimersActions", "<init>", "(Lei/u;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lei/v$a;", "f", "(Landroid/view/ViewGroup;)Lei/v$a;", "b", "Lei/u;", "e", "()Lei/u;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ei.v  reason: case insensitive filesystem */
public final class C9680v extends Lg.a<C9681w> {

    /* renamed from: b  reason: collision with root package name */
    private final C9679u f72918b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/v$a;", "LLg/c;", "Lei/w;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/v;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lei/w;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ei.v$a */
    public final class a extends c<C9681w> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72919h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C9680v f72920i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.v$a$a  reason: collision with other inner class name */
        static final class C1268a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C9681w f72921a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C9680v f72922b;

            C1268a(C9681w wVar, C9680v vVar) {
                this.f72921a = wVar;
                this.f72922b = vVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1278856862, i10, -1, "com.ingka.ikea.app.productinformationpage.v2.delegates.ExtraDisclaimersDelegate.ViewHolder.bind.<anonymous>.<anonymous> (ExtraDisclaimersDelegate.kt:42)");
                    }
                    C9490p.d(this.f72921a.a(), this.f72922b.e().a(), e.i(d.f18749a), mVar, 0, 0);
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
        public a(C9680v vVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72920i = vVar;
            this.f72919h = composeView;
        }

        /* renamed from: l */
        public void c(C9681w wVar) {
            C17542s.j(wVar, "viewModel");
            super.c(wVar);
            e.l(this.f72919h, false, c1.c.c(1278856862, true, new C1268a(wVar, this.f72920i)), 1, (Object) null);
        }
    }

    public C9680v(C9679u uVar) {
        C17542s.j(uVar, "extraDisclaimersActions");
        this.f72918b = uVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C9681w;
    }

    public final C9679u e() {
        return this.f72918b;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
