package tk;

import O0.L0;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import nI.C17631a;
import pk.s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpk/s$n$a;", "result", "LO0/L0;", "snackbarHostState", "Lkotlin/Function0;", "LXH/N;", "onSnackbarDismissed", "b", "(Lpk/s$n$a;LO0/L0;LnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: tk.b  reason: case insensitive filesystem */
public final class C11918b {
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(pk.s.n.a r9, O0.L0 r10, nI.C17631a<XH.C16807N> r11, U0.C4889m r12, int r13) {
        /*
            java.lang.String r0 = "snackbarHostState"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onSnackbarDismissed"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 1849827974(0x6e422286, float:1.5020457E28)
            U0.m r12 = r12.k(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0029
            r1 = r13 & 8
            if (r1 != 0) goto L_0x001e
            boolean r1 = r12.V(r9)
            goto L_0x0022
        L_0x001e:
            boolean r1 = r12.F(r9)
        L_0x0022:
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r13
            goto L_0x002a
        L_0x0029:
            r1 = r13
        L_0x002a:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x003a
            boolean r2 = r12.V(r10)
            if (r2 == 0) goto L_0x0037
            r2 = 32
            goto L_0x0039
        L_0x0037:
            r2 = 16
        L_0x0039:
            r1 = r1 | r2
        L_0x003a:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004a
            boolean r2 = r12.F(r11)
            if (r2 == 0) goto L_0x0047
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r1 = r1 | r2
        L_0x004a:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x005b
            boolean r2 = r12.l()
            if (r2 != 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            r12.L()
            goto L_0x00ba
        L_0x005b:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0067
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.ui.AddToListResultContent (AddToListResultContent.kt:17)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0067:
            boolean r0 = r9 instanceof pk.s.n.a.C2378a
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0081
            sB.a$a r0 = sB.C15035a.C3239a.ADD
            r3 = r9
            pk.s$n$a$a r3 = (pk.s.n.a.C2378a) r3
            java.lang.String r4 = r3.b()
            java.lang.String r3 = r3.a()
            sB.a r5 = new sB.a
            r5.<init>(r0, r2, r4, r3)
        L_0x007f:
            r2 = r5
            goto L_0x009c
        L_0x0081:
            boolean r0 = r9 instanceof pk.s.n.a.b
            if (r0 == 0) goto L_0x0098
            sB.a$a r0 = sB.C15035a.C3239a.REMOVE
            r3 = r9
            pk.s$n$a$b r3 = (pk.s.n.a.b) r3
            java.lang.String r4 = r3.b()
            java.lang.String r3 = r3.a()
            sB.a r5 = new sB.a
            r5.<init>(r0, r2, r4, r3)
            goto L_0x007f
        L_0x0098:
            if (r9 != 0) goto L_0x00c9
            r0 = 0
            r2 = r0
        L_0x009c:
            int r0 = r1 >> 3
            r0 = r0 & 14
            r0 = r0 | 24960(0x6180, float:3.4976E-41)
            int r1 = r1 << 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = r0 | r1
            r8 = 0
            r3 = 0
            r5 = 0
            r1 = r10
            r4 = r11
            r6 = r12
            tB.C15062c.c(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ba
            U0.C4895p.R()
        L_0x00ba:
            U0.Y0 r12 = r12.n()
            if (r12 == 0) goto L_0x00c8
            tk.a r0 = new tk.a
            r0.<init>(r9, r10, r11, r13)
            r12.a(r0)
        L_0x00c8:
            return
        L_0x00c9:
            XH.t r9 = new XH.t
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tk.C11918b.b(pk.s$n$a, O0.L0, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(s.n.a aVar, L0 l02, C17631a aVar2, int i10, C4889m mVar, int i11) {
        b(aVar, l02, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
