package Wq;

import E1.C4488v;
import E1.C4489w;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import J1.j;
import N1.P;
import QJ.Q;
import Rq.e;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import SC.H2;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4892n0;
import U0.C4894o0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Xq.b;
import Y1.k;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.o;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import c2.n;
import c2.s;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import i1.C5437c;
import jC.i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kr.f;
import kr.g;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import or.r;
import p1.C5747v0;
import r0.m;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aO\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\r\u001ai\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001aI\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006'²\u0006\f\u0010\u001d\u001a\u00020\u00058\nX\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u0002²\u0006\u000e\u0010 \u001a\u00020\u00108\n@\nX\u0002²\u0006\f\u0010\"\u001a\u00020!8\nX\u0002²\u0006\u0010\u0010#\u001a\u0004\u0018\u00010\u00128\n@\nX\u0002²\u0006\u000e\u0010%\u001a\u00020$8\n@\nX\u0002²\u0006\u000e\u0010&\u001a\u00020\u00108\n@\nX\u0002"}, d2 = {"Lor/r;", "viewModel", "LXH/N;", "A", "(Lor/r;LU0/m;I)V", "Lkr/f;", "model", "Lkotlin/Function0;", "onHowToCollectKeysClicked", "onUnlockRewardRequested", "onUseRewardClicked", "onBackClicked", "z", "(Lkr/f;LnI/a;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "Lkr/f$f;", "Lkotlin/Function1;", "", "onHeaderOffsetChanged", "Landroid/graphics/drawable/Drawable;", "onHeaderImageLoaded", "v", "(Lkr/f$f;LnI/a;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;I)V", "onHeaderSizeChanged", "Landroidx/compose/ui/d;", "modifier", "p", "(Lkr/f$f;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "x", "(LU0/m;I)V", "uiState", "", "backButtonPosition", "headerOffset", "", "showToolbar", "headerImageDrawable", "Lp1/v0;", "scrimColor", "imageWidth", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.familyrewards.implementation.compose.details.RewardsDetailsScreenKt$RewardsDetailsScreen$6$1", f = "RewardsDetailsScreen.kt", l = {122}, m = "invokeSuspend")
    static final class a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f89148c;

        /* renamed from: d  reason: collision with root package name */
        int f89149d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f89150e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f89151f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f89152g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4899r0<Drawable> f89153h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4899r0<C5747v0> f89154i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, boolean z10, A1<Boolean> a12, C4899r0<Drawable> r0Var, C4899r0<C5747v0> r0Var2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f89150e = iVar;
            this.f89151f = z10;
            this.f89152g = a12;
            this.f89153h = r0Var;
            this.f89154i = r0Var2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f89150e, this.f89151f, this.f89152g, this.f89153h, this.f89154i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f89149d
                r2 = 1
                if (r1 == 0) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                java.lang.Object r0 = r11.f89148c
                lC.l r0 = (lC.l) r0
                XH.y.b(r12)
                goto L_0x0054
            L_0x0013:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001b:
                XH.y.b(r12)
                jC.i r12 = r11.f89150e
                lC.l r12 = r12.a()
                U0.A1<java.lang.Boolean> r1 = r11.f89152g
                boolean r1 = Wq.p.H(r1)
                if (r1 == 0) goto L_0x002f
                jC.b$e r0 = jC.C14615b.e.f127859b
                goto L_0x0059
            L_0x002f:
                boolean r1 = r11.f89151f
                if (r1 == 0) goto L_0x0036
                jC.b$c r0 = jC.C14615b.c.f127858b
                goto L_0x0059
            L_0x0036:
                jC.i r1 = r11.f89150e
                lC.l r3 = r1.a()
                U0.r0<android.graphics.drawable.Drawable> r1 = r11.f89153h
                android.graphics.drawable.Drawable r4 = Wq.p.J(r1)
                r11.f89148c = r12
                r11.f89149d = r2
                r5 = 0
                r6 = 0
                r8 = 6
                r9 = 0
                r7 = r11
                java.lang.Object r1 = lC.l.a.a(r3, r4, r5, r6, r7, r8, r9)
                if (r1 != r0) goto L_0x0052
                return r0
            L_0x0052:
                r0 = r12
                r12 = r1
            L_0x0054:
                jC.b r12 = (jC.C14615b) r12
                r10 = r0
                r0 = r12
                r12 = r10
            L_0x0059:
                r12.a(r0)
                U0.r0<p1.v0> r12 = r11.f89154i
                jC.i r0 = r11.f89150e
                U0.A1<java.lang.Boolean> r1 = r11.f89152g
                boolean r1 = Wq.p.H(r1)
                if (r1 == 0) goto L_0x006b
                r1 = 1065353216(0x3f800000, float:1.0)
                goto L_0x006d
            L_0x006b:
                r1 = 1056964608(0x3f000000, float:0.5)
            L_0x006d:
                long r0 = r0.d(r1)
                Wq.p.M(r12, r0)
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: Wq.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void A(r rVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(rVar, "viewModel");
        C4889m k10 = mVar.k(-1338069526);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1338069526, i11, -1, "com.ingka.ikea.familyrewards.implementation.compose.details.RewardsDetailsScreen (RewardsDetailsScreen.kt:86)");
            }
            kr.f B10 = B(j3.a.c(rVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7));
            k10.W(-907679577);
            boolean F10 = k10.F(rVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(rVar);
                k10.u(D10);
            }
            C17631a aVar = (C17631a) D10;
            k10.P();
            k10.W(-907676763);
            boolean F11 = k10.F(rVar);
            Object D11 = k10.D();
            if (F11 || D11 == C4889m.f14007a.a()) {
                D11 = new g(rVar);
                k10.u(D11);
            }
            C17631a aVar2 = (C17631a) D11;
            k10.P();
            k10.W(-907674176);
            boolean F12 = k10.F(rVar);
            Object D12 = k10.D();
            if (F12 || D12 == C4889m.f14007a.a()) {
                D12 = new h(rVar);
                k10.u(D12);
            }
            C17631a aVar3 = (C17631a) D12;
            k10.P();
            k10.W(-907671909);
            boolean F13 = k10.F(rVar);
            Object D13 = k10.D();
            if (F13 || D13 == C4889m.f14007a.a()) {
                D13 = new i(rVar);
                k10.u(D13);
            }
            k10.P();
            z(B10, aVar, aVar2, aVar3, (C17631a) D13, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(rVar, i10));
        }
    }

    private static final kr.f B(A1<? extends kr.f> a12) {
        return (kr.f) a12.getValue();
    }

    private static final float C(C4892n0 n0Var) {
        return n0Var.a();
    }

    private static final void D(C4892n0 n0Var, float f10) {
        n0Var.n(f10);
    }

    private static final int E(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void F(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final boolean G(C4894o0 o0Var, C4892n0 n0Var) {
        return ((float) E(o0Var)) < C(n0Var);
    }

    /* access modifiers changed from: private */
    public static final boolean H(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N I(or.r rVar) {
        rVar.D(r.a.b.f100773a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Drawable J(C4899r0<Drawable> r0Var) {
        return r0Var.getValue();
    }

    private static final void K(C4899r0<Drawable> r0Var, Drawable drawable) {
        r0Var.setValue(drawable);
    }

    private static final long L(C4899r0<C5747v0> r0Var) {
        return r0Var.getValue().y();
    }

    /* access modifiers changed from: private */
    public static final void M(C4899r0<C5747v0> r0Var, long j10) {
        r0Var.setValue(C5747v0.k(j10));
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C4894o0 o0Var, int i10) {
        F(o0Var, i10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C4899r0 r0Var, Drawable drawable) {
        C17542s.j(drawable, "it");
        K(r0Var, drawable);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C4892n0 n0Var, C4488v vVar) {
        C17542s.j(vVar, "it");
        D(n0Var, C5667g.n(C4489w.f(vVar)) + ((float) n.i(s.b(vVar.a()))));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(kr.f fVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, int i10, C4889m mVar, int i11) {
        z(fVar, aVar, aVar2, aVar3, aVar4, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(or.r rVar) {
        rVar.D(r.a.c.f100774a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S(or.r rVar) {
        rVar.D(r.a.d.f100775a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(or.r rVar) {
        rVar.D(r.a.C2364a.f100772a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(or.r rVar, int i10, C4889m mVar, int i11) {
        A(rVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void p(kr.f.C2249f r36, nI.C17642l<? super java.lang.Integer, XH.C16807N> r37, nI.C17642l<? super android.graphics.drawable.Drawable, XH.C16807N> r38, androidx.compose.ui.d r39, U0.C4889m r40, int r41, int r42) {
        /*
            r1 = r36
            r2 = r37
            r3 = r38
            r5 = r41
            r0 = 4
            r4 = 8
            r6 = 6
            r7 = -2040079861(0xffffffff8666da0b, float:-4.3418385E-35)
            r8 = r40
            U0.m r15 = r8.k(r7)
            r8 = 1
            r9 = r42 & 1
            r10 = 2
            if (r9 == 0) goto L_0x001e
            r9 = r5 | 6
            goto L_0x0037
        L_0x001e:
            r9 = r5 & 6
            if (r9 != 0) goto L_0x0036
            r9 = r5 & 8
            if (r9 != 0) goto L_0x002b
            boolean r9 = r15.V(r1)
            goto L_0x002f
        L_0x002b:
            boolean r9 = r15.F(r1)
        L_0x002f:
            if (r9 == 0) goto L_0x0033
            r9 = r0
            goto L_0x0034
        L_0x0033:
            r9 = r10
        L_0x0034:
            r9 = r9 | r5
            goto L_0x0037
        L_0x0036:
            r9 = r5
        L_0x0037:
            r11 = r42 & 2
            if (r11 == 0) goto L_0x003e
            r9 = r9 | 48
            goto L_0x004e
        L_0x003e:
            r11 = r5 & 48
            if (r11 != 0) goto L_0x004e
            boolean r11 = r15.F(r2)
            if (r11 == 0) goto L_0x004b
            r11 = 32
            goto L_0x004d
        L_0x004b:
            r11 = 16
        L_0x004d:
            r9 = r9 | r11
        L_0x004e:
            r0 = r42 & 4
            if (r0 == 0) goto L_0x0055
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0065
            boolean r0 = r15.F(r3)
            if (r0 == 0) goto L_0x0062
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r9 = r9 | r0
        L_0x0065:
            r0 = r42 & 8
            if (r0 == 0) goto L_0x006e
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x006b:
            r13 = r39
            goto L_0x0080
        L_0x006e:
            r13 = r5 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x006b
            r13 = r39
            boolean r14 = r15.V(r13)
            if (r14 == 0) goto L_0x007d
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r9 = r9 | r14
        L_0x0080:
            r14 = r9 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r14 != r6) goto L_0x0095
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            r15.L()
            r5 = r1
            r4 = r13
            r0 = r15
            goto L_0x03bb
        L_0x0095:
            if (r0 == 0) goto L_0x009a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x009b
        L_0x009a:
            r0 = r13
        L_0x009b:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00a7
            r6 = -1
            java.lang.String r13 = "com.ingka.ikea.familyrewards.implementation.compose.details.FamilyRewardsDetails (RewardsDetailsScreen.kt:257)"
            U0.C4895p.S(r7, r9, r6, r13)
        L_0x00a7:
            r6 = 0
            androidx.compose.foundation.o r7 = androidx.compose.foundation.m.c(r6, r15, r6, r8)
            r13 = 540903500(0x203d884c, float:1.605402E-19)
            r15.W(r13)
            java.lang.Object r13 = r15.D()
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r4 = r14.a()
            if (r13 != r4) goto L_0x00c5
            U0.o0 r13 = U0.C4877g1.a(r6)
            r15.u(r13)
        L_0x00c5:
            U0.o0 r13 = (U0.C4894o0) r13
            r15.P()
            r4 = 0
            jC.i r11 = jC.k.c(r4, r15, r6, r8)
            r12 = 1069804314(0x3fc3eb1a, float:1.5306122)
            int r10 = q(r13)
            float r10 = r11.c(r12, r10)
            java.lang.String r11 = "TestTag-Root"
            androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r0, r11)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r7
            androidx.compose.ui.d r11 = androidx.compose.foundation.m.f(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r12 = r12.g()
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c$b r4 = r16.k()
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r12, r4, r15, r6)
            int r12 = U0.C4883j.a(r15, r6)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r15, r11)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r6 = r17.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x011b
            U0.C4883j.c()
        L_0x011b:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0128
            r15.p(r6)
            goto L_0x012b
        L_0x0128:
            r15.t()
        L_0x012b:
            U0.m r6 = U0.F1.a(r15)
            r34 = r0
            nI.p r0 = r17.c()
            U0.F1.c(r6, r4, r0)
            nI.p r0 = r17.e()
            U0.F1.c(r6, r8, r0)
            nI.p r0 = r17.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0157
            java.lang.Object r4 = r6.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r8)
            if (r4 != 0) goto L_0x0165
        L_0x0157:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r6.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r6.w(r4, r0)
        L_0x0165:
            nI.p r0 = r17.d()
            U0.F1.c(r6, r11, r0)
            s0.h r0 = s0.C5862h.f28810a
            com.ingka.ikea.core.model.Image r0 = r36.k()
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = r0.getUrl()
            r8 = r0
            goto L_0x017b
        L_0x017a:
            r8 = 0
        L_0x017b:
            com.ingka.ikea.core.model.Image r0 = r36.k()
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = r0.A0()
        L_0x0185:
            r4 = 0
            goto L_0x0189
        L_0x0187:
            r0 = 0
            goto L_0x0185
        L_0x0189:
            float r6 = (float) r4
            float r11 = c2.h.B(r6)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            java.lang.String r12 = "TestTag-ImageHeader"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r6, r12)
            r5 = 0
            r35 = r6
            r1 = 0
            r6 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r12, r5, r6, r1)
            r12 = 2
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.C5074e.b(r5, r10, r4, r12, r1)
            r4 = -1261507080(0xffffffffb4ceedf8, float:-3.8543635E-7)
            r15.W(r4)
            r4 = r9 & 112(0x70, float:1.57E-43)
            r5 = 32
            if (r4 != r5) goto L_0x01b2
            r4 = r6
            goto L_0x01b3
        L_0x01b2:
            r4 = 0
        L_0x01b3:
            boolean r5 = r15.V(r7)
            r4 = r4 | r5
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x01c4
            java.lang.Object r4 = r14.a()
            if (r5 != r4) goto L_0x01cc
        L_0x01c4:
            Wq.d r5 = new Wq.d
            r5.<init>(r2, r7, r13)
            r15.u(r5)
        L_0x01cc:
            nI.l r5 = (nI.C17642l) r5
            r15.P()
            androidx.compose.ui.d r10 = androidx.compose.ui.layout.e.a(r1, r5)
            r1 = -1261501673(0xffffffffb4cf0317, float:-3.8559003E-7)
            r15.W(r1)
            r1 = r9 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r1 != r4) goto L_0x01e2
            goto L_0x01e3
        L_0x01e2:
            r6 = 0
        L_0x01e3:
            java.lang.Object r1 = r15.D()
            if (r6 != 0) goto L_0x01ef
            java.lang.Object r4 = r14.a()
            if (r1 != r4) goto L_0x01f7
        L_0x01ef:
            Wq.e r1 = new Wq.e
            r1.<init>(r3)
            r15.u(r1)
        L_0x01f7:
            r14 = r1
            nI.l r14 = (nI.C17642l) r14
            r15.P()
            r17 = 3072(0xc00, float:4.305E-42)
            r18 = 80
            r12 = 0
            r1 = 0
            r9 = r0
            r0 = r15
            r15 = r1
            r16 = r0
            ur.f.f(r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            r1 = 0
            Rq.d.f(r0, r1)
            IC.e r1 = r36.getTitle()
            int r4 = IC.C13023e.f110931a
            java.lang.String r8 = r1.a(r0, r4)
            TC.b$b$a r9 = TC.C13679b.C2857b.a.f116683a
            androidx.compose.ui.d r1 = Rq.d.k()
            java.lang.String r5 = "TestTag-Title"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r1, r5)
            r32 = 0
            r33 = 262136(0x3fff8, float:3.67331E-40)
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 432(0x1b0, float:6.05E-43)
            r30 = r0
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1 = 0
            Rq.d.f(r0, r1)
            IC.e r8 = r36.getDescription()
            TC.b$a$b r1 = TC.C13679b.a.C2856b.f116680a
            androidx.compose.ui.d r5 = Rq.d.k()
            java.lang.String r6 = "TestTag-Description"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r5, r6)
            r12 = r4 | 432(0x1b0, float:6.05E-43)
            r13 = 0
            r9 = r1
            r11 = r0
            Dl.q.c(r8, r9, r10, r11, r12, r13)
            r5 = -1261484273(0xffffffffb4cf470f, float:-3.8608457E-7)
            r0.W(r5)
            r5 = r36
            boolean r6 = r5 instanceof kr.f.c
            if (r6 != 0) goto L_0x0299
            r7 = 0
            Rq.d.f(r0, r7)
            sr.e$a r8 = new sr.e$a
            int r7 = r36.b()
            r8.<init>(r7)
            sr.i r10 = sr.i.Large
            androidx.compose.ui.d r7 = Rq.d.k()
            java.lang.String r9 = "TestTag-KeysLabel"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r7, r9)
            int r7 = sr.e.a.f102534b
            r12 = r7 | 432(0x1b0, float:6.05E-43)
            r13 = 0
            r11 = r0
            sr.h.c(r8, r9, r10, r11, r12, r13)
        L_0x0299:
            r0.P()
            r7 = -1261473487(0xffffffffb4cf7131, float:-3.8639112E-7)
            r0.W(r7)
            if (r6 == 0) goto L_0x02d3
            r7 = r5
            kr.f$c r7 = (kr.f.c) r7
            IC.e r8 = r7.e()
            if (r8 == 0) goto L_0x02d3
            r8 = 0
            Rq.d.f(r0, r8)
            IC.e r8 = r7.e()
            tK.v r7 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r7 = r7.a(r0, r9)
            long r11 = r7.H0()
            androidx.compose.ui.d r7 = Rq.d.k()
            java.lang.String r9 = "TestTag-ExpiryDate"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r7, r9)
            r14 = r4 | 432(0x1b0, float:6.05E-43)
            r15 = 0
            r9 = r1
            r13 = r0
            sr.C11884b.b(r8, r9, r10, r11, r13, r14, r15)
        L_0x02d3:
            r0.P()
            r7 = 0
            Rq.d.f(r0, r7)
            IC.e r8 = r36.c()
            androidx.compose.ui.d r7 = Rq.d.k()
            java.lang.String r9 = "TestTag-Spotlight"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r7, r9)
            r12 = r4 | 432(0x1b0, float:6.05E-43)
            r13 = 0
            r9 = r1
            r11 = r0
            Dl.q.c(r8, r9, r10, r11, r12, r13)
            r1 = -1261452832(0xffffffffb4cfc1e0, float:-3.8697817E-7)
            r0.W(r1)
            if (r6 == 0) goto L_0x0374
            r1 = r5
            kr.f$c r1 = (kr.f.c) r1
            IC.e r6 = r1.h()
            if (r6 == 0) goto L_0x0374
            r6 = 0
            Rq.d.f(r0, r6)
            int r7 = Rq.e.f87003x
            java.lang.String r8 = J1.j.b(r7, r0, r6)
            TC.b$b$f r9 = TC.C13679b.C2857b.f.f116688a
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r10 = r6.a(r0, r7)
            long r11 = r10.H0()
            androidx.compose.ui.d r10 = Rq.d.k()
            java.lang.String r13 = "TestTag-VoucherLabel"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r10, r13)
            r32 = 0
            r33 = 262128(0x3fff0, float:3.6732E-40)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 432(0x1b0, float:6.05E-43)
            r30 = r0
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r8 = 8
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            r9 = 6
            Rq.d.d(r8, r0, r9)
            IC.e r1 = r1.h()
            java.lang.String r8 = r1.a(r0, r4)
            TC.b$b$c r9 = TC.C13679b.C2857b.c.f116685a
            tK.h r1 = r6.a(r0, r7)
            long r11 = r1.G0()
            androidx.compose.ui.d r1 = Rq.d.k()
            java.lang.String r6 = "TestTag-VoucherCode"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r1, r6)
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0374:
            r0.P()
            r1 = 40
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            r6 = r35
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r6, r1)
            r7 = 6
            s0.C5844O.a(r1, r0, r7)
            kr.f$g r1 = r36.a()
            IC.e r8 = r1.b()
            kr.f$g r1 = r36.a()
            IC.e r9 = r1.a()
            java.lang.String r1 = "TestTag-TermsOfUse"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r6, r1)
            r1 = r4 | 384(0x180, float:5.38E-43)
            int r4 = r4 << 3
            r12 = r1 | r4
            r13 = 0
            r11 = r0
            Xq.f.d(r8, r9, r10, r11, r12, r13)
            r1 = 0
            Rq.d.f(r0, r1)
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x03b9
            U0.C4895p.R()
        L_0x03b9:
            r4 = r34
        L_0x03bb:
            U0.Y0 r7 = r0.n()
            if (r7 == 0) goto L_0x03d4
            Wq.f r8 = new Wq.f
            r0 = r8
            r1 = r36
            r2 = r37
            r3 = r38
            r5 = r41
            r6 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x03d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Wq.p.p(kr.f$f, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final int q(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void r(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C17642l lVar, o oVar, C4894o0 o0Var, C4488v vVar) {
        C17542s.j(vVar, "it");
        r(o0Var, c2.r.h(vVar.a()));
        lVar.invoke(Integer.valueOf(c2.r.g(vVar.a()) - oVar.n()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17642l lVar, Drawable drawable) {
        C17542s.j(drawable, "drawable");
        lVar.invoke(drawable);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(f.C2249f fVar, C17642l lVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        p(fVar, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void v(f.C2249f fVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17642l<? super Integer, C16807N> lVar, C17642l<? super Drawable, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        int i12;
        f.C2249f fVar2 = fVar;
        int i13 = i10;
        C4889m k10 = mVar.k(1897345301);
        if ((i13 & 6) == 0) {
            i11 = ((i13 & 8) == 0 ? k10.V(fVar2) : k10.F(fVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        C17631a<C16807N> aVar4 = aVar;
        if ((i13 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        C17631a<C16807N> aVar5 = aVar2;
        if ((i13 & 384) == 0) {
            i11 |= k10.F(aVar5) ? 256 : 128;
        }
        C17631a<C16807N> aVar6 = aVar3;
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(aVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17642l<? super Integer, C16807N> lVar3 = lVar;
        if ((i13 & 24576) == 0) {
            i11 |= k10.F(lVar3) ? 16384 : 8192;
        }
        C17642l<? super Drawable, C16807N> lVar4 = lVar2;
        if ((196608 & i13) == 0) {
            i11 |= k10.F(lVar4) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i14 = i11;
        if ((74899 & i14) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1897345301, i14, -1, "com.ingka.ikea.familyrewards.implementation.compose.details.FamilyRewardsDetailsContent (RewardsDetailsScreen.kt:187)");
            }
            d.a aVar7 = d.f18749a;
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar8 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar8.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar7);
            C4504g.a aVar9 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar9.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar9.c());
            F1.c(a13, s10, aVar9.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar9.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar9.d());
            int i15 = i14 >> 9;
            d.a aVar10 = aVar7;
            p(fVar, lVar, lVar2, C5861g.c(C5862h.f28810a, aVar7, 1.0f, false, 2, (Object) null), k10, (i14 & 14) | (i15 & 112) | (i15 & 896), 0);
            int i16 = i14;
            mVar2 = k10;
            C13643u0.c((d) null, 0.0f, 0, k10, 0, 7);
            float f10 = (float) 24;
            d k11 = D.k(Rq.d.k(), 0.0f, h.B(f10), 1, (Object) null);
            I a14 = C5080k.a(dVar.g(), aVar8.k(), mVar2, 0);
            int a15 = C4883j.a(mVar2, 0);
            C4912y s11 = mVar2.s();
            d e11 = c.e(mVar2, k11);
            C17631a<C4504g> a16 = aVar9.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a16);
            } else {
                mVar2.t();
            }
            C4889m a17 = F1.a(mVar2);
            F1.c(a17, a14, aVar9.c());
            F1.c(a17, s11, aVar9.e());
            nI.p<C4504g, Integer, C16807N> b11 = aVar9.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e11, aVar9.d());
            if (fVar2 instanceof f.a) {
                mVar2.W(302988643);
                f.a aVar11 = (f.a) fVar2;
                Xq.h.b(aVar11.d(), C5116k1.a(aVar10, "TestTag-SlideToUnlockAction"), aVar11.e(), false, aVar3, mVar2, C13023e.f110931a | 48 | (57344 & (i16 << 3)), 8);
                mVar2.P();
            } else {
                d.a aVar12 = aVar10;
                if (fVar2 instanceof f.c) {
                    mVar2.W(303437771);
                    f.c cVar = (f.c) fVar2;
                    boolean b12 = g.b(cVar);
                    mVar2.W(-128757185);
                    if (b12) {
                        i12 = 6;
                        C13607l.j(j.b(e.f86983d, mVar2, 0), C13679b.a.C2856b.f116680a, J.h(C5116k1.a(aVar12, "TestTag-HowToUseReward"), 0.0f, 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, Y1.j.h(Y1.j.f14783b.a()), (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 261112);
                    } else {
                        i12 = 6;
                    }
                    mVar2.P();
                    f.b d10 = cVar.d();
                    if (d10 == null || g.a(cVar)) {
                        d10 = null;
                    }
                    if (d10 != null) {
                        mVar2.W(-128736972);
                        if (b12) {
                            C5844O.a(J.i(aVar12, h.B(f10)), mVar2, i12);
                        }
                        mVar2.P();
                        L.b(cVar.d().b().a(mVar2, C13023e.f110931a), J.h(C5116k1.a(aVar12, "TestTag-UseRewardAction"), 0.0f, 1, (Object) null), false, (N) null, (M) null, false, cVar.d().a(), (K0) null, (m) null, aVar2, mVar2, ((i16 << 21) & 1879048192) | 48, 444);
                    }
                    mVar2.P();
                } else if (fVar2 instanceof f.h) {
                    mVar2.W(304745630);
                    f.h hVar = (f.h) fVar2;
                    b.b(hVar.e(), hVar.d(), C5116k1.a(aVar12, "TestTag-CollectMoreKeysAction"), aVar, mVar2, (C13023e.f110931a << 3) | 384 | ((i16 << 6) & 7168), 0);
                    mVar2.P();
                } else {
                    mVar2.W(-128773854);
                    mVar2.P();
                    throw new t();
                }
            }
            mVar2.x();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new b(fVar, aVar, aVar2, aVar3, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(f.C2249f fVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        v(fVar, aVar, aVar2, aVar3, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void x(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-434513545);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-434513545, i10, -1, "com.ingka.ikea.familyrewards.implementation.compose.details.LoadingScreen (RewardsDetailsScreen.kt:360)");
            }
            d.a aVar = d.f18749a;
            d f10 = J.f(aVar, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            H2.b(C5074e.b(J.h(aVar, 0.0f, 1, (Object) null), 1.5306122f, false, 2, (Object) null), false, k10, 6, 2);
            Rq.d.f(k10, 0);
            float f11 = (float) 24;
            r.b(0.45f, h.B(f11), k10, 54);
            Rq.d.f(k10, 0);
            float f12 = (float) 14;
            r.b(0.9f, h.B(f12), k10, 54);
            Rq.d.h(k10, 0);
            r.b(0.9f, h.B(f12), k10, 54);
            Rq.d.h(k10, 0);
            r.b(0.7f, h.B(f12), k10, 54);
            Rq.d.f(k10, 0);
            r.b(0.15f, h.B(f11), k10, 54);
            Rq.d.f(k10, 0);
            r.b(0.3f, h.B(f12), k10, 54);
            Rq.d.h(k10, 0);
            r.b(0.3f, h.B(f12), k10, 54);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(int i10, C4889m mVar, int i11) {
        x(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: Wq.p$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: Wq.p$a} */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0182, code lost:
        if (r2 == r16.a()) goto L_0x0184;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z(kr.f r30, nI.C17631a<XH.C16807N> r31, nI.C17631a<XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, U0.C4889m r35, int r36) {
        /*
            r1 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r0 = r34
            r15 = r36
            java.lang.String r2 = "model"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "onHowToCollectKeysClicked"
            kotlin.jvm.internal.C17542s.j(r10, r2)
            java.lang.String r2 = "onUnlockRewardRequested"
            kotlin.jvm.internal.C17542s.j(r11, r2)
            java.lang.String r2 = "onUseRewardClicked"
            kotlin.jvm.internal.C17542s.j(r12, r2)
            java.lang.String r2 = "onBackClicked"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = -946857997(0xffffffffc79017f3, float:-73775.9)
            r3 = r35
            U0.m r14 = r3.k(r2)
            r3 = r15 & 6
            r4 = 2
            if (r3 != 0) goto L_0x0047
            r3 = r15 & 8
            if (r3 != 0) goto L_0x003c
            boolean r3 = r14.V(r1)
            goto L_0x0040
        L_0x003c:
            boolean r3 = r14.F(r1)
        L_0x0040:
            if (r3 == 0) goto L_0x0044
            r3 = 4
            goto L_0x0045
        L_0x0044:
            r3 = r4
        L_0x0045:
            r3 = r3 | r15
            goto L_0x0048
        L_0x0047:
            r3 = r15
        L_0x0048:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0058
            boolean r5 = r14.F(r10)
            if (r5 == 0) goto L_0x0055
            r5 = 32
            goto L_0x0057
        L_0x0055:
            r5 = 16
        L_0x0057:
            r3 = r3 | r5
        L_0x0058:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0068
            boolean r5 = r14.F(r11)
            if (r5 == 0) goto L_0x0065
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r3 = r3 | r5
        L_0x0068:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0078
            boolean r5 = r14.F(r12)
            if (r5 == 0) goto L_0x0075
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r3 = r3 | r5
        L_0x0078:
            r5 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0088
            boolean r5 = r14.F(r0)
            if (r5 == 0) goto L_0x0085
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0087
        L_0x0085:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0087:
            r3 = r3 | r5
        L_0x0088:
            r9 = r3
            r3 = r9 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r5) goto L_0x009c
            boolean r3 = r14.l()
            if (r3 != 0) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            r14.L()
            r3 = r14
            goto L_0x0420
        L_0x009c:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00a8
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.familyrewards.implementation.compose.details.RewardsDetailsScreen (RewardsDetailsScreen.kt:106)"
            U0.C4895p.S(r2, r9, r3, r5)
        L_0x00a8:
            r2 = -907658729(0xffffffffc9e63a17, float:-1886018.9)
            r14.W(r2)
            java.lang.Object r2 = r14.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r3 = r16.a()
            r5 = 0
            if (r2 != r3) goto L_0x00c2
            U0.n0 r2 = U0.D0.a(r5)
            r14.u(r2)
        L_0x00c2:
            U0.n0 r2 = (U0.C4892n0) r2
            r14.P()
            r3 = -907656780(0xffffffffc9e641b4, float:-1886262.5)
            r14.W(r3)
            java.lang.Object r3 = r14.D()
            java.lang.Object r6 = r16.a()
            r8 = 0
            if (r3 != r6) goto L_0x00df
            U0.o0 r3 = U0.C4877g1.a(r8)
            r14.u(r3)
        L_0x00df:
            r7 = r3
            U0.o0 r7 = (U0.C4894o0) r7
            r14.P()
            r3 = -907654924(0xffffffffc9e648f4, float:-1886494.5)
            r14.W(r3)
            java.lang.Object r3 = r14.D()
            java.lang.Object r6 = r16.a()
            if (r3 != r6) goto L_0x0101
            Wq.k r3 = new Wq.k
            r3.<init>(r7, r2)
            U0.A1 r3 = U0.p1.e(r3)
            r14.u(r3)
        L_0x0101:
            r24 = r3
            U0.A1 r24 = (U0.A1) r24
            r14.P()
            r6 = 0
            r3 = 1
            jC.i r13 = jC.k.c(r6, r14, r8, r3)
            boolean r3 = n0.C5607m.a(r14, r8)
            r8 = -907647617(0xffffffffc9e6657f, float:-1887407.9)
            r14.W(r8)
            java.lang.Object r8 = r14.D()
            java.lang.Object r5 = r16.a()
            if (r8 != r5) goto L_0x0129
            U0.r0 r8 = U0.u1.e(r6, r6, r4, r6)
            r14.u(r8)
        L_0x0129:
            U0.r0 r8 = (U0.C4899r0) r8
            r14.P()
            r5 = -907645463(0xffffffffc9e66de9, float:-1887677.1)
            r14.W(r5)
            java.lang.Object r5 = r14.D()
            java.lang.Object r4 = r16.a()
            if (r5 != r4) goto L_0x0150
            r0 = 1
            r4 = 0
            long r4 = jC.i.a.a(r13, r4, r0, r6)
            p1.v0 r0 = p1.C5747v0.k(r4)
            r4 = 2
            U0.r0 r5 = U0.u1.e(r0, r6, r4, r6)
            r14.u(r5)
        L_0x0150:
            r0 = r5
            U0.r0 r0 = (U0.C4899r0) r0
            r14.P()
            android.graphics.drawable.Drawable r4 = J(r8)
            boolean r5 = H(r24)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r3)
            r6 = -907641367(0xffffffffc9e67de9, float:-1888189.1)
            r14.W(r6)
            boolean r6 = r14.F(r13)
            boolean r17 = r14.b(r3)
            r6 = r6 | r17
            r26 = r2
            java.lang.Object r2 = r14.D()
            if (r6 != 0) goto L_0x0184
            java.lang.Object r6 = r16.a()
            if (r2 != r6) goto L_0x019a
        L_0x0184:
            Wq.p$a r2 = new Wq.p$a
            r23 = 0
            r17 = r2
            r18 = r13
            r19 = r3
            r20 = r24
            r21 = r8
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r14.u(r2)
        L_0x019a:
            r6 = r2
            nI.p r6 = (nI.p) r6
            r14.P()
            r2 = 0
            r3 = r4
            r4 = r5
            r5 = r25
            r13 = 0
            r13 = r7
            r7 = r14
            r27 = r8
            r10 = 0
            r8 = r2
            U0.P.e(r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c r2 = r17.o()
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r10)
            int r3 = U0.C4883j.a(r14, r10)
            U0.y r4 = r14.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r14, r8)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r6 = r18.a()
            U0.f r7 = r14.m()
            if (r7 != 0) goto L_0x01d6
            U0.C4883j.c()
        L_0x01d6:
            r14.I()
            boolean r7 = r14.i()
            if (r7 == 0) goto L_0x01e3
            r14.p(r6)
            goto L_0x01e6
        L_0x01e3:
            r14.t()
        L_0x01e6:
            U0.m r6 = U0.F1.a(r14)
            nI.p r7 = r18.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r18.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r18.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0210
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x021e
        L_0x0210:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x021e:
            nI.p r2 = r18.d()
            U0.F1.c(r6, r5, r2)
            androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
            boolean r2 = r1 instanceof kr.f.d
            if (r2 != 0) goto L_0x022f
            boolean r2 = r1 instanceof kr.f.e
            if (r2 == 0) goto L_0x0237
        L_0x022f:
            r29 = r8
            r19 = r9
            r28 = r26
            goto L_0x02b9
        L_0x0237:
            boolean r2 = r1 instanceof kr.f.C2249f
            if (r2 == 0) goto L_0x02aa
            r2 = -1402127419(0xffffffffac6d3bc5, float:-3.3712904E-12)
            r14.W(r2)
            r2 = r1
            kr.f$f r2 = (kr.f.C2249f) r2
            r3 = 1894436327(0x70eacde7, float:5.813473E29)
            r14.W(r3)
            java.lang.Object r3 = r14.D()
            java.lang.Object r4 = r16.a()
            if (r3 != r4) goto L_0x025c
            Wq.l r3 = new Wq.l
            r3.<init>(r13)
            r14.u(r3)
        L_0x025c:
            r6 = r3
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            r3 = 1894445038(0x70eaefee, float:5.816764E29)
            r14.W(r3)
            java.lang.Object r3 = r14.D()
            java.lang.Object r4 = r16.a()
            if (r3 != r4) goto L_0x027c
            Wq.m r3 = new Wq.m
            r4 = r27
            r3.<init>(r4)
            r14.u(r3)
        L_0x027c:
            r7 = r3
            nI.l r7 = (nI.C17642l) r7
            r14.P()
            r3 = r9 & 112(0x70, float:1.57E-43)
            r4 = 221184(0x36000, float:3.09945E-40)
            r3 = r3 | r4
            int r4 = r9 >> 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            int r4 = r9 << 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r13 = r3 | r4
            r5 = r26
            r3 = r31
            r4 = r33
            r28 = r5
            r5 = r32
            r29 = r8
            r8 = r14
            r19 = r9
            r9 = r13
            v(r2, r3, r4, r5, r6, r7, r8, r9)
            r14.P()
            goto L_0x02c5
        L_0x02aa:
            r0 = 1894426140(0x70eaa61c, float:5.8096245E29)
            r14.W(r0)
            r14.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x02b9:
            r2 = -1402234431(0xffffffffac6b99c1, float:-3.348086E-12)
            r14.W(r2)
            x(r14, r10)
            r14.P()
        L_0x02c5:
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$b r3 = r17.k()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r14, r10)
            int r3 = U0.C4883j.a(r14, r10)
            U0.y r4 = r14.s()
            r13 = r29
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r14, r13)
            nI.a r6 = r18.a()
            U0.f r7 = r14.m()
            if (r7 != 0) goto L_0x02ee
            U0.C4883j.c()
        L_0x02ee:
            r14.I()
            boolean r7 = r14.i()
            if (r7 == 0) goto L_0x02fb
            r14.p(r6)
            goto L_0x02fe
        L_0x02fb:
            r14.t()
        L_0x02fe:
            U0.m r6 = U0.F1.a(r14)
            nI.p r7 = r18.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r18.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r18.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0328
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x0336
        L_0x0328:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x0336:
            nI.p r2 = r18.d()
            U0.F1.c(r6, r5, r2)
            s0.h r2 = s0.C5862h.f28810a
            long r4 = L(r0)
            r8 = 0
            r9 = 5
            r3 = 0
            r6 = 0
            r7 = r14
            kC.C14673d.b(r3, r4, r6, r7, r8, r9)
            boolean r0 = H(r24)
            if (r0 == 0) goto L_0x03a4
            r0 = -6550761(0xffffffffff9c0b17, float:NaN)
            r14.W(r0)
            ol.v r13 = ol.v.BACK
            IC.e r0 = r30.getTitle()
            int r2 = IC.C13023e.f110931a
            java.lang.String r6 = r0.a(r14, r2)
            boolean r0 = r1 instanceof kr.f.e
            if (r0 != 0) goto L_0x0368
            goto L_0x0369
        L_0x0368:
            r6 = 0
        L_0x0369:
            if (r6 != 0) goto L_0x0370
            java.lang.String r0 = ""
            r16 = r0
            goto L_0x0372
        L_0x0370:
            r16 = r6
        L_0x0372:
            O0.f1 r0 = O0.f1.f10774a
            int r2 = O0.f1.f10780g
            s0.T r0 = r0.e(r14, r2)
            s0.Y$a r2 = s0.C5853Y.f28774a
            int r2 = r2.f()
            s0.T r0 = s0.C5850V.i(r0, r2)
            int r2 = r19 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r23 = r2 | 6
            r24 = 436(0x1b4, float:6.11E-43)
            r2 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r3 = r14
            r14 = r34
            r15 = r2
            r19 = r0
            r22 = r3
            ol.p.c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.P()
            goto L_0x0411
        L_0x03a4:
            r3 = r14
            r0 = -6035479(0xffffffffffa3e7e9, float:NaN)
            r3.W(r0)
            int r0 = uK.C18146a.f148719y
            int r2 = Oo.b.f84632f
            java.lang.String r14 = J1.j.b(r2, r3, r10)
            SC.G0 r18 = SC.G0.Small
            SC.H0 r17 = SC.H0.PrimaryInverseStatic
            java.lang.String r2 = "TestTag-BackButton"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r13, r2)
            r2 = 16
            float r2 = (float) r2
            float r5 = c2.h.B(r2)
            float r6 = c2.h.B(r2)
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r4, r5, r6, r7, r8, r9, r10)
            r4 = 2078032230(0x7bdc4166, float:2.2872635E36)
            r3.W(r4)
            java.lang.Object r4 = r3.D()
            java.lang.Object r5 = r16.a()
            if (r4 != r5) goto L_0x03eb
            Wq.n r4 = new Wq.n
            r5 = r28
            r4.<init>(r5)
            r3.u(r4)
        L_0x03eb:
            nI.l r4 = (nI.C17642l) r4
            r3.P()
            androidx.compose.ui.d r15 = androidx.compose.ui.layout.c.a(r2, r4)
            int r2 = r19 << 12
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r4
            r4 = 221568(0x36180, float:3.10483E-40)
            r23 = r2 | r4
            r24 = 200(0xc8, float:2.8E-43)
            r16 = 0
            r19 = 0
            r20 = 0
            r13 = r0
            r21 = r34
            r22 = r3
            SC.F0.b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.P()
        L_0x0411:
            r3.x()
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0420
            U0.C4895p.R()
        L_0x0420:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x043b
            Wq.o r8 = new Wq.o
            r0 = r8
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x043b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Wq.p.z(kr.f, nI.a, nI.a, nI.a, nI.a, U0.m, int):void");
    }
}
