package id;

import U0.C4889m;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.x;
import XH.y;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.d;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\r8\n@\nX\u0002"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onClick", "", "allowedPaymentMethods", "Landroidx/compose/ui/d;", "modifier", "Lid/a;", "theme", "Lid/b;", "type", "Lc2/h;", "radius", "", "enabled", "Lkotlin/Function1;", "", "onError", "fallbackUi", "f", "(LnI/a;Ljava/lang/String;Landroidx/compose/ui/d;Lid/a;Lid/b;FZLnI/l;LnI/p;LU0/m;II)V", "showFallback", "compose-pay-button_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: id.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: id.d} */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0211, code lost:
        if (r10 == r5.a()) goto L_0x0213;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(nI.C17631a<XH.C16807N> r25, java.lang.String r26, androidx.compose.ui.d r27, id.C9842a r28, id.C9843b r29, float r30, boolean r31, nI.C17642l<? super java.lang.Throwable, XH.C16807N> r32, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r33, U0.C4889m r34, int r35, int r36) {
        /*
            r1 = r25
            r2 = r26
            r10 = r35
            r11 = r36
            r3 = 128(0x80, float:1.794E-43)
            r4 = 256(0x100, float:3.59E-43)
            r5 = 16
            r6 = 32
            java.lang.String r7 = "onClick"
            kotlin.jvm.internal.C17542s.j(r1, r7)
            java.lang.String r7 = "allowedPaymentMethods"
            kotlin.jvm.internal.C17542s.j(r2, r7)
            r7 = -268720185(0xffffffffeffba7c7, float:-1.5576714E29)
            r8 = r34
            U0.m r8 = r8.k(r7)
            r9 = 1
            r12 = r11 & 1
            r13 = 2
            r14 = 4
            if (r12 == 0) goto L_0x002d
            r12 = r10 | 6
            goto L_0x003d
        L_0x002d:
            r12 = r10 & 6
            if (r12 != 0) goto L_0x003c
            boolean r12 = r8.F(r1)
            if (r12 == 0) goto L_0x0039
            r12 = r14
            goto L_0x003a
        L_0x0039:
            r12 = r13
        L_0x003a:
            r12 = r12 | r10
            goto L_0x003d
        L_0x003c:
            r12 = r10
        L_0x003d:
            r15 = r11 & 2
            if (r15 == 0) goto L_0x0044
            r12 = r12 | 48
            goto L_0x0052
        L_0x0044:
            r15 = r10 & 48
            if (r15 != 0) goto L_0x0052
            boolean r15 = r8.V(r2)
            if (r15 == 0) goto L_0x0050
            r15 = r6
            goto L_0x0051
        L_0x0050:
            r15 = r5
        L_0x0051:
            r12 = r12 | r15
        L_0x0052:
            r15 = r11 & 4
            if (r15 == 0) goto L_0x005b
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r9 = r27
            goto L_0x006e
        L_0x005b:
            r9 = r10 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0058
            r9 = r27
            boolean r16 = r8.V(r9)
            if (r16 == 0) goto L_0x006a
            r16 = r4
            goto L_0x006c
        L_0x006a:
            r16 = r3
        L_0x006c:
            r12 = r12 | r16
        L_0x006e:
            r16 = r11 & 8
            if (r16 == 0) goto L_0x0077
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r14 = r28
            goto L_0x008a
        L_0x0077:
            r14 = r10 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0074
            r14 = r28
            boolean r17 = r8.V(r14)
            if (r17 == 0) goto L_0x0086
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r12 = r12 | r17
        L_0x008a:
            r5 = r5 & r11
            if (r5 == 0) goto L_0x0092
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x008f:
            r13 = r29
            goto L_0x00a5
        L_0x0092:
            r13 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x008f
            r13 = r29
            boolean r18 = r8.V(r13)
            if (r18 == 0) goto L_0x00a1
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r12 = r12 | r18
        L_0x00a5:
            r18 = r11 & 32
            r19 = 196608(0x30000, float:2.75506E-40)
            if (r18 == 0) goto L_0x00b0
            r12 = r12 | r19
            r6 = r30
            goto L_0x00c3
        L_0x00b0:
            r19 = r10 & r19
            r6 = r30
            if (r19 != 0) goto L_0x00c3
            boolean r20 = r8.c(r6)
            if (r20 == 0) goto L_0x00bf
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r12 = r12 | r20
        L_0x00c3:
            r20 = r11 & 64
            r21 = 1572864(0x180000, float:2.204052E-39)
            if (r20 == 0) goto L_0x00ce
            r12 = r12 | r21
            r7 = r31
            goto L_0x00e1
        L_0x00ce:
            r21 = r10 & r21
            r7 = r31
            if (r21 != 0) goto L_0x00e1
            boolean r22 = r8.b(r7)
            if (r22 == 0) goto L_0x00dd
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r12 = r12 | r22
        L_0x00e1:
            r3 = r3 & r11
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 == 0) goto L_0x00eb
            r12 = r12 | r23
            r0 = r32
            goto L_0x00fe
        L_0x00eb:
            r23 = r10 & r23
            r0 = r32
            if (r23 != 0) goto L_0x00fe
            boolean r24 = r8.F(r0)
            if (r24 == 0) goto L_0x00fa
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r12 = r12 | r24
        L_0x00fe:
            r4 = r4 & r11
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x0108
            r12 = r12 | r22
            r0 = r33
            goto L_0x011b
        L_0x0108:
            r22 = r10 & r22
            r0 = r33
            if (r22 != 0) goto L_0x011b
            boolean r22 = r8.F(r0)
            if (r22 == 0) goto L_0x0117
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0119
        L_0x0117:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0119:
            r12 = r12 | r22
        L_0x011b:
            r22 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r12 & r22
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r2) goto L_0x0138
            boolean r0 = r8.l()
            if (r0 != 0) goto L_0x012c
            goto L_0x0138
        L_0x012c:
            r8.L()
            r10 = r33
            r3 = r9
            r5 = r13
            r4 = r14
            r9 = r32
            goto L_0x02a6
        L_0x0138:
            if (r15 == 0) goto L_0x013d
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r9 = r0
        L_0x013d:
            if (r16 == 0) goto L_0x0142
            id.a r0 = id.C9842a.Dark
            r14 = r0
        L_0x0142:
            if (r5 == 0) goto L_0x0147
            id.b r0 = id.C9843b.Buy
            r13 = r0
        L_0x0147:
            if (r18 == 0) goto L_0x0151
            r0 = 100
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r6 = r0
        L_0x0151:
            if (r20 == 0) goto L_0x0154
            r7 = 1
        L_0x0154:
            if (r3 == 0) goto L_0x0176
            r0 = -1137921778(0xffffffffbc2cb10e, float:-0.01054026)
            r8.W(r0)
            java.lang.Object r0 = r8.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x0170
            id.c r0 = new id.c
            r0.<init>()
            r8.u(r0)
        L_0x0170:
            nI.l r0 = (nI.C17642l) r0
            r8.P()
            goto L_0x0178
        L_0x0176:
            r0 = r32
        L_0x0178:
            r2 = 0
            if (r4 == 0) goto L_0x017d
            r3 = r2
            goto L_0x017f
        L_0x017d:
            r3 = r33
        L_0x017f:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x018e
            r4 = -1
            java.lang.String r5 = "com.google.pay.button.PayButton (PayButton.kt:62)"
            r15 = -268720185(0xffffffffeffba7c7, float:-1.5576714E29)
            U0.C4895p.S(r15, r12, r4, r5)
        L_0x018e:
            r4 = -1137919090(0xffffffffbc2cbb8e, float:-0.010542763)
            r8.W(r4)
            java.lang.Object r4 = r8.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r15 = r5.a()
            if (r4 != r15) goto L_0x01aa
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r15 = 2
            U0.r0 r4 = U0.u1.e(r4, r2, r15, r2)
            r8.u(r4)
        L_0x01aa:
            U0.r0 r4 = (U0.C4899r0) r4
            r8.P()
            U0.I0 r2 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r2 = r8.Q(r2)
            c2.d r2 = (c2.d) r2
            float r2 = r2.H1(r6)
            int r2 = (int) r2
            boolean r15 = l(r4)
            if (r15 != 0) goto L_0x027b
            r15 = -915575883(0xffffffffc96d6bb5, float:-972475.3)
            r8.W(r15)
            r15 = -1137911450(0xffffffffbc2cd966, float:-0.010549879)
            r8.W(r15)
            r15 = r12 & 7168(0x1c00, float:1.0045E-41)
            r16 = 0
            r17 = r6
            r6 = 2048(0x800, float:2.87E-42)
            if (r15 != r6) goto L_0x01dc
            r6 = 1
            goto L_0x01de
        L_0x01dc:
            r6 = r16
        L_0x01de:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r12
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r15 != r10) goto L_0x01e8
            r10 = 1
            goto L_0x01ea
        L_0x01e8:
            r10 = r16
        L_0x01ea:
            r6 = r6 | r10
            boolean r10 = r8.d(r2)
            r6 = r6 | r10
            r10 = r12 & 112(0x70, float:1.57E-43)
            r15 = 32
            if (r10 != r15) goto L_0x01f8
            r10 = 1
            goto L_0x01fa
        L_0x01f8:
            r10 = r16
        L_0x01fa:
            r6 = r6 | r10
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r10 & r12
            r15 = 8388608(0x800000, float:1.17549435E-38)
            if (r10 != r15) goto L_0x0204
            r10 = 1
            goto L_0x0206
        L_0x0204:
            r10 = r16
        L_0x0206:
            r6 = r6 | r10
            java.lang.Object r10 = r8.D()
            if (r6 != 0) goto L_0x0213
            java.lang.Object r6 = r5.a()
            if (r10 != r6) goto L_0x0229
        L_0x0213:
            id.d r10 = new id.d
            r27 = r10
            r28 = r14
            r29 = r13
            r30 = r2
            r31 = r26
            r32 = r0
            r33 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r8.u(r10)
        L_0x0229:
            r2 = r10
            nI.l r2 = (nI.C17642l) r2
            r8.P()
            r6 = -1137888610(0xffffffffbc2d329e, float:-0.01057115)
            r8.W(r6)
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r12
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r10) goto L_0x023e
            r6 = 1
            goto L_0x0240
        L_0x023e:
            r6 = r16
        L_0x0240:
            r10 = r12 & 14
            r15 = 4
            if (r10 != r15) goto L_0x0247
            r16 = 1
        L_0x0247:
            r6 = r6 | r16
            java.lang.Object r10 = r8.D()
            if (r6 != 0) goto L_0x0255
            java.lang.Object r5 = r5.a()
            if (r10 != r5) goto L_0x025d
        L_0x0255:
            id.e r10 = new id.e
            r10.<init>(r4, r7, r1)
            r8.u(r10)
        L_0x025d:
            r4 = r10
            nI.l r4 = (nI.C17642l) r4
            r8.P()
            int r5 = r12 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 0
            r27 = r2
            r28 = r9
            r29 = r4
            r30 = r8
            r31 = r5
            r32 = r6
            androidx.compose.ui.viewinterop.e.a(r27, r28, r29, r30, r31, r32)
            r8.P()
            goto L_0x0296
        L_0x027b:
            r17 = r6
            r2 = -914337774(0xffffffffc9805012, float:-1051138.2)
            r8.W(r2)
            if (r3 != 0) goto L_0x0286
            goto L_0x0293
        L_0x0286:
            int r2 = r12 >> 24
            r2 = r2 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.invoke(r8, r2)
            XH.N r2 = XH.C16807N.f139792a
        L_0x0293:
            r8.P()
        L_0x0296:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x029f
            U0.C4895p.R()
        L_0x029f:
            r10 = r3
            r3 = r9
            r5 = r13
            r4 = r14
            r6 = r17
            r9 = r0
        L_0x02a6:
            U0.Y0 r12 = r8.n()
            if (r12 == 0) goto L_0x02bf
            id.f r13 = new id.f
            r0 = r13
            r1 = r25
            r2 = r26
            r8 = r9
            r9 = r10
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x02bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.h.f(nI.a, java.lang.String, androidx.compose.ui.d, id.a, id.b, float, boolean, nI.l, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Throwable th2) {
        C17542s.j(th2, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final PayButton h(C9842a aVar, C9843b bVar, int i10, String str, C17642l lVar, C4899r0 r0Var, Context context) {
        Object obj;
        C17542s.j(context, "context");
        PayButton payButton = new PayButton(context);
        try {
            x.a aVar2 = x.f139812b;
            payButton.a(ButtonOptions.U().c(aVar.b()).d(bVar.b()).e(i10).b(str).a());
            obj = x.b(C16807N.f139792a);
        } catch (Throwable th2) {
            x.a aVar3 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        Throwable e10 = x.e(obj);
        if (e10 != null) {
            lVar.invoke(e10);
            m(r0Var, true);
        }
        return payButton;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C4899r0 r0Var, boolean z10, C17631a aVar, PayButton payButton) {
        C17542s.j(payButton, "button");
        if (!l(r0Var)) {
            payButton.setAlpha(z10 ? 1.0f : 0.5f);
            payButton.setEnabled(z10);
            if (z10) {
                payButton.setOnClickListener(new g(aVar));
            } else {
                payButton.setOnClickListener((View.OnClickListener) null);
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void j(C17631a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17631a aVar, String str, d dVar, C9842a aVar2, C9843b bVar, float f10, boolean z10, C17642l lVar, p pVar, int i10, int i11, C4889m mVar, int i12) {
        f(aVar, str, dVar, aVar2, bVar, f10, z10, lVar, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final boolean l(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void m(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }
}
