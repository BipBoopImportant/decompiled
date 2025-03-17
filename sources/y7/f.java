package Y7;

public final class f {

    class a implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        private volatile T f41009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f41010b;

        a(b bVar) {
            this.f41010b = bVar;
        }

        public T get() {
            if (this.f41009a == null) {
                synchronized (this) {
                    try {
                        if (this.f41009a == null) {
                            this.f41009a = k.d(this.f41010b.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f41009a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
