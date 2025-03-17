package Vi;

import Lg.c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import Wi.b;
import XH.C16807N;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LVi/Q;", "LLg/a;", "LVi/T;", "LVi/S;", "listener", "<init>", "(LVi/S;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LVi/S;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Q extends Lg.a<T> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final S f88511b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVi/Q$a;", "LLg/c;", "LVi/T;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LVi/Q;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LVi/T;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<T> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f88512h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Q f88513i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vi.Q$a$a  reason: collision with other inner class name */
        static final class C1868a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ T f88514a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f88515b;

            C1868a(T t10, Q q10) {
                this.f88514a = t10;
                this.f88515b = q10;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(Q q10, T t10) {
                q10.f88511b.a(t10);
                return C16807N.f139792a;
            }

            public final void b(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-314388138, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.adapter.delegate.NoticeDelegate.NoticeViewHolder.bind.<anonymous> (NoticeDelegate.kt:61)");
                    }
                    String h10 = this.f88514a.h();
                    Integer g10 = this.f88514a.g();
                    mVar.W(1353839383);
                    boolean F10 = mVar.F(this.f88515b) | mVar.V(this.f88514a);
                    Q q10 = this.f88515b;
                    T t10 = this.f88514a;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new P(q10, t10);
                        mVar.u(D10);
                    }
                    C17631a aVar = (C17631a) D10;
                    mVar.P();
                    b.b(h10, g10, this.f88514a.i() ? aVar : null, mVar, 0, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Q q10, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f88513i = q10;
            this.f88512h = composeView;
        }

        /* renamed from: l */
        public void c(T t10) {
            C17542s.j(t10, "viewModel");
            super.c(t10);
            e.l(this.f88512h, false, c1.c.c(-314388138, true, new C1868a(t10, this.f88513i)), 1, (Object) null);
        }
    }

    public Q(S s10) {
        C17542s.j(s10, "listener");
        this.f88511b = s10;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof T;
    }

    public c<T> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
