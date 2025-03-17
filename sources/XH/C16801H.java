package XH;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@C17604b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0001\u0003\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"LXH/H;", "", "", "data", "b", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "v", "(J)Ljava/lang/String;", "a", "J", "getData$annotations", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.H  reason: case insensitive filesystem */
public final class C16801H implements Comparable<C16801H> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f139781b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f139782a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LXH/H$a;", "", "<init>", "()V", "LXH/H;", "MIN_VALUE", "J", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XH.H$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C16801H(long j10) {
        this.f139782a = j10;
    }

    public static final /* synthetic */ C16801H a(long j10) {
        return new C16801H(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean j(long j10, Object obj) {
        return (obj instanceof C16801H) && j10 == ((C16801H) obj).B();
    }

    public static final boolean m(long j10, long j11) {
        return j10 == j11;
    }

    public static int n(long j10) {
        return Long.hashCode(j10);
    }

    public static String v(long j10) {
        return C16809P.d(j10, 10);
    }

    public final /* synthetic */ long B() {
        return this.f139782a;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C16809P.b(B(), ((C16801H) obj).B());
    }

    public boolean equals(Object obj) {
        return j(this.f139782a, obj);
    }

    public int hashCode() {
        return n(this.f139782a);
    }

    public String toString() {
        return v(this.f139782a);
    }
}
