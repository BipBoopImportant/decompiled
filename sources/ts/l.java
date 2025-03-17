package ts;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.q;
import s0.C5842M;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "title", "", "showDivider", "Lkotlin/Function0;", "LXH/N;", "onBack", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Ls0/M;", "actionIcons", "b", "(Ljava/lang/String;ZLnI/a;Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q<C5842M, C4889m, Integer, C16807N> f103408a;

        a(q<? super C5842M, ? super C4889m, ? super Integer, C16807N> qVar) {
            this.f103408a = qVar;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C17542s.j(m10, "$this$IkeaTopAppBar");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(m10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1449093666, i10, -1, "com.ingka.ikea.inbox.impl.compose.components.TopBar.<anonymous>.<anonymous> (TopBar.kt:36)");
                }
                this.f103408a.invoke(m10, mVar, Integer.valueOf(i10 & 14));
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r23, boolean r24, nI.C17631a<XH.C16807N> r25, androidx.compose.ui.d r26, nI.q<? super s0.C5842M, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r29
            r0 = 16
            r1 = 2
            r2 = 4
            java.lang.String r3 = "title"
            kotlin.jvm.internal.C17542s.j(r12, r3)
            java.lang.String r3 = "onBack"
            kotlin.jvm.internal.C17542s.j(r14, r3)
            r3 = -2106152037(0xffffffff8276ab9b, float:-1.8122474E-37)
            r4 = r28
            U0.m r11 = r4.k(r3)
            r10 = 1
            r4 = r30 & 1
            if (r4 == 0) goto L_0x0027
            r4 = r15 | 6
            goto L_0x0037
        L_0x0027:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x0036
            boolean r4 = r11.V(r12)
            if (r4 == 0) goto L_0x0033
            r4 = r2
            goto L_0x0034
        L_0x0033:
            r4 = r1
        L_0x0034:
            r4 = r4 | r15
            goto L_0x0037
        L_0x0036:
            r4 = r15
        L_0x0037:
            r1 = r30 & 2
            if (r1 == 0) goto L_0x003e
            r4 = r4 | 48
            goto L_0x004d
        L_0x003e:
            r1 = r15 & 48
            if (r1 != 0) goto L_0x004d
            boolean r1 = r11.b(r13)
            if (r1 == 0) goto L_0x004b
            r1 = 32
            goto L_0x004c
        L_0x004b:
            r1 = r0
        L_0x004c:
            r4 = r4 | r1
        L_0x004d:
            r1 = r30 & 4
            if (r1 == 0) goto L_0x0054
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0064
            boolean r1 = r11.F(r14)
            if (r1 == 0) goto L_0x0061
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r4 = r4 | r1
        L_0x0064:
            r1 = r30 & 8
            if (r1 == 0) goto L_0x006d
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r2 = r26
            goto L_0x007f
        L_0x006d:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006a
            r2 = r26
            boolean r5 = r11.V(r2)
            if (r5 == 0) goto L_0x007c
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r4 = r4 | r5
        L_0x007f:
            r0 = r30 & 16
            if (r0 == 0) goto L_0x0089
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r5 = r27
        L_0x0087:
            r9 = r4
            goto L_0x009c
        L_0x0089:
            r5 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0085
            r5 = r27
            boolean r6 = r11.F(r5)
            if (r6 == 0) goto L_0x0098
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r4 = r4 | r6
            goto L_0x0087
        L_0x009c:
            r4 = r9 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r6) goto L_0x00b0
            boolean r4 = r11.l()
            if (r4 != 0) goto L_0x00a9
            goto L_0x00b0
        L_0x00a9:
            r11.L()
            r4 = r2
            r12 = r11
            goto L_0x01f5
        L_0x00b0:
            if (r1 == 0) goto L_0x00b5
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r2 = r1
        L_0x00b5:
            if (r0 == 0) goto L_0x00bf
            ts.a r0 = ts.C11987a.f103360a
            nI.q r0 = r0.a()
            r1 = r0
            goto L_0x00c0
        L_0x00bf:
            r1 = r5
        L_0x00c0:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00cc
            r0 = -1
            java.lang.String r4 = "com.ingka.ikea.inbox.impl.compose.components.TopBar (TopBar.kt:27)"
            U0.C4895p.S(r3, r9, r0, r4)
        L_0x00cc:
            r0 = 0
            r3 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r2, r0, r10, r3)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            r5 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r11, r5)
            int r4 = U0.C4883j.a(r11, r5)
            U0.y r5 = r11.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r11, r0)
            G1.g$a r6 = G1.C4504g.f6515W
            nI.a r7 = r6.a()
            U0.f r8 = r11.m()
            if (r8 != 0) goto L_0x00fe
            U0.C4883j.c()
        L_0x00fe:
            r11.I()
            boolean r8 = r11.i()
            if (r8 == 0) goto L_0x010b
            r11.p(r7)
            goto L_0x010e
        L_0x010b:
            r11.t()
        L_0x010e:
            U0.m r7 = U0.F1.a(r11)
            nI.p r8 = r6.c()
            U0.F1.c(r7, r3, r8)
            nI.p r3 = r6.e()
            U0.F1.c(r7, r5, r3)
            nI.p r3 = r6.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x0138
            java.lang.Object r5 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x0146
        L_0x0138:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.w(r4, r3)
        L_0x0146:
            nI.p r3 = r6.d()
            U0.F1.c(r7, r0, r3)
            s0.h r0 = s0.C5862h.f28810a
            r0 = 0
            r3 = 7
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = r11
            r16 = r9
            r9 = r0
            r0 = r10
            r10 = r3
            kC.C14673d.b(r4, r5, r7, r8, r9, r10)
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            java.lang.String r9 = "TestTag-TopBar-Toolbar"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r10, r9)
            ol.v r4 = ol.v.BACK
            ts.l$a r5 = new ts.l$a
            r5.<init>(r1)
            r6 = 54
            r7 = 1449093666(0x565f6a22, float:6.1411732E13)
            c1.a r5 = c1.c.e(r7, r0, r5, r11, r6)
            int r0 = r16 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r6 = 196998(0x30186, float:2.76053E-40)
            r0 = r0 | r6
            int r6 = r16 << 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r16 = r0 | r6
            r17 = 464(0x1d0, float:6.5E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r18 = 0
            r0 = r4
            r19 = r1
            r1 = r25
            r20 = r2
            r2 = r3
            r3 = r23
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r18
            r21 = r9
            r9 = r11
            r22 = r10
            r10 = r16
            r12 = r11
            r11 = r17
            ol.p.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r21
            r0 = r22
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            if (r13 == 0) goto L_0x01c8
            r0 = -1192110496(0xffffffffb8f1d660, float:-1.1531706E-4)
            r12.W(r0)
            tK.v r0 = tK.C18030v.f147664a
            int r1 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r12, r1)
            long r0 = r0.j()
            r12.P()
        L_0x01c6:
            r6 = r0
            goto L_0x01de
        L_0x01c8:
            r0 = -1192039227(0xffffffffb8f2ecc5, float:-1.1583561E-4)
            r12.W(r0)
            tK.v r0 = tK.C18030v.f147664a
            int r1 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r12, r1)
            long r0 = r0.L0()
            r12.P()
            goto L_0x01c6
        L_0x01de:
            r9 = 6
            r10 = 2
            r5 = 0
            r8 = r12
            SC.C13643u0.c(r4, r5, r6, r8, r9, r10)
            r12.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f1
            U0.C4895p.R()
        L_0x01f1:
            r5 = r19
            r4 = r20
        L_0x01f5:
            U0.Y0 r8 = r12.n()
            if (r8 == 0) goto L_0x020e
            ts.k r9 = new ts.k
            r0 = r9
            r1 = r23
            r2 = r24
            r3 = r25
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ts.l.b(java.lang.String, boolean, nI.a, androidx.compose.ui.d, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, boolean z10, C17631a aVar, d dVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        b(str, z10, aVar, dVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
