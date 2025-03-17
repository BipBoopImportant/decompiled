package Ai;

import Dl.b;
import KJ.C15987c;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0011\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "title", "LKJ/c;", "LHx/b;", "articles", "Lkotlin/Function0;", "LXH/N;", "viewAllProductsCallback", "Lkotlin/Function1;", "onThumbnailClicked", "", "showThumbnails", "d", "(Ljava/lang/String;LKJ/c;LnI/a;LnI/l;ZLU0/m;II)V", "LDl/b;", "Landroidx/compose/ui/d;", "modifier", "g", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class N0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(java.lang.String r26, KJ.C15987c<Hx.b> r27, nI.C17631a<XH.C16807N> r28, nI.C17642l<? super java.lang.String, XH.C16807N> r29, boolean r30, U0.C4889m r31, int r32, int r33) {
        /*
            r13 = r26
            r1 = r27
            r0 = r28
            r12 = r29
            r11 = r32
            r2 = 16
            r3 = 2
            r4 = 4
            java.lang.String r5 = "title"
            kotlin.jvm.internal.C17542s.j(r13, r5)
            java.lang.String r5 = "articles"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            java.lang.String r5 = "viewAllProductsCallback"
            kotlin.jvm.internal.C17542s.j(r0, r5)
            java.lang.String r5 = "onThumbnailClicked"
            kotlin.jvm.internal.C17542s.j(r12, r5)
            r5 = -1532815244(0xffffffffa4a31874, float:-7.073141E-17)
            r6 = r31
            U0.m r10 = r6.k(r5)
            r9 = 1
            r6 = r33 & 1
            if (r6 == 0) goto L_0x0033
            r6 = r11 | 6
            goto L_0x0043
        L_0x0033:
            r6 = r11 & 6
            if (r6 != 0) goto L_0x0042
            boolean r6 = r10.V(r13)
            if (r6 == 0) goto L_0x003f
            r6 = r4
            goto L_0x0040
        L_0x003f:
            r6 = r3
        L_0x0040:
            r6 = r6 | r11
            goto L_0x0043
        L_0x0042:
            r6 = r11
        L_0x0043:
            r3 = r33 & 2
            if (r3 == 0) goto L_0x004a
            r6 = r6 | 48
            goto L_0x0059
        L_0x004a:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0059
            boolean r3 = r10.F(r1)
            if (r3 == 0) goto L_0x0057
            r3 = 32
            goto L_0x0058
        L_0x0057:
            r3 = r2
        L_0x0058:
            r6 = r6 | r3
        L_0x0059:
            r3 = r33 & 4
            if (r3 == 0) goto L_0x0060
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0070
        L_0x0060:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0070
            boolean r3 = r10.F(r0)
            if (r3 == 0) goto L_0x006d
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x006f
        L_0x006d:
            r3 = 128(0x80, float:1.794E-43)
        L_0x006f:
            r6 = r6 | r3
        L_0x0070:
            r3 = r33 & 8
            if (r3 == 0) goto L_0x0077
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0087
        L_0x0077:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0087
            boolean r3 = r10.F(r12)
            if (r3 == 0) goto L_0x0084
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r6 = r6 | r3
        L_0x0087:
            r2 = r33 & 16
            if (r2 == 0) goto L_0x0091
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r3 = r30
        L_0x008f:
            r7 = r6
            goto L_0x00a4
        L_0x0091:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008d
            r3 = r30
            boolean r4 = r10.b(r3)
            if (r4 == 0) goto L_0x00a0
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r6 = r6 | r4
            goto L_0x008f
        L_0x00a4:
            r4 = r7 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r6) goto L_0x00b9
            boolean r4 = r10.l()
            if (r4 != 0) goto L_0x00b1
            goto L_0x00b9
        L_0x00b1:
            r10.L()
            r5 = r3
            r6 = r10
            r7 = r12
            goto L_0x0245
        L_0x00b9:
            if (r2 == 0) goto L_0x00be
            r17 = r9
            goto L_0x00c0
        L_0x00be:
            r17 = r3
        L_0x00c0:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00cc
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseDetailsArticlesSection (PurchaseDetailsArticlesSections.kt:38)"
            U0.C4895p.S(r5, r7, r2, r3)
        L_0x00cc:
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = 0
            r4 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r3, r9, r4)
            java.lang.String r3 = "PurchaseArticlesTestTags_CONTAINER"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            r6 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r10, r6)
            int r4 = U0.C4883j.a(r10, r6)
            U0.y r5 = r10.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r10, r2)
            G1.g$a r14 = G1.C4504g.f6515W
            nI.a r15 = r14.a()
            U0.f r16 = r10.m()
            if (r16 != 0) goto L_0x0106
            U0.C4883j.c()
        L_0x0106:
            r10.I()
            boolean r16 = r10.i()
            if (r16 == 0) goto L_0x0113
            r10.p(r15)
            goto L_0x0116
        L_0x0113:
            r10.t()
        L_0x0116:
            U0.m r15 = U0.F1.a(r10)
            nI.p r6 = r14.c()
            U0.F1.c(r15, r3, r6)
            nI.p r3 = r14.e()
            U0.F1.c(r15, r5, r3)
            nI.p r3 = r14.b()
            boolean r5 = r15.i()
            if (r5 != 0) goto L_0x0140
            java.lang.Object r5 = r15.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)
            if (r5 != 0) goto L_0x014e
        L_0x0140:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r15.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.w(r4, r3)
        L_0x014e:
            nI.p r3 = r14.d()
            U0.F1.c(r15, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            U0.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r2 = r10.Q(r2)
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.Resources r3 = r2.getResources()
            java.util.Iterator r2 = r27.iterator()
            r6 = 0
        L_0x016a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x017c
            java.lang.Object r4 = r2.next()
            Hx.b r4 = (Hx.b) r4
            int r4 = r4.e()
            int r6 = r6 + r4
            goto L_0x016a
        L_0x017c:
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            java.lang.String r2 = "PurchaseArticlesTestTags_ARTICLE_TITLE_TEST_TAG"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r15, r2)
            SC.c1$a r18 = new SC.c1$a
            r4 = r18
            int r19 = uK.C18146a.f148225Ra
            r23 = 12
            r24 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            SC.b1$d r5 = SC.C13569b1.d.f116148b
            int r14 = Oo.a.f84315j
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r8 = new java.lang.Object[]{r16}
            java.lang.String r3 = r3.getQuantityString(r14, r6, r8)
            r6 = r7 & 14
            r6 = r6 | 384(0x180, float:5.38E-43)
            int r18 = r7 >> 3
            r8 = r18 & 112(0x70, float:1.57E-43)
            r6 = r6 | r8
            int r8 = SC.C13573c1.a.f116164f
            int r8 = r8 << 12
            r6 = r6 | r8
            int r8 = SC.C13569b1.d.f116149c
            int r8 = r8 << 15
            r14 = r6 | r8
            r6 = 6
            r19 = r15
            r15 = r6
            r16 = 7104(0x1bc0, float:9.955E-42)
            r6 = 0
            r20 = 0
            r8 = 0
            r25 = r7
            r7 = r8
            r21 = 0
            r22 = r9
            r9 = r21
            r21 = 1
            r30 = r10
            r10 = r21
            r21 = 0
            r11 = r21
            r21 = 0
            r12 = r21
            r0 = r26
            r1 = r28
            r13 = r30
            SC.C13585f1.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -471936349(0xffffffffe3ded2a3, float:-8.2207103E21)
            r6 = r30
            r6.W(r0)
            if (r17 == 0) goto L_0x0232
            androidx.compose.ui.d r2 = TC.e.i(r19)
            r0 = -471930050(0xffffffffe3deeb3e, float:-8.2242563E21)
            r6.W(r0)
            r0 = r25
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 != r1) goto L_0x0204
            r9 = r22
            goto L_0x0206
        L_0x0204:
            r9 = r20
        L_0x0206:
            java.lang.Object r0 = r6.D()
            if (r9 != 0) goto L_0x0218
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0215
            goto L_0x0218
        L_0x0215:
            r7 = r29
            goto L_0x0222
        L_0x0218:
            Ai.K0 r0 = new Ai.K0
            r7 = r29
            r0.<init>(r7)
            r6.u(r0)
        L_0x0222:
            r1 = r0
            nI.l r1 = (nI.C17642l) r1
            r6.P()
            r4 = r18 & 14
            r5 = 0
            r0 = r27
            r3 = r6
            g(r0, r1, r2, r3, r4, r5)
            goto L_0x0234
        L_0x0232:
            r7 = r29
        L_0x0234:
            r6.P()
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0243
            U0.C4895p.R()
        L_0x0243:
            r5 = r17
        L_0x0245:
            U0.Y0 r8 = r6.n()
            if (r8 == 0) goto L_0x0260
            Ai.L0 r9 = new Ai.L0
            r0 = r9
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0260:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.N0.d(java.lang.String, KJ.c, nI.a, nI.l, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, b bVar) {
        C17542s.j(bVar, "it");
        lVar.invoke(bVar.getId());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, C15987c cVar, C17631a aVar, C17642l lVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        d(str, cVar, aVar, lVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void g(KJ.C15987c<Hx.b> r20, nI.C17642l<? super Dl.b, XH.C16807N> r21, androidx.compose.ui.d r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r20
            r4 = r24
            r0 = -1255749074(0xffffffffb526ca2e, float:-6.213403E-7)
            r2 = r23
            U0.m r2 = r2.k(r0)
            r3 = r25 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r4 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r4 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r4
            goto L_0x0024
        L_0x0023:
            r3 = r4
        L_0x0024:
            r5 = r25 & 2
            if (r5 == 0) goto L_0x002d
            r3 = r3 | 48
            r11 = r21
            goto L_0x003f
        L_0x002d:
            r5 = r4 & 48
            r11 = r21
            if (r5 != 0) goto L_0x003f
            boolean r5 = r2.F(r11)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r3 = r3 | r5
        L_0x003f:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r6 = r22
            goto L_0x005a
        L_0x0048:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0045
            r6 = r22
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x0057
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r7
        L_0x005a:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x006d
            boolean r7 = r2.l()
            if (r7 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            r2.L()
            r3 = r6
            goto L_0x00de
        L_0x006d:
            if (r5 == 0) goto L_0x0073
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r12 = r5
            goto L_0x0074
        L_0x0073:
            r12 = r6
        L_0x0074:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0080
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseDetailsArticlesThumbnails (PurchaseDetailsArticlesSections.kt:80)"
            U0.C4895p.S(r0, r3, r5, r6)
        L_0x0080:
            java.lang.String r0 = "PurchaseArticlesTestTags_ARTICLE_THUMBNAILS_TEST_TAG"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r12, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r1, r5)
            r0.<init>(r5)
            java.util.Iterator r5 = r20.iterator()
        L_0x0095:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00bd
            java.lang.Object r6 = r5.next()
            Hx.b r6 = (Hx.b) r6
            Dl.b r8 = new Dl.b
            java.lang.String r14 = r6.b()
            java.lang.String r15 = r6.d()
            java.lang.String r16 = r6.f()
            r18 = 8
            r19 = 0
            r17 = 0
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0.add(r8)
            goto L_0x0095
        L_0x00bd:
            java.util.List r0 = YH.C16877v.m0(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            KJ.c r5 = KJ.C15985a.h(r0)
            int r0 = Dl.b.f79786f
            r3 = r3 & 112(0x70, float:1.57E-43)
            r9 = r0 | r3
            r10 = 0
            r6 = r21
            r8 = r2
            Dl.m.k(r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00dd
            U0.C4895p.R()
        L_0x00dd:
            r3 = r12
        L_0x00de:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x00f5
            Ai.M0 r7 = new Ai.M0
            r0 = r7
            r1 = r20
            r2 = r21
            r4 = r24
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.N0.g(KJ.c, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C15987c cVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        g(cVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
