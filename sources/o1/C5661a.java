package o1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8FX\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\f8FX\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e\u0001\u0003\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lo1/a;", "", "", "packedValue", "b", "(J)J", "", "g", "(J)Ljava/lang/String;", "", "f", "(J)I", "", "d", "(J)F", "getX$annotations", "()V", "x", "e", "getY$annotations", "y", "a", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: o1.a  reason: case insensitive filesystem */
public final class C5661a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0427a f26695a = new C0427a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f26696b = C5662b.b(0.0f, 0.0f, 2, (Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lo1/a$a;", "", "<init>", "()V", "Lo1/a;", "Zero", "J", "a", "()J", "getZero-kKHJgLs$annotations", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o1.a$a  reason: collision with other inner class name */
    public static final class C0427a {
        public /* synthetic */ C0427a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C5661a.f26696b;
        }

        private C0427a() {
        }
    }

    public static long b(long j10) {
        return j10;
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        if (d(j10) == e(j10)) {
            return "CornerRadius.circular(" + C5663c.a(d(j10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + C5663c.a(d(j10), 1) + ", " + C5663c.a(e(j10), 1) + ')';
    }
}
