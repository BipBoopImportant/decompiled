package jv;

import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mv.C11601f;
import mv.C11602g;
import mv.C11603h;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"Lx4/o;", "navController", "Lmv/h;", "viewModel", "LXH/N;", "c", "(Lx4/o;Lmv/h;LU0/m;II)V", "Lmv/g;", "uiState", "liveshopping-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jv.N  reason: case insensitive filesystem */
public final class C11469N {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        if ((r14 & 2) != 0) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(x4.C8951o r10, mv.C11603h r11, U0.C4889m r12, int r13, int r14) {
        /*
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            r0 = 2069729204(0x7b5d8fb4, float:1.15041225E36)
            U0.m r12 = r12.k(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r13 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0022
            boolean r1 = r12.F(r10)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r13
            goto L_0x0023
        L_0x0022:
            r1 = r13
        L_0x0023:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0037
            r2 = r14 & 2
            if (r2 != 0) goto L_0x0034
            boolean r2 = r12.F(r11)
            if (r2 == 0) goto L_0x0034
            r2 = 32
            goto L_0x0036
        L_0x0034:
            r2 = 16
        L_0x0036:
            r1 = r1 | r2
        L_0x0037:
            r9 = r1
            r1 = r9 & 19
            r2 = 18
            if (r1 != r2) goto L_0x004a
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            r12.L()
            goto L_0x00f5
        L_0x004a:
            r12.G()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0062
            boolean r1 = r12.O()
            if (r1 == 0) goto L_0x0058
            goto L_0x0062
        L_0x0058:
            r12.L()
            r1 = r14 & 2
            if (r1 == 0) goto L_0x00a2
        L_0x005f:
            r9 = r9 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00a2
        L_0x0062:
            r1 = r14 & 2
            if (r1 == 0) goto L_0x00a2
            r11 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.C(r11)
            m3.a r11 = m3.a.f26247a
            r1 = 6
            androidx.lifecycle.k0 r2 = r11.a(r12, r1)
            if (r2 == 0) goto L_0x009a
            boolean r11 = r2 instanceof androidx.lifecycle.C5212o
            if (r11 == 0) goto L_0x0082
            r11 = r2
            androidx.lifecycle.o r11 = (androidx.lifecycle.C5212o) r11
            l3.a r11 = r11.getDefaultViewModelCreationExtras()
        L_0x0080:
            r5 = r11
            goto L_0x0085
        L_0x0082:
            l3.a$a r11 = l3.a.C0407a.f25486b
            goto L_0x0080
        L_0x0085:
            java.lang.Class<mv.h> r11 = mv.C11603h.class
            uI.d r1 = kotlin.jvm.internal.P.b(r11)
            r7 = 0
            r8 = 0
            r3 = 0
            r4 = 0
            r6 = r12
            androidx.lifecycle.f0 r11 = m3.c.c(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.U()
            mv.h r11 = (mv.C11603h) r11
            goto L_0x005f
        L_0x009a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00a2:
            r12.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00b1
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.liveshopping.impl.presentation.compose.LiveShoppingDestination (LiveShoppingDestination.kt:18)"
            U0.C4895p.S(r0, r9, r1, r2)
        L_0x00b1:
            TJ.P r1 = r11.m()
            r6 = 0
            r7 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r12
            U0.A1 r0 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            r1 = -1563796724(0xffffffffa2ca5b0c, float:-5.484861E-18)
            r12.W(r1)
            boolean r1 = r12.F(r10)
            java.lang.Object r2 = r12.D()
            if (r1 != 0) goto L_0x00d7
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00df
        L_0x00d7:
            jv.L r2 = new jv.L
            r2.<init>(r10)
            r12.u(r2)
        L_0x00df:
            nI.l r2 = (nI.C17642l) r2
            r12.P()
            mv.g r0 = d(r0)
            r1 = 0
            jv.d0.e(r0, r2, r12, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00f5
            U0.C4895p.R()
        L_0x00f5:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x0103
            jv.M r0 = new jv.M
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.C11469N.c(x4.o, mv.h, U0.m, int, int):void");
    }

    private static final C11602g d(A1<? extends C11602g> a12) {
        return (C11602g) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C8951o oVar, C11601f fVar) {
        C17542s.j(fVar, "it");
        if (C17542s.e(fVar, C11601f.a.f99699a)) {
            oVar.k0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C8951o oVar, C11603h hVar, int i10, int i11, C4889m mVar, int i12) {
        c(oVar, hVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
