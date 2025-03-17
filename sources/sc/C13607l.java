package SC;

import IC.C13023e;
import KJ.C15988d;
import L1.v;
import L1.x;
import N1.C4669d;
import N1.E;
import N1.P;
import N1.Y;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U1.e;
import XH.C16807N;
import XH.t;
import Y1.a;
import Y1.f;
import Y1.h;
import Y1.j;
import Y1.k;
import Y1.o;
import Y1.q;
import Y1.s;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import p1.g1;
import r1.g;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÙ\u0001\u0010#\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001fH\u0007¢\u0006\u0004\b#\u0010$\u001aí\u0001\u0010)\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0&2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0007¢\u0006\u0004\b)\u0010*\u001aÙ\u0001\u0010,\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001fH\u0007¢\u0006\u0004\b,\u0010-\u001a\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b.\u0010/\u001a\u001d\u00101\u001a\u000200*\u0002002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"", "text", "LTC/b;", "style", "Landroidx/compose/ui/d;", "modifier", "Lp1/v0;", "color", "Lc2/v;", "fontSize", "LS1/x;", "fontStyle", "LS1/C;", "fontWeight", "LS1/m;", "fontFamily", "letterSpacing", "LY1/k;", "textDecoration", "LY1/j;", "textAlign", "LY1/f;", "lineBreak", "lineHeight", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "LN1/P;", "LXH/N;", "onTextLayout", "j", "(Ljava/lang/String;LTC/b;Landroidx/compose/ui/d;JJLS1/x;LS1/C;LS1/m;JLY1/k;LY1/j;LY1/f;JIZIILnI/l;LU0/m;III)V", "LN1/d;", "LKJ/d;", "LB0/q;", "inlineContent", "h", "(LN1/d;LTC/b;Landroidx/compose/ui/d;JJLS1/x;LS1/C;LS1/m;JLY1/k;LY1/j;LY1/f;JIZIILKJ/d;LnI/l;LU0/m;III)V", "LIC/e;", "i", "(LIC/e;LTC/b;Landroidx/compose/ui/d;JJLS1/x;LS1/C;LS1/m;JLY1/k;LY1/j;LY1/f;JIZIILnI/l;LU0/m;III)V", "r", "(LTC/b;LU0/m;I)Z", "LN1/Y;", "s", "(LN1/Y;LY1/f;LU0/m;I)LN1/Y;", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.l  reason: case insensitive filesystem */
public final class C13607l {
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(N1.C4669d r50, TC.C13679b r51, androidx.compose.ui.d r52, long r53, long r55, S1.C4830x r57, S1.C r58, S1.C4820m r59, long r60, Y1.k r62, Y1.j r63, Y1.f r64, long r65, int r67, boolean r68, int r69, int r70, KJ.C15988d<java.lang.String, B0.C4373q> r71, nI.C17642l<? super N1.P, XH.C16807N> r72, U0.C4889m r73, int r74, int r75, int r76) {
        /*
            r15 = r50
            r13 = r51
            r14 = r74
            r12 = r75
            r11 = r76
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "style"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = -793350514(0xffffffffd0b66e8e, float:-2.4485589E10)
            r1 = r73
            U0.m r9 = r1.k(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r14 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r14 & 6
            if (r0 != 0) goto L_0x0033
            boolean r0 = r9.V(r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r14
            goto L_0x0034
        L_0x0033:
            r0 = r14
        L_0x0034:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x004b
            boolean r3 = r9.V(r13)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0054
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r8 = r52
            goto L_0x0066
        L_0x0054:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0051
            r8 = r52
            boolean r10 = r9.V(r8)
            if (r10 == 0) goto L_0x0063
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r10
        L_0x0066:
            r10 = r11 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0073
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r4 = r53
            goto L_0x0086
        L_0x0073:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            r4 = r53
            if (r1 != 0) goto L_0x0086
            boolean r19 = r9.e(r4)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r16
        L_0x0084:
            r0 = r0 | r19
        L_0x0086:
            r19 = r11 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0093
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r6 = r55
            goto L_0x00a6
        L_0x0093:
            r1 = r14 & 24576(0x6000, float:3.4438E-41)
            r6 = r55
            if (r1 != 0) goto L_0x00a6
            boolean r24 = r9.e(r6)
            if (r24 == 0) goto L_0x00a2
            r24 = r21
            goto L_0x00a4
        L_0x00a2:
            r24 = r20
        L_0x00a4:
            r0 = r0 | r24
        L_0x00a6:
            r24 = r11 & 32
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x00b3
            r0 = r0 | r26
            r1 = r57
            goto L_0x00c6
        L_0x00b3:
            r27 = r14 & r26
            r1 = r57
            if (r27 != 0) goto L_0x00c6
            boolean r28 = r9.V(r1)
            if (r28 == 0) goto L_0x00c2
            r28 = r25
            goto L_0x00c4
        L_0x00c2:
            r28 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r0 = r0 | r28
        L_0x00c6:
            r28 = r11 & 64
            r29 = 1572864(0x180000, float:2.204052E-39)
            if (r28 == 0) goto L_0x00d1
            r0 = r0 | r29
            r2 = r58
            goto L_0x00e4
        L_0x00d1:
            r30 = r14 & r29
            r2 = r58
            if (r30 != 0) goto L_0x00e4
            boolean r31 = r9.V(r2)
            if (r31 == 0) goto L_0x00e0
            r31 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r31 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r0 = r0 | r31
        L_0x00e4:
            r1 = r11 & 128(0x80, float:1.794E-43)
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00ef
            r0 = r0 | r31
            r2 = r59
            goto L_0x0102
        L_0x00ef:
            r32 = r14 & r31
            r2 = r59
            if (r32 != 0) goto L_0x0102
            boolean r32 = r9.V(r2)
            if (r32 == 0) goto L_0x00fe
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r0 = r0 | r32
        L_0x0102:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010d
            r0 = r0 | r32
            r4 = r60
            goto L_0x0120
        L_0x010d:
            r33 = r14 & r32
            r4 = r60
            if (r33 != 0) goto L_0x0120
            boolean r33 = r9.e(r4)
            if (r33 == 0) goto L_0x011c
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r0 = r0 | r33
        L_0x0120:
            r4 = r11 & 512(0x200, float:7.175E-43)
            r5 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x012a
            r0 = r0 | r5
        L_0x0127:
            r5 = r62
            goto L_0x013c
        L_0x012a:
            r5 = r5 & r14
            if (r5 != 0) goto L_0x0127
            r5 = r62
            boolean r33 = r9.V(r5)
            if (r33 == 0) goto L_0x0138
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r0 = r0 | r33
        L_0x013c:
            r5 = r11 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0145
            r30 = r12 | 6
            r6 = r63
            goto L_0x015b
        L_0x0145:
            r33 = r12 & 6
            r6 = r63
            if (r33 != 0) goto L_0x0159
            boolean r7 = r9.V(r6)
            if (r7 == 0) goto L_0x0154
            r30 = 4
            goto L_0x0156
        L_0x0154:
            r30 = 2
        L_0x0156:
            r30 = r12 | r30
            goto L_0x015b
        L_0x0159:
            r30 = r12
        L_0x015b:
            r7 = r11 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0164
            r30 = r30 | 48
        L_0x0161:
            r6 = r30
            goto L_0x0178
        L_0x0164:
            r33 = r12 & 48
            r6 = r64
            if (r33 != 0) goto L_0x0161
            boolean r33 = r9.V(r6)
            if (r33 == 0) goto L_0x0173
            r22 = 32
            goto L_0x0175
        L_0x0173:
            r22 = 16
        L_0x0175:
            r30 = r30 | r22
            goto L_0x0161
        L_0x0178:
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0181
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017e:
            r14 = r65
            goto L_0x0194
        L_0x0181:
            r14 = r12 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L_0x017e
            r14 = r65
            boolean r18 = r9.e(r14)
            if (r18 == 0) goto L_0x0190
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x0192
        L_0x0190:
            r23 = 128(0x80, float:1.794E-43)
        L_0x0192:
            r6 = r6 | r23
        L_0x0194:
            r14 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x019d
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x019a:
            r15 = r67
            goto L_0x01ad
        L_0x019d:
            r15 = r12 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x019a
            r15 = r67
            boolean r18 = r9.d(r15)
            if (r18 == 0) goto L_0x01ab
            r16 = r17
        L_0x01ab:
            r6 = r6 | r16
        L_0x01ad:
            r15 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01b6
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b3:
            r13 = r68
            goto L_0x01c6
        L_0x01b6:
            r13 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x01b3
            r13 = r68
            boolean r16 = r9.b(r13)
            if (r16 == 0) goto L_0x01c4
            r20 = r21
        L_0x01c4:
            r6 = r6 | r20
        L_0x01c6:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r11 & r16
            if (r16 == 0) goto L_0x01d2
            r6 = r6 | r26
            r13 = r69
            goto L_0x01e5
        L_0x01d2:
            r17 = r12 & r26
            r13 = r69
            if (r17 != 0) goto L_0x01e5
            boolean r17 = r9.d(r13)
            if (r17 == 0) goto L_0x01e1
            r17 = r25
            goto L_0x01e3
        L_0x01e1:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x01e3:
            r6 = r6 | r17
        L_0x01e5:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01f0
            r6 = r6 | r29
            r13 = r70
            goto L_0x0203
        L_0x01f0:
            r18 = r12 & r29
            r13 = r70
            if (r18 != 0) goto L_0x0203
            boolean r18 = r9.d(r13)
            if (r18 == 0) goto L_0x01ff
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0201
        L_0x01ff:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x0201:
            r6 = r6 | r18
        L_0x0203:
            r18 = r11 & r25
            if (r18 == 0) goto L_0x020c
            r6 = r6 | r31
            r13 = r71
            goto L_0x021f
        L_0x020c:
            r20 = r12 & r31
            r13 = r71
            if (r20 != 0) goto L_0x021f
            boolean r20 = r9.V(r13)
            if (r20 == 0) goto L_0x021b
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021d
        L_0x021b:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x021d:
            r6 = r6 | r20
        L_0x021f:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r11 & r20
            if (r20 == 0) goto L_0x022a
            r6 = r6 | r32
            r11 = r72
            goto L_0x023d
        L_0x022a:
            r21 = r12 & r32
            r11 = r72
            if (r21 != 0) goto L_0x023d
            boolean r21 = r9.F(r11)
            if (r21 == 0) goto L_0x0239
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x023b
        L_0x0239:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x023b:
            r6 = r6 | r21
        L_0x023d:
            r21 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r0 & r21
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r12) goto L_0x0280
            r11 = 38347923(0x2492493, float:1.4777644E-37)
            r11 = r11 & r6
            r12 = 38347922(0x2492492, float:1.4777643E-37)
            if (r11 != r12) goto L_0x0280
            boolean r11 = r9.l()
            if (r11 != 0) goto L_0x0257
            goto L_0x0280
        L_0x0257:
            r9.L()
            r3 = r52
            r4 = r53
            r6 = r55
            r8 = r57
            r10 = r59
            r11 = r60
            r14 = r63
            r15 = r64
            r16 = r65
            r18 = r67
            r19 = r68
            r20 = r69
            r21 = r70
            r23 = r72
            r45 = r9
            r22 = r13
            r9 = r58
            r13 = r62
            goto L_0x0413
        L_0x0280:
            if (r3 == 0) goto L_0x0286
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r12 = r3
            goto L_0x0288
        L_0x0286:
            r12 = r52
        L_0x0288:
            if (r10 == 0) goto L_0x0293
            p1.v0$a r3 = p1.C5747v0.f27350b
            long r10 = r3.i()
            r26 = r10
            goto L_0x0295
        L_0x0293:
            r26 = r53
        L_0x0295:
            if (r19 == 0) goto L_0x02a0
            c2.v$a r3 = c2.v.f23057b
            long r10 = r3.a()
            r29 = r10
            goto L_0x02a2
        L_0x02a0:
            r29 = r55
        L_0x02a2:
            r3 = 0
            if (r24 == 0) goto L_0x02a8
            r31 = r3
            goto L_0x02aa
        L_0x02a8:
            r31 = r57
        L_0x02aa:
            if (r28 == 0) goto L_0x02af
            r28 = r3
            goto L_0x02b1
        L_0x02af:
            r28 = r58
        L_0x02b1:
            if (r1 == 0) goto L_0x02b6
            r32 = r3
            goto L_0x02b8
        L_0x02b6:
            r32 = r59
        L_0x02b8:
            if (r2 == 0) goto L_0x02c3
            c2.v$a r1 = c2.v.f23057b
            long r1 = r1.a()
            r33 = r1
            goto L_0x02c5
        L_0x02c3:
            r33 = r60
        L_0x02c5:
            if (r4 == 0) goto L_0x02ca
            r35 = r3
            goto L_0x02cc
        L_0x02ca:
            r35 = r62
        L_0x02cc:
            if (r5 == 0) goto L_0x02d1
            r36 = r3
            goto L_0x02d3
        L_0x02d1:
            r36 = r63
        L_0x02d3:
            if (r7 == 0) goto L_0x02d7
            r11 = r3
            goto L_0x02d9
        L_0x02d7:
            r11 = r64
        L_0x02d9:
            if (r8 == 0) goto L_0x02e4
            c2.v$a r1 = c2.v.f23057b
            long r1 = r1.a()
            r37 = r1
            goto L_0x02e6
        L_0x02e4:
            r37 = r65
        L_0x02e6:
            if (r14 == 0) goto L_0x02f1
            Y1.t$a r1 = Y1.t.f14827a
            int r1 = r1.a()
            r39 = r1
            goto L_0x02f3
        L_0x02f1:
            r39 = r67
        L_0x02f3:
            r1 = 1
            if (r15 == 0) goto L_0x02f9
            r40 = r1
            goto L_0x02fb
        L_0x02f9:
            r40 = r68
        L_0x02fb:
            if (r16 == 0) goto L_0x0303
            r2 = 2147483647(0x7fffffff, float:NaN)
            r41 = r2
            goto L_0x0305
        L_0x0303:
            r41 = r69
        L_0x0305:
            if (r17 == 0) goto L_0x030a
            r42 = r1
            goto L_0x030c
        L_0x030a:
            r42 = r70
        L_0x030c:
            if (r18 == 0) goto L_0x0315
            KJ.g r2 = KJ.C15985a.c()
            r43 = r2
            goto L_0x0317
        L_0x0315:
            r43 = r13
        L_0x0317:
            if (r20 == 0) goto L_0x033b
            r2 = -176175922(0xfffffffff57fc4ce, float:-3.2422543E32)
            r9.W(r2)
            java.lang.Object r2 = r9.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x0333
            SC.e r2 = new SC.e
            r2.<init>()
            r9.u(r2)
        L_0x0333:
            nI.l r2 = (nI.C17642l) r2
            r9.P()
            r44 = r2
            goto L_0x033d
        L_0x033b:
            r44 = r72
        L_0x033d:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x034b
            r2 = -793350514(0xffffffffd0b66e8e, float:-2.4485589E10)
            java.lang.String r4 = "com.ingka.ikea.ui.skapa.IkeaText (IkeaText.kt:105)"
            U0.C4895p.S(r2, r0, r6, r4)
        L_0x034b:
            r2 = -176174832(0xfffffffff57fc910, float:-3.2424652E32)
            r9.W(r2)
            int r2 = r0 >> 3
            r4 = r2 & 14
            r13 = r51
            boolean r5 = r(r13, r9, r4)
            if (r5 == 0) goto L_0x0382
            r5 = -176173287(0xfffffffff57fcf19, float:-3.242764E32)
            r9.W(r5)
            java.lang.Object r5 = r9.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x0377
            SC.f r5 = new SC.f
            r5.<init>()
            r9.u(r5)
        L_0x0377:
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r7 = 0
            androidx.compose.ui.d r1 = L1.o.d(r12, r7, r5, r1, r3)
            goto L_0x0383
        L_0x0382:
            r1 = r12
        L_0x0383:
            r9.P()
            N1.Y r3 = r13.a(r9, r4)
            r4 = r6 & 112(0x70, float:1.57E-43)
            N1.Y r21 = s(r3, r11, r9, r4)
            r0 = r0 & 14
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r6 << 27
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r23 = r0 | r2
            int r0 = r6 >> 6
            r2 = 4194302(0x3ffffe, float:5.877469E-39)
            r24 = r0 & r2
            r25 = 0
            r0 = r50
            r2 = r26
            r4 = r29
            r6 = r31
            r7 = r28
            r8 = r32
            r45 = r9
            r9 = r33
            r46 = r11
            r11 = r35
            r47 = r12
            r12 = r36
            r13 = r37
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r22 = r45
            O0.d1.c(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03f1
            U0.C4895p.R()
        L_0x03f1:
            r4 = r26
            r9 = r28
            r6 = r29
            r8 = r31
            r10 = r32
            r11 = r33
            r13 = r35
            r14 = r36
            r16 = r37
            r18 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r22 = r43
            r23 = r44
            r15 = r46
            r3 = r47
        L_0x0413:
            U0.Y0 r2 = r45.n()
            if (r2 == 0) goto L_0x0434
            SC.g r1 = new SC.g
            r0 = r1
            r48 = r1
            r1 = r50
            r49 = r2
            r2 = r51
            r24 = r74
            r25 = r75
            r26 = r76
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r48
            r0 = r49
            r0.a(r1)
        L_0x0434:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13607l.h(N1.d, TC.b, androidx.compose.ui.d, long, long, S1.x, S1.C, S1.m, long, Y1.k, Y1.j, Y1.f, long, int, boolean, int, int, KJ.d, nI.l, U0.m, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(IC.C13023e r54, TC.C13679b r55, androidx.compose.ui.d r56, long r57, long r59, S1.C4830x r61, S1.C r62, S1.C4820m r63, long r64, Y1.k r66, Y1.j r67, Y1.f r68, long r69, int r71, boolean r72, int r73, int r74, nI.C17642l<? super N1.P, XH.C16807N> r75, U0.C4889m r76, int r77, int r78, int r79) {
        /*
            r1 = r54
            r2 = r55
            r15 = r77
            r14 = r78
            r13 = r79
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "style"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = -1507452772(0xffffffffa626189c, float:-5.762617E-16)
            r3 = r76
            U0.m r0 = r3.k(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0024
            r3 = r15 | 6
            goto L_0x003d
        L_0x0024:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x003c
            r3 = r15 & 8
            if (r3 != 0) goto L_0x0031
            boolean r3 = r0.V(r1)
            goto L_0x0035
        L_0x0031:
            boolean r3 = r0.F(r1)
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r3 = 4
            goto L_0x003a
        L_0x0039:
            r3 = 2
        L_0x003a:
            r3 = r3 | r15
            goto L_0x003d
        L_0x003c:
            r3 = r15
        L_0x003d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0044
            r3 = r3 | 48
            goto L_0x0054
        L_0x0044:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0054
            boolean r6 = r0.V(r2)
            if (r6 == 0) goto L_0x0051
            r6 = 32
            goto L_0x0053
        L_0x0051:
            r6 = 16
        L_0x0053:
            r3 = r3 | r6
        L_0x0054:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x005d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x005a:
            r11 = r56
            goto L_0x006f
        L_0x005d:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x005a
            r11 = r56
            boolean r12 = r0.V(r11)
            if (r12 == 0) goto L_0x006c
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r12 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r3 = r3 | r12
        L_0x006f:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x007c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r7 = r57
            goto L_0x008f
        L_0x007c:
            r4 = r15 & 3072(0xc00, float:4.305E-42)
            r7 = r57
            if (r4 != 0) goto L_0x008f
            boolean r19 = r0.e(r7)
            if (r19 == 0) goto L_0x008b
            r19 = r17
            goto L_0x008d
        L_0x008b:
            r19 = r16
        L_0x008d:
            r3 = r3 | r19
        L_0x008f:
            r19 = r13 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x009c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r9 = r59
            goto L_0x00af
        L_0x009c:
            r4 = r15 & 24576(0x6000, float:3.4438E-41)
            r9 = r59
            if (r4 != 0) goto L_0x00af
            boolean r24 = r0.e(r9)
            if (r24 == 0) goto L_0x00ab
            r24 = r21
            goto L_0x00ad
        L_0x00ab:
            r24 = r20
        L_0x00ad:
            r3 = r3 | r24
        L_0x00af:
            r24 = r13 & 32
            r25 = 65536(0x10000, float:9.18355E-41)
            r26 = 131072(0x20000, float:1.83671E-40)
            r27 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x00be
            r3 = r3 | r27
            r4 = r61
            goto L_0x00d1
        L_0x00be:
            r28 = r15 & r27
            r4 = r61
            if (r28 != 0) goto L_0x00d1
            boolean r29 = r0.V(r4)
            if (r29 == 0) goto L_0x00cd
            r29 = r26
            goto L_0x00cf
        L_0x00cd:
            r29 = r25
        L_0x00cf:
            r3 = r3 | r29
        L_0x00d1:
            r29 = r13 & 64
            r30 = 1572864(0x180000, float:2.204052E-39)
            if (r29 == 0) goto L_0x00dc
            r3 = r3 | r30
            r5 = r62
            goto L_0x00ef
        L_0x00dc:
            r31 = r15 & r30
            r5 = r62
            if (r31 != 0) goto L_0x00ef
            boolean r32 = r0.V(r5)
            if (r32 == 0) goto L_0x00eb
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ed
        L_0x00eb:
            r32 = 524288(0x80000, float:7.34684E-40)
        L_0x00ed:
            r3 = r3 | r32
        L_0x00ef:
            r4 = r13 & 128(0x80, float:1.794E-43)
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00fa
            r3 = r3 | r32
            r5 = r63
            goto L_0x010d
        L_0x00fa:
            r33 = r15 & r32
            r5 = r63
            if (r33 != 0) goto L_0x010d
            boolean r33 = r0.V(r5)
            if (r33 == 0) goto L_0x0109
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010b
        L_0x0109:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x010b:
            r3 = r3 | r33
        L_0x010d:
            r5 = r13 & 256(0x100, float:3.59E-43)
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            if (r5 == 0) goto L_0x0118
            r3 = r3 | r33
            r7 = r64
            goto L_0x012b
        L_0x0118:
            r33 = r15 & r33
            r7 = r64
            if (r33 != 0) goto L_0x012b
            boolean r33 = r0.e(r7)
            if (r33 == 0) goto L_0x0127
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0129
        L_0x0127:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0129:
            r3 = r3 | r33
        L_0x012b:
            r7 = r13 & 512(0x200, float:7.175E-43)
            r8 = 805306368(0x30000000, float:4.656613E-10)
            if (r7 == 0) goto L_0x0135
            r3 = r3 | r8
        L_0x0132:
            r8 = r66
            goto L_0x0147
        L_0x0135:
            r8 = r8 & r15
            if (r8 != 0) goto L_0x0132
            r8 = r66
            boolean r33 = r0.V(r8)
            if (r33 == 0) goto L_0x0143
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r3 = r3 | r33
        L_0x0147:
            r8 = r13 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0150
            r31 = r14 | 6
            r9 = r67
            goto L_0x0166
        L_0x0150:
            r33 = r14 & 6
            r9 = r67
            if (r33 != 0) goto L_0x0164
            boolean r10 = r0.V(r9)
            if (r10 == 0) goto L_0x015f
            r31 = 4
            goto L_0x0161
        L_0x015f:
            r31 = 2
        L_0x0161:
            r31 = r14 | r31
            goto L_0x0166
        L_0x0164:
            r31 = r14
        L_0x0166:
            r10 = r13 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x016f
            r31 = r31 | 48
        L_0x016c:
            r9 = r31
            goto L_0x0183
        L_0x016f:
            r33 = r14 & 48
            r9 = r68
            if (r33 != 0) goto L_0x016c
            boolean r33 = r0.V(r9)
            if (r33 == 0) goto L_0x017e
            r22 = 32
            goto L_0x0180
        L_0x017e:
            r22 = 16
        L_0x0180:
            r31 = r31 | r22
            goto L_0x016c
        L_0x0183:
            r11 = r13 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x018c
            r9 = r9 | 384(0x180, float:5.38E-43)
            r1 = r69
            goto L_0x019f
        L_0x018c:
            r15 = r14 & 384(0x180, float:5.38E-43)
            r1 = r69
            if (r15 != 0) goto L_0x019f
            boolean r15 = r0.e(r1)
            if (r15 == 0) goto L_0x019b
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x019d
        L_0x019b:
            r23 = 128(0x80, float:1.794E-43)
        L_0x019d:
            r9 = r9 | r23
        L_0x019f:
            r15 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x01a8
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x01a5:
            r1 = r71
            goto L_0x01b8
        L_0x01a8:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x01a5
            r1 = r71
            boolean r2 = r0.d(r1)
            if (r2 == 0) goto L_0x01b6
            r16 = r17
        L_0x01b6:
            r9 = r9 | r16
        L_0x01b8:
            r2 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x01c1
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x01be:
            r1 = r72
            goto L_0x01d1
        L_0x01c1:
            r1 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x01be
            r1 = r72
            boolean r16 = r0.b(r1)
            if (r16 == 0) goto L_0x01cf
            r20 = r21
        L_0x01cf:
            r9 = r9 | r20
        L_0x01d1:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x01dd
            r9 = r9 | r27
            r1 = r73
            goto L_0x01f0
        L_0x01dd:
            r17 = r14 & r27
            r1 = r73
            if (r17 != 0) goto L_0x01f0
            boolean r17 = r0.d(r1)
            if (r17 == 0) goto L_0x01ec
            r17 = r26
            goto L_0x01ee
        L_0x01ec:
            r17 = r25
        L_0x01ee:
            r9 = r9 | r17
        L_0x01f0:
            r17 = r13 & r25
            if (r17 == 0) goto L_0x01f9
            r9 = r9 | r30
            r1 = r74
            goto L_0x020c
        L_0x01f9:
            r18 = r14 & r30
            r1 = r74
            if (r18 != 0) goto L_0x020c
            boolean r18 = r0.d(r1)
            if (r18 == 0) goto L_0x0208
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x020a
        L_0x0208:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x020a:
            r9 = r9 | r18
        L_0x020c:
            r18 = r13 & r26
            if (r18 == 0) goto L_0x0215
            r9 = r9 | r32
            r1 = r75
            goto L_0x0228
        L_0x0215:
            r20 = r14 & r32
            r1 = r75
            if (r20 != 0) goto L_0x0228
            boolean r20 = r0.F(r1)
            if (r20 == 0) goto L_0x0224
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0226
        L_0x0224:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x0226:
            r9 = r9 | r20
        L_0x0228:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r3 & r20
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r13) goto L_0x026b
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r9
            r13 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r13) goto L_0x026b
            boolean r1 = r0.l()
            if (r1 != 0) goto L_0x0242
            goto L_0x026b
        L_0x0242:
            r0.L()
            r7 = r54
            r2 = r55
            r3 = r56
            r4 = r57
            r41 = r59
            r8 = r61
            r9 = r62
            r10 = r63
            r11 = r64
            r13 = r66
            r14 = r67
            r15 = r68
            r16 = r69
            r18 = r71
            r19 = r72
            r20 = r73
            r21 = r74
            r22 = r75
            goto L_0x03bc
        L_0x026b:
            if (r6 == 0) goto L_0x0270
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x0272
        L_0x0270:
            r1 = r56
        L_0x0272:
            if (r12 == 0) goto L_0x027b
            p1.v0$a r6 = p1.C5747v0.f27350b
            long r12 = r6.i()
            goto L_0x027d
        L_0x027b:
            r12 = r57
        L_0x027d:
            if (r19 == 0) goto L_0x0288
            c2.v$a r6 = c2.v.f23057b
            long r19 = r6.a()
            r41 = r19
            goto L_0x028a
        L_0x0288:
            r41 = r59
        L_0x028a:
            if (r24 == 0) goto L_0x028f
            r43 = 0
            goto L_0x0291
        L_0x028f:
            r43 = r61
        L_0x0291:
            if (r29 == 0) goto L_0x0296
            r44 = 0
            goto L_0x0298
        L_0x0296:
            r44 = r62
        L_0x0298:
            if (r4 == 0) goto L_0x029c
            r4 = 0
            goto L_0x029e
        L_0x029c:
            r4 = r63
        L_0x029e:
            if (r5 == 0) goto L_0x02a9
            c2.v$a r5 = c2.v.f23057b
            long r19 = r5.a()
            r45 = r19
            goto L_0x02ab
        L_0x02a9:
            r45 = r64
        L_0x02ab:
            if (r7 == 0) goto L_0x02af
            r5 = 0
            goto L_0x02b1
        L_0x02af:
            r5 = r66
        L_0x02b1:
            if (r8 == 0) goto L_0x02b5
            r7 = 0
            goto L_0x02b7
        L_0x02b5:
            r7 = r67
        L_0x02b7:
            if (r10 == 0) goto L_0x02bb
            r8 = 0
            goto L_0x02bd
        L_0x02bb:
            r8 = r68
        L_0x02bd:
            if (r11 == 0) goto L_0x02c6
            c2.v$a r10 = c2.v.f23057b
            long r10 = r10.a()
            goto L_0x02c8
        L_0x02c6:
            r10 = r69
        L_0x02c8:
            if (r15 == 0) goto L_0x02d1
            Y1.t$a r15 = Y1.t.f14827a
            int r15 = r15.a()
            goto L_0x02d3
        L_0x02d1:
            r15 = r71
        L_0x02d3:
            if (r2 == 0) goto L_0x02d7
            r2 = 1
            goto L_0x02d9
        L_0x02d7:
            r2 = r72
        L_0x02d9:
            if (r16 == 0) goto L_0x02e1
            r16 = 2147483647(0x7fffffff, float:NaN)
            r47 = r16
            goto L_0x02e3
        L_0x02e1:
            r47 = r73
        L_0x02e3:
            if (r17 == 0) goto L_0x02e8
            r48 = 1
            goto L_0x02ea
        L_0x02e8:
            r48 = r74
        L_0x02ea:
            if (r18 == 0) goto L_0x02ef
            r49 = 0
            goto L_0x02f1
        L_0x02ef:
            r49 = r75
        L_0x02f1:
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x02ff
            r6 = -1507452772(0xffffffffa626189c, float:-5.762617E-16)
            java.lang.String r14 = "com.ingka.ikea.ui.skapa.IkeaText (IkeaText.kt:157)"
            U0.C4895p.S(r6, r3, r9, r14)
        L_0x02ff:
            r6 = -176125808(0xfffffffff5808890, float:-3.25871E32)
            r0.W(r6)
            int r6 = r3 >> 3
            r14 = r6 & 14
            r58 = r2
            r2 = r55
            boolean r16 = r(r2, r0, r14)
            if (r16 == 0) goto L_0x0342
            r59 = r15
            r15 = -176124263(0xfffffffff5808e99, float:-3.2593077E32)
            r0.W(r15)
            java.lang.Object r15 = r0.D()
            U0.m$a r16 = U0.C4889m.f14007a
            r60 = r10
            java.lang.Object r10 = r16.a()
            if (r15 != r10) goto L_0x0331
            SC.h r15 = new SC.h
            r15.<init>()
            r0.u(r15)
        L_0x0331:
            nI.l r15 = (nI.C17642l) r15
            r0.P()
            r10 = 0
            r56 = r7
            r7 = 1
            r11 = 0
            androidx.compose.ui.d r7 = L1.o.d(r1, r10, r15, r7, r11)
            r17 = r7
            goto L_0x034a
        L_0x0342:
            r56 = r7
            r60 = r10
            r59 = r15
            r17 = r1
        L_0x034a:
            r0.P()
            int r7 = IC.C13023e.f110931a
            r3 = r3 & 14
            r3 = r3 | r7
            r7 = r54
            java.lang.String r16 = r7.a(r0, r3)
            N1.Y r3 = r2.a(r0, r14)
            r10 = r9 & 112(0x70, float:1.57E-43)
            N1.Y r36 = s(r3, r8, r0, r10)
            r3 = 268435328(0xfffff80, float:2.5243356E-29)
            r3 = r3 & r6
            int r6 = r9 << 27
            r10 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r10
            r38 = r3 | r6
            int r3 = r9 >> 6
            r6 = 524286(0x7fffe, float:7.34681E-40)
            r39 = r3 & r6
            r40 = 0
            r18 = r12
            r20 = r41
            r22 = r43
            r23 = r44
            r24 = r4
            r25 = r45
            r27 = r5
            r28 = r56
            r29 = r60
            r31 = r59
            r32 = r58
            r33 = r47
            r34 = r48
            r35 = r49
            r37 = r0
            O0.d1.b(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x03a0
            U0.C4895p.R()
        L_0x03a0:
            r14 = r56
            r19 = r58
            r18 = r59
            r16 = r60
            r3 = r1
            r10 = r4
            r15 = r8
            r8 = r43
            r9 = r44
            r20 = r47
            r21 = r48
            r22 = r49
            r52 = r12
            r13 = r5
            r4 = r52
            r11 = r45
        L_0x03bc:
            U0.Y0 r6 = r0.n()
            if (r6 == 0) goto L_0x03df
            SC.i r1 = new SC.i
            r0 = r1
            r50 = r1
            r1 = r54
            r2 = r55
            r51 = r6
            r6 = r41
            r23 = r77
            r24 = r78
            r25 = r79
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r50
            r0 = r51
            r0.a(r1)
        L_0x03df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13607l.i(IC.e, TC.b, androidx.compose.ui.d, long, long, S1.x, S1.C, S1.m, long, Y1.k, Y1.j, Y1.f, long, int, boolean, int, int, nI.l, U0.m, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(java.lang.String r48, TC.C13679b r49, androidx.compose.ui.d r50, long r51, long r53, S1.C4830x r55, S1.C r56, S1.C4820m r57, long r58, Y1.k r60, Y1.j r61, Y1.f r62, long r63, int r65, boolean r66, int r67, int r68, nI.C17642l<? super N1.P, XH.C16807N> r69, U0.C4889m r70, int r71, int r72, int r73) {
        /*
            r15 = r48
            r13 = r49
            r14 = r71
            r12 = r72
            r11 = r73
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "style"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 550648940(0x20d23c6c, float:3.5615368E-19)
            r1 = r70
            U0.m r9 = r1.k(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r14 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r14 & 6
            if (r0 != 0) goto L_0x0033
            boolean r0 = r9.V(r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r14
            goto L_0x0034
        L_0x0033:
            r0 = r14
        L_0x0034:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x004b
            boolean r3 = r9.V(r13)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0054
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r8 = r50
            goto L_0x0066
        L_0x0054:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0051
            r8 = r50
            boolean r10 = r9.V(r8)
            if (r10 == 0) goto L_0x0063
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r10
        L_0x0066:
            r10 = r11 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0073
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r4 = r51
            goto L_0x0086
        L_0x0073:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            r4 = r51
            if (r1 != 0) goto L_0x0086
            boolean r19 = r9.e(r4)
            if (r19 == 0) goto L_0x0082
            r19 = r17
            goto L_0x0084
        L_0x0082:
            r19 = r16
        L_0x0084:
            r0 = r0 | r19
        L_0x0086:
            r19 = r11 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0093
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r6 = r53
            goto L_0x00a6
        L_0x0093:
            r1 = r14 & 24576(0x6000, float:3.4438E-41)
            r6 = r53
            if (r1 != 0) goto L_0x00a6
            boolean r24 = r9.e(r6)
            if (r24 == 0) goto L_0x00a2
            r24 = r21
            goto L_0x00a4
        L_0x00a2:
            r24 = r20
        L_0x00a4:
            r0 = r0 | r24
        L_0x00a6:
            r24 = r11 & 32
            r25 = 65536(0x10000, float:9.18355E-41)
            r26 = 131072(0x20000, float:1.83671E-40)
            r27 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x00b5
            r0 = r0 | r27
            r1 = r55
            goto L_0x00c8
        L_0x00b5:
            r28 = r14 & r27
            r1 = r55
            if (r28 != 0) goto L_0x00c8
            boolean r29 = r9.V(r1)
            if (r29 == 0) goto L_0x00c4
            r29 = r26
            goto L_0x00c6
        L_0x00c4:
            r29 = r25
        L_0x00c6:
            r0 = r0 | r29
        L_0x00c8:
            r29 = r11 & 64
            r30 = 1572864(0x180000, float:2.204052E-39)
            if (r29 == 0) goto L_0x00d3
            r0 = r0 | r30
            r2 = r56
            goto L_0x00e6
        L_0x00d3:
            r31 = r14 & r30
            r2 = r56
            if (r31 != 0) goto L_0x00e6
            boolean r32 = r9.V(r2)
            if (r32 == 0) goto L_0x00e2
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e4
        L_0x00e2:
            r32 = 524288(0x80000, float:7.34684E-40)
        L_0x00e4:
            r0 = r0 | r32
        L_0x00e6:
            r1 = r11 & 128(0x80, float:1.794E-43)
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00f1
            r0 = r0 | r32
            r2 = r57
            goto L_0x0104
        L_0x00f1:
            r33 = r14 & r32
            r2 = r57
            if (r33 != 0) goto L_0x0104
            boolean r33 = r9.V(r2)
            if (r33 == 0) goto L_0x0100
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r0 = r0 | r33
        L_0x0104:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010f
            r0 = r0 | r33
            r4 = r58
            goto L_0x0122
        L_0x010f:
            r33 = r14 & r33
            r4 = r58
            if (r33 != 0) goto L_0x0122
            boolean r33 = r9.e(r4)
            if (r33 == 0) goto L_0x011e
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0120
        L_0x011e:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0120:
            r0 = r0 | r33
        L_0x0122:
            r4 = r11 & 512(0x200, float:7.175E-43)
            r5 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x012c
            r0 = r0 | r5
        L_0x0129:
            r5 = r60
            goto L_0x013e
        L_0x012c:
            r5 = r5 & r14
            if (r5 != 0) goto L_0x0129
            r5 = r60
            boolean r33 = r9.V(r5)
            if (r33 == 0) goto L_0x013a
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r0 = r0 | r33
        L_0x013e:
            r5 = r11 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0147
            r31 = r12 | 6
            r6 = r61
            goto L_0x015d
        L_0x0147:
            r33 = r12 & 6
            r6 = r61
            if (r33 != 0) goto L_0x015b
            boolean r7 = r9.V(r6)
            if (r7 == 0) goto L_0x0156
            r31 = 4
            goto L_0x0158
        L_0x0156:
            r31 = 2
        L_0x0158:
            r31 = r12 | r31
            goto L_0x015d
        L_0x015b:
            r31 = r12
        L_0x015d:
            r7 = r11 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0166
            r31 = r31 | 48
        L_0x0163:
            r6 = r31
            goto L_0x017a
        L_0x0166:
            r33 = r12 & 48
            r6 = r62
            if (r33 != 0) goto L_0x0163
            boolean r33 = r9.V(r6)
            if (r33 == 0) goto L_0x0175
            r22 = 32
            goto L_0x0177
        L_0x0175:
            r22 = 16
        L_0x0177:
            r31 = r31 | r22
            goto L_0x0163
        L_0x017a:
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0183
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0180:
            r14 = r63
            goto L_0x0196
        L_0x0183:
            r14 = r12 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L_0x0180
            r14 = r63
            boolean r18 = r9.e(r14)
            if (r18 == 0) goto L_0x0192
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x0194
        L_0x0192:
            r23 = 128(0x80, float:1.794E-43)
        L_0x0194:
            r6 = r6 | r23
        L_0x0196:
            r14 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x019f
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x019c:
            r15 = r65
            goto L_0x01af
        L_0x019f:
            r15 = r12 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L_0x019c
            r15 = r65
            boolean r18 = r9.d(r15)
            if (r18 == 0) goto L_0x01ad
            r16 = r17
        L_0x01ad:
            r6 = r6 | r16
        L_0x01af:
            r15 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01b8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x01b5:
            r13 = r66
            goto L_0x01c8
        L_0x01b8:
            r13 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x01b5
            r13 = r66
            boolean r16 = r9.b(r13)
            if (r16 == 0) goto L_0x01c6
            r20 = r21
        L_0x01c6:
            r6 = r6 | r20
        L_0x01c8:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r11 & r16
            if (r16 == 0) goto L_0x01d4
            r6 = r6 | r27
            r13 = r67
            goto L_0x01e7
        L_0x01d4:
            r17 = r12 & r27
            r13 = r67
            if (r17 != 0) goto L_0x01e7
            boolean r17 = r9.d(r13)
            if (r17 == 0) goto L_0x01e3
            r17 = r26
            goto L_0x01e5
        L_0x01e3:
            r17 = r25
        L_0x01e5:
            r6 = r6 | r17
        L_0x01e7:
            r17 = r11 & r25
            if (r17 == 0) goto L_0x01f0
            r6 = r6 | r30
            r13 = r68
            goto L_0x0203
        L_0x01f0:
            r18 = r12 & r30
            r13 = r68
            if (r18 != 0) goto L_0x0203
            boolean r18 = r9.d(r13)
            if (r18 == 0) goto L_0x01ff
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0201
        L_0x01ff:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x0201:
            r6 = r6 | r18
        L_0x0203:
            r18 = r11 & r26
            if (r18 == 0) goto L_0x020c
            r6 = r6 | r32
            r11 = r69
            goto L_0x021f
        L_0x020c:
            r20 = r12 & r32
            r11 = r69
            if (r20 != 0) goto L_0x021f
            boolean r20 = r9.F(r11)
            if (r20 == 0) goto L_0x021b
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021d
        L_0x021b:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x021d:
            r6 = r6 | r20
        L_0x021f:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r0 & r20
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r12) goto L_0x0260
            r11 = 4793491(0x492493, float:6.717112E-39)
            r11 = r11 & r6
            r12 = 4793490(0x492492, float:6.71711E-39)
            if (r11 != r12) goto L_0x0260
            boolean r11 = r9.l()
            if (r11 != 0) goto L_0x0239
            goto L_0x0260
        L_0x0239:
            r9.L()
            r3 = r50
            r4 = r51
            r6 = r53
            r8 = r55
            r10 = r57
            r11 = r58
            r14 = r61
            r15 = r62
            r16 = r63
            r18 = r65
            r19 = r66
            r20 = r67
            r22 = r69
            r43 = r9
            r21 = r13
            r9 = r56
            r13 = r60
            goto L_0x03c5
        L_0x0260:
            if (r3 == 0) goto L_0x0266
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r12 = r3
            goto L_0x0268
        L_0x0266:
            r12 = r50
        L_0x0268:
            if (r10 == 0) goto L_0x0273
            p1.v0$a r3 = p1.C5747v0.f27350b
            long r10 = r3.i()
            r25 = r10
            goto L_0x0275
        L_0x0273:
            r25 = r51
        L_0x0275:
            if (r19 == 0) goto L_0x0280
            c2.v$a r3 = c2.v.f23057b
            long r10 = r3.a()
            r27 = r10
            goto L_0x0282
        L_0x0280:
            r27 = r53
        L_0x0282:
            r3 = 0
            if (r24 == 0) goto L_0x0288
            r30 = r3
            goto L_0x028a
        L_0x0288:
            r30 = r55
        L_0x028a:
            if (r29 == 0) goto L_0x028f
            r29 = r3
            goto L_0x0291
        L_0x028f:
            r29 = r56
        L_0x0291:
            if (r1 == 0) goto L_0x0296
            r31 = r3
            goto L_0x0298
        L_0x0296:
            r31 = r57
        L_0x0298:
            if (r2 == 0) goto L_0x02a3
            c2.v$a r1 = c2.v.f23057b
            long r1 = r1.a()
            r32 = r1
            goto L_0x02a5
        L_0x02a3:
            r32 = r58
        L_0x02a5:
            if (r4 == 0) goto L_0x02aa
            r34 = r3
            goto L_0x02ac
        L_0x02aa:
            r34 = r60
        L_0x02ac:
            if (r5 == 0) goto L_0x02b1
            r35 = r3
            goto L_0x02b3
        L_0x02b1:
            r35 = r61
        L_0x02b3:
            if (r7 == 0) goto L_0x02b7
            r11 = r3
            goto L_0x02b9
        L_0x02b7:
            r11 = r62
        L_0x02b9:
            if (r8 == 0) goto L_0x02c4
            c2.v$a r1 = c2.v.f23057b
            long r1 = r1.a()
            r36 = r1
            goto L_0x02c6
        L_0x02c4:
            r36 = r63
        L_0x02c6:
            if (r14 == 0) goto L_0x02d1
            Y1.t$a r1 = Y1.t.f14827a
            int r1 = r1.a()
            r38 = r1
            goto L_0x02d3
        L_0x02d1:
            r38 = r65
        L_0x02d3:
            r1 = 1
            if (r15 == 0) goto L_0x02d9
            r39 = r1
            goto L_0x02db
        L_0x02d9:
            r39 = r66
        L_0x02db:
            if (r16 == 0) goto L_0x02e3
            r2 = 2147483647(0x7fffffff, float:NaN)
            r40 = r2
            goto L_0x02e5
        L_0x02e3:
            r40 = r67
        L_0x02e5:
            if (r17 == 0) goto L_0x02ea
            r41 = r1
            goto L_0x02ec
        L_0x02ea:
            r41 = r13
        L_0x02ec:
            if (r18 == 0) goto L_0x02f1
            r42 = r3
            goto L_0x02f3
        L_0x02f1:
            r42 = r69
        L_0x02f3:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0301
            r2 = 550648940(0x20d23c6c, float:3.5615368E-19)
            java.lang.String r4 = "com.ingka.ikea.ui.skapa.IkeaText (IkeaText.kt:53)"
            U0.C4895p.S(r2, r0, r6, r4)
        L_0x0301:
            r2 = -176225584(0xfffffffff57f02d0, float:-3.2326483E32)
            r9.W(r2)
            int r2 = r0 >> 3
            r4 = r2 & 14
            r13 = r49
            boolean r5 = r(r13, r9, r4)
            if (r5 == 0) goto L_0x0338
            r5 = -176224039(0xfffffffff57f08d9, float:-3.2329471E32)
            r9.W(r5)
            java.lang.Object r5 = r9.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x032d
            SC.j r5 = new SC.j
            r5.<init>()
            r9.u(r5)
        L_0x032d:
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r7 = 0
            androidx.compose.ui.d r1 = L1.o.d(r12, r7, r5, r1, r3)
            goto L_0x0339
        L_0x0338:
            r1 = r12
        L_0x0339:
            r9.P()
            N1.Y r3 = r13.a(r9, r4)
            r4 = r6 & 112(0x70, float:1.57E-43)
            N1.Y r20 = s(r3, r11, r9, r4)
            r0 = r0 & 14
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r6 << 27
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r22 = r0 | r2
            int r0 = r6 >> 6
            r2 = 524286(0x7fffe, float:7.34681E-40)
            r23 = r0 & r2
            r24 = 0
            r0 = r48
            r2 = r25
            r4 = r27
            r6 = r30
            r7 = r29
            r8 = r31
            r43 = r9
            r9 = r32
            r44 = r11
            r11 = r34
            r45 = r12
            r12 = r35
            r13 = r36
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r21 = r43
            O0.d1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03a5
            U0.C4895p.R()
        L_0x03a5:
            r4 = r25
            r6 = r27
            r9 = r29
            r8 = r30
            r10 = r31
            r11 = r32
            r13 = r34
            r14 = r35
            r16 = r36
            r18 = r38
            r19 = r39
            r20 = r40
            r21 = r41
            r22 = r42
            r15 = r44
            r3 = r45
        L_0x03c5:
            U0.Y0 r2 = r43.n()
            if (r2 == 0) goto L_0x03e6
            SC.k r1 = new SC.k
            r0 = r1
            r46 = r1
            r1 = r48
            r47 = r2
            r2 = r49
            r23 = r71
            r24 = r72
            r25 = r73
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r46
            r0 = r47
            r0.a(r1)
        L_0x03e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.C13607l.j(java.lang.String, TC.b, androidx.compose.ui.d, long, long, S1.x, S1.C, S1.m, long, Y1.k, Y1.j, Y1.f, long, int, boolean, int, int, nI.l, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(P p10) {
        C17542s.j(p10, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.v(xVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C4669d dVar, C13679b bVar, d dVar2, long j10, long j11, C4830x xVar, C c10, C4820m mVar, long j12, k kVar, j jVar, f fVar, long j13, int i10, boolean z10, int i11, int i12, C15988d dVar3, C17642l lVar, int i13, int i14, int i15, C4889m mVar2, int i16) {
        h(dVar, bVar, dVar2, j10, j11, xVar, c10, mVar, j12, kVar, jVar, fVar, j13, i10, z10, i11, i12, dVar3, lVar, mVar2, M0.a(i13 | 1), M0.a(i14), i15);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.v(xVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C13023e eVar, C13679b bVar, d dVar, long j10, long j11, C4830x xVar, C c10, C4820m mVar, long j12, k kVar, j jVar, f fVar, long j13, int i10, boolean z10, int i11, int i12, C17642l lVar, int i13, int i14, int i15, C4889m mVar2, int i16) {
        i(eVar, bVar, dVar, j10, j11, xVar, c10, mVar, j12, kVar, jVar, fVar, j13, i10, z10, i11, i12, lVar, mVar2, M0.a(i13 | 1), M0.a(i14), i15);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(String str, C13679b bVar, d dVar, long j10, long j11, C4830x xVar, C c10, C4820m mVar, long j12, k kVar, j jVar, f fVar, long j13, int i10, boolean z10, int i11, int i12, C17642l lVar, int i13, int i14, int i15, C4889m mVar2, int i16) {
        j(str, bVar, dVar, j10, j11, xVar, c10, mVar, j12, kVar, jVar, fVar, j13, i10, z10, i11, i12, lVar, mVar2, M0.a(i13 | 1), M0.a(i14), i15);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.v(xVar);
        return C16807N.f139792a;
    }

    private static final boolean r(C13679b bVar, C4889m mVar, int i10) {
        boolean z10;
        mVar.W(-372538247);
        if (C4895p.J()) {
            C4895p.S(-372538247, i10, -1, "com.ingka.ikea.ui.skapa.isHeading (IkeaText.kt:186)");
        }
        if (bVar instanceof C13679b.a) {
            z10 = false;
        } else if (bVar instanceof C13679b.C2857b) {
            z10 = true;
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return z10;
    }

    private static final Y s(Y y10, f fVar, C4889m mVar, int i10) {
        Y y11;
        mVar.W(-1716235806);
        if (C4895p.J()) {
            C4895p.S(-1716235806, i10, -1, "com.ingka.ikea.ui.skapa.withLineBreak (IkeaText.kt:196)");
        }
        if (fVar == null) {
            y11 = y10;
        } else {
            y11 = Y.c(y10, 0, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (h) null, fVar.o(), 0, (s) null, 14680063, (Object) null);
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return y11;
    }
}
