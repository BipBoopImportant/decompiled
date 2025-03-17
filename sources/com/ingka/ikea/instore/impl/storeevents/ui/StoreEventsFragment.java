package com.ingka.ikea.instore.impl.storeevents.ui;

import XH.C16807N;
import androidx.navigation.fragment.a;
import com.ingka.ikea.core.android.fragments.BaseComposeFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/instore/impl/storeevents/ui/StoreEventsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "", "S", "Z", "v0", "()Z", "drawUnderStatusBar", "T", "u0", "drawUnderNavigationBar", "U", "t0", "drawUnderDisplayCutout", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreEventsFragment extends BaseComposeFragment {

    /* renamed from: S  reason: collision with root package name */
    private final boolean f96308S;

    /* renamed from: T  reason: collision with root package name */
    private final boolean f96309T;

    /* renamed from: U  reason: collision with root package name */
    private final boolean f96310U;

    /* access modifiers changed from: private */
    public static final C16807N H0(StoreEventsFragment storeEventsFragment) {
        a.a(storeEventsFragment).i0();
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.a} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r8, int r9) {
        /*
            r7 = this;
            r0 = 123754096(0x7605670, float:1.6877289E-34)
            r8.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.instore.impl.storeevents.ui.StoreEventsFragment.FragmentContent (StoreEventsFragment.kt:24)"
            U0.C4895p.S(r0, r9, r1, r2)
        L_0x0012:
            r0 = 574448436(0x223d6334, float:2.5666794E-18)
            r8.W(r0)
            java.lang.Object r0 = r8.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x008e
            x4.o r0 = androidx.navigation.fragment.a.a(r7)
            x4.l r0 = r0.H()
            if (r0 == 0) goto L_0x0086
            android.os.Bundle r1 = r0.c()
            if (r1 != 0) goto L_0x0039
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L_0x0039:
            x4.v r0 = r0.e()
            java.util.Map r0 = r0.s()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r3 = r0.size()
            int r3 = YH.X.e(r3)
            r2.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0058:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            x4.i r3 = (x4.C8945i) r3
            x4.F r3 = r3.a()
            r2.put(r4, r3)
            goto L_0x0058
        L_0x0076:
            com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$StoreEventsHost$a r0 = com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$StoreEventsHost.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            java.lang.Object r0 = C4.h.a(r0, r1, r2)
            com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$StoreEventsHost r0 = (com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$StoreEventsHost) r0
            r8.u(r0)
            goto L_0x008e
        L_0x0086:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Required value was null."
            r8.<init>(r9)
            throw r8
        L_0x008e:
            com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$StoreEventsHost r0 = (com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$StoreEventsHost) r0
            r8.P()
            java.lang.String r1 = r0.b()
            java.lang.String r2 = r0.a()
            r0 = 574458770(0x223d8b92, float:2.5688164E-18)
            r8.W(r0)
            r0 = r9 & 14
            r0 = r0 ^ 6
            r3 = 4
            if (r0 <= r3) goto L_0x00ae
            boolean r0 = r8.V(r7)
            if (r0 != 0) goto L_0x00b2
        L_0x00ae:
            r0 = r9 & 6
            if (r0 != r3) goto L_0x00b4
        L_0x00b2:
            r0 = 1
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            java.lang.Object r3 = r8.D()
            if (r0 != 0) goto L_0x00c3
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x00cb
        L_0x00c3:
            fu.a r3 = new fu.a
            r3.<init>(r7)
            r8.u(r3)
        L_0x00cb:
            r4 = r3
            nI.a r4 = (nI.C17631a) r4
            r8.P()
            int r9 = r9 << 6
            r9 = r9 & 896(0x380, float:1.256E-42)
            r6 = r9 | 54
            r3 = r7
            r5 = r8
            com.ingka.ikea.instore.impl.storeevents.navigation.c.e(r1, r2, r3, r4, r5, r6)
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00e5
            U0.C4895p.R()
        L_0x00e5:
            r8.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.impl.storeevents.ui.StoreEventsFragment.D0(U0.m, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f96310U;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f96309T;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f96308S;
    }
}
