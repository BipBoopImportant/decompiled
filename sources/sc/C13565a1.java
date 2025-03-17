package SC;

import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import s0.C5834E;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001au\u0010\u000f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "", "expanded", "LKJ/c;", "items", "Lkotlin/Function1;", "LXH/N;", "itemContent", "Lkotlin/Function0;", "onDismissRequest", "Landroidx/compose/ui/d;", "modifier", "Ls0/E;", "contentPadding", "onItemClick", "b", "(ZLKJ/c;LnI/q;LnI/a;Landroidx/compose/ui/d;Ls0/E;LnI/l;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.a1  reason: case insensitive filesystem */
public final class C13565a1 {
    /* JADX WARNING: Removed duplicated region for block: B:102:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void b(boolean r20, KJ.C15987c<? extends T> r21, nI.q<? super T, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, androidx.compose.ui.d r24, s0.C5834E r25, nI.C17642l<? super T, XH.C16807N> r26, U0.C4889m r27, int r28, int r29) {
        /*
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r26
            r15 = r28
            java.lang.String r0 = "items"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "itemContent"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onItemClick"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -567412370(0xffffffffde2df96e, float:-3.134043E18)
            r1 = r27
            U0.m r10 = r1.k(r0)
            r1 = r29 & 1
            if (r1 == 0) goto L_0x0030
            r1 = r15 | 6
            r9 = r20
            goto L_0x0042
        L_0x0030:
            r1 = r15 & 6
            r9 = r20
            if (r1 != 0) goto L_0x0041
            boolean r1 = r10.b(r9)
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = 2
        L_0x003f:
            r1 = r1 | r15
            goto L_0x0042
        L_0x0041:
            r1 = r15
        L_0x0042:
            r2 = r29 & 2
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 48
            goto L_0x0062
        L_0x0049:
            r2 = r15 & 48
            if (r2 != 0) goto L_0x0062
            r2 = r15 & 64
            if (r2 != 0) goto L_0x0056
            boolean r2 = r10.V(r11)
            goto L_0x005a
        L_0x0056:
            boolean r2 = r10.F(r11)
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            r2 = 32
            goto L_0x0061
        L_0x005f:
            r2 = 16
        L_0x0061:
            r1 = r1 | r2
        L_0x0062:
            r2 = r29 & 4
            if (r2 == 0) goto L_0x0069
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0079
        L_0x0069:
            r2 = r15 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0079
            boolean r2 = r10.F(r12)
            if (r2 == 0) goto L_0x0076
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0078
        L_0x0076:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0078:
            r1 = r1 | r2
        L_0x0079:
            r2 = r29 & 8
            if (r2 == 0) goto L_0x0080
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0090
        L_0x0080:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0090
            boolean r2 = r10.F(r13)
            if (r2 == 0) goto L_0x008d
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r1 = r1 | r2
        L_0x0090:
            r2 = r29 & 16
            if (r2 == 0) goto L_0x0099
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0096:
            r3 = r24
            goto L_0x00ab
        L_0x0099:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0096
            r3 = r24
            boolean r4 = r10.V(r3)
            if (r4 == 0) goto L_0x00a8
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r1 = r1 | r4
        L_0x00ab:
            r4 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 & r15
            if (r4 != 0) goto L_0x00c5
            r4 = r29 & 32
            if (r4 != 0) goto L_0x00bf
            r4 = r25
            boolean r5 = r10.V(r4)
            if (r5 == 0) goto L_0x00c1
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00bf:
            r4 = r25
        L_0x00c1:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r1 = r1 | r5
            goto L_0x00c7
        L_0x00c5:
            r4 = r25
        L_0x00c7:
            r5 = r29 & 64
            r6 = 1572864(0x180000, float:2.204052E-39)
            if (r5 == 0) goto L_0x00cf
            r1 = r1 | r6
            goto L_0x00df
        L_0x00cf:
            r5 = r15 & r6
            if (r5 != 0) goto L_0x00df
            boolean r5 = r10.F(r14)
            if (r5 == 0) goto L_0x00dc
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r5 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r1 = r1 | r5
        L_0x00df:
            r5 = 599187(0x92493, float:8.3964E-40)
            r5 = r5 & r1
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r5 != r6) goto L_0x00f8
            boolean r5 = r10.l()
            if (r5 != 0) goto L_0x00ef
            goto L_0x00f8
        L_0x00ef:
            r10.L()
            r5 = r3
            r6 = r4
            r18 = r10
            goto L_0x0171
        L_0x00f8:
            r10.G()
            r5 = r15 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r5 == 0) goto L_0x0116
            boolean r5 = r10.O()
            if (r5 == 0) goto L_0x0109
            goto L_0x0116
        L_0x0109:
            r10.L()
            r2 = r29 & 32
            if (r2 == 0) goto L_0x0111
            r1 = r1 & r6
        L_0x0111:
            r16 = r3
        L_0x0113:
            r17 = r4
            goto L_0x012f
        L_0x0116:
            if (r2 == 0) goto L_0x011b
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x011c
        L_0x011b:
            r2 = r3
        L_0x011c:
            r3 = r29 & 32
            if (r3 == 0) goto L_0x012c
            I0.g0 r3 = I0.C4559g0.f8074a
            s0.E r3 = r3.a()
            r1 = r1 & r6
            r16 = r2
            r17 = r3
            goto L_0x012f
        L_0x012c:
            r16 = r2
            goto L_0x0113
        L_0x012f:
            r10.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x013e
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.ui.skapa.SkapaListBox (SkapaListBox.kt:26)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x013e:
            r0 = 524286(0x7fffe, float:7.34681E-40)
            r0 = r0 & r1
            int r1 = r1 << 3
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 64
            r6 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r16
            r5 = r17
            r7 = r26
            r8 = r10
            r9 = r18
            r18 = r10
            r10 = r19
            wK.C18418n4.l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x016d
            U0.C4895p.R()
        L_0x016d:
            r5 = r16
            r6 = r17
        L_0x0171:
            U0.Y0 r10 = r18.n()
            if (r10 == 0) goto L_0x018f
            SC.Z0 r9 = new SC.Z0
            r0 = r9
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r7 = r26
            r8 = r28
            r11 = r9
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x018f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13565a1.b(boolean, KJ.c, nI.q, nI.a, androidx.compose.ui.d, s0.E, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(boolean z10, C15987c cVar, q qVar, C17631a aVar, d dVar, C5834E e10, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        b(z10, cVar, qVar, aVar, dVar, e10, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
