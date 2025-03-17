package Qt;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import J1.e;
import N1.P;
import O0.F0;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5749w0;
import r0.m;
import s0.C5844O;
import s0.C5862h;
import t1.C5942c;
import tK.C18029u;
import tK.C18030v;
import uK.C18148c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "errorText", "LO0/F0;", "errorBottomSheetState", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "c", "(Ljava/lang/String;LO0/F0;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "dismissBottomSheet", "e", "(Ljava/lang/String;LnI/a;LU0/m;I)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Qt.f  reason: case insensitive filesystem */
public final class C10909f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qt.f$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f86266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f86267b;

        a(String str, C17631a<C16807N> aVar) {
            this.f86266a = str;
            this.f86267b = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-662481737, i10, -1, "com.ingka.ikea.instore.impl.storeevents.composables.ErrorBottomSheet.<anonymous> (ErrorBottomSheet.kt:56)");
                }
                C10909f.e(this.f86266a, this.f86267b, mVar, 0);
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

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r22, O0.F0 r23, androidx.compose.ui.d r24, nI.C17631a<XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r22
            r0 = r23
            r15 = r25
            r14 = r27
            java.lang.String r2 = "errorText"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "errorBottomSheetState"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "onDismiss"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            r2 = -1154211015(0xffffffffbb342339, float:-0.0027486815)
            r3 = r26
            U0.m r13 = r3.k(r2)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r14 | 6
            goto L_0x0037
        L_0x0027:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x0036
            boolean r3 = r13.V(r1)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = 2
        L_0x0034:
            r3 = r3 | r14
            goto L_0x0037
        L_0x0036:
            r3 = r14
        L_0x0037:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x003e
            r3 = r3 | 48
            goto L_0x004e
        L_0x003e:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x004e
            boolean r4 = r13.V(r0)
            if (r4 == 0) goto L_0x004b
            r4 = 32
            goto L_0x004d
        L_0x004b:
            r4 = 16
        L_0x004d:
            r3 = r3 | r4
        L_0x004e:
            r4 = r28 & 4
            if (r4 == 0) goto L_0x0057
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0054:
            r5 = r24
            goto L_0x0069
        L_0x0057:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0054
            r5 = r24
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x0066
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r3 = r3 | r6
        L_0x0069:
            r6 = r28 & 8
            if (r6 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0080
            boolean r6 = r13.F(r15)
            if (r6 == 0) goto L_0x007d
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r3 = r3 | r6
        L_0x0080:
            r6 = r3 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r6 != r7) goto L_0x0095
            boolean r6 = r13.l()
            if (r6 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            r13.L()
            r3 = r5
            r21 = r13
            goto L_0x0107
        L_0x0095:
            if (r4 == 0) goto L_0x009c
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r18 = r4
            goto L_0x009e
        L_0x009c:
            r18 = r5
        L_0x009e:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00aa
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.instore.impl.storeevents.composables.ErrorBottomSheet (ErrorBottomSheet.kt:48)"
            U0.C4895p.S(r2, r3, r4, r5)
        L_0x00aa:
            O0.G0 r2 = r23.e()
            O0.G0 r4 = O0.G0.Hidden
            r5 = 1
            if (r2 == r4) goto L_0x00b5
            r2 = r5
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            SC.x1$c r4 = SC.C13656x1.c.f116498a
            Qt.f$a r6 = new Qt.f$a
            r6.<init>(r1, r15)
            r7 = 54
            r8 = -662481737(0xffffffffd88354b7, float:-1.15519897E15)
            c1.a r16 = c1.c.e(r8, r5, r6, r13, r7)
            int r5 = SC.C13656x1.c.f116499b
            int r5 = r5 << 3
            int r6 = r3 >> 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            int r6 = r3 << 3
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            int r3 = r3 << 9
            r6 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r6
            r17 = r5 | r3
            r19 = 6
            r20 = 992(0x3e0, float:1.39E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r3 = r4
            r4 = r25
            r5 = r18
            r6 = r23
            r21 = r13
            r13 = r16
            r14 = r21
            r15 = r17
            r16 = r19
            r17 = r20
            SC.J.c(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0105
            U0.C4895p.R()
        L_0x0105:
            r3 = r18
        L_0x0107:
            U0.Y0 r7 = r21.n()
            if (r7 == 0) goto L_0x0120
            Qt.d r8 = new Qt.d
            r0 = r8
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qt.C10909f.c(java.lang.String, O0.F0, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(String str, F0 f02, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        c(str, f02, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void e(String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        C4889m k10 = mVar.k(-1300213809);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1300213809, i12, -1, "com.ingka.ikea.instore.impl.storeevents.composables.ErrorBottomSheetContent (ErrorBottomSheet.kt:68)");
            }
            d.a aVar3 = d.f18749a;
            d h10 = J.h(aVar3, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.g(), k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
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
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            C5844O.a(J.i(aVar3, h.B((float) 56)), k10, 6);
            C5942c c10 = e.c(C18148c.WarningTriangle.m(), k10, 0);
            C5749w0.a aVar5 = C5749w0.f27365b;
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            C5583F.a(c10, (String) null, (d) null, (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(aVar5, vVar.a(k10, i13).G0(), 0, 2, (Object) null), k10, 48, 60);
            C18029u uVar = C18029u.f147649a;
            C5844O.a(J.i(aVar3, uVar.d()), k10, 0);
            C4889m mVar2 = k10;
            C13607l.j(str, C13679b.a.C2856b.f116680a, TC.e.i(J.h(aVar3, 0.0f, 1, (Object) null)), vVar.a(k10, i13).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(j.f14783b.a()), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, (i12 & 14) | 48, 0, 261104);
            d.a aVar6 = aVar3;
            k10 = mVar2;
            C5844O.a(J.i(aVar6, uVar.d()), k10, 0);
            L.b(J1.j.b(b.f84616d5, k10, 0), C5116k1.a(D.k(J.h(aVar6, 0.0f, 1, (Object) null), uVar.a(), 0.0f, 2, (Object) null), "error_dialog_button"), false, (N) null, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, k10, (i12 << 24) & 1879048192, 508);
            C5844O.a(J.i(aVar6, uVar.d()), k10, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10908e(str, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        e(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
