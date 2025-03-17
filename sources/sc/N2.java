package SC;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;
import r0.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "checked", "Lkotlin/Function1;", "LXH/N;", "onCheckedChange", "Landroidx/compose/ui/d;", "modifier", "enabled", "LSC/O2;", "variant", "Lr0/m;", "interactionSource", "b", "(ZLnI/l;Landroidx/compose/ui/d;ZLSC/O2;Lr0/m;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class N2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115862a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                SC.O2[] r0 = SC.O2.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.O2 r1 = SC.O2.SUBTLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.O2 r1 = SC.O2.EMPHASISED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f115862a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.N2.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r20, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r21, androidx.compose.ui.d r22, boolean r23, SC.O2 r24, r0.m r25, U0.C4889m r26, int r27, int r28) {
        /*
            r7 = r27
            r0 = 1570622483(0x5d9dcc13, float:1.42131051E18)
            r1 = r26
            U0.m r1 = r1.k(r0)
            r2 = r28 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r4 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r4 = r1.b(r2)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r4 = r7
        L_0x0029:
            r5 = r28 & 2
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r5 = r21
            goto L_0x0044
        L_0x0032:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r21
            boolean r6 = r1.F(r5)
            if (r6 == 0) goto L_0x0041
            r6 = 32
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r4 = r4 | r6
        L_0x0044:
            r6 = r28 & 4
            if (r6 == 0) goto L_0x004d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r22
            goto L_0x005f
        L_0x004d:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r22
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r4 = r4 | r9
        L_0x005f:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0068
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r23
            goto L_0x007a
        L_0x0068:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r23
            boolean r11 = r1.b(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r11
        L_0x007a:
            r11 = r28 & 16
            if (r11 == 0) goto L_0x0083
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r24
            goto L_0x0095
        L_0x0083:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r24
            boolean r13 = r1.V(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r4 = r4 | r13
        L_0x0095:
            r13 = r28 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x009f
            r4 = r4 | r14
        L_0x009c:
            r14 = r25
            goto L_0x00b0
        L_0x009f:
            r14 = r14 & r7
            if (r14 != 0) goto L_0x009c
            r14 = r25
            boolean r15 = r1.V(r14)
            if (r15 == 0) goto L_0x00ad
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r4 = r4 | r15
        L_0x00b0:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r4
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r3) goto L_0x00c8
            boolean r3 = r1.l()
            if (r3 != 0) goto L_0x00c0
            goto L_0x00c8
        L_0x00c0:
            r1.L()
            r3 = r8
            r4 = r10
            r6 = r14
            goto L_0x015e
        L_0x00c8:
            if (r6 == 0) goto L_0x00cd
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x00ce
        L_0x00cd:
            r3 = r8
        L_0x00ce:
            r6 = 1
            if (r9 == 0) goto L_0x00d4
            r17 = r6
            goto L_0x00d6
        L_0x00d4:
            r17 = r10
        L_0x00d6:
            if (r11 == 0) goto L_0x00dd
            SC.O2 r8 = SC.O2.EMPHASISED
            r18 = r8
            goto L_0x00df
        L_0x00dd:
            r18 = r12
        L_0x00df:
            if (r13 == 0) goto L_0x0102
            r8 = 2141919316(0x7fab1854, float:NaN)
            r1.W(r8)
            java.lang.Object r8 = r1.D()
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r8 != r9) goto L_0x00fa
            r0.m r8 = r0.l.a()
            r1.u(r8)
        L_0x00fa:
            r0.m r8 = (r0.m) r8
            r1.P()
            r19 = r8
            goto L_0x0104
        L_0x0102:
            r19 = r14
        L_0x0104:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0110
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.ui.skapa.SkapaSwitch (SkapaSwitch.kt:20)"
            U0.C4895p.S(r0, r4, r8, r9)
        L_0x0110:
            int[] r0 = SC.N2.a.f115862a
            int r8 = r18.ordinal()
            r0 = r0[r8]
            if (r0 == r6) goto L_0x0127
            r6 = 2
            if (r0 != r6) goto L_0x0121
            wK.ha r0 = wK.C18352ha.Emphasised
        L_0x011f:
            r11 = r0
            goto L_0x012a
        L_0x0121:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0127:
            wK.ha r0 = wK.C18352ha.Subtle
            goto L_0x011f
        L_0x012a:
            r0 = r4 & 14
            int r6 = r4 >> 3
            r8 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r8
            r8 = r6 & 896(0x380, float:1.256E-42)
            r0 = r0 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r8
            r0 = r0 | r6
            int r4 = r4 << 12
            r6 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r6
            r15 = r0 | r4
            r16 = 0
            r8 = r20
            r9 = r3
            r10 = r17
            r12 = r19
            r13 = r21
            r14 = r1
            wK.C18328fa.n(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0158
            U0.C4895p.R()
        L_0x0158:
            r4 = r17
            r12 = r18
            r6 = r19
        L_0x015e:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x0176
            SC.M2 r10 = new SC.M2
            r0 = r10
            r1 = r20
            r2 = r21
            r5 = r12
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.N2.b(boolean, nI.l, androidx.compose.ui.d, boolean, SC.O2, r0.m, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(boolean z10, C17642l lVar, d dVar, boolean z11, O2 o22, m mVar, int i10, int i11, C4889m mVar2, int i12) {
        b(z10, lVar, dVar, z11, o22, mVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
