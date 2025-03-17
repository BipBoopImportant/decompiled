package Z7;

public abstract class c {

    private static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f41415a;

        b() {
            super();
        }

        public void b(boolean z10) {
            this.f41415a = z10;
        }

        public void c() {
            if (this.f41415a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}
