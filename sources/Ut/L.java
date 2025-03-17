package ut;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import nI.q;
import s0.C5834E;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"", "isExpandedWidth", "Landroidx/compose/ui/d;", "modifier", "Ls0/E;", "contentPadding", "Lkotlin/Function1;", "LXH/N;", "content", "b", "(ZLandroidx/compose/ui/d;Ls0/E;LnI/q;LU0/m;II)V", "Lc2/h;", "a", "F", "itemMaxWidthDp", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class L {

    /* renamed from: a  reason: collision with root package name */
    private static final float f104186a = h.B((float) 328);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<h, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q<d, C4889m, Integer, C16807N> f104187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f104188b;

        a(q<? super d, ? super C4889m, ? super Integer, C16807N> qVar, float f10) {
            this.f104187a = qVar;
            this.f104188b = f10;
        }

        public final void a(float f10, C4889m mVar, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= mVar.c(f10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(760015428, i10, -1, "com.ingka.ikea.instore.impl.composables.InstoreCarousel.<anonymous> (InstoreCarousel.kt:43)");
                }
                this.f104187a.invoke(J.d(J.z(d.f18749a, h.B((float) 0), h.B(C17978n.h(f10, this.f104188b))), 0.0f, 1, (Object) null), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((h) obj).G(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(boolean r17, androidx.compose.ui.d r18, s0.C5834E r19, nI.q<? super androidx.compose.ui.d, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r20, U0.C4889m r21, int r22, int r23) {
        /*
            r1 = r17
            r4 = r20
            r5 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -557342987(0xffffffffdec79ef5, float:-7.1921018E18)
            r2 = r21
            U0.m r2 = r2.k(r0)
            r3 = r23 & 1
            r6 = 2
            if (r3 == 0) goto L_0x001c
            r3 = r5 | 6
            goto L_0x002c
        L_0x001c:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x002b
            boolean r3 = r2.b(r1)
            if (r3 == 0) goto L_0x0028
            r3 = 4
            goto L_0x0029
        L_0x0028:
            r3 = r6
        L_0x0029:
            r3 = r3 | r5
            goto L_0x002c
        L_0x002b:
            r3 = r5
        L_0x002c:
            r7 = r23 & 2
            if (r7 == 0) goto L_0x0035
            r3 = r3 | 48
        L_0x0032:
            r8 = r18
            goto L_0x0047
        L_0x0035:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0032
            r8 = r18
            boolean r9 = r2.V(r8)
            if (r9 == 0) goto L_0x0044
            r9 = 32
            goto L_0x0046
        L_0x0044:
            r9 = 16
        L_0x0046:
            r3 = r3 | r9
        L_0x0047:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0050
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r10 = r19
            goto L_0x0062
        L_0x0050:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004d
            r10 = r19
            boolean r11 = r2.V(r10)
            if (r11 == 0) goto L_0x005f
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r11
        L_0x0062:
            r11 = r23 & 8
            if (r11 == 0) goto L_0x0069
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0069:
            r11 = r5 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0079
            boolean r11 = r2.F(r4)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r11
        L_0x0079:
            r11 = r3 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x008d
            boolean r11 = r2.l()
            if (r11 != 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            r2.L()
            r15 = r8
            r3 = r10
            goto L_0x00fd
        L_0x008d:
            if (r7 == 0) goto L_0x0093
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x0094
        L_0x0093:
            r15 = r8
        L_0x0094:
            if (r9 == 0) goto L_0x00a6
            r7 = 24
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            r8 = 0
            r9 = 0
            s0.E r6 = androidx.compose.foundation.layout.D.c(r7, r8, r6, r9)
            r16 = r6
            goto L_0x00a8
        L_0x00a6:
            r16 = r10
        L_0x00a8:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00b4
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.instore.impl.composables.InstoreCarousel (InstoreCarousel.kt:36)"
            U0.C4895p.S(r0, r3, r6, r7)
        L_0x00b4:
            if (r1 == 0) goto L_0x00b9
            float r0 = f104186a
            goto L_0x00bf
        L_0x00b9:
            c2.h$a r0 = c2.h.f23031b
            float r0 = r0.c()
        L_0x00bf:
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            r7 = 12
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.foundation.layout.d$f r9 = r6.n(r7)
            ut.L$a r6 = new ut.L$a
            r6.<init>(r4, r0)
            r0 = 54
            r7 = 760015428(0x2d4cea44, float:1.1648075E-11)
            r8 = 1
            c1.a r11 = c1.c.e(r7, r8, r6, r2, r0)
            int r0 = r3 >> 3
            r0 = r0 & 14
            r6 = 199680(0x30c00, float:2.79811E-40)
            r0 = r0 | r6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r13 = r0 | r3
            r14 = 18
            r7 = 0
            r10 = 0
            r6 = r15
            r8 = r16
            r12 = r2
            ut.r0.b(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00fb
            U0.C4895p.R()
        L_0x00fb:
            r3 = r16
        L_0x00fd:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x0115
            ut.K r8 = new ut.K
            r0 = r8
            r1 = r17
            r2 = r15
            r4 = r20
            r5 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.L.b(boolean, androidx.compose.ui.d, s0.E, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(boolean z10, d dVar, C5834E e10, q qVar, int i10, int i11, C4889m mVar, int i12) {
        b(z10, dVar, e10, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
