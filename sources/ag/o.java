package ag;

import HJ.C15854t;
import IC.C13023e;
import J1.j;
import O0.C4762x0;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.e1;
import O0.g1;
import Op.Y0;
import Op.Z0;
import Op.a1;
import QJ.Q;
import SC.C13611m;
import SC.Q1;
import SC.R0;
import SC.Y2;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.t;
import XH.y;
import Zf.n;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import eg.C9655e;
import eg.C9656f;
import iq.C11411a;
import iq.C11412b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import rx.C15004a;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import t0.C5938c;
import t0.x;
import x4.C8951o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u0003*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u0002"}, d2 = {"Leg/f;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onBackClicked", "Lkotlin/Function1;", "Leg/e$a$a;", "onAddToCartError", "Lx4/o;", "fragmentNavController", "LZf/n;", "navigationExits", "d", "(Leg/f;LnI/a;LnI/l;Lx4/o;LZf/n;LU0/m;I)V", "LOp/Z0;", "event", "navigation", "k", "(Leg/f;LOp/Z0;Lx4/o;LZf/n;)V", "Leg/e;", "uiState", "LO0/L0;", "snackbarHostState", "eventHandler", "h", "(Leg/e;LO0/L0;LnI/l;LnI/a;LU0/m;I)V", "Lt0/x;", "l", "(Lt0/x;)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.compose.YouMayAlsoLikeScreenKt$YouMayAlsoLikeScreen$1$1$1", f = "YouMayAlsoLikeScreen.kt", l = {83}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f65358c;

        /* renamed from: d  reason: collision with root package name */
        int f65359d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C9655e.a f65360e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C9655e.a.C1246a, C16807N> f65361f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ L0 f65362g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f65363h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C9656f f65364i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C9655e.a aVar, C17642l<? super C9655e.a.C1246a, C16807N> lVar, L0 l02, Context context, C9656f fVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f65360e = aVar;
            this.f65361f = lVar;
            this.f65362g = l02;
            this.f65363h = context;
            this.f65364i = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f65360e, this.f65361f, this.f65362g, this.f65363h, this.f65364i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f65359d;
            if (i10 == 0) {
                y.b(obj);
                C9655e.a aVar = this.f65360e;
                if (aVar instanceof C9655e.a.C1246a) {
                    this.f65361f.invoke(aVar);
                    C16807N n10 = C16807N.f139792a;
                } else if (aVar instanceof C9655e.a.b) {
                    L0 l02 = this.f65362g;
                    String b10 = ((C9655e.a.b) aVar).a().b(this.f65363h);
                    this.f65358c = aVar;
                    this.f65359d = 1;
                    if (L0.f(l02, b10, (String) null, false, (J0) null, this, 14, (Object) null) == f10) {
                        return f10;
                    }
                } else {
                    throw new t();
                }
            } else if (i10 == 1) {
                C9655e.a aVar2 = (C9655e.a) this.f65358c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f65364i.H();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f65365a;

        b(C17631a<C16807N> aVar) {
            this.f65365a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(892219788, i10, -1, "com.ingka.ikea.app.cart.impl.presentation.compose.YouMayAlsoLikeScreenImpl.<anonymous> (YouMayAlsoLikeScreen.kt:200)");
                }
                ol.p.c(v.BACK, this.f65365a, (androidx.compose.ui.d) null, j.b(Oo.b.f84394H6, mVar, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 500);
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
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f65366a;

        c(L0 l02) {
            this.f65366a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1379293514, i10, -1, "com.ingka.ikea.app.cart.impl.presentation.compose.YouMayAlsoLikeScreenImpl.<anonymous> (YouMayAlsoLikeScreen.kt:207)");
                }
                Y2.c(this.f65366a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 0, 6);
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
    static final class d implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9655e f65367a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Z0, C16807N> f65368b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f65369c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5938c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C13023e f65370a;

            a(C13023e eVar) {
                this.f65370a = eVar;
            }

            public final void a(C5938c cVar, C4889m mVar, int i10) {
                C17542s.j(cVar, "$this$item");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-13617509, i10, -1, "com.ingka.ikea.app.cart.impl.presentation.compose.YouMayAlsoLikeScreenImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YouMayAlsoLikeScreen.kt:222)");
                    }
                    R0.e(this.f65370a.a(mVar, C13023e.f110931a), C13611m.NEGATIVE, false, D.k(TC.e.i(C5116k1.a(androidx.compose.ui.d.f18749a, "YouMayAlsoLikeTestTags.INLINE_MESSAGE")), 0.0f, h.B((float) 16), 1, (Object) null), (String) null, false, mVar, 432, 48);
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
        public static final class b implements C17642l<a1, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f65371a;

            public b(String str) {
                this.f65371a = str;
            }

            /* renamed from: a */
            public final Object invoke(a1 a1Var) {
                C17542s.j(a1Var, "item");
                String str = this.f65371a;
                if (str != null) {
                    String str2 = str + ":" + a1Var.f();
                    if (str2 != null) {
                        return str2;
                    }
                }
                return Long.valueOf(a1Var.f());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
        public static final class c extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f65372c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f65373d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(C17642l lVar, List list) {
                super(1);
                this.f65372c = lVar;
                this.f65373d = list;
            }

            public final Object a(int i10) {
                return this.f65372c.invoke(this.f65373d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
        /* renamed from: ag.o$d$d  reason: collision with other inner class name */
        public static final class C1146d extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f65374c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f65375d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1146d(C17642l lVar, List list) {
                super(1);
                this.f65374c = lVar;
                this.f65375d = list;
            }

            public final Object a(int i10) {
                return this.f65374c.invoke(this.f65375d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
        public static final class e extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f65376c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l f65377d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(List list, C17642l lVar) {
                super(4);
                this.f65376c = list;
                this.f65377d = lVar;
            }

            public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (mVar.V(cVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= mVar.d(i10) ? 32 : 16;
                }
                if ((i12 & 147) != 146 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    mVar.W(976560946);
                    Y0.O((a1) this.f65376c.get(i10), (androidx.compose.ui.d) null, (Q1) null, 0.0f, h.B((float) 24), 0.0f, this.f65377d, mVar, 24576, 46);
                    mVar.P();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        d(C9655e eVar, C17642l<? super Z0, C16807N> lVar, C17631a<C16807N> aVar) {
            this.f65367a = eVar;
            this.f65368b = lVar;
            this.f65369c = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C9655e eVar, C17642l lVar, x xVar) {
            C17542s.j(xVar, "$this$LazyColumn");
            C13023e a10 = eVar.a();
            if (a10 != null) {
                x.i(xVar, (Object) null, "SkapaInlineMessage", c1.c.c(-13617509, true, new a(a10)), 1, (Object) null);
            }
            if (eVar.b()) {
                o.l(xVar);
            } else {
                List<a1> d10 = eVar.d();
                q qVar = new q();
                xVar.e(d10.size(), new c(new b("YouMayAlsoLike"), d10), new C1146d(qVar, d10), c1.c.c(-632812321, true, new e(d10, lVar)));
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final Object f(a1 a1Var) {
            C17542s.j(a1Var, "item");
            return P.b(a1Var.getClass());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5834E r20, U0.C4889m r21, int r22) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                r14 = r21
                java.lang.String r2 = "padding"
                kotlin.jvm.internal.C17542s.j(r1, r2)
                r2 = r22 & 6
                if (r2 != 0) goto L_0x001b
                boolean r2 = r14.V(r1)
                if (r2 == 0) goto L_0x0017
                r2 = 4
                goto L_0x0018
            L_0x0017:
                r2 = 2
            L_0x0018:
                r2 = r22 | r2
                goto L_0x001d
            L_0x001b:
                r2 = r22
            L_0x001d:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x002f
                boolean r3 = r21.l()
                if (r3 != 0) goto L_0x002a
                goto L_0x002f
            L_0x002a:
                r21.L()
                goto L_0x015a
            L_0x002f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.app.cart.impl.presentation.compose.YouMayAlsoLikeScreenImpl.<anonymous> (YouMayAlsoLikeScreen.kt:210)"
                r5 = 2138173281(0x7f71ef61, float:3.2158687E38)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003e:
                androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                r15 = 0
                r12 = 1
                r5 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.f(r13, r15, r12, r5)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r2, r1)
                eg.e r2 = r0.f65367a
                nI.l<Op.Z0, XH.N> r3 = r0.f65368b
                nI.a<XH.N> r4 = r0.f65369c
                androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r6 = r6.g()
                i1.c$a r7 = i1.C5437c.f24302a
                i1.c$b r7 = r7.k()
                r11 = 0
                E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r14, r11)
                int r7 = U0.C4883j.a(r14, r11)
                U0.y r8 = r21.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r14, r1)
                G1.g$a r9 = G1.C4504g.f6515W
                nI.a r10 = r9.a()
                U0.f r16 = r21.m()
                if (r16 != 0) goto L_0x007d
                U0.C4883j.c()
            L_0x007d:
                r21.I()
                boolean r16 = r21.i()
                if (r16 == 0) goto L_0x008a
                r14.p(r10)
                goto L_0x008d
            L_0x008a:
                r21.t()
            L_0x008d:
                U0.m r10 = U0.F1.a(r21)
                nI.p r5 = r9.c()
                U0.F1.c(r10, r6, r5)
                nI.p r5 = r9.e()
                U0.F1.c(r10, r8, r5)
                nI.p r5 = r9.b()
                boolean r6 = r10.i()
                if (r6 != 0) goto L_0x00b7
                java.lang.Object r6 = r10.D()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r8)
                if (r6 != 0) goto L_0x00c5
            L_0x00b7:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
                r10.u(r6)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
                r10.w(r6, r5)
            L_0x00c5:
                nI.p r5 = r9.d()
                U0.F1.c(r10, r1, r5)
                s0.h r6 = s0.C5862h.f28810a
                r10 = 2
                r1 = 0
                r8 = 1065353216(0x3f800000, float:1.0)
                r9 = 0
                r7 = r13
                r5 = r11
                r11 = r1
                androidx.compose.ui.d r1 = s0.C5861g.c(r6, r7, r8, r9, r10, r11)
                r6 = -1856955423(0xffffffff91511be1, float:-1.6495784E-28)
                r14.W(r6)
                boolean r6 = r14.F(r2)
                boolean r7 = r14.V(r3)
                r6 = r6 | r7
                java.lang.Object r7 = r21.D()
                if (r6 != 0) goto L_0x00f7
                U0.m$a r6 = U0.C4889m.f14007a
                java.lang.Object r6 = r6.a()
                if (r7 != r6) goto L_0x00ff
            L_0x00f7:
                ag.p r7 = new ag.p
                r7.<init>(r2, r3)
                r14.u(r7)
            L_0x00ff:
                r9 = r7
                nI.l r9 = (nI.C17642l) r9
                r21.P()
                r11 = 0
                r16 = 254(0xfe, float:3.56E-43)
                r2 = 0
                r3 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                r17 = 0
                r18 = r4
                r4 = r6
                r6 = 0
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r7
                r7 = r10
                r10 = r8
                r8 = r17
                r10 = r21
                r0 = r12
                r12 = r16
                t0.C5937b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r1 = 16
                float r1 = (float) r1
                float r1 = c2.h.B(r1)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.i(r13, r1)
                r2 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r1, r15, r0, r2)
                SC.N r4 = SC.N.Primary
                int r0 = rv.C11849b.f102170C
                r1 = 0
                java.lang.String r1 = J1.j.b(r0, r14, r1)
                r12 = 3120(0xc30, float:4.372E-42)
                r13 = 500(0x1f4, float:7.0E-43)
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = r18
                r11 = r21
                SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r21.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x015a
                U0.C4895p.R()
            L_0x015a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ag.o.d.c(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void d(C9656f fVar, C17631a<C16807N> aVar, C17642l<? super C9655e.a.C1246a, C16807N> lVar, C8951o oVar, n nVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        int i12;
        boolean z10;
        C9655e.a aVar2;
        C9656f fVar2 = fVar;
        C17631a<C16807N> aVar3 = aVar;
        C17642l<? super C9655e.a.C1246a, C16807N> lVar2 = lVar;
        C8951o oVar2 = oVar;
        n nVar2 = nVar;
        int i13 = i10;
        C17542s.j(fVar2, "viewModel");
        C17542s.j(aVar3, "onBackClicked");
        C17542s.j(lVar2, "onAddToCartError");
        C17542s.j(oVar2, "fragmentNavController");
        C17542s.j(nVar2, "navigationExits");
        C4889m k10 = mVar.k(-315606301);
        if ((i13 & 6) == 0) {
            i11 = (k10.F(fVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(aVar3) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(oVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 24576) == 0) {
            i11 |= (i13 & 32768) == 0 ? k10.V(nVar2) : k10.F(nVar2) ? 16384 : 8192;
        }
        int i14 = i11;
        if ((i14 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-315606301, i14, -1, "com.ingka.ikea.app.cart.impl.presentation.compose.YouMayAlsoLikeScreen (YouMayAlsoLikeScreen.kt:68)");
            }
            A1<C9655e> c10 = j3.a.c(fVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            k10.W(-627988154);
            Object D10 = k10.D();
            C4889m.a aVar4 = C4889m.f14007a;
            if (D10 == aVar4.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            L0 l02 = (L0) D10;
            k10.P();
            C9655e.a c11 = e(c10).c();
            k10.W(-627984106);
            boolean z11 = true;
            if (c11 == null) {
                i12 = i14;
                mVar2 = k10;
                z10 = false;
            } else {
                Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
                k10.W(-2035946685);
                boolean V10 = k10.V(c11) | ((i14 & 896) == 256) | k10.F(context) | k10.F(fVar2);
                Object D11 = k10.D();
                if (V10 || D11 == aVar4.a()) {
                    aVar2 = c11;
                    i12 = i14;
                    a aVar5 = r0;
                    mVar2 = k10;
                    a aVar6 = new a(c11, lVar, l02, context, fVar, (C17164e<? super a>) null);
                    mVar2.u(aVar5);
                    D11 = aVar5;
                } else {
                    aVar2 = c11;
                    i12 = i14;
                    mVar2 = k10;
                }
                mVar2.P();
                z10 = false;
                U0.P.g(aVar2, (p) D11, mVar2, 0);
                C16807N n10 = C16807N.f139792a;
            }
            mVar2.P();
            C9655e e10 = e(c10);
            mVar2.W(-627962124);
            boolean F10 = mVar2.F(fVar2) | mVar2.F(oVar2);
            if ((i12 & 57344) != 16384 && ((i12 & 32768) == 0 || !mVar2.F(nVar2))) {
                z11 = z10;
            }
            boolean z12 = F10 | z11;
            Object D12 = mVar2.D();
            if (z12 || D12 == aVar4.a()) {
                D12 = new l(fVar2, oVar2, nVar2);
                mVar2.u(D12);
            }
            mVar2.P();
            h(e10, l02, (C17642l) D12, aVar, mVar2, ((i12 << 6) & 7168) | 48);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        U0.Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new m(fVar, aVar, lVar, oVar, nVar, i10));
        }
    }

    private static final C9655e e(A1<C9655e> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C9656f fVar, C8951o oVar, n nVar, Z0 z02) {
        C17542s.j(z02, "event");
        k(fVar, z02, oVar, nVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C9656f fVar, C17631a aVar, C17642l lVar, C8951o oVar, n nVar, int i10, C4889m mVar, int i11) {
        d(fVar, aVar, lVar, oVar, nVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void h(C9655e eVar, L0 l02, C17642l<? super Z0, C16807N> lVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C9655e eVar2 = eVar;
        L0 l03 = l02;
        C17642l<? super Z0, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(eVar2, "uiState");
        C17542s.j(l03, "snackbarHostState");
        C17542s.j(lVar2, "eventHandler");
        C17542s.j(aVar2, "onBackClicked");
        C4889m k10 = mVar.k(-917039408);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(eVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(l03) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-917039408, i11, -1, "com.ingka.ikea.app.cart.impl.presentation.compose.YouMayAlsoLikeScreenImpl (YouMayAlsoLikeScreen.kt:197)");
            }
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, c1.c.e(892219788, true, new b(aVar2), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(1379293514, true, new c(l03), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(2138173281, true, new d(eVar2, lVar2, aVar2), k10, 54), mVar2, 805309488, 501);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        U0.Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new n(eVar, l02, lVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C9655e eVar, L0 l02, C17642l lVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        h(eVar, l02, lVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void k(C9656f fVar, Z0 z02, C8951o oVar, n nVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Z0 z03 = z02;
        C8951o oVar2 = oVar;
        String str = null;
        if ((z03 instanceof Z0.f) || (z03 instanceof Z0.g)) {
            IllegalStateException illegalStateException = new IllegalStateException("Not supported event: " + z03);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            Iterator it = qv.d.f102012a.a().iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "YouMayAlsoLike";
                }
                String str4 = str3;
                bVar.a(eVar, str4, z10, illegalStateException, str2);
                str3 = str4;
                z10 = z10;
            }
        } else if (z03 instanceof Z0.e) {
            Z0.e eVar2 = (Z0.e) z03;
            Link b10 = eVar2.b();
            if (b10 instanceof Link.External) {
                nVar.c().a(nVar.v().getContext(), eVar2.b().e());
            } else if (b10 instanceof Link.Deeplink) {
                try {
                    Uri parse = Uri.parse(((Z0.e) z03).b().e());
                    C17542s.i(parse, "parse(...)");
                    oVar2.X(parse);
                } catch (ActivityNotFoundException e10) {
                    e eVar3 = e.ERROR;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    Iterator it2 = qv.d.f102012a.a().iterator();
                    while (true) {
                        z12 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((C11819b) next2).b(eVar3, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str5 = null;
                    for (C11819b bVar2 : arrayList2) {
                        if (str == null) {
                            String a11 = C11818a.a("No Activity found to handle Intent with url: " + eVar2.b().e(), e10);
                            if (a11 != null) {
                                str = C11820c.a(a11);
                            } else {
                                return;
                            }
                        }
                        if (str5 == null) {
                            str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "YouMayAlsoLike";
                        }
                        String str6 = str5;
                        bVar2.a(eVar3, str6, z12, e10, str);
                        str5 = str6;
                        z12 = z12;
                    }
                }
            } else {
                throw new t();
            }
        } else if (z03 instanceof Z0.a) {
            nVar.w0().h(oVar2, ((Z0.a) z03).a(), C15004a.LIST_CART_ACTIONS);
        } else if (z03 instanceof Z0.b) {
            C11411a.C2225a.a(nVar.Z0(), oVar, ((Z0.b) z03).a(), (C11412b) null, 4, (Object) null);
        } else if (z03 instanceof Z0.c) {
            Z0.c cVar = (Z0.c) z03;
            if (C17542s.e(cVar.c(), Z0.c.a.C1718a.f85052b)) {
                fVar.G(cVar.a(), cVar.b());
                return;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Not supported event: " + z03);
            e eVar4 = e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            Iterator it3 = qv.d.f102012a.a().iterator();
            while (true) {
                z11 = false;
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (((C11819b) next3).b(eVar4, false)) {
                    arrayList3.add(next3);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str7 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException2);
                    if (a12 != null) {
                        str7 = C11820c.a(a12);
                    } else {
                        return;
                    }
                }
                if (str8 == null) {
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "YouMayAlsoLike";
                }
                String str9 = str8;
                bVar3.a(eVar4, str9, z11, illegalStateException2, str7);
                str8 = str9;
                z11 = z11;
            }
        } else if (z03 instanceof Z0.d) {
            nVar.X1().a(oVar2, ((Z0.d) z03).a(), Interaction$Component.CART_DETAILS);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final void l(x xVar) {
        for (int i10 = 0; i10 < 8; i10++) {
            x.i(xVar, (Object) null, (Object) null, C9414a.f65321a.a(), 3, (Object) null);
        }
    }
}
