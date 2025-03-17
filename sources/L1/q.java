package L1;

import G1.C4494a0;
import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import G1.G;
import G1.w0;
import W0.b;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\r\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LG1/G;", "layoutNode", "", "mergingEnabled", "LL1/p;", "a", "(LG1/G;Z)LL1/p;", "Lkotlin/Function1;", "selector", "f", "(LG1/G;LnI/l;)LG1/G;", "", "e", "(LL1/p;)I", "i", "LG1/w0;", "g", "(LG1/G;)LG1/w0;", "outerMergingSemantics", "LL1/i;", "h", "(LL1/p;)LL1/i;", "role", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {
    public static final p a(G g10, boolean z10) {
        C4494a0 m02 = g10.m0();
        int a10 = C4502e0.a(8);
        d.c cVar = null;
        if ((m02.i() & a10) != 0) {
            d.c k10 = m02.k();
            loop0:
            while (true) {
                if (k10 != null) {
                    if ((k10.e2() & a10) != 0) {
                        d.c cVar2 = k10;
                        b bVar = null;
                        while (true) {
                            if (cVar2 == null) {
                                break;
                            } else if (cVar2 instanceof w0) {
                                cVar = cVar2;
                                break loop0;
                            } else {
                                if ((cVar2.e2() & a10) != 0 && (cVar2 instanceof C4510m)) {
                                    int i10 = 0;
                                    for (d.c D22 = ((C4510m) cVar2).D2(); D22 != null; D22 = D22.a2()) {
                                        if ((D22.e2() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar2 = D22;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new b(new d.c[16], 0);
                                                }
                                                if (cVar2 != null) {
                                                    bVar.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                bVar.b(D22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar2 = C4508k.g(bVar);
                            }
                        }
                    }
                    if ((k10.Z1() & a10) == 0) {
                        break;
                    }
                    k10 = k10.a2();
                } else {
                    break;
                }
            }
        }
        C17542s.g(cVar);
        d.c E02 = ((w0) cVar).E0();
        l L10 = g10.L();
        C17542s.g(L10);
        return new p(E02, z10, g10, L10);
    }

    /* access modifiers changed from: private */
    public static final int e(p pVar) {
        return pVar.o() + 2000000000;
    }

    public static final G f(G g10, C17642l<? super G, Boolean> lVar) {
        for (G q02 = g10.q0(); q02 != null; q02 = q02.q0()) {
            if (lVar.invoke(q02).booleanValue()) {
                return q02;
            }
        }
        return null;
    }

    public static final w0 g(G g10) {
        C4494a0 m02 = g10.m0();
        int a10 = C4502e0.a(8);
        d.c cVar = null;
        if ((m02.i() & a10) != 0) {
            d.c k10 = m02.k();
            loop0:
            while (true) {
                if (k10 != null) {
                    if ((k10.e2() & a10) != 0) {
                        d.c cVar2 = k10;
                        b bVar = null;
                        while (true) {
                            if (cVar2 == null) {
                                break;
                            }
                            if (cVar2 instanceof w0) {
                                if (((w0) cVar2).U1()) {
                                    cVar = cVar2;
                                    break loop0;
                                }
                            } else if ((cVar2.e2() & a10) != 0 && (cVar2 instanceof C4510m)) {
                                int i10 = 0;
                                for (d.c D22 = ((C4510m) cVar2).D2(); D22 != null; D22 = D22.a2()) {
                                    if ((D22.e2() & a10) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar2 = D22;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new b(new d.c[16], 0);
                                            }
                                            if (cVar2 != null) {
                                                bVar.b(cVar2);
                                                cVar2 = null;
                                            }
                                            bVar.b(D22);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVar2 = C4508k.g(bVar);
                        }
                    }
                    if ((k10.Z1() & a10) == 0) {
                        break;
                    }
                    k10 = k10.a2();
                } else {
                    break;
                }
            }
        }
        return (w0) cVar;
    }

    /* access modifiers changed from: private */
    public static final i h(p pVar) {
        return (i) m.a(pVar.w(), s.f9010a.y());
    }

    /* access modifiers changed from: private */
    public static final int i(p pVar) {
        return pVar.o() + 1000000000;
    }
}
