package j0;

import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f\u0001\b\u0001\u00020\u0007¨\u0006\u001a"}, d2 = {"Lj0/l;", "", "", "first", "second", "b", "(II)J", "", "packedValue", "c", "(J)J", "", "h", "(J)Ljava/lang/String;", "g", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "e", "f", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: j0.l  reason: case insensitive filesystem */
public final class C5456l {

    /* renamed from: a  reason: collision with root package name */
    public final long f24629a;

    private /* synthetic */ C5456l(long j10) {
        this.f24629a = j10;
    }

    public static final /* synthetic */ C5456l a(long j10) {
        return new C5456l(j10);
    }

    public static long b(int i10, int i11) {
        return c((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof C5456l) && j10 == ((C5456l) obj).i();
    }

    public static final int e(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return '(' + e(j10) + ", " + f(j10) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f24629a, obj);
    }

    public int hashCode() {
        return g(this.f24629a);
    }

    public final /* synthetic */ long i() {
        return this.f24629a;
    }

    public String toString() {
        return h(this.f24629a);
    }
}
