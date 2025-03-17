package SC;

import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import wK.C18398l8;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001am\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u00070\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "selected", "Landroidx/compose/ui/d;", "modifier", "enabled", "LSC/h2;", "variant", "LXH/N;", "g", "(ZLandroidx/compose/ui/d;ZLSC/h2;LU0/m;II)V", "T", "LKJ/c;", "LSC/i2;", "items", "Lkotlin/Function1;", "onItemSelected", "", "groupName", "d", "(LKJ/c;Ljava/lang/Object;LnI/l;Landroidx/compose/ui/d;Ljava/lang/String;LSC/h2;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.g2  reason: case insensitive filesystem */
public final class C13590g2 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void d(KJ.C15987c<SC.C13598i2<T>> r25, T r26, nI.C17642l<? super SC.C13598i2<T>, XH.C16807N> r27, androidx.compose.ui.d r28, java.lang.String r29, SC.C13594h2 r30, U0.C4889m r31, int r32, int r33) {
        /*
            r1 = r25
            r11 = r26
            r12 = r27
            r13 = r32
            java.lang.String r0 = "items"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 1898411011(0x71277403, float:8.2918794E29)
            r2 = r31
            U0.m r14 = r2.k(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x0022
            r2 = r13 | 6
            goto L_0x003b
        L_0x0022:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x003a
            r2 = r13 & 8
            if (r2 != 0) goto L_0x002f
            boolean r2 = r14.V(r1)
            goto L_0x0033
        L_0x002f:
            boolean r2 = r14.F(r1)
        L_0x0033:
            if (r2 == 0) goto L_0x0037
            r2 = 4
            goto L_0x0038
        L_0x0037:
            r2 = 2
        L_0x0038:
            r2 = r2 | r13
            goto L_0x003b
        L_0x003a:
            r2 = r13
        L_0x003b:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0042
            r2 = r2 | 48
            goto L_0x005b
        L_0x0042:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x005b
            r4 = r13 & 64
            if (r4 != 0) goto L_0x004f
            boolean r4 = r14.V(r11)
            goto L_0x0053
        L_0x004f:
            boolean r4 = r14.F(r11)
        L_0x0053:
            if (r4 == 0) goto L_0x0058
            r4 = 32
            goto L_0x005a
        L_0x0058:
            r4 = 16
        L_0x005a:
            r2 = r2 | r4
        L_0x005b:
            r4 = r33 & 4
            r5 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0064
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0064:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0073
            boolean r4 = r14.F(r12)
            if (r4 == 0) goto L_0x0070
            r4 = r5
            goto L_0x0072
        L_0x0070:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r2 = r2 | r4
        L_0x0073:
            r4 = r33 & 8
            if (r4 == 0) goto L_0x007c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0079:
            r6 = r28
            goto L_0x008e
        L_0x007c:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0079
            r6 = r28
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L_0x008b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r2 = r2 | r7
        L_0x008e:
            r7 = r33 & 16
            if (r7 == 0) goto L_0x0097
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0094:
            r8 = r29
            goto L_0x00a9
        L_0x0097:
            r8 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0094
            r8 = r29
            boolean r9 = r14.V(r8)
            if (r9 == 0) goto L_0x00a6
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r2 = r2 | r9
        L_0x00a9:
            r9 = r33 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x00b3
            r2 = r2 | r10
        L_0x00b0:
            r10 = r30
            goto L_0x00c4
        L_0x00b3:
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00b0
            r10 = r30
            boolean r15 = r14.V(r10)
            if (r15 == 0) goto L_0x00c1
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r2 = r2 | r15
        L_0x00c4:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r2
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r3) goto L_0x00dc
            boolean r3 = r14.l()
            if (r3 != 0) goto L_0x00d4
            goto L_0x00dc
        L_0x00d4:
            r14.L()
            r4 = r6
            r5 = r8
            r6 = r10
            goto L_0x01a1
        L_0x00dc:
            if (r4 == 0) goto L_0x00e2
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r15 = r3
            goto L_0x00e3
        L_0x00e2:
            r15 = r6
        L_0x00e3:
            if (r7 == 0) goto L_0x00e9
            r3 = 0
            r16 = r3
            goto L_0x00eb
        L_0x00e9:
            r16 = r8
        L_0x00eb:
            if (r9 == 0) goto L_0x00f2
            SC.h2 r3 = SC.C13594h2.Emphasised
            r17 = r3
            goto L_0x00f4
        L_0x00f2:
            r17 = r10
        L_0x00f4:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0100
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.ui.skapa.SkapaRadioButtonGroup (SkapaRadioButton.kt:65)"
            U0.C4895p.S(r0, r2, r3, r4)
        L_0x0100:
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = YH.C16877v.y(r1, r3)
            r0.<init>(r3)
            java.util.Iterator r3 = r25.iterator()
        L_0x010f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0138
            java.lang.Object r4 = r3.next()
            SC.i2 r4 = (SC.C13598i2) r4
            wK.l8 r6 = new wK.l8
            java.lang.Object r19 = r4.b()
            java.lang.String r20 = r4.c()
            boolean r21 = r4.a()
            r23 = 8
            r24 = 0
            r22 = 0
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r0.add(r6)
            goto L_0x010f
        L_0x0138:
            wK.k8 r6 = r17.b()
            r3 = -405918864(0xffffffffe7ce2b70, float:-1.9472176E24)
            r14.W(r3)
            r3 = r2 & 896(0x380, float:1.256E-42)
            r4 = 0
            r7 = 1
            if (r3 != r5) goto L_0x014a
            r3 = r7
            goto L_0x014b
        L_0x014a:
            r3 = r4
        L_0x014b:
            r5 = r2 & 14
            r8 = 4
            if (r5 == r8) goto L_0x015a
            r5 = r2 & 8
            if (r5 == 0) goto L_0x015b
            boolean r5 = r14.F(r1)
            if (r5 == 0) goto L_0x015b
        L_0x015a:
            r4 = r7
        L_0x015b:
            r3 = r3 | r4
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x016a
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0172
        L_0x016a:
            SC.e2 r4 = new SC.e2
            r4.<init>(r12, r1)
            r14.u(r4)
        L_0x0172:
            r7 = r4
            nI.l r7 = (nI.C17642l) r7
            r14.P()
            int r3 = r2 >> 3
            r4 = r3 & 8
            int r4 = r4 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r4
            r4 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r9 = r2 | r3
            r10 = 0
            r2 = r0
            r3 = r26
            r4 = r15
            r5 = r16
            r8 = r14
            wK.C18350h8.A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x019c
            U0.C4895p.R()
        L_0x019c:
            r4 = r15
            r5 = r16
            r6 = r17
        L_0x01a1:
            U0.Y0 r9 = r14.n()
            if (r9 == 0) goto L_0x01ba
            SC.f2 r10 = new SC.f2
            r0 = r10
            r1 = r25
            r2 = r26
            r3 = r27
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13590g2.d(KJ.c, java.lang.Object, nI.l, androidx.compose.ui.d, java.lang.String, SC.h2, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, C15987c cVar, C18398l8 l8Var) {
        C17542s.j(l8Var, "selectedItem");
        for (Object next : cVar) {
            if (C17542s.e(((C13598i2) next).b(), l8Var.c())) {
                lVar.invoke(next);
                return C16807N.f139792a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C15987c cVar, Object obj, C17642l lVar, d dVar, String str, C13594h2 h2Var, int i10, int i11, C4889m mVar, int i12) {
        d(cVar, obj, lVar, dVar, str, h2Var, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(boolean r17, androidx.compose.ui.d r18, boolean r19, SC.C13594h2 r20, U0.C4889m r21, int r22, int r23) {
        /*
            r5 = r22
            r0 = -1864908946(0xffffffff90d7bf6e, float:-8.509749E-29)
            r1 = r21
            U0.m r1 = r1.k(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r5 | 6
            r3 = r2
            r2 = r17
            goto L_0x0029
        L_0x0015:
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r17
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r5
            goto L_0x0029
        L_0x0026:
            r2 = r17
            r3 = r5
        L_0x0029:
            r4 = r23 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r6 = r18
            goto L_0x0044
        L_0x0032:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r18
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r8 = r19
            goto L_0x005f
        L_0x004d:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004a
            r8 = r19
            boolean r9 = r1.b(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r9
        L_0x005f:
            r9 = r23 & 8
            if (r9 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r10 = r20
            goto L_0x007a
        L_0x0068:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0065
            r10 = r20
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r11
        L_0x007a:
            r11 = r3 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x008d
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            r1.L()
            r4 = r6
            r3 = r8
            goto L_0x00d6
        L_0x008d:
            if (r4 == 0) goto L_0x0092
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x0093
        L_0x0092:
            r4 = r6
        L_0x0093:
            if (r7 == 0) goto L_0x0098
            r6 = 1
            r15 = r6
            goto L_0x0099
        L_0x0098:
            r15 = r8
        L_0x0099:
            if (r9 == 0) goto L_0x00a0
            SC.h2 r6 = SC.C13594h2.Emphasised
            r16 = r6
            goto L_0x00a2
        L_0x00a0:
            r16 = r10
        L_0x00a2:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00ae
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.ui.skapa.SkapaRadioButtonStatic (SkapaRadioButton.kt:44)"
            U0.C4895p.S(r0, r3, r6, r7)
        L_0x00ae:
            wK.k8 r9 = r16.b()
            r0 = r3 & 14
            r6 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r6
            r6 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r13 = r0 | r3
            r14 = 16
            r10 = 0
            r11 = 0
            r6 = r17
            r7 = r4
            r8 = r15
            r12 = r1
            wK.C18350h8.t(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00d3
            U0.C4895p.R()
        L_0x00d3:
            r3 = r15
            r10 = r16
        L_0x00d6:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x00ed
            SC.d2 r8 = new SC.d2
            r0 = r8
            r1 = r17
            r2 = r4
            r4 = r10
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13590g2.g(boolean, androidx.compose.ui.d, boolean, SC.h2, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(boolean z10, d dVar, boolean z11, C13594h2 h2Var, int i10, int i11, C4889m mVar, int i12) {
        g(z10, dVar, z11, h2Var, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
