package to;

import HJ.C15854t;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "enabled", "", "allowedPaymentMethodsJson", "Lkotlin/Function0;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "c", "(ZLjava/lang/String;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: to.u0  reason: case insensitive filesystem */
public final class C11968u0 {
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r19, java.lang.String r20, nI.C17631a<XH.C16807N> r21, androidx.compose.ui.d r22, U0.C4889m r23, int r24, int r25) {
        /*
            r12 = r20
            r13 = r21
            r14 = r24
            java.lang.String r0 = "allowedPaymentMethodsJson"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 31145849(0x1db3f79, float:8.0538973E-38)
            r1 = r23
            U0.m r15 = r1.k(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r14 | 6
            r11 = r19
            goto L_0x0034
        L_0x0022:
            r1 = r14 & 6
            r11 = r19
            if (r1 != 0) goto L_0x0033
            boolean r1 = r15.b(r11)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r14
            goto L_0x0034
        L_0x0033:
            r1 = r14
        L_0x0034:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x004b
            boolean r2 = r15.V(r12)
            if (r2 == 0) goto L_0x0048
            r2 = 32
            goto L_0x004a
        L_0x0048:
            r2 = 16
        L_0x004a:
            r1 = r1 | r2
        L_0x004b:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0062
            boolean r2 = r15.F(r13)
            if (r2 == 0) goto L_0x005f
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r2
        L_0x0062:
            r2 = r25 & 8
            if (r2 == 0) goto L_0x006b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r3 = r22
            goto L_0x007d
        L_0x006b:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0068
            r3 = r22
            boolean r4 = r15.V(r3)
            if (r4 == 0) goto L_0x007a
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r4
        L_0x007d:
            r4 = r1 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0090
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            r15.L()
            r4 = r3
            goto L_0x010b
        L_0x0090:
            if (r2 == 0) goto L_0x0096
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r10 = r2
            goto L_0x0097
        L_0x0096:
            r10 = r3
        L_0x0097:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00a3
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.checkout.impl.presentation.compose.GooglePayButton (GooglePayButton.kt:30)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00a3:
            r0 = 0
            boolean r0 = n0.C5607m.a(r15, r0)
            if (r0 == 0) goto L_0x00ae
            id.a r0 = id.C9842a.Light
        L_0x00ac:
            r3 = r0
            goto L_0x00b1
        L_0x00ae:
            id.a r0 = id.C9842a.Dark
            goto L_0x00ac
        L_0x00b1:
            r0 = 0
            r2 = 0
            r4 = 1
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r10, r0, r4, r2)
            id.b r4 = id.C9843b.Checkout
            r0 = 972925025(0x39fda861, float:4.8381372E-4)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r0 != r5) goto L_0x00d4
            to.s0 r0 = new to.s0
            r0.<init>()
            r15.u(r0)
        L_0x00d4:
            r7 = r0
            nI.l r7 = (nI.C17642l) r7
            r15.P()
            int r0 = r1 >> 6
            r0 = r0 & 14
            r5 = 12607488(0xc06000, float:1.7666854E-38)
            r0 = r0 | r5
            r5 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r5
            int r1 = r1 << 18
            r5 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r5
            r16 = r0 | r1
            r17 = 288(0x120, float:4.04E-43)
            r5 = 0
            r8 = 0
            r0 = r21
            r1 = r20
            r6 = r19
            r9 = r15
            r18 = r10
            r10 = r16
            r11 = r17
            id.h.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0109
            U0.C4895p.R()
        L_0x0109:
            r4 = r18
        L_0x010b:
            U0.Y0 r7 = r15.n()
            if (r7 == 0) goto L_0x0124
            to.t0 r8 = new to.t0
            r0 = r8
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: to.C11968u0.c(boolean, java.lang.String, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(Throwable th2) {
        String str;
        C17542s.j(th2, "it");
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Unable to show GooglePayButton", th2);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "GooglePayButton";
            } else {
                str = str3;
            }
            bVar.a(eVar, str, false, th2, str4);
            str2 = str4;
            str3 = str;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(boolean z10, String str, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(z10, str, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
