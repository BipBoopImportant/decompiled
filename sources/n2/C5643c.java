package n2;

import m2.C5573a;
import m2.e;
import m2.g;
import p2.C5756a;
import p2.j;

/* renamed from: n2.c  reason: case insensitive filesystem */
public class C5643c extends e {

    /* renamed from: q0  reason: collision with root package name */
    private g.c f26517q0;

    /* renamed from: r0  reason: collision with root package name */
    private int f26518r0;

    /* renamed from: s0  reason: collision with root package name */
    private C5756a f26519s0;

    /* renamed from: n2.c$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26520a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                m2.g$c[] r0 = m2.g.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26520a = r0
                m2.g$c r1 = m2.g.c.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26520a     // Catch:{ NoSuchFieldError -> 0x001d }
                m2.g$c r1 = m2.g.c.START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26520a     // Catch:{ NoSuchFieldError -> 0x0028 }
                m2.g$c r1 = m2.g.c.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26520a     // Catch:{ NoSuchFieldError -> 0x0033 }
                m2.g$c r1 = m2.g.c.END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26520a     // Catch:{ NoSuchFieldError -> 0x003e }
                m2.g$c r1 = m2.g.c.TOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26520a     // Catch:{ NoSuchFieldError -> 0x0049 }
                m2.g$c r1 = m2.g.c.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.C5643c.a.<clinit>():void");
        }
    }

    public C5643c(g gVar) {
        super(gVar, g.d.BARRIER);
    }

    public C5573a J(int i10) {
        this.f26518r0 = i10;
        return this;
    }

    public C5573a K(Object obj) {
        J(this.f26151m0.e(obj));
        return this;
    }

    public void apply() {
        u0();
        int i10 = a.f26520a[this.f26517q0.ordinal()];
        int i11 = 3;
        if (i10 == 3 || i10 == 4) {
            i11 = 1;
        } else if (i10 == 5) {
            i11 = 2;
        } else if (i10 != 6) {
            i11 = 0;
        }
        this.f26519s0.E1(i11);
        this.f26519s0.F1(this.f26518r0);
    }

    public j u0() {
        if (this.f26519s0 == null) {
            this.f26519s0 = new C5756a();
        }
        return this.f26519s0;
    }

    public void w0(g.c cVar) {
        this.f26517q0 = cVar;
    }
}
