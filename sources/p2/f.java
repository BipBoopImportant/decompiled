package p2;

import h2.C5414d;
import h2.C5415e;
import h2.C5419i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p2.e;
import q2.b;
import q2.e;

public class f extends m {

    /* renamed from: M0  reason: collision with root package name */
    b f27493M0 = new b(this);

    /* renamed from: N0  reason: collision with root package name */
    public e f27494N0 = new e(this);

    /* renamed from: O0  reason: collision with root package name */
    private int f27495O0;

    /* renamed from: P0  reason: collision with root package name */
    protected b.C0446b f27496P0 = null;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f27497Q0 = false;

    /* renamed from: R0  reason: collision with root package name */
    protected C5414d f27498R0 = new C5414d();

    /* renamed from: S0  reason: collision with root package name */
    int f27499S0;

    /* renamed from: T0  reason: collision with root package name */
    int f27500T0;

    /* renamed from: U0  reason: collision with root package name */
    int f27501U0;

    /* renamed from: V0  reason: collision with root package name */
    int f27502V0;

    /* renamed from: W0  reason: collision with root package name */
    public int f27503W0 = 0;

    /* renamed from: X0  reason: collision with root package name */
    public int f27504X0 = 0;

    /* renamed from: Y0  reason: collision with root package name */
    C5758c[] f27505Y0 = new C5758c[4];

    /* renamed from: Z0  reason: collision with root package name */
    C5758c[] f27506Z0 = new C5758c[4];

    /* renamed from: a1  reason: collision with root package name */
    public boolean f27507a1 = false;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f27508b1 = false;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f27509c1 = false;

    /* renamed from: d1  reason: collision with root package name */
    public int f27510d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    public int f27511e1 = 0;

    /* renamed from: f1  reason: collision with root package name */
    private int f27512f1 = 257;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f27513g1 = false;

    /* renamed from: h1  reason: collision with root package name */
    private boolean f27514h1 = false;

    /* renamed from: i1  reason: collision with root package name */
    private boolean f27515i1 = false;

    /* renamed from: j1  reason: collision with root package name */
    int f27516j1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    private WeakReference<d> f27517k1 = null;

    /* renamed from: l1  reason: collision with root package name */
    private WeakReference<d> f27518l1 = null;

    /* renamed from: m1  reason: collision with root package name */
    private WeakReference<d> f27519m1 = null;

    /* renamed from: n1  reason: collision with root package name */
    private WeakReference<d> f27520n1 = null;

    /* renamed from: o1  reason: collision with root package name */
    HashSet<e> f27521o1 = new HashSet<>();

    /* renamed from: p1  reason: collision with root package name */
    public b.a f27522p1 = new b.a();

    public f() {
    }

