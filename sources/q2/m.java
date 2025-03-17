package q2;

import java.util.ArrayList;
import p2.f;

class m {

    /* renamed from: h  reason: collision with root package name */
    public static int f27802h;

    /* renamed from: a  reason: collision with root package name */
    public int f27803a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27804b = false;

    /* renamed from: c  reason: collision with root package name */
    p f27805c = null;

    /* renamed from: d  reason: collision with root package name */
    p f27806d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<p> f27807e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    int f27808f;

    /* renamed from: g  reason: collision with root package name */
    int f27809g;

    m(p pVar, int i10) {
        int i11 = f27802h;
        this.f27808f = i11;
        f27802h = i11 + 1;
        this.f27805c = pVar;
        this.f27806d = pVar;
        this.f27809g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f27787d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f27794k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f27794k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f27787d != pVar) {
                    j11 = Math.min(j11, c(fVar2, ((long) fVar2.f27789f) + j10));
                }
            }
        }
        if (fVar != pVar.f27835i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f27834h, j12)), j12 - ((long) pVar.f27834h.f27789f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f27787d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f27794k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f27794k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f27787d != pVar) {
                    j11 = Math.max(j11, d(fVar2, ((long) fVar2.f27789f) + j10));
                }
            }
        }
        if (fVar != pVar.f27834h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f27835i, j12)), j12 - ((long) pVar.f27835i.f27789f));
    }

    public void a(p pVar) {
        this.f27807e.add(pVar);
        this.f27806d = pVar;
    }

    public long b(f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f27805c;
        long j11 = 0;
        if (pVar instanceof c) {
            if (((c) pVar).f27832f != i10) {
                return 0;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0;
            }
        } else if (!(pVar instanceof n)) {
            return 0;
        }
        f fVar2 = (i10 == 0 ? fVar.f27448e : fVar.f27450f).f27834h;
        f fVar3 = (i10 == 0 ? fVar.f27448e : fVar.f27450f).f27835i;
        boolean contains = pVar.f27834h.f27795l.contains(fVar2);
        boolean contains2 = this.f27805c.f27835i.f27795l.contains(fVar3);
        long j12 = this.f27805c.j();
        if (contains && contains2) {
            long d10 = d(this.f27805c.f27834h, 0);
            long c10 = c(this.f27805c.f27835i, 0);
            long j13 = d10 - j12;
            p pVar2 = this.f27805c;
            int i12 = pVar2.f27835i.f27789f;
            if (j13 >= ((long) (-i12))) {
                j13 += (long) i12;
            }
            int i13 = pVar2.f27834h.f27789f;
            long j14 = ((-c10) - j12) - ((long) i13);
            if (j14 >= ((long) i13)) {
                j14 -= (long) i13;
            }
            float q10 = pVar2.f27828b.q(i10);
            if (q10 > 0.0f) {
                j11 = (long) ((((float) j14) / q10) + (((float) j13) / (1.0f - q10)));
            }
            float f10 = (float) j11;
            long j15 = ((long) ((f10 * q10) + 0.5f)) + j12 + ((long) ((f10 * (1.0f - q10)) + 0.5f));
            p pVar3 = this.f27805c;
            j10 = ((long) pVar3.f27834h.f27789f) + j15;
            i11 = pVar3.f27835i.f27789f;
        } else if (contains) {
            f fVar4 = this.f27805c.f27834h;
            return Math.max(d(fVar4, (long) fVar4.f27789f), ((long) this.f27805c.f27834h.f27789f) + j12);
        } else if (contains2) {
            f fVar5 = this.f27805c.f27835i;
            return Math.max(-c(fVar5, (long) fVar5.f27789f), ((long) (-this.f27805c.f27835i.f27789f)) + j12);
        } else {
            p pVar4 = this.f27805c;
            j10 = ((long) pVar4.f27834h.f27789f) + pVar4.j();
            i11 = this.f27805c.f27835i.f27789f;
        }
        return j10 - ((long) i11);
    }
}
