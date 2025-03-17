package bh;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.t;
import ch.C9471a;
import ch.C9472b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import nI.p;
import o1.C5669i;
import p1.C5728l0;
import p1.C5747v0;
import p1.j1;
import tK.C18030v;
import u1.C6010h;
import u1.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lo1/i;", "stateA", "stateB", "Lbh/D;", "highlightLabel", "", "cornerRadius", "circleRadius", "Lp1/l0;", "stroke", "Lm0/D;", "easingX", "easingY", "", "offset", "LXH/N;", "b", "(Lo1/i;Lo1/i;Lbh/D;FFLp1/l0;Lm0/D;Lm0/D;ILU0/m;II)V", "giftcard-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class F {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5669i f65515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5669i f65516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f65517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5728l0 f65518d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f65519e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C9439D f65520f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bh.F$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1154a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f65521a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    bh.D[] r0 = bh.C9439D.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    bh.D r1 = bh.C9439D.ONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    bh.D r1 = bh.C9439D.TWO     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f65521a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: bh.F.a.C1154a.<clinit>():void");
            }
        }

        a(C5669i iVar, C5669i iVar2, float f10, C5728l0 l0Var, float f11, C9439D d10) {
            this.f65515a = iVar;
            this.f65516b = iVar2;
            this.f65517c = f10;
            this.f65518d = l0Var;
            this.f65519e = f11;
            this.f65520f = d10;
        }

        public final void a(C4889m mVar, int i10) {
            List c10;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(883369842, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.VectorHighlightGroup.<anonymous> (VectorHighlightGroup.kt:51)");
                }
                o.b(C9472b.h(C9471a.a("highlightWidth", this.f65515a.t(), this.f65516b.t(), 0, 0, (C5525D) null, mVar, 6, 56).getValue().floatValue(), this.f65515a.n(), this.f65517c, 0.0f, 0.0f, mVar, 0, 24), 0, (String) null, (C5728l0) null, 0.0f, this.f65518d, 0.0f, 1.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, mVar, 12582912, 0, 16222);
                List<C6010h> a10 = C9472b.a(-9.0f, 2.0f, this.f65519e);
                j1 j1Var = r1;
                j1 j1Var2 = new j1(C5747v0.f27350b.f(), (DefaultConstructorMarker) null);
                o.b(a10, 0, (String) null, j1Var, 0.0f, (C5728l0) null, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, mVar, 3072, 0, 16374);
                int i12 = C1154a.f65521a[this.f65520f.ordinal()];
                if (i12 == 1) {
                    c10 = C9472b.c(6.0f, -3.0f, 0.0f, 4, (Object) null);
                } else if (i12 == 2) {
                    c10 = C9472b.e(6.0f, -3.0f, 0.0f, 4, (Object) null);
                } else {
                    throw new t();
                }
                List list = c10;
                j1 j1Var3 = r1;
                j1 j1Var4 = new j1(C18030v.f147664a.a(mVar, C18030v.f147665b).F0(), (DefaultConstructorMarker) null);
                o.b(list, 0, (String) null, j1Var3, 0.0f, (C5728l0) null, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, mVar, 0, 0, 16374);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(o1.C5669i r26, o1.C5669i r27, bh.C9439D r28, float r29, float r30, p1.C5728l0 r31, m0.C5525D r32, m0.C5525D r33, int r34, U0.C4889m r35, int r36, int r37) {
        /*
            r1 = r26
            r2 = r27
            r3 = r28
            r10 = r36
            r11 = r37
            java.lang.String r0 = "stateA"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "stateB"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "highlightLabel"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r0 = 427713405(0x197e637d, float:1.3151584E-23)
            r4 = r35
            U0.m r4 = r4.k(r0)
            r5 = r11 & 1
            if (r5 == 0) goto L_0x0029
            r5 = r10 | 6
            goto L_0x0039
        L_0x0029:
            r5 = r10 & 6
            if (r5 != 0) goto L_0x0038
            boolean r5 = r4.V(r1)
            if (r5 == 0) goto L_0x0035
            r5 = 4
            goto L_0x0036
        L_0x0035:
            r5 = 2
        L_0x0036:
            r5 = r5 | r10
            goto L_0x0039
        L_0x0038:
            r5 = r10
        L_0x0039:
            r6 = r11 & 2
            if (r6 == 0) goto L_0x0040
            r5 = r5 | 48
            goto L_0x0050
        L_0x0040:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x0050
            boolean r6 = r4.V(r2)
            if (r6 == 0) goto L_0x004d
            r6 = 32
            goto L_0x004f
        L_0x004d:
            r6 = 16
        L_0x004f:
            r5 = r5 | r6
        L_0x0050:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0057
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0067
            boolean r6 = r4.V(r3)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r5 = r5 | r6
        L_0x0067:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0070
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r7 = r29
            goto L_0x0082
        L_0x0070:
            r7 = r10 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006d
            r7 = r29
            boolean r8 = r4.c(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r5 = r5 | r8
        L_0x0082:
            r8 = r11 & 16
            if (r8 == 0) goto L_0x008b
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r9 = r30
            goto L_0x009d
        L_0x008b:
            r9 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0088
            r9 = r30
            boolean r12 = r4.c(r9)
            if (r12 == 0) goto L_0x009a
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r5 = r5 | r12
        L_0x009d:
            r12 = r11 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r12 == 0) goto L_0x00a7
            r5 = r5 | r13
        L_0x00a4:
            r13 = r31
            goto L_0x00b8
        L_0x00a7:
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00a4
            r13 = r31
            boolean r14 = r4.V(r13)
            if (r14 == 0) goto L_0x00b5
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r5 = r5 | r14
        L_0x00b8:
            r14 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00d2
            r14 = r11 & 64
            if (r14 != 0) goto L_0x00cc
            r14 = r32
            boolean r15 = r4.V(r14)
            if (r15 == 0) goto L_0x00ce
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00cc:
            r14 = r32
        L_0x00ce:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r5 = r5 | r15
            goto L_0x00d4
        L_0x00d2:
            r14 = r32
        L_0x00d4:
            r15 = 12582912(0xc00000, float:1.7632415E-38)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00ef
            r15 = r11 & 128(0x80, float:1.794E-43)
            if (r15 != 0) goto L_0x00e8
            r15 = r33
            boolean r16 = r4.V(r15)
            if (r16 == 0) goto L_0x00ea
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00e8:
            r15 = r33
        L_0x00ea:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r5 = r5 | r16
            goto L_0x00f1
        L_0x00ef:
            r15 = r33
        L_0x00f1:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00fc
            r5 = r5 | r17
            r1 = r34
            goto L_0x010f
        L_0x00fc:
            r17 = r10 & r17
            r1 = r34
            if (r17 != 0) goto L_0x010f
            boolean r17 = r4.d(r1)
            if (r17 == 0) goto L_0x010b
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010d
        L_0x010b:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010d:
            r5 = r5 | r17
        L_0x010f:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r5 & r17
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r2) goto L_0x012a
            boolean r1 = r4.l()
            if (r1 != 0) goto L_0x0120
            goto L_0x012a
        L_0x0120:
            r4.L()
            r5 = r9
            r6 = r13
            r8 = r15
            r9 = r34
            goto L_0x0230
        L_0x012a:
            r4.G()
            r1 = r10 & 1
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r1 == 0) goto L_0x0153
            boolean r1 = r4.O()
            if (r1 == 0) goto L_0x013e
            goto L_0x0153
        L_0x013e:
            r4.L()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0147
            r5 = r5 & r17
        L_0x0147:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014c
            r5 = r5 & r2
        L_0x014c:
            r6 = r5
            r0 = r13
            r1 = r14
            r2 = r15
            r5 = r34
            goto L_0x018a
        L_0x0153:
            if (r6 == 0) goto L_0x0158
            r1 = 1082130432(0x40800000, float:4.0)
            r7 = r1
        L_0x0158:
            if (r8 == 0) goto L_0x015d
            r1 = 1090519040(0x41000000, float:8.0)
            r9 = r1
        L_0x015d:
            if (r12 == 0) goto L_0x016c
            p1.j1 r1 = new p1.j1
            p1.v0$a r6 = p1.C5747v0.f27350b
            long r12 = r6.f()
            r6 = 0
            r1.<init>(r12, r6)
            r13 = r1
        L_0x016c:
            r1 = r11 & 64
            if (r1 == 0) goto L_0x0177
            m0.D r1 = m0.M.d()
            r5 = r5 & r17
            r14 = r1
        L_0x0177:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0182
            m0.D r1 = m0.M.d()
            r2 = r2 & r5
            r15 = r1
            r5 = r2
        L_0x0182:
            if (r0 == 0) goto L_0x014c
            r0 = 0
            r6 = r5
            r1 = r14
            r2 = r15
            r5 = r0
            r0 = r13
        L_0x018a:
            r4.y()
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x019c
            r8 = -1
            java.lang.String r12 = "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.VectorHighlightGroup (VectorHighlightGroup.kt:33)"
            r13 = 427713405(0x197e637d, float:1.3151584E-23)
            U0.C4895p.S(r13, r6, r8, r12)
        L_0x019c:
            float r13 = r26.o()
            float r14 = r27.o()
            int r8 = r6 >> 15
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | 6
            int r12 = r6 >> 3
            r21 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r21
            r19 = r8 | r12
            r20 = 16
            java.lang.String r12 = "highlightTransitionX"
            r16 = 0
            r15 = r5
            r17 = r1
            r18 = r4
            U0.A1 r12 = ch.C9471a.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            float r22 = r12.floatValue()
            float r13 = r26.r()
            float r14 = r27.r()
            int r6 = r6 >> 6
            r6 = r6 & r21
            r19 = r8 | r6
            java.lang.String r12 = "highlightTransitionY"
            r17 = r2
            U0.A1 r6 = ch.C9471a.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r19 = r6.floatValue()
            bh.F$a r6 = new bh.F$a
            r29 = r6
            r30 = r26
            r31 = r27
            r32 = r7
            r33 = r0
            r34 = r9
            r35 = r28
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r8 = 54
            r12 = 883369842(0x34a72772, float:3.1134874E-7)
            r13 = 1
            c1.a r21 = c1.c.e(r12, r13, r6, r4, r8)
            r23 = 805306374(0x30000006, float:4.656616E-10)
            r24 = 318(0x13e, float:4.46E-43)
            java.lang.String r12 = "cardNumberHighlight"
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r18 = r22
            r22 = r4
            u1.o.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0228
            U0.C4895p.R()
        L_0x0228:
            r6 = r0
            r14 = r1
            r8 = r2
            r25 = r9
            r9 = r5
            r5 = r25
        L_0x0230:
            U0.Y0 r12 = r4.n()
            if (r12 == 0) goto L_0x024b
            bh.E r13 = new bh.E
            r0 = r13
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r7
            r7 = r14
            r10 = r36
            r11 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.F.b(o1.i, o1.i, bh.D, float, float, p1.l0, m0.D, m0.D, int, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C5669i iVar, C5669i iVar2, C9439D d10, float f10, float f11, C5728l0 l0Var, C5525D d11, C5525D d12, int i10, int i11, int i12, C4889m mVar, int i13) {
        b(iVar, iVar2, d10, f10, f11, l0Var, d11, d12, i10, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
