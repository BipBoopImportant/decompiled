package ts;

import QJ.C16297b0;
import QJ.Q;
import R0.e;
import SC.C13575d;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nI.q;
import s0.C5857c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\u00008\n@\nX\u0002"}, d2 = {"", "enabled", "isRefreshing", "Lkotlin/Function0;", "LXH/N;", "onRefresh", "Landroidx/compose/ui/d;", "modifier", "content", "c", "(ZZLnI/a;Landroidx/compose/ui/d;LnI/p;LU0/m;II)V", "refreshState", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.inbox.impl.compose.components.PullToRefreshContainerKt$PullToRefreshContainer$1$1", f = "PullToRefreshContainer.kt", l = {40}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103391c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f103392d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f103393e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, C4899r0<Boolean> r0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f103392d = z10;
            this.f103393e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f103392d, this.f103393e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f103391c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f103392d) {
                    h.e(this.f103393e, true);
                    return C16807N.f139792a;
                }
                this.f103391c = 1;
                if (C16297b0.b(300, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h.e(this.f103393e, false);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f103394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f103395b;

        b(e eVar, C4899r0<Boolean> r0Var) {
            this.f103394a = eVar;
            this.f103395b = r0Var;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            int i11;
            C5857c cVar2 = cVar;
            C4889m mVar2 = mVar;
            C17542s.j(cVar2, "$this$PullToRefreshBox");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1447643426, i11, -1, "com.ingka.ikea.inbox.impl.compose.components.PullToRefreshContainer.<anonymous> (PullToRefreshContainer.kt:55)");
                }
                R0.b bVar = R0.b.f12188a;
                boolean h10 = h.d(this.f103395b);
                d a10 = cVar2.a(C5116k1.a(d.f18749a, "PullToRefresh-TestTag-Indicator"), C5437c.f24302a.m());
                long G02 = C13575d.a(mVar2, 0).G0();
                bVar.a(this.f103394a, h10, a10, C13575d.a(mVar2, 0).k(), G02, 0.0f, mVar, R0.b.f12192e << 18, 32);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f103396a;

        c(p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f103396a = pVar;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$PullToRefreshBox");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1211025601, i10, -1, "com.ingka.ikea.inbox.impl.compose.components.PullToRefreshContainer.<anonymous> (PullToRefreshContainer.kt:66)");
                }
                this.f103396a.invoke(mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r18, boolean r19, nI.C17631a<XH.C16807N> r20, androidx.compose.ui.d r21, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r24
            java.lang.String r0 = "onRefresh"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            r0 = -277876773(0xffffffffef6fefdb, float:-7.4256885E28)
            r4 = r23
            U0.m r4 = r4.k(r0)
            r7 = r25 & 1
            r8 = 2
            r9 = 4
            if (r7 == 0) goto L_0x0026
            r7 = r6 | 6
            goto L_0x0036
        L_0x0026:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0035
            boolean r7 = r4.b(r1)
            if (r7 == 0) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = r8
        L_0x0033:
            r7 = r7 | r6
            goto L_0x0036
        L_0x0035:
            r7 = r6
        L_0x0036:
            r10 = r25 & 2
            r11 = 32
            if (r10 == 0) goto L_0x003f
            r7 = r7 | 48
            goto L_0x004e
        L_0x003f:
            r10 = r6 & 48
            if (r10 != 0) goto L_0x004e
            boolean r10 = r4.b(r2)
            if (r10 == 0) goto L_0x004b
            r10 = r11
            goto L_0x004d
        L_0x004b:
            r10 = 16
        L_0x004d:
            r7 = r7 | r10
        L_0x004e:
            r10 = r25 & 4
            if (r10 == 0) goto L_0x0055
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0065
            boolean r10 = r4.F(r3)
            if (r10 == 0) goto L_0x0062
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r7 = r7 | r10
        L_0x0065:
            r10 = r25 & 8
            if (r10 == 0) goto L_0x006e
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x006b:
            r13 = r21
            goto L_0x0080
        L_0x006e:
            r13 = r6 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x006b
            r13 = r21
            boolean r14 = r4.V(r13)
            if (r14 == 0) goto L_0x007d
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r7 = r7 | r14
        L_0x0080:
            r14 = r25 & 16
            if (r14 == 0) goto L_0x0087
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0097
        L_0x0087:
            r14 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0097
            boolean r14 = r4.F(r5)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r7 = r7 | r14
        L_0x0097:
            r14 = r7 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r15) goto L_0x00a9
            boolean r14 = r4.l()
            if (r14 != 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            r4.L()
            goto L_0x0184
        L_0x00a9:
            if (r10 == 0) goto L_0x00b0
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            r17 = r10
            goto L_0x00b2
        L_0x00b0:
            r17 = r13
        L_0x00b2:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00be
            r10 = -1
            java.lang.String r13 = "com.ingka.ikea.inbox.impl.compose.components.PullToRefreshContainer (PullToRefreshContainer.kt:31)"
            U0.C4895p.S(r0, r7, r10, r13)
        L_0x00be:
            r0 = -1751612878(0xffffffff97988232, float:-9.855636E-25)
            r4.W(r0)
            java.lang.Object r0 = r4.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r13 = r10.a()
            r14 = 0
            if (r0 != r13) goto L_0x00dc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            U0.r0 r0 = U0.u1.e(r0, r14, r8, r14)
            r4.u(r0)
        L_0x00dc:
            U0.r0 r0 = (U0.C4899r0) r0
            r4.P()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r19)
            r13 = -1751610259(0xffffffff97988c6d, float:-9.858218E-25)
            r4.W(r13)
            r13 = r7 & 112(0x70, float:1.57E-43)
            r15 = 0
            r12 = 1
            if (r13 != r11) goto L_0x00f3
            r11 = r12
            goto L_0x00f4
        L_0x00f3:
            r11 = r15
        L_0x00f4:
            java.lang.Object r13 = r4.D()
            if (r11 != 0) goto L_0x0100
            java.lang.Object r11 = r10.a()
            if (r13 != r11) goto L_0x0108
        L_0x0100:
            ts.h$a r13 = new ts.h$a
            r13.<init>(r2, r0, r14)
            r4.u(r13)
        L_0x0108:
            nI.p r13 = (nI.p) r13
            r4.P()
            int r11 = r7 >> 3
            r14 = r11 & 14
            U0.P.g(r8, r13, r4, r14)
            R0.e r13 = R0.c.r(r4, r15)
            boolean r8 = d(r0)
            r14 = -1751596711(0xffffffff9798c159, float:-9.871578E-25)
            r4.W(r14)
            r14 = r7 & 14
            if (r14 != r9) goto L_0x0128
            r9 = r12
            goto L_0x0129
        L_0x0128:
            r9 = r15
        L_0x0129:
            r7 = r7 & 896(0x380, float:1.256E-42)
            r14 = 256(0x100, float:3.59E-43)
            if (r7 != r14) goto L_0x0130
            r15 = r12
        L_0x0130:
            r7 = r9 | r15
            java.lang.Object r9 = r4.D()
            if (r7 != 0) goto L_0x013e
            java.lang.Object r7 = r10.a()
            if (r9 != r7) goto L_0x0146
        L_0x013e:
            ts.f r9 = new ts.f
            r9.<init>(r1, r3)
            r4.u(r9)
        L_0x0146:
            nI.a r9 = (nI.C17631a) r9
            r4.P()
            ts.h$b r7 = new ts.h$b
            r7.<init>(r13, r0)
            r0 = 1447643426(0x56494922, float:5.5328985E13)
            r10 = 54
            c1.a r0 = c1.c.e(r0, r12, r7, r4, r10)
            ts.h$c r7 = new ts.h$c
            r7.<init>(r5)
            r14 = 1211025601(0x482ec8c1, float:178979.02)
            c1.a r14 = c1.c.e(r14, r12, r7, r4, r10)
            r7 = 1769472(0x1b0000, float:2.479558E-39)
            r10 = r11 & 896(0x380, float:1.256E-42)
            r15 = r10 | r7
            r16 = 16
            r11 = 0
            r7 = r8
            r8 = r9
            r9 = r17
            r10 = r13
            r12 = r0
            r13 = r14
            r14 = r4
            R0.c.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0182
            U0.C4895p.R()
        L_0x0182:
            r13 = r17
        L_0x0184:
            U0.Y0 r8 = r4.n()
            if (r8 == 0) goto L_0x01a0
            ts.g r9 = new ts.g
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r13
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.h.c(boolean, boolean, nI.a, androidx.compose.ui.d, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean d(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void e(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N f(boolean z10, C17631a aVar) {
        if (z10) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(boolean z10, boolean z11, C17631a aVar, d dVar, p pVar, int i10, int i11, C4889m mVar, int i12) {
        c(z10, z11, aVar, dVar, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
