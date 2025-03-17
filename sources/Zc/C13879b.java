package ZC;

import SC.G0;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "isPlaying", "Lkotlin/Function0;", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "LSC/G0;", "size", "b", "(ZLnI/a;Landroidx/compose/ui/d;LSC/G0;LU0/m;II)V", "video_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZC.b  reason: case insensitive filesystem */
public final class C13879b {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r19, nI.C17631a<XH.C16807N> r20, androidx.compose.ui.d r21, SC.G0 r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r19
            r14 = r20
            r15 = r24
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -1091271355(0xffffffffbef48545, float:-0.47757927)
            r2 = r23
            U0.m r13 = r2.k(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r15 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x002a
            boolean r2 = r13.b(r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r15
            goto L_0x002b
        L_0x002a:
            r2 = r15
        L_0x002b:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0042
        L_0x0032:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x0042
            boolean r3 = r13.F(r14)
            if (r3 == 0) goto L_0x003f
            r3 = 32
            goto L_0x0041
        L_0x003f:
            r3 = 16
        L_0x0041:
            r2 = r2 | r3
        L_0x0042:
            r3 = r25 & 4
            if (r3 == 0) goto L_0x004b
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r4 = r21
            goto L_0x005d
        L_0x004b:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0048
            r4 = r21
            boolean r5 = r13.V(r4)
            if (r5 == 0) goto L_0x005a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r2 = r2 | r5
        L_0x005d:
            r5 = r25 & 8
            if (r5 == 0) goto L_0x0066
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0063:
            r6 = r22
            goto L_0x0078
        L_0x0066:
            r6 = r15 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0063
            r6 = r22
            boolean r7 = r13.V(r6)
            if (r7 == 0) goto L_0x0075
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r2 = r2 | r7
        L_0x0078:
            r7 = r2 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x008d
            boolean r7 = r13.l()
            if (r7 != 0) goto L_0x0085
            goto L_0x008d
        L_0x0085:
            r13.L()
            r3 = r4
            r4 = r6
            r0 = r13
            goto L_0x00f1
        L_0x008d:
            if (r3 == 0) goto L_0x0094
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r16 = r3
            goto L_0x0096
        L_0x0094:
            r16 = r4
        L_0x0096:
            if (r5 == 0) goto L_0x009d
            SC.G0 r3 = SC.G0.Small
            r17 = r3
            goto L_0x009f
        L_0x009d:
            r17 = r6
        L_0x009f:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00ab
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.ui.video.PlayPauseButton (PlayPauseButton.kt:32)"
            U0.C4895p.S(r0, r2, r3, r4)
        L_0x00ab:
            if (r1 == 0) goto L_0x00b0
            int r0 = uK.C18146a.f148713x8
            goto L_0x00b2
        L_0x00b0:
            int r0 = uK.C18146a.f148579o9
        L_0x00b2:
            if (r1 == 0) goto L_0x00b7
            int r3 = Oo.b.f84814v5
            goto L_0x00b9
        L_0x00b7:
            int r3 = Oo.b.f84825w5
        L_0x00b9:
            r4 = 0
            java.lang.String r3 = J1.j.b(r3, r13, r4)
            SC.H0 r6 = SC.H0.ImageOverlay
            r4 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r5 = 458752(0x70000, float:6.42848E-40)
            int r7 = r2 << 6
            r5 = r5 & r7
            r4 = r4 | r5
            int r2 = r2 << 21
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r5
            r12 = r4 | r2
            r18 = 200(0xc8, float:2.8E-43)
            r5 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            r4 = r16
            r7 = r17
            r10 = r20
            r11 = r13
            r0 = r13
            r13 = r18
            SC.F0.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00ed
            U0.C4895p.R()
        L_0x00ed:
            r3 = r16
            r4 = r17
        L_0x00f1:
            U0.Y0 r7 = r0.n()
            if (r7 == 0) goto L_0x0108
            ZC.a r8 = new ZC.a
            r0 = r8
            r1 = r19
            r2 = r20
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ZC.C13879b.b(boolean, nI.a, androidx.compose.ui.d, SC.G0, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(boolean z10, C17631a aVar, d dVar, G0 g02, int i10, int i11, C4889m mVar, int i12) {
        b(z10, aVar, dVar, g02, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
