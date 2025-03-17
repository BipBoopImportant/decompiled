package I0;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "color", "Lc2/h;", "thickness", "startIndent", "LXH/N;", "a", "(Landroidx/compose/ui/d;JFFLU0/m;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class B {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f7131c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7132d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f7133e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f7134f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f7135g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f7136h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, long j10, float f10, float f11, int i10, int i11) {
            super(2);
            this.f7131c = dVar;
            this.f7132d = j10;
            this.f7133e = f10;
            this.f7134f = f11;
            this.f7135g = i10;
            this.f7136h = i11;
        }

        public final void a(C4889m mVar, int i10) {
            B.a(this.f7131c, this.f7132d, this.f7133e, this.f7134f, mVar, M0.a(this.f7135g | 1), this.f7136h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.d r23, long r24, float r26, float r27, U0.C4889m r28, int r29, int r30) {
        /*
            r6 = r29
            r0 = -1249392198(0xffffffffb587c9ba, float:-1.0116994E-6)
            r1 = r28
            U0.m r1 = r1.k(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0015
            r3 = r6 | 6
            r4 = r3
            r3 = r23
            goto L_0x0029
        L_0x0015:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0026
            r3 = r23
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r6
            goto L_0x0029
        L_0x0026:
            r3 = r23
            r4 = r6
        L_0x0029:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x0040
            r5 = r30 & 2
            r7 = r24
            if (r5 != 0) goto L_0x003c
            boolean r5 = r1.e(r7)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r4 = r4 | r5
            goto L_0x0042
        L_0x0040:
            r7 = r24
        L_0x0042:
            r5 = r30 & 4
            if (r5 == 0) goto L_0x004b
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r9 = r26
            goto L_0x005d
        L_0x004b:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0048
            r9 = r26
            boolean r10 = r1.c(r9)
            if (r10 == 0) goto L_0x005a
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r4 = r4 | r10
        L_0x005d:
            r10 = r30 & 8
            if (r10 == 0) goto L_0x0066
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0063:
            r11 = r27
            goto L_0x0078
        L_0x0066:
            r11 = r6 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0063
            r11 = r27
            boolean r12 = r1.c(r11)
            if (r12 == 0) goto L_0x0075
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r4 = r4 | r12
        L_0x0078:
            r12 = r4 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            if (r12 != r13) goto L_0x008d
            boolean r12 = r1.l()
            if (r12 != 0) goto L_0x0085
            goto L_0x008d
        L_0x0085:
            r1.L()
            r2 = r3
        L_0x0089:
            r4 = r9
            r5 = r11
            goto L_0x0169
        L_0x008d:
            r1.G()
            r12 = r6 & 1
            r13 = 0
            r14 = 1
            if (r12 == 0) goto L_0x00a8
            boolean r12 = r1.O()
            if (r12 == 0) goto L_0x009d
            goto L_0x00a8
        L_0x009d:
            r1.L()
            r2 = r30 & 2
            if (r2 == 0) goto L_0x00a6
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a6:
            r2 = r3
            goto L_0x00e0
        L_0x00a8:
            if (r2 == 0) goto L_0x00ad
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00ae
        L_0x00ad:
            r2 = r3
        L_0x00ae:
            r3 = r30 & 2
            if (r3 == 0) goto L_0x00d0
            I0.d0 r3 = I0.C4553d0.f7988a
            r7 = 6
            I0.l r3 = r3.a(r1, r7)
            long r15 = r3.i()
            r21 = 14
            r22 = 0
            r17 = 1039516303(0x3df5c28f, float:0.12)
            r18 = 0
            r19 = 0
            r20 = 0
            long r7 = p1.C5747v0.o(r15, r17, r18, r19, r20, r21, r22)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00d0:
            if (r5 == 0) goto L_0x00d8
            float r3 = (float) r14
            float r3 = c2.h.B(r3)
            r9 = r3
        L_0x00d8:
            if (r10 == 0) goto L_0x00e0
            float r3 = (float) r13
            float r3 = c2.h.B(r3)
            r11 = r3
        L_0x00e0:
            r1.y()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00ef
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.Divider (Divider.kt:48)"
            U0.C4895p.S(r0, r4, r3, r5)
        L_0x00ef:
            r0 = 0
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00f7
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0109
        L_0x00f7:
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            r20 = 14
            r21 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r11
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r15, r16, r17, r18, r19, r20, r21)
        L_0x0109:
            c2.h$a r4 = c2.h.f23031b
            float r4 = r4.a()
            boolean r4 = c2.h.D(r9, r4)
            if (r4 == 0) goto L_0x0134
            r4 = -129374855(0xfffffffff849e579, float:-1.637978E34)
            r1.W(r4)
            U0.I0 r4 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r4 = r1.Q(r4)
            c2.d r4 = (c2.d) r4
            float r4 = r4.getDensity()
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 / r4
            float r4 = c2.h.B(r5)
            r1.P()
            goto L_0x013e
        L_0x0134:
            r4 = -129316234(0xfffffffff84aca76, float:-1.645235E34)
            r1.W(r4)
            r1.P()
            r4 = r9
        L_0x013e:
            androidx.compose.ui.d r3 = r2.s(r3)
            r5 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r3, r0, r14, r5)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r4)
            r3 = 2
            r4 = 0
            r23 = r0
            r24 = r7
            r26 = r5
            r27 = r3
            r28 = r4
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r23, r24, r26, r27, r28)
            androidx.compose.foundation.layout.C5077h.a(r0, r1, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0089
            U0.C4895p.R()
            goto L_0x0089
        L_0x0169:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x017e
            I0.B$a r10 = new I0.B$a
            r0 = r10
            r1 = r2
            r2 = r7
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r9.a(r10)
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.B.a(androidx.compose.ui.d, long, float, float, U0.m, int, int):void");
    }
}
