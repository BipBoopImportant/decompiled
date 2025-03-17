package q3;

public final class O extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final long f28063a;

    public O(Throwable th2, long j10) {
        super(th2);
        this.f28063a = j10;
    }

    public static O a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static O b(Exception exc, long j10) {
        return exc instanceof O ? (O) exc : new O(exc, j10);
    }
}
