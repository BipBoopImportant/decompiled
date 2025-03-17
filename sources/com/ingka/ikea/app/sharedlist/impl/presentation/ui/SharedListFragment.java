package com.ingka.ikea.app.sharedlist.impl.presentation.ui;

import Bx.a;
import HJ.C15854t;
import QA.C13352d;
import XH.C16807N;
import com.ingka.ikea.app.sharedlist.impl.navigation.SharedListRoutes$SharedList;
import com.sugarcube.core.logger.DslKt;
import gk.C11302e;
import gk.C11303f;
import gk.C11304g;
import gk.C11305h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rw.f;
import x4.C8951o;
import x4.D;
import x4.E;
import x4.L;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/sharedlist/impl/presentation/ui/SharedListFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "sharedlist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SharedListFragment extends a {
    /* access modifiers changed from: private */
    public static final C16807N N0(SharedListFragment sharedListFragment, a aVar) {
        C17542s.j(aVar, "navigation");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("User wants to create a shopping list as guest, open login", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = sharedListFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        f.d(sharedListFragment, P.b(SharedListRoutes$SharedList.class), new C11303f(aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(a aVar, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        aVar.b(oVar, a.C2584a.SHOPPING_LIST);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(SharedListFragment sharedListFragment) {
        androidx.navigation.fragment.a.a(sharedListFragment).i0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(SharedListFragment sharedListFragment, String str, C13352d dVar) {
        C17542s.j(str, "listId");
        C17542s.j(dVar, "navigation");
        f.d(sharedListFragment, P.b(SharedListRoutes$SharedList.class), new C11302e(dVar, str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(C13352d dVar, String str, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        dVar.a(oVar, str, false, E.a(new C11304g()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S0(D d10) {
        C17542s.j(d10, "$this$navOptions");
        d10.d(P.b(SharedListRoutes$SharedList.class), new C11305h());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(L l10) {
        C17542s.j(l10, "$this$popUpTo");
        l10.c(true);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: nI.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r11, int r12) {
        /*
            r10 = this;
            r0 = -675365538(0xffffffffd7bebd5e, float:-4.1944107E14)
            r11.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.sharedlist.impl.presentation.ui.SharedListFragment.FragmentContent (SharedListFragment.kt:21)"
            U0.C4895p.S(r0, r12, r1, r2)
        L_0x0012:
            r0 = -688215693(0xffffffffd6faa973, float:-1.37802843E14)
            r11.W(r0)
            java.lang.Object r0 = r11.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r2 = r1.a()
            if (r0 != r2) goto L_0x003a
            x4.o r0 = androidx.navigation.fragment.a.a(r10)
            x4.l r0 = r0.H()
            if (r0 == 0) goto L_0x0032
            r11.u(r0)
            goto L_0x003a
        L_0x0032:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Required value was null."
            r11.<init>(r12)
            throw r11
        L_0x003a:
            r2 = r0
            x4.l r2 = (x4.C8948l) r2
            r11.P()
            r0 = -688211851(0xffffffffd6fab875, float:-1.37835072E14)
            r11.W(r0)
            r0 = r12 & 14
            r0 = r0 ^ 6
            r3 = 0
            r4 = 1
            r5 = 4
            if (r0 <= r5) goto L_0x0055
            boolean r6 = r11.V(r10)
            if (r6 != 0) goto L_0x0059
        L_0x0055:
            r6 = r12 & 6
            if (r6 != r5) goto L_0x005b
        L_0x0059:
            r6 = r4
            goto L_0x005c
        L_0x005b:
            r6 = r3
        L_0x005c:
            java.lang.Object r7 = r11.D()
            if (r6 != 0) goto L_0x0068
            java.lang.Object r6 = r1.a()
            if (r7 != r6) goto L_0x0070
        L_0x0068:
            gk.i r7 = new gk.i
            r7.<init>(r10)
            r11.u(r7)
        L_0x0070:
            r6 = r7
            nI.a r6 = (nI.C17631a) r6
            r11.P()
            r7 = -688208825(0xffffffffd6fac447, float:-1.37860456E14)
            r11.W(r7)
            if (r0 <= r5) goto L_0x0084
            boolean r7 = r11.V(r10)
            if (r7 != 0) goto L_0x0088
        L_0x0084:
            r7 = r12 & 6
            if (r7 != r5) goto L_0x008a
        L_0x0088:
            r7 = r4
            goto L_0x008b
        L_0x008a:
            r7 = r3
        L_0x008b:
            java.lang.Object r8 = r11.D()
            if (r7 != 0) goto L_0x0097
            java.lang.Object r7 = r1.a()
            if (r8 != r7) goto L_0x009f
        L_0x0097:
            gk.j r8 = new gk.j
            r8.<init>(r10)
            r11.u(r8)
        L_0x009f:
            r7 = r8
            nI.p r7 = (nI.p) r7
            r11.P()
            r8 = -688189693(0xffffffffd6fb0f03, float:-1.38020947E14)
            r11.W(r8)
            if (r0 <= r5) goto L_0x00b3
            boolean r0 = r11.V(r10)
            if (r0 != 0) goto L_0x00b7
        L_0x00b3:
            r12 = r12 & 6
            if (r12 != r5) goto L_0x00b8
        L_0x00b7:
            r3 = r4
        L_0x00b8:
            java.lang.Object r12 = r11.D()
            if (r3 != 0) goto L_0x00c4
            java.lang.Object r0 = r1.a()
            if (r12 != r0) goto L_0x00cc
        L_0x00c4:
            gk.k r12 = new gk.k
            r12.<init>(r10)
            r11.u(r12)
        L_0x00cc:
            r5 = r12
            nI.l r5 = (nI.C17642l) r5
            r11.P()
            r8 = 0
            r9 = 16
            r12 = 0
            r3 = r6
            r4 = r7
            r6 = r12
            r7 = r11
            gk.C11301d.d(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x00e6
            U0.C4895p.R()
        L_0x00e6:
            r11.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.sharedlist.impl.presentation.ui.SharedListFragment.D0(U0.m, int):void");
    }
}
