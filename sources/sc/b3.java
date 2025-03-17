package SC;

import KJ.C15987c;
import SC.Z2;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import r0.m;
import wK.Ka;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\f\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LKJ/c;", "LSC/Z2$a;", "toggleOptions", "Landroidx/compose/ui/d;", "modifier", "", "selectedIndex", "", "fluidState", "Lkotlin/Function1;", "LXH/N;", "onSelect", "b", "(LKJ/c;Landroidx/compose/ui/d;IZLnI/l;LU0/m;II)V", "LwK/Ka$a;", "d", "(LSC/Z2$a;)LwK/Ka$a;", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b3 {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(KJ.C15987c<SC.Z2.a> r16, androidx.compose.ui.d r17, int r18, boolean r19, nI.C17642l<? super java.lang.Integer, XH.C16807N> r20, U0.C4889m r21, int r22, int r23) {
        /*
            r1 = r16
            r10 = r20
            r11 = r22
            java.lang.String r0 = "toggleOptions"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onSelect"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 868594941(0x33c5b4fd, float:9.206449E-8)
            r2 = r21
            U0.m r12 = r2.k(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0020
            r2 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x002f
            boolean r2 = r12.V(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r11
            goto L_0x0030
        L_0x002f:
            r2 = r11
        L_0x0030:
            r3 = r23 & 2
            if (r3 == 0) goto L_0x0039
            r2 = r2 | 48
        L_0x0036:
            r4 = r17
            goto L_0x004b
        L_0x0039:
            r4 = r11 & 48
            if (r4 != 0) goto L_0x0036
            r4 = r17
            boolean r5 = r12.V(r4)
            if (r5 == 0) goto L_0x0048
            r5 = 32
            goto L_0x004a
        L_0x0048:
            r5 = 16
        L_0x004a:
            r2 = r2 | r5
        L_0x004b:
            r5 = r23 & 4
            if (r5 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r6 = r18
            goto L_0x0066
        L_0x0054:
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0051
            r6 = r18
            boolean r7 = r12.d(r6)
            if (r7 == 0) goto L_0x0063
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r7
        L_0x0066:
            r7 = r23 & 8
            if (r7 == 0) goto L_0x006f
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r8 = r19
            goto L_0x0081
        L_0x006f:
            r8 = r11 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x006c
            r8 = r19
            boolean r9 = r12.b(r8)
            if (r9 == 0) goto L_0x007e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r2 = r2 | r9
        L_0x0081:
            r9 = r23 & 16
            if (r9 == 0) goto L_0x0088
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0088:
            r9 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0098
            boolean r9 = r12.F(r10)
            if (r9 == 0) goto L_0x0095
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r2 = r2 | r9
        L_0x0098:
            r9 = r2 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r13) goto L_0x00ad
            boolean r9 = r12.l()
            if (r9 != 0) goto L_0x00a5
            goto L_0x00ad
        L_0x00a5:
            r12.L()
            r2 = r4
            r3 = r6
            r4 = r8
            goto L_0x010a
        L_0x00ad:
            if (r3 == 0) goto L_0x00b3
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r13 = r3
            goto L_0x00b4
        L_0x00b3:
            r13 = r4
        L_0x00b4:
            r3 = 0
            if (r5 == 0) goto L_0x00b9
            r14 = r3
            goto L_0x00ba
        L_0x00b9:
            r14 = r6
        L_0x00ba:
            if (r7 == 0) goto L_0x00be
            r15 = r3
            goto L_0x00bf
        L_0x00be:
            r15 = r8
        L_0x00bf:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00cb
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.ui.skapa.SkapaToggleWithIcon (SkapaToggle.kt:43)"
            U0.C4895p.S(r0, r2, r3, r4)
        L_0x00cb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r1, r3)
            r0.<init>(r3)
            java.util.Iterator r3 = r16.iterator()
        L_0x00da:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ee
            java.lang.Object r4 = r3.next()
            SC.Z2$a r4 = (SC.Z2.a) r4
            wK.Ka$a r4 = d(r4)
            r0.add(r4)
            goto L_0x00da
        L_0x00ee:
            r3 = 65520(0xfff0, float:9.1813E-41)
            r8 = r2 & r3
            r9 = 0
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r20
            r7 = r12
            wK.Sa.t(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0107
            U0.C4895p.R()
        L_0x0107:
            r2 = r13
            r3 = r14
            r4 = r15
        L_0x010a:
            U0.Y0 r8 = r12.n()
            if (r8 == 0) goto L_0x0121
            SC.a3 r9 = new SC.a3
            r0 = r9
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.b3.b(KJ.c, androidx.compose.ui.d, int, boolean, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C15987c cVar, d dVar, int i10, boolean z10, C17642l lVar, int i11, int i12, C4889m mVar, int i13) {
        b(cVar, dVar, i10, z10, lVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    private static final Ka.a d(Z2.a aVar) {
        return new Ka.a(aVar.c(), aVar.a(), aVar.b(), (m) null, 8, (DefaultConstructorMarker) null);
    }
}
