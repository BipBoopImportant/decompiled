package p2;

import h2.C5414d;
import h2.C5419i;
import p2.d;
import p2.e;

public class h extends e {

    /* renamed from: L0  reason: collision with root package name */
    protected float f27566L0 = -1.0f;

    /* renamed from: M0  reason: collision with root package name */
    protected int f27567M0 = -1;

    /* renamed from: N0  reason: collision with root package name */
    protected int f27568N0 = -1;

    /* renamed from: O0  reason: collision with root package name */
    protected boolean f27569O0 = true;

    /* renamed from: P0  reason: collision with root package name */
    private d f27570P0 = this.f27429P;

    /* renamed from: Q0  reason: collision with root package name */
    private int f27571Q0;

    /* renamed from: R0  reason: collision with root package name */
    private int f27572R0;

    /* renamed from: S0  reason: collision with root package name */
    private boolean f27573S0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27574a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p2.d$a[] r0 = p2.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27574a = r0
                p2.d$a r1 = p2.d.a.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27574a     // Catch:{ NoSuchFieldError -> 0x001d }
                p2.d$a r1 = p2.d.a.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27574a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p2.d$a r1 = p2.d.a.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27574a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p2.d$a r1 = p2.d.a.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27574a     // Catch:{ NoSuchFieldError -> 0x003e }
                p2.d$a r1 = p2.d.a.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27574a     // Catch:{ NoSuchFieldError -> 0x0049 }
                p2.d$a r1 = p2.d.a.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27574a     // Catch:{ NoSuchFieldError -> 0x0054 }
                p2.d$a r1 = p2.d.a.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27574a     // Catch:{ NoSuchFieldError -> 0x0060 }
                p2.d$a r1 = p2.d.a.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f27574a     // Catch:{ NoSuchFieldError -> 0x006c }
                p2.d$a r1 = p2.d.a.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p2.h.a.<clinit>():void");
        }
    }

    public h() {
        this.f27571Q0 = 0;
        this.f27572R0 = 0;
        this.f27437X.clear();
        this.f27437X.add(this.f27570P0);
        int length = this.f27436W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f27436W[i10] = this.f27570P0;
        }
    }

    public void A1(int i10) {
        this.f27570P0.t(i10);
        this.f27573S0 = true;
    }

    public void B1(int i10) {
        if (i10 > -1) {
            this.f27566L0 = -1.0f;
            this.f27567M0 = i10;
            this.f27568N0 = -1;
        }
    }

    public void C1(int i10) {
        if (i10 > -1) {
            this.f27566L0 = -1.0f;
            this.f27567M0 = -1;
            this.f27568N0 = i10;
        }
    }

    public void D1(float f10) {
        if (f10 > -1.0f) {
            this.f27566L0 = f10;
            this.f27567M0 = -1;
            this.f27568N0 = -1;
        }
    }

    public void E1(int i10) {
        if (this.f27571Q0 != i10) {
            this.f27571Q0 = i10;
            this.f27437X.clear();
            if (this.f27571Q0 == 1) {
                this.f27570P0 = this.f27428O;
            } else {
                this.f27570P0 = this.f27429P;
            }
            this.f27437X.add(this.f27570P0);
            int length = this.f27436W.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f27436W[i11] = this.f27570P0;
            }
        }
    }

    public void g(C5414d dVar, boolean z10) {
        f fVar = (f) L();
        if (fVar != null) {
            d o10 = fVar.o(d.a.LEFT);
            d o11 = fVar.o(d.a.RIGHT);
            e eVar = this.f27441a0;
            boolean z11 = true;
            boolean z12 = eVar != null && eVar.f27439Z[0] == e.b.WRAP_CONTENT;
            if (this.f27571Q0 == 0) {
                o10 = fVar.o(d.a.TOP);
                o11 = fVar.o(d.a.BOTTOM);
                e eVar2 = this.f27441a0;
                if (eVar2 == null || eVar2.f27439Z[1] != e.b.WRAP_CONTENT) {
                    z11 = false;
                }
                z12 = z11;
            }
            if (this.f27573S0 && this.f27570P0.n()) {
                C5419i q10 = dVar.q(this.f27570P0);
                dVar.f(q10, this.f27570P0.e());
                if (this.f27567M0 != -1) {
                    if (z12) {
                        dVar.h(dVar.q(o11), q10, 0, 5);
                    }
                } else if (this.f27568N0 != -1 && z12) {
                    C5419i q11 = dVar.q(o11);
                    dVar.h(q10, dVar.q(o10), 0, 5);
                    dVar.h(q11, q10, 0, 5);
                }
                this.f27573S0 = false;
            } else if (this.f27567M0 != -1) {
                C5419i q12 = dVar.q(this.f27570P0);
                dVar.e(q12, dVar.q(o10), this.f27567M0, 8);
                if (z12) {
                    dVar.h(dVar.q(o11), q12, 0, 5);
                }
            } else if (this.f27568N0 != -1) {
                C5419i q13 = dVar.q(this.f27570P0);
                C5419i q14 = dVar.q(o11);
                dVar.e(q13, q14, -this.f27568N0, 8);
                if (z12) {
                    dVar.h(q13, dVar.q(o10), 0, 5);
                    dVar.h(q14, q13, 0, 5);
                }
            } else if (this.f27566L0 != -1.0f) {
                dVar.d(C5414d.s(dVar, dVar.q(this.f27570P0), dVar.q(o11), this.f27566L0));
            }
        }
    }

    public boolean h() {
        return true;
    }

    public d o(d.a aVar) {
        int i10 = a.f27574a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f27571Q0 == 1) {
                return this.f27570P0;
            }
            return null;
        } else if ((i10 == 3 || i10 == 4) && this.f27571Q0 == 0) {
            return this.f27570P0;
        } else {
            return null;
        }
    }

    public boolean p0() {
        return this.f27573S0;
    }

    public boolean q0() {
        return this.f27573S0;
    }

    public void u1(C5414d dVar, boolean z10) {
        if (L() != null) {
            int y10 = dVar.y(this.f27570P0);
            if (this.f27571Q0 == 1) {
                q1(y10);
                r1(0);
                P0(L().x());
                o1(0);
                return;
            }
            q1(0);
            r1(y10);
            o1(L().Y());
            P0(0);
        }
    }

    public d v1() {
        return this.f27570P0;
    }

    public int w1() {
        return this.f27571Q0;
    }

    public int x1() {
        return this.f27567M0;
    }

    public int y1() {
        return this.f27568N0;
    }

    public float z1() {
        return this.f27566L0;
    }
}
