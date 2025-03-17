package wK;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "value", "LwK/N1;", "type", "Landroidx/compose/ui/d;", "modifier", "LwK/O1;", "variant", "LXH/N;", "c", "(Ljava/lang/String;LwK/N1;Landroidx/compose/ui/d;LwK/O1;LU0/m;II)V", "LwK/L1;", "size", "e", "(Ljava/lang/String;LwK/N1;Landroidx/compose/ui/d;LwK/O1;LwK/L1;LU0/m;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J1 {
    public static final void c(String str, N1 n12, d dVar, O1 o12, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(str, "value");
        C17542s.j(n12, "type");
        C4889m k10 = mVar.k(1029229730);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(n12) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.V(o12) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (i14 != 0) {
                o12 = O1.Emphasised;
            }
            if (C4895p.J()) {
                C4895p.S(1029229730, i12, -1, "net.ikea.skapa.ui.components.CommercialMessage (CommercialMessage.kt:41)");
            }
            e(str, n12, dVar, o12, L1.Regular, k10, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        O1 o13 = o12;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new I1(str, n12, dVar2, o13, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(String str, N1 n12, d dVar, O1 o12, int i10, int i11, C4889m mVar, int i12) {
        c(str, n12, dVar, o12, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r28, wK.N1 r29, androidx.compose.ui.d r30, wK.O1 r31, wK.L1 r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r28
            r15 = r29
            r13 = r32
            r14 = r34
            java.lang.String r1 = "value"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            java.lang.String r1 = "type"
            kotlin.jvm.internal.C17542s.j(r15, r1)
            java.lang.String r1 = "size"
            kotlin.jvm.internal.C17542s.j(r13, r1)
            r1 = -383581292(0xffffffffe9230394, float:-1.2316988E25)
            r2 = r33
            U0.m r12 = r2.k(r1)
            r2 = r35 & 1
            if (r2 == 0) goto L_0x0027
            r2 = r14 | 6
            goto L_0x0037
        L_0x0027:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0036
            boolean r2 = r12.V(r0)
            if (r2 == 0) goto L_0x0033
            r2 = 4
            goto L_0x0034
        L_0x0033:
            r2 = 2
        L_0x0034:
            r2 = r2 | r14
            goto L_0x0037
        L_0x0036:
            r2 = r14
        L_0x0037:
            r3 = r35 & 2
            if (r3 == 0) goto L_0x003e
            r2 = r2 | 48
            goto L_0x004e
        L_0x003e:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x004e
            boolean r3 = r12.V(r15)
            if (r3 == 0) goto L_0x004b
            r3 = 32
            goto L_0x004d
        L_0x004b:
            r3 = 16
        L_0x004d:
            r2 = r2 | r3
        L_0x004e:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x0057
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0054:
            r4 = r30
            goto L_0x0069
        L_0x0057:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0054
            r4 = r30
            boolean r5 = r12.V(r4)
            if (r5 == 0) goto L_0x0066
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r2 = r2 | r5
        L_0x0069:
            r5 = r35 & 8
            if (r5 == 0) goto L_0x0072
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x006f:
            r6 = r31
            goto L_0x0084
        L_0x0072:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x006f
            r6 = r31
            boolean r7 = r12.V(r6)
            if (r7 == 0) goto L_0x0081
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r2 = r2 | r7
        L_0x0084:
            r7 = r35 & 16
            if (r7 == 0) goto L_0x008c
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r7 = r2
            goto L_0x009d
        L_0x008c:
            r7 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x008a
            boolean r7 = r12.V(r13)
            if (r7 == 0) goto L_0x0099
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r2 = r2 | r7
            goto L_0x008a
        L_0x009d:
            r2 = r7 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r8) goto L_0x00b3
            boolean r2 = r12.l()
            if (r2 != 0) goto L_0x00aa
            goto L_0x00b3
        L_0x00aa:
            r12.L()
            r3 = r4
            r4 = r6
            r27 = r12
            goto L_0x0140
        L_0x00b3:
            if (r3 == 0) goto L_0x00ba
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r25 = r2
            goto L_0x00bc
        L_0x00ba:
            r25 = r4
        L_0x00bc:
            if (r5 == 0) goto L_0x00c3
            wK.O1 r2 = wK.O1.Emphasised
            r26 = r2
            goto L_0x00c5
        L_0x00c3:
            r26 = r6
        L_0x00c5:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00d1
            r2 = -1
            java.lang.String r3 = "net.ikea.skapa.ui.components.CommercialMessageImpl (CommercialMessage.kt:50)"
            U0.C4895p.S(r1, r7, r2, r3)
        L_0x00d1:
            wK.K1 r1 = wK.K1.f149712a
            int r2 = r7 >> 9
            r2 = r2 & 14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r3 = r7 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r3 = r7 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r6 = r2 | r3
            r2 = r26
            r3 = r29
            r4 = r32
            r5 = r12
            wK.M1 r2 = r1.a(r2, r3, r4, r5, r6)
            long r17 = r2.a()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r25
            androidx.compose.ui.d r1 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            s0.E r3 = r2.b()
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r1, r3)
            N1.Y r20 = r2.c()
            r22 = r7 & 14
            r23 = 0
            r24 = 65532(0xfffc, float:9.183E-41)
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r27 = r12
            r12 = r16
            r16 = 0
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r0 = r28
            r21 = r27
            O0.d1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x013c
            U0.C4895p.R()
        L_0x013c:
            r3 = r25
            r4 = r26
        L_0x0140:
            U0.Y0 r8 = r27.n()
            if (r8 == 0) goto L_0x0159
            wK.H1 r9 = new wK.H1
            r0 = r9
            r1 = r28
            r2 = r29
            r5 = r32
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.J1.e(java.lang.String, wK.N1, androidx.compose.ui.d, wK.O1, wK.L1, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, N1 n12, d dVar, O1 o12, L1 l12, int i10, int i11, C4889m mVar, int i12) {
        e(str, n12, dVar, o12, l12, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
