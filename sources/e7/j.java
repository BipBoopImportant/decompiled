package E7;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f35107a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final j f35108b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final j f35109c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final j f35110d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final j f35111e = new e();

    class a extends j {
        a() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(C7.a aVar) {
            return aVar == C7.a.REMOTE;
        }

        public boolean d(boolean z10, C7.a aVar, C7.c cVar) {
            return (aVar == C7.a.RESOURCE_DISK_CACHE || aVar == C7.a.MEMORY_CACHE) ? false : true;
        }
    }

    class b extends j {
        b() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean c(C7.a aVar) {
            return false;
        }

        public boolean d(boolean z10, C7.a aVar, C7.c cVar) {
            return false;
        }
    }

    class c extends j {
        c() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return false;
        }

        public boolean c(C7.a aVar) {
            return (aVar == C7.a.DATA_DISK_CACHE || aVar == C7.a.MEMORY_CACHE) ? false : true;
        }

        public boolean d(boolean z10, C7.a aVar, C7.c cVar) {
            return false;
        }
    }

    class d extends j {
        d() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return true;
        }

        public boolean c(C7.a aVar) {
            return false;
        }

        public boolean d(boolean z10, C7.a aVar, C7.c cVar) {
            return (aVar == C7.a.RESOURCE_DISK_CACHE || aVar == C7.a.MEMORY_CACHE) ? false : true;
        }
    }

    class e extends j {
        e() {
        }

        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(C7.a aVar) {
            return aVar == C7.a.REMOTE;
        }

        public boolean d(boolean z10, C7.a aVar, C7.c cVar) {
            return ((z10 && aVar == C7.a.DATA_DISK_CACHE) || aVar == C7.a.LOCAL) && cVar == C7.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(C7.a aVar);

    public abstract boolean d(boolean z10, C7.a aVar, C7.c cVar);
}
