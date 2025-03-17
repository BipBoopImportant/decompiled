package q1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8GX\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u000b\u0001\u0003\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lq1/b;", "", "", "packedValue", "d", "(J)J", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "f", "getComponentCount$annotations", "()V", "componentCount", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: q1.b  reason: case insensitive filesystem */
public final class C5775b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27655a = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f27656b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f27657c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f27658d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f27659e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lq1/b$a;", "", "<init>", "()V", "Lq1/b;", "Rgb", "J", "b", "()J", "Xyz", "c", "Lab", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: q1.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C5775b.f27658d;
        }

        public final long b() {
            return C5775b.f27656b;
        }

        public final long c() {
            return C5775b.f27657c;
        }

        private a() {
        }
    }

    static {
        long j10 = (long) 3;
        long j11 = j10 << 32;
        f27656b = d((((long) 0) & 4294967295L) | j11);
        f27657c = d((((long) 1) & 4294967295L) | j11);
        f27658d = d(j11 | (((long) 2) & 4294967295L));
        f27659e = d((j10 & 4294967295L) | (((long) 4) << 32));
    }

    public static long d(long j10) {
        return j10;
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return e(j10, f27656b) ? "Rgb" : e(j10, f27657c) ? "Xyz" : e(j10, f27658d) ? "Lab" : e(j10, f27659e) ? "Cmyk" : "Unknown";
    }
}
