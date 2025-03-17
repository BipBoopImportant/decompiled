package wK;

import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import c2.r;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n1.C5626f;
import nI.C17642l;
import nI.q;
import r0.l;
import r0.m;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0001\u0010\u0016\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0001\u0010\u001c\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006#²\u0006\u000e\u0010\u001e\u001a\u00020\u00068\n@\nX\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00068\n@\nX\u0002²\u0006\u000e\u0010!\u001a\u00020 8\n@\nX\u0002²\u0006\u000e\u0010\"\u001a\u00020\u00018\n@\nX\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u0002"}, d2 = {"T", "", "hint", "label", "LwK/R8;", "selectItemsParams", "", "expanded", "Lkotlin/Function1;", "LXH/N;", "onClick", "onClickContentDescription", "Landroidx/compose/ui/d;", "modifier", "", "iconId", "helperText", "enabled", "Lr0/m;", "interactionSource", "LwK/N;", "state", "g", "(Ljava/lang/String;Ljava/lang/String;LwK/R8;ZLnI/l;Ljava/lang/String;Landroidx/compose/ui/d;Ljava/lang/Integer;Ljava/lang/String;ZLr0/m;LwK/N;LU0/m;III)V", "placeholder", "value", "LwK/Q8;", "selectInteractionParams", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LwK/R8;LwK/Q8;ZLandroidx/compose/ui/d;Ljava/lang/Integer;Ljava/lang/String;Lr0/m;LwK/N;LU0/m;III)V", "selected", "shouldBeFocus", "Lc2/h;", "width", "selectValue", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class X8 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<d, C4889m, Integer, d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f150400a;

        a(C4899r0<h> r0Var) {
            this.f150400a = r0Var;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckTrue");
            mVar.W(-1623467229);
            if (C4895p.J()) {
                C4895p.S(-1623467229, i10, -1, "net.ikea.skapa.ui.components.Select.<anonymous>.<anonymous> (Select.kt:155)");
            }
            d y10 = J.y(dVar, X8.i(this.f150400a));
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return y10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: wK.V8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v3, resolved type: wK.V8} */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042e, code lost:
        if (r1.F(r40) != false) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x044b, code lost:
        if (r8 == r20.a()) goto L_0x044d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void f(java.lang.String r37, java.lang.String r38, java.lang.String r39, wK.R8<T> r40, wK.Q8 r41, boolean r42, androidx.compose.ui.d r43, java.lang.Integer r44, java.lang.String r45, r0.m r46, wK.C18245N r47, U0.C4889m r48, int r49, int r50, int r51) {
        /*
            r1 = r37
            r0 = r38
            r15 = r39
            r14 = r40
            r13 = r41
            r9 = r49
            r8 = r51
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = 128(0x80, float:1.794E-43)
            r6 = 256(0x100, float:3.59E-43)
            r7 = 16
            r10 = 32
            r12 = 6
            java.lang.String r11 = "placeholder"
            kotlin.jvm.internal.C17542s.j(r1, r11)
            java.lang.String r11 = "label"
            kotlin.jvm.internal.C17542s.j(r0, r11)
            java.lang.String r11 = "selectItemsParams"
            kotlin.jvm.internal.C17542s.j(r14, r11)
            java.lang.String r11 = "selectInteractionParams"
            kotlin.jvm.internal.C17542s.j(r13, r11)
            r11 = -1806044623(0xffffffff9459f231, float:-1.1003464E-26)
            r4 = r48
            U0.m r4 = r4.k(r11)
            r19 = 1
            r17 = r8 & 1
            r18 = 4
            r11 = 2
            if (r17 == 0) goto L_0x0042
            r17 = r9 | 6
            goto L_0x0056
        L_0x0042:
            r17 = r9 & 6
            if (r17 != 0) goto L_0x0054
            boolean r17 = r4.V(r1)
            if (r17 == 0) goto L_0x004f
            r17 = r18
            goto L_0x0051
        L_0x004f:
            r17 = r11
        L_0x0051:
            r17 = r9 | r17
            goto L_0x0056
        L_0x0054:
            r17 = r9
        L_0x0056:
            r21 = r8 & 2
            if (r21 == 0) goto L_0x005f
            r17 = r17 | 48
        L_0x005c:
            r11 = r17
            goto L_0x0071
        L_0x005f:
            r21 = r9 & 48
            if (r21 != 0) goto L_0x005c
            boolean r21 = r4.V(r0)
            if (r21 == 0) goto L_0x006c
            r21 = r10
            goto L_0x006e
        L_0x006c:
            r21 = r7
        L_0x006e:
            r17 = r17 | r21
            goto L_0x005c
        L_0x0071:
            r17 = r8 & 4
            if (r17 == 0) goto L_0x0078
            r11 = r11 | 384(0x180, float:5.38E-43)
            goto L_0x0086
        L_0x0078:
            r12 = r9 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0086
            boolean r12 = r4.V(r15)
            if (r12 == 0) goto L_0x0084
            r12 = r6
            goto L_0x0085
        L_0x0084:
            r12 = r5
        L_0x0085:
            r11 = r11 | r12
        L_0x0086:
            r12 = r8 & 8
            if (r12 == 0) goto L_0x008d
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a6
        L_0x008d:
            r12 = r9 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x00a6
            r12 = r9 & 4096(0x1000, float:5.74E-42)
            if (r12 != 0) goto L_0x009a
            boolean r12 = r4.V(r14)
            goto L_0x009e
        L_0x009a:
            boolean r12 = r4.F(r14)
        L_0x009e:
            if (r12 == 0) goto L_0x00a3
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x00a5
        L_0x00a3:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x00a5:
            r11 = r11 | r12
        L_0x00a6:
            r7 = r7 & r8
            if (r7 == 0) goto L_0x00ac
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bc
        L_0x00ac:
            r7 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x00bc
            boolean r7 = r4.V(r13)
            if (r7 == 0) goto L_0x00b9
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00bb
        L_0x00b9:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x00bb:
            r11 = r11 | r7
        L_0x00bc:
            r7 = r8 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L_0x00c6
            r11 = r11 | r10
            r10 = r42
            goto L_0x00d8
        L_0x00c6:
            r7 = r9 & r10
            r10 = r42
            if (r7 != 0) goto L_0x00d8
            boolean r7 = r4.b(r10)
            if (r7 == 0) goto L_0x00d5
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d7
        L_0x00d5:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00d7:
            r11 = r11 | r7
        L_0x00d8:
            r7 = r8 & 64
            r22 = 1572864(0x180000, float:2.204052E-39)
            if (r7 == 0) goto L_0x00e3
            r11 = r11 | r22
            r2 = r43
            goto L_0x00f6
        L_0x00e3:
            r22 = r9 & r22
            r2 = r43
            if (r22 != 0) goto L_0x00f6
            boolean r23 = r4.V(r2)
            if (r23 == 0) goto L_0x00f2
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f4
        L_0x00f2:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00f4:
            r11 = r11 | r23
        L_0x00f6:
            r5 = r5 & r8
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x0100
            r11 = r11 | r23
            r12 = r44
            goto L_0x0113
        L_0x0100:
            r23 = r9 & r23
            r12 = r44
            if (r23 != 0) goto L_0x0113
            boolean r24 = r4.V(r12)
            if (r24 == 0) goto L_0x010f
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0111
        L_0x010f:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x0111:
            r11 = r11 | r24
        L_0x0113:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x011a
            r11 = r11 | r3
        L_0x0117:
            r3 = r45
            goto L_0x012c
        L_0x011a:
            r3 = r3 & r9
            if (r3 != 0) goto L_0x0117
            r3 = r45
            boolean r24 = r4.V(r3)
            if (r24 == 0) goto L_0x0128
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r11 = r11 | r24
        L_0x012c:
            r0 = r8 & 512(0x200, float:7.175E-43)
            r21 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0137
        L_0x0132:
            r11 = r11 | r21
        L_0x0134:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x0149
        L_0x0137:
            r21 = r9 & r21
            r1 = r46
            if (r21 != 0) goto L_0x0134
            boolean r21 = r4.V(r1)
            if (r21 == 0) goto L_0x0146
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0132
        L_0x0146:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0132
        L_0x0149:
            r1 = r1 & r8
            r16 = 6
            if (r1 == 0) goto L_0x0153
            r17 = r50 | 6
        L_0x0150:
            r2 = r17
            goto L_0x0167
        L_0x0153:
            r17 = r50 & 6
            r2 = r47
            if (r17 != 0) goto L_0x0165
            boolean r17 = r4.V(r2)
            if (r17 == 0) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            r18 = 2
        L_0x0162:
            r17 = r50 | r18
            goto L_0x0150
        L_0x0165:
            r2 = r50
        L_0x0167:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r11 & r17
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r8) goto L_0x018d
            r3 = r2 & 3
            r8 = 2
            if (r3 != r8) goto L_0x018d
            boolean r3 = r4.l()
            if (r3 != 0) goto L_0x017d
            goto L_0x018d
        L_0x017d:
            r4.L()
            r7 = r43
            r9 = r45
            r10 = r46
            r11 = r47
            r1 = r4
            r8 = r12
            r5 = r14
            goto L_0x0495
        L_0x018d:
            if (r7 == 0) goto L_0x0193
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r8 = r3
            goto L_0x0195
        L_0x0193:
            r8 = r43
        L_0x0195:
            r3 = 0
            if (r5 == 0) goto L_0x019b
            r28 = r3
            goto L_0x019d
        L_0x019b:
            r28 = r12
        L_0x019d:
            if (r6 == 0) goto L_0x01a2
            r29 = r3
            goto L_0x01a4
        L_0x01a2:
            r29 = r45
        L_0x01a4:
            if (r0 == 0) goto L_0x01c5
            r0 = 2038454772(0x798059f4, float:8.330481E34)
            r4.W(r0)
            java.lang.Object r0 = r4.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r0 != r5) goto L_0x01bf
            r0.m r0 = r0.l.a()
            r4.u(r0)
        L_0x01bf:
            r0.m r0 = (r0.m) r0
            r4.P()
            goto L_0x01c7
        L_0x01c5:
            r0 = r46
        L_0x01c7:
            if (r1 == 0) goto L_0x01cc
            wK.N r1 = wK.C18245N.Default
            goto L_0x01ce
        L_0x01cc:
            r1 = r47
        L_0x01ce:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x01dc
            java.lang.String r5 = "net.ikea.skapa.ui.components.Select (Select.kt:114)"
            r6 = -1806044623(0xffffffff9459f231, float:-1.1003464E-26)
            U0.C4895p.S(r6, r11, r2, r5)
        L_0x01dc:
            r5 = 2038458986(0x79806a6a, float:8.334654E34)
            r4.W(r5)
            java.lang.Object r5 = r4.D()
            U0.m$a r20 = U0.C4889m.f14007a
            java.lang.Object r6 = r20.a()
            if (r5 != r6) goto L_0x01f6
            androidx.compose.ui.focus.m r5 = new androidx.compose.ui.focus.m
            r5.<init>()
            r4.u(r5)
        L_0x01f6:
            r6 = r5
            androidx.compose.ui.focus.m r6 = (androidx.compose.ui.focus.m) r6
            r4.P()
            r5 = 2038460624(0x798070d0, float:8.336276E34)
            r4.W(r5)
            java.lang.Object r5 = r4.D()
            java.lang.Object r7 = r20.a()
            r12 = 0
            if (r5 != r7) goto L_0x0223
            java.lang.Object r5 = r40.g()
            if (r5 == 0) goto L_0x0216
            r5 = r19
            goto L_0x0217
        L_0x0216:
            r5 = r12
        L_0x0217:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7 = 2
            U0.r0 r5 = U0.u1.e(r5, r3, r7, r3)
            r4.u(r5)
        L_0x0223:
            r21 = r5
            U0.r0 r21 = (U0.C4899r0) r21
            r4.P()
            r5 = 2038463567(0x79807c4f, float:8.339191E34)
            r4.W(r5)
            java.lang.Object r5 = r4.D()
            java.lang.Object r7 = r20.a()
            if (r5 != r7) goto L_0x0244
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r7 = 2
            U0.r0 r5 = U0.u1.e(r5, r3, r7, r3)
            r4.u(r5)
        L_0x0244:
            r24 = r5
            U0.r0 r24 = (U0.C4899r0) r24
            r4.P()
            U0.I0 r5 = androidx.compose.ui.platform.C5100f0.f()
            java.lang.Object r5 = r4.Q(r5)
            n1.f r5 = (n1.C5626f) r5
            r7 = 2038466830(0x7980890e, float:8.342422E34)
            r4.W(r7)
            java.lang.Object r7 = r4.D()
            java.lang.Object r3 = r20.a()
            if (r7 != r3) goto L_0x0278
            float r3 = (float) r12
            float r3 = c2.h.B(r3)
            c2.h r3 = c2.h.m(r3)
            r7 = 2
            r12 = 0
            U0.r0 r3 = U0.u1.e(r3, r12, r7, r12)
            r4.u(r3)
            r7 = r3
        L_0x0278:
            r3 = r7
            U0.r0 r3 = (U0.C4899r0) r3
            r4.P()
            U0.I0 r7 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r7 = r4.Q(r7)
            c2.d r7 = (c2.d) r7
            r12 = 2038470127(0x798095ef, float:8.345688E34)
            r4.W(r12)
            java.lang.Object r12 = r4.D()
            r45 = r5
            java.lang.Object r5 = r20.a()
            if (r12 != r5) goto L_0x02a5
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r9 = 0
            r12 = 2
            U0.r0 r12 = U0.u1.e(r5, r9, r12, r9)
            r4.u(r12)
        L_0x02a5:
            U0.r0 r12 = (U0.C4899r0) r12
            r4.P()
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c r5 = r5.o()
            r14 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r14)
            int r17 = U0.C4883j.a(r4, r14)
            U0.y r14 = r4.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r4, r9)
            G1.g$a r18 = G1.C4504g.f6515W
            r43 = r9
            nI.a r9 = r18.a()
            U0.f r25 = r4.m()
            if (r25 != 0) goto L_0x02d4
            U0.C4883j.c()
        L_0x02d4:
            r4.I()
            boolean r25 = r4.i()
            if (r25 == 0) goto L_0x02e1
            r4.p(r9)
            goto L_0x02e4
        L_0x02e1:
            r4.t()
        L_0x02e4:
            U0.m r9 = U0.F1.a(r4)
            r30 = r1
            nI.p r1 = r18.c()
            U0.F1.c(r9, r5, r1)
            nI.p r1 = r18.e()
            U0.F1.c(r9, r14, r1)
            nI.p r1 = r18.b()
            boolean r5 = r9.i()
            if (r5 != 0) goto L_0x0310
            java.lang.Object r5 = r9.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r17)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r14)
            if (r5 != 0) goto L_0x031e
        L_0x0310:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r9.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r9.w(r5, r1)
        L_0x031e:
            nI.p r1 = r18.d()
            U0.F1.c(r9, r10, r1)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            if (r15 == 0) goto L_0x0332
            boolean r1 = HJ.C15854t.v0(r39)
            if (r1 == 0) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            r1 = 0
            goto L_0x0334
        L_0x0332:
            r1 = r19
        L_0x0334:
            if (r1 == 0) goto L_0x0339
            r1 = r37
            goto L_0x033a
        L_0x0339:
            r1 = r15
        L_0x033a:
            r5 = -832080767(0xffffffffce677481, float:-9.7079302E8)
            r4.W(r5)
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r11
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r9) goto L_0x034b
            r5 = r19
            goto L_0x034c
        L_0x034b:
            r5 = 0
        L_0x034c:
            java.lang.Object r9 = r4.D()
            if (r5 != 0) goto L_0x0358
            java.lang.Object r5 = r20.a()
            if (r9 != r5) goto L_0x0360
        L_0x0358:
            wK.T8 r9 = new wK.T8
            r9.<init>(r12, r13)
            r4.u(r9)
        L_0x0360:
            r5 = r9
            nI.l r5 = (nI.C17642l) r5
            r4.P()
            java.lang.String r9 = r41.c()
            androidx.compose.ui.d r10 = androidx.compose.ui.focus.n.a(r8, r6)
            r12 = -832069143(0xffffffffce67a1e9, float:-9.7153696E8)
            r4.W(r12)
            boolean r12 = r4.V(r7)
            java.lang.Object r14 = r4.D()
            if (r12 != 0) goto L_0x0384
            java.lang.Object r12 = r20.a()
            if (r14 != r12) goto L_0x038c
        L_0x0384:
            wK.U8 r14 = new wK.U8
            r14.<init>(r7, r3)
            r4.u(r14)
        L_0x038c:
            nI.l r14 = (nI.C17642l) r14
            r4.P()
            androidx.compose.ui.d r7 = androidx.compose.ui.layout.g.a(r10, r14)
            boolean r10 = r41.a()
            boolean r12 = o(r21)
            r14 = r11
            r11 = r12
            boolean r12 = q(r24)
            r44 = r7
            r7 = r16
            r23 = 0
            r16 = r14 & 112(0x70, float:1.57E-43)
            r46 = r3
            int r3 = r14 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r16 | r3
            int r16 = r14 >> 3
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r16 & r17
            r3 = r3 | r17
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r16 & r17
            r16 = r3 | r16
            int r3 = r14 >> 24
            r3 = r3 & 112(0x70, float:1.57E-43)
            int r2 = r2 << r7
            r2 = r2 & 896(0x380, float:1.256E-42)
            r17 = r3 | r2
            r18 = 0
            r3 = 2048(0x800, float:2.87E-42)
            r2 = r1
            r1 = r46
            r3 = r38
            r31 = r4
            r4 = r5
            r32 = r45
            r5 = r42
            r25 = r6
            r6 = r9
            r33 = r8
            r8 = r28
            r34 = r43
            r9 = r29
            r13 = r0
            r35 = r0
            r0 = r14
            r14 = r30
            r15 = r31
            r26 = r0
            r0 = r7
            r7 = r44
            wK.K2.q(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List r18 = r40.d()
            nI.q r2 = r40.b()
            nI.a r3 = r40.e()
            boolean r4 = r40.a()
            wK.X8$a r5 = new wK.X8$a
            r5.<init>(r1)
            r1 = r31
            r6 = r34
            androidx.compose.ui.d r0 = vK.C18205e.h(r6, r4, r5, r1, r0)
            s0.E r4 = r40.c()
            r5 = -832043071(0xffffffffce6807c1, float:-9.7320557E8)
            r1.W(r5)
            r11 = r26
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 == r6) goto L_0x0438
            r5 = r11 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x0431
            r5 = r40
            boolean r6 = r1.F(r5)
            if (r6 == 0) goto L_0x0433
            goto L_0x0435
        L_0x0431:
            r5 = r40
        L_0x0433:
            r19 = r23
        L_0x0435:
            r6 = r32
            goto L_0x043b
        L_0x0438:
            r5 = r40
            goto L_0x0435
        L_0x043b:
            boolean r7 = r1.F(r6)
            r7 = r19 | r7
            java.lang.Object r8 = r1.D()
            if (r7 != 0) goto L_0x044d
            java.lang.Object r7 = r20.a()
            if (r8 != r7) goto L_0x0461
        L_0x044d:
            wK.V8 r8 = new wK.V8
            r43 = r8
            r44 = r40
            r45 = r6
            r46 = r25
            r47 = r21
            r48 = r24
            r43.<init>(r44, r45, r46, r47, r48)
            r1.u(r8)
        L_0x0461:
            r24 = r8
            nI.l r24 = (nI.C17642l) r24
            r1.P()
            int r6 = r11 >> 15
            r26 = r6 & 14
            r27 = 64
            r23 = 0
            r17 = r42
            r19 = r2
            r20 = r3
            r21 = r0
            r22 = r4
            r25 = r1
            wK.C18418n4.l(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x048b
            U0.C4895p.R()
        L_0x048b:
            r8 = r28
            r9 = r29
            r11 = r30
            r7 = r33
            r10 = r35
        L_0x0495:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x04ba
            wK.W8 r14 = new wK.W8
            r0 = r14
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r12 = r49
            r13 = r50
            r36 = r14
            r14 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r36
            r15.a(r0)
        L_0x04ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.X8.f(java.lang.String, java.lang.String, java.lang.String, wK.R8, wK.Q8, boolean, androidx.compose.ui.d, java.lang.Integer, java.lang.String, r0.m, wK.N, U0.m, int, int, int):void");
    }

    public static final <T> void g(String str, String str2, R8<T> r82, boolean z10, C17642l<? super Boolean, C16807N> lVar, String str3, d dVar, Integer num, String str4, boolean z11, m mVar, C18245N n10, C4889m mVar2, int i10, int i11, int i12) {
        int i13;
        int i14;
        C4889m mVar3;
        C18245N n11;
        m mVar4;
        boolean z12;
        String str5;
        Integer num2;
        d dVar2;
        m mVar5;
        String str6 = str;
        String str7 = str2;
        R8<T> r83 = r82;
        C17642l<? super Boolean, C16807N> lVar2 = lVar;
        String str8 = str3;
        int i15 = i10;
        int i16 = i12;
        C17542s.j(str6, "hint");
        C17542s.j(str7, "label");
        C17542s.j(r83, "selectItemsParams");
        C17542s.j(lVar2, "onClick");
        C4889m k10 = mVar2.k(476712412);
        if ((i16 & 1) != 0) {
            i13 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i13 = (k10.V(str6) ? 4 : 2) | i15;
        } else {
            i13 = i15;
        }
        if ((i16 & 2) != 0) {
            i13 |= 48;
        } else if ((i15 & 48) == 0) {
            i13 |= k10.V(str7) ? 32 : 16;
        }
        if ((i16 & 4) != 0) {
            i13 |= 384;
        } else if ((i15 & 384) == 0) {
            i13 |= (i15 & 512) == 0 ? k10.V(r83) : k10.F(r83) ? 256 : 128;
        }
        if ((i16 & 8) != 0) {
            i13 |= 3072;
            boolean z13 = z10;
        } else {
            boolean z14 = z10;
            if ((i15 & 3072) == 0) {
                i13 |= k10.b(z14) ? RecyclerView.n.FLAG_MOVED : 1024;
            }
        }
        if ((i16 & 16) != 0) {
            i13 |= 24576;
        } else if ((i15 & 24576) == 0) {
            i13 |= k10.F(lVar2) ? 16384 : 8192;
        }
        if ((i16 & 32) != 0) {
            i13 |= ImageMetadata.EDGE_MODE;
        } else if ((i15 & ImageMetadata.EDGE_MODE) == 0) {
            i13 |= k10.V(str8) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i17 = i16 & 64;
        if (i17 != 0) {
            i13 |= 1572864;
            d dVar3 = dVar;
        } else {
            d dVar4 = dVar;
            if ((i15 & 1572864) == 0) {
                i13 |= k10.V(dVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
            }
        }
        int i18 = i16 & 128;
        if (i18 != 0) {
            i13 |= 12582912;
            Integer num3 = num;
        } else {
            Integer num4 = num;
            if ((i15 & 12582912) == 0) {
                i13 |= k10.V(num4) ? 8388608 : 4194304;
            }
        }
        int i19 = i16 & 256;
        if (i19 != 0) {
            i13 |= 100663296;
            String str9 = str4;
        } else {
            String str10 = str4;
            if ((i15 & 100663296) == 0) {
                i13 |= k10.V(str10) ? 67108864 : 33554432;
            }
        }
        int i20 = i16 & 512;
        if (i20 != 0) {
            i13 |= 805306368;
            boolean z15 = z11;
        } else {
            boolean z16 = z11;
            if ((i15 & 805306368) == 0) {
                i13 |= k10.b(z16) ? 536870912 : 268435456;
            }
        }
        int i21 = i16 & 1024;
        if (i21 != 0) {
            i14 = i11 | 6;
            m mVar6 = mVar;
        } else {
            m mVar7 = mVar;
            if ((i11 & 6) == 0) {
                i14 = i11 | (k10.V(mVar7) ? 4 : 2);
            } else {
                i14 = i11;
            }
        }
        int i22 = i16 & RecyclerView.n.FLAG_MOVED;
        if (i22 != 0) {
            i14 |= 48;
        } else {
            C18245N n12 = n10;
            if ((i11 & 48) == 0) {
                i14 |= k10.V(n12) ? 32 : 16;
            }
        }
        int i23 = i14;
        if ((i13 & 306783379) == 306783378 && (i23 & 19) == 18 && k10.l()) {
            k10.L();
            dVar2 = dVar;
            str5 = str4;
            z12 = z11;
            mVar4 = mVar;
            n11 = n10;
            mVar3 = k10;
            num2 = num;
        } else {
            d.a aVar = i17 != 0 ? d.f18749a : dVar;
            Integer num5 = i18 != 0 ? null : num;
            String str11 = i19 != 0 ? null : str4;
            boolean z17 = i20 != 0 ? true : z11;
            if (i21 != 0) {
                k10.W(2038373812);
                Object D10 = k10.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = l.a();
                    k10.u(D10);
                }
                k10.P();
                mVar5 = (m) D10;
            } else {
                mVar5 = mVar;
            }
            C18245N n13 = i22 != 0 ? C18245N.Default : n10;
            if (C4895p.J()) {
                C4895p.S(476712412, i13, i23, "net.ikea.skapa.ui.components.Select (Select.kt:60)");
            }
            int i24 = i13 << 6;
            mVar3 = k10;
            boolean z18 = z17;
            f(str, str2, str, r82, new Q8(lVar2, str8, z17), z10, aVar, num5, str11, mVar5, n13, mVar3, (i13 & 126) | (i24 & 896) | ((i13 << 3) & 7168) | (i24 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i13) | (29360128 & i13) | (i13 & 234881024) | ((i23 << 27) & 1879048192), (i23 >> 3) & 14, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar;
            num2 = num5;
            str5 = str11;
            mVar4 = mVar5;
            n11 = n13;
            z12 = z18;
        }
        Y0 n14 = mVar3.n();
        if (n14 != null) {
            S8 s82 = r0;
            S8 s83 = new S8(str, str2, r82, z10, lVar, str3, dVar2, num2, str5, z12, mVar4, n11, i10, i11, i12);
            n14.a(s82);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(String str, String str2, R8 r82, boolean z10, C17642l lVar, String str3, d dVar, Integer num, String str4, boolean z11, m mVar, C18245N n10, int i10, int i11, int i12, C4889m mVar2, int i13) {
        g(str, str2, r82, z10, lVar, str3, dVar, num, str4, z11, mVar, n10, mVar2, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final float i(C4899r0<h> r0Var) {
        return r0Var.getValue().G();
    }

    private static final void j(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C4899r0 r0Var, Q8 q82, boolean z10) {
        Boolean bool = Boolean.TRUE;
        r0Var.setValue(bool);
        q82.b().invoke(bool);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(c2.d dVar, C4899r0 r0Var, r rVar) {
        j(r0Var, dVar.H(r.h(rVar.k())));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(R8 r82, C5626f fVar, androidx.compose.ui.focus.m mVar, C4899r0 r0Var, C4899r0 r0Var2, Object obj) {
        p(r0Var, true);
        r(r0Var2, false);
        r82.f().invoke(obj);
        r82.e().invoke();
        fVar.r(true);
        mVar.f();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(String str, String str2, String str3, R8 r82, Q8 q82, boolean z10, d dVar, Integer num, String str4, m mVar, C18245N n10, int i10, int i11, int i12, C4889m mVar2, int i13) {
        f(str, str2, str3, r82, q82, z10, dVar, num, str4, mVar, n10, mVar2, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    private static final boolean o(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void p(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final boolean q(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void r(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }
}
