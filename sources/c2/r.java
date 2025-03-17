package c2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b@\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00068FX\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u00068FX\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u000e\u0001\u0003\u0001\u00020\u0002\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lc2/r;", "", "", "packedValue", "c", "(J)J", "", "other", "d", "(JI)J", "", "j", "(J)Ljava/lang/String;", "i", "(J)I", "", "e", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "h", "getWidth$annotations", "width", "g", "getHeight$annotations", "height", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f23053b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f23054c = c(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f23055a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lc2/r$a;", "", "<init>", "()V", "Lc2/r;", "Zero", "J", "a", "()J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return r.f23054c;
        }

        private a() {
        }
    }

    private /* synthetic */ r(long j10) {
        this.f23055a = j10;
    }

    public static final /* synthetic */ r b(long j10) {
        return new r(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final long d(long j10, int i10) {
        return c((((long) (((int) (j10 >> 32)) / i10)) << 32) | (((long) (((int) (j10 & 4294967295L)) / i10)) & 4294967295L));
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof r) && j10 == ((r) obj).k();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final int g(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int h(long j10) {
        return (int) (j10 >> 32);
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        return h(j10) + " x " + g(j10);
    }

    public boolean equals(Object obj) {
        return e(this.f23055a, obj);
    }

    public int hashCode() {
        return i(this.f23055a);
    }

    public final /* synthetic */ long k() {
        return this.f23055a;
    }

    public String toString() {
        return j(this.f23055a);
    }
}
