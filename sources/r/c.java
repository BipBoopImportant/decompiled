package R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f12173a;

    /* renamed from: b  reason: collision with root package name */
    private final d f12174b;

    /* renamed from: c  reason: collision with root package name */
    private final b f12175c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12176d;

    c(a aVar, d dVar, b bVar, int i10) {
        this.f12173a = aVar;
        this.f12174b = dVar;
        this.f12175c = bVar;
        this.f12176d = i10;
    }

    public int a() {
        return this.f12176d;
    }

    public a b() {
        return this.f12173a;
    }

    public b c() {
        return this.f12175c;
    }

    public d d() {
        return this.f12174b;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private a f12177a = a.f12169c;

        /* renamed from: b  reason: collision with root package name */
        private d f12178b = null;

        /* renamed from: c  reason: collision with root package name */
        private b f12179c = null;

        /* renamed from: d  reason: collision with root package name */
        private int f12180d = 0;

        public a() {
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f12177a, this.f12178b, this.f12179c, this.f12180d);
        }

        public a c(int i10) {
            this.f12180d = i10;
            return this;
        }

        public a d(a aVar) {
            this.f12177a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f12179c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f12178b = dVar;
            return this;
        }

        private a(c cVar) {
            this.f12177a = cVar.b();
            this.f12178b = cVar.d();
            this.f12179c = cVar.c();
            this.f12180d = cVar.a();
        }
    }
}
