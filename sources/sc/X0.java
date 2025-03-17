package SC;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "label", "Landroidx/compose/ui/d;", "modifier", "", "enabled", "isFooter", "loading", "Lr0/m;", "interactionSource", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(Ljava/lang/String;Landroidx/compose/ui/d;ZZZLr0/m;LnI/a;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class X0 {
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r21, androidx.compose.ui.d r22, boolean r23, boolean r24, boolean r25, r0.m r26, nI.C17631a<XH.C16807N> r27, U0.C4889m r28, int r29, int r30) {
        /*
            r10 = r21
            r11 = r27
            r12 = r29
            java.lang.String r0 = "label"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -460379056(0xffffffffe48f2c50, float:-2.112862E22)
            r1 = r28
            U0.m r13 = r1.k(r0)
            r1 = r30 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r12 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r13.V(r10)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r12
            goto L_0x0030
        L_0x002f:
            r1 = r12
        L_0x0030:
            r2 = r30 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
        L_0x0036:
            r3 = r22
            goto L_0x004b
        L_0x0039:
            r3 = r12 & 48
            if (r3 != 0) goto L_0x0036
            r3 = r22
            boolean r4 = r13.V(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r30 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r5 = r23
            goto L_0x0066
        L_0x0054:
            r5 = r12 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0051
            r5 = r23
            boolean r6 = r13.b(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r6
        L_0x0066:
            r6 = r30 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r7 = r24
            goto L_0x0081
        L_0x006f:
            r7 = r12 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006c
            r7 = r24
            boolean r8 = r13.b(r7)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r8
        L_0x0081:
            r8 = r30 & 16
            if (r8 == 0) goto L_0x008a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r9 = r25
            goto L_0x009c
        L_0x008a:
            r9 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0087
            r9 = r25
            boolean r14 = r13.b(r9)
            if (r14 == 0) goto L_0x0099
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r1 = r1 | r14
        L_0x009c:
            r14 = r30 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a6
            r1 = r1 | r15
        L_0x00a3:
            r15 = r26
            goto L_0x00b8
        L_0x00a6:
            r15 = r15 & r12
            if (r15 != 0) goto L_0x00a3
            r15 = r26
            boolean r16 = r13.V(r15)
            if (r16 == 0) goto L_0x00b4
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r16
        L_0x00b8:
            r16 = r30 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c1
            r1 = r1 | r17
            goto L_0x00d2
        L_0x00c1:
            r16 = r12 & r17
            if (r16 != 0) goto L_0x00d2
            boolean r16 = r13.F(r11)
            if (r16 == 0) goto L_0x00ce
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r1 = r1 | r16
        L_0x00d2:
            r16 = 599187(0x92493, float:8.3964E-40)
            r0 = r1 & r16
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r3) goto L_0x00ee
            boolean r0 = r13.l()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00ee
        L_0x00e3:
            r13.L()
            r2 = r22
            r3 = r5
            r4 = r7
            r5 = r9
            r6 = r15
            goto L_0x016e
        L_0x00ee:
            if (r2 == 0) goto L_0x00f5
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r16 = r0
            goto L_0x00f7
        L_0x00f5:
            r16 = r22
        L_0x00f7:
            if (r4 == 0) goto L_0x00fd
            r0 = 1
            r18 = r0
            goto L_0x00ff
        L_0x00fd:
            r18 = r5
        L_0x00ff:
            r0 = 0
            if (r6 == 0) goto L_0x0105
            r19 = r0
            goto L_0x0107
        L_0x0105:
            r19 = r7
        L_0x0107:
            if (r8 == 0) goto L_0x010c
            r20 = r0
            goto L_0x010e
        L_0x010c:
            r20 = r9
        L_0x010e:
            if (r14 == 0) goto L_0x012f
            r0 = 366377647(0x15d67aaf, float:8.662747E-26)
            r13.W(r0)
            java.lang.Object r0 = r13.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0129
            r0.m r0 = r0.l.a()
            r13.u(r0)
        L_0x0129:
            r0.m r0 = (r0.m) r0
            r13.P()
            r15 = r0
        L_0x012f:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x013e
            r0 = -1
            java.lang.String r2 = "com.ingka.ikea.ui.skapa.SkapaJumboButton (SkapaJumboButton.kt:30)"
            r3 = -460379056(0xffffffffe48f2c50, float:-2.112862E22)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x013e:
            if (r19 == 0) goto L_0x0144
            wK.g4 r0 = wK.C18334g4.Footer
        L_0x0142:
            r3 = r0
            goto L_0x0147
        L_0x0144:
            wK.g4 r0 = wK.C18334g4.Regular
            goto L_0x0142
        L_0x0147:
            r0 = 4187134(0x3fe3fe, float:5.867424E-39)
            r8 = r1 & r0
            r9 = 0
            r0 = r21
            r1 = r16
            r2 = r18
            r4 = r20
            r5 = r15
            r6 = r27
            r7 = r13
            wK.C18298d4.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0165
            U0.C4895p.R()
        L_0x0165:
            r6 = r15
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
        L_0x016e:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x0185
            SC.W0 r14 = new SC.W0
            r0 = r14
            r1 = r21
            r7 = r27
            r8 = r29
            r9 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.a(r14)
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.X0.b(java.lang.String, androidx.compose.ui.d, boolean, boolean, boolean, r0.m, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, d dVar, boolean z10, boolean z11, boolean z12, m mVar, C17631a aVar, int i10, int i11, C4889m mVar2, int i12) {
        b(str, dVar, z10, z11, z12, mVar, aVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
