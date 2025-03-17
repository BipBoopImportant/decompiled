package com.ingka.ikea.browseandsearch.plp.impl.composables.webview;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import android.content.Context;
import android.webkit.WebView;
import androidx.compose.ui.d;
import h9.C7940a;
import h9.C7941b;
import h9.C7946g;
import h9.C7947h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import p0.v;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh9/h;", "state", "Landroidx/compose/ui/d;", "modifier", "Lp0/v;", "orientation", "", "captureBackPresses", "Lh9/g;", "navigator", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "LXH/N;", "onCreated", "onDispose", "Lh9/b;", "client", "Lh9/a;", "chromeClient", "g", "(Lh9/h;Landroidx/compose/ui/d;Lp0/v;ZLh9/g;LnI/l;LnI/l;Lh9/b;Lh9/a;LU0/m;II)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(h9.C7947h r33, androidx.compose.ui.d r34, p0.v r35, boolean r36, h9.C7946g r37, nI.C17642l<? super android.webkit.WebView, XH.C16807N> r38, nI.C17642l<? super android.webkit.WebView, XH.C16807N> r39, h9.C7941b r40, h9.C7940a r41, U0.C4889m r42, int r43, int r44) {
        /*
            r12 = r33
            r0 = r40
            r1 = r41
            r13 = r43
            r14 = r44
            java.lang.String r2 = "state"
            kotlin.jvm.internal.C17542s.j(r12, r2)
            r2 = 1873111477(0x6fa569b5, float:1.0238564E29)
            r3 = r42
            U0.m r15 = r3.k(r2)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x001f
            r3 = r13 | 6
            goto L_0x002f
        L_0x001f:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x002e
            boolean r3 = r15.V(r12)
            if (r3 == 0) goto L_0x002b
            r3 = 4
            goto L_0x002c
        L_0x002b:
            r3 = 2
        L_0x002c:
            r3 = r3 | r13
            goto L_0x002f
        L_0x002e:
            r3 = r13
        L_0x002f:
            r4 = r14 & 2
            if (r4 == 0) goto L_0x0038
            r3 = r3 | 48
        L_0x0035:
            r5 = r34
            goto L_0x004a
        L_0x0038:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x0035
            r5 = r34
            boolean r6 = r15.V(r5)
            if (r6 == 0) goto L_0x0047
            r6 = 32
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r3 = r3 | r6
        L_0x004a:
            r6 = r14 & 4
            if (r6 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r7 = r35
            goto L_0x0065
        L_0x0053:
            r7 = r13 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0050
            r7 = r35
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x0062
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r8
        L_0x0065:
            r8 = r14 & 8
            if (r8 == 0) goto L_0x006e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006b:
            r9 = r36
            goto L_0x0080
        L_0x006e:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x006b
            r9 = r36
            boolean r10 = r15.b(r9)
            if (r10 == 0) goto L_0x007d
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r3 = r3 | r10
        L_0x0080:
            r10 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0099
            r10 = r14 & 16
            if (r10 != 0) goto L_0x0093
            r10 = r37
            boolean r11 = r15.V(r10)
            if (r11 == 0) goto L_0x0095
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0093:
            r10 = r37
        L_0x0095:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r3 = r3 | r11
            goto L_0x009b
        L_0x0099:
            r10 = r37
        L_0x009b:
            r11 = r14 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a6
            r3 = r3 | r17
            r2 = r38
            goto L_0x00b9
        L_0x00a6:
            r17 = r13 & r17
            r2 = r38
            if (r17 != 0) goto L_0x00b9
            boolean r17 = r15.F(r2)
            if (r17 == 0) goto L_0x00b5
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r3 = r3 | r17
        L_0x00b9:
            r17 = r14 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00c4
            r3 = r3 | r18
            r2 = r39
            goto L_0x00d7
        L_0x00c4:
            r18 = r13 & r18
            r2 = r39
            if (r18 != 0) goto L_0x00d7
            boolean r19 = r15.F(r2)
            if (r19 == 0) goto L_0x00d3
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r3 = r3 | r19
        L_0x00d7:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = r13 & r19
            if (r19 != 0) goto L_0x00f7
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f4
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r13
            if (r2 != 0) goto L_0x00eb
            boolean r2 = r15.V(r0)
            goto L_0x00ef
        L_0x00eb:
            boolean r2 = r15.F(r0)
        L_0x00ef:
            if (r2 == 0) goto L_0x00f4
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f6
        L_0x00f4:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f6:
            r3 = r3 | r2
        L_0x00f7:
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r19 = r13 & r2
            if (r19 != 0) goto L_0x0117
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0114
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r13
            if (r2 != 0) goto L_0x010b
            boolean r2 = r15.V(r1)
            goto L_0x010f
        L_0x010b:
            boolean r2 = r15.F(r1)
        L_0x010f:
            if (r2 == 0) goto L_0x0114
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r3 = r3 | r2
        L_0x0117:
            r2 = 38347923(0x2492493, float:1.4777644E-37)
            r2 = r2 & r3
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r0) goto L_0x0137
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x0127
            goto L_0x0137
        L_0x0127:
            r15.L()
            r6 = r38
            r8 = r40
            r2 = r5
            r3 = r7
            r4 = r9
            r5 = r10
            r7 = r39
            r9 = r1
            goto L_0x0351
        L_0x0137:
            r15.G()
            r0 = r13 & 1
            r20 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r21 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = 1
            if (r0 == 0) goto L_0x0175
            boolean r0 = r15.O()
            if (r0 == 0) goto L_0x014c
            goto L_0x0175
        L_0x014c:
            r15.L()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0155
            r3 = r3 & r21
        L_0x0155:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x015b
            r3 = r3 & r20
        L_0x015b:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0163
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r0
        L_0x0163:
            r31 = r40
            r32 = r1
            r17 = r5
            r11 = r7
            r29 = r9
            r30 = r10
            r4 = 0
            r10 = r38
            r9 = r39
            goto L_0x0235
        L_0x0175:
            if (r4 == 0) goto L_0x017a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r5 = r0
        L_0x017a:
            if (r6 == 0) goto L_0x017f
            p0.v r0 = p0.v.Horizontal
            r7 = r0
        L_0x017f:
            if (r8 == 0) goto L_0x0182
            r9 = r2
        L_0x0182:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0190
            r0 = 0
            r4 = 0
            h9.g r0 = h9.C7945f.c(r0, r15, r4, r2)
            r3 = r3 & r21
            r10 = r0
            goto L_0x0191
        L_0x0190:
            r4 = 0
        L_0x0191:
            if (r11 == 0) goto L_0x01b3
            r0 = -1863702935(0xffffffff90ea2669, float:-9.2355906E-29)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r0 != r6) goto L_0x01ad
            zn.e r0 = new zn.e
            r0.<init>()
            r15.u(r0)
        L_0x01ad:
            nI.l r0 = (nI.C17642l) r0
            r15.P()
            goto L_0x01b5
        L_0x01b3:
            r0 = r38
        L_0x01b5:
            if (r17 == 0) goto L_0x01d7
            r6 = -1863701687(0xffffffff90ea2b49, float:-9.236342E-29)
            r15.W(r6)
            java.lang.Object r6 = r15.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r6 != r8) goto L_0x01d1
            zn.f r6 = new zn.f
            r6.<init>()
            r15.u(r6)
        L_0x01d1:
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            goto L_0x01d9
        L_0x01d7:
            r6 = r39
        L_0x01d9:
            r8 = r14 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x01ff
            r8 = -1863700274(0xffffffff90ea30ce, float:-9.237192E-29)
            r15.W(r8)
            java.lang.Object r8 = r15.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r8 != r11) goto L_0x01f7
            h9.b r8 = new h9.b
            r8.<init>()
            r15.u(r8)
        L_0x01f7:
            h9.b r8 = (h9.C7941b) r8
            r15.P()
            r3 = r3 & r20
            goto L_0x0201
        L_0x01ff:
            r8 = r40
        L_0x0201:
            r11 = r14 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0228
            r1 = -1863697456(0xffffffff90ea3bd0, float:-9.238888E-29)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r1 != r11) goto L_0x021f
            h9.a r1 = new h9.a
            r1.<init>()
            r15.u(r1)
        L_0x021f:
            h9.a r1 = (h9.C7940a) r1
            r15.P()
            r11 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r11
        L_0x0228:
            r32 = r1
            r17 = r5
            r11 = r7
            r31 = r8
            r29 = r9
            r30 = r10
            r10 = r0
            r9 = r6
        L_0x0235:
            r15.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0247
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.browseandsearch.plp.impl.composables.webview.ScrollableWebView (ScrollableWebView.kt:42)"
            r5 = 1873111477(0x6fa569b5, float:1.0238564E29)
            U0.C4895p.S(r5, r3, r0, r1)
        L_0x0247:
            r0 = -1863695241(0xffffffff90ea4477, float:-9.240221E-29)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r5 = r1.a()
            if (r0 != r5) goto L_0x0261
            com.ingka.ikea.browseandsearch.plp.impl.composables.webview.e r0 = new com.ingka.ikea.browseandsearch.plp.impl.composables.webview.e
            r0.<init>(r11)
            r15.u(r0)
        L_0x0261:
            com.ingka.ikea.browseandsearch.plp.impl.composables.webview.e r0 = (com.ingka.ikea.browseandsearch.plp.impl.composables.webview.e) r0
            r15.P()
            r27 = 52
            r28 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r26 = 0
            r20 = r17
            r21 = r0
            r22 = r11
            androidx.compose.ui.d r5 = androidx.compose.foundation.gestures.g.i(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6 = -1863682916(0xffffffff90ea749c, float:-9.247639E-29)
            r15.W(r6)
            boolean r6 = r15.F(r0)
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r3
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r7 != r8) goto L_0x028f
            r7 = r2
            goto L_0x0290
        L_0x028f:
            r7 = r4
        L_0x0290:
            r6 = r6 | r7
            java.lang.Object r7 = r15.D()
            if (r6 != 0) goto L_0x029d
            java.lang.Object r6 = r1.a()
            if (r7 != r6) goto L_0x02a5
        L_0x029d:
            com.ingka.ikea.browseandsearch.plp.impl.composables.webview.a r7 = new com.ingka.ikea.browseandsearch.plp.impl.composables.webview.a
            r7.<init>(r0, r10)
            r15.u(r7)
        L_0x02a5:
            r6 = r7
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            r7 = -1863674541(0xffffffff90ea9553, float:-9.2526796E-29)
            r15.W(r7)
            boolean r7 = r15.F(r0)
            r8 = 3670016(0x380000, float:5.142788E-39)
            r2 = r3 & r8
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r2 != r4) goto L_0x02bf
            r2 = 1
            goto L_0x02c0
        L_0x02bf:
            r2 = 0
        L_0x02c0:
            r2 = r2 | r7
            java.lang.Object r4 = r15.D()
            if (r2 != 0) goto L_0x02cd
            java.lang.Object r2 = r1.a()
            if (r4 != r2) goto L_0x02d5
        L_0x02cd:
            com.ingka.ikea.browseandsearch.plp.impl.composables.webview.b r4 = new com.ingka.ikea.browseandsearch.plp.impl.composables.webview.b
            r4.<init>(r0, r9)
            r15.u(r4)
        L_0x02d5:
            r7 = r4
            nI.l r7 = (nI.C17642l) r7
            r15.P()
            r0 = -1863669536(0xffffffff90eaa8e0, float:-9.255692E-29)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x02f3
            zn.g r0 = new zn.g
            r0.<init>()
            r15.u(r0)
        L_0x02f3:
            r16 = r0
            nI.l r16 = (nI.C17642l) r16
            r15.P()
            r0 = r3 & 14
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r1
            int r1 = r3 >> 3
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = h9.C7941b.f51666c
            int r2 = r2 << 18
            r0 = r0 | r2
            r2 = r1 & r8
            r0 = r0 | r2
            int r2 = h9.C7940a.f51664b
            int r2 = r2 << 21
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r2
            r18 = r0 | r1
            r19 = 0
            r0 = r33
            r1 = r5
            r2 = r29
            r3 = r30
            r4 = r6
            r5 = r7
            r6 = r31
            r7 = r32
            r8 = r16
            r16 = r9
            r9 = r15
            r20 = r10
            r10 = r18
            r18 = r11
            r11 = r19
            ND.C13284f.f(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0341
            U0.C4895p.R()
        L_0x0341:
            r7 = r16
            r2 = r17
            r3 = r18
            r6 = r20
            r4 = r29
            r5 = r30
            r8 = r31
            r9 = r32
        L_0x0351:
            U0.Y0 r15 = r15.n()
            if (r15 == 0) goto L_0x0367
            zn.h r11 = new zn.h
            r0 = r11
            r1 = r33
            r10 = r43
            r12 = r11
            r11 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.a(r12)
        L_0x0367:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.composables.webview.c.g(h9.h, androidx.compose.ui.d, p0.v, boolean, h9.g, nI.l, nI.l, h9.b, h9.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(WebView webView) {
        C17542s.j(webView, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(e eVar, C17642l lVar, WebView webView) {
        C17542s.j(webView, "it");
        eVar.o((ScrollableWebView) null);
        lVar.invoke(webView);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final WebView j(Context context) {
        C17542s.j(context, "it");
        return new ScrollableWebView(context);
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C7947h hVar, d dVar, v vVar, boolean z10, C7946g gVar, C17642l lVar, C17642l lVar2, C7941b bVar, C7940a aVar, int i10, int i11, C4889m mVar, int i12) {
        g(hVar, dVar, vVar, z10, gVar, lVar, lVar2, bVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(WebView webView) {
        C17542s.j(webView, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(e eVar, C17642l lVar, WebView webView) {
        C17542s.j(webView, "it");
        eVar.o(webView instanceof ScrollableWebView ? (ScrollableWebView) webView : null);
        webView.getSettings().setUseWideViewPort(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        lVar.invoke(webView);
        return C16807N.f139792a;
    }
}
