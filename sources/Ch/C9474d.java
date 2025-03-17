package ch;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import nI.p;
import p1.C5728l0;
import u1.C6006d;
import u1.o;
import u1.r;
import u1.u;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\f\u001a\u00020\u000b*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu1/d;", "", "pivotX", "pivotY", "Lp1/l0;", "fill", "LU0/A1;", "scale", "translationX", "translationY", "alpha", "LXH/N;", "b", "(Lu1/d;Ljava/lang/Float;Ljava/lang/Float;Lp1/l0;LU0/A1;LU0/A1;LU0/A1;LU0/A1;LU0/m;II)V", "giftcard-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ch.d  reason: case insensitive filesystem */
public final class C9474d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ch.d$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6006d f65781a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5728l0 f65782b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<Float> f65783c;

        a(C6006d dVar, C5728l0 l0Var, A1<Float> a12) {
            this.f65781a = dVar;
            this.f65782b = l0Var;
            this.f65783c = a12;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(273875477, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.vector.ToVectorGroup.<anonymous> (VectorImageExtensions.kt:32)");
                }
                u1.p<r> h10 = this.f65781a.h();
                C5728l0 l0Var = this.f65782b;
                A1<Float> a12 = this.f65783c;
                for (r rVar : h10) {
                    mVar.W(1698805002);
                    if (rVar instanceof u) {
                        u uVar = (u) rVar;
                        o.b(uVar.m(), 0, (String) null, l0Var == null ? uVar.b() : l0Var, a12 != null ? a12.getValue().floatValue() : 1.0f, (C5728l0) null, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, mVar, 0, 0, 16358);
                    }
                    mVar.P();
                }
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

    /* JADX WARNING: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(u1.C6006d r24, java.lang.Float r25, java.lang.Float r26, p1.C5728l0 r27, U0.A1<java.lang.Float> r28, U0.A1<java.lang.Float> r29, U0.A1<java.lang.Float> r30, U0.A1<java.lang.Float> r31, U0.C4889m r32, int r33, int r34) {
        /*
            r1 = r24
            r9 = r33
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            r0 = -971054496(0xffffffffc61ee260, float:-10168.594)
            r2 = r32
            U0.m r2 = r2.k(r0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r34 & r3
            if (r3 == 0) goto L_0x001b
            r3 = r9 | 6
            goto L_0x002b
        L_0x001b:
            r3 = r9 & 6
            if (r3 != 0) goto L_0x002a
            boolean r3 = r2.V(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r9
            goto L_0x002b
        L_0x002a:
            r3 = r9
        L_0x002b:
            r5 = r34 & 1
            if (r5 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r6 = r25
            goto L_0x0046
        L_0x0034:
            r6 = r9 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r25
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r3 = r3 | r7
        L_0x0046:
            r7 = r34 & 2
            if (r7 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r26
            goto L_0x0061
        L_0x004f:
            r8 = r9 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004c
            r8 = r26
            boolean r10 = r2.V(r8)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r10
        L_0x0061:
            r10 = r34 & 4
            if (r10 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r27
            goto L_0x007c
        L_0x006a:
            r11 = r9 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r27
            boolean r12 = r2.V(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r34 & 8
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r28
            goto L_0x0097
        L_0x0085:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r28
            boolean r14 = r2.V(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r34 & 16
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a1
            r3 = r3 | r15
        L_0x009e:
            r15 = r29
            goto L_0x00b3
        L_0x00a1:
            r15 = r15 & r9
            if (r15 != 0) goto L_0x009e
            r15 = r29
            boolean r16 = r2.V(r15)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = r34 & 32
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r3 = r3 | r17
            r4 = r30
            goto L_0x00d1
        L_0x00be:
            r17 = r9 & r17
            r4 = r30
            if (r17 != 0) goto L_0x00d1
            boolean r17 = r2.V(r4)
            if (r17 == 0) goto L_0x00cd
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r3 = r3 | r17
        L_0x00d1:
            r17 = r34 & 64
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r17 == 0) goto L_0x00dc
            r3 = r3 | r18
            r0 = r31
            goto L_0x00ef
        L_0x00dc:
            r18 = r9 & r18
            r0 = r31
            if (r18 != 0) goto L_0x00ef
            boolean r19 = r2.V(r0)
            if (r19 == 0) goto L_0x00eb
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r3 = r3 | r19
        L_0x00ef:
            r19 = 4793491(0x492493, float:6.717112E-39)
            r0 = r3 & r19
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r4) goto L_0x010d
            boolean r0 = r2.l()
            if (r0 != 0) goto L_0x0100
            goto L_0x010d
        L_0x0100:
            r2.L()
            r23 = r30
            r3 = r8
            r4 = r11
            r5 = r13
            r7 = r15
            r8 = r31
            goto L_0x01c6
        L_0x010d:
            r0 = 0
            if (r5 == 0) goto L_0x0111
            r6 = r0
        L_0x0111:
            if (r7 == 0) goto L_0x0114
            r8 = r0
        L_0x0114:
            if (r10 == 0) goto L_0x0118
            r4 = r0
            goto L_0x0119
        L_0x0118:
            r4 = r11
        L_0x0119:
            if (r12 == 0) goto L_0x011d
            r5 = r0
            goto L_0x011e
        L_0x011d:
            r5 = r13
        L_0x011e:
            if (r14 == 0) goto L_0x0122
            r7 = r0
            goto L_0x0123
        L_0x0122:
            r7 = r15
        L_0x0123:
            if (r16 == 0) goto L_0x0128
            r23 = r0
            goto L_0x012a
        L_0x0128:
            r23 = r30
        L_0x012a:
            if (r17 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r0 = r31
        L_0x012f:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x013e
            r10 = -1
            java.lang.String r11 = "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.vector.ToVectorGroup (VectorImageExtensions.kt:23)"
            r12 = -971054496(0xffffffffc61ee260, float:-10168.594)
            U0.C4895p.S(r12, r3, r10, r11)
        L_0x013e:
            if (r6 == 0) goto L_0x0147
            float r3 = r6.floatValue()
            r12 = r3
            r10 = 2
            goto L_0x014f
        L_0x0147:
            float r3 = r24.l()
            r10 = 2
            float r11 = (float) r10
            float r3 = r3 / r11
            r12 = r3
        L_0x014f:
            if (r8 == 0) goto L_0x0157
            float r3 = r8.floatValue()
        L_0x0155:
            r13 = r3
            goto L_0x015e
        L_0x0157:
            float r3 = r24.k()
            float r10 = (float) r10
            float r3 = r3 / r10
            goto L_0x0155
        L_0x015e:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x016e
            java.lang.Object r10 = r5.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            r14 = r10
            goto L_0x016f
        L_0x016e:
            r14 = r3
        L_0x016f:
            if (r5 == 0) goto L_0x017b
            java.lang.Object r3 = r5.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
        L_0x017b:
            r15 = r3
            r3 = 0
            if (r7 == 0) goto L_0x018c
            java.lang.Object r10 = r7.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            r16 = r10
            goto L_0x018e
        L_0x018c:
            r16 = r3
        L_0x018e:
            if (r23 == 0) goto L_0x019a
            java.lang.Object r3 = r23.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
        L_0x019a:
            r17 = r3
            ch.d$a r3 = new ch.d$a
            r3.<init>(r1, r4, r0)
            r10 = 54
            r11 = 273875477(0x10530215, float:4.1614017E-29)
            r25 = r0
            r0 = 1
            c1.a r19 = c1.c.e(r11, r0, r3, r2, r10)
            r21 = 805306368(0x30000000, float:4.656613E-10)
            r22 = 259(0x103, float:3.63E-43)
            r10 = 0
            r11 = 0
            r18 = 0
            r20 = r2
            u1.o.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01c3
            U0.C4895p.R()
        L_0x01c3:
            r3 = r8
            r8 = r25
        L_0x01c6:
            U0.Y0 r11 = r2.n()
            if (r11 == 0) goto L_0x01df
            ch.c r12 = new ch.c
            r0 = r12
            r1 = r24
            r2 = r6
            r6 = r7
            r7 = r23
            r9 = r33
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x01df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.C9474d.b(u1.d, java.lang.Float, java.lang.Float, p1.l0, U0.A1, U0.A1, U0.A1, U0.A1, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C6006d dVar, Float f10, Float f11, C5728l0 l0Var, A1 a12, A1 a13, A1 a14, A1 a15, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, f10, f11, l0Var, a12, a13, a14, a15, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
