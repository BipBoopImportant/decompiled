package G0;

import c2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012\u0001\u000b\u0001\u00020\n¨\u0006\u0015"}, d2 = {"LG0/a;", "", "", "density", "fontScale", "b", "(FF)J", "Lc2/d;", "d", "(Lc2/d;)J", "", "packedValue", "c", "(J)J", "", "h", "(J)Ljava/lang/String;", "f", "(J)F", "g", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0052a f6107a = new C0052a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f6108b = b(Float.NaN, Float.NaN);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"LG0/a$a;", "", "<init>", "()V", "LG0/a;", "Unspecified", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G0.a$a  reason: collision with other inner class name */
    public static final class C0052a {
        public /* synthetic */ C0052a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f6108b;
        }

        private C0052a() {
        }
    }

    public static long b(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return c((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    private static long c(long j10) {
        return j10;
    }

    public static long d(d dVar) {
        return b(dVar.getDensity(), dVar.D1());
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String h(long j10) {
        return "InlineDensity(density=" + f(j10) + ", fontScale=" + g(j10) + ')';
    }
}
