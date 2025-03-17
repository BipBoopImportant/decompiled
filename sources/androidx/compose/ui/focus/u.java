package androidx.compose.ui.focus;

import E1.C4475h;
import G1.C4502e0;
import G1.C4507j;
import G1.C4508k;
import G1.C4510m;
import XH.t;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n1.C5636p;
import nI.C17642l;
import o1.C5669i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a>\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a:\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a!\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u0017\u001a\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a2\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001a\u0013\u0010\"\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010&\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/d;", "direction", "Lo1/i;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "t", "(Landroidx/compose/ui/focus/FocusTargetNode;ILo1/i;LnI/l;)Ljava/lang/Boolean;", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;ILnI/l;)Z", "focusedItem", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Lo1/i;ILnI/l;)Z", "r", "LG1/j;", "LW0/b;", "accessibleChildren", "LXH/N;", "i", "(LG1/j;LW0/b;)V", "focusRect", "j", "(LW0/b;Lo1/i;I)Landroidx/compose/ui/focus/FocusTargetNode;", "proposedCandidate", "currentCandidate", "focusedRect", "m", "(Lo1/i;Lo1/i;Lo1/i;I)Z", "source", "rect1", "rect2", "c", "s", "(Lo1/i;)Lo1/i;", "h", "b", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18881a;

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
                f18881a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.u.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/h$a;", "", "a", "(LE1/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C4475h.a, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f18882c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5669i f18883d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f18884e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<FocusTargetNode, Boolean> f18885f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, C5669i iVar, int i10, C17642l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f18882c = focusTargetNode;
            this.f18883d = iVar;
            this.f18884e = i10;
            this.f18885f = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C4475h.a aVar) {
            boolean a10 = u.r(this.f18882c, this.f18883d, this.f18884e, this.f18885f);
            Boolean valueOf = Boolean.valueOf(a10);
            if (a10 || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.J2() == C5636p.ActiveParent) {
            FocusTargetNode b10 = r.b(focusTargetNode);
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        throw new IllegalStateException("Searching for active node in inactive hierarchy");
    }

    private static final boolean c(C5669i iVar, C5669i iVar2, C5669i iVar3, int i10) {
        if (d(iVar3, i10, iVar) || !d(iVar2, i10, iVar)) {
            return false;
        }
        if (e(iVar3, i10, iVar)) {
            d.a aVar = d.f18832b;
            if (!d.l(i10, aVar.d()) && !d.l(i10, aVar.g()) && f(iVar2, i10, iVar) >= g(iVar3, i10, iVar)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(C5669i iVar, int i10, C5669i iVar2) {
        d.a aVar = d.f18832b;
        if (!(d.l(i10, aVar.d()) ? true : d.l(i10, aVar.g()))) {
            if (!(d.l(i10, aVar.h()) ? true : d.l(i10, aVar.a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            } else if (iVar.p() > iVar2.o() && iVar.o() < iVar2.p()) {
                return true;
            }
        } else if (iVar.j() > iVar2.r() && iVar.r() < iVar2.j()) {
            return true;
        }
        return false;
    }

    private static final boolean e(C5669i iVar, int i10, C5669i iVar2) {
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.d())) {
            if (iVar2.o() < iVar.p()) {
                return false;
            }
        } else if (d.l(i10, aVar.g())) {
            if (iVar2.p() > iVar.o()) {
                return false;
            }
        } else if (d.l(i10, aVar.h())) {
            if (iVar2.r() < iVar.j()) {
                return false;
            }
        } else if (!d.l(i10, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        } else if (iVar2.j() > iVar.r()) {
            return false;
        }
        return true;
    }

    private static final float f(C5669i iVar, int i10, C5669i iVar2) {
        float f10;
        float r10;
        float j10;
        float r11;
        float j11;
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.d())) {
            r11 = iVar2.o();
            j11 = iVar.p();
        } else {
            if (d.l(i10, aVar.g())) {
                r10 = iVar.o();
                j10 = iVar2.p();
            } else if (d.l(i10, aVar.h())) {
                r11 = iVar2.r();
                j11 = iVar.j();
            } else if (d.l(i10, aVar.a())) {
                r10 = iVar.r();
                j10 = iVar2.j();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = r10 - j10;
            return Math.max(0.0f, f10);
        }
        f10 = r11 - j11;
        return Math.max(0.0f, f10);
    }

    private static final float g(C5669i iVar, int i10, C5669i iVar2) {
        float f10;
        float j10;
        float j11;
        float r10;
        float r11;
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.d())) {
            r10 = iVar2.o();
            r11 = iVar.o();
        } else {
            if (d.l(i10, aVar.g())) {
                j10 = iVar.p();
                j11 = iVar2.p();
            } else if (d.l(i10, aVar.h())) {
                r10 = iVar2.r();
                r11 = iVar.r();
            } else if (d.l(i10, aVar.a())) {
                j10 = iVar.j();
                j11 = iVar2.j();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = j10 - j11;
            return Math.max(1.0f, f10);
        }
        f10 = r10 - r11;
        return Math.max(1.0f, f10);
    }

    private static final C5669i h(C5669i iVar) {
        return new C5669i(iVar.p(), iVar.j(), iVar.p(), iVar.j());
    }

    private static final void i(C4507j jVar, W0.b<FocusTargetNode> bVar) {
        int a10 = C4502e0.a(1024);
        if (jVar.E0().j2()) {
            W0.b bVar2 = new W0.b(new d.c[16], 0);
            d.c a22 = jVar.E0().a2();
            if (a22 == null) {
                C4508k.c(bVar2, jVar.E0());
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
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                    if (focusTargetNode.j2() && !C4508k.m(focusTargetNode).L0()) {
                                        if (focusTargetNode.H2().y()) {
                                            bVar.b(focusTargetNode);
                                        } else {
                                            i(focusTargetNode, bVar);
                                        }
                                    }
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
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final FocusTargetNode j(W0.b<FocusTargetNode> bVar, C5669i iVar, int i10) {
        C5669i iVar2;
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.d())) {
            iVar2 = iVar.z(iVar.t() + ((float) 1), 0.0f);
        } else if (d.l(i10, aVar.g())) {
            iVar2 = iVar.z(-(iVar.t() + ((float) 1)), 0.0f);
        } else if (d.l(i10, aVar.h())) {
            iVar2 = iVar.z(0.0f, iVar.n() + ((float) 1));
        } else if (d.l(i10, aVar.a())) {
            iVar2 = iVar.z(0.0f, -(iVar.n() + ((float) 1)));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        int r10 = bVar.r();
        FocusTargetNode focusTargetNode = null;
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) q10[i11];
                if (r.g(focusTargetNode2)) {
                    C5669i d10 = r.d(focusTargetNode2);
                    if (m(d10, iVar2, iVar, i10)) {
                        focusTargetNode = focusTargetNode2;
                        iVar2 = d10;
                    }
                }
                i11++;
            } while (i11 < r10);
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i10, C17642l<? super FocusTargetNode, Boolean> lVar) {
        C5669i iVar;
        W0.b bVar = new W0.b(new FocusTargetNode[16], 0);
        i(focusTargetNode, bVar);
        boolean z10 = true;
        if (bVar.r() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (bVar.t() ? null : bVar.q()[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.b())) {
            i10 = aVar.g();
        }
        if (d.l(i10, aVar.g()) ? true : d.l(i10, aVar.a())) {
            iVar = s(r.d(focusTargetNode));
        } else {
            if (!d.l(i10, aVar.d())) {
                z10 = d.l(i10, aVar.h());
            }
            if (z10) {
                iVar = h(r.d(focusTargetNode));
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
        FocusTargetNode j10 = j(bVar, iVar, i10);
        if (j10 != null) {
            return lVar.invoke(j10).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, C5669i iVar, int i10, C17642l<? super FocusTargetNode, Boolean> lVar) {
        if (r(focusTargetNode, iVar, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a.a(focusTargetNode, i10, new b(focusTargetNode, iVar, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(C5669i iVar, C5669i iVar2, C5669i iVar3, int i10) {
        if (!n(iVar, i10, iVar3)) {
            return false;
        }
        return !n(iVar2, i10, iVar3) || c(iVar3, iVar, iVar2, i10) || (!c(iVar3, iVar2, iVar, i10) && q(i10, iVar3, iVar) < q(i10, iVar3, iVar2));
    }

    private static final boolean n(C5669i iVar, int i10, C5669i iVar2) {
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.d())) {
            if ((iVar2.p() <= iVar.p() && iVar2.o() < iVar.p()) || iVar2.o() <= iVar.o()) {
                return false;
            }
        } else if (d.l(i10, aVar.g())) {
            if ((iVar2.o() >= iVar.o() && iVar2.p() > iVar.o()) || iVar2.p() >= iVar.p()) {
                return false;
            }
        } else if (d.l(i10, aVar.h())) {
            if ((iVar2.j() <= iVar.j() && iVar2.r() < iVar.j()) || iVar2.r() <= iVar.r()) {
                return false;
            }
        } else if (!d.l(i10, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        } else if ((iVar2.r() >= iVar.r() && iVar2.j() > iVar.r()) || iVar2.j() >= iVar.j()) {
            return false;
        }
        return true;
    }

    private static final float o(C5669i iVar, int i10, C5669i iVar2) {
        float f10;
        float r10;
        float j10;
        float r11;
        float j11;
        d.a aVar = d.f18832b;
        if (d.l(i10, aVar.d())) {
            r11 = iVar2.o();
            j11 = iVar.p();
        } else {
            if (d.l(i10, aVar.g())) {
                r10 = iVar.o();
                j10 = iVar2.p();
            } else if (d.l(i10, aVar.h())) {
                r11 = iVar2.r();
                j11 = iVar.j();
            } else if (d.l(i10, aVar.a())) {
                r10 = iVar.r();
                j10 = iVar2.j();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = r10 - j10;
            return Math.max(0.0f, f10);
        }
        f10 = r11 - j11;
        return Math.max(0.0f, f10);
    }

    private static final float p(C5669i iVar, int i10, C5669i iVar2) {
        float f10;
        float o10;
        float o11;
        float t10;
        d.a aVar = d.f18832b;
        boolean z10 = true;
        if (d.l(i10, aVar.d()) ? true : d.l(i10, aVar.g())) {
            f10 = (float) 2;
            o10 = iVar2.r() + (iVar2.n() / f10);
            o11 = iVar.r();
            t10 = iVar.n();
        } else {
            if (!d.l(i10, aVar.h())) {
                z10 = d.l(i10, aVar.a());
            }
            if (z10) {
                f10 = (float) 2;
                o10 = iVar2.o() + (iVar2.t() / f10);
                o11 = iVar.o();
                t10 = iVar.t();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
        return o10 - (o11 + (t10 / f10));
    }

    private static final long q(int i10, C5669i iVar, C5669i iVar2) {
        long abs = (long) Math.abs(o(iVar2, i10, iVar));
        long abs2 = (long) Math.abs(p(iVar2, i10, iVar));
        return (((long) 13) * abs * abs) + (abs2 * abs2);
    }

    /* access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, C5669i iVar, int i10, C17642l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode j10;
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
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.j2()) {
                                        bVar.b(focusTargetNode2);
                                    }
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
            while (bVar.v() && (j10 = j(bVar, iVar, i10)) != null) {
                if (j10.H2().y()) {
                    return lVar.invoke(j10).booleanValue();
                }
                if (l(j10, iVar, i10, lVar)) {
                    return true;
                }
                bVar.y(j10);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final C5669i s(C5669i iVar) {
        return new C5669i(iVar.o(), iVar.r(), iVar.o(), iVar.r());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i10, C5669i iVar, C17642l<? super FocusTargetNode, Boolean> lVar) {
        C5636p J22 = focusTargetNode.J2();
        int[] iArr = a.f18881a;
        int i11 = iArr[J22.ordinal()];
        if (i11 == 1) {
            FocusTargetNode f10 = r.f(focusTargetNode);
            if (f10 != null) {
                int i12 = iArr[f10.J2().ordinal()];
                if (i12 == 1) {
                    Boolean t10 = t(f10, i10, iVar, lVar);
                    if (!C17542s.e(t10, Boolean.FALSE)) {
                        return t10;
                    }
                    if (iVar == null) {
                        iVar = r.d(b(f10));
                    }
                    return Boolean.valueOf(l(focusTargetNode, iVar, i10, lVar));
                } else if (i12 == 2 || i12 == 3) {
                    if (iVar == null) {
                        iVar = r.d(f10);
                    }
                    return Boolean.valueOf(l(focusTargetNode, iVar, i10, lVar));
                } else if (i12 != 4) {
                    throw new t();
                } else {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        } else if (i11 == 2 || i11 == 3) {
            return Boolean.valueOf(k(focusTargetNode, i10, lVar));
        } else {
            if (i11 == 4) {
                return focusTargetNode.H2().y() ? lVar.invoke(focusTargetNode) : iVar == null ? Boolean.valueOf(k(focusTargetNode, i10, lVar)) : Boolean.valueOf(r(focusTargetNode, iVar, i10, lVar));
            }
            throw new t();
        }
    }
}
