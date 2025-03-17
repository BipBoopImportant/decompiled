package m9;

public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static g a() {
        return new C8565b(a.FATAL_ERROR, -1);
    }

    public static g d() {
        return new C8565b(a.INVALID_PAYLOAD, -1);
    }

    public static g e(long j10) {
        return new C8565b(a.OK, j10);
    }

    public static g f() {
        return new C8565b(a.TRANSIENT_ERROR, -1);
    }

    public abstract long b();

    public abstract a c();
}
