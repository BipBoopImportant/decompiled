package jv;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/core/model/Image;", "image", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Lcom/ingka/ikea/core/model/Image;Landroidx/compose/ui/d;LU0/m;II)V", "liveshopping-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jv.m  reason: case insensitive filesystem */
public final class C11493m {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.ingka.ikea.core.model.Image r22, androidx.compose.ui.d r23, U0.C4889m r24, int r25, int r26) {
        /*
            r0 = r22
            r1 = r25
            r2 = r26
            java.lang.String r3 = "image"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = -738560103(0xffffffffd3fa7799, float:-2.15149668E12)
            r4 = r24
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x002b
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = r5
        L_0x0029:
            r4 = r4 | r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0035
            r4 = r4 | 48
        L_0x0032:
            r7 = r23
            goto L_0x0047
        L_0x0035:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x0032
            r7 = r23
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x0044
            r8 = 32
            goto L_0x0046
        L_0x0044:
            r8 = 16
        L_0x0046:
            r4 = r4 | r8
        L_0x0047:
            r8 = r4 & 19
            r9 = 18
            if (r8 != r9) goto L_0x005b
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            r15.L()
            r3 = r7
            r21 = r15
            goto L_0x00b2
        L_0x005b:
            if (r6 == 0) goto L_0x0061
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r14 = r6
            goto L_0x0062
        L_0x0061:
            r14 = r7
        L_0x0062:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x006e
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.liveshopping.impl.presentation.compose.EventImage (EventImage.kt:20)"
            U0.C4895p.S(r3, r4, r6, r7)
        L_0x006e:
            java.lang.String r4 = r22.getUrl()
            java.lang.String r3 = r22.A0()
            LC.b$a r7 = LC.C13178b.a.f111818a
            r6 = 0
            r8 = 0
            r9 = 1068149419(0x3faaaaab, float:1.3333334)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.C5074e.b(r14, r9, r6, r5, r8)
            E1.k$a r5 = E1.C4478k.f5915a
            E1.k r9 = r5.a()
            int r5 = LC.C13178b.a.f111819b
            int r5 = r5 << 9
            r8 = 196608(0x30000, float:2.75506E-40)
            r17 = r5 | r8
            r18 = 0
            r19 = 4048(0xfd0, float:5.672E-42)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r20 = 0
            r5 = r3
            r3 = r14
            r14 = r16
            r21 = r15
            r15 = r20
            r16 = r21
            LC.h.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00b2
            U0.C4895p.R()
        L_0x00b2:
            U0.Y0 r4 = r21.n()
            if (r4 == 0) goto L_0x00c0
            jv.l r5 = new jv.l
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.C11493m.b(com.ingka.ikea.core.model.Image, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(Image image, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(image, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
