package E1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00068FX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00068FX\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011\u0001\u0003\u0001\u00020\u0002\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LE1/h0;", "", "", "packedValue", "a", "(J)J", "", "operand", "f", "(JF)J", "", "g", "(J)Ljava/lang/String;", "", "e", "(J)I", "c", "(J)F", "getScaleX$annotations", "()V", "scaleX", "d", "getScaleY$annotations", "scaleY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5906a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f5907b = i0.a(Float.NaN, Float.NaN);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE1/h0$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static long a(long j10) {
        return j10;
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final float c(long j10) {
        if (!(j10 != f5907b)) {
            D1.a.b("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float d(long j10) {
        if (!(j10 != f5907b)) {
            D1.a.b("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static final long f(long j10, float f10) {
        return i0.a(c(j10) * f10, d(j10) * f10);
    }

    public static String g(long j10) {
        return "ScaleFactor(" + i0.c(c(j10)) + ", " + i0.c(d(j10)) + ')';
    }
}
