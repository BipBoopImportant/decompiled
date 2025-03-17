package di;

import U0.A1;
import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\f\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LU0/A1;", "", "expanded", "Ldi/i;", "state", "Lkotlin/Function0;", "LXH/N;", "expandContent", "navigationAction", "onHeaderClicked", "Landroidx/compose/ui/d;", "modifier", "c", "(LU0/A1;Ldi/i;LnI/p;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    /* JADX WARNING: Removed duplicated region for block: B:107:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(U0.A1<java.lang.Boolean> r18, di.i r19, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r20, nI.C17631a<XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, androidx.compose.ui.d r23, U0.C4889m r24, int r25, int r26) {
        /*
            r6 = r18
            r15 = r19
            r14 = r22
            r13 = r25
            java.lang.String r0 = "expanded"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onHeaderClicked"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -638796080(0xffffffffd9ecbed0, float:-8.3297369E15)
            r1 = r24
            U0.m r12 = r1.k(r0)
            r1 = r26 & 1
            r2 = 4
            if (r1 == 0) goto L_0x0028
            r1 = r13 | 6
            goto L_0x0038
        L_0x0028:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0037
            boolean r1 = r12.V(r6)
            if (r1 == 0) goto L_0x0034
            r1 = r2
            goto L_0x0035
        L_0x0034:
            r1 = 2
        L_0x0035:
            r1 = r1 | r13
            goto L_0x0038
        L_0x0037:
            r1 = r13
        L_0x0038:
            r3 = r26 & 2
            r4 = 32
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 48
            goto L_0x0059
        L_0x0041:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0059
            r3 = r13 & 64
            if (r3 != 0) goto L_0x004e
            boolean r3 = r12.V(r15)
            goto L_0x0052
        L_0x004e:
            boolean r3 = r12.F(r15)
        L_0x0052:
            if (r3 == 0) goto L_0x0056
            r3 = r4
            goto L_0x0058
        L_0x0056:
            r3 = 16
        L_0x0058:
            r1 = r1 | r3
        L_0x0059:
            r3 = r26 & 4
            if (r3 == 0) goto L_0x0062
            r1 = r1 | 384(0x180, float:5.38E-43)
            r11 = r20
            goto L_0x0074
        L_0x0062:
            r3 = r13 & 384(0x180, float:5.38E-43)
            r11 = r20
            if (r3 != 0) goto L_0x0074
            boolean r3 = r12.F(r11)
            if (r3 == 0) goto L_0x0071
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0073:
            r1 = r1 | r3
        L_0x0074:
            r3 = r26 & 8
            if (r3 == 0) goto L_0x007d
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r10 = r21
            goto L_0x008f
        L_0x007d:
            r3 = r13 & 3072(0xc00, float:4.305E-42)
            r10 = r21
            if (r3 != 0) goto L_0x008f
            boolean r3 = r12.F(r10)
            if (r3 == 0) goto L_0x008c
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x008e
        L_0x008c:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x008e:
            r1 = r1 | r3
        L_0x008f:
            r3 = r26 & 16
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0098
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a7
        L_0x0098:
            r3 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00a7
            boolean r3 = r12.F(r14)
            if (r3 == 0) goto L_0x00a4
            r3 = r7
            goto L_0x00a6
        L_0x00a4:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r3
        L_0x00a7:
            r3 = r26 & 32
            r8 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00b2
            r1 = r1 | r8
        L_0x00ae:
            r8 = r23
        L_0x00b0:
            r9 = r1
            goto L_0x00c4
        L_0x00b2:
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00ae
            r8 = r23
            boolean r9 = r12.V(r8)
            if (r9 == 0) goto L_0x00c0
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r1 = r1 | r9
            goto L_0x00b0
        L_0x00c4:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r9
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r5) goto L_0x00db
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x00d4
            goto L_0x00db
        L_0x00d4:
            r12.L()
            r6 = r8
            r0 = r12
            goto L_0x0185
        L_0x00db:
            if (r3 == 0) goto L_0x00e2
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r16 = r1
            goto L_0x00e4
        L_0x00e2:
            r16 = r8
        L_0x00e4:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00f0
            r1 = -1
            java.lang.String r3 = "com.ingka.ikea.app.productinformationpage.v2.compose.availability.AvailabilityContent (AvailabilityContent.kt:33)"
            U0.C4895p.S(r0, r9, r1, r3)
        L_0x00f0:
            java.lang.Object r0 = r18.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            r0 = 1654133222(0x629811e6, float:1.4025974E21)
            r12.W(r0)
            r17 = 57344(0xe000, float:8.0356E-41)
            r0 = r9 & r17
            r1 = 0
            r3 = 1
            if (r0 != r7) goto L_0x010b
            r0 = r3
            goto L_0x010c
        L_0x010b:
            r0 = r1
        L_0x010c:
            r7 = r9 & 112(0x70, float:1.57E-43)
            if (r7 == r4) goto L_0x011d
            r4 = r9 & 64
            if (r4 == 0) goto L_0x011b
            boolean r4 = r12.F(r15)
            if (r4 == 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r4 = r1
            goto L_0x011e
        L_0x011d:
            r4 = r3
        L_0x011e:
            r0 = r0 | r4
            r4 = r9 & 14
            if (r4 != r2) goto L_0x0125
            r2 = r3
            goto L_0x0126
        L_0x0125:
            r2 = r1
        L_0x0126:
            r0 = r0 | r2
            boolean r2 = r12.b(r8)
            r0 = r0 | r2
            r2 = r9 & 7168(0x1c00, float:1.0045E-41)
            r4 = 2048(0x800, float:2.87E-42)
            if (r2 != r4) goto L_0x0133
            r1 = r3
        L_0x0133:
            r0 = r0 | r1
            java.lang.Object r1 = r12.D()
            if (r0 != 0) goto L_0x0142
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0156
        L_0x0142:
            di.f r5 = new di.f
            r0 = r5
            r1 = r22
            r2 = r19
            r3 = r18
            r4 = r8
            r6 = r5
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r12.u(r6)
            r1 = r6
        L_0x0156:
            r0 = r1
            nI.a r0 = (nI.C17631a) r0
            r12.P()
            int r1 = IC.C13023e.f110931a
            int r1 = r1 << 3
            r1 = r1 | r7
            int r2 = r9 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r9 >> 3
            r2 = r2 & r17
            r1 = r1 | r2
            r2 = 0
            r7 = r8
            r8 = r19
            r9 = r0
            r10 = r20
            r11 = r16
            r0 = r12
            r13 = r1
            r14 = r2
            di.e.e(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0183
            U0.C4895p.R()
        L_0x0183:
            r6 = r16
        L_0x0185:
            U0.Y0 r9 = r0.n()
            if (r9 == 0) goto L_0x01a2
            di.g r10 = new di.g
            r0 = r10
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: di.h.c(U0.A1, di.i, nI.p, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17631a aVar, i iVar, A1 a12, boolean z10, C17631a aVar2) {
        aVar.invoke();
        if (iVar.f() && (a12 instanceof C4899r0)) {
            ((C4899r0) a12).setValue(Boolean.valueOf(!z10));
        } else if (aVar2 != null) {
            aVar2.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(A1 a12, i iVar, p pVar, C17631a aVar, C17631a aVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(a12, iVar, pVar, aVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
