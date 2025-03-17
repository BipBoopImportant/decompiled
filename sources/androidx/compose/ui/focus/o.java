package androidx.compose.ui.focus;

import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import W0.b;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n1.C5634n;
import nI.C17642l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln1/n;", "", "a", "(Ln1/n;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<FocusTargetNode, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f18867c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(q.j(focusTargetNode));
        }
    }

    public static final boolean a(C5634n nVar) {
        int a10 = C4502e0.a(1024);
        d.c E02 = nVar.E0();
        b bVar = null;
        while (E02 != null) {
            if (E02 instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) E02;
                return focusTargetNode.H2().y() ? q.j(focusTargetNode) : u.k(focusTargetNode, d.f18832b.b(), a.f18867c);
            }
            if ((E02.e2() & a10) != 0 && (E02 instanceof C4510m)) {
                int i10 = 0;
                for (d.c D22 = ((C4510m) E02).D2(); D22 != null; D22 = D22.a2()) {
                    if ((D22.e2() & a10) != 0) {
                        i10++;
                        if (i10 == 1) {
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
                if (i10 == 1) {
                }
            }
            E02 = C4508k.g(bVar);
        }
        if (nVar.E0().j2()) {
            b bVar2 = new b(new d.c[16], 0);
            d.c a22 = nVar.E0().a2();
            if (a22 == null) {
                C4508k.c(bVar2, nVar.E0());
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
                            continue;
                            break;
                        } else if ((cVar.e2() & a10) != 0) {
                            b bVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    return focusTargetNode2.H2().y() ? q.j(focusTargetNode2) : u.k(focusTargetNode2, d.f18832b.b(), a.f18867c);
                                }
                                if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                    int i11 = 0;
                                    for (d.c D23 = ((C4510m) cVar).D2(); D23 != null; D23 = D23.a2()) {
                                        if ((D23.e2() & a10) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar = D23;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new b(new d.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar3.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar3.b(D23);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVar = C4508k.g(bVar3);
                            }
                            continue;
                        } else {
                            cVar = cVar.a2();
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }
}
