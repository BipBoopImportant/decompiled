package Vi;

import Lg.c;
import TC.e;
import U0.C4889m;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LVi/u0;", "LLg/a;", "LVi/v0;", "LVi/s0;", "actions", "<init>", "(LVi/s0;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/u0$a;", "f", "(Landroid/view/ViewGroup;)LVi/u0$a;", "b", "LVi/s0;", "e", "()LVi/s0;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 extends Lg.a<v0> {

    /* renamed from: b  reason: collision with root package name */
    private final s0 f88639b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVi/u0$a;", "LLg/c;", "LVi/v0;", "Landroidx/compose/ui/platform/ComposeView;", "view", "<init>", "(LVi/u0;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LVi/v0;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "getView", "()Landroidx/compose/ui/platform/ComposeView;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<v0> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f88640h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ u0 f88641i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Vi.u0$a$a  reason: collision with other inner class name */
        static final class C1874a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ u0 f88642a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f88643b;

            C1874a(u0 u0Var, a aVar) {
                this.f88642a = u0Var;
                this.f88643b = aVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(u0 u0Var, a aVar) {
                u0Var.e().a(((v0) aVar.g()).g());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(U0.C4889m r19, int r20) {
                /*
                    r18 = this;
                    r0 = r18
                    r14 = r19
                    r1 = r20
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0016
                    boolean r2 = r19.l()
                    if (r2 != 0) goto L_0x0012
                    goto L_0x0016
                L_0x0012:
                    r19.L()
                    goto L_0x0086
                L_0x0016:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0025
                    r2 = -1
                    java.lang.String r3 = "com.ingka.ikea.app.scanandgoonlineredesign.adapter.delegate.UserReviewsDelegate.ViewHolder.bind.<anonymous>.<anonymous> (UserReviewsDelegate.kt:49)"
                    r4 = 1606322313(0x5fbe8889, float:2.7458748E19)
                    U0.C4895p.S(r4, r1, r2, r3)
                L_0x0025:
                    int r1 = Oo.b.f84761q7
                    r2 = 0
                    java.lang.String r1 = J1.j.b(r1, r14, r2)
                    SC.g1 r9 = SC.C13589g1.Large
                    SC.b1$c r6 = SC.C13569b1.c.f116146b
                    r2 = 1756222969(0x68add5f9, float:6.567332E24)
                    r14.W(r2)
                    Vi.u0 r2 = r0.f88642a
                    boolean r2 = r14.F(r2)
                    Vi.u0$a r3 = r0.f88643b
                    boolean r3 = r14.F(r3)
                    r2 = r2 | r3
                    Vi.u0 r3 = r0.f88642a
                    Vi.u0$a r4 = r0.f88643b
                    java.lang.Object r5 = r19.D()
                    if (r2 != 0) goto L_0x0055
                    U0.m$a r2 = U0.C4889m.f14007a
                    java.lang.Object r2 = r2.a()
                    if (r5 != r2) goto L_0x005d
                L_0x0055:
                    Vi.t0 r5 = new Vi.t0
                    r5.<init>(r3, r4)
                    r14.u(r5)
                L_0x005d:
                    r2 = r5
                    nI.a r2 = (nI.C17631a) r2
                    r19.P()
                    int r3 = SC.C13569b1.c.f116147c
                    int r3 = r3 << 15
                    r4 = 100663296(0x6000000, float:2.4074124E-35)
                    r15 = r3 | r4
                    r16 = 6
                    r17 = 6876(0x1adc, float:9.635E-42)
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r7 = 0
                    r8 = 0
                    r10 = 0
                    r11 = 1
                    r12 = 0
                    r13 = 0
                    r14 = r19
                    SC.C13585f1.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x0086
                    U0.C4895p.R()
                L_0x0086:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Vi.u0.a.C1874a.b(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(u0 u0Var, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "view");
            this.f88641i = u0Var;
            this.f88640h = composeView;
        }

        /* renamed from: l */
        public void c(v0 v0Var) {
            C17542s.j(v0Var, "viewModel");
            super.c(v0Var);
            e.l(this.f88640h, false, c1.c.c(1606322313, true, new C1874a(this.f88641i, this)), 1, (Object) null);
        }
    }

    public u0(s0 s0Var) {
        C17542s.j(s0Var, "actions");
        this.f88639b = s0Var;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof v0;
    }

    public final s0 e() {
        return this.f88639b;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
