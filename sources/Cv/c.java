package Cv;

import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import n1.C5635o;
import nI.C17631a;
import nI.p;
import o1.C5669i;
import y0.C6248b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "c", "(LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.compose.common.delight.DelightMessageKt$DelightMessage$1$1$1$1$1", f = "DelightMessage.kt", l = {70}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6248b f33812d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6248b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f33812d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f33812d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f33811c;
            if (i10 == 0) {
                y.b(obj);
                C6248b bVar = this.f33812d;
                this.f33811c = 1;
                if (C6248b.a(bVar, (C5669i) null, this, 1, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(nI.C17631a<XH.C16807N> r38, androidx.compose.ui.d r39, U0.C4889m r40, int r41, int r42) {
        /*
            r7 = r38
            r8 = r41
            r9 = r42
            r10 = 48
            r11 = 6
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            r0 = 1078185224(0x4043cd08, float:3.059389)
            r1 = r40
            U0.m r15 = r1.k(r0)
            r1 = r9 & 1
            r14 = 2
            if (r1 == 0) goto L_0x001f
            r1 = r8 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r8 & 6
            if (r1 != 0) goto L_0x002e
            boolean r1 = r15.F(r7)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = r14
        L_0x002c:
            r1 = r1 | r8
            goto L_0x002f
        L_0x002e:
            r1 = r8
        L_0x002f:
            r2 = r9 & 2
            r3 = 32
            if (r2 == 0) goto L_0x0039
            r1 = r1 | r10
        L_0x0036:
            r4 = r39
            goto L_0x004a
        L_0x0039:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x0036
            r4 = r39
            boolean r5 = r15.V(r4)
            if (r5 == 0) goto L_0x0047
            r5 = r3
            goto L_0x0049
        L_0x0047:
            r5 = 16
        L_0x0049:
            r1 = r1 | r5
        L_0x004a:
            r5 = r1 & 19
            r6 = 18
            if (r5 != r6) goto L_0x005d
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0057
            goto L_0x005d
        L_0x0057:
            r15.L()
            r5 = r15
            goto L_0x02a1
        L_0x005d:
            if (r2 == 0) goto L_0x0063
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r13 = r2
            goto L_0x0064
        L_0x0063:
            r13 = r4
        L_0x0064:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0070
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.membership.impl.compose.common.delight.DelightMessage (DelightMessage.kt:49)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0070:
            r0 = -1804023372(0xffffffff9478c9b4, float:-1.2560579E-26)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r4 = r2.a()
            if (r0 != r4) goto L_0x0089
            y0.b r0 = androidx.compose.foundation.relocation.b.a()
            r15.u(r0)
        L_0x0089:
            y0.b r0 = (y0.C6248b) r0
            r15.P()
            java.lang.Object r4 = r15.D()
            java.lang.Object r5 = r2.a()
            if (r4 != r5) goto L_0x00a7
            dI.j r4 = dI.C17169j.f142968a
            QJ.Q r4 = U0.P.k(r4, r15)
            U0.B r5 = new U0.B
            r5.<init>(r4)
            r15.u(r5)
            r4 = r5
        L_0x00a7:
            U0.B r4 = (U0.B) r4
            QJ.Q r4 = r4.a()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r6 = r5.g()
            androidx.compose.ui.d r16 = androidx.compose.foundation.relocation.b.b(r13, r0)
            r12 = 56
            float r12 = (float) r12
            float r18 = c2.h.B(r12)
            float r3 = (float) r3
            float r20 = c2.h.B(r3)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r12 = r12.g()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r12, r6, r15, r10)
            r12 = 0
            int r16 = U0.C4883j.a(r15, r12)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r10 = r17.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x00f5
            U0.C4883j.c()
        L_0x00f5:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0102
            r15.p(r10)
            goto L_0x0105
        L_0x0102:
            r15.t()
        L_0x0105:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r17.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r17.e()
            U0.F1.c(r10, r14, r6)
            nI.p r6 = r17.b()
            boolean r11 = r10.i()
            if (r11 != 0) goto L_0x012f
            java.lang.Object r11 = r10.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x013d
        L_0x012f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            r10.u(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            r10.w(r11, r6)
        L_0x013d:
            nI.p r6 = r17.d()
            U0.F1.c(r10, r3, r6)
            s0.h r3 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            r3 = 104(0x68, float:1.46E-43)
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.t(r10, r3)
            i1.c r6 = r5.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r12)
            int r11 = U0.C4883j.a(r15, r12)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            nI.a r12 = r17.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x0174
            U0.C4883j.c()
        L_0x0174:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x0181
            r15.p(r12)
            goto L_0x0184
        L_0x0181:
            r15.t()
        L_0x0184:
            U0.m r12 = U0.F1.a(r15)
            r16 = r13
            nI.p r13 = r17.c()
            U0.F1.c(r12, r6, r13)
            nI.p r6 = r17.e()
            U0.F1.c(r12, r14, r6)
            nI.p r6 = r17.b()
            boolean r13 = r12.i()
            if (r13 != 0) goto L_0x01b0
            java.lang.Object r13 = r12.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r14)
            if (r13 != 0) goto L_0x01be
        L_0x01b0:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r12.u(r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.w(r11, r6)
        L_0x01be:
            nI.p r6 = r17.d()
            U0.F1.c(r12, r3, r6)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            int r6 = yv.C9006k.f58125a
            r11 = 0
            t1.c r12 = J1.e.c(r6, r15, r11)
            int r6 = yv.C9008m.f58147T
            java.lang.String r13 = J1.j.b(r6, r15, r11)
            java.lang.String r6 = "DelightMessageTestTag-Image"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r10, r6)
            i1.c r5 = r5.b()
            androidx.compose.ui.d r3 = r3.a(r6, r5)
            r5 = -1362638466(0xffffffffaec7c97e, float:-9.0852645E-11)
            r15.W(r5)
            boolean r5 = r15.F(r4)
            boolean r6 = r15.F(r0)
            r5 = r5 | r6
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x01fd
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x0205
        L_0x01fd:
            Cv.a r6 = new Cv.a
            r6.<init>(r4, r0)
            r15.u(r6)
        L_0x0205:
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            androidx.compose.ui.d r14 = androidx.compose.ui.focus.b.a(r3, r6)
            r5 = r1 & 14
            r6 = 14
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r38
            r4 = r15
            Bv.g r0 = Bv.l.g(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.d r14 = Bv.l.d(r14, r0)
            r20 = 0
            r21 = 120(0x78, float:1.68E-43)
            r0 = 0
            r17 = 0
            r18 = 0
            r2 = r11
            r4 = r16
            r3 = 2
            r5 = r15
            r15 = r0
            r16 = r1
            r19 = r5
            n0.C5583F.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5.x()
            r0 = 8
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r10, r0)
            r1 = 6
            s0.C5844O.a(r0, r5, r1)
            int r0 = yv.C9008m.f58148U
            java.lang.String r12 = J1.j.b(r0, r5, r2)
            TC.b$a$a r13 = TC.C13679b.a.C2855a.f116679a
            Y1.j$a r0 = Y1.j.f14783b
            int r0 = r0.a()
            tK.h r1 = SC.C13575d.a(r5, r2)
            long r15 = r1.G0()
            r1 = 48
            float r1 = (float) r1
            float r1 = c2.h.B(r1)
            r2 = 0
            r6 = 0
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.D.k(r10, r1, r2, r3, r6)
            Y1.j r25 = Y1.j.h(r0)
            r36 = 0
            r37 = 261104(0x3fbf0, float:3.65885E-40)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 432(0x1b0, float:6.05E-43)
            r34 = r5
            SC.C13607l.j(r12, r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02a1
            U0.C4895p.R()
        L_0x02a1:
            U0.Y0 r0 = r5.n()
            if (r0 == 0) goto L_0x02af
            Cv.b r1 = new Cv.b
            r1.<init>(r7, r4, r8, r9)
            r0.a(r1)
        L_0x02af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Cv.c.c(nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(Q q10, C6248b bVar, C5635o oVar) {
        C17542s.j(oVar, "it");
        if (oVar.a()) {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(bVar, (C17164e<? super a>) null), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