    private void C1(e eVar) {
        int i10 = this.f27503W0 + 1;
        C5758c[] cVarArr = this.f27506Z0;
        if (i10 >= cVarArr.length) {
            this.f27506Z0 = (C5758c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f27506Z0[this.f27503W0] = new C5758c(eVar, 0, V1());
        this.f27503W0++;
    }

    private void F1(d dVar, C5419i iVar) {
        this.f27498R0.h(iVar, this.f27498R0.q(dVar), 0, 5);
    }

    private void G1(d dVar, C5419i iVar) {
        this.f27498R0.h(this.f27498R0.q(dVar), iVar, 0, 5);
    }

    private void H1(e eVar) {
        int i10 = this.f27504X0 + 1;
        C5758c[] cVarArr = this.f27505Y0;
        if (i10 >= cVarArr.length) {
            this.f27505Y0 = (C5758c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f27505Y0[this.f27504X0] = new C5758c(eVar, 1, V1());
        this.f27504X0++;
    }

    public static boolean Y1(int i10, e eVar, b.C0446b bVar, b.a aVar, int i11) {
        int i12;
        int i13;
        if (bVar == null) {
            return false;
        }
        if (eVar.X() == 8 || (eVar instanceof h) || (eVar instanceof C5756a)) {
            aVar.f27767e = 0;
            aVar.f27768f = 0;
            return false;
        }
        aVar.f27763a = eVar.A();
        aVar.f27764b = eVar.V();
        aVar.f27765c = eVar.Y();
        aVar.f27766d = eVar.x();
        aVar.f27771i = false;
        aVar.f27772j = i11;
        e.b bVar2 = aVar.f27763a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar2 == bVar3;
        boolean z11 = aVar.f27764b == bVar3;
        boolean z12 = z10 && eVar.f27447d0 > 0.0f;
        boolean z13 = z11 && eVar.f27447d0 > 0.0f;
        if (z10 && eVar.c0(0) && eVar.f27484w == 0 && !z12) {
            aVar.f27763a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f27486x == 0) {
                aVar.f27763a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.c0(1) && eVar.f27486x == 0 && !z13) {
            aVar.f27764b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f27484w == 0) {
                aVar.f27764b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.p0()) {
            aVar.f27763a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.q0()) {
            aVar.f27764b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f27488y[0] == 4) {
                aVar.f27763a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar4 = aVar.f27764b;
                e.b bVar5 = e.b.FIXED;
                if (bVar4 == bVar5) {
                    i13 = aVar.f27766d;
                } else {
                    aVar.f27763a = e.b.WRAP_CONTENT;
                    bVar.a(eVar, aVar);
                    i13 = aVar.f27768f;
                }
                aVar.f27763a = bVar5;
                aVar.f27765c = (int) (eVar.v() * ((float) i13));
            }
        }
        if (z13) {
            if (eVar.f27488y[1] == 4) {
                aVar.f27764b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar6 = aVar.f27763a;
                e.b bVar7 = e.b.FIXED;
                if (bVar6 == bVar7) {
                    i12 = aVar.f27765c;
                } else {
                    aVar.f27764b = e.b.WRAP_CONTENT;
                    bVar.a(eVar, aVar);
                    i12 = aVar.f27767e;
                }
                aVar.f27764b = bVar7;
                if (eVar.w() == -1) {
                    aVar.f27766d = (int) (((float) i12) / eVar.v());
                } else {
                    aVar.f27766d = (int) (eVar.v() * ((float) i12));
                }
            }
        }
        bVar.a(eVar, aVar);
        eVar.o1(aVar.f27767e);
        eVar.P0(aVar.f27768f);
        eVar.O0(aVar.f27770h);
        eVar.E0(aVar.f27769g);
        aVar.f27772j = b.a.f27760k;
        return aVar.f27771i;
    }

    private void a2() {
        this.f27503W0 = 0;
        this.f27504X0 = 0;
    }

    /* access modifiers changed from: package-private */
    public void A1(e eVar, int i10) {
        if (i10 == 0) {
            C1(eVar);
        } else if (i10 == 1) {
            H1(eVar);
        }
    }

    public boolean B1(C5414d dVar) {
        boolean Z12 = Z1(64);
        g(dVar, Z12);
        int size = this.f27591L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f27591L0.get(i10);
            eVar.W0(0, false);
            eVar.W0(1, false);
            if (eVar instanceof C5756a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.f27591L0.get(i11);
                if (eVar2 instanceof C5756a) {
                    ((C5756a) eVar2).C1();
                }
            }
        }
        this.f27521o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.f27591L0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f27521o1.add(eVar3);
                } else {
                    eVar3.g(dVar, Z12);
                }
            }
        }
        while (this.f27521o1.size() > 0) {
            int size2 = this.f27521o1.size();
            Iterator<e> it = this.f27521o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                if (lVar.z1(this.f27521o1)) {
                    lVar.g(dVar, Z12);
                    this.f27521o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f27521o1.size()) {
                Iterator<e> it2 = this.f27521o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, Z12);
                }
                this.f27521o1.clear();
            }
        }
        if (C5414d.f23797s) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.f27591L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                k.a(this, dVar, eVar5);
                eVar5.g(dVar, Z12);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar6 = this.f27591L0.get(i14);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.f27439Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.T0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.k1(e.b.FIXED);
                    }
                    eVar6.g(dVar, Z12);
                    if (bVar == bVar3) {
                        eVar6.T0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.k1(bVar2);
                    }
                } else {
                    k.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, Z12);
                    }
                }
            }
        }
        if (this.f27503W0 > 0) {
            C5757b.b(this, dVar, (ArrayList<e>) null, 0);
        }
        if (this.f27504X0 > 0) {
            C5757b.b(this, dVar, (ArrayList<e>) null, 1);
        }
        return true;
    }

    public void D1(d dVar) {
        WeakReference<d> weakReference = this.f27520n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f27520n1.get().e()) {
            this.f27520n1 = new WeakReference<>(dVar);
        }
    }

    public void E1(d dVar) {
        WeakReference<d> weakReference = this.f27518l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f27518l1.get().e()) {
            this.f27518l1 = new WeakReference<>(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void I1(d dVar) {
        WeakReference<d> weakReference = this.f27519m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f27519m1.get().e()) {
            this.f27519m1 = new WeakReference<>(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void J1(d dVar) {
        WeakReference<d> weakReference = this.f27517k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f27517k1.get().e()) {
            this.f27517k1 = new WeakReference<>(dVar);
        }
    }

    public boolean K1(boolean z10) {
        return this.f27494N0.f(z10);
    }

    public boolean L1(boolean z10) {
        return this.f27494N0.g(z10);
    }

    public boolean M1(boolean z10, int i10) {
        return this.f27494N0.h(z10, i10);
    }

    public void N1(C5415e eVar) {
        this.f27498R0.v(eVar);
    }

    public b.C0446b O1() {
        return this.f27496P0;
    }

    public void P(StringBuilder sb2) {
        sb2.append(this.f27468o + ":{\n");
        sb2.append("  actualWidth:" + this.f27443b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f27445c0);
        sb2.append("\n");
        Iterator<e> it = w1().iterator();
        while (it.hasNext()) {
            it.next().P(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public int P1() {
        return this.f27512f1;
    }

    public C5414d Q1() {
        return this.f27498R0;
    }

    public boolean R1() {
        return false;
    }

    public void S1() {
        this.f27494N0.j();
    }

    public void T1() {
        this.f27494N0.k();
    }

    public boolean U1() {
        return this.f27515i1;
    }

    public boolean V1() {
        return this.f27497Q0;
    }

    public boolean W1() {
        return this.f27514h1;
    }

    public long X1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i17;
        this.f27499S0 = i19;
        int i20 = i18;
        this.f27500T0 = i20;
        return this.f27493M0.d(this, i10, i19, i20, i11, i12, i13, i14, i15, i16);
    }

    public boolean Z1(int i10) {
        return (this.f27512f1 & i10) == i10;
    }

    public void b2(b.C0446b bVar) {
        this.f27496P0 = bVar;
        this.f27494N0.n(bVar);
    }

    public void c2(int i10) {
        this.f27512f1 = i10;
        C5414d.f23797s = Z1(512);
    }

    public void d2(int i10) {
        this.f27495O0 = i10;
    }

    public void e2(boolean z10) {
        this.f27497Q0 = z10;
    }

    public boolean f2(C5414d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean Z12 = Z1(64);
        u1(dVar, Z12);
        int size = this.f27591L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f27591L0.get(i10);
            eVar.u1(dVar, Z12);
            if (eVar.e0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void g2() {
        this.f27493M0.e(this);
    }

    public void t1(boolean z10, boolean z11) {
        super.t1(z10, z11);
        int size = this.f27591L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27591L0.get(i10).t1(z10, z11);
        }
    }

    public void v0() {
        this.f27498R0.E();
        this.f27499S0 = 0;
        this.f27501U0 = 0;
        this.f27500T0 = 0;
        this.f27502V0 = 0;
        this.f27513g1 = false;
        super.v0();
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0310  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f27451f0 = r2
            r1.f27453g0 = r2
            r1.f27514h1 = r2
            r1.f27515i1 = r2
            java.util.ArrayList<p2.e> r0 = r1.f27591L0
            int r3 = r0.size()
            int r0 = r18.Y()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.x()
            int r4 = java.lang.Math.max(r2, r4)
            p2.e$b[] r5 = r1.f27439Z
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f27495O0
            if (r8 != 0) goto L_0x0084
            int r8 = r1.f27512f1
            boolean r8 = p2.k.b(r8, r6)
            if (r8 == 0) goto L_0x0084
            q2.b$b r8 = r18.O1()
            q2.h.h(r1, r8)
            r8 = r2
        L_0x003c:
            if (r8 >= r3) goto L_0x0084
            java.util.ArrayList<p2.e> r9 = r1.f27591L0
            java.lang.Object r9 = r9.get(r8)
            p2.e r9 = (p2.e) r9
            boolean r10 = r9.o0()
            if (r10 == 0) goto L_0x0081
            boolean r10 = r9 instanceof p2.h
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof p2.C5756a
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof p2.l
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9.n0()
            if (r10 != 0) goto L_0x0081
            p2.e$b r10 = r9.u(r2)
            p2.e$b r11 = r9.u(r6)
            p2.e$b r12 = p2.e.b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0075
            int r10 = r9.f27484w
            if (r10 == r6) goto L_0x0075
            if (r11 != r12) goto L_0x0075
            int r10 = r9.f27486x
            if (r10 == r6) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            q2.b$a r10 = new q2.b$a
            r10.<init>()
            q2.b$b r11 = r1.f27496P0
            int r12 = q2.b.a.f27760k
            Y1(r2, r9, r11, r10, r12)
        L_0x0081:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0084:
            r8 = 2
            if (r3 <= r8) goto L_0x00cd
            p2.e$b r9 = p2.e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x008d
            if (r7 != r9) goto L_0x00cd
        L_0x008d:
            int r10 = r1.f27512f1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = p2.k.b(r10, r11)
            if (r10 == 0) goto L_0x00cd
            q2.b$b r10 = r18.O1()
            boolean r10 = q2.i.c(r1, r10)
            if (r10 == 0) goto L_0x00cd
            if (r5 != r9) goto L_0x00b5
            int r10 = r18.Y()
            if (r0 >= r10) goto L_0x00b1
            if (r0 <= 0) goto L_0x00b1
            r1.o1(r0)
            r1.f27514h1 = r6
            goto L_0x00b5
        L_0x00b1:
            int r0 = r18.Y()
        L_0x00b5:
            if (r7 != r9) goto L_0x00c9
            int r9 = r18.x()
            if (r4 >= r9) goto L_0x00c5
            if (r4 <= 0) goto L_0x00c5
            r1.P0(r4)
            r1.f27515i1 = r6
            goto L_0x00c9
        L_0x00c5:
            int r4 = r18.x()
        L_0x00c9:
            r9 = r4
            r4 = r0
            r0 = r6
            goto L_0x00d0
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = r2
        L_0x00d0:
            r10 = 64
            boolean r11 = r1.Z1(r10)
            if (r11 != 0) goto L_0x00e3
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.Z1(r11)
            if (r11 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r11 = r2
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            h2.d r12 = r1.f27498R0
            r12.f23812i = r2
            r12.f23813j = r2
            int r13 = r1.f27512f1
            if (r13 == 0) goto L_0x00f2
            if (r11 == 0) goto L_0x00f2
            r12.f23813j = r6
        L_0x00f2:
            java.util.ArrayList<p2.e> r11 = r1.f27591L0
            p2.e$b r12 = r18.A()
            p2.e$b r13 = p2.e.b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0105
            p2.e$b r12 = r18.V()
            if (r12 != r13) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r12 = r2
            goto L_0x0106
        L_0x0105:
            r12 = r6
        L_0x0106:
            r18.a2()
            r13 = r2
        L_0x010a:
            if (r13 >= r3) goto L_0x0120
            java.util.ArrayList<p2.e> r14 = r1.f27591L0
            java.lang.Object r14 = r14.get(r13)
            p2.e r14 = (p2.e) r14
            boolean r15 = r14 instanceof p2.m
            if (r15 == 0) goto L_0x011d
            p2.m r14 = (p2.m) r14
            r14.x1()
        L_0x011d:
            int r13 = r13 + 1
            goto L_0x010a
        L_0x0120:
            boolean r10 = r1.Z1(r10)
            r13 = r0
            r0 = r2
            r14 = r6
        L_0x0127:
            if (r14 == 0) goto L_0x0317
            int r15 = r0 + 1
            h2.d r0 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            r0.E()     // Catch:{ Exception -> 0x014d }
            r18.a2()     // Catch:{ Exception -> 0x014d }
            h2.d r0 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            r1.m(r0)     // Catch:{ Exception -> 0x014d }
            r0 = r2
        L_0x0139:
            if (r0 >= r3) goto L_0x0150
            java.util.ArrayList<p2.e> r6 = r1.f27591L0     // Catch:{ Exception -> 0x014d }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x014d }
            p2.e r6 = (p2.e) r6     // Catch:{ Exception -> 0x014d }
            h2.d r2 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            r6.m(r2)     // Catch:{ Exception -> 0x014d }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0139
        L_0x014d:
            r0 = move-exception
            goto L_0x01db
        L_0x0150:
            h2.d r0 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            boolean r14 = r1.B1(r0)     // Catch:{ Exception -> 0x014d }
            java.lang.ref.WeakReference<p2.d> r0 = r1.f27517k1     // Catch:{ Exception -> 0x014d }
            r2 = 0
            if (r0 == 0) goto L_0x0176
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0176
            java.lang.ref.WeakReference<p2.d> r0 = r1.f27517k1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            p2.d r0 = (p2.d) r0     // Catch:{ Exception -> 0x014d }
            h2.d r6 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            p2.d r8 = r1.f27429P     // Catch:{ Exception -> 0x014d }
            h2.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.G1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f27517k1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0176:
            java.lang.ref.WeakReference<p2.d> r0 = r1.f27519m1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.ref.WeakReference<p2.d> r0 = r1.f27519m1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            p2.d r0 = (p2.d) r0     // Catch:{ Exception -> 0x014d }
            h2.d r6 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            p2.d r8 = r1.f27431R     // Catch:{ Exception -> 0x014d }
            h2.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.F1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f27519m1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0195:
            java.lang.ref.WeakReference<p2.d> r0 = r1.f27518l1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.ref.WeakReference<p2.d> r0 = r1.f27518l1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            p2.d r0 = (p2.d) r0     // Catch:{ Exception -> 0x014d }
            h2.d r6 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            p2.d r8 = r1.f27428O     // Catch:{ Exception -> 0x014d }
            h2.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.G1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f27518l1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01b4:
            java.lang.ref.WeakReference<p2.d> r0 = r1.f27520n1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.ref.WeakReference<p2.d> r0 = r1.f27520n1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            p2.d r0 = (p2.d) r0     // Catch:{ Exception -> 0x014d }
            h2.d r6 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            p2.d r8 = r1.f27430Q     // Catch:{ Exception -> 0x014d }
            h2.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.F1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f27520n1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01d3:
            if (r14 == 0) goto L_0x01f4
            h2.d r0 = r1.f27498R0     // Catch:{ Exception -> 0x014d }
            r0.A()     // Catch:{ Exception -> 0x014d }
            goto L_0x01f4
        L_0x01db:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f4:
            if (r14 == 0) goto L_0x01ff
            h2.d r0 = r1.f27498R0
            boolean[] r2 = p2.k.f27577a
            boolean r0 = r1.f2(r0, r2)
            goto L_0x0218
        L_0x01ff:
            h2.d r0 = r1.f27498R0
            r1.u1(r0, r10)
            r0 = 0
        L_0x0205:
            if (r0 >= r3) goto L_0x0217
            java.util.ArrayList<p2.e> r2 = r1.f27591L0
            java.lang.Object r2 = r2.get(r0)
            p2.e r2 = (p2.e) r2
            h2.d r6 = r1.f27498R0
            r2.u1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0205
        L_0x0217:
            r0 = 0
        L_0x0218:
            r2 = 8
            if (r12 == 0) goto L_0x0289
            if (r15 >= r2) goto L_0x0289
            boolean[] r6 = p2.k.f27577a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0289
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0228:
            if (r6 >= r3) goto L_0x0252
            java.util.ArrayList<p2.e> r2 = r1.f27591L0
            java.lang.Object r2 = r2.get(r6)
            p2.e r2 = (p2.e) r2
            r16 = r0
            int r0 = r2.f27451f0
            int r17 = r2.Y()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f27453g0
            int r2 = r2.x()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0228
        L_0x0252:
            r16 = r0
            int r0 = r1.f27465m0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f27467n0
            int r2 = java.lang.Math.max(r2, r8)
            p2.e$b r6 = p2.e.b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0275
            int r8 = r18.Y()
            if (r8 >= r0) goto L_0x0275
            r1.o1(r0)
            p2.e$b[] r0 = r1.f27439Z
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0275:
            if (r7 != r6) goto L_0x028b
            int r0 = r18.x()
            if (r0 >= r2) goto L_0x028b
            r1.P0(r2)
            p2.e$b[] r0 = r1.f27439Z
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x028b
        L_0x0289:
            r16 = r0
        L_0x028b:
            int r0 = r1.f27465m0
            int r2 = r18.Y()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.Y()
            if (r0 <= r2) goto L_0x02a8
            r1.o1(r0)
            p2.e$b[] r0 = r1.f27439Z
            p2.e$b r2 = p2.e.b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02a8:
            int r0 = r1.f27467n0
            int r2 = r18.x()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.x()
            if (r0 <= r2) goto L_0x02c6
            r1.P0(r0)
            p2.e$b[] r0 = r1.f27439Z
            p2.e$b r2 = p2.e.b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = r6
            r16 = r2
            goto L_0x02c8
        L_0x02c6:
            r6 = 1
            r2 = r13
        L_0x02c8:
            if (r2 != 0) goto L_0x0307
            p2.e$b[] r0 = r1.f27439Z
            r8 = 0
            r0 = r0[r8]
            p2.e$b r13 = p2.e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e9
            if (r4 <= 0) goto L_0x02e9
            int r0 = r18.Y()
            if (r0 <= r4) goto L_0x02e9
            r1.f27514h1 = r6
            p2.e$b[] r0 = r1.f27439Z
            p2.e$b r2 = p2.e.b.FIXED
            r0[r8] = r2
            r1.o1(r4)
            r2 = r6
            r16 = r2
        L_0x02e9:
            p2.e$b[] r0 = r1.f27439Z
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0307
            if (r9 <= 0) goto L_0x0307
            int r0 = r18.x()
            if (r0 <= r9) goto L_0x0307
            r1.f27515i1 = r6
            p2.e$b[] r0 = r1.f27439Z
            p2.e$b r2 = p2.e.b.FIXED
            r0[r6] = r2
            r1.P0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030c
        L_0x0307:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030c:
            if (r15 <= r0) goto L_0x0310
            r14 = 0
            goto L_0x0311
        L_0x0310:
            r14 = r2
        L_0x0311:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0127
        L_0x0317:
            r1.f27591L0 = r11
            if (r13 == 0) goto L_0x0323
            p2.e$b[] r0 = r1.f27439Z
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0323:
            h2.d r0 = r1.f27498R0
            h2.c r0 = r0.w()
            r1.y0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.f.x1():void");
    }

    public f(int i10, int i11) {
        super(i10, i11);
    }
}
