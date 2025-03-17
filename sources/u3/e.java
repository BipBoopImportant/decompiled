package u3;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kb.C9967v;
import mb.C10030a;
import q3.A;
import q3.C5798i;
import q3.C5807s;
import t3.C5950a;
import t3.C5954e;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f30076a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f30077b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f30078c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f30079d = new int[10];

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f30080a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30081b;

        public a(int i10, int i11) {
            this.f30080a = i10;
            this.f30081b = i11;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f30082a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30083b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30084c;

        public b(int i10, int i11, int i12) {
            this.f30082a = i10;
            this.f30083b = i11;
            this.f30084c = i12;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f30085a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30086b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30087c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30088d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f30089e;

        /* renamed from: f  reason: collision with root package name */
        public final int f30090f;

        public c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
            this.f30085a = i10;
            this.f30086b = z10;
            this.f30087c = i11;
            this.f30088d = i12;
            this.f30089e = iArr;
            this.f30090f = i13;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final C9967v<c> f30091a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f30092b;

        public d(List<c> list, int[] iArr) {
            this.f30091a = C9967v.A(list);
            this.f30092b = iArr;
        }
    }

    /* renamed from: u3.e$e  reason: collision with other inner class name */
    public static final class C0472e {

        /* renamed from: a  reason: collision with root package name */
        public final int f30093a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30094b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30095c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30096d;

        /* renamed from: e  reason: collision with root package name */
        public final int f30097e;

        public C0472e(int i10, int i11, int i12, int i13, int i14) {
            this.f30093a = i10;
            this.f30094b = i11;
            this.f30095c = i12;
            this.f30096d = i13;
            this.f30097e = i14;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final C9967v<C0472e> f30098a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f30099b;

        public f(List<C0472e> list, int[] iArr) {
            this.f30098a = C9967v.A(list);
            this.f30099b = iArr;
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f30100a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30101b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30102c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30103d;

        /* renamed from: e  reason: collision with root package name */
        public final int f30104e;

        /* renamed from: f  reason: collision with root package name */
        public final int f30105f;

        /* renamed from: g  reason: collision with root package name */
        public final int f30106g;

        /* renamed from: h  reason: collision with root package name */
        public final int f30107h;

        /* renamed from: i  reason: collision with root package name */
        public final int f30108i;

        public g(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f30100a = i10;
            this.f30101b = i11;
            this.f30102c = i12;
            this.f30103d = i13;
            this.f30104e = i14;
            this.f30105f = i15;
            this.f30106g = i16;
            this.f30107h = i17;
            this.f30108i = i18;
        }
    }

    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final b f30109a;

        /* renamed from: b  reason: collision with root package name */
        public final c f30110b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30111c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30112d;

        /* renamed from: e  reason: collision with root package name */
        public final int f30113e;

        /* renamed from: f  reason: collision with root package name */
        public final int f30114f;

        /* renamed from: g  reason: collision with root package name */
        public final int f30115g;

        /* renamed from: h  reason: collision with root package name */
        public final int f30116h;

        /* renamed from: i  reason: collision with root package name */
        public final float f30117i;

        /* renamed from: j  reason: collision with root package name */
        public final int f30118j;

        /* renamed from: k  reason: collision with root package name */
        public final int f30119k;

        /* renamed from: l  reason: collision with root package name */
        public final int f30120l;

        /* renamed from: m  reason: collision with root package name */
        public final int f30121m;

        public h(b bVar, c cVar, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16, int i17, int i18, int i19) {
            this.f30109a = bVar;
            this.f30110b = cVar;
            this.f30111c = i10;
            this.f30112d = i11;
            this.f30113e = i12;
            this.f30114f = i13;
            this.f30115g = i14;
            this.f30116h = i15;
            this.f30117i = f10;
            this.f30118j = i16;
            this.f30119k = i17;
            this.f30120l = i18;
            this.f30121m = i19;
        }
    }

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final int f30122a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30123b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30124c;

        public i(int i10, int i11, int i12) {
            this.f30122a = i10;
            this.f30123b = i11;
            this.f30124c = i12;
        }
    }

    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        public final C9967v<i> f30125a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f30126b;

        public j(List<i> list, int[] iArr) {
            this.f30125a = C9967v.A(list);
            this.f30126b = iArr;
        }
    }

    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        public final b f30127a;

        /* renamed from: b  reason: collision with root package name */
        public final C9967v<a> f30128b;

        /* renamed from: c  reason: collision with root package name */
        public final d f30129c;

        /* renamed from: d  reason: collision with root package name */
        public final f f30130d;

        /* renamed from: e  reason: collision with root package name */
        public final j f30131e;

        public k(b bVar, List<a> list, d dVar, f fVar, j jVar) {
            this.f30127a = bVar;
            this.f30128b = list != null ? C9967v.A(list) : C9967v.E();
            this.f30129c = dVar;
            this.f30130d = fVar;
            this.f30131e = jVar;
        }
    }

    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        public final int f30132a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30133b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f30134c;

        public l(int i10, int i11, boolean z10) {
            this.f30132a = i10;
            this.f30133b = i11;
            this.f30134c = z10;
        }
    }

    public static final class m {

        /* renamed from: a  reason: collision with root package name */
        public final int f30135a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30136b;

        /* renamed from: c  reason: collision with root package name */
        public final int f30137c;

        /* renamed from: d  reason: collision with root package name */
        public final int f30138d;

        /* renamed from: e  reason: collision with root package name */
        public final int f30139e;

        /* renamed from: f  reason: collision with root package name */
        public final int f30140f;

        /* renamed from: g  reason: collision with root package name */
        public final int f30141g;

        /* renamed from: h  reason: collision with root package name */
        public final float f30142h;

        /* renamed from: i  reason: collision with root package name */
        public final int f30143i;

        /* renamed from: j  reason: collision with root package name */
        public final int f30144j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f30145k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f30146l;

        /* renamed from: m  reason: collision with root package name */
        public final int f30147m;

        /* renamed from: n  reason: collision with root package name */
        public final int f30148n;

        /* renamed from: o  reason: collision with root package name */
        public final int f30149o;

        /* renamed from: p  reason: collision with root package name */
        public final boolean f30150p;

        /* renamed from: q  reason: collision with root package name */
        public final int f30151q;

        /* renamed from: r  reason: collision with root package name */
        public final int f30152r;

        /* renamed from: s  reason: collision with root package name */
        public final int f30153s;

        /* renamed from: t  reason: collision with root package name */
        public final int f30154t;

        public m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, int i17, int i18, boolean z10, boolean z11, int i19, int i20, int i21, boolean z12, int i22, int i23, int i24, int i25) {
            this.f30135a = i10;
            this.f30136b = i11;
            this.f30137c = i12;
            this.f30138d = i13;
            this.f30139e = i14;
            this.f30140f = i15;
            this.f30141g = i16;
            this.f30142h = f10;
            this.f30143i = i17;
            this.f30144j = i18;
            this.f30145k = z10;
            this.f30146l = z11;
            this.f30147m = i19;
            this.f30148n = i20;
            this.f30149o = i21;
            this.f30150p = z12;
            this.f30151q = i22;
            this.f30152r = i23;
            this.f30153s = i24;
            this.f30154t = i25;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static u3.e.m A(byte[] r32, int r33, int r34) {
        /*
            u3.f r0 = new u3.f
            r1 = r32
            r2 = r33
            r3 = r34
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r3 = r0.f(r1)
            int r4 = r0.f(r1)
            int r5 = r0.f(r1)
            int r6 = r0.i()
            r2 = 86
            r7 = 44
            r8 = 244(0xf4, float:3.42E-43)
            r9 = 122(0x7a, float:1.71E-43)
            r10 = 110(0x6e, float:1.54E-43)
            r11 = 3
            r12 = 16
            r13 = 1
            r15 = 100
            if (r3 == r15) goto L_0x0052
            if (r3 == r10) goto L_0x0052
            if (r3 == r9) goto L_0x0052
            if (r3 == r8) goto L_0x0052
            if (r3 == r7) goto L_0x0052
            r14 = 83
            if (r3 == r14) goto L_0x0052
            if (r3 == r2) goto L_0x0052
            r14 = 118(0x76, float:1.65E-43)
            if (r3 == r14) goto L_0x0052
            r14 = 128(0x80, float:1.794E-43)
            if (r3 == r14) goto L_0x0052
            r14 = 138(0x8a, float:1.93E-43)
            if (r3 != r14) goto L_0x004a
            goto L_0x0052
        L_0x004a:
            r14 = r13
            r16 = 0
            r17 = 0
            r18 = 0
            goto L_0x008f
        L_0x0052:
            int r14 = r0.i()
            if (r14 != r11) goto L_0x005d
            boolean r16 = r0.e()
            goto L_0x005f
        L_0x005d:
            r16 = 0
        L_0x005f:
            int r17 = r0.i()
            int r18 = r0.i()
            r0.l()
            boolean r19 = r0.e()
            if (r19 == 0) goto L_0x008f
            if (r14 == r11) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            r19 = 12
            r1 = r19
        L_0x0077:
            r8 = 0
        L_0x0078:
            if (r8 >= r1) goto L_0x008f
            boolean r19 = r0.e()
            if (r19 == 0) goto L_0x008a
            r9 = 6
            if (r8 >= r9) goto L_0x0085
            r9 = r12
            goto L_0x0087
        L_0x0085:
            r9 = 64
        L_0x0087:
            G(r0, r9)
        L_0x008a:
            int r8 = r8 + 1
            r9 = 122(0x7a, float:1.71E-43)
            goto L_0x0078
        L_0x008f:
            int r1 = r0.i()
            int r1 = r1 + 4
            int r9 = r0.i()
            if (r9 != 0) goto L_0x00a8
            int r8 = r0.i()
            int r8 = r8 + 4
            r21 = r3
            r24 = r8
        L_0x00a5:
            r25 = 0
            goto L_0x00d3
        L_0x00a8:
            if (r9 != r13) goto L_0x00ce
            boolean r8 = r0.e()
            r0.h()
            r0.h()
            int r10 = r0.i()
            r21 = r3
            long r2 = (long) r10
            r24 = r8
            r10 = 0
        L_0x00be:
            long r7 = (long) r10
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x00c9
            r0.i()
            int r10 = r10 + 1
            goto L_0x00be
        L_0x00c9:
            r25 = r24
            r24 = 0
            goto L_0x00d3
        L_0x00ce:
            r21 = r3
            r24 = 0
            goto L_0x00a5
        L_0x00d3:
            int r7 = r0.i()
            r0.l()
            int r2 = r0.i()
            int r2 = r2 + r13
            int r3 = r0.i()
            int r3 = r3 + r13
            boolean r26 = r0.e()
            int r8 = 2 - r26
            int r8 = r8 * r3
            if (r26 != 0) goto L_0x00f0
            r0.l()
        L_0x00f0:
            r0.l()
            int r2 = r2 * r12
            int r8 = r8 * r12
            boolean r3 = r0.e()
            if (r3 == 0) goto L_0x012d
            int r3 = r0.i()
            int r27 = r0.i()
            int r28 = r0.i()
            int r29 = r0.i()
            if (r14 != 0) goto L_0x0112
            int r14 = 2 - r26
            r30 = r13
            goto L_0x0122
        L_0x0112:
            if (r14 != r11) goto L_0x0117
            r30 = r13
            goto L_0x0119
        L_0x0117:
            r30 = 2
        L_0x0119:
            if (r14 != r13) goto L_0x011d
            r14 = 2
            goto L_0x011e
        L_0x011d:
            r14 = r13
        L_0x011e:
            int r31 = 2 - r26
            int r14 = r14 * r31
        L_0x0122:
            int r3 = r3 + r27
            int r3 = r3 * r30
            int r2 = r2 - r3
            int r28 = r28 + r29
            int r28 = r28 * r14
            int r8 = r8 - r28
        L_0x012d:
            r14 = r8
            r3 = r21
            r8 = r2
            r2 = 44
            if (r3 == r2) goto L_0x0147
            r2 = 86
            if (r3 == r2) goto L_0x0147
            if (r3 == r15) goto L_0x0147
            r2 = 110(0x6e, float:1.54E-43)
            if (r3 == r2) goto L_0x0147
            r2 = 122(0x7a, float:1.71E-43)
            if (r3 == r2) goto L_0x0147
            r2 = 244(0xf4, float:3.42E-43)
            if (r3 != r2) goto L_0x014d
        L_0x0147:
            r2 = r4 & 16
            if (r2 == 0) goto L_0x014d
            r2 = 0
            goto L_0x014e
        L_0x014d:
            r2 = r12
        L_0x014e:
            boolean r15 = r0.e()
            r19 = -1
            r20 = 1065353216(0x3f800000, float:1.0)
            if (r15 == 0) goto L_0x022b
            boolean r15 = r0.e()
            if (r15 == 0) goto L_0x0197
            r15 = 8
            int r10 = r0.f(r15)
            r15 = 255(0xff, float:3.57E-43)
            if (r10 != r15) goto L_0x0179
            int r10 = r0.f(r12)
            int r12 = r0.f(r12)
            if (r10 == 0) goto L_0x0197
            if (r12 == 0) goto L_0x0197
            float r10 = (float) r10
            float r12 = (float) r12
            float r20 = r10 / r12
            goto L_0x0197
        L_0x0179:
            float[] r12 = f30077b
            int r15 = r12.length
            if (r10 >= r15) goto L_0x0181
            r20 = r12[r10]
            goto L_0x0197
        L_0x0181:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "Unexpected aspect_ratio_idc value: "
            r12.append(r15)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            java.lang.String r12 = "NalUnitUtil"
            t3.q.h(r12, r10)
        L_0x0197:
            boolean r10 = r0.e()
            if (r10 == 0) goto L_0x01a0
            r0.l()
        L_0x01a0:
            boolean r10 = r0.e()
            if (r10 == 0) goto L_0x01d0
            r0.m(r11)
            boolean r10 = r0.e()
            if (r10 == 0) goto L_0x01b0
            goto L_0x01b1
        L_0x01b0:
            r13 = 2
        L_0x01b1:
            boolean r10 = r0.e()
            if (r10 == 0) goto L_0x01cd
            r10 = 8
            int r11 = r0.f(r10)
            int r12 = r0.f(r10)
            r0.m(r10)
            int r19 = q3.C5798i.j(r11)
            int r10 = q3.C5798i.k(r12)
            goto L_0x01d3
        L_0x01cd:
            r10 = r19
            goto L_0x01d3
        L_0x01d0:
            r10 = r19
            r13 = r10
        L_0x01d3:
            boolean r11 = r0.e()
            if (r11 == 0) goto L_0x01df
            r0.i()
            r0.i()
        L_0x01df:
            boolean r11 = r0.e()
            if (r11 == 0) goto L_0x01ea
            r11 = 65
            r0.m(r11)
        L_0x01ea:
            boolean r11 = r0.e()
            if (r11 == 0) goto L_0x01f3
            F(r0)
        L_0x01f3:
            boolean r12 = r0.e()
            if (r12 == 0) goto L_0x01fc
            F(r0)
        L_0x01fc:
            if (r11 != 0) goto L_0x0200
            if (r12 == 0) goto L_0x0203
        L_0x0200:
            r0.l()
        L_0x0203:
            r0.l()
            boolean r11 = r0.e()
            if (r11 == 0) goto L_0x0222
            r0.l()
            r0.i()
            r0.i()
            r0.i()
            r0.i()
            int r2 = r0.i()
            r0.i()
        L_0x0222:
            r22 = r2
            r21 = r10
            r10 = r20
            r20 = r13
            goto L_0x0233
        L_0x022b:
            r22 = r2
            r21 = r19
            r10 = r20
            r20 = r21
        L_0x0233:
            u3.e$m r0 = new u3.e$m
            r2 = r0
            r23 = r9
            r9 = r14
            r11 = r17
            r12 = r18
            r13 = r16
            r14 = r26
            r15 = r1
            r16 = r23
            r17 = r24
            r18 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.e.A(byte[], int, int):u3.e$m");
    }

    private static void B(f fVar, int i10, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i11 = 1; i11 < i10; i11++) {
            boolean e10 = fVar.e();
            int i12 = 0;
            while (i12 < iArr[i11]) {
                if ((i12 <= 0 || !e10) ? i12 == 0 : fVar.e()) {
                    for (int i13 = 0; i13 < iArr2[i11]; i13++) {
                        if (zArr[i11][i13]) {
                            fVar.i();
                        }
                    }
                    fVar.i();
                    fVar.i();
                }
                i12++;
            }
        }
    }

    private static void C(f fVar, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (z10) {
            z11 = fVar.e();
            z13 = fVar.e();
            if (z11 || z13) {
                z12 = fVar.e();
                if (z12) {
                    fVar.m(19);
                }
                fVar.m(8);
                if (z12) {
                    fVar.m(4);
                }
                fVar.m(15);
            } else {
                z12 = false;
            }
        } else {
            z11 = false;
            z13 = false;
            z12 = false;
        }
        for (int i11 = 0; i11 <= i10; i11++) {
            boolean e10 = fVar.e();
            if (!e10) {
                e10 = fVar.e();
            }
            if (e10) {
                fVar.i();
                z14 = false;
            } else {
                z14 = fVar.e();
            }
            int i12 = !z14 ? fVar.i() : 0;
            int i13 = (z11 ? 1 : 0) + (z13 ? 1 : 0);
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= i12; i15++) {
                    fVar.i();
                    fVar.i();
                    if (z12) {
                        fVar.i();
                        fVar.i();
                    }
                    fVar.l();
                }
            }
        }
    }

    private static void D(f fVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!fVar.e()) {
                    fVar.i();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        fVar.h();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        fVar.h();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void E(f fVar) {
        int i10 = fVar.i();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i13 == 0 || !fVar.e()) {
                int i14 = fVar.i();
                int i15 = fVar.i();
                int[] iArr3 = new int[i14];
                int i16 = 0;
                while (i16 < i14) {
                    iArr3[i16] = (i16 > 0 ? iArr3[i16 - 1] : 0) - (fVar.i() + 1);
                    fVar.l();
                    i16++;
                }
                int[] iArr4 = new int[i15];
                int i17 = 0;
                while (i17 < i15) {
                    iArr4[i17] = (i17 > 0 ? iArr4[i17 - 1] : 0) + fVar.i() + 1;
                    fVar.l();
                    i17++;
                }
                int[] iArr5 = iArr3;
                i11 = i14;
                iArr = iArr5;
                int[] iArr6 = iArr4;
                i12 = i15;
                iArr2 = iArr6;
            } else {
                int i18 = i11 + i12;
                int i19 = (1 - ((fVar.e() ? 1 : 0) * true)) * (fVar.i() + 1);
                int i20 = i18 + 1;
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 <= i18; i21++) {
                    if (!fVar.e()) {
                        zArr[i21] = fVar.e();
                    } else {
                        zArr[i21] = true;
                    }
                }
                int[] iArr7 = new int[i20];
                int[] iArr8 = new int[i20];
                int i22 = 0;
                for (int i23 = i12 - 1; i23 >= 0; i23--) {
                    int i24 = iArr2[i23] + i19;
                    if (i24 < 0 && zArr[i11 + i23]) {
                        iArr7[i22] = i24;
                        i22++;
                    }
                }
                if (i19 < 0 && zArr[i18]) {
                    iArr7[i22] = i19;
                    i22++;
                }
                for (int i25 = 0; i25 < i11; i25++) {
                    int i26 = iArr[i25] + i19;
                    if (i26 < 0 && zArr[i25]) {
                        iArr7[i22] = i26;
                        i22++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr7, i22);
                int i27 = 0;
                for (int i28 = i11 - 1; i28 >= 0; i28--) {
                    int i29 = iArr[i28] + i19;
                    if (i29 > 0 && zArr[i28]) {
                        iArr8[i27] = i29;
                        i27++;
                    }
                }
                if (i19 > 0 && zArr[i18]) {
                    iArr8[i27] = i19;
                    i27++;
                }
                for (int i30 = 0; i30 < i12; i30++) {
                    int i31 = iArr2[i30] + i19;
                    if (i31 > 0 && zArr[i11 + i30]) {
                        iArr8[i27] = i31;
                        i27++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr8, i27);
                iArr = copyOf;
                i11 = i22;
                i12 = i27;
            }
        }
    }

    private static void F(f fVar) {
        int i10 = fVar.i() + 1;
        fVar.m(8);
        for (int i11 = 0; i11 < i10; i11++) {
            fVar.i();
            fVar.i();
            fVar.l();
        }
        fVar.m(20);
    }

    private static void G(f fVar, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((fVar.h() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    private static void H(f fVar, int i10, boolean[][] zArr) {
        int i11 = fVar.i() + 2;
        if (fVar.e()) {
            fVar.m(i11);
        } else {
            for (int i12 = 1; i12 < i10; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        fVar.m(i11);
                    }
                }
            }
        }
        int i14 = fVar.i();
        for (int i15 = 1; i15 <= i14; i15++) {
            fVar.m(8);
        }
    }

    public static int I(byte[] bArr, int i10) {
        int i11;
        synchronized (f30078c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = g(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f30079d;
                        if (iArr.length <= i13) {
                            f30079d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f30079d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } finally {
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f30079d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    private static int a(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 == 1) {
            i14 = 2;
        }
        return i10 - (i14 * (i12 + i13));
    }

    private static int b(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (!(i11 == 1 || i11 == 2)) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    public static void c(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String d(f fVar) {
        fVar.m(4);
        int f10 = fVar.f(3);
        fVar.l();
        c n10 = n(fVar, true, f10, (c) null);
        return C5954e.f(n10.f30085a, n10.f30086b, n10.f30087c, n10.f30088d, n10.f30089e, n10.f30090f);
    }

    public static int e(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        boolean z10 = false;
        C5950a.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            c(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            c(zArr);
            return i10 - 2;
        } else if (i12 <= 2 || !zArr[2] || bArr[i10] != 0 || bArr[i10 + 1] != 1) {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        c(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            zArr[0] = i12 <= 2 ? !(i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !(zArr[2] && bArr[i11 + -2] == 0 && bArr[i13] == 1)) : bArr[i11 + -3] == 0 && bArr[i11 + -2] == 0 && bArr[i13] == 1;
            zArr[1] = i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : bArr[i11 + -2] == 0 && bArr[i13] == 0;
            if (bArr[i13] == 0) {
                z10 = true;
            }
            zArr[2] = z10;
            return i11;
        } else {
            c(zArr);
            return i10 - 1;
        }
    }

    private static C9967v<Integer> f(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        C9967v.a t10 = C9967v.t();
        int i10 = 0;
        while (i10 < bArr.length) {
            int e10 = e(bArr, i10, bArr.length, zArr);
            if (e10 != bArr.length) {
                t10.a(Integer.valueOf(e10));
            }
            i10 = e10 + 3;
        }
        return t10.k();
    }

    private static int g(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String h(List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                C9967v<Integer> f10 = f(bArr);
                for (int i11 = 0; i11 < f10.size(); i11++) {
                    if (f10.get(i11).intValue() + 3 < length) {
                        f fVar = new f(bArr, f10.get(i11).intValue() + 3, length);
                        b m10 = m(fVar);
                        if (m10.f30082a == 33 && m10.f30083b == 0) {
                            return d(fVar);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static int i(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int j(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean k(byte b10) {
        if (((b10 & 96) >> 5) != 0) {
            return true;
        }
        byte b11 = b10 & 31;
        return (b11 == 1 || b11 == 9 || b11 == 14) ? false : true;
    }

    public static boolean l(C5807s sVar, byte b10) {
        if ((Objects.equals(sVar.f28244o, "video/avc") || A.b(sVar.f28240k, "video/avc")) && (b10 & 31) == 6) {
            return true;
        }
        return (Objects.equals(sVar.f28244o, "video/hevc") || A.b(sVar.f28240k, "video/hevc")) && ((b10 & 126) >> 1) == 39;
    }

    private static b m(f fVar) {
        fVar.l();
        return new b(fVar.f(6), fVar.f(6), fVar.f(3) - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static u3.e.c n(u3.f r19, boolean r20, int r21, u3.e.c r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L_0x0042
            int r2 = r0.f(r5)
            boolean r8 = r19.e()
            r9 = 5
            int r9 = r0.f(r9)
            r10 = r7
            r11 = r10
        L_0x001e:
            r12 = 32
            if (r10 >= r12) goto L_0x002e
            boolean r12 = r19.e()
            if (r12 == 0) goto L_0x002b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L_0x002b:
            int r10 = r10 + 1
            goto L_0x001e
        L_0x002e:
            r10 = r7
        L_0x002f:
            if (r10 >= r3) goto L_0x003a
            int r12 = r0.f(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L_0x002f
        L_0x003a:
            r13 = r2
        L_0x003b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L_0x0057
        L_0x0042:
            if (r2 == 0) goto L_0x0050
            int r3 = r2.f30085a
            boolean r8 = r2.f30086b
            int r9 = r2.f30087c
            int r11 = r2.f30088d
            int[] r4 = r2.f30089e
            r13 = r3
            goto L_0x003b
        L_0x0050:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L_0x0057:
            int r18 = r0.f(r6)
            r2 = r7
        L_0x005c:
            if (r7 >= r1) goto L_0x0071
            boolean r3 = r19.e()
            if (r3 == 0) goto L_0x0066
            int r2 = r2 + 88
        L_0x0066:
            boolean r3 = r19.e()
            if (r3 == 0) goto L_0x006e
            int r2 = r2 + 8
        L_0x006e:
            int r7 = r7 + 1
            goto L_0x005c
        L_0x0071:
            r0.m(r2)
            if (r1 <= 0) goto L_0x007b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.m(r6)
        L_0x007b:
            u3.e$c r0 = new u3.e$c
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.e.n(u3.f, boolean, int, u3.e$c):u3.e$c");
    }

    private static C0472e o(f fVar) {
        int i10;
        int i11;
        int i12;
        int f10 = fVar.f(16);
        int f11 = fVar.f(16);
        if (fVar.e()) {
            int f12 = fVar.f(2);
            if (f12 == 3) {
                fVar.l();
            }
            int f13 = fVar.f(4);
            i10 = fVar.f(4);
            i11 = f13;
            i12 = f12;
        } else {
            i12 = 0;
            i11 = 0;
            i10 = 0;
        }
        if (fVar.e()) {
            int i13 = fVar.i();
            int i14 = fVar.i();
            int i15 = fVar.i();
            int i16 = fVar.i();
            f10 = b(f10, i12, i13, i14);
            f11 = a(f11, i12, i15, i16);
        }
        return new C0472e(i12, i11, i10, f10, f11);
    }

    private static f p(f fVar, int i10) {
        int i11 = fVar.i();
        int i12 = i11 + 1;
        C9967v.a x10 = C9967v.x(i12);
        int[] iArr = new int[i10];
        for (int i13 = 0; i13 < i12; i13++) {
            x10.a(o(fVar));
        }
        int i14 = 1;
        if (i12 <= 1 || !fVar.e()) {
            while (i14 < i10) {
                iArr[i14] = Math.min(i14, i11);
                i14++;
            }
        } else {
            int d10 = C10030a.d((double) i12, RoundingMode.CEILING);
            while (i14 < i10) {
                iArr[i14] = fVar.f(d10);
                i14++;
            }
        }
        return new f(x10.k(), iArr);
    }

    public static g q(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        while (true) {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0 || i11 <= i12) {
            }
        }
        if (b10 != 0 && i11 > i12) {
            f fVar = new f(bArr, i12, i11 + 1);
            while (fVar.c(16)) {
                int f10 = fVar.f(8);
                int i13 = 0;
                while (f10 == 255) {
                    i13 += 255;
                    f10 = fVar.f(8);
                }
                int i14 = i13 + f10;
                int f11 = fVar.f(8);
                int i15 = 0;
                while (f11 == 255) {
                    i15 += 255;
                    f11 = fVar.f(8);
                }
                int i16 = i15 + f11;
                if (i16 == 0 || !fVar.c(i16)) {
                    break;
                } else if (i14 == 176) {
                    int i17 = fVar.i();
                    boolean e10 = fVar.e();
                    int i18 = e10 ? fVar.i() : 0;
                    int i19 = fVar.i();
                    int i20 = -1;
                    int i21 = -1;
                    int i22 = -1;
                    int i23 = -1;
                    int i24 = -1;
                    int i25 = -1;
                    for (int i26 = 0; i26 <= i19; i26++) {
                        i20 = fVar.i();
                        i21 = fVar.i();
                        i22 = fVar.f(6);
                        if (i22 == 63) {
                            return null;
                        }
                        i23 = fVar.f(i22 == 0 ? Math.max(0, i17 - 30) : Math.max(0, (i22 + i17) - 31));
                        if (e10) {
                            i24 = fVar.f(6);
                            if (i24 == 63) {
                                return null;
                            }
                            i25 = fVar.f(i24 == 0 ? Math.max(0, i18 - 30) : Math.max(0, (i24 + i18) - 31));
                        }
                        if (fVar.e()) {
                            fVar.m(10);
                        }
                    }
                    return new g(i17, i18, i19 + 1, i20, i21, i22, i23, i24, i25);
                }
            }
        }
        return null;
    }

    public static h r(byte[] bArr, int i10, int i11, k kVar) {
        return s(bArr, i10 + 2, i11, m(new f(bArr, i10, i11)), kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static u3.e.h s(byte[] r20, int r21, int r22, u3.e.b r23, u3.e.k r24) {
        /*
            r1 = r23
            r0 = r24
            u3.f r2 = new u3.f
            r3 = r20
            r4 = r21
            r5 = r22
            r2.<init>(r3, r4, r5)
            r3 = 4
            r2.m(r3)
            r3 = 3
            int r4 = r2.f(r3)
            int r5 = r1.f30083b
            r6 = 1
            if (r5 == 0) goto L_0x0022
            r5 = 7
            if (r4 != r5) goto L_0x0022
            r5 = r6
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x0045
            kb.v<u3.e$a> r8 = r0.f30128b
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0045
            int r8 = r1.f30083b
            kb.v<u3.e$a> r9 = r0.f30128b
            int r9 = r9.size()
            int r9 = r9 - r6
            int r8 = java.lang.Math.min(r8, r9)
            kb.v<u3.e$a> r9 = r0.f30128b
            java.lang.Object r8 = r9.get(r8)
            u3.e$a r8 = (u3.e.a) r8
            int r8 = r8.f30080a
            goto L_0x0046
        L_0x0045:
            r8 = 0
        L_0x0046:
            r9 = 0
            if (r5 != 0) goto L_0x0051
            r2.l()
            u3.e$c r9 = n(r2, r6, r4, r9)
            goto L_0x006b
        L_0x0051:
            if (r0 == 0) goto L_0x006b
            u3.e$d r10 = r0.f30129c
            int[] r11 = r10.f30092b
            r11 = r11[r8]
            kb.v<u3.e$c> r10 = r10.f30091a
            int r10 = r10.size()
            if (r10 <= r11) goto L_0x006b
            u3.e$d r9 = r0.f30129c
            kb.v<u3.e$c> r9 = r9.f30091a
            java.lang.Object r9 = r9.get(r11)
            u3.e$c r9 = (u3.e.c) r9
        L_0x006b:
            int r10 = r2.i()
            r11 = 8
            r12 = -1
            if (r5 == 0) goto L_0x00b3
            boolean r13 = r2.e()
            if (r13 == 0) goto L_0x007f
            int r13 = r2.f(r11)
            goto L_0x0080
        L_0x007f:
            r13 = r12
        L_0x0080:
            if (r0 == 0) goto L_0x00ad
            u3.e$f r14 = r0.f30130d
            if (r14 == 0) goto L_0x00ad
            if (r13 != r12) goto L_0x008c
            int[] r13 = r14.f30099b
            r13 = r13[r8]
        L_0x008c:
            if (r13 == r12) goto L_0x00ad
            kb.v<u3.e$e> r14 = r14.f30098a
            int r14 = r14.size()
            if (r14 <= r13) goto L_0x00ad
            u3.e$f r14 = r0.f30130d
            kb.v<u3.e$e> r14 = r14.f30098a
            java.lang.Object r13 = r14.get(r13)
            u3.e$e r13 = (u3.e.C0472e) r13
            int r14 = r13.f30093a
            int r15 = r13.f30096d
            int r6 = r13.f30097e
            int r7 = r13.f30094b
            int r13 = r13.f30095c
            r12 = r13
            r3 = r14
            goto L_0x00ef
        L_0x00ad:
            r3 = 0
            r6 = 0
            r7 = 0
            r12 = 0
            r15 = 0
            goto L_0x00ef
        L_0x00b3:
            int r6 = r2.i()
            if (r6 != r3) goto L_0x00bc
            r2.l()
        L_0x00bc:
            int r7 = r2.i()
            int r13 = r2.i()
            boolean r14 = r2.e()
            if (r14 == 0) goto L_0x00e3
            int r14 = r2.i()
            int r15 = r2.i()
            int r12 = r2.i()
            int r3 = r2.i()
            int r7 = b(r7, r6, r14, r15)
            int r3 = a(r13, r6, r12, r3)
            r13 = r3
        L_0x00e3:
            int r3 = r2.i()
            int r12 = r2.i()
            r15 = r7
            r7 = r3
            r3 = r6
            r6 = r13
        L_0x00ef:
            int r13 = r2.i()
            if (r5 != 0) goto L_0x0114
            boolean r14 = r2.e()
            if (r14 == 0) goto L_0x00fd
            r14 = 0
            goto L_0x00fe
        L_0x00fd:
            r14 = r4
        L_0x00fe:
            r11 = -1
        L_0x00ff:
            if (r14 > r4) goto L_0x0115
            r2.i()
            int r1 = r2.i()
            int r11 = java.lang.Math.max(r1, r11)
            r2.i()
            int r14 = r14 + 1
            r1 = r23
            goto L_0x00ff
        L_0x0114:
            r11 = -1
        L_0x0115:
            r2.i()
            r2.i()
            r2.i()
            r2.i()
            r2.i()
            r2.i()
            boolean r1 = r2.e()
            if (r1 == 0) goto L_0x0145
            if (r5 == 0) goto L_0x0134
            boolean r1 = r2.e()
            goto L_0x0135
        L_0x0134:
            r1 = 0
        L_0x0135:
            if (r1 == 0) goto L_0x013c
            r1 = 6
            r2.m(r1)
            goto L_0x0145
        L_0x013c:
            boolean r1 = r2.e()
            if (r1 == 0) goto L_0x0145
            D(r2)
        L_0x0145:
            r1 = 2
            r2.m(r1)
            boolean r4 = r2.e()
            if (r4 == 0) goto L_0x015d
            r4 = 8
            r2.m(r4)
            r2.i()
            r2.i()
            r2.l()
        L_0x015d:
            E(r2)
            boolean r4 = r2.e()
            if (r4 == 0) goto L_0x0175
            int r4 = r2.i()
            r5 = 0
        L_0x016b:
            if (r5 >= r4) goto L_0x0175
            int r14 = r13 + 5
            r2.m(r14)
            int r5 = r5 + 1
            goto L_0x016b
        L_0x0175:
            r2.m(r1)
            boolean r4 = r2.e()
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x0244
            boolean r4 = r2.e()
            if (r4 == 0) goto L_0x01c0
            r4 = 8
            int r13 = r2.f(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r13 != r4) goto L_0x01a2
            r4 = 16
            int r13 = r2.f(r4)
            int r4 = r2.f(r4)
            if (r13 == 0) goto L_0x01c0
            if (r4 == 0) goto L_0x01c0
            float r5 = (float) r13
            float r4 = (float) r4
            float r5 = r5 / r4
            goto L_0x01c0
        L_0x01a2:
            float[] r4 = f30077b
            int r14 = r4.length
            if (r13 >= r14) goto L_0x01aa
            r5 = r4[r13]
            goto L_0x01c0
        L_0x01aa:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r14 = "Unexpected aspect_ratio_idc value: "
            r4.append(r14)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = "NalUnitUtil"
            t3.q.h(r13, r4)
        L_0x01c0:
            boolean r4 = r2.e()
            if (r4 == 0) goto L_0x01c9
            r2.l()
        L_0x01c9:
            boolean r4 = r2.e()
            if (r4 == 0) goto L_0x01f9
            r4 = 3
            r2.m(r4)
            boolean r0 = r2.e()
            if (r0 == 0) goto L_0x01da
            r1 = 1
        L_0x01da:
            boolean r0 = r2.e()
            if (r0 == 0) goto L_0x01f6
            r0 = 8
            int r4 = r2.f(r0)
            int r8 = r2.f(r0)
            r2.m(r0)
            int r0 = q3.C5798i.j(r4)
            int r4 = q3.C5798i.k(r8)
            goto L_0x0225
        L_0x01f6:
            r0 = -1
        L_0x01f7:
            r4 = -1
            goto L_0x0225
        L_0x01f9:
            if (r0 == 0) goto L_0x0222
            u3.e$j r1 = r0.f30131e
            if (r1 == 0) goto L_0x0222
            int[] r4 = r1.f30126b
            r4 = r4[r8]
            kb.v<u3.e$i> r1 = r1.f30125a
            int r1 = r1.size()
            if (r1 <= r4) goto L_0x0222
            u3.e$j r0 = r0.f30131e
            kb.v<u3.e$i> r0 = r0.f30125a
            java.lang.Object r0 = r0.get(r4)
            u3.e$i r0 = (u3.e.i) r0
            int r1 = r0.f30122a
            int r4 = r0.f30123b
            int r0 = r0.f30124c
            r19 = r4
            r4 = r0
            r0 = r1
            r1 = r19
            goto L_0x0225
        L_0x0222:
            r0 = -1
            r1 = -1
            goto L_0x01f7
        L_0x0225:
            boolean r8 = r2.e()
            if (r8 == 0) goto L_0x0231
            r2.i()
            r2.i()
        L_0x0231:
            r2.l()
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x023c
            int r6 = r6 * 2
        L_0x023c:
            r14 = r0
            r16 = r1
            r17 = r4
            r13 = r5
            r8 = r6
            goto L_0x024b
        L_0x0244:
            r13 = r5
            r8 = r6
            r14 = -1
            r16 = -1
            r17 = -1
        L_0x024b:
            u3.e$h r18 = new u3.e$h
            r0 = r18
            r1 = r23
            r2 = r9
            r4 = r7
            r5 = r12
            r6 = r10
            r7 = r15
            r9 = r13
            r10 = r11
            r11 = r14
            r12 = r16
            r13 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.e.s(byte[], int, int, u3.e$b, u3.e$k):u3.e$h");
    }

    private static i t(f fVar) {
        fVar.m(3);
        int i10 = fVar.e() ? 1 : 2;
        int j10 = C5798i.j(fVar.f(8));
        int k10 = C5798i.k(fVar.f(8));
        fVar.m(8);
        return new i(j10, i10, k10);
    }

    private static j u(f fVar, int i10, int i11, int[] iArr) {
        if (!fVar.e() ? fVar.e() : true) {
            fVar.l();
        }
        boolean e10 = fVar.e();
        boolean e11 = fVar.e();
        if (e10 || e11) {
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < iArr[i12]; i13++) {
                    boolean e12 = e10 ? fVar.e() : false;
                    boolean e13 = e11 ? fVar.e() : false;
                    if (e12) {
                        fVar.m(32);
                    }
                    if (e13) {
                        fVar.m(18);
                    }
                }
            }
        }
        boolean e14 = fVar.e();
        int f10 = e14 ? fVar.f(4) + 1 : i10;
        C9967v.a x10 = C9967v.x(f10);
        int[] iArr2 = new int[i10];
        for (int i14 = 0; i14 < f10; i14++) {
            x10.a(t(fVar));
        }
        if (e14 && f10 > 1) {
            for (int i15 = 0; i15 < i10; i15++) {
                iArr2[i15] = fVar.f(4);
            }
        }
        return new j(x10.k(), iArr2);
    }

    public static k v(byte[] bArr, int i10, int i11) {
        f fVar = new f(bArr, i10, i11);
        return w(fVar, m(fVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:267:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0546 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static u3.e.k w(u3.f r37, u3.e.b r38) {
        /*
            r0 = r37
            r1 = 4
            r0.m(r1)
            boolean r2 = r37.e()
            boolean r3 = r37.e()
            r4 = 6
            int r5 = r0.f(r4)
            int r6 = r5 + 1
            r7 = 3
            int r8 = r0.f(r7)
            r9 = 17
            r0.m(r9)
            r9 = 1
            r10 = 0
            u3.e$c r11 = n(r0, r9, r8, r10)
            boolean r12 = r37.e()
            r13 = 0
            if (r12 == 0) goto L_0x002e
            r12 = r13
            goto L_0x002f
        L_0x002e:
            r12 = r8
        L_0x002f:
            if (r12 > r8) goto L_0x003d
            r37.i()
            r37.i()
            r37.i()
            int r12 = r12 + 1
            goto L_0x002f
        L_0x003d:
            int r12 = r0.f(r4)
            int r14 = r37.i()
            int r14 = r14 + r9
            kb.v r15 = kb.C9967v.F(r11)
            u3.e$d r10 = new u3.e$d
            int[] r1 = new int[r9]
            r10.<init>(r15, r1)
            r1 = 2
            if (r6 < r1) goto L_0x0058
            if (r14 < r1) goto L_0x0058
            r15 = r9
            goto L_0x0059
        L_0x0058:
            r15 = r13
        L_0x0059:
            if (r2 == 0) goto L_0x005f
            if (r3 == 0) goto L_0x005f
            r2 = r9
            goto L_0x0060
        L_0x005f:
            r2 = r13
        L_0x0060:
            int r3 = r12 + 1
            if (r3 < r6) goto L_0x0067
            r18 = r9
            goto L_0x0069
        L_0x0067:
            r18 = r13
        L_0x0069:
            if (r15 == 0) goto L_0x05f5
            if (r2 == 0) goto L_0x05f5
            if (r18 != 0) goto L_0x0071
            goto L_0x05f5
        L_0x0071:
            int[] r2 = new int[r1]
            r2[r9] = r3
            r2[r13] = r14
            java.lang.Class r15 = java.lang.Integer.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r15, r2)
            int[][] r2 = (int[][]) r2
            int[] r15 = new int[r14]
            int[] r1 = new int[r14]
            r19 = r2[r13]
            r19[r13] = r13
            r15[r13] = r9
            r1[r13] = r13
            r4 = r9
        L_0x008c:
            if (r4 >= r14) goto L_0x00ac
            r7 = r13
            r21 = r7
        L_0x0091:
            if (r7 > r12) goto L_0x00a8
            boolean r22 = r37.e()
            if (r22 == 0) goto L_0x00a3
            r22 = r2[r4]
            int r23 = r21 + 1
            r22[r21] = r7
            r1[r4] = r7
            r21 = r23
        L_0x00a3:
            r15[r4] = r21
            int r7 = r7 + 1
            goto L_0x0091
        L_0x00a8:
            int r4 = r4 + 1
            r7 = 3
            goto L_0x008c
        L_0x00ac:
            boolean r4 = r37.e()
            if (r4 == 0) goto L_0x00db
            r4 = 64
            r0.m(r4)
            boolean r4 = r37.e()
            if (r4 == 0) goto L_0x00c0
            r37.i()
        L_0x00c0:
            int r4 = r37.i()
            r7 = r13
        L_0x00c5:
            if (r7 >= r4) goto L_0x00db
            r37.i()
            if (r7 == 0) goto L_0x00d4
            boolean r21 = r37.e()
            if (r21 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r9 = r13
        L_0x00d4:
            C(r0, r9, r8)
            int r7 = r7 + 1
            r9 = 1
            goto L_0x00c5
        L_0x00db:
            boolean r4 = r37.e()
            if (r4 != 0) goto L_0x00f3
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        L_0x00f3:
            r37.b()
            u3.e$c r4 = n(r0, r13, r8, r11)
            boolean r7 = r37.e()
            r9 = 16
            boolean[] r13 = new boolean[r9]
            r23 = r1
            r24 = r4
            r1 = 0
            r4 = 0
        L_0x0108:
            if (r1 >= r9) goto L_0x0117
            boolean r25 = r37.e()
            r13[r1] = r25
            if (r25 == 0) goto L_0x0114
            int r4 = r4 + 1
        L_0x0114:
            int r1 = r1 + 1
            goto L_0x0108
        L_0x0117:
            if (r4 == 0) goto L_0x05e3
            r1 = 1
            boolean r25 = r13[r1]
            if (r25 != 0) goto L_0x0120
            goto L_0x05e3
        L_0x0120:
            int[] r1 = new int[r4]
            r26 = r11
            r9 = 0
        L_0x0125:
            int r11 = r4 - r7
            if (r9 >= r11) goto L_0x0133
            r11 = 3
            int r27 = r0.f(r11)
            r1[r9] = r27
            int r9 = r9 + 1
            goto L_0x0125
        L_0x0133:
            int r9 = r4 + 1
            int[] r9 = new int[r9]
            if (r7 == 0) goto L_0x015c
            r11 = 1
        L_0x013a:
            if (r11 >= r4) goto L_0x0155
            r27 = r2
            r2 = 0
        L_0x013f:
            if (r2 >= r11) goto L_0x0150
            r28 = r9[r11]
            r29 = r1[r2]
            r21 = 1
            int r29 = r29 + 1
            int r28 = r28 + r29
            r9[r11] = r28
            int r2 = r2 + 1
            goto L_0x013f
        L_0x0150:
            int r11 = r11 + 1
            r2 = r27
            goto L_0x013a
        L_0x0155:
            r27 = r2
            r2 = 6
            r9[r4] = r2
        L_0x015a:
            r2 = 2
            goto L_0x015f
        L_0x015c:
            r27 = r2
            goto L_0x015a
        L_0x015f:
            int[] r11 = new int[r2]
            r2 = 1
            r11[r2] = r4
            r2 = 0
            r11[r2] = r6
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r11)
            int[][] r2 = (int[][]) r2
            int[] r11 = new int[r6]
            r22 = 0
            r11[r22] = r22
            boolean r28 = r37.e()
            r29 = r15
            r15 = 1
        L_0x017c:
            if (r15 >= r6) goto L_0x01d1
            if (r28 == 0) goto L_0x018a
            r30 = r8
            r8 = 6
            int r19 = r0.f(r8)
            r11[r15] = r19
            goto L_0x018f
        L_0x018a:
            r30 = r8
            r8 = 6
            r11[r15] = r15
        L_0x018f:
            if (r7 != 0) goto L_0x01ac
            r8 = 0
        L_0x0192:
            if (r8 >= r4) goto L_0x01a9
            r31 = r2[r15]
            r32 = r1[r8]
            r33 = r1
            r21 = 1
            int r1 = r32 + 1
            int r1 = r0.f(r1)
            r31[r8] = r1
            int r8 = r8 + 1
            r1 = r33
            goto L_0x0192
        L_0x01a9:
            r33 = r1
            goto L_0x01ca
        L_0x01ac:
            r33 = r1
            r1 = 0
        L_0x01af:
            if (r1 >= r4) goto L_0x01ca
            r8 = r2[r15]
            r31 = r11[r15]
            int r32 = r1 + 1
            r34 = r9[r32]
            r21 = 1
            int r34 = r21 << r34
            int r34 = r34 + -1
            r31 = r31 & r34
            r34 = r9[r1]
            int r31 = r31 >> r34
            r8[r1] = r31
            r1 = r32
            goto L_0x01af
        L_0x01ca:
            int r15 = r15 + 1
            r8 = r30
            r1 = r33
            goto L_0x017c
        L_0x01d1:
            r30 = r8
            int[] r1 = new int[r3]
            r4 = 1
            r7 = 0
        L_0x01d7:
            r8 = -1
            if (r7 >= r6) goto L_0x0210
            r9 = r11[r7]
            r1[r9] = r8
            r8 = 0
            r9 = 0
        L_0x01e0:
            r15 = 16
            if (r8 >= r15) goto L_0x01f8
            boolean r19 = r13[r8]
            if (r19 == 0) goto L_0x01f5
            r15 = 1
            if (r8 != r15) goto L_0x01f3
            r15 = r11[r7]
            r19 = r2[r7]
            r19 = r19[r9]
            r1[r15] = r19
        L_0x01f3:
            int r9 = r9 + 1
        L_0x01f5:
            int r8 = r8 + 1
            goto L_0x01e0
        L_0x01f8:
            if (r7 <= 0) goto L_0x020d
            r8 = 0
        L_0x01fb:
            if (r8 >= r7) goto L_0x020b
            r9 = r11[r7]
            r9 = r1[r9]
            r15 = r11[r8]
            r15 = r1[r15]
            if (r9 != r15) goto L_0x0208
            goto L_0x020d
        L_0x0208:
            int r8 = r8 + 1
            goto L_0x01fb
        L_0x020b:
            int r4 = r4 + 1
        L_0x020d:
            int r7 = r7 + 1
            goto L_0x01d7
        L_0x0210:
            r7 = 4
            int r2 = r0.f(r7)
            r7 = 2
            if (r4 < r7) goto L_0x05d1
            if (r2 != 0) goto L_0x021c
            goto L_0x05d1
        L_0x021c:
            int[] r7 = new int[r4]
            r9 = 0
        L_0x021f:
            if (r9 >= r4) goto L_0x022a
            int r13 = r0.f(r2)
            r7[r9] = r13
            int r9 = r9 + 1
            goto L_0x021f
        L_0x022a:
            int[] r2 = new int[r3]
            r9 = 0
        L_0x022d:
            if (r9 >= r6) goto L_0x023a
            r13 = r11[r9]
            int r13 = java.lang.Math.min(r13, r12)
            r2[r13] = r9
            int r9 = r9 + 1
            goto L_0x022d
        L_0x023a:
            kb.v$a r9 = kb.C9967v.t()
            r13 = 0
        L_0x023f:
            if (r13 > r12) goto L_0x0263
            r15 = r1[r13]
            r17 = 1
            int r8 = r4 + -1
            int r8 = java.lang.Math.min(r15, r8)
            if (r8 < 0) goto L_0x0250
            r8 = r7[r8]
            goto L_0x0251
        L_0x0250:
            r8 = -1
        L_0x0251:
            u3.e$a r15 = new u3.e$a
            r17 = r1
            r1 = r2[r13]
            r15.<init>(r1, r8)
            r9.a(r15)
            int r13 = r13 + 1
            r1 = r17
            r8 = -1
            goto L_0x023f
        L_0x0263:
            kb.v r1 = r9.k()
            r2 = 0
            java.lang.Object r4 = r1.get(r2)
            u3.e$a r4 = (u3.e.a) r4
            int r2 = r4.f30081b
            r4 = -1
            if (r2 != r4) goto L_0x0285
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        L_0x0285:
            r2 = 1
        L_0x0286:
            if (r2 > r12) goto L_0x0298
            java.lang.Object r4 = r1.get(r2)
            u3.e$a r4 = (u3.e.a) r4
            int r4 = r4.f30081b
            r7 = -1
            if (r4 == r7) goto L_0x0295
            r4 = r2
            goto L_0x029a
        L_0x0295:
            int r2 = r2 + 1
            goto L_0x0286
        L_0x0298:
            r7 = -1
            r4 = r7
        L_0x029a:
            if (r4 != r7) goto L_0x02ae
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        L_0x02ae:
            r2 = 2
            int[] r7 = new int[r2]
            r8 = 1
            r7[r8] = r6
            r9 = 0
            r7[r9] = r6
            java.lang.Class r12 = java.lang.Boolean.TYPE
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r12, r7)
            boolean[][] r7 = (boolean[][]) r7
            int[] r13 = new int[r2]
            r13[r8] = r6
            r13[r9] = r6
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r12, r13)
            boolean[][] r2 = (boolean[][]) r2
            r8 = 1
        L_0x02cc:
            if (r8 >= r6) goto L_0x02e3
            r9 = 0
        L_0x02cf:
            if (r9 >= r8) goto L_0x02e0
            r12 = r7[r8]
            r13 = r2[r8]
            boolean r15 = r37.e()
            r13[r9] = r15
            r12[r9] = r15
            int r9 = r9 + 1
            goto L_0x02cf
        L_0x02e0:
            int r8 = r8 + 1
            goto L_0x02cc
        L_0x02e3:
            r8 = 1
        L_0x02e4:
            if (r8 >= r6) goto L_0x0305
            r9 = 0
        L_0x02e7:
            if (r9 >= r5) goto L_0x0302
            r12 = 0
        L_0x02ea:
            if (r12 >= r8) goto L_0x02ff
            r13 = r2[r8]
            boolean r15 = r13[r12]
            if (r15 == 0) goto L_0x02fc
            r15 = r2[r12]
            boolean r15 = r15[r9]
            if (r15 == 0) goto L_0x02fc
            r15 = 1
            r13[r9] = r15
            goto L_0x02ff
        L_0x02fc:
            int r12 = r12 + 1
            goto L_0x02ea
        L_0x02ff:
            int r9 = r9 + 1
            goto L_0x02e7
        L_0x0302:
            int r8 = r8 + 1
            goto L_0x02e4
        L_0x0305:
            int[] r8 = new int[r3]
            r9 = 0
        L_0x0308:
            if (r9 >= r6) goto L_0x031d
            r12 = 0
            r13 = 0
        L_0x030c:
            if (r12 >= r9) goto L_0x0316
            r15 = r7[r9]
            boolean r15 = r15[r12]
            int r13 = r13 + r15
            int r12 = r12 + 1
            goto L_0x030c
        L_0x0316:
            r12 = r11[r9]
            r8[r12] = r13
            int r9 = r9 + 1
            goto L_0x0308
        L_0x031d:
            r9 = 0
            r12 = 0
        L_0x031f:
            if (r9 >= r6) goto L_0x032c
            r13 = r11[r9]
            r13 = r8[r13]
            if (r13 != 0) goto L_0x0329
            int r12 = r12 + 1
        L_0x0329:
            int r9 = r9 + 1
            goto L_0x031f
        L_0x032c:
            r9 = 1
            if (r12 <= r9) goto L_0x0341
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        L_0x0341:
            int[] r9 = new int[r6]
            int[] r12 = new int[r14]
            boolean r13 = r37.e()
            if (r13 == 0) goto L_0x035b
            r13 = 0
        L_0x034c:
            if (r13 >= r6) goto L_0x0358
            r15 = 3
            int r17 = r0.f(r15)
            r9[r13] = r17
            int r13 = r13 + 1
            goto L_0x034c
        L_0x0358:
            r13 = r30
            goto L_0x0361
        L_0x035b:
            r13 = r30
            r15 = 0
            java.util.Arrays.fill(r9, r15, r6, r13)
        L_0x0361:
            r15 = 0
        L_0x0362:
            if (r15 >= r14) goto L_0x0392
            r25 = r2
            r19 = r8
            r17 = r11
            r8 = 0
            r11 = 0
        L_0x036c:
            r2 = r29[r15]
            if (r11 >= r2) goto L_0x0385
            r2 = r27[r15]
            r2 = r2[r11]
            java.lang.Object r2 = r1.get(r2)
            u3.e$a r2 = (u3.e.a) r2
            int r2 = r2.f30080a
            r2 = r9[r2]
            int r8 = java.lang.Math.max(r8, r2)
            int r11 = r11 + 1
            goto L_0x036c
        L_0x0385:
            int r8 = r8 + 1
            r12[r15] = r8
            int r15 = r15 + 1
            r11 = r17
            r8 = r19
            r2 = r25
            goto L_0x0362
        L_0x0392:
            r25 = r2
            r19 = r8
            r17 = r11
            boolean r2 = r37.e()
            if (r2 == 0) goto L_0x03b7
            r2 = 0
        L_0x039f:
            if (r2 >= r5) goto L_0x03b7
            int r8 = r2 + 1
            r9 = r8
        L_0x03a4:
            if (r9 >= r6) goto L_0x03b5
            r11 = r7[r9]
            boolean r11 = r11[r2]
            if (r11 == 0) goto L_0x03b1
            r11 = 3
            r0.m(r11)
            goto L_0x03b2
        L_0x03b1:
            r11 = 3
        L_0x03b2:
            int r9 = r9 + 1
            goto L_0x03a4
        L_0x03b5:
            r2 = r8
            goto L_0x039f
        L_0x03b7:
            r37.l()
            int r2 = r37.i()
            r5 = 1
            int r2 = r2 + r5
            kb.v$a r8 = kb.C9967v.t()
            r9 = r26
            r8.a(r9)
            if (r2 <= r5) goto L_0x03e1
            r5 = r24
            r8.a(r5)
            r9 = 2
        L_0x03d1:
            if (r9 >= r2) goto L_0x03e1
            boolean r11 = r37.e()
            u3.e$c r5 = n(r0, r11, r13, r5)
            r8.a(r5)
            int r9 = r9 + 1
            goto L_0x03d1
        L_0x03e1:
            kb.v r5 = r8.k()
            int r8 = r37.i()
            int r8 = r8 + r14
            if (r8 <= r14) goto L_0x03fe
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        L_0x03fe:
            r9 = 2
            int r11 = r0.f(r9)
            int[] r13 = new int[r9]
            r9 = 1
            r13[r9] = r3
            r9 = 0
            r13[r9] = r8
            java.lang.Class r15 = java.lang.Boolean.TYPE
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r15, r13)
            boolean[][] r13 = (boolean[][]) r13
            int[] r15 = new int[r8]
            int[] r9 = new int[r8]
            r20 = r5
            r5 = 0
        L_0x041a:
            if (r5 >= r14) goto L_0x0473
            r24 = r14
            r14 = 0
            r15[r5] = r14
            r22 = r23[r5]
            r9[r5] = r22
            if (r11 != 0) goto L_0x043c
            r26 = r7
            r7 = r13[r5]
            r28 = r12
            r12 = r29[r5]
            r30 = r6
            r6 = 1
            java.util.Arrays.fill(r7, r14, r12, r6)
            r7 = r29[r5]
            r15[r5] = r7
            r7 = r6
        L_0x043a:
            r6 = 0
            goto L_0x0468
        L_0x043c:
            r30 = r6
            r26 = r7
            r28 = r12
            r6 = 1
            if (r11 != r6) goto L_0x0460
            r6 = r23[r5]
            r7 = 0
        L_0x0448:
            r12 = r29[r5]
            if (r7 >= r12) goto L_0x045c
            r12 = r13[r5]
            r14 = r27[r5]
            r14 = r14[r7]
            if (r14 != r6) goto L_0x0456
            r14 = 1
            goto L_0x0457
        L_0x0456:
            r14 = 0
        L_0x0457:
            r12[r7] = r14
            int r7 = r7 + 1
            goto L_0x0448
        L_0x045c:
            r7 = 1
            r15[r5] = r7
            goto L_0x043a
        L_0x0460:
            r7 = r6
            r6 = 0
            r12 = r13[r6]
            r12[r6] = r7
            r15[r6] = r7
        L_0x0468:
            int r5 = r5 + 1
            r14 = r24
            r7 = r26
            r12 = r28
            r6 = r30
            goto L_0x041a
        L_0x0473:
            r30 = r6
            r26 = r7
            r28 = r12
            r24 = r14
            r6 = 0
            r7 = 1
            int[] r5 = new int[r3]
            r12 = 2
            int[] r14 = new int[r12]
            r14[r7] = r3
            r14[r6] = r8
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r14)
            boolean[][] r3 = (boolean[][]) r3
            r6 = 1
            r7 = 0
        L_0x0490:
            if (r6 >= r8) goto L_0x056e
            if (r11 != r12) goto L_0x04b6
            r12 = 0
        L_0x0495:
            r14 = r29[r6]
            if (r12 >= r14) goto L_0x04b6
            r14 = r13[r6]
            boolean r23 = r37.e()
            r14[r12] = r23
            r14 = r15[r6]
            r23 = r13[r6]
            boolean r23 = r23[r12]
            int r14 = r14 + r23
            r15[r6] = r14
            if (r23 == 0) goto L_0x04b3
            r14 = r27[r6]
            r14 = r14[r12]
            r9[r6] = r14
        L_0x04b3:
            int r12 = r12 + 1
            goto L_0x0495
        L_0x04b6:
            if (r7 != 0) goto L_0x04da
            r12 = r27[r6]
            r14 = 0
            r12 = r12[r14]
            if (r12 != 0) goto L_0x04da
            r12 = r13[r6]
            boolean r12 = r12[r14]
            if (r12 == 0) goto L_0x04da
            r12 = 1
        L_0x04c6:
            r14 = r29[r6]
            if (r12 >= r14) goto L_0x04da
            r14 = r27[r6]
            r14 = r14[r12]
            if (r14 != r4) goto L_0x04d7
            r14 = r13[r6]
            boolean r14 = r14[r4]
            if (r14 == 0) goto L_0x04d7
            r7 = r6
        L_0x04d7:
            int r12 = r12 + 1
            goto L_0x04c6
        L_0x04da:
            r12 = 0
        L_0x04db:
            r14 = r29[r6]
            if (r12 >= r14) goto L_0x054f
            r14 = 1
            if (r2 <= r14) goto L_0x0540
            r14 = r3[r6]
            r23 = r13[r6]
            boolean r23 = r23[r12]
            r14[r12] = r23
            r23 = r13
            double r13 = (double) r2
            r31 = r2
            java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
            int r2 = mb.C10030a.d(r13, r2)
            r13 = r3[r6]
            boolean r13 = r13[r12]
            if (r13 != 0) goto L_0x0529
            r13 = r27[r6]
            r13 = r13[r12]
            java.lang.Object r13 = r1.get(r13)
            u3.e$a r13 = (u3.e.a) r13
            int r13 = r13.f30080a
            r14 = 0
        L_0x0508:
            if (r14 >= r12) goto L_0x0529
            r32 = r27[r6]
            r33 = r4
            r4 = r32[r14]
            java.lang.Object r4 = r1.get(r4)
            u3.e$a r4 = (u3.e.a) r4
            int r4 = r4.f30080a
            r32 = r25[r13]
            boolean r4 = r32[r4]
            if (r4 == 0) goto L_0x0524
            r4 = r3[r6]
            r13 = 1
            r4[r12] = r13
            goto L_0x052b
        L_0x0524:
            int r14 = r14 + 1
            r4 = r33
            goto L_0x0508
        L_0x0529:
            r33 = r4
        L_0x052b:
            r4 = r3[r6]
            boolean r4 = r4[r12]
            if (r4 == 0) goto L_0x0546
            if (r7 <= 0) goto L_0x053c
            if (r6 != r7) goto L_0x053c
            int r2 = r0.f(r2)
            r5[r12] = r2
            goto L_0x0546
        L_0x053c:
            r0.m(r2)
            goto L_0x0546
        L_0x0540:
            r31 = r2
            r33 = r4
            r23 = r13
        L_0x0546:
            int r12 = r12 + 1
            r13 = r23
            r2 = r31
            r4 = r33
            goto L_0x04db
        L_0x054f:
            r31 = r2
            r33 = r4
            r23 = r13
            r2 = r15[r6]
            r4 = 1
            if (r2 != r4) goto L_0x0563
            r2 = r9[r6]
            r2 = r19[r2]
            if (r2 <= 0) goto L_0x0563
            r37.l()
        L_0x0563:
            int r6 = r6 + 1
            r13 = r23
            r2 = r31
            r4 = r33
            r12 = 2
            goto L_0x0490
        L_0x056e:
            r4 = 1
            if (r7 != 0) goto L_0x0583
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        L_0x0583:
            r2 = r30
            u3.e$f r35 = p(r0, r2)
            r6 = 2
            r0.m(r6)
            r9 = r4
        L_0x058e:
            if (r9 >= r2) goto L_0x059c
            r4 = r17[r9]
            r4 = r19[r4]
            if (r4 != 0) goto L_0x0599
            r37.l()
        L_0x0599:
            int r9 = r9 + 1
            goto L_0x058e
        L_0x059c:
            r6 = r28
            r4 = r29
            B(r0, r8, r6, r4, r3)
            r7 = r26
            H(r0, r2, r7)
            boolean r3 = r37.e()
            if (r3 == 0) goto L_0x05ba
            r37.b()
            r14 = r24
            u3.e$j r10 = u(r0, r2, r14, r6)
            r36 = r10
            goto L_0x05bc
        L_0x05ba:
            r36 = 0
        L_0x05bc:
            u3.e$k r0 = new u3.e$k
            u3.e$d r2 = new u3.e$d
            r3 = r20
            r2.<init>(r3, r5)
            r31 = r0
            r32 = r38
            r33 = r1
            r34 = r2
            r31.<init>(r32, r33, r34, r35, r36)
            return r0
        L_0x05d1:
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        L_0x05e3:
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        L_0x05f5:
            u3.e$k r0 = new u3.e$k
            r20 = 0
            r21 = 0
            r18 = 0
            r16 = r0
            r17 = r38
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.e.w(u3.f, u3.e$b):u3.e$k");
    }

    public static l x(byte[] bArr, int i10, int i11) {
        return y(bArr, i10 + 1, i11);
    }

    public static l y(byte[] bArr, int i10, int i11) {
        f fVar = new f(bArr, i10, i11);
        int i12 = fVar.i();
        int i13 = fVar.i();
        fVar.l();
        return new l(i12, i13, fVar.e());
    }

    public static m z(byte[] bArr, int i10, int i11) {
        return A(bArr, i10 + 1, i11);
    }
}
