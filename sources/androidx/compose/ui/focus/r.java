package androidx.compose.ui.focus;

import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import W0.b;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import o1.C5669i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u000b*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/d;", "focusDirection", "Lc2/t;", "layoutDirection", "Landroidx/compose/ui/focus/m;", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;ILc2/t;)Landroidx/compose/ui/focus/m;", "Lo1/i;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;ILc2/t;Lo1/i;LnI/l;)Ljava/lang/Boolean;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Lo1/i;", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "c", "g", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "isEligibleForFocusSearch", "f", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18873a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f18874b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                c2.t[] r0 = c2.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                c2.t r2 = c2.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                c2.t r3 = c2.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f18873a = r0
                n1.p[] r0 = n1.C5636p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                n1.p r3 = n1.C5636p.Active     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                n1.p r1 = n1.C5636p.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                n1.p r1 = n1.C5636p.Captured     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                n1.p r1 = n1.C5636p.Inactive     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f18874b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.r.a.<clinit>():void");
        }
    }

    public static final m a(FocusTargetNode focusTargetNode, int i10, t tVar) {
        m mVar;
        m mVar2;
        i H22 = focusTargetNode.H2();
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.e())) {
            return H22.B();
        }
        if (d.l(i10, aVar.f())) {
            return H22.A();
        }
        if (d.l(i10, aVar.h())) {
            return H22.s();
        }
        if (d.l(i10, aVar.a())) {
            return H22.v();
        }
        if (d.l(i10, aVar.d())) {
            int i11 = a.f18873a[tVar.ordinal()];
            if (i11 == 1) {
                mVar2 = H22.i();
            } else if (i11 == 2) {
                mVar2 = H22.u();
            } else {
                throw new XH.t();
            }
            if (mVar2 == m.f18861b.c()) {
                mVar2 = null;
            }
            if (mVar2 == null) {
                return H22.b();
            }
        } else if (d.l(i10, aVar.g())) {
            int i12 = a.f18873a[tVar.ordinal()];
            if (i12 == 1) {
                mVar = H22.u();
            } else if (i12 == 2) {
                mVar = H22.i();
            } else {
                throw new XH.t();
            }
            if (mVar == m.f18861b.c()) {
                mVar = null;
            }
            if (mVar2 == null) {
                return H22.q();
            }
        } else if (d.l(i10, aVar.b())) {
            return H22.x().invoke(d.i(i10));
        } else {
            if (d.l(i10, aVar.c())) {
                return H22.t().invoke(d.i(i10));
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        return mVar2;
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        int i10 = a.f18874b[focusTargetNode.J2().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int a10 = C4502e0.a(1024);
                if (focusTargetNode.E0().j2()) {
                    b bVar = new b(new d.c[16], 0);
                    d.c a22 = focusTargetNode.E0().a2();
                    if (a22 == null) {
                        C4508k.c(bVar, focusTargetNode.E0());
                    } else {
                        bVar.b(a22);
                    }
                    while (bVar.v()) {
                        d.c cVar = (d.c) bVar.B(bVar.r() - 1);
                        if ((cVar.Z1() & a10) == 0) {
                            C4508k.c(bVar, cVar);
                        } else {
                            while (true) {
                                if (cVar == null) {
                                    continue;
                                    break;
                                } else if ((cVar.e2() & a10) != 0) {
                                    b bVar2 = null;
                                    while (cVar != null) {
                                        if (cVar instanceof FocusTargetNode) {
                                            FocusTargetNode b10 = b((FocusTargetNode) cVar);
                                            if (b10 != null) {
                                                return b10;
                                            }
                                        } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                            int i11 = 0;
                                            for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                                if ((D22.e2() & a10) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        cVar = D22;
                                                    } else {
                                                        if (bVar2 == null) {
                                                            bVar2 = new b(new d.c[16], 0);
                                                        }
                                                        if (cVar != null) {
                                                            bVar2.b(cVar);
                                                            cVar = null;
                                                        }
                                                        bVar2.b(D22);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        cVar = C4508k.g(bVar2);
                                    }
                                    continue;
                                } else {
                                    cVar = cVar.a2();
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("visitChildren called on an unattached node");
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return null;
                }
                throw new XH.t();
            }
        }
        return focusTargetNode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        r1 = r10.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.compose.ui.focus.FocusTargetNode c(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r1 = r10.E0()
            boolean r1 = r1.j2()
            if (r1 == 0) goto L_0x00ac
            androidx.compose.ui.d$c r1 = r10.E0()
            androidx.compose.ui.d$c r1 = r1.g2()
            G1.G r10 = G1.C4508k.m(r10)
        L_0x001c:
            r2 = 0
            if (r10 == 0) goto L_0x00ab
            G1.a0 r3 = r10.m0()
            androidx.compose.ui.d$c r3 = r3.k()
            int r3 = r3.Z1()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0096
        L_0x002e:
            if (r1 == 0) goto L_0x0096
            int r3 = r1.e2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0091
            r3 = r1
            r4 = r2
        L_0x0039:
            if (r3 == 0) goto L_0x0091
            boolean r5 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r5 == 0) goto L_0x004c
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            androidx.compose.ui.focus.i r5 = r3.H2()
            boolean r5 = r5.y()
            if (r5 == 0) goto L_0x008c
            return r3
        L_0x004c:
            int r5 = r3.e2()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x008c
            boolean r5 = r3 instanceof G1.C4510m
            if (r5 == 0) goto L_0x008c
            r5 = r3
            G1.m r5 = (G1.C4510m) r5
            androidx.compose.ui.d$c r5 = r5.D2()
            r6 = 0
            r7 = r6
        L_0x0060:
            r8 = 1
            if (r5 == 0) goto L_0x0089
            int r9 = r5.e2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x0084
            int r7 = r7 + 1
            if (r7 != r8) goto L_0x0070
            r3 = r5
            goto L_0x0084
        L_0x0070:
            if (r4 != 0) goto L_0x007b
            W0.b r4 = new W0.b
            r8 = 16
            androidx.compose.ui.d$c[] r8 = new androidx.compose.ui.d.c[r8]
            r4.<init>(r8, r6)
        L_0x007b:
            if (r3 == 0) goto L_0x0081
            r4.b(r3)
            r3 = r2
        L_0x0081:
            r4.b(r5)
        L_0x0084:
            androidx.compose.ui.d$c r5 = r5.a2()
            goto L_0x0060
        L_0x0089:
            if (r7 != r8) goto L_0x008c
            goto L_0x0039
        L_0x008c:
            androidx.compose.ui.d$c r3 = G1.C4508k.g(r4)
            goto L_0x0039
        L_0x0091:
            androidx.compose.ui.d$c r1 = r1.g2()
            goto L_0x002e
        L_0x0096:
            G1.G r10 = r10.q0()
            if (r10 == 0) goto L_0x00a8
            G1.a0 r1 = r10.m0()
            if (r1 == 0) goto L_0x00a8
            androidx.compose.ui.d$c r1 = r1.p()
            goto L_0x001c
        L_0x00a8:
            r1 = r2
            goto L_0x001c
        L_0x00ab:
            return r2
        L_0x00ac:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitAncestors called on an unattached node"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.r.c(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = E1.C4489w.d(r2).m0(r2, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final o1.C5669i d(androidx.compose.ui.focus.FocusTargetNode r2) {
        /*
            G1.c0 r2 = r2.b2()
            if (r2 == 0) goto L_0x0011
            E1.v r0 = E1.C4489w.d(r2)
            r1 = 0
            o1.i r2 = r0.m0(r2, r1)
            if (r2 != 0) goto L_0x0017
        L_0x0011:
            o1.i$a r2 = o1.C5669i.f26706e
            o1.i r2 = r2.a()
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.r.d(androidx.compose.ui.focus.FocusTargetNode):o1.i");
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i10, t tVar, C5669i iVar, C17642l<? super FocusTargetNode, Boolean> lVar) {
        int i11;
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.e()) ? true : d.l(i10, aVar.f())) {
            return Boolean.valueOf(t.f(focusTargetNode, i10, lVar));
        }
        if (d.l(i10, aVar.d()) ? true : d.l(i10, aVar.g()) ? true : d.l(i10, aVar.h()) ? true : d.l(i10, aVar.a())) {
            return u.t(focusTargetNode, i10, iVar, lVar);
        }
        FocusTargetNode focusTargetNode2 = null;
        if (d.l(i10, aVar.b())) {
            int i12 = a.f18873a[tVar.ordinal()];
            if (i12 == 1) {
                i11 = aVar.g();
            } else if (i12 == 2) {
                i11 = aVar.d();
            } else {
                throw new XH.t();
            }
            FocusTargetNode b10 = b(focusTargetNode);
            if (b10 != null) {
                return u.t(b10, i11, iVar, lVar);
            }
            return null;
        } else if (d.l(i10, aVar.c())) {
            FocusTargetNode b11 = b(focusTargetNode);
            if (b11 != null) {
                focusTargetNode2 = c(b11);
            }
            return Boolean.valueOf((focusTargetNode2 == null || C17542s.e(focusTargetNode2, focusTargetNode)) ? false : lVar.invoke(focusTargetNode2).booleanValue());
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + d.n(i10)).toString());
        }
    }

    public static final FocusTargetNode f(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.E0().j2()) {
            return null;
        }
        int a10 = C4502e0.a(1024);
        if (focusTargetNode.E0().j2()) {
            b bVar = new b(new d.c[16], 0);
            d.c a22 = focusTargetNode.E0().a2();
            if (a22 == null) {
                C4508k.c(bVar, focusTargetNode.E0());
            } else {
                bVar.b(a22);
            }
            while (bVar.v()) {
                d.c cVar = (d.c) bVar.B(bVar.r() - 1);
                if ((cVar.Z1() & a10) == 0) {
                    C4508k.c(bVar, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            continue;
                            break;
                        } else if ((cVar.e2() & a10) != 0) {
                            b bVar2 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.E0().j2()) {
                                        int i10 = a.f18874b[focusTargetNode2.J2().ordinal()];
                                        if (i10 == 1 || i10 == 2 || i10 == 3) {
                                            return focusTargetNode2;
                                        }
                                    }
                                } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                    int i11 = 0;
                                    for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                        if ((D22.e2() & a10) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar = D22;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new b(new d.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar2.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar2.b(D22);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVar = C4508k.g(bVar2);
                            }
                            continue;
                        } else {
                            cVar = cVar.a2();
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.P1();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r2 = (r2 = r2.b2()).P1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean g(androidx.compose.ui.focus.FocusTargetNode r2) {
        /*
            G1.c0 r0 = r2.b2()
            if (r0 == 0) goto L_0x0026
            G1.G r0 = r0.P1()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.p()
            r1 = 1
            if (r0 != r1) goto L_0x0026
            G1.c0 r2 = r2.b2()
            if (r2 == 0) goto L_0x0026
            G1.G r2 = r2.P1()
            if (r2 == 0) goto L_0x0026
            boolean r2 = r2.c()
            if (r2 != r1) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.r.g(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
