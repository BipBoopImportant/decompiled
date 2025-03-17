package uJ;

import EJ.C15670k;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import uJ.x0;
import yJ.C18733b;
import yJ.C18735d;
import yJ.C18739h;
import yJ.C18740i;
import yJ.C18741j;
import yJ.C18742k;
import yJ.C18743l;
import yJ.m;
import yJ.n;
import yJ.o;
import yJ.p;
import yJ.u;

/* renamed from: uJ.h  reason: case insensitive filesystem */
public final class C18116h {

    /* renamed from: a  reason: collision with root package name */
    public static final C18116h f147889a = new C18116h();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f147890b;

    /* renamed from: uJ.h$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f147891a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f147892b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        static {
            /*
                yJ.u[] r0 = yJ.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                yJ.u r2 = yJ.u.INV     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                yJ.u r3 = yJ.u.OUT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                yJ.u r4 = yJ.u.IN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f147891a = r0
                uJ.x0$b[] r0 = uJ.x0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uJ.x0$b r4 = uJ.x0.b.CHECK_ONLY_LOWER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                uJ.x0$b r1 = uJ.x0.b.CHECK_SUBTYPE_AND_LOWER     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                uJ.x0$b r1 = uJ.x0.b.SKIP_LOWER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                f147892b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uJ.C18116h.a.<clinit>():void");
        }
    }

    private C18116h() {
    }

    private final List<C18741j> A(x0 x0Var, List<? extends C18741j> list) {
        p j10 = x0Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C18743l E10 = j10.E((C18741j) next);
            int r02 = j10.r0(E10);
            int i10 = 0;
            while (true) {
                if (i10 < r02) {
                    C18740i Y10 = j10.Y(j10.R(E10, i10));
                    if ((Y10 != null ? j10.I0(Y10) : null) != null) {
                        break;
                    }
                    i10++;
                } else {
                    arrayList.add(next);
                    break;
                }
            }
        }
        return !arrayList.isEmpty() ? arrayList : list;
    }

    private final Boolean c(x0 x0Var, C18741j jVar, C18741j jVar2) {
        p j10 = x0Var.j();
        if (!j10.C0(jVar) && !j10.C0(jVar2)) {
            return null;
        }
        if (f(j10, jVar) && f(j10, jVar2)) {
            return Boolean.TRUE;
        }
        if (j10.C0(jVar)) {
            if (g(j10, x0Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j10.C0(jVar2) && (e(j10, jVar) || g(j10, x0Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r3 = r2.z((r3 = r2.Y(r2.B0(r2.A0((yJ.C18735d) r3)))));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean d(yJ.p r2, yJ.C18741j r3) {
        /*
            boolean r0 = r3 instanceof yJ.C18735d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            yJ.d r3 = (yJ.C18735d) r3
            yJ.c r3 = r2.A0(r3)
            yJ.m r3 = r2.B0(r3)
            yJ.i r3 = r2.Y(r3)
            if (r3 == 0) goto L_0x0024
            yJ.j r3 = r2.z(r3)
            if (r3 == 0) goto L_0x0024
            boolean r2 = r2.C0(r3)
            r3 = 1
            if (r2 != r3) goto L_0x0024
            r1 = r3
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uJ.C18116h.d(yJ.p, yJ.j):boolean");
    }

    private static final boolean e(p pVar, C18741j jVar) {
        n a10 = pVar.a(jVar);
        if (a10 instanceof C18739h) {
            Iterable<C18740i> c02 = pVar.c0(a10);
            if (!(c02 instanceof Collection) || !((Collection) c02).isEmpty()) {
                for (C18740i d10 : c02) {
                    C18741j d11 = pVar.d(d10);
                    if (d11 != null && pVar.C0(d11)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean f(p pVar, C18741j jVar) {
        return pVar.C0(jVar) || d(pVar, jVar);
    }

    private static final boolean g(p pVar, x0 x0Var, C18741j jVar, C18741j jVar2, boolean z10) {
        Iterable<C18740i> X10 = pVar.X(jVar);
        if ((X10 instanceof Collection) && ((Collection) X10).isEmpty()) {
            return false;
        }
        for (C18740i iVar : X10) {
            if (C17542s.e(pVar.f0(iVar), pVar.a(jVar2)) || (z10 && v(f147889a, x0Var, jVar2, iVar, false, 8, (Object) null))) {
                return true;
            }
        }
        return false;
    }

    private final Boolean h(x0 x0Var, C18741j jVar, C18741j jVar2) {
        C18741j jVar3 = jVar;
        C18741j jVar4 = jVar2;
        p j10 = x0Var.j();
        boolean z10 = false;
        if (j10.j0(jVar3) || j10.j0(jVar4)) {
            x0 x0Var2 = x0Var;
            return x0Var.m() ? Boolean.TRUE : (!j10.d0(jVar3) || j10.d0(jVar4)) ? Boolean.valueOf(C18108d.f147871a.b(j10, j10.g(jVar3, false), j10.g(jVar4, false))) : Boolean.FALSE;
        } else if (j10.G0(jVar3) && j10.G0(jVar4)) {
            if (f147889a.r(j10, jVar3, jVar4) || x0Var.n()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } else if (j10.J0(jVar3) || j10.J0(jVar4)) {
            x0 x0Var3 = x0Var;
            return Boolean.valueOf(x0Var.n());
        } else {
            C18735d O10 = j10.O(jVar4);
            C18740i I10 = O10 != null ? j10.I(O10) : null;
            if (O10 == null || I10 == null) {
                x0 x0Var4 = x0Var;
            } else {
                if (j10.d0(jVar4)) {
                    I10 = j10.C(I10, true);
                } else if (j10.Z(jVar4)) {
                    I10 = j10.w(I10);
                }
                x0 x0Var5 = x0Var;
                C18740i iVar = I10;
                int i10 = a.f147892b[x0Var.g(jVar3, O10).ordinal()];
                if (i10 == 1) {
                    return Boolean.valueOf(v(f147889a, x0Var, jVar, iVar, false, 8, (Object) null));
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new t();
                    }
                } else if (v(f147889a, x0Var, jVar, iVar, false, 8, (Object) null)) {
                    return Boolean.TRUE;
                }
            }
            n a10 = j10.a(jVar4);
            if (j10.V(a10)) {
                j10.d0(jVar4);
                Iterable c02 = j10.c0(a10);
                if (!(c02 instanceof Collection) || !((Collection) c02).isEmpty()) {
                    Iterator it = c02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!v(f147889a, x0Var, jVar, (C18740i) it.next(), false, 8, (Object) null)) {
                            break;
                        }
                    }
                }
                z10 = true;
                return Boolean.valueOf(z10);
            }
            n a11 = j10.a(jVar3);
            if (!(jVar3 instanceof C18735d)) {
                if (j10.V(a11)) {
                    Iterable c03 = j10.c0(a11);
                    if (!(c03 instanceof Collection) || !((Collection) c03).isEmpty()) {
                        Iterator it2 = c03.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!(((C18740i) it2.next()) instanceof C18735d)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                return null;
            }
            o o10 = f147889a.o(x0Var.j(), jVar4, jVar3);
            if (o10 != null && j10.Q(o10, j10.a(jVar4))) {
                return Boolean.TRUE;
            }
            return null;
        }
    }

    private final List<C18741j> i(x0 x0Var, C18741j jVar, n nVar) {
        x0.c cVar;
        p j10 = x0Var.j();
        List<C18742k> q02 = j10.q0(jVar, nVar);
        if (q02 != null) {
            return q02;
        }
        if (!j10.l0(nVar) && j10.x0(jVar)) {
            return C16877v.n();
        }
        if (!j10.v(nVar)) {
            C15670k kVar = new C15670k();
            x0Var.k();
            ArrayDeque<C18741j> h10 = x0Var.h();
            C17542s.g(h10);
            Set<C18741j> i10 = x0Var.i();
            C17542s.g(i10);
            h10.push(jVar);
            while (!h10.isEmpty()) {
                C18741j pop = h10.pop();
                C17542s.g(pop);
                if (i10.add(pop)) {
                    C18741j D02 = j10.D0(pop, C18733b.FOR_SUBTYPING);
                    if (D02 == null) {
                        D02 = pop;
                    }
                    if (j10.y(j10.a(D02), nVar)) {
                        kVar.add(D02);
                        cVar = x0.c.C4285c.f147950a;
                    } else {
                        cVar = j10.U(D02) == 0 ? x0.c.b.f147949a : x0Var.j().g0(D02);
                    }
                    if (C17542s.e(cVar, x0.c.C4285c.f147950a)) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        p j11 = x0Var.j();
                        for (C18740i a10 : j11.c0(j11.a(pop))) {
                            h10.add(cVar.a(x0Var, a10));
                        }
                    }
                }
            }
            x0Var.e();
            return kVar;
        } else if (!j10.y(j10.a(jVar), nVar)) {
            return C16877v.n();
        } else {
            C18741j D03 = j10.D0(jVar, C18733b.FOR_SUBTYPING);
            if (D03 != null) {
                jVar = D03;
            }
            return C16877v.e(jVar);
        }
    }

    private final List<C18741j> j(x0 x0Var, C18741j jVar, n nVar) {
        return A(x0Var, i(x0Var, jVar, nVar));
    }

    private final boolean k(x0 x0Var, C18740i iVar, C18740i iVar2, boolean z10) {
        p j10 = x0Var.j();
        C18740i o10 = x0Var.o(x0Var.p(iVar));
        C18740i o11 = x0Var.o(x0Var.p(iVar2));
        C18116h hVar = f147889a;
        Boolean h10 = hVar.h(x0Var, j10.p(o10), j10.z(o11));
        if (h10 != null) {
            boolean booleanValue = h10.booleanValue();
            x0Var.c(o10, o11, z10);
            return booleanValue;
        }
        Boolean c10 = x0Var.c(o10, o11, z10);
        return c10 != null ? c10.booleanValue() : hVar.w(x0Var, j10.p(o10), j10.z(o11));
    }

    private final o o(p pVar, C18740i iVar, C18740i iVar2) {
        C18740i Y10;
        int U10 = pVar.U(iVar);
        int i10 = 0;
        while (true) {
            m mVar = null;
            if (i10 >= U10) {
                return null;
            }
            m l10 = pVar.l(iVar, i10);
            if (!pVar.f(l10)) {
                mVar = l10;
            }
            if (!(mVar == null || (Y10 = pVar.Y(mVar)) == null)) {
                boolean z10 = pVar.r(pVar.p(Y10)) && pVar.r(pVar.p(iVar2));
                if (!C17542s.e(Y10, iVar2) && (!z10 || !C17542s.e(pVar.f0(Y10), pVar.f0(iVar2)))) {
                    o o10 = o(pVar, Y10, iVar2);
                    if (o10 != null) {
                        return o10;
                    }
                }
            }
            i10++;
        }
        return pVar.t0(pVar.f0(iVar), i10);
    }

    private final boolean p(x0 x0Var, C18741j jVar) {
        p j10 = x0Var.j();
        n a10 = j10.a(jVar);
        if (j10.l0(a10)) {
            return j10.i(a10);
        }
        if (j10.i(j10.a(jVar))) {
            return true;
        }
        x0Var.k();
        ArrayDeque<C18741j> h10 = x0Var.h();
        C17542s.g(h10);
        Set<C18741j> i10 = x0Var.i();
        C17542s.g(i10);
        h10.push(jVar);
        while (!h10.isEmpty()) {
            C18741j pop = h10.pop();
            C17542s.g(pop);
            if (i10.add(pop)) {
                x0.c cVar = j10.x0(pop) ? x0.c.C4285c.f147950a : x0.c.b.f147949a;
                if (C17542s.e(cVar, x0.c.C4285c.f147950a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    p j11 = x0Var.j();
                    for (C18740i a11 : j11.c0(j11.a(pop))) {
                        C18741j a12 = cVar.a(x0Var, a11);
                        if (j10.i(j10.a(a12))) {
                            x0Var.e();
                            return true;
                        }
                        h10.add(a12);
                    }
                    continue;
                }
            }
        }
        x0Var.e();
        return false;
    }

    private final boolean q(p pVar, C18740i iVar) {
        return pVar.o(pVar.f0(iVar)) && !pVar.n0(iVar) && !pVar.y0(iVar) && !pVar.m(iVar) && !pVar.u0(iVar);
    }

    private final boolean r(p pVar, C18741j jVar, C18741j jVar2) {
        if (pVar.a(jVar) != pVar.a(jVar2)) {
            return false;
        }
        if (pVar.Z(jVar) || !pVar.Z(jVar2)) {
            return !pVar.d0(jVar) || pVar.d0(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean v(C18116h hVar, x0 x0Var, C18740i iVar, C18740i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return hVar.u(x0Var, iVar, iVar2, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean w(uJ.x0 r18, yJ.C18741j r19, yJ.C18741j r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            yJ.p r3 = r18.j()
            boolean r4 = f147890b
            if (r4 == 0) goto L_0x002c
            boolean r4 = r3.c(r1)
            if (r4 != 0) goto L_0x0022
            yJ.n r4 = r3.a(r1)
            boolean r4 = r3.V(r4)
            if (r4 != 0) goto L_0x0022
            boolean r4 = r18.l(r19)
        L_0x0022:
            boolean r4 = r3.c(r2)
            if (r4 != 0) goto L_0x002c
            boolean r4 = r0.l(r2)
        L_0x002c:
            uJ.c r4 = uJ.C18106c.f147870a
            boolean r4 = r4.d(r0, r1, r2)
            r5 = 0
            if (r4 != 0) goto L_0x0036
            return r5
        L_0x0036:
            uJ.h r4 = f147889a
            java.lang.Boolean r6 = r4.c(r0, r1, r2)
            if (r6 == 0) goto L_0x004f
            boolean r6 = r6.booleanValue()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            uJ.x0.d(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x004f:
            yJ.n r6 = r3.a(r2)
            yJ.n r7 = r3.a(r1)
            boolean r7 = r3.y(r7, r6)
            r8 = 1
            if (r7 == 0) goto L_0x0065
            int r7 = r3.W(r6)
            if (r7 != 0) goto L_0x0065
            return r8
        L_0x0065:
            yJ.n r7 = r3.a(r2)
            boolean r7 = r3.D(r7)
            if (r7 == 0) goto L_0x0070
            return r8
        L_0x0070:
            java.util.List r4 = r4.n(r0, r1, r6)
            int r7 = r4.size()
            r9 = 10
            if (r7 <= r8) goto L_0x00b7
            yJ.p r7 = r18.j()
            boolean r11 = r7 instanceof yJ.r
            if (r11 == 0) goto L_0x0087
            yJ.r r7 = (yJ.r) r7
            goto L_0x0088
        L_0x0087:
            r7 = 0
        L_0x0088:
            if (r7 == 0) goto L_0x00b7
            boolean r7 = r7.K()
            if (r7 != r8) goto L_0x00b7
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x009b:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00e2
            java.lang.Object r11 = r4.next()
            yJ.j r11 = (yJ.C18741j) r11
            yJ.i r12 = r0.o(r11)
            yJ.j r12 = r3.d(r12)
            if (r12 != 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r11 = r12
        L_0x00b3:
            r7.add(r11)
            goto L_0x009b
        L_0x00b7:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            int r11 = YH.C16877v.y(r4, r9)
            r7.<init>(r11)
            java.util.Iterator r4 = r4.iterator()
        L_0x00c6:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00e2
            java.lang.Object r11 = r4.next()
            yJ.j r11 = (yJ.C18741j) r11
            yJ.i r12 = r0.o(r11)
            yJ.j r12 = r3.d(r12)
            if (r12 != 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r11 = r12
        L_0x00de:
            r7.add(r11)
            goto L_0x00c6
        L_0x00e2:
            int r4 = r7.size()
            if (r4 == 0) goto L_0x01af
            if (r4 == r8) goto L_0x019e
            yJ.a r4 = new yJ.a
            int r11 = r3.W(r6)
            r4.<init>(r11)
            int r11 = r3.W(r6)
            r12 = r5
            r13 = r12
        L_0x00f9:
            if (r12 >= r11) goto L_0x0188
            if (r13 != 0) goto L_0x010c
            yJ.o r13 = r3.t0(r6, r12)
            yJ.u r13 = r3.u(r13)
            yJ.u r14 = yJ.u.OUT
            if (r13 == r14) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r13 = r5
            goto L_0x010d
        L_0x010c:
            r13 = r8
        L_0x010d:
            if (r13 != 0) goto L_0x0180
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = YH.C16877v.y(r7, r9)
            r14.<init>(r15)
            java.util.Iterator r15 = r7.iterator()
        L_0x011c:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0175
            java.lang.Object r16 = r15.next()
            r5 = r16
            yJ.j r5 = (yJ.C18741j) r5
            yJ.m r9 = r3.s0(r5, r12)
            if (r9 == 0) goto L_0x014a
            yJ.u r10 = r3.a0(r9)
            yJ.u r8 = yJ.u.INV
            if (r10 != r8) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r9 = 0
        L_0x013a:
            if (r9 == 0) goto L_0x014a
            yJ.i r8 = r3.Y(r9)
            if (r8 == 0) goto L_0x014a
            r14.add(r8)
            r5 = 0
            r8 = 1
            r9 = 10
            goto L_0x011c
        L_0x014a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Incorrect type: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = ", subType: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", superType: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0175:
            yJ.i r5 = r3.H(r14)
            yJ.m r5 = r3.m0(r5)
            r4.add(r5)
        L_0x0180:
            int r12 = r12 + 1
            r5 = 0
            r8 = 1
            r9 = 10
            goto L_0x00f9
        L_0x0188:
            if (r13 != 0) goto L_0x0194
            uJ.h r1 = f147889a
            boolean r1 = r1.s(r0, r4, r2)
            if (r1 == 0) goto L_0x0194
            r1 = 1
            return r1
        L_0x0194:
            uJ.f r1 = new uJ.f
            r1.<init>(r7, r0, r3, r2)
            boolean r0 = r0.q(r1)
            return r0
        L_0x019e:
            uJ.h r1 = f147889a
            java.lang.Object r4 = YH.C16877v.v0(r7)
            yJ.j r4 = (yJ.C18741j) r4
            yJ.l r3 = r3.E(r4)
            boolean r0 = r1.s(r0, r3, r2)
            return r0
        L_0x01af:
            uJ.h r2 = f147889a
            boolean r0 = r2.p(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uJ.C18116h.w(uJ.x0, yJ.j, yJ.j):boolean");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(Collection collection, x0 x0Var, p pVar, C18741j jVar, x0.a aVar) {
        C17542s.j(aVar, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aVar.a(new C18114g(x0Var, pVar, (C18741j) it.next(), jVar));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean y(x0 x0Var, p pVar, C18741j jVar, C18741j jVar2) {
        return f147889a.s(x0Var, pVar.E(jVar), jVar2);
    }

    private final boolean z(p pVar, C18740i iVar, C18740i iVar2, n nVar) {
        o o02;
        C18741j d10 = pVar.d(iVar);
        if (!(d10 instanceof C18735d)) {
            return false;
        }
        C18735d dVar = (C18735d) d10;
        if (pVar.s(dVar) || !pVar.f(pVar.B0(pVar.A0(dVar))) || pVar.v0(dVar) != C18733b.FOR_SUBTYPING) {
            return false;
        }
        n f02 = pVar.f0(iVar2);
        yJ.t tVar = f02 instanceof yJ.t ? (yJ.t) f02 : null;
        return (tVar == null || (o02 = pVar.o0(tVar)) == null || !pVar.Q(o02, nVar)) ? false : true;
    }

    public final u l(u uVar, u uVar2) {
        C17542s.j(uVar, "declared");
        C17542s.j(uVar2, "useSite");
        u uVar3 = u.INV;
        if (uVar == uVar3) {
            return uVar2;
        }
        if (uVar2 == uVar3 || uVar == uVar2) {
            return uVar;
        }
        return null;
    }

    public final boolean m(x0 x0Var, C18740i iVar, C18740i iVar2) {
        C17542s.j(x0Var, "state");
        C17542s.j(iVar, "a");
        C17542s.j(iVar2, DslKt.INDICATOR_BACKGROUND);
        p j10 = x0Var.j();
        if (iVar == iVar2) {
            return true;
        }
        C18116h hVar = f147889a;
        if (hVar.q(j10, iVar) && hVar.q(j10, iVar2)) {
            C18740i o10 = x0Var.o(x0Var.p(iVar));
            C18740i o11 = x0Var.o(x0Var.p(iVar2));
            C18741j p10 = j10.p(o10);
            if (!j10.y(j10.f0(o10), j10.f0(o11))) {
                return false;
            }
            if (j10.U(p10) == 0) {
                return j10.G(o10) || j10.G(o11) || j10.d0(p10) == j10.d0(j10.p(o11));
            }
        }
        return v(hVar, x0Var, iVar, iVar2, false, 8, (Object) null) && v(hVar, x0Var, iVar2, iVar, false, 8, (Object) null);
    }

    public final List<C18741j> n(x0 x0Var, C18741j jVar, n nVar) {
        x0.c cVar;
        C17542s.j(x0Var, "state");
        C17542s.j(jVar, "subType");
        C17542s.j(nVar, "superConstructor");
        p j10 = x0Var.j();
        if (j10.x0(jVar)) {
            return f147889a.j(x0Var, jVar, nVar);
        }
        if (!j10.l0(nVar) && !j10.e0(nVar)) {
            return f147889a.i(x0Var, jVar, nVar);
        }
        C15670k<C18741j> kVar = new C15670k<>();
        x0Var.k();
        ArrayDeque<C18741j> h10 = x0Var.h();
        C17542s.g(h10);
        Set<C18741j> i10 = x0Var.i();
        C17542s.g(i10);
        h10.push(jVar);
        while (!h10.isEmpty()) {
            C18741j pop = h10.pop();
            C17542s.g(pop);
            if (i10.add(pop)) {
                if (j10.x0(pop)) {
                    kVar.add(pop);
                    cVar = x0.c.C4285c.f147950a;
                } else {
                    cVar = x0.c.b.f147949a;
                }
                if (C17542s.e(cVar, x0.c.C4285c.f147950a)) {
                    cVar = null;
                }
                if (cVar != null) {
                    p j11 = x0Var.j();
                    for (C18740i a10 : j11.c0(j11.a(pop))) {
                        h10.add(cVar.a(x0Var, a10));
                    }
                }
            }
        }
        x0Var.e();
        ArrayList arrayList = new ArrayList();
        for (C18741j jVar2 : kVar) {
            C18116h hVar = f147889a;
            C17542s.g(jVar2);
            C16877v.E(arrayList, hVar.j(x0Var, jVar2, nVar));
        }
        return arrayList;
    }

    public final boolean s(x0 x0Var, C18743l lVar, C18741j jVar) {
        boolean z10;
        x0 x0Var2 = x0Var;
        C18743l lVar2 = lVar;
        C18741j jVar2 = jVar;
        C17542s.j(x0Var2, "<this>");
        C17542s.j(lVar2, "capturedSubArguments");
        C17542s.j(jVar2, "superType");
        p j10 = x0Var.j();
        n a10 = j10.a(jVar2);
        int r02 = j10.r0(lVar2);
        int W10 = j10.W(a10);
        if (r02 != W10 || r02 != j10.U(jVar2)) {
            return false;
        }
        for (int i10 = 0; i10 < W10; i10++) {
            m l10 = j10.l(jVar2, i10);
            C18740i Y10 = j10.Y(l10);
            if (Y10 != null) {
                m R10 = j10.R(lVar2, i10);
                j10.a0(R10);
                u uVar = u.INV;
                C18740i Y11 = j10.Y(R10);
                C17542s.g(Y11);
                C18116h hVar = f147889a;
                u l11 = hVar.l(j10.u(j10.t0(a10, i10)), j10.a0(l10));
                if (l11 == null) {
                    return x0Var.m();
                }
                if (l11 != uVar || (!hVar.z(j10, Y11, Y10, a10) && !hVar.z(j10, Y10, Y11, a10))) {
                    if (x0Var.f147944g <= 100) {
                        x0Var2.f147944g = x0Var.f147944g + 1;
                        int i11 = a.f147891a[l11.ordinal()];
                        if (i11 == 1) {
                            z10 = hVar.m(x0Var2, Y11, Y10);
                        } else if (i11 == 2) {
                            z10 = v(hVar, x0Var, Y11, Y10, false, 8, (Object) null);
                        } else if (i11 == 3) {
                            z10 = v(hVar, x0Var, Y10, Y11, false, 8, (Object) null);
                        } else {
                            throw new t();
                        }
                        x0Var2.f147944g = x0Var.f147944g - 1;
                        if (!z10) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + Y11).toString());
                    }
                }
            }
        }
        return true;
    }

    public final boolean t(x0 x0Var, C18740i iVar, C18740i iVar2) {
        C17542s.j(x0Var, "state");
        C17542s.j(iVar, "subType");
        C17542s.j(iVar2, "superType");
        return v(this, x0Var, iVar, iVar2, false, 8, (Object) null);
    }

    public final boolean u(x0 x0Var, C18740i iVar, C18740i iVar2, boolean z10) {
        C17542s.j(x0Var, "state");
        C17542s.j(iVar, "subType");
        C17542s.j(iVar2, "superType");
        if (iVar == iVar2) {
            return true;
        }
        if (!x0Var.f(iVar, iVar2)) {
            return false;
        }
        return k(x0Var, iVar, iVar2, z10);
    }
}
