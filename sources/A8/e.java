package a8;

public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f41584c = new e((a) null, (b) null);

    /* renamed from: d  reason: collision with root package name */
    public static final e f41585d = new e(a.none, (b) null);

    /* renamed from: e  reason: collision with root package name */
    public static final e f41586e;

    /* renamed from: f  reason: collision with root package name */
    public static final e f41587f;

    /* renamed from: g  reason: collision with root package name */
    public static final e f41588g;

    /* renamed from: h  reason: collision with root package name */
    public static final e f41589h;

    /* renamed from: i  reason: collision with root package name */
    public static final e f41590i;

    /* renamed from: j  reason: collision with root package name */
    public static final e f41591j;

    /* renamed from: k  reason: collision with root package name */
    public static final e f41592k;

    /* renamed from: a  reason: collision with root package name */
    private a f41593a;

    /* renamed from: b  reason: collision with root package name */
    private b f41594b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f41586e = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f41587f = new e(aVar2, bVar);
        f41588g = new e(a.xMaxYMax, bVar);
        f41589h = new e(a.xMidYMin, bVar);
        f41590i = new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        f41591j = new e(aVar, bVar2);
        f41592k = new e(aVar2, bVar2);
    }

    e(a aVar, b bVar) {
        this.f41593a = aVar;
        this.f41594b = bVar;
    }

    public a a() {
        return this.f41593a;
    }

    public b b() {
        return this.f41594b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f41593a == eVar.f41593a && this.f41594b == eVar.f41594b;
    }

    public String toString() {
        return this.f41593a + " " + this.f41594b;
    }
}
