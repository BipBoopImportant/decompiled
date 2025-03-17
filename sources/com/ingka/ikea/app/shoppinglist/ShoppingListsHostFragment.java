package com.ingka.ikea.app.shoppinglist;

import TJ.C16505B;
import TJ.C16521S;
import U0.A1;
import XH.C16807N;
import androidx.navigation.fragment.a;
import com.ingka.ikea.core.android.fragments.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\b8\u0014XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\nR\u001a\u0010\u0012\u001a\u00020\b8\u0014XD¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0011\u0010\nR\u001a\u0010\u0014\u001a\u00020\b8\u0014XD¢\u0006\f\n\u0004\b\u000e\u0010\u000e\u001a\u0004\b\u0013\u0010\nR\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u000e¨\u0006\u001f²\u0006\f\u0010\u001d\u001a\u00020\b8\nX\u0002²\u0006\f\u0010\u001e\u001a\u00020\b8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/shoppinglist/ShoppingListsHostFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "Lcom/ingka/ikea/core/android/fragments/j;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "", "Y", "()Z", "l0", "d0", "X", "Z", "v0", "drawUnderStatusBar", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "LTJ/B;", "y0", "LTJ/B;", "shouldScrollToTopFlow", "z0", "shouldPopToRootFlow", "A0", "isScrolledToTop", "shouldScrollToTop", "shouldPopToRoot", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShoppingListsHostFragment extends a implements j {

    /* renamed from: A0  reason: collision with root package name */
    private boolean f92354A0;

    /* renamed from: X  reason: collision with root package name */
    private final boolean f92355X = true;

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f92356Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f92357Z;

    /* renamed from: y0  reason: collision with root package name */
    private C16505B<Boolean> f92358y0;

    /* renamed from: z0  reason: collision with root package name */
    private C16505B<Boolean> f92359z0;

    public ShoppingListsHostFragment() {
        Boolean bool = Boolean.FALSE;
        this.f92358y0 = C16521S.a(bool);
        this.f92359z0 = C16521S.a(bool);
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(ShoppingListsHostFragment shoppingListsHostFragment) {
        shoppingListsHostFragment.f92359z0.setValue(Boolean.FALSE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(ShoppingListsHostFragment shoppingListsHostFragment, boolean z10) {
        shoppingListsHostFragment.f92354A0 = z10;
        return C16807N.f139792a;
    }

    private static final boolean M0(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean N0(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(ShoppingListsHostFragment shoppingListsHostFragment) {
        a.a(shoppingListsHostFragment).i0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(ShoppingListsHostFragment shoppingListsHostFragment) {
        Boolean value;
        C16505B<Boolean> b10 = shoppingListsHostFragment.f92358y0;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.FALSE));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r14, int r15) {
        /*
            r13 = this;
            r0 = 787592229(0x2ef1b425, float:1.0991411E-10)
            r14.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.ShoppingListsHostFragment.FragmentContent (ShoppingListsHostFragment.kt:33)"
            U0.C4895p.S(r0, r15, r1, r2)
        L_0x0012:
            r15 = 1710626833(0x65f61811, float:1.4526826E23)
            r14.W(r15)
            java.lang.Object r15 = r14.D()
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r1 = r0.a()
            if (r15 != r1) goto L_0x002f
            java.lang.Class<kk.a> r15 = kk.C11508a.class
            java.lang.Object r15 = dH.C17158b.c(r13, r15)
            kk.a r15 = (kk.C11508a) r15
            r14.u(r15)
        L_0x002f:
            r5 = r15
            kk.a r5 = (kk.C11508a) r5
            r14.P()
            r15 = 1710630619(0x65f626db, float:1.4530236E23)
            r14.W(r15)
            java.lang.Object r15 = r14.D()
            java.lang.Object r0 = r0.a()
            if (r15 != r0) goto L_0x00af
            x4.o r15 = androidx.navigation.fragment.a.a(r13)
            x4.l r15 = r15.H()
            if (r15 == 0) goto L_0x00a7
            android.os.Bundle r0 = r15.c()
            if (r0 != 0) goto L_0x005a
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x005a:
            x4.v r15 = r15.e()
            java.util.Map r15 = r15.s()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = r15.size()
            int r2 = YH.X.e(r2)
            r1.<init>(r2)
            java.util.Set r15 = r15.entrySet()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0079:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r15.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            x4.i r2 = (x4.C8945i) r2
            x4.F r2 = r2.a()
            r1.put(r3, r2)
            goto L_0x0079
        L_0x0097:
            com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ShoppingListHost$a r15 = com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ShoppingListHost.Companion
            kotlinx.serialization.KSerializer r15 = r15.serializer()
            java.lang.Object r15 = C4.h.a(r15, r0, r1)
            com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ShoppingListHost r15 = (com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ShoppingListHost) r15
            r14.u(r15)
            goto L_0x00af
        L_0x00a7:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L_0x00af:
            com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ShoppingListHost r15 = (com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ShoppingListHost) r15
            r14.P()
            TJ.B<java.lang.Boolean> r6 = r13.f92358y0
            r11 = 0
            r12 = 7
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = r14
            U0.A1 r0 = j3.a.c(r6, r7, r8, r9, r10, r11, r12)
            TJ.B<java.lang.Boolean> r6 = r13.f92359z0
            U0.A1 r1 = j3.a.c(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r2 = r15.a()
            boolean r3 = r15.c()
            java.lang.String r15 = r15.b()
            boolean r6 = M0(r0)
            boolean r7 = N0(r1)
            r0 = 1710648918(0x65f66e56, float:1.4546719E23)
            r14.W(r0)
            boolean r0 = r14.F(r13)
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x00f2
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00fa
        L_0x00f2:
            ik.d r1 = new ik.d
            r1.<init>(r13)
            r14.u(r1)
        L_0x00fa:
            r4 = r1
            nI.a r4 = (nI.C17631a) r4
            r14.P()
            r0 = 1710654620(0x65f6849c, float:1.4551855E23)
            r14.W(r0)
            boolean r0 = r14.F(r13)
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x0118
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0120
        L_0x0118:
            ik.e r1 = new ik.e
            r1.<init>(r13)
            r14.u(r1)
        L_0x0120:
            r8 = r1
            nI.a r8 = (nI.C17631a) r8
            r14.P()
            r0 = 1710659255(0x65f696b7, float:1.4556029E23)
            r14.W(r0)
            boolean r0 = r14.F(r13)
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x013e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0146
        L_0x013e:
            ik.f r1 = new ik.f
            r1.<init>(r13)
            r14.u(r1)
        L_0x0146:
            r9 = r1
            nI.a r9 = (nI.C17631a) r9
            r14.P()
            r0 = 1710657130(0x65f68e6a, float:1.4554115E23)
            r14.W(r0)
            boolean r0 = r14.F(r13)
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x0164
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x016c
        L_0x0164:
            ik.g r1 = new ik.g
            r1.<init>(r13)
            r14.u(r1)
        L_0x016c:
            r10 = r1
            nI.l r10 = (nI.C17642l) r10
            r14.P()
            r12 = 438(0x1b6, float:6.14E-43)
            r1 = r2
            r2 = r3
            r3 = r15
            r11 = r14
            zk.l.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r15 = U0.C4895p.J()
            if (r15 == 0) goto L_0x0184
            U0.C4895p.R()
        L_0x0184:
            r14.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.shoppinglist.ShoppingListsHostFragment.D0(U0.m, int):void");
    }

    public boolean Y() {
        return this.f92354A0;
    }

    public void d0() {
        this.f92359z0.setValue(Boolean.TRUE);
    }

    public void l0() {
        this.f92358y0.setValue(Boolean.TRUE);
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f92357Z;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f92356Y;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f92355X;
    }
}
