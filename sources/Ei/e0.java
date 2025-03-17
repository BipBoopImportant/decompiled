package ei;

import Lg.c;
import TC.e;
import U0.C4889m;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import gi.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lei/e0;", "LLg/a;", "Lgi/Q;", "Lkotlin/Function1;", "", "LXH/N;", "onClick", "<init>", "(LnI/l;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "LnI/l;", "e", "()LnI/l;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 extends Lg.a<Q> {

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<String, C16807N> f72846b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei/e0$a;", "LLg/c;", "Lgi/Q;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lei/e0;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lgi/Q;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<Q> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f72847h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e0 f72848i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ei.e0$a$a  reason: collision with other inner class name */
        static final class C1261a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Q f72849a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e0 f72850b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f72851c;

            C1261a(Q q10, e0 e0Var, a aVar) {
                this.f72849a = q10;
                this.f72850b = e0Var;
                this.f72851c = aVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(e0 e0Var, a aVar) {
                e0Var.e().invoke(((Q) aVar.g()).a());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r8, int r9) {
                /*
                    r7 = this;
                    r0 = r9 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0010
                    boolean r0 = r8.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0010
                L_0x000c:
                    r8.L()
                    goto L_0x006e
                L_0x0010:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x001f
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.app.productinformationpage.v2.delegates.ReviewsDelegate.ViewHolder.bind.<anonymous> (ReviewsDelegate.kt:36)"
                    r2 = 220403012(0xd231544, float:5.025385E-31)
                    U0.C4895p.S(r2, r9, r0, r1)
                L_0x001f:
                    gi.Q r9 = r7.f72849a
                    float r0 = r9.c()
                    gi.Q r9 = r7.f72849a
                    int r1 = r9.b()
                    r9 = -1326822169(0xffffffffb0ea4ce7, float:-1.7047598E-9)
                    r8.W(r9)
                    ei.e0 r9 = r7.f72850b
                    boolean r9 = r8.V(r9)
                    ei.e0$a r2 = r7.f72851c
                    boolean r2 = r8.F(r2)
                    r9 = r9 | r2
                    ei.e0 r2 = r7.f72850b
                    ei.e0$a r3 = r7.f72851c
                    java.lang.Object r4 = r8.D()
                    if (r9 != 0) goto L_0x0050
                    U0.m$a r9 = U0.C4889m.f14007a
                    java.lang.Object r9 = r9.a()
                    if (r4 != r9) goto L_0x0058
                L_0x0050:
                    ei.d0 r4 = new ei.d0
                    r4.<init>(r2, r3)
                    r8.u(r4)
                L_0x0058:
                    r3 = r4
                    nI.a r3 = (nI.C17631a) r3
                    r8.P()
                    r5 = 0
                    r6 = 4
                    r2 = 0
                    r4 = r8
                    ci.P.c(r0, r1, r2, r3, r4, r5, r6)
                    boolean r8 = U0.C4895p.J()
                    if (r8 == 0) goto L_0x006e
                    U0.C4895p.R()
                L_0x006e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ei.e0.a.C1261a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f72848i = e0Var;
            this.f72847h = composeView;
        }

        /* renamed from: l */
        public void c(Q q10) {
            C17542s.j(q10, "viewModel");
            super.c(q10);
            e.l(this.f72847h, false, c1.c.c(220403012, true, new C1261a(q10, this.f72848i, this)), 1, (Object) null);
        }
    }

    public e0(C17642l<? super String, C16807N> lVar) {
        C17542s.j(lVar, "onClick");
        this.f72846b = lVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof Q;
    }

    public c<Q> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }

    public final C17642l<String, C16807N> e() {
        return this.f72846b;
    }
}
