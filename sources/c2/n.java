package c2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b@\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0002ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068FX\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013\u0001\u0003\u0001\u00020\u0002\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lc2/n;", "", "", "packedValue", "c", "(J)J", "", "x", "y", "d", "(JII)J", "other", "k", "(JJ)J", "l", "", "m", "(J)Ljava/lang/String;", "j", "(J)I", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "h", "getX$annotations", "i", "getY$annotations", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f23044b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f23045c = c(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f23046a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lc2/n$a;", "", "<init>", "()V", "Lc2/n;", "Zero", "J", "a", "()J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return n.f23045c;
        }

        private a() {
        }
    }

    private /* synthetic */ n(long j10) {
        this.f23046a = j10;
    }

    public static final /* synthetic */ n b(long j10) {
        return new n(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static final long d(long j10, int i10, int i11) {
        return c((((long) i10) << 32) | (((long) i11) & 4294967295L));
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (4294967295L & j10);
        }
        return d(j10, i10, i11);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).n();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int h(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final long k(long j10, long j11) {
        return c((((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static final long l(long j10, long j11) {
        return c((((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static String m(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f23046a, obj);
    }

    public int hashCode() {
        return j(this.f23046a);
    }

    public final /* synthetic */ long n() {
        return this.f23046a;
    }

    public String toString() {
        return m(this.f23046a);
    }
}
