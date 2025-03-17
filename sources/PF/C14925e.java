package pF;

import B0.C4373q;
import E1.C4478k;
import E1.I;
import G1.C4504g;
import I0.b1;
import J1.j;
import N1.C4669d;
import N1.C4689y;
import N1.P;
import N1.S;
import N1.T;
import N1.Y;
import O0.d1;
import QJ.C16297b0;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16807N;
import XH.y;
import Y1.k;
import Y1.s;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import c2.h;
import c2.r;
import c2.t;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.Map;
import kF.C14681B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.e;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5749w0;
import qF.C14954a;
import s0.C5843N;
import s0.C5844O;
import t1.C5942c;
import tK.C18030v;
import uK.C18148c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001ak\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000e8\n@\nX\u0002"}, d2 = {"LpF/f;", "state", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "Landroid/net/Uri;", "getVideoAssetUri", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "LXH/N;", "onPrimaryButtonClick", "onClose", "LkF/B;", "onVideoPlaybackStateChanged", "e", "(LpF/f;LnI/l;LnI/l;LnI/l;LnI/l;LU0/m;II)V", "", "isLandscape", "visible", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: pF.e  reason: case insensitive filesystem */
public final class C14925e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.compose.tutorial.TutorialPageKt$TutorialPage$1$TutorialContent$1$1$1$1$1", f = "TutorialPage.kt", l = {184}, m = "invokeSuspend")
    /* renamed from: pF.e$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130350c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14954a f130351d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f130352e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14954a aVar, C4899r0<Boolean> r0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f130351d = aVar;
            this.f130352e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f130351d, this.f130352e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130350c;
            if (i10 == 0) {
                y.b(obj);
                long c10 = this.f130351d.c();
                this.f130350c = 1;
                if (C16297b0.b(c10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14925e.i(this.f130352e, true);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pF.e$b */
    static final class b implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14954a f130353a;

        b(C14954a aVar) {
            this.f130353a = aVar;
        }

        public final void a(e eVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(1758307911, i10, -1, "com.sugarcube.app.base.ui.compose.tutorial.TutorialPage.<anonymous>.TutorialContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TutorialPage.kt:191)");
            }
            if (this.f130353a.b()) {
                mVar2.W(-20835605);
                d.a aVar = d.f18749a;
                d m10 = D.m(aVar, 0.0f, h.B((float) 16), 0.0f, 0.0f, 13, (Object) null);
                C5437c.C0386c l10 = C5437c.f24302a.l();
                C14954a aVar2 = this.f130353a;
                I b10 = G.b(C5073d.f18068a.f(), l10, mVar2, 48);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, m10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, b10, aVar3.c());
                F1.c(a12, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b11 = aVar3.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar3.d());
                C5843N n10 = C5843N.f28726a;
                d t10 = J.t(aVar, h.B((float) 20));
                C5942c c10 = J1.e.c(C18148c.CleanSparkles.m(), mVar2, 0);
                C5749w0.a aVar4 = C5749w0.f27365b;
                C18030v vVar = C18030v.f147664a;
                int i11 = C18030v.f147665b;
                C5583F.a(c10, "Emphasized icon", t10, (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(aVar4, vVar.a(mVar2, i11).u0(), 0, 2, (Object) null), mVar, 432, 56);
                C5844O.a(D.m(aVar, h.B((float) 8), 0.0f, 0.0f, 0.0f, 14, (Object) null), mVar2, 6);
                d C10 = J.C(aVar, (C5437c.C0386c) null, false, 3, (Object) null);
                int i12 = i11;
                b1.b(j.b(aVar2.a(), mVar2, 0), C10, vVar.a(mVar2, i12).u0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(mVar2, i12).c().c(), mVar, 48, 0, 65528);
                mVar.x();
                mVar.P();
            } else {
                C4889m mVar3 = mVar;
                mVar3.W(-19612128);
                b1.c(C14925e.g(this.f130353a.a(), mVar3, 0), D.m(d.f18749a, 0.0f, h.B((float) 16), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (Map<String, C4373q>) null, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(mVar3, C18030v.f147665b).a().a(), mVar, 48, 0, 131068);
                mVar.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(pF.C14926f r16, nI.C17642l<? super com.sugarcube.app.base.data.asset.VideoAsset, ? extends android.net.Uri> r17, nI.C17642l<? super com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum, XH.C16807N> r18, nI.C17642l<? super com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum, XH.C16807N> r19, nI.C17642l<? super kF.C14681B, XH.C16807N> r20, U0.C4889m r21, int r22, int r23) {
        /*
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r22
            r0 = 16
            r1 = 4
            java.lang.String r2 = "state"
            kotlin.jvm.internal.C17542s.j(r7, r2)
            java.lang.String r2 = "getVideoAssetUri"
            kotlin.jvm.internal.C17542s.j(r8, r2)
            java.lang.String r2 = "onPrimaryButtonClick"
            kotlin.jvm.internal.C17542s.j(r9, r2)
            java.lang.String r2 = "onClose"
            kotlin.jvm.internal.C17542s.j(r10, r2)
            r2 = -26209318(0xfffffffffe7013da, float:-7.977945E37)
            r3 = r21
            U0.m r12 = r3.k(r2)
            r3 = 1
            r4 = r23 & 1
            r5 = 2
            if (r4 == 0) goto L_0x0033
            r4 = r11 | 6
            goto L_0x0043
        L_0x0033:
            r4 = r11 & 6
            if (r4 != 0) goto L_0x0042
            boolean r4 = r12.F(r7)
            if (r4 == 0) goto L_0x003f
            r4 = r1
            goto L_0x0040
        L_0x003f:
            r4 = r5
        L_0x0040:
            r4 = r4 | r11
            goto L_0x0043
        L_0x0042:
            r4 = r11
        L_0x0043:
            r6 = r23 & 2
            if (r6 == 0) goto L_0x004a
            r4 = r4 | 48
            goto L_0x0059
        L_0x004a:
            r6 = r11 & 48
            if (r6 != 0) goto L_0x0059
            boolean r6 = r12.F(r8)
            if (r6 == 0) goto L_0x0057
            r6 = 32
            goto L_0x0058
        L_0x0057:
            r6 = r0
        L_0x0058:
            r4 = r4 | r6
        L_0x0059:
            r1 = r23 & 4
            if (r1 == 0) goto L_0x0060
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0060:
            r1 = r11 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0070
            boolean r1 = r12.F(r9)
            if (r1 == 0) goto L_0x006d
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r1 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r4 = r4 | r1
        L_0x0070:
            r1 = r23 & 8
            if (r1 == 0) goto L_0x0077
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0077:
            r1 = r11 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0087
            boolean r1 = r12.F(r10)
            if (r1 == 0) goto L_0x0084
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r4 = r4 | r1
        L_0x0087:
            r0 = r23 & 16
            if (r0 == 0) goto L_0x0090
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r1 = r20
            goto L_0x00a2
        L_0x0090:
            r1 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x008d
            r1 = r20
            boolean r6 = r12.F(r1)
            if (r6 == 0) goto L_0x009f
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r4 = r4 | r6
        L_0x00a2:
            r6 = r4 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r6 != r13) goto L_0x00b5
            boolean r6 = r12.l()
            if (r6 != 0) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            r12.L()
            r5 = r1
            goto L_0x0259
        L_0x00b5:
            r6 = 0
            if (r0 == 0) goto L_0x00ba
            r13 = r6
            goto L_0x00bb
        L_0x00ba:
            r13 = r1
        L_0x00bb:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00c7
            r0 = -1
            java.lang.String r1 = "com.sugarcube.app.base.ui.compose.tutorial.TutorialPage (TutorialPage.kt:81)"
            U0.C4895p.S(r2, r4, r0, r1)
        L_0x00c7:
            com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep r14 = r16.c()
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            java.lang.Object r0 = r12.Q(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            r1 = -950311672(0xffffffffc75b6508, float:-56165.03)
            r12.W(r1)
            java.lang.Object r1 = r12.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x00f0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            U0.r0 r1 = U0.u1.e(r1, r6, r5, r6)
            r12.u(r1)
        L_0x00f0:
            U0.r0 r1 = (U0.C4899r0) r1
            r12.P()
            r2 = 0
            androidx.compose.foundation.o r15 = androidx.compose.foundation.m.c(r2, r12, r2, r3)
            int r0 = r0.orientation
            if (r0 != r5) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r3 = r2
        L_0x0100:
            o(r1, r3)
            boolean r0 = n(r1)
            if (r0 == 0) goto L_0x01ad
            r0 = 611332399(0x2470312f, float:5.2083364E-17)
            r12.W(r0)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r1 = r1.f()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.l()
            E1.I r1 = androidx.compose.foundation.layout.G.b(r1, r3, r12, r2)
            int r2 = U0.C4883j.a(r12, r2)
            U0.y r3 = r12.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r12, r0)
            G1.g$a r4 = G1.C4504g.f6515W
            nI.a r5 = r4.a()
            U0.f r6 = r12.m()
            if (r6 != 0) goto L_0x013c
            U0.C4883j.c()
        L_0x013c:
            r12.I()
            boolean r6 = r12.i()
            if (r6 == 0) goto L_0x0149
            r12.p(r5)
            goto L_0x014c
        L_0x0149:
            r12.t()
        L_0x014c:
            U0.m r5 = U0.F1.a(r12)
            nI.p r6 = r4.c()
            U0.F1.c(r5, r1, r6)
            nI.p r1 = r4.e()
            U0.F1.c(r5, r3, r1)
            nI.p r1 = r4.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x0176
            java.lang.Object r3 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x0184
        L_0x0176:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.w(r2, r1)
        L_0x0184:
            nI.p r1 = r4.d()
            U0.F1.c(r5, r0, r1)
            s0.N r0 = s0.C5843N.f28726a
            r6 = 0
            r0 = r17
            r1 = r14
            r2 = r13
            r3 = r19
            r4 = r16
            r5 = r12
            k(r0, r1, r2, r3, r4, r5, r6)
            r5 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r12
            f(r0, r1, r2, r3, r4, r5)
            r12.x()
            r12.P()
            goto L_0x024f
        L_0x01ad:
            r0 = 611446572(0x2471ef2c, float:5.246113E-17)
            r12.W(r0)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r3, r12, r2)
            int r2 = U0.C4883j.a(r12, r2)
            U0.y r3 = r12.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r12, r0)
            G1.g$a r4 = G1.C4504g.f6515W
            nI.a r5 = r4.a()
            U0.f r6 = r12.m()
            if (r6 != 0) goto L_0x01e0
            U0.C4883j.c()
        L_0x01e0:
            r12.I()
            boolean r6 = r12.i()
            if (r6 == 0) goto L_0x01ed
            r12.p(r5)
            goto L_0x01f0
        L_0x01ed:
            r12.t()
        L_0x01f0:
            U0.m r5 = U0.F1.a(r12)
            nI.p r6 = r4.c()
            U0.F1.c(r5, r1, r6)
            nI.p r1 = r4.e()
            U0.F1.c(r5, r3, r1)
            nI.p r1 = r4.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x021a
            java.lang.Object r3 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x0228
        L_0x021a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.w(r2, r1)
        L_0x0228:
            nI.p r1 = r4.d()
            U0.F1.c(r5, r0, r1)
            s0.h r0 = s0.C5862h.f28810a
            r6 = 0
            r0 = r17
            r1 = r14
            r2 = r13
            r3 = r19
            r4 = r16
            r5 = r12
            k(r0, r1, r2, r3, r4, r5, r6)
            r5 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r12
            f(r0, r1, r2, r3, r4, r5)
            r12.x()
            r12.P()
        L_0x024f:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0258
            U0.C4895p.R()
        L_0x0258:
            r5 = r13
        L_0x0259:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x0274
            pF.a r13 = new pF.a
            r0 = r13
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.a(r13)
        L_0x0274:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pF.C14925e.e(pF.f, nI.l, nI.l, nI.l, nI.l, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: nI.a} */
    /* JADX WARNING: type inference failed for: r14v7, types: [m0.N, dI.e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r14v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void f(com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep r34, androidx.compose.foundation.o r35, pF.C14926f r36, nI.C17642l<? super com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum, XH.C16807N> r37, U0.C4889m r38, int r39) {
        /*
            r0 = r36
            r1 = r37
            r15 = r38
            r2 = 1284603747(0x4c917f63, float:7.6282648E7)
            r15.W(r2)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x001a
            r3 = -1
            java.lang.String r4 = "com.sugarcube.app.base.ui.compose.tutorial.TutorialPage.<anonymous>.TutorialContent (TutorialPage.kt:124)"
            r5 = r39
            U0.C4895p.S(r2, r5, r3, r4)
        L_0x001a:
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            r13 = 0
            r12 = 1
            r4 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.d(r14, r13, r12, r4)
            tK.v r3 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r6 = r3.a(r15, r2)
            long r6 = r6.k0()
            r9 = 2
            r10 = 0
            r8 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.d(r5, r6, r8, r9, r10)
            r6 = 24
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.i(r5, r6)
            androidx.compose.foundation.layout.d r27 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r27.g()
            i1.c$a r28 = i1.C5437c.f24302a
            i1.c$b r7 = r28.k()
            r11 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r11)
            int r7 = U0.C4883j.a(r15, r11)
            U0.y r8 = r38.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            G1.g$a r29 = G1.C4504g.f6515W
            nI.a r9 = r29.a()
            U0.f r10 = r38.m()
            if (r10 != 0) goto L_0x006d
            U0.C4883j.c()
        L_0x006d:
            r38.I()
            boolean r10 = r38.i()
            if (r10 == 0) goto L_0x007a
            r15.p(r9)
            goto L_0x007d
        L_0x007a:
            r38.t()
        L_0x007d:
            U0.m r9 = U0.F1.a(r38)
            nI.p r10 = r29.c()
            U0.F1.c(r9, r6, r10)
            nI.p r6 = r29.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r29.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x00a7
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x00b5
        L_0x00a7:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x00b5:
            nI.p r6 = r29.d()
            U0.F1.c(r9, r5, r6)
            s0.h r30 = s0.C5862h.f28810a
            kF.K r5 = new kF.K
            kF.K r6 = r34.getStepIndicator()
            int r6 = r6.a()
            kF.K r7 = r34.getStepIndicator()
            int r7 = r7.b()
            r5.<init>(r6, r7)
            kF.C14692M.b(r4, r5, r15, r11, r12)
            r5 = 12
            float r5 = (float) r5
            float r7 = c2.h.B(r5)
            r10 = 13
            r16 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r5 = r14
            r39 = r14
            r14 = r11
            r11 = r16
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r5, r6, r7, r8, r9, r10, r11)
            r11 = 6
            s0.C5844O.a(r5, r15, r11)
            int r5 = r34.getTitleRes()
            java.lang.String r5 = J1.j.b(r5, r15, r14)
            r10 = r2
            r2 = r5
            tK.w r5 = r3.b(r15, r10)
            tK.r r5 = r5.c()
            N1.Y r22 = r5.a()
            r25 = 0
            r26 = 65534(0xfffe, float:9.1833E-41)
            r5 = 0
            r9 = r3
            r3 = r5
            r5 = 0
            r8 = r4
            r4 = r5
            r6 = 0
            r8 = r16
            r31 = r9
            r9 = r16
            r32 = r10
            r10 = r16
            r16 = 0
            r11 = r16
            r16 = 0
            r13 = r16
            r33 = r39
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r23 = r38
            I0.b1.b(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 20
            float r2 = (float) r2
            float r7 = c2.h.B(r2)
            r10 = 13
            r11 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r5 = r33
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r5, r6, r7, r8, r9, r10, r11)
            r14 = r38
            r13 = 6
            s0.C5844O.a(r2, r14, r13)
            r10 = 14
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r35
            androidx.compose.ui.d r15 = androidx.compose.foundation.m.f(r5, r6, r7, r8, r9, r10, r11)
            r19 = 6
            r20 = 0
            r17 = 0
            r18 = 0
            r16 = r35
            androidx.compose.ui.d r16 = sF.C15049e.f(r15, r16, r17, r18, r19, r20)
            r19 = 2
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r15 = r30
            androidx.compose.ui.d r2 = s0.C5861g.c(r15, r16, r17, r18, r19, r20)
            androidx.compose.foundation.layout.d$m r3 = r27.g()
            i1.c$b r4 = r28.k()
            r15 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r14, r15)
            int r4 = U0.C4883j.a(r14, r15)
            U0.y r5 = r38.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r14, r2)
            nI.a r6 = r29.a()
            U0.f r7 = r38.m()
            if (r7 != 0) goto L_0x01a5
            U0.C4883j.c()
        L_0x01a5:
            r38.I()
            boolean r7 = r38.i()
            if (r7 == 0) goto L_0x01b2
            r14.p(r6)
            goto L_0x01b5
        L_0x01b2:
            r38.t()
        L_0x01b5:
            U0.m r6 = U0.F1.a(r38)
            nI.p r7 = r29.c()
            U0.F1.c(r6, r3, r7)
            nI.p r3 = r29.e()
            U0.F1.c(r6, r5, r3)
            nI.p r3 = r29.b()
            boolean r5 = r6.i()
            if (r5 != 0) goto L_0x01df
            java.lang.Object r5 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x01ed
        L_0x01df:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.w(r4, r3)
        L_0x01ed:
            nI.p r3 = r29.d()
            U0.F1.c(r6, r2, r3)
            int r2 = r34.getBodyRes()
            N1.d r2 = g(r2, r14, r15)
            r3 = r31
            r4 = r32
            tK.w r3 = r3.b(r14, r4)
            tK.c r3 = r3.a()
            N1.Y r23 = r3.a()
            r26 = 0
            r27 = 131070(0x1fffe, float:1.83668E-40)
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r24 = r38
            I0.b1.c(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = -1274234220(0xffffffffb40cba94, float:-1.3106393E-7)
            r13 = r38
            r13.W(r2)
            java.util.List r2 = r34.getDelayedText()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r12 = r2.iterator()
        L_0x024a:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x02d5
            java.lang.Object r2 = r12.next()
            qF.a r2 = (qF.C14954a) r2
            r3 = -860628718(0xffffffffccb3d912, float:-9.4292112E7)
            r13.W(r3)
            java.lang.Object r3 = r38.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r5 = r4.a()
            if (r3 != r5) goto L_0x0274
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r5 = 2
            r14 = 0
            U0.r0 r3 = U0.u1.e(r3, r14, r5, r14)
            r13.u(r3)
            goto L_0x0275
        L_0x0274:
            r14 = 0
        L_0x0275:
            U0.r0 r3 = (U0.C4899r0) r3
            r38.P()
            r5 = -860625914(0xffffffffccb3e406, float:-9.4314544E7)
            r13.W(r5)
            boolean r5 = r13.V(r2)
            java.lang.Object r6 = r38.D()
            if (r5 != 0) goto L_0x0290
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0298
        L_0x0290:
            pF.e$a r6 = new pF.e$a
            r6.<init>(r2, r3, r14)
            r13.u(r6)
        L_0x0298:
            nI.p r6 = (nI.p) r6
            r38.P()
            r15 = 0
            U0.P.g(r2, r6, r13, r15)
            boolean r3 = h(r3)
            r4 = 3
            r11 = 0
            androidx.compose.animation.i r5 = androidx.compose.animation.g.o(r14, r11, r4, r14)
            pF.e$b r4 = new pF.e$b
            r4.<init>(r2)
            r2 = 54
            r6 = 1758307911(0x68cda647, float:7.769219E24)
            r10 = 1
            c1.a r8 = c1.c.e(r6, r10, r4, r13, r2)
            r16 = 1575942(0x180c06, float:2.208365E-39)
            r17 = 26
            r4 = 0
            r6 = 0
            r7 = 0
            r2 = r30
            r9 = r38
            r15 = r10
            r10 = r16
            r35 = r12
            r12 = r11
            r11 = r17
            l0.d.e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12 = r35
            goto L_0x024a
        L_0x02d5:
            r12 = 0
            r14 = 0
            r15 = 1
            r38.P()
            r38.x()
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = 16
            float r3 = (float) r3
            float r20 = c2.h.B(r3)
            r23 = 13
            r24 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r18 = r2
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
            r4 = 6
            s0.C5844O.a(r3, r13, r4)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r12, r15, r14)
            int r3 = r34.getButtonRes()
            r4 = 0
            java.lang.String r3 = J1.j.b(r3, r13, r4)
            wK.l0$d r4 = wK.C18390l0.d.f151153b
            boolean r5 = r36.d()
            r6 = -1541325138(0xffffffffa4213eae, float:-3.4964402E-17)
            r13.W(r6)
            boolean r6 = r13.V(r1)
            boolean r7 = r13.F(r0)
            r6 = r6 | r7
            java.lang.Object r7 = r38.D()
            if (r6 != 0) goto L_0x032b
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0333
        L_0x032b:
            pF.d r7 = new pF.d
            r7.<init>(r1, r0)
            r13.u(r7)
        L_0x0333:
            r9 = r7
            nI.a r9 = (nI.C17631a) r9
            r38.P()
            int r0 = wK.C18390l0.d.f151154c
            int r0 = r0 << 9
            r11 = r0 | 48
            r12 = 496(0x1f0, float:6.95E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r14 = 0
            r0 = r3
            r1 = r2
            r2 = r5
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r10
            r8 = r14
            r10 = r38
            wK.C18342h0.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r38.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0360
            U0.C4895p.R()
        L_0x0360:
            r38.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pF.C14925e.f(com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep, androidx.compose.foundation.o, pF.f, nI.l, U0.m, int):void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public static final C4669d g(int i10, C4889m mVar, int i11) {
        String str;
        C4889m mVar2 = mVar;
        int i12 = i11;
        mVar2.W(1194086378);
        if (C4895p.J()) {
            C4895p.S(1194086378, i12, -1, "com.sugarcube.app.base.ui.compose.tutorial.TutorialPage.<anonymous>.TutorialContent.BulletString (TutorialPage.kt:126)");
        }
        String b10 = j.b(i10, mVar2, i12 & 14);
        Y y10 = (Y) mVar2.Q(d1.d());
        S a10 = T.a(0, mVar2, 0, 1);
        mVar2.W(-118314049);
        boolean V10 = mVar2.V(y10) | mVar2.V(a10);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            str = "•\t\t";
            D10 = Integer.valueOf(r.h(S.b(a10, "•\t\t", y10, 0, false, 0, 0, (t) null, (c2.d) null, (C4820m.b) null, false, 1020, (Object) null).B()));
            mVar2.u(D10);
        } else {
            str = "•\t\t";
        }
        int intValue = ((Number) D10).intValue();
        mVar.P();
        C4689y yVar = new C4689y(0, 0, 0, new Y1.q(0, ((c2.d) mVar2.Q(C5100f0.e())).l0(intValue), 1, (DefaultConstructorMarker) null), (N1.C) null, (Y1.h) null, 0, 0, (s) null, 503, (DefaultConstructorMarker) null);
        C4669d.a aVar = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
        int o10 = aVar.o(yVar);
        try {
            aVar.j(str);
            aVar.j(b10);
            C16807N n10 = C16807N.f139792a;
            aVar.m(o10);
            C4669d q10 = aVar.q();
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return q10;
        } catch (Throwable th2) {
            aVar.m(o10);
            throw th2;
        }
    }

    private static final boolean h(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void i(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, C14926f fVar) {
        lVar.invoke(fVar.c().getStepEnum());
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void k(nI.C17642l<? super com.sugarcube.app.base.data.asset.VideoAsset, ? extends android.net.Uri> r17, com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep r18, nI.C17642l<? super kF.C14681B, XH.C16807N> r19, nI.C17642l<? super com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum, XH.C16807N> r20, pF.C14926f r21, U0.C4889m r22, int r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r15 = r22
            r3 = 1221919640(0x48d50398, float:436252.75)
            r15.W(r3)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x001c
            r4 = -1
            java.lang.String r5 = "com.sugarcube.app.base.ui.compose.tutorial.TutorialPage.<anonymous>.TutorialMedia (TutorialPage.kt:90)"
            r6 = r23
            U0.C4895p.S(r3, r6, r4, r5)
        L_0x001c:
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            tK.v r3 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r15, r4)
            long r7 = r3.U()
            r10 = 2
            r11 = 0
            r9 = 0
            r6 = r16
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.d(r6, r7, r9, r10, r11)
            r4 = 2
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.C5074e.b(r3, r6, r7, r4, r5)
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c r4 = r4.o()
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r7)
            int r5 = U0.C4883j.a(r15, r7)
            U0.y r6 = r22.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r22.m()
            if (r9 != 0) goto L_0x0061
            U0.C4883j.c()
        L_0x0061:
            r22.I()
            boolean r9 = r22.i()
            if (r9 == 0) goto L_0x006e
            r15.p(r8)
            goto L_0x0071
        L_0x006e:
            r22.t()
        L_0x0071:
            U0.m r8 = U0.F1.a(r22)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r7.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r7.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x009b
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x00a9
        L_0x009b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r4)
        L_0x00a9:
            nI.p r4 = r7.d()
            U0.F1.c(r8, r3, r4)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            qF.b r3 = r18.getVideoMetadata()
            com.sugarcube.app.base.data.asset.VideoAsset r3 = r3.b()
            r4 = r17
            java.lang.Object r3 = r4.invoke(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            qF.b r4 = r18.getVideoMetadata()
            int r4 = r4.a()
            kF.a r5 = kF.C14705a.RATIO_1_1
            r6 = -661886576(0xffffffffd88c6990, float:-1.23508012E15)
            r15.W(r6)
            boolean r6 = r15.V(r0)
            java.lang.Object r7 = r22.D()
            if (r6 != 0) goto L_0x00e4
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00ec
        L_0x00e4:
            pF.b r7 = new pF.b
            r7.<init>(r0)
            r15.u(r7)
        L_0x00ec:
            r9 = r7
            nI.l r9 = (nI.C17642l) r9
            r22.P()
            r13 = 384(0x180, float:5.38E-43)
            r14 = 440(0x1b8, float:6.17E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = r22
            kF.b0.l(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.d r0 = s0.C5852X.d(r16)
            r3 = 16
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.i(r0, r3)
            wK.m3$c r4 = wK.C18405m3.c.f151239b
            wK.k3 r5 = wK.C18381k3.Small
            uK.c r0 = uK.C18148c.Cross
            int r0 = r0.m()
            r6 = -661868436(0xffffffffd88cb06c, float:-1.23751483E15)
            r15.W(r6)
            boolean r6 = r15.V(r1)
            boolean r7 = r15.F(r2)
            r6 = r6 | r7
            java.lang.Object r7 = r22.D()
            if (r6 != 0) goto L_0x0136
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x013e
        L_0x0136:
            pF.c r7 = new pF.c
            r7.<init>(r1, r2)
            r15.u(r7)
        L_0x013e:
            r8 = r7
            nI.a r8 = (nI.C17631a) r8
            r22.P()
            int r1 = wK.C18405m3.c.f151240c
            int r1 = r1 << 12
            r2 = 196656(0x30030, float:2.75574E-40)
            r10 = r1 | r2
            r11 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "Close button"
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r3
            r3 = r6
            r6 = r7
            r7 = r9
            r9 = r22
            wK.C18357i3.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r22.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0169
            U0.C4895p.R()
        L_0x0169:
            r22.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pF.C14925e.k(nI.l, com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep, nI.l, nI.l, pF.f, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17642l lVar, C14681B b10) {
        C17542s.j(b10, "playbackState");
        if (lVar != null) {
            lVar.invoke(b10);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar, C14926f fVar) {
        lVar.invoke(fVar.c().getStepEnum());
        return C16807N.f139792a;
    }

    private static final boolean n(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void o(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C14926f fVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, int i10, int i11, C4889m mVar, int i12) {
        e(fVar, lVar, lVar2, lVar3, lVar4, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
