package A1;

import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0001\u0003\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"LA1/A;", "", "", "value", "b", "(J)J", "", "f", "(J)Ljava/lang/String;", "", "e", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "a", "J", "getValue", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class A {

    /* renamed from: a  reason: collision with root package name */
    private final long f4305a;

    private /* synthetic */ A(long j10) {
        this.f4305a = j10;
    }

    public static final /* synthetic */ A a(long j10) {
        return new A(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof A) && j10 == ((A) obj).g();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f4305a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f4305a;
    }

    public int hashCode() {
        return e(this.f4305a);
    }

    public String toString() {
        return f(this.f4305a);
    }
}
