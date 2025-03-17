package Zn;

import E1.C4478k;
import Eg.c;
import HJ.C15854t;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import N1.P;
import Nn.C10800c;
import O0.C4762x0;
import O0.H0;
import O0.J0;
import O0.L0;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import SC.C13607l;
import SC.C13643u0;
import SC.Y2;
import TC.C13679b;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import U0.p1;
import Wn.o;
import XH.C16807N;
import XH.t;
import XH.y;
import Yn.C10993h;
import Yn.C10994i;
import Yn.G;
import Yn.O;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import bo.f;
import c1.C5264a;
import com.ingka.ikea.checkout.impl.k0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ho.C11374a;
import i1.C5437c;
import java.util.ArrayList;
import java.util.List;
import jo.C11436b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.C5747v0;
import p1.C5749w0;
import p1.i1;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import r0.m;
import rv.C11849b;
import s0.C5834E;
import s0.C5844O;
import s0.C5848T;
import s0.C5850V;
import t0.C5938c;
import t0.x;
import t1.C5942c;
import tK.C18030v;
import uK.C18146a;
import xg.C10396a;
import xg.n;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aC\u0010\u0018\u001a\u00020\b*\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aK\u0010!\u001a\u00020\b*\u00020\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\b0\u001eH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010#\u001a\u00020\b*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$\u001aI\u0010%\u001a\u00020\b*\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001c2\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\b0\u001eH\u0002¢\u0006\u0004\b%\u0010\"\u001a#\u0010(\u001a\u00020\b*\u00020\u00152\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)\u001a!\u0010-\u001a\u00020\b*\u00020\u00152\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b-\u0010.\u001aK\u00104\u001a\u00020\b*\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b0\u001eH\u0002¢\u0006\u0004\b4\u00105\u001a#\u00108\u001a\u00020\b*\u00020\u00152\u0006\u00107\u001a\u0002062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b8\u00109\u001a)\u0010=\u001a\u00020\b*\u00020\u00152\u0006\u0010;\u001a\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0002¢\u0006\u0004\b=\u0010>\u001a)\u0010@\u001a\u00020\b*\u00020\u00152\u0006\u0010;\u001a\u00020?2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0002¢\u0006\u0004\b@\u0010A\u001a/\u0010D\u001a\u00020\b*\u00020\u00152\u0006\u0010B\u001a\u00020\u001f2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001eH\u0002¢\u0006\u0004\bD\u0010E\u001a+\u0010H\u001a\u00020\b*\u00020\u00152\u0006\u0010G\u001a\u00020F2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\bH\u0010I\u001a\u0017\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010M¨\u0006N²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u0002"}, d2 = {"Lbo/f;", "viewModel", "LEg/c;", "surveyViewModel", "LZn/K;", "orderConfirmationCallbacks", "LWn/o;", "deliveryDetailsAnalytics", "LXH/N;", "l", "(Lbo/f;LEg/c;LZn/K;LWn/o;LU0/m;I)V", "Lbo/f$b;", "uiState", "LEg/c$a;", "surveyState", "Lxg/a;", "surveyCallbacks", "Landroidx/compose/ui/d;", "modifier", "p", "(Lbo/f$b;LEg/c$a;LWn/o;LZn/K;Lxg/a;Landroidx/compose/ui/d;LU0/m;II)V", "Lt0/x;", "Lc2/h;", "verticalSpacing", "N", "(Lt0/x;Lbo/f$b;FLWn/o;LZn/K;LEg/c$a;Lxg/a;)V", "Lbo/f$b$a$e;", "viewOrderDetails", "Lkotlin/Function0;", "onContinueClicked", "Lkotlin/Function1;", "", "onViewOrderClicked", "P", "(Lt0/x;Lbo/f$b$a$e;FLnI/a;LnI/l;)V", "K", "(Lt0/x;F)V", "F", "LRC/m;", "priceSummary", "I", "(Lt0/x;LRC/m;F)V", "LKJ/c;", "LYn/i;", "userDetails", "L", "(Lt0/x;LKJ/c;)V", "Ljo/b;", "deliveryDetails", "onDeliveryItemsClicked", "Llo/j;", "onAddToCalendarClicked", "x", "(Lt0/x;Ljo/b;LWn/o;LnI/l;LnI/l;)V", "Lbo/f$b$a$c;", "payment", "H", "(Lt0/x;Lbo/f$b$a$c;F)V", "Lbo/f$b$a$a;", "model", "onClick", "v", "(Lt0/x;Lbo/f$b$a$a;LnI/a;)V", "Lbo/f$b$a$b;", "G", "(Lt0/x;Lbo/f$b$a$b;LnI/a;)V", "contactUri", "contactClicked", "w", "(Lt0/x;Ljava/lang/String;LnI/l;)V", "Lbo/f$b$a$d;", "surveyConfig", "J", "(Lt0/x;Lbo/f$b$a$d;LEg/c$a;Lxg/a;)V", "", "cause", "M", "(Ljava/lang/Throwable;)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f90031a;

        a(L0 l02) {
            this.f90031a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1811185594, i10, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.OrderConfirmationScreen.<anonymous> (OrderConfirmationScreen.kt:92)");
                }
                Y2.c(this.f90031a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Eg.c f90032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f90033b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f90034c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<f.b> f90035d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<c.a> f90036e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L0 f90037f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ bo.f f90038g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.confirmation.compose.OrderConfirmationScreenKt$OrderConfirmationScreen$2$4$1$1", f = "OrderConfirmationScreen.kt", l = {124}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f90039c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ L0 f90040d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f90041e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ bo.f f90042f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(L0 l02, String str, bo.f fVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f90040d = l02;
                this.f90041e = str;
                this.f90042f = fVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f90040d, this.f90041e, this.f90042f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f90039c;
                if (i10 == 0) {
                    y.b(obj);
                    L0 l02 = this.f90040d;
                    String str = this.f90041e;
                    this.f90039c = 1;
                    if (L0.f(l02, str, (String) null, false, (J0) null, this, 14, (Object) null) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f90042f.I();
                return C16807N.f139792a;
            }
        }

        b(Eg.c cVar, o oVar, K k10, A1<f.b> a12, A1<? extends c.a> a13, L0 l02, bo.f fVar) {
            this.f90032a = cVar;
            this.f90033b = oVar;
            this.f90034c = k10;
            this.f90035d = a12;
            this.f90036e = a13;
            this.f90037f = l02;
            this.f90038g = fVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(Eg.c cVar, String str, String str2) {
            C17542s.j(str, "id");
            C17542s.j(str2, "text");
            cVar.L(str, str2);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(Eg.c cVar, Cg.a aVar) {
            C17542s.j(aVar, "it");
            cVar.I(aVar);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(Eg.c cVar) {
            cVar.H();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nI.p} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(s0.C5834E r10, U0.C4889m r11, int r12) {
            /*
                r9 = this;
                java.lang.String r0 = "padding"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                r0 = r12 & 6
                if (r0 != 0) goto L_0x0013
                boolean r0 = r11.V(r10)
                if (r0 == 0) goto L_0x0011
                r0 = 4
                goto L_0x0012
            L_0x0011:
                r0 = 2
            L_0x0012:
                r12 = r12 | r0
            L_0x0013:
                r0 = r12 & 19
                r1 = 18
                if (r0 != r1) goto L_0x0025
                boolean r0 = r11.l()
                if (r0 != 0) goto L_0x0020
                goto L_0x0025
            L_0x0020:
                r11.L()
                goto L_0x012b
            L_0x0025:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0034
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.checkout.impl.confirmation.compose.OrderConfirmationScreen.<anonymous> (OrderConfirmationScreen.kt:97)"
                r2 = -1548092975(0xffffffffa3b9f9d1, float:-2.0163542E-17)
                U0.C4895p.S(r2, r12, r0, r1)
            L_0x0034:
                U0.A1<bo.f$b> r12 = r9.f90035d
                bo.f$b r0 = Zn.h0.n(r12)
                U0.A1<Eg.c$a> r12 = r9.f90036e
                Eg.c$a r1 = Zn.h0.m(r12)
                androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.h(r12, r10)
                r10 = -230060741(0xfffffffff2498d3b, float:-3.9921423E30)
                r11.W(r10)
                Eg.c r10 = r9.f90032a
                boolean r10 = r11.F(r10)
                Eg.c r12 = r9.f90032a
                java.lang.Object r2 = r11.D()
                if (r10 != 0) goto L_0x0062
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r2 != r10) goto L_0x006a
            L_0x0062:
                Zn.i0 r2 = new Zn.i0
                r2.<init>(r12)
                r11.u(r2)
            L_0x006a:
                nI.p r2 = (nI.p) r2
                r11.P()
                r10 = -230049287(0xfffffffff249b9f9, float:-3.995604E30)
                r11.W(r10)
                Eg.c r10 = r9.f90032a
                boolean r10 = r11.F(r10)
                Eg.c r12 = r9.f90032a
                java.lang.Object r3 = r11.D()
                if (r10 != 0) goto L_0x008b
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r3 != r10) goto L_0x0093
            L_0x008b:
                Zn.j0 r3 = new Zn.j0
                r3.<init>(r12)
                r11.u(r3)
            L_0x0093:
                nI.l r3 = (nI.C17642l) r3
                r11.P()
                r10 = -230053032(0xfffffffff249ab58, float:-3.9944722E30)
                r11.W(r10)
                Eg.c r10 = r9.f90032a
                boolean r10 = r11.F(r10)
                Eg.c r12 = r9.f90032a
                java.lang.Object r4 = r11.D()
                if (r10 != 0) goto L_0x00b4
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r4 != r10) goto L_0x00bc
            L_0x00b4:
                Zn.k0 r4 = new Zn.k0
                r4.<init>(r12)
                r11.u(r4)
            L_0x00bc:
                nI.a r4 = (nI.C17631a) r4
                r11.P()
                xg.a r10 = new xg.a
                r10.<init>(r2, r3, r4)
                Wn.o r2 = r9.f90033b
                Zn.K r3 = r9.f90034c
                int r12 = Eg.c.a.f60242a
                int r12 = r12 << 3
                int r4 = xg.C10396a.f77758d
                int r4 = r4 << 12
                r7 = r12 | r4
                r8 = 0
                r4 = r10
                r6 = r11
                Zn.h0.p(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                U0.A1<bo.f$b> r10 = r9.f90035d
                bo.f$b r10 = Zn.h0.n(r10)
                IC.e r10 = r10.b()
                if (r10 != 0) goto L_0x00e7
                goto L_0x0122
            L_0x00e7:
                O0.L0 r0 = r9.f90037f
                bo.f r1 = r9.f90038g
                int r12 = IC.C13023e.f110931a
                java.lang.String r2 = r10.a(r11, r12)
                r10 = 1048825869(0x3e83d00d, float:0.25744668)
                r11.W(r10)
                boolean r10 = r11.V(r2)
                boolean r12 = r11.F(r1)
                r10 = r10 | r12
                java.lang.Object r12 = r11.D()
                if (r10 != 0) goto L_0x010e
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r12 != r10) goto L_0x0117
            L_0x010e:
                Zn.h0$b$a r12 = new Zn.h0$b$a
                r10 = 0
                r12.<init>(r0, r2, r1, r10)
                r11.u(r12)
            L_0x0117:
                r3 = r12
                nI.p r3 = (nI.p) r3
                r11.P()
                r5 = 6
                r4 = r11
                U0.P.e(r0, r1, r2, r3, r4, r5)
            L_0x0122:
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x012b
                U0.C4895p.R()
            L_0x012b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Zn.h0.b.e(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            e((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.b.a.C1968a f90043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f90044b;

        c(f.b.a.C1968a aVar, C17631a<C16807N> aVar2) {
            this.f90043a = aVar;
            this.f90044b = aVar2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(701579152, i11, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemAssemblyInformationWithDivider.<anonymous> (OrderConfirmationScreen.kt:505)");
                }
                C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                C13023e c10 = this.f90043a.c();
                int i12 = C13023e.f110931a;
                String a10 = c10.a(mVar2, i12);
                String a11 = this.f90043a.a().a(mVar2, i12);
                C13573c1.a aVar = r6;
                C13573c1.a aVar2 = new C13573c1.a(C18146a.f148738z3, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null);
                C13585f1.c(a10, this.f90044b, (androidx.compose.ui.d) null, a11, aVar, C13569b1.d.f116148b, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, C13589g1.Large, 0.0f, true, false, (m) null, mVar, (C13573c1.a.f116164f << 12) | 100663296 | (C13569b1.d.f116149c << 15), 6, 6852);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f90045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f90046b;

        d(C17642l<? super String, C16807N> lVar, String str) {
            this.f90045a = lVar;
            this.f90046b = str;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, String str) {
            lVar.invoke(str);
            return C16807N.f139792a;
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2015030854, i10, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemContactUsFooter.<anonymous> (OrderConfirmationScreen.kt:549)");
                }
                mVar.W(-224596156);
                boolean V10 = mVar.V(this.f90045a) | mVar.V(this.f90046b);
                C17642l<String, C16807N> lVar = this.f90045a;
                String str = this.f90046b;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new l0(lVar, str);
                    mVar.u(D10);
                }
                mVar.P();
                J.b((C17631a) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11436b f90047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G f90048b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f90049c;

        e(C11436b bVar, G g10, o oVar) {
            this.f90047a = bVar;
            this.f90048b = g10;
            this.f90049c = oVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(415919803, i11, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemDeliveryDetailsWithDivider.<anonymous> (OrderConfirmationScreen.kt:467)");
                }
                C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                O.h(this.f90047a, this.f90048b, C11374a.C2202a.CONFIRMATION, this.f90049c, D.m(androidx.compose.ui.d.f18749a, 0.0f, 0.0f, 0.0f, c2.h.B((float) 8), 7, (Object) null), mVar, 24960, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f90050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.b.a.e f90051b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f90052c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f90053d;

        f(float f10, f.b.a.e eVar, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar) {
            this.f90050a = f10;
            this.f90051b = eVar;
            this.f90052c = aVar;
            this.f90053d = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2059276086, i10, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemOrderConfirmationCta.<anonymous> (OrderConfirmationScreen.kt:367)");
                }
                String str = null;
                androidx.compose.ui.d k10 = D.k(androidx.compose.ui.d.f18749a, 0.0f, this.f90050a, 1, (Object) null);
                f.b.a.e eVar = this.f90051b;
                if (eVar != null) {
                    str = eVar.a();
                }
                N.c(str, this.f90052c, this.f90053d, k10, mVar, 0, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.b.a.C1969b f90054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f90055b;

        g(f.b.a.C1969b bVar, C17631a<C16807N> aVar) {
            this.f90054a = bVar;
            this.f90055b = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1887518730, i11, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemOrderSummaryWithDivider.<anonymous> (OrderConfirmationScreen.kt:529)");
                }
                C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                C13023e b10 = this.f90054a.b();
                int i12 = C13023e.f110931a;
                C13585f1.c(b10.a(mVar2, i12), this.f90055b, (androidx.compose.ui.d) null, this.f90054a.a().a(mVar2, i12), (C13573c1) null, C13569b1.d.f116148b, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, C13589g1.Large, 0.0f, true, false, (m) null, mVar, (C13569b1.d.f116149c << 15) | 100663296, 6, 6868);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.b.a.c f90056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f90057b;

        h(f.b.a.c cVar, float f10) {
            this.f90056a = cVar;
            this.f90057b = f10;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(289986907, i10, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemPaymentTransactionsWithDivider.<anonymous> (OrderConfirmationScreen.kt:486)");
                }
                C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                f.b.a.c cVar2 = this.f90056a;
                float f10 = this.f90057b;
                s0.l(cVar2.b(), cVar2.a(), D.k(androidx.compose.ui.d.f18749a, 0.0f, f10, 1, (Object) null), mVar, 0, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f90058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RC.m f90059b;

        i(float f10, RC.m mVar) {
            this.f90058a = f10;
            this.f90059b = mVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(String str) {
            C17542s.j(str, "it");
            h0.M(new IllegalStateException("Unexpected onDeleteTransactionCallback"));
            return C16807N.f139792a;
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-895237886, i10, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemPriceSummaryWithDivider.<anonymous> (OrderConfirmationScreen.kt:384)");
                }
                C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                androidx.compose.ui.d k10 = D.k(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, this.f90058a, 1, (Object) null);
                RC.m mVar2 = this.f90059b;
                mVar.W(1981729570);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new m0();
                    mVar.u(D10);
                }
                mVar.P();
                RC.l.r(mVar2, k10, (C17642l) D10, mVar, RC.m.f115340m | 384, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a f90060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.b.a.d f90061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C10396a f90062c;

        j(c.a aVar, f.b.a.d dVar, C10396a aVar2) {
            this.f90060a = aVar;
            this.f90061b = dVar;
            this.f90062c = aVar2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(657971011, i10, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemSurvey.<anonymous> (OrderConfirmationScreen.kt:566)");
                }
                c.a aVar = this.f90060a;
                if (!C17542s.e(aVar, c.a.b.f60244b) && !C17542s.e(aVar, c.a.C0983a.f60243b)) {
                    if (aVar instanceof c.a.C0984c) {
                        n.w(this.f90061b.b(), this.f90061b.a(), (c.a.C0984c) this.f90060a, this.f90062c, androidx.compose.foundation.b.d(androidx.compose.ui.d.f18749a, C18030v.f147664a.a(mVar, C18030v.f147665b).l0(), (i1) null, 2, (Object) null), mVar, (c.a.C0984c.f60245f << 6) | (C10396a.f77758d << 9), 0);
                    } else {
                        throw new t();
                    }
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f90063a;

        k(float f10) {
            this.f90063a = f10;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11;
            C5938c cVar2 = cVar;
            C4889m mVar2 = mVar;
            C17542s.j(cVar2, "$this$item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1346615983, i11, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemTopContent.<anonymous> (OrderConfirmationScreen.kt:321)");
                }
                C5942c c10 = J1.e.c(k0.f94607a, mVar2, 0);
                d.a aVar = androidx.compose.ui.d.f18749a;
                C5583F.a(c10, (String) null, cVar2.c(J.h(C5116k1.a(aVar, "OrderConfirmationTestTags.HEADER_IMAGE"), 0.0f, 1, (Object) null), 0.3f), (C5437c) null, C4478k.f5915a.d(), 0.0f, (C5749w0) null, mVar, 24624, 104);
                C4889m mVar3 = mVar;
                C13607l.j(J1.j.b(C11849b.f102181E2, mVar2, 0), C13679b.C2857b.C2858b.f116684a, D.m(TC.e.i(J.h(aVar, 0.0f, 1, (Object) null)), 0.0f, c2.h.B((float) 32), 0.0f, c2.h.B((float) 16), 5, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262136);
                d.a aVar2 = aVar;
                C13607l.j(J1.j.b(C11849b.f102374z2, mVar, 0), C13679b.a.C2856b.f116680a, TC.e.i(J.h(aVar2, 0.0f, 1, (Object) null)), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262136);
                C5844O.a(D.m(aVar2, 0.0f, 0.0f, 0.0f, this.f90063a, 7, (Object) null), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C10994i> f90064a;

        l(C15987c<C10994i> cVar) {
            this.f90064a = cVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(365496851, i11, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.itemUserDetailsWithDivider.<anonymous> (OrderConfirmationScreen.kt:407)");
                }
                C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                C10993h.b(this.f90064a, (C17631a<C16807N>) null, C13589g1.Medium, D.k(androidx.compose.ui.d.f18749a, 0.0f, c2.h.B((float) 8), 1, (Object) null), mVar, 3504, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(C10800c cVar) {
        C17542s.j(cVar, "it");
        M(new IllegalStateException("Unexpected onCapabilityQuestionClicked"));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(String str, Nn.O o10) {
        C17542s.j(str, "<unused var>");
        C17542s.j(o10, "<unused var>");
        M(new IllegalStateException("Unexpected onChangeTimeSlotClicked"));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C() {
        M(new IllegalStateException("Unexpected onConfirmDeliveryClicked"));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D() {
        M(new IllegalStateException("Unexpected onCompareDeliveryPrices"));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E() {
        M(new IllegalStateException("Unexpected onChangeDeliveryMethodClicked"));
        return C16807N.f139792a;
    }

    private static final void F(x xVar, f.b.a.e eVar, float f10, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar) {
        O o10 = O.CTA_BUTTONS;
        xVar.b(o10, o10, c1.c.c(-2059276086, true, new f(f10, eVar, aVar, lVar)));
    }

    private static final void G(x xVar, f.b.a.C1969b bVar, C17631a<C16807N> aVar) {
        O o10 = O.ORDER_SUMMARY;
        xVar.b(o10, o10, c1.c.c(-1887518730, true, new g(bVar, aVar)));
    }

    private static final void H(x xVar, f.b.a.c cVar, float f10) {
        O o10 = O.PAYMENT_TRANSACTIONS;
        xVar.b(o10, o10, c1.c.c(289986907, true, new h(cVar, f10)));
    }

    private static final void I(x xVar, RC.m mVar, float f10) {
        O o10 = O.PRICE_SUMMARY;
        xVar.b(o10, o10, c1.c.c(-895237886, true, new i(f10, mVar)));
    }

    private static final void J(x xVar, f.b.a.d dVar, c.a aVar, C10396a aVar2) {
        O o10 = O.SURVEY;
        xVar.b(o10, o10, c1.c.c(657971011, true, new j(aVar, dVar, aVar2)));
    }

    private static final void K(x xVar, float f10) {
        O o10 = O.TOP_CONTENT;
        xVar.b(o10, o10, c1.c.c(1346615983, true, new k(f10)));
    }

    private static final void L(x xVar, C15987c<C10994i> cVar) {
        O o10 = O.USER_DETAILS;
        xVar.b(o10, o10, c1.c.c(365496851, true, new l(cVar)));
    }

    /* access modifiers changed from: private */
    public static final void M(Throwable th2) {
        qv.e eVar = qv.e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, th2);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "OrderConfirmationScreen";
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, th2, str3);
            str = str3;
            str2 = str4;
        }
    }

    private static final void N(x xVar, f.b bVar, float f10, o oVar, K k10, c.a aVar, C10396a aVar2) {
        String c10;
        f.b.a.d h10;
        RC.m g10;
        f.b.a.C1969b e10;
        f.b.a.C1968a a10;
        C11436b d10;
        List<C10994i> b10;
        f.b.a.c f11;
        f.b.a c11 = bVar.c();
        if (!(c11 == null || (f11 = c11.f()) == null)) {
            H(xVar, f11, f10);
        }
        f.b.a c12 = bVar.c();
        if (!(c12 == null || (b10 = c12.b()) == null)) {
            L(xVar, C15985a.h(b10));
        }
        f.b.a c13 = bVar.c();
        if (!(c13 == null || (d10 = c13.d()) == null)) {
            x(xVar, d10, oVar, k10.f(), k10.a());
        }
        f.b.a c14 = bVar.c();
        if (!(c14 == null || (a10 = c14.a()) == null)) {
            v(xVar, a10, new a0(k10, a10));
        }
        f.b.a c15 = bVar.c();
        if (!(c15 == null || (e10 = c15.e()) == null)) {
            G(xVar, e10, k10.h());
        }
        f.b.a c16 = bVar.c();
        if (!(c16 == null || (g10 = c16.g()) == null)) {
            I(xVar, g10, f10);
        }
        f.b.a c17 = bVar.c();
        F(xVar, c17 != null ? c17.i() : null, f10, k10.e(), k10.g());
        f.b.a c18 = bVar.c();
        if (!(c18 == null || (h10 = c18.h()) == null)) {
            J(xVar, h10, aVar, aVar2);
        }
        f.b.a c19 = bVar.c();
        if (c19 != null && (c10 = c19.c()) != null) {
            w(xVar, c10, k10.d());
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N O(K k10, f.b.a.C1968a aVar) {
        k10.b().invoke(aVar.b());
        return C16807N.f139792a;
    }

    private static final void P(x xVar, f.b.a.e eVar, float f10, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar) {
        O o10 = O.ERROR_MESSAGE;
        xVar.b(o10, o10, C11036a.f90020a.a());
        F(xVar, eVar, f10, aVar, lVar);
    }

    public static final void l(bo.f fVar, Eg.c cVar, K k10, o oVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        bo.f fVar2 = fVar;
        Eg.c cVar2 = cVar;
        K k11 = k10;
        o oVar2 = oVar;
        int i12 = i10;
        C17542s.j(fVar2, "viewModel");
        C17542s.j(cVar2, "surveyViewModel");
        C17542s.j(k11, "orderConfirmationCallbacks");
        C17542s.j(oVar2, "deliveryDetailsAnalytics");
        C4889m k12 = mVar.k(-2016565952);
        if ((i12 & 6) == 0) {
            i11 = (k12.F(fVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= (i12 & 64) == 0 ? k12.V(cVar2) : k12.F(cVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k12.V(k11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? k12.V(oVar2) : k12.F(oVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k12.l()) {
            if (C4895p.J()) {
                C4895p.S(-2016565952, i11, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.OrderConfirmationScreen (OrderConfirmationScreen.kt:84)");
            }
            A1<c.a> b10 = p1.b(cVar.m(), (C17168i) null, k12, 0, 1);
            A1<f.b> b11 = p1.b(fVar.m(), (C17168i) null, k12, 0, 1);
            k12.W(-62482003);
            Object D10 = k12.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new L0();
                k12.u(D10);
            }
            L0 l02 = (L0) D10;
            k12.P();
            C5848T c10 = C5850V.c(c2.h.B((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            C5264a e10 = c1.c.e(1811185594, true, new a(l02), k12, 54);
            b bVar = r0;
            b bVar2 = new b(cVar, oVar, k10, b11, b10, l02, fVar);
            mVar2 = k12;
            C4762x0.a((androidx.compose.ui.d) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, c10, c1.c.e(-1548092975, true, bVar, k12, 54), mVar2, 805309440, 247);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k12.L();
            mVar2 = k12;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new W(fVar, cVar, k10, oVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final c.a m(A1<? extends c.a> a12) {
        return (c.a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final f.b n(A1<f.b> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N o(bo.f fVar, Eg.c cVar, K k10, o oVar, int i10, C4889m mVar, int i11) {
        l(fVar, cVar, k10, oVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(bo.f.b r33, Eg.c.a r34, Wn.o r35, Zn.K r36, xg.C10396a r37, androidx.compose.ui.d r38, U0.C4889m r39, int r40, int r41) {
        /*
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r40
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "surveyState"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "deliveryDetailsAnalytics"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "orderConfirmationCallbacks"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "surveyCallbacks"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 1263772699(0x4b53a41b, float:1.3870107E7)
            r1 = r39
            U0.m r5 = r1.k(r0)
            r1 = r41 & 1
            if (r1 == 0) goto L_0x0035
            r1 = r11 | 6
            goto L_0x0045
        L_0x0035:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0044
            boolean r1 = r5.F(r6)
            if (r1 == 0) goto L_0x0041
            r1 = 4
            goto L_0x0042
        L_0x0041:
            r1 = 2
        L_0x0042:
            r1 = r1 | r11
            goto L_0x0045
        L_0x0044:
            r1 = r11
        L_0x0045:
            r2 = r41 & 2
            if (r2 == 0) goto L_0x004c
            r1 = r1 | 48
            goto L_0x0065
        L_0x004c:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0065
            r2 = r11 & 64
            if (r2 != 0) goto L_0x0059
            boolean r2 = r5.V(r7)
            goto L_0x005d
        L_0x0059:
            boolean r2 = r5.F(r7)
        L_0x005d:
            if (r2 == 0) goto L_0x0062
            r2 = 32
            goto L_0x0064
        L_0x0062:
            r2 = 16
        L_0x0064:
            r1 = r1 | r2
        L_0x0065:
            r2 = r41 & 4
            if (r2 == 0) goto L_0x006c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0085
        L_0x006c:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0085
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0079
            boolean r2 = r5.V(r8)
            goto L_0x007d
        L_0x0079:
            boolean r2 = r5.F(r8)
        L_0x007d:
            if (r2 == 0) goto L_0x0082
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0084
        L_0x0082:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0084:
            r1 = r1 | r2
        L_0x0085:
            r2 = r41 & 8
            if (r2 == 0) goto L_0x008c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x009c
        L_0x008c:
            r2 = r11 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x009c
            boolean r2 = r5.V(r9)
            if (r2 == 0) goto L_0x0099
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x009b
        L_0x0099:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x009b:
            r1 = r1 | r2
        L_0x009c:
            r2 = r41 & 16
            r24 = 32768(0x8000, float:4.5918E-41)
            if (r2 == 0) goto L_0x00a6
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bf
        L_0x00a6:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00bf
            r2 = r11 & r24
            if (r2 != 0) goto L_0x00b3
            boolean r2 = r5.V(r10)
            goto L_0x00b7
        L_0x00b3:
            boolean r2 = r5.F(r10)
        L_0x00b7:
            if (r2 == 0) goto L_0x00bc
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00be
        L_0x00bc:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00be:
            r1 = r1 | r2
        L_0x00bf:
            r2 = r41 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00c9
            r1 = r1 | r12
        L_0x00c6:
            r12 = r38
            goto L_0x00da
        L_0x00c9:
            r12 = r12 & r11
            if (r12 != 0) goto L_0x00c6
            r12 = r38
            boolean r14 = r5.V(r12)
            if (r14 == 0) goto L_0x00d7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d9
        L_0x00d7:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00d9:
            r1 = r1 | r14
        L_0x00da:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r13) goto L_0x00f2
            boolean r13 = r5.l()
            if (r13 != 0) goto L_0x00ea
            goto L_0x00f2
        L_0x00ea:
            r5.L()
            r1 = r5
            r24 = r12
            goto L_0x02d3
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00f8
        L_0x00f7:
            r2 = r12
        L_0x00f8:
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x0104
            r12 = -1
            java.lang.String r13 = "com.ingka.ikea.checkout.impl.confirmation.compose.OrderConfirmationScreenImpl (OrderConfirmationScreen.kt:153)"
            U0.C4895p.S(r0, r1, r12, r13)
        L_0x0104:
            r0 = 0
            r12 = 0
            r13 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r2, r0, r13, r12)
            i1.c$a r19 = i1.C5437c.f24302a
            i1.c r12 = r19.o()
            r14 = 0
            E1.I r12 = androidx.compose.foundation.layout.C5077h.h(r12, r14)
            int r16 = U0.C4883j.a(r5, r14)
            U0.y r13 = r5.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r5, r0)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r14 = r17.a()
            U0.f r20 = r5.m()
            if (r20 != 0) goto L_0x0131
            U0.C4883j.c()
        L_0x0131:
            r5.I()
            boolean r20 = r5.i()
            if (r20 == 0) goto L_0x013e
            r5.p(r14)
            goto L_0x0141
        L_0x013e:
            r5.t()
        L_0x0141:
            U0.m r14 = U0.F1.a(r5)
            nI.p r15 = r17.c()
            U0.F1.c(r14, r12, r15)
            nI.p r12 = r17.e()
            U0.F1.c(r14, r13, r12)
            nI.p r12 = r17.b()
            boolean r13 = r14.i()
            if (r13 != 0) goto L_0x016b
            java.lang.Object r13 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r15)
            if (r13 != 0) goto L_0x0179
        L_0x016b:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r14.u(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)
            r14.w(r13, r12)
        L_0x0179:
            nI.p r12 = r17.d()
            U0.F1.c(r14, r0, r12)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            tK.v r15 = tK.C18030v.f147664a
            int r13 = tK.C18030v.f147665b
            tK.h r12 = r15.a(r5, r13)
            long r25 = r12.k0()
            r31 = 14
            r32 = 0
            r27 = 1060320051(0x3f333333, float:0.7)
            r28 = 0
            r29 = 0
            r30 = 0
            long r16 = p1.C5747v0.o(r25, r27, r28, r29, r30, r31, r32)
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            r12 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r21 = i1.m.a(r14, r12)
            r22 = 6
            r23 = 4
            r25 = 0
            r3 = r12
            r12 = r21
            r4 = r13
            r3 = r14
            r27 = 1
            r13 = r16
            r29 = r2
            r2 = r15
            r15 = r25
            r16 = r5
            r17 = r22
            r18 = r23
            kC.C14673d.b(r12, r13, r15, r16, r17, r18)
            java.lang.String r12 = "OrderConfirmationTestTags.CLOSE_BUTTON"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r3, r12)
            i1.c r13 = r19.o()
            androidx.compose.ui.d r0 = r0.a(r12, r13)
            androidx.compose.ui.d r0 = s0.C5852X.e(r0)
            r12 = 24
            float r12 = (float) r12
            float r12 = c2.h.B(r12)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.i(r0, r12)
            tK.h r2 = r2.a(r5, r4)
            long r12 = r2.x0()
            A0.f r2 = A0.g.h()
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.c(r0, r12, r2)
            r2 = 40
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.t(r0, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r14 = i1.m.a(r0, r2)
            int r12 = uK.C18146a.f148097J2
            int r0 = Oo.b.f84665i
            r2 = 0
            java.lang.String r13 = J1.j.b(r0, r5, r2)
            nI.a r20 = r36.c()
            r22 = 0
            r23 = 248(0xf8, float:3.48E-43)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = r5
            SC.F0.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r0 = "OrderConfirmationTestTags.ITEM_CONTAINER"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r3, r0)
            r0 = -1061982873(0xffffffffc0b36d67, float:-5.607105)
            r5.W(r0)
            boolean r0 = r5.F(r6)
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 != r4) goto L_0x023a
            r13 = r27
            goto L_0x023b
        L_0x023a:
            r13 = r2
        L_0x023b:
            r0 = r0 | r13
            r3 = r1 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r3 == r4) goto L_0x024f
            r3 = r1 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x024d
            boolean r3 = r5.F(r8)
            if (r3 == 0) goto L_0x024d
            goto L_0x024f
        L_0x024d:
            r13 = r2
            goto L_0x0251
        L_0x024f:
            r13 = r27
        L_0x0251:
            r0 = r0 | r13
            r3 = r1 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r3 == r4) goto L_0x0265
            r3 = r1 & 64
            if (r3 == 0) goto L_0x0263
            boolean r3 = r5.F(r7)
            if (r3 == 0) goto L_0x0263
            goto L_0x0265
        L_0x0263:
            r13 = r2
            goto L_0x0267
        L_0x0265:
            r13 = r27
        L_0x0267:
            r0 = r0 | r13
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 == r4) goto L_0x027d
            r1 = r1 & r24
            if (r1 == 0) goto L_0x027b
            boolean r1 = r5.F(r10)
            if (r1 == 0) goto L_0x027b
            goto L_0x027d
        L_0x027b:
            r13 = r2
            goto L_0x027f
        L_0x027d:
            r13 = r27
        L_0x027f:
            r0 = r0 | r13
            java.lang.Object r1 = r5.D()
            if (r0 != 0) goto L_0x0293
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x028f
            goto L_0x0293
        L_0x028f:
            r15 = r5
            r24 = r29
            goto L_0x02aa
        L_0x0293:
            Zn.Y r13 = new Zn.Y
            r0 = r13
            r1 = r33
            r24 = r29
            r2 = r36
            r3 = r35
            r4 = r34
            r15 = r5
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r15.u(r13)
            r1 = r13
        L_0x02aa:
            r20 = r1
            nI.l r20 = (nI.C17642l) r20
            r15.P()
            r22 = 6
            r23 = 254(0xfe, float:3.56E-43)
            r13 = 0
            r14 = 0
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r1 = r15
            r15 = r0
            r21 = r1
            t0.C5937b.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02d3
            U0.C4895p.R()
        L_0x02d3:
            U0.Y0 r12 = r1.n()
            if (r12 == 0) goto L_0x02f2
            Zn.Z r13 = new Zn.Z
            r0 = r13
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r24
            r7 = r40
            r8 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.a(r13)
        L_0x02f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Zn.h0.p(bo.f$b, Eg.c$a, Wn.o, Zn.K, xg.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(f.b bVar, K k10, o oVar, c.a aVar, C10396a aVar2, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        float B10 = c2.h.B((float) 24);
        K(xVar, B10);
        if (bVar.a()) {
            f.b.a c10 = bVar.c();
            P(xVar, c10 != null ? c10.i() : null, B10, k10.e(), k10.g());
        } else {
            N(xVar, bVar, B10, oVar, k10, aVar, aVar2);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(f.b bVar, c.a aVar, o oVar, K k10, C10396a aVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        p(bVar, aVar, oVar, k10, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void v(x xVar, f.b.a.C1968a aVar, C17631a<C16807N> aVar2) {
        O o10 = O.ASSEMBLY_INFORMATION;
        xVar.b(o10, o10, c1.c.c(701579152, true, new c(aVar, aVar2)));
    }

    private static final void w(x xVar, String str, C17642l<? super String, C16807N> lVar) {
        O o10 = O.CONTACT_US;
        xVar.b(o10, o10, c1.c.c(-2015030854, true, new d(lVar, str)));
    }

    private static final void x(x xVar, C11436b bVar, o oVar, C17642l<? super String, C16807N> lVar, C17642l<? super lo.j, C16807N> lVar2) {
        G g10 = new G(lVar, new b0(), new c0(), new d0(), new e0(), new f0(), new g0(), lVar2, new X());
        O o10 = O.DELIVERY_DETAILS;
        xVar.b(o10, o10, c1.c.c(415919803, true, new e(bVar, g10, oVar)));
    }

    /* access modifiers changed from: private */
    public static final C16807N y(String str, int i10) {
        C17542s.j(str, "<unused var>");
        M(new IllegalStateException("Unexpected onChangePickupPointClicked"));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(String str, String str2, List list) {
        C17542s.j(str, "<unused var>");
        C17542s.j(str2, "<unused var>");
        C17542s.j(list, "<unused var>");
        M(new IllegalStateException("Unexpected onCapabilityCheckChanged"));
        return C16807N.f139792a;
    }
}
