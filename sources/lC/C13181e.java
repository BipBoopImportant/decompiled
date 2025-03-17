package LC;

import SC.H2;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLC/e;", "", "<init>", "()V", "", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "iconTint", "LXH/N;", "c", "(Ljava/lang/String;Landroidx/compose/ui/d;JLU0/m;II)V", "e", "(Landroidx/compose/ui/d;LU0/m;II)V", "image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: LC.e  reason: case insensitive filesystem */
public final class C13181e {

    /* renamed from: a  reason: collision with root package name */
    public static final C13181e f111832a = new C13181e();

    /* renamed from: b  reason: collision with root package name */
    public static final int f111833b = 0;

    private C13181e() {
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C13181e eVar, String str, d dVar, long j10, int i10, int i11, C4889m mVar, int i12) {
        eVar.c(str, dVar, j10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C13181e eVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        eVar.e(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r20, androidx.compose.ui.d r21, long r22, U0.C4889m r24, int r25, int r26) {
        /*
            r19 = this;
            r6 = r25
            r0 = -1211967681(0xffffffffb7c2d73f, float:-2.3226834E-5)
            r1 = r24
            U0.m r1 = r1.k(r0)
            r2 = r26 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r6 | 6
            r3 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r6 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r3 = r6
        L_0x0029:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r5 = r21
            goto L_0x0044
        L_0x0032:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x002f
            r5 = r21
            boolean r7 = r1.V(r5)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r3 = r3 | r7
        L_0x0044:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005d
            r7 = r26 & 4
            if (r7 != 0) goto L_0x0057
            r7 = r22
            boolean r9 = r1.e(r7)
            if (r9 == 0) goto L_0x0059
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0057:
            r7 = r22
        L_0x0059:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r9
            goto L_0x005f
        L_0x005d:
            r7 = r22
        L_0x005f:
            r9 = r3 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x0073
            boolean r9 = r1.l()
            if (r9 != 0) goto L_0x006c
            goto L_0x0073
        L_0x006c:
            r1.L()
            r3 = r5
            r4 = r7
            goto L_0x00e5
        L_0x0073:
            r1.G()
            r9 = r6 & 1
            if (r9 == 0) goto L_0x008e
            boolean r9 = r1.O()
            if (r9 == 0) goto L_0x0081
            goto L_0x008e
        L_0x0081:
            r1.L()
            r4 = r26 & 4
            if (r4 == 0) goto L_0x008a
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x008a:
            r4 = r5
        L_0x008b:
            r17 = r7
            goto L_0x00a7
        L_0x008e:
            if (r4 == 0) goto L_0x0093
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x0094
        L_0x0093:
            r4 = r5
        L_0x0094:
            r5 = r26 & 4
            if (r5 == 0) goto L_0x008b
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r1, r7)
            long r7 = r5.J0()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x008b
        L_0x00a7:
            r1.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00b6
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.ui.image.ImageWithLoadingDefaults.ImageLoadingErrorState (ImageWithLoading.kt:213)"
            U0.C4895p.S(r0, r3, r5, r7)
        L_0x00b6:
            int r0 = uK.C18146a.f148160N5
            r5 = 0
            t1.c r0 = J1.e.c(r0, r1, r5)
            p1.w0$a r7 = p1.C5749w0.f27365b
            r11 = 2
            r12 = 0
            r10 = 0
            r8 = r17
            p1.w0 r13 = p1.C5749w0.a.b(r7, r8, r10, r11, r12)
            int r3 = r3 << 3
            r15 = r3 & 1008(0x3f0, float:1.413E-42)
            r16 = 56
            r10 = 0
            r11 = 0
            r12 = 0
            r7 = r0
            r8 = r20
            r9 = r4
            r14 = r1
            n0.C5583F.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00e2
            U0.C4895p.R()
        L_0x00e2:
            r3 = r4
            r4 = r17
        L_0x00e5:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x00fc
            LC.d r9 = new LC.d
            r0 = r9
            r1 = r19
            r2 = r20
            r6 = r25
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.a(r9)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: LC.C13181e.c(java.lang.String, androidx.compose.ui.d, long, U0.m, int, int):void");
    }

    public final void e(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-1906665733);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1906665733, i12, -1, "com.ingka.ikea.ui.image.ImageWithLoadingDefaults.ImageLoadingState (ImageWithLoading.kt:228)");
            }
            H2.b(dVar, false, k10, i12 & 14, 2);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13179c(this, dVar, i10, i11));
        }
    }
}
