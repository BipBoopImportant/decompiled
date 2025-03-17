package So;

import QJ.Q;
import Ro.d;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import uI.C18059h;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a}\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LRo/d;", "viewModel", "Lkotlin/Function1;", "", "LXH/N;", "onPrivacyPolicyClicked", "Lkotlin/Function0;", "onSubmitSuccess", "r", "(LRo/d;LnI/l;LnI/a;LU0/m;I)V", "LRo/d$e;", "state", "LT0/d;", "widthSizeClass", "LRo/d$d;", "onToggleConsentEntry", "onAllowAllClicked", "onConfirmMyChoicesClicked", "j", "(LRo/d$e;ILnI/l;LnI/a;LnI/a;LnI/l;LnI/a;LU0/m;II)V", "consent-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.consent.impl.presentation.compose.ConsentScreenKt$ConsentContent$6$1", f = "ConsentScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87298c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d.e f87299d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f87300e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d.e eVar, C17631a<C16807N> aVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f87299d = eVar;
            this.f87300e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f87299d, this.f87300e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f87298c == 0) {
                y.b(obj);
                if (C17542s.e(this.f87299d.e(), d.c.e.f86914a)) {
                    this.f87300e.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        b(Object obj) {
            super(0, obj, d.class, "submitAllowAll", "submitAllowAll()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((d) this.receiver).F();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
        c(Object obj) {
            super(0, obj, d.class, "submitSelection", "submitSelection()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((d) this.receiver).G();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(Ro.d.e r30, int r31, nI.C17642l<? super Ro.d.C1799d, XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, nI.C17642l<? super java.lang.String, XH.C16807N> r35, nI.C17631a<XH.C16807N> r36, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r30
            r12 = r31
            r13 = r38
            r0 = 16
            r2 = 32
            r3 = 2
            r4 = 4
            r5 = 6
            java.lang.String r6 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            r6 = -368396310(0xffffffffea0ab7ea, float:-4.192507E25)
            r7 = r37
            U0.m r11 = r7.k(r6)
            r7 = 1
            r8 = r39 & 1
            if (r8 == 0) goto L_0x0023
            r8 = r13 | 6
            goto L_0x0033
        L_0x0023:
            r8 = r13 & 6
            if (r8 != 0) goto L_0x0032
            boolean r8 = r11.F(r1)
            if (r8 == 0) goto L_0x002f
            r8 = r4
            goto L_0x0030
        L_0x002f:
            r8 = r3
        L_0x0030:
            r8 = r8 | r13
            goto L_0x0033
        L_0x0032:
            r8 = r13
        L_0x0033:
            r3 = r39 & 2
            if (r3 == 0) goto L_0x003a
            r8 = r8 | 48
            goto L_0x0048
        L_0x003a:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0048
            boolean r3 = r11.d(r12)
            if (r3 == 0) goto L_0x0046
            r3 = r2
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            r8 = r8 | r3
        L_0x0048:
            r3 = r39 & 4
            if (r3 == 0) goto L_0x0051
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r4 = r32
            goto L_0x0063
        L_0x0051:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004e
            r4 = r32
            boolean r9 = r11.F(r4)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r8 = r8 | r9
        L_0x0063:
            r9 = r39 & 8
            if (r9 == 0) goto L_0x006c
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r10 = r33
            goto L_0x007e
        L_0x006c:
            r10 = r13 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0069
            r10 = r33
            boolean r14 = r11.F(r10)
            if (r14 == 0) goto L_0x007b
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r8 = r8 | r14
        L_0x007e:
            r0 = r39 & 16
            if (r0 == 0) goto L_0x0087
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r14 = r34
            goto L_0x0099
        L_0x0087:
            r14 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0084
            r14 = r34
            boolean r15 = r11.F(r14)
            if (r15 == 0) goto L_0x0096
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r8 = r8 | r15
        L_0x0099:
            r2 = r39 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00a4
            r8 = r8 | r16
            r15 = r35
            goto L_0x00b7
        L_0x00a4:
            r16 = r13 & r16
            r15 = r35
            if (r16 != 0) goto L_0x00b7
            boolean r16 = r11.F(r15)
            if (r16 == 0) goto L_0x00b3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r8 = r8 | r16
        L_0x00b7:
            r16 = r39 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c2
            r8 = r8 | r17
            r7 = r36
            goto L_0x00d5
        L_0x00c2:
            r17 = r13 & r17
            r7 = r36
            if (r17 != 0) goto L_0x00d5
            boolean r18 = r11.F(r7)
            if (r18 == 0) goto L_0x00d1
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r8 = r8 | r18
        L_0x00d5:
            r18 = 599187(0x92493, float:8.3964E-40)
            r5 = r8 & r18
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r5 != r6) goto L_0x00f0
            boolean r5 = r11.l()
            if (r5 != 0) goto L_0x00e6
            goto L_0x00f0
        L_0x00e6:
            r11.L()
            r3 = r4
            r4 = r10
            r5 = r14
            r6 = r15
            r15 = r11
            goto L_0x0351
        L_0x00f0:
            if (r3 == 0) goto L_0x0114
            r3 = 2087300388(0x7c69ad24, float:4.8532675E36)
            r11.W(r3)
            java.lang.Object r3 = r11.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x010c
            So.n r3 = new So.n
            r3.<init>()
            r11.u(r3)
        L_0x010c:
            nI.l r3 = (nI.C17642l) r3
            r11.P()
            r21 = r3
            goto L_0x0116
        L_0x0114:
            r21 = r4
        L_0x0116:
            if (r9 == 0) goto L_0x013a
            r3 = 2087301668(0x7c69b224, float:4.853673E36)
            r11.W(r3)
            java.lang.Object r3 = r11.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x0132
            So.o r3 = new So.o
            r3.<init>()
            r11.u(r3)
        L_0x0132:
            nI.a r3 = (nI.C17631a) r3
            r11.P()
            r22 = r3
            goto L_0x013c
        L_0x013a:
            r22 = r10
        L_0x013c:
            if (r0 == 0) goto L_0x015e
            r0 = 2087303204(0x7c69b824, float:4.85416E36)
            r11.W(r0)
            java.lang.Object r0 = r11.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r0 != r3) goto L_0x0158
            So.p r0 = new So.p
            r0.<init>()
            r11.u(r0)
        L_0x0158:
            nI.a r0 = (nI.C17631a) r0
            r11.P()
            goto L_0x015f
        L_0x015e:
            r0 = r14
        L_0x015f:
            if (r2 == 0) goto L_0x0182
            r2 = 2087305028(0x7c69bf44, float:4.854738E36)
            r11.W(r2)
            java.lang.Object r2 = r11.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x017b
            So.q r2 = new So.q
            r2.<init>()
            r11.u(r2)
        L_0x017b:
            nI.l r2 = (nI.C17642l) r2
            r11.P()
            r10 = r2
            goto L_0x0183
        L_0x0182:
            r10 = r15
        L_0x0183:
            if (r16 == 0) goto L_0x01a6
            r2 = 2087306244(0x7c69c404, float:4.8551233E36)
            r11.W(r2)
            java.lang.Object r2 = r11.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x019f
            So.r r2 = new So.r
            r2.<init>()
            r11.u(r2)
        L_0x019f:
            nI.a r2 = (nI.C17631a) r2
            r11.P()
            r9 = r2
            goto L_0x01a7
        L_0x01a6:
            r9 = r7
        L_0x01a7:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01b6
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.consent.impl.presentation.compose.ConsentContent (ConsentScreen.kt:67)"
            r4 = -368396310(0xffffffffea0ab7ea, float:-4.192507E25)
            U0.C4895p.S(r4, r8, r2, r3)
        L_0x01b6:
            r2 = 0
            r3 = 6
            androidx.compose.foundation.o r24 = androidx.compose.foundation.m.c(r2, r11, r3, r2)
            Ro.d$c r3 = r30.e()
            r4 = 2087309557(0x7c69d0f5, float:4.8561733E36)
            r11.W(r4)
            boolean r4 = r11.F(r1)
            r5 = 3670016(0x380000, float:5.142788E-39)
            r6 = r8 & r5
            r7 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r7) goto L_0x01d4
            r6 = 1
            goto L_0x01d5
        L_0x01d4:
            r6 = r2
        L_0x01d5:
            r4 = r4 | r6
            java.lang.Object r6 = r11.D()
            r7 = 0
            if (r4 != 0) goto L_0x01e5
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x01ed
        L_0x01e5:
            So.u$a r6 = new So.u$a
            r6.<init>(r1, r9, r7)
            r11.u(r6)
        L_0x01ed:
            nI.p r6 = (nI.p) r6
            r11.P()
            U0.P.g(r3, r6, r11, r2)
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r4 = TC.e.i(r3)
            androidx.compose.ui.d r23 = s0.C5852X.d(r4)
            r28 = 14
            r29 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.m.f(r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r6 = "SCROLLABLE_CONTENT"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r4, r6)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r14 = i1.C5437c.f24302a
            i1.c$b r14 = r14.k()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r14, r11, r2)
            int r14 = U0.C4883j.a(r11, r2)
            U0.y r15 = r11.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r11, r4)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r5 = r16.a()
            U0.f r17 = r11.m()
            if (r17 != 0) goto L_0x023e
            U0.C4883j.c()
        L_0x023e:
            r11.I()
            boolean r17 = r11.i()
            if (r17 == 0) goto L_0x024b
            r11.p(r5)
            goto L_0x024e
        L_0x024b:
            r11.t()
        L_0x024e:
            U0.m r5 = U0.F1.a(r11)
            nI.p r7 = r16.c()
            U0.F1.c(r5, r6, r7)
            nI.p r6 = r16.e()
            U0.F1.c(r5, r15, r6)
            nI.p r6 = r16.b()
            boolean r7 = r5.i()
            if (r7 != 0) goto L_0x0278
            java.lang.Object r7 = r5.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r15)
            if (r7 != 0) goto L_0x0286
        L_0x0278:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r5.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r5.w(r7, r6)
        L_0x0286:
            nI.p r6 = r16.d()
            U0.F1.c(r5, r4, r6)
            s0.h r4 = s0.C5862h.f28810a
            int r4 = r8 >> 3
            r4 = r4 & 14
            So.h.d(r12, r11, r4)
            tK.u r5 = tK.C18029u.f147649a
            float r6 = r5.e()
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r3, r6)
            s0.C5844O.a(r6, r11, r2)
            java.util.List r6 = r30.c()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            KJ.c r14 = KJ.C15985a.h(r6)
            boolean r15 = r30.g()
            boolean r16 = r30.f()
            int r6 = r8 << 3
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r20 = 0
            r7 = 131072(0x20000, float:1.83671E-40)
            r17 = r21
            r18 = r11
            r19 = r6
            So.B.k(r14, r15, r16, r17, r18, r19, r20)
            float r6 = r5.a()
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r3, r6)
            s0.C5844O.a(r6, r11, r2)
            r6 = 1842903564(0x6dd87a0c, float:8.3745385E27)
            r11.W(r6)
            r6 = 458752(0x70000, float:6.42848E-40)
            r14 = r8 & r6
            if (r14 != r7) goto L_0x02df
            r7 = 1
            goto L_0x02e0
        L_0x02df:
            r7 = r2
        L_0x02e0:
            boolean r14 = r11.F(r1)
            r7 = r7 | r14
            java.lang.Object r14 = r11.D()
            if (r7 != 0) goto L_0x02f3
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r14 != r7) goto L_0x02fb
        L_0x02f3:
            So.s r14 = new So.s
            r14.<init>(r10, r1)
            r11.u(r14)
        L_0x02fb:
            nI.a r14 = (nI.C17631a) r14
            r11.P()
            r7 = 1
            r15 = 0
            So.k.c(r15, r14, r11, r2, r7)
            float r5 = r5.a()
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r3, r5)
            s0.C5844O.a(r3, r11, r2)
            boolean r5 = r30.h()
            boolean r7 = r30.i()
            boolean r14 = r30.f()
            r2 = 6
            int r2 = r8 << 6
            r3 = r2 & r6
            r3 = r3 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r4
            r15 = r3 | r2
            r16 = 2
            r3 = 0
            r2 = r31
            r4 = r5
            r5 = r7
            r6 = r14
            r7 = r22
            r8 = r0
            r14 = r9
            r9 = r11
            r17 = r10
            r10 = r15
            r15 = r11
            r11 = r16
            So.d.d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0349
            U0.C4895p.R()
        L_0x0349:
            r5 = r0
            r7 = r14
            r6 = r17
            r3 = r21
            r4 = r22
        L_0x0351:
            U0.Y0 r10 = r15.n()
            if (r10 == 0) goto L_0x0368
            So.t r11 = new So.t
            r0 = r11
            r1 = r30
            r2 = r31
            r8 = r38
            r9 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: So.u.j(Ro.d$e, int, nI.l, nI.a, nI.a, nI.l, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(String str) {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17642l lVar, d.e eVar) {
        lVar.invoke(eVar.d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(d.e eVar, int i10, C17642l lVar, C17631a aVar, C17631a aVar2, C17642l lVar2, C17631a aVar3, int i11, int i12, C4889m mVar, int i13) {
        j(eVar, i10, lVar, aVar, aVar2, lVar2, aVar3, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(d.C1799d dVar) {
        C17542s.j(dVar, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q() {
        return C16807N.f139792a;
    }

    public static final void r(d dVar, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(dVar, "viewModel");
        C17542s.j(lVar, "onPrivacyPolicyClicked");
        C17542s.j(aVar, "onSubmitSuccess");
        C4889m k10 = mVar.k(-137934956);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-137934956, i12, -1, "com.ingka.ikea.consent.impl.presentation.compose.ConsentScreen (ConsentScreen.kt:39)");
            }
            A1<d.e> c10 = j3.a.c(dVar.getState(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            Activity a10 = Xo.c.a((Context) k10.Q(AndroidCompositionLocals_androidKt.g()));
            if (a10 != null) {
                T0.c a11 = T0.a.a(a10, k10, 0);
                d.e value = c10.getValue();
                int b10 = a11.b();
                k10.W(361659804);
                boolean F10 = k10.F(dVar);
                Object D10 = k10.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new l(dVar);
                    k10.u(D10);
                }
                C17642l lVar2 = (C17642l) D10;
                k10.P();
                k10.W(361662556);
                boolean F11 = k10.F(dVar);
                Object D11 = k10.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new b(dVar);
                    k10.u(D11);
                }
                k10.P();
                C17631a aVar2 = (C17631a) ((C18059h) D11);
                k10.W(361664573);
                boolean F12 = k10.F(dVar);
                Object D12 = k10.D();
                if (F12 || D12 == C4889m.f14007a.a()) {
                    D12 = new c(dVar);
                    k10.u(D12);
                }
                k10.P();
                j(value, b10, lVar2, aVar2, (C17631a) ((C18059h) D12), lVar, aVar, k10, (i12 << 12) & 4128768, 0);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new m(dVar, lVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(d dVar, d.C1799d dVar2) {
        C17542s.j(dVar2, "consentEntry");
        dVar.H(dVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(d dVar, C17642l lVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        r(dVar, lVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
