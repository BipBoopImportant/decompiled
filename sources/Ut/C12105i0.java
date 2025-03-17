package ut;

import It.C10749l;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tt.C11991a;
import vB.C15129b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LvB/b;", "carouselShoppingListState", "", "isExpandedWidth", "Lkotlin/Function1;", "", "LXH/N;", "onClick", "Landroidx/compose/ui/d;", "modifier", "LIt/l;", "analyticsAction", "e", "(LvB/b;ZLnI/l;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ut.i0  reason: case insensitive filesystem */
public final class C12105i0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(vB.C15129b r18, boolean r19, nI.C17642l<? super java.lang.String, XH.C16807N> r20, androidx.compose.ui.d r21, nI.C17642l<? super It.C10749l, XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r10 = r18
            r11 = r20
            r12 = r22
            r13 = r24
            java.lang.String r0 = "carouselShoppingListState"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "analyticsAction"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -466547653(0xffffffffe4310c3b, float:-1.306382E22)
            r1 = r23
            U0.m r14 = r1.k(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0027
            r1 = r13 | 6
            goto L_0x0040
        L_0x0027:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x003f
            r1 = r13 & 8
            if (r1 != 0) goto L_0x0034
            boolean r1 = r14.V(r10)
            goto L_0x0038
        L_0x0034:
            boolean r1 = r14.F(r10)
        L_0x0038:
            if (r1 == 0) goto L_0x003c
            r1 = 4
            goto L_0x003d
        L_0x003c:
            r1 = 2
        L_0x003d:
            r1 = r1 | r13
            goto L_0x0040
        L_0x003f:
            r1 = r13
        L_0x0040:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 48
            r15 = r19
            goto L_0x005b
        L_0x0049:
            r2 = r13 & 48
            r15 = r19
            if (r2 != 0) goto L_0x005b
            boolean r2 = r14.b(r15)
            if (r2 == 0) goto L_0x0058
            r2 = 32
            goto L_0x005a
        L_0x0058:
            r2 = 16
        L_0x005a:
            r1 = r1 | r2
        L_0x005b:
            r2 = r25 & 4
            r3 = 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0064
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0064:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0073
            boolean r2 = r14.F(r11)
            if (r2 == 0) goto L_0x0070
            r2 = r3
            goto L_0x0072
        L_0x0070:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r1 = r1 | r2
        L_0x0073:
            r2 = r25 & 8
            if (r2 == 0) goto L_0x007c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0079:
            r4 = r21
            goto L_0x008e
        L_0x007c:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0079
            r4 = r21
            boolean r5 = r14.V(r4)
            if (r5 == 0) goto L_0x008b
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r1 = r1 | r5
        L_0x008e:
            r5 = r25 & 16
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x0097
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0097:
            r5 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x00a6
            boolean r5 = r14.F(r12)
            if (r5 == 0) goto L_0x00a3
            r5 = r6
            goto L_0x00a5
        L_0x00a3:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r1 = r1 | r5
        L_0x00a6:
            r5 = r1 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r7) goto L_0x00b8
            boolean r5 = r14.l()
            if (r5 != 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            r14.L()
            goto L_0x01aa
        L_0x00b8:
            if (r2 == 0) goto L_0x00be
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r9 = r2
            goto L_0x00bf
        L_0x00be:
            r9 = r4
        L_0x00bf:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00cb
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.instore.impl.composables.InstoreShoppingList (InstoreShoppingList.kt:31)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x00cb:
            uB.g r2 = new uB.g
            int r0 = st.c.f102782k0
            r4 = 0
            java.lang.String r0 = J1.j.b(r0, r14, r4)
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r14, r7)
            long r7 = r5.k0()
            r5 = 0
            r2.<init>(r0, r7, r5)
            r0 = 105604282(0x64b64ba, float:3.825406E-35)
            r14.W(r0)
            r0 = r1 & 896(0x380, float:1.256E-42)
            if (r0 != r3) goto L_0x00f0
            r8 = 1
            goto L_0x00f1
        L_0x00f0:
            r8 = r4
        L_0x00f1:
            r16 = 57344(0xe000, float:8.0356E-41)
            r4 = r1 & r16
            if (r4 != r6) goto L_0x00fb
            r16 = 1
            goto L_0x00fd
        L_0x00fb:
            r16 = 0
        L_0x00fd:
            r8 = r8 | r16
            java.lang.Object r5 = r14.D()
            if (r8 != 0) goto L_0x010d
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r5 != r8) goto L_0x0115
        L_0x010d:
            ut.e0 r5 = new ut.e0
            r5.<init>(r11, r12)
            r14.u(r5)
        L_0x0115:
            nI.l r5 = (nI.C17642l) r5
            r14.P()
            r8 = 105612889(0x64b8659, float:3.827876E-35)
            r14.W(r8)
            if (r4 != r6) goto L_0x0124
            r8 = 1
            goto L_0x0125
        L_0x0124:
            r8 = 0
        L_0x0125:
            if (r0 != r3) goto L_0x012a
            r16 = 1
            goto L_0x012c
        L_0x012a:
            r16 = 0
        L_0x012c:
            r8 = r8 | r16
            java.lang.Object r7 = r14.D()
            if (r8 != 0) goto L_0x013c
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x0144
        L_0x013c:
            ut.f0 r7 = new ut.f0
            r7.<init>(r12, r11)
            r14.u(r7)
        L_0x0144:
            nI.a r7 = (nI.C17631a) r7
            r14.P()
            r8 = 105621495(0x64ba7f7, float:3.8303458E-35)
            r14.W(r8)
            if (r0 != r3) goto L_0x0153
            r0 = 1
            goto L_0x0154
        L_0x0153:
            r0 = 0
        L_0x0154:
            if (r4 != r6) goto L_0x0158
            r4 = 1
            goto L_0x0159
        L_0x0158:
            r4 = 0
        L_0x0159:
            r0 = r0 | r4
            java.lang.Object r3 = r14.D()
            if (r0 != 0) goto L_0x0168
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x0170
        L_0x0168:
            ut.g0 r3 = new ut.g0
            r3.<init>(r11, r12)
            r14.u(r3)
        L_0x0170:
            r6 = r3
            nI.a r6 = (nI.C17631a) r6
            r14.P()
            r0 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.f(r9, r0, r4, r3)
            int r0 = vB.C15129b.f131420c
            r3 = r1 & 14
            r0 = r0 | r3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = uB.C15109g.f131301c
            int r1 = r1 << 6
            r16 = r0 | r1
            r17 = 0
            r0 = r18
            r1 = r19
            r3 = r5
            r4 = r7
            r5 = r6
            r6 = r8
            r7 = r14
            r8 = r16
            r16 = r9
            r9 = r17
            uB.r.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01a8
            U0.C4895p.R()
        L_0x01a8:
            r4 = r16
        L_0x01aa:
            U0.Y0 r8 = r14.n()
            if (r8 == 0) goto L_0x01c5
            ut.h0 r9 = new ut.h0
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.C12105i0.e(vB.b, boolean, nI.l, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17642l lVar, C17642l lVar2, String str) {
        C17542s.j(str, "it");
        lVar.invoke(str);
        lVar2.invoke(new C10749l.c(C11991a.c.VIEW_ITEM_LIST));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17642l lVar, C17642l lVar2) {
        lVar.invoke(new C10749l.c(C11991a.c.CREATE_LIST));
        lVar2.invoke(null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, C17642l lVar2) {
        lVar.invoke(null);
        lVar2.invoke(new C10749l.c(C11991a.c.VIEW_LIST));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C15129b bVar, boolean z10, C17642l lVar, d dVar, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        e(bVar, z10, lVar, dVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
