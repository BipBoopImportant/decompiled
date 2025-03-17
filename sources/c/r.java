package C;

public abstract class r {

    public static abstract class a {
        public static a a(int i10) {
            return b(i10, (Throwable) null);
        }

        public static a b(int i10, Throwable th2) {
            return new C4386c(i10, th2);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static r a(b bVar) {
        return b(bVar, (a) null);
    }

    public static r b(b bVar, a aVar) {
        return new C4384b(bVar, aVar);
    }

    public abstract a c();

    public abstract b d();
}
