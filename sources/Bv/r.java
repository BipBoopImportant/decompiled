package Bv;

import J1.e;
import O0.V;
import QJ.Q;
import SC.C13575d;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.c;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import uK.C18146a;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aG\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aW\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u0002"}, d2 = {"", "initials", "", "loading", "selected", "showHeartOverlay", "Lkotlin/Function0;", "LXH/N;", "onHeartAnimationFinished", "Landroidx/compose/ui/d;", "modifier", "j", "(Ljava/lang/String;ZZZLnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "LBv/a;", "state", "contentDescription", "onHeartOverlayDone", "e", "(LBv/a;Ljava/lang/String;ZZLjava/lang/String;ZLnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "animationCallback", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.compose.common.MembershipAvatarKt$Avatar$1$1", f = "MembershipAvatar.kt", l = {87, 89}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33528c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f33529d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6396a f33530e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<C17631a<C16807N>> f33531f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, C6396a aVar, A1<? extends C17631a<C16807N>> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f33529d = z10;
            this.f33530e = aVar;
            this.f33531f = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f33529d, this.f33530e, this.f33531f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f33528c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f33529d) {
                    C6396a aVar = this.f33530e;
                    this.f33528c = 1;
                    if (aVar.i(this) == f10) {
                        return f10;
                    }
                    r.g(this.f33531f).invoke();
                    return C16807N.f139792a;
                }
                C6396a aVar2 = this.f33530e;
                this.f33528c = 2;
                if (aVar2.h(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                r.g(this.f33531f).invoke();
                return C16807N.f139792a;
            } else if (i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16807N n10 = C16807N.f139792a;
            r.g(this.f33531f).invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33532a;

        b(String str) {
            this.f33532a = str;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-340479741, i10, -1, "com.ingka.ikea.membership.impl.compose.common.Avatar.<anonymous> (MembershipAvatar.kt:99)");
                }
                V.a(e.c(C18146a.f148013D8, mVar, 0), this.f33532a, (d) null, C13575d.a(mVar, 0).G0(), mVar, 0, 4);
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

    /* JADX WARNING: Removed duplicated region for block: B:165:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void e(Bv.C6396a r32, java.lang.String r33, boolean r34, boolean r35, java.lang.String r36, boolean r37, nI.C17631a<XH.C16807N> r38, androidx.compose.ui.d r39, U0.C4889m r40, int r41, int r42) {
        /*
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r0 = r36
            r15 = r37
            r14 = r38
            r13 = r41
            r12 = r42
            r5 = -753646085(0xffffffffd31445fb, float:-6.3682924E11)
            r6 = r40
            U0.m r11 = r6.k(r5)
            r6 = r12 & 1
            if (r6 == 0) goto L_0x0022
            r6 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r6 = r13 & 6
            if (r6 != 0) goto L_0x0031
            boolean r6 = r11.V(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 4
            goto L_0x002f
        L_0x002e:
            r6 = 2
        L_0x002f:
            r6 = r6 | r13
            goto L_0x0032
        L_0x0031:
            r6 = r13
        L_0x0032:
            r7 = r12 & 2
            if (r7 == 0) goto L_0x0039
            r6 = r6 | 48
            goto L_0x0049
        L_0x0039:
            r7 = r13 & 48
            if (r7 != 0) goto L_0x0049
            boolean r7 = r11.V(r2)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r6 = r6 | r7
        L_0x0049:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0050
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x0050:
            r7 = r13 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0060
            boolean r7 = r11.b(r3)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r6 = r6 | r7
        L_0x0060:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x0067
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0077
        L_0x0067:
            r7 = r13 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0077
            boolean r7 = r11.b(r4)
            if (r7 == 0) goto L_0x0074
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r6 = r6 | r7
        L_0x0077:
            r7 = r12 & 16
            if (r7 == 0) goto L_0x007e
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007e:
            r7 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x008e
            boolean r7 = r11.V(r0)
            if (r7 == 0) goto L_0x008b
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008d
        L_0x008b:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r6 = r6 | r7
        L_0x008e:
            r7 = r12 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L_0x0096
            r6 = r6 | r9
            goto L_0x00a6
        L_0x0096:
            r7 = r13 & r9
            if (r7 != 0) goto L_0x00a6
            boolean r7 = r11.b(r15)
            if (r7 == 0) goto L_0x00a3
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a5
        L_0x00a3:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00a5:
            r6 = r6 | r7
        L_0x00a6:
            r7 = r12 & 64
            r9 = 1572864(0x180000, float:2.204052E-39)
            if (r7 == 0) goto L_0x00ae
            r6 = r6 | r9
            goto L_0x00be
        L_0x00ae:
            r7 = r13 & r9
            if (r7 != 0) goto L_0x00be
            boolean r7 = r11.F(r14)
            if (r7 == 0) goto L_0x00bb
            r7 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00bd
        L_0x00bb:
            r7 = 524288(0x80000, float:7.34684E-40)
        L_0x00bd:
            r6 = r6 | r7
        L_0x00be:
            r7 = r12 & 128(0x80, float:1.794E-43)
            r9 = 12582912(0xc00000, float:1.7632415E-38)
            if (r7 == 0) goto L_0x00c8
            r6 = r6 | r9
        L_0x00c5:
            r9 = r39
            goto L_0x00da
        L_0x00c8:
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00c5
            r9 = r39
            boolean r16 = r11.V(r9)
            if (r16 == 0) goto L_0x00d6
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00d8
        L_0x00d6:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00d8:
            r6 = r6 | r16
        L_0x00da:
            r16 = 4793491(0x492493, float:6.717112E-39)
            r10 = r6 & r16
            r8 = 4793490(0x492492, float:6.71711E-39)
            if (r10 != r8) goto L_0x00f2
            boolean r8 = r11.l()
            if (r8 != 0) goto L_0x00eb
            goto L_0x00f2
        L_0x00eb:
            r11.L()
            r8 = r9
            r14 = r11
            goto L_0x0368
        L_0x00f2:
            if (r7 == 0) goto L_0x00f8
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r10 = r7
            goto L_0x00f9
        L_0x00f8:
            r10 = r9
        L_0x00f9:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0105
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.membership.impl.compose.common.Avatar (MembershipAvatar.kt:82)"
            U0.C4895p.S(r5, r6, r7, r8)
        L_0x0105:
            int r5 = r6 >> 18
            r5 = r5 & 14
            U0.A1 r5 = U0.p1.q(r14, r11, r5)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r37)
            r8 = 1944089499(0x73e0739b, float:3.5565773E31)
            r11.W(r8)
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r6
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r8 != r9) goto L_0x0120
            r8 = 1
            goto L_0x0121
        L_0x0120:
            r8 = 0
        L_0x0121:
            r9 = r6 & 14
            r13 = 4
            if (r9 != r13) goto L_0x0129
            r17 = 1
            goto L_0x012b
        L_0x0129:
            r17 = 0
        L_0x012b:
            r8 = r8 | r17
            boolean r17 = r11.V(r5)
            r8 = r8 | r17
            java.lang.Object r13 = r11.D()
            if (r8 != 0) goto L_0x0141
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r13 != r8) goto L_0x014a
        L_0x0141:
            Bv.r$a r13 = new Bv.r$a
            r8 = 0
            r13.<init>(r15, r1, r5, r8)
            r11.u(r13)
        L_0x014a:
            nI.p r13 = (nI.p) r13
            r11.P()
            int r5 = r6 >> 15
            r5 = r5 & 14
            U0.P.g(r7, r13, r11, r5)
            r5 = 1944095483(0x73e08afb, float:3.5580242E31)
            r11.W(r5)
            if (r3 == 0) goto L_0x016b
            SC.A$a r5 = new SC.A$a
            Bv.b r7 = Bv.C6397b.f33456a
            nI.p r7 = r7.a()
            r5.<init>(r7)
            r12 = 1
            goto L_0x018c
        L_0x016b:
            int r5 = r33.length()
            if (r5 != 0) goto L_0x0186
            SC.A$a r5 = new SC.A$a
            Bv.r$b r7 = new Bv.r$b
            r7.<init>(r0)
            r8 = 54
            r13 = -340479741(0xffffffffebb4b103, float:-4.3688512E26)
            r12 = 1
            c1.a r7 = c1.c.e(r13, r12, r7, r11, r8)
            r5.<init>(r7)
            goto L_0x018c
        L_0x0186:
            r12 = 1
            SC.A$b r5 = new SC.A$b
            r5.<init>(r2)
        L_0x018c:
            r11.P()
            if (r4 == 0) goto L_0x0195
            SC.z r7 = SC.C13662z.Primary
        L_0x0193:
            r8 = r7
            goto L_0x0198
        L_0x0195:
            SC.z r7 = SC.C13662z.Secondary
            goto L_0x0193
        L_0x0198:
            A0.f r7 = A0.g.h()
            androidx.compose.ui.d r7 = m1.e.a(r10, r7)
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c r13 = r17.o()
            r12 = 0
            E1.I r13 = androidx.compose.foundation.layout.C5077h.h(r13, r12)
            int r18 = U0.C4883j.a(r11, r12)
            U0.y r12 = r11.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r11, r7)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r0 = r19.a()
            U0.f r20 = r11.m()
            if (r20 != 0) goto L_0x01c6
            U0.C4883j.c()
        L_0x01c6:
            r11.I()
            boolean r20 = r11.i()
            if (r20 == 0) goto L_0x01d3
            r11.p(r0)
            goto L_0x01d6
        L_0x01d3:
            r11.t()
        L_0x01d6:
            U0.m r0 = U0.F1.a(r11)
            nI.p r2 = r19.c()
            U0.F1.c(r0, r13, r2)
            nI.p r2 = r19.e()
            U0.F1.c(r0, r12, r2)
            nI.p r2 = r19.b()
            boolean r12 = r0.i()
            if (r12 != 0) goto L_0x0200
            java.lang.Object r12 = r0.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r18)
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r13)
            if (r12 != 0) goto L_0x020e
        L_0x0200:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r18)
            r0.u(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r18)
            r0.w(r12, r2)
        L_0x020e:
            nI.p r2 = r19.d()
            U0.F1.c(r0, r7, r2)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            i1.c r7 = r17.e()
            androidx.compose.ui.d r7 = r0.a(r2, r7)
            int r6 = r6 >> 9
            r6 = r6 & 112(0x70, float:1.57E-43)
            r13 = r6 | 24576(0x6000, float:3.4438E-41)
            r18 = 480(0x1e0, float:6.73E-43)
            r12 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r6 = r36
            r24 = r9
            r9 = r12
            r25 = r10
            r12 = 4
            r10 = r20
            r39 = r11
            r11 = r21
            r16 = 1
            r12 = r22
            r20 = r16
            r16 = r13
            r13 = r23
            r14 = r39
            r15 = r16
            r16 = r18
            SC.C13654x.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.compose.ui.d r5 = r0.e(r2)
            i1.c r6 = r17.o()
            r7 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r7)
            int r8 = U0.C4883j.a(r14, r7)
            U0.y r9 = r14.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r14, r5)
            nI.a r10 = r19.a()
            U0.f r11 = r14.m()
            if (r11 != 0) goto L_0x0279
            U0.C4883j.c()
        L_0x0279:
            r14.I()
            boolean r11 = r14.i()
            if (r11 == 0) goto L_0x0286
            r14.p(r10)
            goto L_0x0289
        L_0x0286:
            r14.t()
        L_0x0289:
            U0.m r10 = U0.F1.a(r14)
            nI.p r11 = r19.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r19.e()
            U0.F1.c(r10, r9, r6)
            nI.p r6 = r19.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x02b3
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x02c1
        L_0x02b3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.w(r8, r6)
        L_0x02c1:
            nI.p r6 = r19.d()
            U0.F1.c(r10, r5, r6)
            androidx.compose.ui.d r5 = r0.e(r2)
            r6 = 549272546(0x20bd3be2, float:3.2057473E-19)
            r14.W(r6)
            r8 = r24
            r6 = 4
            if (r8 != r6) goto L_0x02da
            r9 = r20
            goto L_0x02db
        L_0x02da:
            r9 = r7
        L_0x02db:
            java.lang.Object r10 = r14.D()
            if (r9 != 0) goto L_0x02e9
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x02f1
        L_0x02e9:
            Bv.o r10 = new Bv.o
            r10.<init>(r1)
            r14.u(r10)
        L_0x02f1:
            nI.l r10 = (nI.C17642l) r10
            r14.P()
            androidx.compose.ui.d r26 = androidx.compose.ui.graphics.b.a(r5, r10)
            tK.h r5 = SC.C13575d.a(r14, r7)
            long r27 = r5.v0()
            r30 = 2
            r31 = 0
            r29 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.d(r26, r27, r29, r30, r31)
            androidx.compose.foundation.layout.C5077h.a(r5, r14, r7)
            int r5 = uK.C18146a.f147965A5
            t1.c r5 = J1.e.c(r5, r14, r7)
            tK.h r9 = SC.C13575d.a(r14, r7)
            long r9 = r9.F0()
            i1.c r11 = r17.e()
            androidx.compose.ui.d r0 = r0.a(r2, r11)
            r2 = 549285881(0x20bd6ff9, float:3.2091943E-19)
            r14.W(r2)
            if (r8 != r6) goto L_0x032f
            r7 = r20
        L_0x032f:
            java.lang.Object r2 = r14.D()
            if (r7 != 0) goto L_0x033d
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r2 != r6) goto L_0x0345
        L_0x033d:
            Bv.p r2 = new Bv.p
            r2.<init>(r1)
            r14.u(r2)
        L_0x0345:
            nI.l r2 = (nI.C17642l) r2
            r14.P()
            androidx.compose.ui.d r8 = androidx.compose.ui.graphics.b.a(r0, r2)
            r12 = 48
            r13 = 0
            r7 = 0
            r6 = r5
            r11 = r14
            O0.V.a(r6, r7, r8, r9, r11, r12, r13)
            r14.x()
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0366
            U0.C4895p.R()
        L_0x0366:
            r8 = r25
        L_0x0368:
            U0.Y0 r11 = r14.n()
            if (r11 == 0) goto L_0x0389
            Bv.q r12 = new Bv.q
            r0 = r12
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r9 = r41
            r10 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0389:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bv.r.e(Bv.a, java.lang.String, boolean, boolean, java.lang.String, boolean, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C6396a aVar, String str, boolean z10, boolean z11, String str2, boolean z12, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(aVar, str, z10, z11, str2, z12, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C17631a<C16807N> g(A1<? extends C17631a<C16807N>> a12) {
        return (C17631a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C6396a aVar, c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.d(aVar.e().m().floatValue());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C6396a aVar, c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.g(aVar.g().m().floatValue());
        cVar.m(aVar.g().m().floatValue());
        cVar.d(aVar.f().m().floatValue());
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(java.lang.String r19, boolean r20, boolean r21, boolean r22, nI.C17631a<XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r11 = r19
            r12 = r23
            r13 = r26
            java.lang.String r0 = "initials"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onHeartAnimationFinished"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 1155654598(0x44e1e3c6, float:1807.1179)
            r1 = r25
            U0.m r14 = r1.k(r0)
            r1 = r27 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r14.V(r11)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r13
            goto L_0x0030
        L_0x002f:
            r1 = r13
        L_0x0030:
            r2 = r27 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
            r15 = r20
            goto L_0x004b
        L_0x0039:
            r2 = r13 & 48
            r15 = r20
            if (r2 != 0) goto L_0x004b
            boolean r2 = r14.b(r15)
            if (r2 == 0) goto L_0x0048
            r2 = 32
            goto L_0x004a
        L_0x0048:
            r2 = 16
        L_0x004a:
            r1 = r1 | r2
        L_0x004b:
            r2 = r27 & 4
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            r10 = r21
            goto L_0x0066
        L_0x0054:
            r2 = r13 & 384(0x180, float:5.38E-43)
            r10 = r21
            if (r2 != 0) goto L_0x0066
            boolean r2 = r14.b(r10)
            if (r2 == 0) goto L_0x0063
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r27 & 8
            if (r2 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r9 = r22
            goto L_0x0081
        L_0x006f:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            r9 = r22
            if (r2 != 0) goto L_0x0081
            boolean r2 = r14.b(r9)
            if (r2 == 0) goto L_0x007e
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r2
        L_0x0081:
            r2 = r27 & 16
            if (r2 == 0) goto L_0x0088
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0088:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0098
            boolean r2 = r14.F(r12)
            if (r2 == 0) goto L_0x0095
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r2
        L_0x0098:
            r2 = r27 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00a2
            r1 = r1 | r3
        L_0x009f:
            r3 = r24
            goto L_0x00b3
        L_0x00a2:
            r3 = r3 & r13
            if (r3 != 0) goto L_0x009f
            r3 = r24
            boolean r4 = r14.V(r3)
            if (r4 == 0) goto L_0x00b0
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r1 = r1 | r4
        L_0x00b3:
            r4 = 74899(0x12493, float:1.04956E-40)
            r4 = r4 & r1
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r5) goto L_0x00c9
            boolean r4 = r14.l()
            if (r4 != 0) goto L_0x00c3
            goto L_0x00c9
        L_0x00c3:
            r14.L()
            r6 = r3
            goto L_0x0140
        L_0x00c9:
            if (r2 == 0) goto L_0x00d0
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r16 = r2
            goto L_0x00d2
        L_0x00d0:
            r16 = r3
        L_0x00d2:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00de
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.membership.impl.compose.common.MembershipAvatar (MembershipAvatar.kt:58)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00de:
            r0 = 163026605(0x9b796ad, float:4.4197342E-33)
            r14.W(r0)
            java.lang.Object r0 = r14.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x00f8
            Bv.a r0 = new Bv.a
            r0.<init>()
            r14.u(r0)
        L_0x00f8:
            Bv.a r0 = (Bv.C6396a) r0
            r14.P()
            int r2 = Oo.b.f84392H4
            r3 = 0
            java.lang.String r4 = J1.j.b(r2, r14, r3)
            int r2 = r1 << 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | 6
            r5 = r2 & 896(0x380, float:1.256E-42)
            r3 = r3 | r5
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r1 = r1 << 6
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r1
            r2 = r2 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r3
            r17 = r2 | r1
            r18 = 0
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r22
            r6 = r23
            r7 = r16
            r8 = r14
            r9 = r17
            r10 = r18
            e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x013e
            U0.C4895p.R()
        L_0x013e:
            r6 = r16
        L_0x0140:
            U0.Y0 r9 = r14.n()
            if (r9 == 0) goto L_0x015d
            Bv.n r10 = new Bv.n
            r0 = r10
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r7 = r26
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Bv.r.j(java.lang.String, boolean, boolean, boolean, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(String str, boolean z10, boolean z11, boolean z12, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        j(str, z10, z11, z12, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
