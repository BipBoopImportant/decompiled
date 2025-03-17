package q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p2.e;
import p2.f;
import p2.h;
import p2.j;
import q2.b;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private f f27775a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27776b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27777c = true;

    /* renamed from: d  reason: collision with root package name */
    private f f27778d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<p> f27779e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<m> f27780f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private b.C0446b f27781g = null;

    /* renamed from: h  reason: collision with root package name */
    private b.a f27782h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList<m> f27783i = new ArrayList<>();

    public e(f fVar) {
        this.f27775a = fVar;
        this.f27778d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f27787d;
        if (pVar.f27829c == null) {
            f fVar3 = this.f27775a;
            if (pVar != fVar3.f27448e && pVar != fVar3.f27450f) {
                if (mVar == null) {
                    mVar = new m(pVar, i11);
                    arrayList.add(mVar);
                }
                pVar.f27829c = mVar;
                mVar.a(pVar);
                for (d next : pVar.f27834h.f27794k) {
                    if (next instanceof f) {
                        a((f) next, i10, 0, fVar2, arrayList, mVar);
                    }
                }
                for (d next2 : pVar.f27835i.f27794k) {
                    if (next2 instanceof f) {
                        a((f) next2, i10, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    for (d next3 : ((n) pVar).f27810k.f27794k) {
                        if (next3 instanceof f) {
                            a((f) next3, i10, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (f next4 : pVar.f27834h.f27795l) {
                    if (next4 == fVar2) {
                        mVar.f27804b = true;
                    }
                    a(next4, i10, 0, fVar2, arrayList, mVar);
                }
                for (f next5 : pVar.f27835i.f27795l) {
                    if (next5 == fVar2) {
                        mVar.f27804b = true;
                    }
                    a(next5, i10, 1, fVar2, arrayList, mVar);
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    for (f a10 : ((n) pVar).f27810k.f27795l) {
                        a(a10, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0280, code lost:
        r4 = r0.f27439Z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(p2.f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<p2.e> r1 = r0.f27591L0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0338
            java.lang.Object r2 = r1.next()
            p2.e r2 = (p2.e) r2
            p2.e$b[] r4 = r2.f27439Z
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.X()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f27440a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f27406B
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            p2.e$b r6 = p2.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f27484w = r7
        L_0x0036:
            float r6 = r2.f27412E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            p2.e$b r6 = p2.e.b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f27486x = r7
        L_0x0042:
            float r6 = r2.v()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0078
            p2.e$b r6 = p2.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            p2.e$b r9 = p2.e.b.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            p2.e$b r9 = p2.e.b.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f27484w = r8
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            p2.e$b r9 = p2.e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            p2.e$b r9 = p2.e.b.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f27486x = r8
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f27484w
            if (r6 != 0) goto L_0x0072
            r2.f27484w = r8
        L_0x0072:
            int r6 = r2.f27486x
            if (r6 != 0) goto L_0x0078
            r2.f27486x = r8
        L_0x0078:
            p2.e$b r6 = p2.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r9 = r2.f27484w
            if (r9 != r10) goto L_0x008e
            p2.d r9 = r2.f27428O
            p2.d r9 = r9.f27399f
            if (r9 == 0) goto L_0x008c
            p2.d r9 = r2.f27430Q
            p2.d r9 = r9.f27399f
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            p2.e$b r5 = p2.e.b.WRAP_CONTENT
        L_0x008e:
            r9 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f27486x
            if (r5 != r10) goto L_0x00a3
            p2.d r5 = r2.f27429P
            p2.d r5 = r5.f27399f
            if (r5 == 0) goto L_0x00a1
            p2.d r5 = r2.f27431R
            p2.d r5 = r5.f27399f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            p2.e$b r4 = p2.e.b.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            q2.l r4 = r2.f27448e
            r4.f27830d = r9
            int r5 = r2.f27484w
            r4.f27827a = r5
            q2.n r4 = r2.f27450f
            r4.f27830d = r12
            int r13 = r2.f27486x
            r4.f27827a = r13
            p2.e$b r4 = p2.e.b.MATCH_PARENT
            if (r9 == r4) goto L_0x00c0
            p2.e$b r14 = p2.e.b.FIXED
            if (r9 == r14) goto L_0x00c0
            p2.e$b r14 = p2.e.b.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02e2
            p2.e$b r14 = p2.e.b.FIXED
            if (r12 == r14) goto L_0x02e2
            p2.e$b r14 = p2.e.b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02e2
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0199
            p2.e$b r15 = p2.e.b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            p2.e$b r11 = p2.e.b.FIXED
            if (r12 != r11) goto L_0x0199
        L_0x00d8:
            if (r5 != r8) goto L_0x0113
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.l(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.x()
            float r3 = (float) r9
            float r4 = r2.f27447d0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            p2.e$b r8 = p2.e.b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.d(r4)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r4 = r2.x()
            r3.d(r4)
            r2.f27440a = r10
            goto L_0x0008
        L_0x0113:
            if (r5 != r10) goto L_0x012b
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r2 = r2.Y()
            r3.f27796m = r2
            goto L_0x0008
        L_0x012b:
            if (r5 != r7) goto L_0x0167
            p2.e$b[] r11 = r0.f27439Z
            r11 = r11[r3]
            p2.e$b r15 = p2.e.b.FIXED
            if (r11 == r15) goto L_0x0137
            if (r11 != r4) goto L_0x0199
        L_0x0137:
            float r3 = r2.f27406B
            int r4 = r17.Y()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.x()
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.d(r4)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r4 = r2.x()
            r3.d(r4)
            r2.f27440a = r10
            goto L_0x0008
        L_0x0167:
            p2.d[] r11 = r2.f27436W
            r7 = r11[r3]
            p2.d r7 = r7.f27399f
            if (r7 == 0) goto L_0x0175
            r7 = r11[r10]
            p2.d r7 = r7.f27399f
            if (r7 != 0) goto L_0x0199
        L_0x0175:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.d(r4)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r4 = r2.x()
            r3.d(r4)
            r2.f27440a = r10
            goto L_0x0008
        L_0x0199:
            if (r12 != r6) goto L_0x0272
            p2.e$b r11 = p2.e.b.WRAP_CONTENT
            if (r9 == r11) goto L_0x01a3
            p2.e$b r7 = p2.e.b.FIXED
            if (r9 != r7) goto L_0x0272
        L_0x01a3:
            if (r13 != r8) goto L_0x01e9
            if (r9 != r11) goto L_0x01b1
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
        L_0x01b1:
            int r7 = r2.Y()
            float r3 = r2.f27447d0
            int r4 = r2.w()
            r5 = -1
            if (r4 != r5) goto L_0x01c2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c2:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            p2.e$b r8 = p2.e.b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.d(r4)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r4 = r2.x()
            r3.d(r4)
            r2.f27440a = r10
            goto L_0x0008
        L_0x01e9:
            if (r13 != r10) goto L_0x0202
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.l(r5, r6, r7, r8, r9)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r2 = r2.x()
            r3.f27796m = r2
            goto L_0x0008
        L_0x0202:
            r7 = 2
            if (r13 != r7) goto L_0x023f
            p2.e$b[] r7 = r0.f27439Z
            r7 = r7[r10]
            p2.e$b r8 = p2.e.b.FIXED
            if (r7 == r8) goto L_0x020f
            if (r7 != r4) goto L_0x0272
        L_0x020f:
            float r3 = r2.f27412E
            int r7 = r2.Y()
            int r4 = r17.x()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.d(r4)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r4 = r2.x()
            r3.d(r4)
            r2.f27440a = r10
            goto L_0x0008
        L_0x023f:
            p2.d[] r4 = r2.f27436W
            r7 = 2
            r15 = r4[r7]
            p2.d r7 = r15.f27399f
            if (r7 == 0) goto L_0x024e
            r4 = r4[r8]
            p2.d r4 = r4.f27399f
            if (r4 != 0) goto L_0x0272
        L_0x024e:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.d(r4)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r4 = r2.x()
            r3.d(r4)
            r2.f27440a = r10
            goto L_0x0008
        L_0x0272:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02c1
            if (r13 != r10) goto L_0x027b
            goto L_0x02c1
        L_0x027b:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            p2.e$b[] r4 = r0.f27439Z
            r3 = r4[r3]
            p2.e$b r8 = p2.e.b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f27406B
            float r4 = r2.f27412E
            int r5 = r17.Y()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.x()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.d(r4)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r4 = r2.x()
            r3.d(r4)
            r2.f27440a = r10
            goto L_0x0008
        L_0x02c1:
            p2.e$b r8 = p2.e.b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.f27796m = r4
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r2 = r2.x()
            r3.f27796m = r2
            goto L_0x0008
        L_0x02e2:
            int r3 = r2.Y()
            if (r9 != r4) goto L_0x02fb
            int r3 = r17.Y()
            p2.d r5 = r2.f27428O
            int r5 = r5.f27400g
            int r3 = r3 - r5
            p2.d r5 = r2.f27430Q
            int r5 = r5.f27400g
            int r3 = r3 - r5
            p2.e$b r5 = p2.e.b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x02fd
        L_0x02fb:
            r7 = r3
            r6 = r9
        L_0x02fd:
            int r3 = r2.x()
            if (r12 != r4) goto L_0x0316
            int r3 = r17.x()
            p2.d r4 = r2.f27429P
            int r4 = r4.f27400g
            int r3 = r3 - r4
            p2.d r4 = r2.f27431R
            int r4 = r4.f27400g
            int r3 = r3 - r4
            p2.e$b r4 = p2.e.b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0318
        L_0x0316:
            r9 = r3
            r8 = r12
        L_0x0318:
            r4 = r16
            r5 = r2
            r4.l(r5, r6, r7, r8, r9)
            q2.l r3 = r2.f27448e
            q2.g r3 = r3.f27831e
            int r4 = r2.Y()
            r3.d(r4)
            q2.n r3 = r2.f27450f
            q2.g r3 = r3.f27831e
            int r4 = r2.x()
            r3.d(r4)
            r2.f27440a = r10
            goto L_0x0008
        L_0x0338:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.e.b(p2.f):boolean");
    }

    private int e(f fVar, int i10) {
        int size = this.f27783i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f27783i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d next : pVar.f27834h.f27794k) {
            if (next instanceof f) {
                a((f) next, i10, 0, pVar.f27835i, arrayList, (m) null);
            } else if (next instanceof p) {
                a(((p) next).f27834h, i10, 0, pVar.f27835i, arrayList, (m) null);
            }
        }
        for (d next2 : pVar.f27835i.f27794k) {
            if (next2 instanceof f) {
                a((f) next2, i10, 1, pVar.f27834h, arrayList, (m) null);
            } else if (next2 instanceof p) {
                a(((p) next2).f27835i, i10, 1, pVar.f27834h, arrayList, (m) null);
            }
        }
        if (i10 == 1) {
            for (d next3 : ((n) pVar).f27810k.f27794k) {
                if (next3 instanceof f) {
                    a((f) next3, i10, 2, (f) null, arrayList, (m) null);
                }
            }
        }
    }

    private void l(p2.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f27782h;
        aVar.f27763a = bVar;
        aVar.f27764b = bVar2;
        aVar.f27765c = i10;
        aVar.f27766d = i11;
        this.f27781g.a(eVar, aVar);
        eVar.o1(this.f27782h.f27767e);
        eVar.P0(this.f27782h.f27768f);
        eVar.O0(this.f27782h.f27770h);
        eVar.E0(this.f27782h.f27769g);
    }

    public void c() {
        d(this.f27779e);
        this.f27783i.clear();
        m.f27802h = 0;
        i(this.f27775a.f27448e, 0, this.f27783i);
        i(this.f27775a.f27450f, 1, this.f27783i);
        this.f27776b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f27778d.f27448e.f();
        this.f27778d.f27450f.f();
        arrayList.add(this.f27778d.f27448e);
        arrayList.add(this.f27778d.f27450f);
        Iterator<p2.e> it = this.f27778d.f27591L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            p2.e next = it.next();
            if (next instanceof h) {
                arrayList.add(new j(next));
            } else {
                if (next.k0()) {
                    if (next.f27444c == null) {
                        next.f27444c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f27444c);
                } else {
                    arrayList.add(next.f27448e);
                }
                if (next.m0()) {
                    if (next.f27446d == null) {
                        next.f27446d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f27446d);
                } else {
                    arrayList.add(next.f27450f);
                }
                if (next instanceof j) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f27828b != this.f27778d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f27776b || this.f27777c) {
            Iterator<p2.e> it = this.f27775a.f27591L0.iterator();
            while (it.hasNext()) {
                p2.e next = it.next();
                next.n();
                next.f27440a = false;
                next.f27448e.r();
                next.f27450f.q();
            }
            this.f27775a.n();
            f fVar = this.f27775a;
            fVar.f27440a = false;
            fVar.f27448e.r();
            this.f27775a.f27450f.q();
            this.f27777c = false;
        }
        if (b(this.f27778d)) {
            return false;
        }
        this.f27775a.q1(0);
        this.f27775a.r1(0);
        e.b u10 = this.f27775a.u(0);
        e.b u11 = this.f27775a.u(1);
        if (this.f27776b) {
            c();
        }
        int Z10 = this.f27775a.Z();
        int a02 = this.f27775a.a0();
        this.f27775a.f27448e.f27834h.d(Z10);
        this.f27775a.f27450f.f27834h.d(a02);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (u10 == bVar || u11 == bVar) {
            if (z10) {
                Iterator<p> it2 = this.f27779e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().m()) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z10 && u10 == e.b.WRAP_CONTENT) {
                this.f27775a.T0(e.b.FIXED);
                f fVar2 = this.f27775a;
                fVar2.o1(e(fVar2, 0));
                f fVar3 = this.f27775a;
                fVar3.f27448e.f27831e.d(fVar3.Y());
            }
            if (z10 && u11 == e.b.WRAP_CONTENT) {
                this.f27775a.k1(e.b.FIXED);
                f fVar4 = this.f27775a;
                fVar4.P0(e(fVar4, 1));
                f fVar5 = this.f27775a;
                fVar5.f27450f.f27831e.d(fVar5.x());
            }
        }
        f fVar6 = this.f27775a;
        e.b bVar2 = fVar6.f27439Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int Y10 = fVar6.Y() + Z10;
            this.f27775a.f27448e.f27835i.d(Y10);
            this.f27775a.f27448e.f27831e.d(Y10 - Z10);
            m();
            f fVar7 = this.f27775a;
            e.b bVar4 = fVar7.f27439Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int x10 = fVar7.x() + a02;
                this.f27775a.f27450f.f27835i.d(x10);
                this.f27775a.f27450f.f27831e.d(x10 - a02);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f27779e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f27828b != this.f27775a || next2.f27833g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f27779e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z12 = true;
                break;
            }
            p next3 = it4.next();
            if ((z11 || next3.f27828b != this.f27775a) && (!next3.f27834h.f27793j || ((!next3.f27835i.f27793j && !(next3 instanceof j)) || (!next3.f27831e.f27793j && !(next3 instanceof c) && !(next3 instanceof j))))) {
                break;
            }
        }
        this.f27775a.T0(u10);
        this.f27775a.k1(u11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f27776b) {
            Iterator<p2.e> it = this.f27775a.f27591L0.iterator();
            while (it.hasNext()) {
                p2.e next = it.next();
                next.n();
                next.f27440a = false;
                l lVar = next.f27448e;
                lVar.f27831e.f27793j = false;
                lVar.f27833g = false;
                lVar.r();
                n nVar = next.f27450f;
                nVar.f27831e.f27793j = false;
                nVar.f27833g = false;
                nVar.q();
            }
            this.f27775a.n();
            f fVar = this.f27775a;
            fVar.f27440a = false;
            l lVar2 = fVar.f27448e;
            lVar2.f27831e.f27793j = false;
            lVar2.f27833g = false;
            lVar2.r();
            n nVar2 = this.f27775a.f27450f;
            nVar2.f27831e.f27793j = false;
            nVar2.f27833g = false;
            nVar2.q();
            c();
        }
        if (b(this.f27778d)) {
            return false;
        }
        this.f27775a.q1(0);
        this.f27775a.r1(0);
        this.f27775a.f27448e.f27834h.d(0);
        this.f27775a.f27450f.f27834h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            p2.f r0 = r9.f27775a
            r1 = 0
            p2.e$b r0 = r0.u(r1)
            p2.f r2 = r9.f27775a
            r3 = 1
            p2.e$b r2 = r2.u(r3)
            p2.f r4 = r9.f27775a
            int r4 = r4.Z()
            p2.f r5 = r9.f27775a
            int r5 = r5.a0()
            if (r10 == 0) goto L_0x0088
            p2.e$b r6 = p2.e.b.WRAP_CONTENT
            if (r0 == r6) goto L_0x0022
            if (r2 != r6) goto L_0x0088
        L_0x0022:
            java.util.ArrayList<q2.p> r6 = r9.f27779e
            java.util.Iterator r6 = r6.iterator()
        L_0x0028:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x003f
            java.lang.Object r7 = r6.next()
            q2.p r7 = (q2.p) r7
            int r8 = r7.f27832f
            if (r8 != r11) goto L_0x0028
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0028
            r10 = r1
        L_0x003f:
            if (r11 != 0) goto L_0x0065
            if (r10 == 0) goto L_0x0088
            p2.e$b r10 = p2.e.b.WRAP_CONTENT
            if (r0 != r10) goto L_0x0088
            p2.f r10 = r9.f27775a
            p2.e$b r6 = p2.e.b.FIXED
            r10.T0(r6)
            p2.f r10 = r9.f27775a
            int r6 = r9.e(r10, r1)
            r10.o1(r6)
            p2.f r10 = r9.f27775a
            q2.l r6 = r10.f27448e
            q2.g r6 = r6.f27831e
            int r10 = r10.Y()
            r6.d(r10)
            goto L_0x0088
        L_0x0065:
            if (r10 == 0) goto L_0x0088
            p2.e$b r10 = p2.e.b.WRAP_CONTENT
            if (r2 != r10) goto L_0x0088
            p2.f r10 = r9.f27775a
            p2.e$b r6 = p2.e.b.FIXED
            r10.k1(r6)
            p2.f r10 = r9.f27775a
            int r6 = r9.e(r10, r3)
            r10.P0(r6)
            p2.f r10 = r9.f27775a
            q2.n r6 = r10.f27450f
            q2.g r6 = r6.f27831e
            int r10 = r10.x()
            r6.d(r10)
        L_0x0088:
            if (r11 != 0) goto L_0x00b2
            p2.f r10 = r9.f27775a
            p2.e$b[] r5 = r10.f27439Z
            r5 = r5[r1]
            p2.e$b r6 = p2.e.b.FIXED
            if (r5 == r6) goto L_0x0098
            p2.e$b r6 = p2.e.b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c1
        L_0x0098:
            int r10 = r10.Y()
            int r10 = r10 + r4
            p2.f r5 = r9.f27775a
            q2.l r5 = r5.f27448e
            q2.f r5 = r5.f27835i
            r5.d(r10)
            p2.f r5 = r9.f27775a
            q2.l r5 = r5.f27448e
            q2.g r5 = r5.f27831e
            int r10 = r10 - r4
            r5.d(r10)
        L_0x00b0:
            r10 = r3
            goto L_0x00dc
        L_0x00b2:
            p2.f r10 = r9.f27775a
            p2.e$b[] r4 = r10.f27439Z
            r4 = r4[r3]
            p2.e$b r6 = p2.e.b.FIXED
            if (r4 == r6) goto L_0x00c3
            p2.e$b r6 = p2.e.b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10 = r1
            goto L_0x00dc
        L_0x00c3:
            int r10 = r10.x()
            int r10 = r10 + r5
            p2.f r4 = r9.f27775a
            q2.n r4 = r4.f27450f
            q2.f r4 = r4.f27835i
            r4.d(r10)
            p2.f r4 = r9.f27775a
            q2.n r4 = r4.f27450f
            q2.g r4 = r4.f27831e
            int r10 = r10 - r5
            r4.d(r10)
            goto L_0x00b0
        L_0x00dc:
            r9.m()
            java.util.ArrayList<q2.p> r4 = r9.f27779e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r4.next()
            q2.p r5 = (q2.p) r5
            int r6 = r5.f27832f
            if (r6 == r11) goto L_0x00f6
            goto L_0x00e5
        L_0x00f6:
            p2.e r6 = r5.f27828b
            p2.f r7 = r9.f27775a
            if (r6 != r7) goto L_0x0101
            boolean r6 = r5.f27833g
            if (r6 != 0) goto L_0x0101
            goto L_0x00e5
        L_0x0101:
            r5.e()
            goto L_0x00e5
        L_0x0105:
            java.util.ArrayList<q2.p> r4 = r9.f27779e
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            q2.p r5 = (q2.p) r5
            int r6 = r5.f27832f
            if (r6 == r11) goto L_0x011c
            goto L_0x010b
        L_0x011c:
            if (r10 != 0) goto L_0x0125
            p2.e r6 = r5.f27828b
            p2.f r7 = r9.f27775a
            if (r6 != r7) goto L_0x0125
            goto L_0x010b
        L_0x0125:
            q2.f r6 = r5.f27834h
            boolean r6 = r6.f27793j
            if (r6 != 0) goto L_0x012c
            goto L_0x013f
        L_0x012c:
            q2.f r6 = r5.f27835i
            boolean r6 = r6.f27793j
            if (r6 != 0) goto L_0x0133
            goto L_0x013f
        L_0x0133:
            boolean r6 = r5 instanceof q2.c
            if (r6 != 0) goto L_0x010b
            q2.g r5 = r5.f27831e
            boolean r5 = r5.f27793j
            if (r5 != 0) goto L_0x010b
            goto L_0x013f
        L_0x013e:
            r1 = r3
        L_0x013f:
            p2.f r10 = r9.f27775a
            r10.T0(r0)
            p2.f r10 = r9.f27775a
            r10.k1(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.e.h(boolean, int):boolean");
    }

    public void j() {
        this.f27776b = true;
    }

    public void k() {
        this.f27777c = true;
    }

    public void m() {
        g gVar;
        Iterator<p2.e> it = this.f27775a.f27591L0.iterator();
        while (it.hasNext()) {
            p2.e next = it.next();
            if (!next.f27440a) {
                e.b[] bVarArr = next.f27439Z;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f27484w;
                int i11 = next.f27486x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f27448e.f27831e;
                boolean z12 = gVar2.f27793j;
                g gVar3 = next.f27450f.f27831e;
                boolean z13 = gVar3.f27793j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f27790g, bVar4, gVar3.f27790g);
                    next.f27440a = true;
                } else if (z12 && z10) {
                    l(next, e.b.FIXED, gVar2.f27790g, bVar3, gVar3.f27790g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f27450f.f27831e.f27796m = next.x();
                    } else {
                        next.f27450f.f27831e.d(next.x());
                        next.f27440a = true;
                    }
                } else if (z13 && z11) {
                    l(next, bVar3, gVar2.f27790g, e.b.FIXED, gVar3.f27790g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f27448e.f27831e.f27796m = next.Y();
                    } else {
                        next.f27448e.f27831e.d(next.Y());
                        next.f27440a = true;
                    }
                }
                if (next.f27440a && (gVar = next.f27450f.f27811l) != null) {
                    gVar.d(next.p());
                }
            }
        }
    }

    public void n(b.C0446b bVar) {
        this.f27781g = bVar;
    }
}
