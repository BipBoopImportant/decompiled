package u0;

import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\u0001\u0003\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lu0/c;", "", "", "packedValue", "b", "(J)J", "", "f", "(J)Ljava/lang/String;", "", "e", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "a", "J", "d", "currentLineSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: u0.c  reason: case insensitive filesystem */
public final class C5979c {

    /* renamed from: a  reason: collision with root package name */
    private final long f29645a;

    private /* synthetic */ C5979c(long j10) {
        this.f29645a = j10;
    }

    public static final /* synthetic */ C5979c a(long j10) {
        return new C5979c(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof C5979c) && j10 == ((C5979c) obj).g();
    }

    public static final int d(long j10) {
        return (int) j10;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f29645a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f29645a;
    }

    public int hashCode() {
        return e(this.f29645a);
    }

    public String toString() {
        return f(this.f29645a);
    }
}
