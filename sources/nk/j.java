package Nk;

import QJ.Q;
import U0.C4889m;
import U0.M0;
import Ww.r;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onSkip", "f", "(LnI/a;LU0/m;I)V", "LT0/d;", "widthSizeClass", "onOpenPushNotificationSettings", "Landroidx/compose/ui/d;", "modifier", "d", "(ILnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "splash_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.splash.onboarding.steps.notifications.compose.OnboardingEnablePushScreenKt$OnboardingEnablePushScreen$1$1", f = "OnboardingEnablePushScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f83830c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f83831d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f83832e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f83831d = rVar;
            this.f83832e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f83831d, this.f83832e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f83830c == 0) {
                y.b(obj);
                r.b c10 = this.f83831d.c();
                if (C17542s.e(c10, r.b.C2906b.f117721a)) {
                    this.f83832e.invoke();
                } else if (C17542s.e(c10, r.b.d.f117723a)) {
                    this.f83832e.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d(int r20, nI.C17631a<XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, androidx.compose.ui.d r23, U0.C4889m r24, int r25, int r26) {
        /*
            r7 = r20
            r8 = r25
            r0 = -2118922177(0xffffffff81b3d03f, float:-6.6053034E-38)
            r1 = r24
            U0.m r9 = r1.k(r0)
            r1 = r26 & 1
            if (r1 == 0) goto L_0x0014
            r1 = r8 | 6
            goto L_0x0024
        L_0x0014:
            r1 = r8 & 6
            if (r1 != 0) goto L_0x0023
            boolean r1 = r9.d(r7)
            if (r1 == 0) goto L_0x0020
            r1 = 4
            goto L_0x0021
        L_0x0020:
            r1 = 2
        L_0x0021:
            r1 = r1 | r8
            goto L_0x0024
        L_0x0023:
            r1 = r8
        L_0x0024:
            r2 = r26 & 2
            r3 = 16
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            r10 = r21
            goto L_0x0040
        L_0x002f:
            r2 = r8 & 48
            r10 = r21
            if (r2 != 0) goto L_0x0040
            boolean r2 = r9.F(r10)
            if (r2 == 0) goto L_0x003e
            r2 = 32
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            r1 = r1 | r2
        L_0x0040:
            r2 = r26 & 4
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 384(0x180, float:5.38E-43)
            r11 = r22
            goto L_0x005b
        L_0x0049:
            r2 = r8 & 384(0x180, float:5.38E-43)
            r11 = r22
            if (r2 != 0) goto L_0x005b
            boolean r2 = r9.F(r11)
            if (r2 == 0) goto L_0x0058
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r1 = r1 | r2
        L_0x005b:
            r2 = r26 & 8
            if (r2 == 0) goto L_0x0064
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r4 = r23
            goto L_0x0076
        L_0x0064:
            r4 = r8 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0061
            r4 = r23
            boolean r5 = r9.V(r4)
            if (r5 == 0) goto L_0x0073
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r1 = r1 | r5
        L_0x0076:
            r5 = r1 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r5 != r6) goto L_0x0088
            boolean r5 = r9.l()
            if (r5 != 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            r9.L()
            goto L_0x0159
        L_0x0088:
            if (r2 == 0) goto L_0x008e
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r12 = r2
            goto L_0x008f
        L_0x008e:
            r12 = r4
        L_0x008f:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x009b
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.splash.onboarding.steps.notifications.compose.EnablePushContent (OnboardingEnablePushScreen.kt:59)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x009b:
            androidx.compose.ui.d r0 = TC.e.i(r12)
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c$b r2 = r2.g()
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r4.g()
            r5 = 48
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r4, r2, r9, r5)
            r4 = 0
            int r5 = U0.C4883j.a(r9, r4)
            U0.y r6 = r9.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r9, r0)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r15 = r9.m()
            if (r15 != 0) goto L_0x00cd
            U0.C4883j.c()
        L_0x00cd:
            r9.I()
            boolean r15 = r9.i()
            if (r15 == 0) goto L_0x00da
            r9.p(r14)
            goto L_0x00dd
        L_0x00da:
            r9.t()
        L_0x00dd:
            U0.m r14 = U0.F1.a(r9)
            nI.p r15 = r13.c()
            U0.F1.c(r14, r2, r15)
            nI.p r2 = r13.e()
            U0.F1.c(r14, r6, r2)
            nI.p r2 = r13.b()
            boolean r6 = r14.i()
            if (r6 != 0) goto L_0x0107
            java.lang.Object r6 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r15)
            if (r6 != 0) goto L_0x0115
        L_0x0107:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r14.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14.w(r5, r2)
        L_0x0115:
            nI.p r2 = r13.d()
            U0.F1.c(r14, r0, r2)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            androidx.compose.ui.d r13 = r0.a(r2, r5, r6)
            float r0 = (float) r3
            float r17 = c2.h.B(r0)
            r18 = 7
            r19 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r13, r14, r15, r16, r17, r18, r19)
            r2 = r1 & 14
            Nk.f.b(r7, r0, r9, r2, r4)
            r5 = r1 & 1022(0x3fe, float:1.432E-42)
            r6 = 8
            r3 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r4 = r9
            Nk.d.h(r0, r1, r2, r3, r4, r5, r6)
            r9.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0158
            U0.C4895p.R()
        L_0x0158:
            r4 = r12
        L_0x0159:
            U0.Y0 r9 = r9.n()
            if (r9 == 0) goto L_0x0172
            Nk.i r12 = new Nk.i
            r0 = r12
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.a(r12)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Nk.j.d(int, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(int i10, C17631a aVar, C17631a aVar2, d dVar, int i11, int i12, C4889m mVar, int i13) {
        d(i10, aVar, aVar2, dVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(nI.C17631a<XH.C16807N> r10, U0.C4889m r11, int r12) {
        /*
            java.lang.String r0 = "onSkip"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = -1614716915(0xffffffff9fc1600d, float:-8.189758E-20)
            U0.m r11 = r11.k(r0)
            r1 = r12 & 6
            r2 = 4
            r3 = 2
            if (r1 != 0) goto L_0x001d
            boolean r1 = r11.F(r10)
            if (r1 == 0) goto L_0x001a
            r1 = r2
            goto L_0x001b
        L_0x001a:
            r1 = r3
        L_0x001b:
            r1 = r1 | r12
            goto L_0x001e
        L_0x001d:
            r1 = r12
        L_0x001e:
            r4 = r1 & 3
            if (r4 != r3) goto L_0x002e
            boolean r4 = r11.l()
            if (r4 != 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r11.L()
            goto L_0x00ca
        L_0x002e:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x003a
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.app.splash.onboarding.steps.notifications.compose.OnboardingEnablePushScreen (OnboardingEnablePushScreen.kt:31)"
            U0.C4895p.S(r0, r1, r4, r5)
        L_0x003a:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r11.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r0 = Xo.c.a(r0)
            if (r0 == 0) goto L_0x00d9
            r4 = 0
            T0.c r0 = T0.a.a(r0, r11, r4)
            java.lang.String r5 = "android.permission.POST_NOTIFICATIONS"
            r6 = 0
            r7 = 6
            Ww.r r3 = Ww.t.b(r5, r6, r11, r7, r3)
            Ww.r$b r5 = r3.c()
            r8 = 389721394(0x173aad32, float:6.0318445E-25)
            r11.W(r8)
            boolean r8 = r11.V(r3)
            r9 = r1 & 14
            if (r9 != r2) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x006b:
            r2 = r4
        L_0x006c:
            r2 = r2 | r8
            java.lang.Object r8 = r11.D()
            if (r2 != 0) goto L_0x007b
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x0083
        L_0x007b:
            Nk.j$a r8 = new Nk.j$a
            r8.<init>(r3, r10, r6)
            r11.u(r8)
        L_0x0083:
            nI.p r8 = (nI.p) r8
            r11.P()
            U0.P.g(r5, r8, r11, r4)
            int r0 = r0.b()
            r2 = 389731298(0x173ad3e2, float:6.0367275E-25)
            r11.W(r2)
            boolean r2 = r11.V(r3)
            java.lang.Object r4 = r11.D()
            if (r2 != 0) goto L_0x00a7
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x00af
        L_0x00a7:
            Nk.g r4 = new Nk.g
            r4.<init>(r3)
            r11.u(r4)
        L_0x00af:
            r2 = r4
            nI.a r2 = (nI.C17631a) r2
            r11.P()
            int r1 = r1 << r7
            r6 = r1 & 896(0x380, float:1.256E-42)
            r7 = 8
            r4 = 0
            r1 = r0
            r3 = r10
            r5 = r11
            d(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ca
            U0.C4895p.R()
        L_0x00ca:
            U0.Y0 r11 = r11.n()
            if (r11 == 0) goto L_0x00d8
            Nk.h r0 = new Nk.h
            r0.<init>(r10, r12)
            r11.a(r0)
        L_0x00d8:
            return
        L_0x00d9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Required value was null."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Nk.j.f(nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(r rVar) {
        rVar.b();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17631a aVar, int i10, C4889m mVar, int i11) {
        f(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
