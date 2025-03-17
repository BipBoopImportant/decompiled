package androidx.compose.ui.focus;

import E1.C4475h;
import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n1.C5636p;
import nI.C17642l;
import tI.C17974j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a2\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001a:\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a'\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\t\u001a'\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\t\u001a\u0013\u0010\u0011\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/d;", "direction", "Lkotlin/Function1;", "", "onFound", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;ILnI/l;)Z", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;LnI/l;)Z", "b", "focusedItem", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILnI/l;)Z", "i", "h", "g", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18876a;

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
                n1.p r1 = n1.C5636p.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                n1.p r1 = n1.C5636p.Active     // Catch:{ NoSuchFieldError -> 0x0019 }
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
                f18876a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.t.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/h$a;", "", "a", "(LE1/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C4475h.a, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f18877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f18878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f18879e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<FocusTargetNode, Boolean> f18880f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, C17642l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f18877c = focusTargetNode;
            this.f18878d = focusTargetNode2;
            this.f18879e = i10;
            this.f18880f = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C4475h.a aVar) {
            boolean a10 = t.i(this.f18877c, this.f18878d, this.f18879e, this.f18880f);
            Boolean valueOf = Boolean.valueOf(a10);
            if (a10 || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, C17642l<? super FocusTargetNode, Boolean> lVar) {
        C5636p J22 = focusTargetNode.J2();
        int[] iArr = a.f18876a;
        int i10 = iArr[J22.ordinal()];
        if (i10 == 1) {
            FocusTargetNode f10 = r.f(focusTargetNode);
            if (f10 != null) {
                int i11 = iArr[f10.J2().ordinal()];
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return d(focusTargetNode, f10, d.f18832b.f(), lVar);
                    }
                    if (i11 != 4) {
                        throw new XH.t();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                } else if (!b(f10, lVar) && !d(focusTargetNode, f10, d.f18832b.f(), lVar) && (!f10.H2().y() || !lVar.invoke(f10).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        } else if (i10 == 2 || i10 == 3) {
            return g(focusTargetNode, lVar);
        } else {
            if (i10 != 4) {
                throw new XH.t();
            } else if (!g(focusTargetNode, lVar)) {
                if (!(focusTargetNode.H2().y() ? lVar.invoke(focusTargetNode).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean c(FocusTargetNode focusTargetNode, C17642l<? super FocusTargetNode, Boolean> lVar) {
        int i10 = a.f18876a[focusTargetNode.J2().ordinal()];
        if (i10 == 1) {
            FocusTargetNode f10 = r.f(focusTargetNode);
            if (f10 != null) {
                return c(f10, lVar) || d(focusTargetNode, f10, d.f18832b.e(), lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        } else if (i10 == 2 || i10 == 3) {
            return h(focusTargetNode, lVar);
        } else {
            if (i10 == 4) {
                return focusTargetNode.H2().y() ? lVar.invoke(focusTargetNode).booleanValue() : h(focusTargetNode, lVar);
            }
            throw new XH.t();
        }
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, C17642l<? super FocusTargetNode, Boolean> lVar) {
        if (i(focusTargetNode, focusTargetNode2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a.a(focusTargetNode, i10, new b(focusTargetNode, focusTargetNode2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        r1 = r10.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean e(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r1 = r10.E0()
            boolean r1 = r1.j2()
            if (r1 == 0) goto L_0x00a3
            androidx.compose.ui.d$c r1 = r10.E0()
            androidx.compose.ui.d$c r1 = r1.g2()
            G1.G r10 = G1.C4508k.m(r10)
        L_0x001c:
            r2 = 0
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L_0x009f
            G1.a0 r5 = r10.m0()
            androidx.compose.ui.d$c r5 = r5.k()
            int r5 = r5.Z1()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x008b
        L_0x0030:
            if (r1 == 0) goto L_0x008b
            int r5 = r1.e2()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0086
            r5 = r1
            r6 = r4
        L_0x003b:
            if (r5 == 0) goto L_0x0086
            boolean r7 = r5 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L_0x0043
            r4 = r5
            goto L_0x009f
        L_0x0043:
            int r7 = r5.e2()
            r7 = r7 & r0
            if (r7 == 0) goto L_0x0081
            boolean r7 = r5 instanceof G1.C4510m
            if (r7 == 0) goto L_0x0081
            r7 = r5
            G1.m r7 = (G1.C4510m) r7
            androidx.compose.ui.d$c r7 = r7.D2()
            r8 = r2
        L_0x0056:
            if (r7 == 0) goto L_0x007e
            int r9 = r7.e2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x0079
            int r8 = r8 + 1
            if (r8 != r3) goto L_0x0065
            r5 = r7
            goto L_0x0079
        L_0x0065:
            if (r6 != 0) goto L_0x0070
            W0.b r6 = new W0.b
            r9 = 16
            androidx.compose.ui.d$c[] r9 = new androidx.compose.ui.d.c[r9]
            r6.<init>(r9, r2)
        L_0x0070:
            if (r5 == 0) goto L_0x0076
            r6.b(r5)
            r5 = r4
        L_0x0076:
            r6.b(r7)
        L_0x0079:
            androidx.compose.ui.d$c r7 = r7.a2()
            goto L_0x0056
        L_0x007e:
            if (r8 != r3) goto L_0x0081
            goto L_0x003b
        L_0x0081:
            androidx.compose.ui.d$c r5 = G1.C4508k.g(r6)
            goto L_0x003b
        L_0x0086:
            androidx.compose.ui.d$c r1 = r1.g2()
            goto L_0x0030
        L_0x008b:
            G1.G r10 = r10.q0()
            if (r10 == 0) goto L_0x009c
            G1.a0 r1 = r10.m0()
            if (r1 == 0) goto L_0x009c
            androidx.compose.ui.d$c r1 = r1.p()
            goto L_0x001c
        L_0x009c:
            r1 = r4
            goto L_0x001c
        L_0x009f:
            if (r4 != 0) goto L_0x00a2
            r2 = r3
        L_0x00a2:
            return r2
        L_0x00a3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitAncestors called on an unattached node"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.t.e(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i10, C17642l<? super FocusTargetNode, Boolean> lVar) {
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.e())) {
            return c(focusTargetNode, lVar);
        }
        if (d.l(i10, aVar.f())) {
            return b(focusTargetNode, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(FocusTargetNode focusTargetNode, C17642l<? super FocusTargetNode, Boolean> lVar) {
        W0.b bVar = new W0.b(new FocusTargetNode[16], 0);
        int a10 = C4502e0.a(1024);
        if (focusTargetNode.E0().j2()) {
            W0.b bVar2 = new W0.b(new d.c[16], 0);
            d.c a22 = focusTargetNode.E0().a2();
            if (a22 == null) {
                C4508k.c(bVar2, focusTargetNode.E0());
            } else {
                bVar2.b(a22);
            }
            while (bVar2.v()) {
                d.c cVar = (d.c) bVar2.B(bVar2.r() - 1);
                if ((cVar.Z1() & a10) == 0) {
                    C4508k.c(bVar2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.e2() & a10) != 0) {
                            W0.b bVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    bVar.b((FocusTargetNode) cVar);
                                } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                    int i10 = 0;
                                    for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                        if ((D22.e2() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar = D22;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new W0.b(new d.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar3.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar3.b(D22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar = C4508k.g(bVar3);
                            }
                        } else {
                            cVar = cVar.a2();
                        }
                    }
                }
            }
            bVar.G(s.f18875a);
            int r10 = bVar.r();
            if (r10 > 0) {
                int i11 = r10 - 1;
                Object[] q10 = bVar.q();
                do {
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) q10[i11];
                    if (r.g(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                        return true;
                    }
                    i11--;
                } while (i11 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final boolean h(FocusTargetNode focusTargetNode, C17642l<? super FocusTargetNode, Boolean> lVar) {
        W0.b bVar = new W0.b(new FocusTargetNode[16], 0);
        int a10 = C4502e0.a(1024);
        if (focusTargetNode.E0().j2()) {
            W0.b bVar2 = new W0.b(new d.c[16], 0);
            d.c a22 = focusTargetNode.E0().a2();
            if (a22 == null) {
                C4508k.c(bVar2, focusTargetNode.E0());
            } else {
                bVar2.b(a22);
            }
            while (bVar2.v()) {
                d.c cVar = (d.c) bVar2.B(bVar2.r() - 1);
                if ((cVar.Z1() & a10) == 0) {
                    C4508k.c(bVar2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.e2() & a10) != 0) {
                            W0.b bVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    bVar.b((FocusTargetNode) cVar);
                                } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                    int i10 = 0;
                                    for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                        if ((D22.e2() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar = D22;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new W0.b(new d.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar3.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar3.b(D22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar = C4508k.g(bVar3);
                            }
                        } else {
                            cVar = cVar.a2();
                        }
                    }
                }
            }
            bVar.G(s.f18875a);
            int r10 = bVar.r();
            if (r10 <= 0) {
                return false;
            }
            Object[] q10 = bVar.q();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) q10[i11];
                if (r.g(focusTargetNode2) && c(focusTargetNode2, lVar)) {
                    return true;
                }
                i11++;
            } while (i11 < r10);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    /* access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, C17642l<? super FocusTargetNode, Boolean> lVar) {
        if (focusTargetNode.J2() == C5636p.ActiveParent) {
            W0.b bVar = new W0.b(new FocusTargetNode[16], 0);
            int a10 = C4502e0.a(1024);
            if (focusTargetNode.E0().j2()) {
                W0.b bVar2 = new W0.b(new d.c[16], 0);
                d.c a22 = focusTargetNode.E0().a2();
                if (a22 == null) {
                    C4508k.c(bVar2, focusTargetNode.E0());
                } else {
                    bVar2.b(a22);
                }
                while (bVar2.v()) {
                    d.c cVar = (d.c) bVar2.B(bVar2.r() - 1);
                    if ((cVar.Z1() & a10) == 0) {
                        C4508k.c(bVar2, cVar);
                    } else {
                        while (true) {
                            if (cVar == null) {
                                break;
                            } else if ((cVar.e2() & a10) != 0) {
                                W0.b bVar3 = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        bVar.b((FocusTargetNode) cVar);
                                    } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                        int i11 = 0;
                                        for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                            if ((D22.e2() & a10) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    cVar = D22;
                                                } else {
                                                    if (bVar3 == null) {
                                                        bVar3 = new W0.b(new d.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        bVar3.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar3.b(D22);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    cVar = C4508k.g(bVar3);
                                }
                            } else {
                                cVar = cVar.a2();
                            }
                        }
                    }
                }
                bVar.G(s.f18875a);
                d.a aVar = d.f18832b;
                if (d.l(i10, aVar.e())) {
                    C17974j jVar = new C17974j(0, bVar.r() - 1);
                    int p10 = jVar.p();
                    int q10 = jVar.q();
                    if (p10 <= q10) {
                        boolean z10 = false;
                        while (true) {
                            if (z10) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) bVar.q()[p10];
                                if (r.g(focusTargetNode3) && c(focusTargetNode3, lVar)) {
                                    return true;
                                }
                            }
                            if (C17542s.e(bVar.q()[p10], focusTargetNode2)) {
                                z10 = true;
                            }
                            if (p10 == q10) {
                                break;
                            }
                            p10++;
                        }
                    }
                } else if (d.l(i10, aVar.f())) {
                    C17974j jVar2 = new C17974j(0, bVar.r() - 1);
                    int p11 = jVar2.p();
                    int q11 = jVar2.q();
                    if (p11 <= q11) {
                        boolean z11 = false;
                        while (true) {
                            if (z11) {
                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) bVar.q()[q11];
                                if (r.g(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                                    return true;
                                }
                            }
                            if (C17542s.e(bVar.q()[q11], focusTargetNode2)) {
                                z11 = true;
                            }
                            if (q11 == p11) {
                                break;
                            }
                            q11--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                if (d.l(i10, d.f18832b.e()) || !focusTargetNode.H2().y() || e(focusTargetNode)) {
                    return false;
                }
                return lVar.invoke(focusTargetNode).booleanValue();
            }
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }
}
