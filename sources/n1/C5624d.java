package n1;

import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import W0.b;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln1/c;", "LXH/N;", "b", "(Ln1/c;)V", "Ln1/o;", "a", "(Ln1/c;)Ln1/o;", "Landroidx/compose/ui/focus/FocusTargetNode;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n1.d  reason: case insensitive filesystem */
public final class C5624d {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n1.d$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26502a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                n1.p[] r0 = n1.C5636p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                n1.p r1 = n1.C5636p.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                n1.p r1 = n1.C5636p.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                n1.p r1 = n1.C5636p.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                n1.p r1 = n1.C5636p.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f26502a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.C5624d.a.<clinit>():void");
        }
    }

    public static final C5635o a(C5623c cVar) {
        int a10 = C4502e0.a(1024);
        d.c E02 = cVar.E0();
        b bVar = null;
        while (E02 != null) {
            if (E02 instanceof FocusTargetNode) {
                C5636p J22 = ((FocusTargetNode) E02).J2();
                int i10 = a.f26502a[J22.ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return J22;
                }
            } else if ((E02.e2() & a10) != 0 && (E02 instanceof C4510m)) {
                int i11 = 0;
                for (d.c D22 = ((C4510m) E02).D2(); D22 != null; D22 = D22.a2()) {
                    if ((D22.e2() & a10) != 0) {
                        i11++;
                        if (i11 == 1) {
                            E02 = D22;
                        } else {
                            if (bVar == null) {
                                bVar = new b(new d.c[16], 0);
                            }
                            if (E02 != null) {
                                bVar.b(E02);
                                E02 = null;
                            }
                            bVar.b(D22);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            E02 = C4508k.g(bVar);
        }
        if (cVar.E0().j2()) {
            b bVar2 = new b(new d.c[16], 0);
            d.c a22 = cVar.E0().a2();
            if (a22 == null) {
                C4508k.c(bVar2, cVar.E0());
            } else {
                bVar2.b(a22);
            }
            while (bVar2.v()) {
                d.c cVar2 = (d.c) bVar2.B(bVar2.r() - 1);
                if ((cVar2.Z1() & a10) == 0) {
                    C4508k.c(bVar2, cVar2);
                } else {
                    while (true) {
                        if (cVar2 == null) {
                            continue;
                            break;
                        } else if ((cVar2.e2() & a10) != 0) {
                            b bVar3 = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof FocusTargetNode) {
                                    C5636p J23 = ((FocusTargetNode) cVar2).J2();
                                    int i12 = a.f26502a[J23.ordinal()];
                                    if (i12 == 1 || i12 == 2 || i12 == 3) {
                                        return J23;
                                    }
                                } else if ((cVar2.e2() & a10) != 0 && (cVar2 instanceof C4510m)) {
                                    int i13 = 0;
                                    for (d.c D23 = ((C4510m) cVar2).D2(); D23 != null; D23 = D23.a2()) {
                                        if ((D23.e2() & a10) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                cVar2 = D23;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new b(new d.c[16], 0);
                                                }
                                                if (cVar2 != null) {
                                                    bVar3.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                bVar3.b(D23);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                cVar2 = C4508k.g(bVar3);
                            }
                            continue;
                        } else {
                            cVar2 = cVar2.a2();
                        }
                    }
                }
            }
            return C5636p.Inactive;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    public static final void b(C5623c cVar) {
        C4508k.n(cVar).getFocusOwner().g(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b3, code lost:
        r4 = r13.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.focus.FocusTargetNode r13) {
        /*
            r0 = 4096(0x1000, float:5.74E-42)
            int r0 = G1.C4502e0.a(r0)
            r1 = 1024(0x400, float:1.435E-42)
            int r1 = G1.C4502e0.a(r1)
            androidx.compose.ui.d$c r2 = r13.E0()
            r3 = r0 | r1
            androidx.compose.ui.d$c r4 = r13.E0()
            boolean r4 = r4.j2()
            if (r4 == 0) goto L_0x00c3
            androidx.compose.ui.d$c r4 = r13.E0()
            G1.G r13 = G1.C4508k.m(r13)
        L_0x0024:
            if (r13 == 0) goto L_0x00c2
            G1.a0 r5 = r13.m0()
            androidx.compose.ui.d$c r5 = r5.k()
            int r5 = r5.Z1()
            r5 = r5 & r3
            r6 = 0
            if (r5 == 0) goto L_0x00ad
        L_0x0036:
            if (r4 == 0) goto L_0x00ad
            int r5 = r4.e2()
            r5 = r5 & r3
            if (r5 == 0) goto L_0x00a8
            if (r4 == r2) goto L_0x004a
            int r5 = r4.e2()
            r5 = r5 & r1
            if (r5 == 0) goto L_0x004a
            goto L_0x00c2
        L_0x004a:
            int r5 = r4.e2()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00a8
            r5 = r4
            r7 = r6
        L_0x0053:
            if (r5 == 0) goto L_0x00a8
            boolean r8 = r5 instanceof n1.C5623c
            if (r8 == 0) goto L_0x0063
            n1.c r5 = (n1.C5623c) r5
            n1.o r8 = a(r5)
            r5.J(r8)
            goto L_0x00a3
        L_0x0063:
            int r8 = r5.e2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x00a3
            boolean r8 = r5 instanceof G1.C4510m
            if (r8 == 0) goto L_0x00a3
            r8 = r5
            G1.m r8 = (G1.C4510m) r8
            androidx.compose.ui.d$c r8 = r8.D2()
            r9 = 0
            r10 = r9
        L_0x0077:
            r11 = 1
            if (r8 == 0) goto L_0x00a0
            int r12 = r8.e2()
            r12 = r12 & r0
            if (r12 == 0) goto L_0x009b
            int r10 = r10 + 1
            if (r10 != r11) goto L_0x0087
            r5 = r8
            goto L_0x009b
        L_0x0087:
            if (r7 != 0) goto L_0x0092
            W0.b r7 = new W0.b
            r11 = 16
            androidx.compose.ui.d$c[] r11 = new androidx.compose.ui.d.c[r11]
            r7.<init>(r11, r9)
        L_0x0092:
            if (r5 == 0) goto L_0x0098
            r7.b(r5)
            r5 = r6
        L_0x0098:
            r7.b(r8)
        L_0x009b:
            androidx.compose.ui.d$c r8 = r8.a2()
            goto L_0x0077
        L_0x00a0:
            if (r10 != r11) goto L_0x00a3
            goto L_0x0053
        L_0x00a3:
            androidx.compose.ui.d$c r5 = G1.C4508k.g(r7)
            goto L_0x0053
        L_0x00a8:
            androidx.compose.ui.d$c r4 = r4.g2()
            goto L_0x0036
        L_0x00ad:
            G1.G r13 = r13.q0()
            if (r13 == 0) goto L_0x00bf
            G1.a0 r4 = r13.m0()
            if (r4 == 0) goto L_0x00bf
            androidx.compose.ui.d$c r4 = r4.p()
            goto L_0x0024
        L_0x00bf:
            r4 = r6
            goto L_0x0024
        L_0x00c2:
            return
        L_0x00c3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitAncestors called on an unattached node"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C5624d.c(androidx.compose.ui.focus.FocusTargetNode):void");
    }
}
